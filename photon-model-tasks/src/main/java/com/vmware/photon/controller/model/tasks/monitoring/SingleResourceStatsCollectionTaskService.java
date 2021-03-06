/*
 * Copyright (c) 2015-2016 VMware, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, without warranties or
 * conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.vmware.photon.controller.model.tasks.monitoring;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map.Entry;

import com.vmware.photon.controller.model.UriPaths;
import com.vmware.photon.controller.model.adapterapi.ComputeStatsRequest;
import com.vmware.photon.controller.model.adapterapi.ComputeStatsResponse.ComputeStats;
import com.vmware.photon.controller.model.monitoring.ResourceMetricService;
import com.vmware.photon.controller.model.resources.ComputeDescriptionService.ComputeDescription;
import com.vmware.photon.controller.model.resources.ComputeService.ComputeStateWithDescription;
import com.vmware.photon.controller.model.tasks.TaskUtils;
import com.vmware.photon.controller.model.tasks.monitoring.SingleResourceStatsCollectionTaskService.SingleResourceStatsCollectionTaskState;
import com.vmware.xenon.common.Operation;
import com.vmware.xenon.common.OperationJoin;
import com.vmware.xenon.common.ServiceDocumentDescription.PropertyUsageOption;
import com.vmware.xenon.common.ServiceStats;
import com.vmware.xenon.common.ServiceStats.ServiceStat;
import com.vmware.xenon.common.ServiceStats.TimeSeriesStats;
import com.vmware.xenon.common.ServiceStats.TimeSeriesStats.AggregationType;
import com.vmware.xenon.common.TaskState;
import com.vmware.xenon.common.TaskState.TaskStage;
import com.vmware.xenon.common.UriUtils;
import com.vmware.xenon.common.Utils;
import com.vmware.xenon.services.common.TaskService;

/**
 * Task service to kick off stats collection at a resource level.
 * The stats adapter associated with this resource can return stats
 * data for a set of resources
 *
 */
public class SingleResourceStatsCollectionTaskService
        extends TaskService<SingleResourceStatsCollectionTaskState> {

    public static final String FACTORY_LINK = UriPaths.MONITORING
            + "/stats-collection-resource-tasks";

    public enum SingleResourceTaskCollectionStage {
        GET_DESCRIPTIONS, UPDATE_STATS
    }

    public static class SingleResourceStatsCollectionTaskState
            extends TaskService.TaskServiceState {
        /**
         * compute resource link
         */
        public String computeLink;

        /**
         * Task state
         */
        public SingleResourceTaskCollectionStage taskStage;

        /**
         * Body to patch back upon task completion
         */
        public Object parentPatchBody;

        /**
         * Task to patch back to
         */
        public String parentLink;

        /**
         * List of stats; this is maintained as part of the
         * state as the adapter patches this back and we
         * want the patch handler to deserialize it generically.
         * Given that the task is non persistent, the cost
         * is minimal
         */
        @UsageOption(option = PropertyUsageOption.SERVICE_USE)
        public List<ComputeStats> statsList;

        @Documentation(description = "The stats adapter reference")
        public URI statsAdapterReference;
    }

    public SingleResourceStatsCollectionTaskService() {
        super(SingleResourceStatsCollectionTaskState.class);
    }

    @Override
    public void handleStart(Operation start) {
        try {
            if (!start.hasBody()) {
                start.fail(new IllegalArgumentException("body is required"));
                return;
            }
            SingleResourceStatsCollectionTaskState state = start
                    .getBody(SingleResourceStatsCollectionTaskState.class);

            validateState(state);
            start.complete();
            state.taskInfo = TaskUtils.createTaskState(TaskStage.STARTED);
            state.taskStage = SingleResourceTaskCollectionStage.GET_DESCRIPTIONS;
            TaskUtils.sendPatch(this, state);
        } catch (Throwable e) {
            start.fail(e);
        }
    }

    @Override
    public void handlePatch(Operation patch) {
        SingleResourceStatsCollectionTaskState currentState = getState(patch);
        SingleResourceStatsCollectionTaskState patchState = patch
                .getBody(SingleResourceStatsCollectionTaskState.class);
        updateState(currentState, patchState);
        patch.setBody(currentState);
        patch.complete();

        switch (currentState.taskInfo.stage) {
        case CREATED:
            break;
        case STARTED:
            handleStagePatch(patch, currentState);
            break;
        case FINISHED:
        case FAILED:
        case CANCELLED:
            // this is a one shot task, self delete
            sendRequest(Operation
                    .createPatch(UriUtils.buildUri(getHost(), currentState.parentLink))
                    .setBody(currentState.parentPatchBody)
                    .setCompletion(
                            (patchOp, patchEx) -> {
                                if (patchEx != null) {
                                    logWarning("Patching parent task failed %s",
                                            Utils.toString(patchEx));
                                }
                                sendRequest(Operation
                                        .createDelete(getUri()));
                            }));
            break;
        default:
            break;
        }
    }

    private void validateState(SingleResourceStatsCollectionTaskState state) {
        if (state.computeLink == null) {
            throw new IllegalStateException("computeReference should not be null");
        }
        if (state.parentLink == null) {
            throw new IllegalStateException("parentLink should not be null");
        }
        if (state.parentPatchBody == null) {
            throw new IllegalStateException("parentPatchBody should not be null");
        }
    }

    @Override
    public void updateState(SingleResourceStatsCollectionTaskState currentState,
            SingleResourceStatsCollectionTaskState patchState) {
        if (patchState.taskInfo != null) {
            currentState.taskInfo = patchState.taskInfo;
        }
        if (patchState.taskStage != null) {
            currentState.taskStage = patchState.taskStage;
        }
        if (patchState.statsList != null) {
            currentState.statsList = patchState.statsList;
        }
    }

    private void handleStagePatch(Operation op,
            SingleResourceStatsCollectionTaskState currentState) {
        switch (currentState.taskStage) {
        case GET_DESCRIPTIONS:
            getDescriptions(op, currentState);
            break;
        case UPDATE_STATS:
            updateAndPersistStats(op, currentState);
            break;
        default:
            break;
        }
    }

    private void getDescriptions(Operation op,
            SingleResourceStatsCollectionTaskState currentState) {
        URI computeDescUri = UriUtils.buildExpandLinksQueryUri(UriUtils.buildUri(getHost(),
                currentState.computeLink));
        sendRequest(Operation
                .createGet(computeDescUri)
                .setCompletion(
                        (getOp, getEx) -> {
                            if (getEx != null) {
                                TaskUtils.sendFailurePatch(this, currentState, getEx);
                                return;
                            }

                            ComputeStateWithDescription computeStateWithDesc = getOp
                                    .getBody(ComputeStateWithDescription.class);
                            ComputeStatsRequest statsRequest = new ComputeStatsRequest();
                            URI patchUri = null;
                            Object patchBody = null;

                            ComputeDescription description = computeStateWithDesc.description;
                            URI statsAdapterReference = null;

                            if (description != null) {

                                // Only look in adapter references if statsAdapterReference is provided
                                if (currentState.statsAdapterReference == null) {
                                    statsAdapterReference = description.statsAdapterReference;
                                } else if (description.statsAdapterReferences != null) {
                                    for (URI uri : description.statsAdapterReferences) {
                                        if (uri.equals(currentState.statsAdapterReference)) {
                                            statsAdapterReference = uri;
                                            break;
                                        }
                                    }
                                }
                            }

                            if (statsAdapterReference != null) {
                                statsRequest.nextStage = SingleResourceTaskCollectionStage.UPDATE_STATS;
                                statsRequest.resourceReference = UriUtils
                                        .buildUri(getHost(), computeStateWithDesc.documentSelfLink);
                                statsRequest.taskReference = getUri();
                                patchUri = statsAdapterReference;
                                patchBody = statsRequest;
                            } else {
                                // no adapter associated with this resource, just patch completion
                                SingleResourceStatsCollectionTaskState nextStageState = new SingleResourceStatsCollectionTaskState();
                                nextStageState.taskInfo = new TaskState();
                                nextStageState.taskInfo.stage = TaskStage.FINISHED;
                                patchUri = getUri();
                                patchBody = nextStageState;
                            }
                            sendRequest(Operation.createPatch(patchUri)
                                    .setBody(patchBody)
                                    .setCompletion((patchOp, patchEx) -> {
                                        if (patchEx != null) {
                                            TaskUtils.sendFailurePatch(this, currentState, patchEx);
                                        }
                                    }));
                        }));
    }

    private void updateAndPersistStats(Operation op,
            SingleResourceStatsCollectionTaskState currentState) {
        Collection<Operation> operations = new ArrayList<>();
        for (ComputeStats stats : currentState.statsList) {
            URI statsUri = UriUtils.buildStatsUri(getHost(), stats.computeLink);
            URI persistStatsUri = UriUtils.buildUri(getHost(), ResourceMetricService.FACTORY_LINK);
            // TODO: https://jira-hzn.eng.vmware.com/browse/VSYM-330
            for (Entry<String, List<ServiceStat>> entries : stats.statValues.entrySet()) {
                for (ServiceStat entry : entries.getValue()) {
                    ServiceStats.ServiceStat minuteStats = new ServiceStats.ServiceStat();
                    minuteStats.name = new StringBuilder(entries.getKey())
                            .append(StatsConstants.MIN_SUFFIX).toString();
                    minuteStats.latestValue = entry.latestValue;
                    minuteStats.sourceTimeMicrosUtc = entry.sourceTimeMicrosUtc;
                    minuteStats.unit = entry.unit;
                    minuteStats.timeSeriesStats = new TimeSeriesStats(
                            StatsConstants.NUM_BUCKETS_MINUTE_DATA,
                            StatsConstants.BUCKET_SIZE_MINUTES_IN_MILLIS,
                            EnumSet.allOf(AggregationType.class));

                    ServiceStats.ServiceStat hourStats = new ServiceStats.ServiceStat();
                    hourStats.name = new StringBuilder(entries.getKey())
                            .append(StatsConstants.HOUR_SUFFIX).toString();
                    hourStats.latestValue = entry.latestValue;
                    hourStats.sourceTimeMicrosUtc = entry.sourceTimeMicrosUtc;
                    hourStats.unit = entry.unit;
                    hourStats.timeSeriesStats = new TimeSeriesStats(
                            StatsConstants.NUM_BUCKETS_HOURLY_DATA,
                            StatsConstants.BUCKET_SIZE_HOURS_IN_MILLIS,
                            EnumSet.allOf(AggregationType.class));
                    operations.add(Operation.createPost(statsUri)
                            .setBody(hourStats));
                    operations.add(Operation.createPost(statsUri)
                            .setBody(minuteStats));

                    ServiceStats.ServiceStat dailyStats = new ServiceStats.ServiceStat();
                    dailyStats.name = new StringBuilder(entries.getKey())
                            .append(StatsConstants.DAILY_SUFFIX).toString();
                    dailyStats.latestValue = entry.latestValue;
                    dailyStats.sourceTimeMicrosUtc = entry.sourceTimeMicrosUtc;
                    dailyStats.unit = entry.unit;
                    dailyStats.timeSeriesStats = new TimeSeriesStats(
                            StatsConstants.NUM_BUCKETS_DAILY_DATA,
                            StatsConstants.BUCKET_SIZE_DAYS_IN_MILLIS,
                            EnumSet.allOf(AggregationType.class));
                    operations.add(Operation.createPost(statsUri)
                            .setBody(dailyStats));
                    operations.add(Operation.createPost(statsUri)
                            .setBody(minuteStats));

                    // Persist every datapoint
                    persistStat(persistStatsUri, entries.getKey(), entry, currentState.computeLink);
                }
            }
        }
        // If there are no stats reported, just finish the task.
        if (operations.size() == 0) {
            SingleResourceStatsCollectionTaskState nextStatePatch = new SingleResourceStatsCollectionTaskState();
            nextStatePatch.taskInfo = TaskUtils.createTaskState(TaskStage.FINISHED);
            TaskUtils.sendPatch(this, nextStatePatch);
            return;
        }
        OperationJoin operationJoin = OperationJoin
                .create(operations)
                .setCompletion(
                        (ops, exc) -> {
                            if (exc != null) {
                                TaskUtils.sendFailurePatch(this,
                                        new SingleResourceStatsCollectionTaskState(), exc.values());
                                return;
                            }
                            SingleResourceStatsCollectionTaskState nextStatePatch = new SingleResourceStatsCollectionTaskState();
                            nextStatePatch.taskInfo = TaskUtils.createTaskState(TaskStage.FINISHED);
                            TaskUtils.sendPatch(this, nextStatePatch);
                        });
        operationJoin.sendWith(this);
    }

    private void persistStat(URI persistStatsUri, String metricName, ServiceStat serviceStat,
            String computeLink) {
        ResourceMetricService.ResourceMetric stat = new ResourceMetricService.ResourceMetric();
        // TODO: https://jira-hzn.eng.vmware.com/browse/VSYM-1391
        // Set the documentSelfLink to <computeId>-<metricName>
        stat.documentSelfLink = UriUtils.getLastPathSegment(computeLink) + "-" + metricName;
        stat.value = serviceStat.latestValue;
        stat.timestampMicrosUtc = serviceStat.sourceTimeMicrosUtc;
        sendRequest(Operation.createPost(persistStatsUri).setBodyNoCloning(stat));
    }
}

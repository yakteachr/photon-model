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

package com.vmware.photon.controller.model.adapters.awsadapter;

import java.util.List;
import java.util.Map;

import com.amazonaws.services.ec2.AmazonEC2AsyncClient;

import com.vmware.photon.controller.model.adapterapi.ComputeInstanceRequest;
import com.vmware.photon.controller.model.resources.ComputeService.ComputeStateWithDescription;
import com.vmware.photon.controller.model.resources.DiskService.DiskState;
import com.vmware.photon.controller.model.resources.DiskService.DiskType;
import com.vmware.photon.controller.model.resources.FirewallService.FirewallState;
import com.vmware.photon.controller.model.resources.NetworkInterfaceService.NetworkInterfaceState;
import com.vmware.xenon.common.Operation;
import com.vmware.xenon.services.common.AuthCredentialsService;

/**
 * AWS allocation.
 */
public class AWSAllocation {

    public AWSStages stage;

    transient Operation awsOperation;
    public ComputeInstanceRequest computeRequest;
    public ComputeStateWithDescription child;
    public ComputeStateWithDescription parent;
    public AmazonEC2AsyncClient amazonEC2Client;
    public AuthCredentialsService.AuthCredentialsServiceState parentAuth;
    public Map<DiskType, DiskState> childDisks;
    public List<String> securityGroupIds;
    public String subnetId;
    public Throwable error;
    public long taskExpirationMicros;

    public Map<String, FirewallState> childFirewalls;

    public List<NetworkInterfaceState> networkInterfaces;

    /**
     * Initialize with request info and first stage.
     */
    public AWSAllocation(ComputeInstanceRequest computeReq) {
        this.computeRequest = computeReq;
        this.stage = AWSStages.VMDESC;
    }
}

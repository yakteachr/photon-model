/*
 * Copyright (c) 2016 VMware, Inc. All Rights Reserved.
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

package com.vmware.photon.controller.model.adapterapi;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import com.vmware.photon.controller.model.resources.ComputeService;

/**
 * Request to the boot service, to configure the boot state of the host and
 * initiate boot.
 */
public class ComputeBootRequest {
    /**
     * URI reference to compute.
     */
    public URI computeReference;

    /**
     * URI reference to provisioning task.
     */
    public URI provisioningTaskReference;

    /**
     * Boot device order.
     */
    public List<ComputeService.BootDevice> bootDeviceOrder = new ArrayList<>();

    /**
     * Value indicating whether the service should treat this as a mock request
     * and complete the work flow without involving the underlying compute host
     * infrastructure.
     */
    public boolean isMockRequest;
}

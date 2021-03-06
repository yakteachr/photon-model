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

package com.vmware.photon.controller.model.adapterapi;

/**
 * Request to create a compute host. The host reference provides detailed
 * information on the host type and required services to complete the request.
 */
public class ComputeInstanceRequest extends ResourceRequest {

    /**
     * Instance request type.
     */
    public enum InstanceRequestType {
        CREATE, DELETE, VALIDATE_CREDENTIALS, DELETE_DOCUMENTS_ONLY
    }

    /**
     * Request type.
     */
    public InstanceRequestType requestType;

    /**
     * Auth credentials. Used for validation of a host.
     */
    public String authCredentialsLink;

    /**
     * Region Id.
     */
    public String regionId;
}

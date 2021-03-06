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

package com.vmware.photon.controller.model.adapters.vsphere;

import com.vmware.photon.controller.model.UriPaths;

/**
 * URI definitions for vSphere adapters.
 */
public class VSphereUriPaths {

    public static final String PROVISIONING = UriPaths.PROVISIONING + "/vsphere";

    public static final String INSTANCE_SERVICE = PROVISIONING + "/instance-adapter";
    public static final String OVF_IMPORTER = PROVISIONING + "/ovf-importer";

    public static final String BOOT_SERVICE = PROVISIONING + "/boot-adapter";
    public static final String POWER_SERVICE = PROVISIONING + "/power-adapter";
    public static final String SNAPSHOT_SERVICE = PROVISIONING + "/snapshot-adapter";
    public static final String HEALTH_SERVICE = PROVISIONING + "/health-adapter";
    public static final String ENUMERATION_SERVICE = PROVISIONING + "/enumeration-adapter";
    public static final String STATS_SERVICE = PROVISIONING + "/stats-adapter";
    public static final String ENDPOINT_CONFIG_ADAPTER = PROVISIONING + "/endpoint-config-adapter";
}

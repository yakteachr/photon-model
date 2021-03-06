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

package com.vmware.photon.controller.model.adapters.awsadapter.util;

import static com.vmware.photon.controller.model.adapters.awsadapter.AWSConstants.AwsClientType;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds instances of the client manager to be shared by all the AWS adapters to avoid the
 * creation of caches on a per adapter level. Holds two instances of the client manager
 * mapping to the EC2 client Cache and the CloudWatch client cache.
 */
public class AWSClientManagerFactory {

    private static Map<AwsClientType, AwsClientManagerEntry> clientManagersByType = new HashMap<>();

    private static class AwsClientManagerEntry {
        private AWSClientManager clientManager;
        private int clientReferenceCount = 0;
    }

    /**
     * Returns a reference to the client manager instance managing the specified type of client if it exists. Creates a new one
     * if it does not exist.
     */
    public static synchronized AWSClientManager getClientManager(AwsClientType awsClientType) {
        AwsClientManagerEntry clientManagerEntry = clientManagersByType.get(awsClientType);
        if (clientManagerEntry == null) {
            clientManagerEntry = new AwsClientManagerEntry();
            clientManagerEntry.clientManager = new AWSClientManager(awsClientType);
            clientManagersByType.put(awsClientType, clientManagerEntry);
        }
        clientManagerEntry.clientReferenceCount++;
        return clientManagerEntry.clientManager;
    }

    /**
     * Decrements the reference count for the EC2 client manager. If the reference count goes down to zero, then
     * the shared cache is cleared out.
     */
    public static synchronized void returnClientManager(AWSClientManager clientManager,
            AwsClientType awsClientType) {
        AwsClientManagerEntry clientManagerHolder = clientManagersByType.get(awsClientType);
        if (clientManagerHolder != null) {
            if (clientManager != clientManagerHolder.clientManager) {
                throw new IllegalArgumentException("Incorrect client manager reference passed to the method.");
            }
            clientManagerHolder.clientReferenceCount--;
            if (clientManagerHolder.clientReferenceCount == 0) {
                // cleanup code on the client manager once they are not referenced by any of the adapters.
                clientManagerHolder.clientManager.cleanUp();
            }
        }
    }

    public static int getClientReferenceCount(AwsClientType awsClientType) {
        AwsClientManagerEntry clientManagerEntry = clientManagersByType.get(awsClientType);
        return clientManagerEntry == null ? 0 : clientManagerEntry.clientReferenceCount;
    }
}

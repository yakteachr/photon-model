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

package com.vmware.photon.controller.model.resources;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

import com.vmware.xenon.common.ServiceDocumentDescription;

public class ResourceUtilsTest {

    @Test
    public void testMergeWithStateGroupAndTenants() {
        ResourceState current = new ResourceState();
        current.tenantLinks = new ArrayList<>(Arrays.asList("tenant1"));
        current.groupLinks = new HashSet<>(Arrays.asList("groupA"));

        ResourceState patch = new ResourceState();
        patch.tenantLinks = new ArrayList<>(Arrays.asList("tenant2"));
        patch.groupLinks = new HashSet<>(Arrays.asList("groupB"));

        ServiceDocumentDescription desc = ServiceDocumentDescription.Builder.create()
                .buildDescription(ResourceState.class);
        boolean changed = ResourceUtils.mergeWithState(desc, current, patch);

        assertTrue(changed);
        assertEquals(Arrays.asList("tenant1", "tenant2"), current.tenantLinks);
        assertEquals(new HashSet<>(Arrays.asList("groupA", "groupB")), current.groupLinks);
    }

    @Test
    public void testMergeWithStateSameGroupsAndTenants() {
        ResourceState current = new ResourceState();
        current.tenantLinks = new ArrayList<>(Arrays.asList("tenant1", "tenant2"));
        current.groupLinks = new HashSet<>(Arrays.asList("groupA", "groupB"));
        ResourceState patch = new ResourceState();
        patch.tenantLinks = new ArrayList<>(Arrays.asList("tenant1", "tenant2"));
        patch.groupLinks = new HashSet<>(Arrays.asList("groupA", "groupB"));

        ServiceDocumentDescription desc = ServiceDocumentDescription.Builder.create()
                .buildDescription(ResourceState.class);
        boolean changed = ResourceUtils.mergeWithState(desc, current, patch);

        assertFalse(changed);
        assertEquals(current.tenantLinks, patch.tenantLinks);
        assertEquals(current.groupLinks, patch.groupLinks);
    }

    @Test
    public void testRemoveMultipleCollections() throws NoSuchFieldException, IllegalAccessException {
        ResourceState current = new ResourceState();
        current.tenantLinks = new ArrayList<>(Arrays.asList("tenant1", "tenant2", "tenant3"));
        current.groupLinks = new HashSet<>(Arrays.asList("groupA", "groupB"));

        ResourceUtils.CollectionRemovalRequest removalRequest = new ResourceUtils.CollectionRemovalRequest();
        removalRequest.kind = ResourceUtils.CollectionRemovalRequest.KIND;
        removalRequest.collectionsMap = new HashMap<>();
        // remove tenantLinks: tenant1, tenant3.
        Collection<Object> tenantLinksToBeRemoved = new ArrayList<>(Arrays.asList(
                "tenant1", "tenant3"));
        removalRequest.collectionsMap.put("tenantLinks", tenantLinksToBeRemoved);
        // remove groupLinks: groupA.
        Collection<Object> groupLinksToBeRemoved = new ArrayList<>(Arrays.asList("groupA"));
        removalRequest.collectionsMap.put("groupLinks", groupLinksToBeRemoved);

        boolean changed = ResourceUtils.removeCollections(current, removalRequest);

        List<String> expectedTenantLinks =  new ArrayList<>(Arrays.asList("tenant2"));
        HashSet<String> expectedGroupLinks = new HashSet<>(Arrays.asList("groupB"));

        assertTrue(changed);
        assertEquals(current.tenantLinks, expectedTenantLinks);
        assertEquals(current.groupLinks, expectedGroupLinks);
    }
}

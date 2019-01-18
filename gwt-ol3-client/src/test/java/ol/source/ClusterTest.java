/*******************************************************************************
 * Copyright 2014, 2018 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol.source;

import ol.GwtOLBaseTestCase;

/**
 * A test case for {@link ol.source.Cluster}.
 *
 * @author Tino Desjardins
 */
public class ClusterTest extends GwtOLBaseTestCase {

    public void testCluster() {

        injectUrlAndTest(() -> {

            ClusterOptions clusterOptions = new ClusterOptions();
            assertNotNull(clusterOptions);

            clusterOptions.setDistance(10);
            assertEquals(10, clusterOptions.getDistance());

            Vector vectorSource = new Vector();
            clusterOptions.setSource(vectorSource);

            Cluster cluster = new Cluster(clusterOptions);
            assertNotNull(cluster);

        });

    }

}

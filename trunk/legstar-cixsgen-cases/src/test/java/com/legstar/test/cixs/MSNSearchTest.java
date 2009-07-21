/*******************************************************************************
 * Copyright (c) 2009 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.test.cixs;

import com.legstar.coxb.host.HostData;
import com.legstar.coxb.transform.HostTransformException;
import com.legstar.test.coxb.MSNSearchCases;
import com.legstar.test.coxb.MSNSearch.SearchResponse;
import com.legstar.test.coxb.MSNSearch.bind.SearchResponseHostToJavaTransformer;

/**
 * Test the generated MSNSearch proxy.
 *
 */
public class MSNSearchTest extends AbstractProxyHttpClientTester {

    /**
     * Create the test case.
     */
    public MSNSearchTest() {
        super("MSNSearch", HostData.toByteArray(MSNSearchCases.getHostBytesHexRequest()));
    }

    /** {@inheritDoc} */
    public void check(final byte[] replyBytes) {
        try {
            SearchResponseHostToJavaTransformer transformer = new SearchResponseHostToJavaTransformer();
            SearchResponse searchResponse = transformer.transform(replyBytes);
            MSNSearchCases.checkJavaObjectResponse(searchResponse);
        } catch (HostTransformException e) {
            fail(e.getMessage());
        }
    }
}
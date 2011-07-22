/*******************************************************************************
 * Copyright (c) 2010 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.test.coxb;

import com.legstar.coxb.host.HostData;
import com.legstar.test.coxb.redinout.bind.DfhcommareaJavaToHostTransformer;
import com.legstar.test.coxb.redinout.Dfhcommarea;

import junit.framework.TestCase;

/**
 * Marshal redinout.
 *
 */
public class MarshalRedinoutTest extends TestCase {

    /** The annotated XSD file name. */
    private static final String SCHEMA_NAME = "redinout";

    /**
     * Marshal java data object and test host data result.
     * @throws Exception if marshaling fails
     */
    public void testRedinout() throws Exception {
        // Create and populate an instance of an object (JAXB annotated)
        Dfhcommarea dfhcommarea = RedinoutCases.getJavaObject();
        assertEquals(RedinoutCases.getHostBytesHex(),
                Util.marshal(SCHEMA_NAME, dfhcommarea, 17));
    }

    /**
     * Transform java data object and test host data result.
     * @throws Exception if transforming fails
     */
    public void testJavaToHostTransformer() throws Exception {

        DfhcommareaJavaToHostTransformer transformer = new DfhcommareaJavaToHostTransformer();
        assertEquals(RedinoutCases.getHostBytesHex(),
                HostData.toHexString(transformer.transform(RedinoutCases.getJavaObject())));
    }
}

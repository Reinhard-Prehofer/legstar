/*******************************************************************************
 *  LegStar legacy Web-enablement .
 *  Copyright (C) 2007 LegSem
 *  
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *  
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *   
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 *  02110-1301  USA
 *  
 *******************************************************************************/
package com.legstar.test.coxb;



import com.legstar.coxb.host.HostData;
import com.legstar.test.coxb.redsimpt.Dfhcommarea;
import com.legstar.test.coxb.redsimpt.bind.DfhcommareaHostToJavaTransformer;

import junit.framework.TestCase;

/**
 * Unmarshal redsimpt.
 *
 */
public class UnmarshalRedsimptTest extends TestCase {

    /**
     * Unmarshal host data and test java data object result.
     * @throws Exception if marshaling fails
     */
    public void testRedsimpt() throws Exception {

        String hexString = RedsimptCases.getHostBytesHex();
        byte[] hostBytes = HostData.toByteArray(hexString);
        Dfhcommarea dfhcommarea = (Dfhcommarea) Util.unmarshal(hostBytes, "redsimpt");
        RedsimptCases.checkJavaObject(dfhcommarea);
    }

    /**
     * Transform host data and test java data object result.
     * @throws Exception if transforming fails
     */
    public void testHostToJavaTransformer() throws Exception {

        DfhcommareaHostToJavaTransformer transformer = new DfhcommareaHostToJavaTransformer();
        Dfhcommarea dfhcommarea = transformer.transform(HostData.toByteArray(RedsimptCases.getHostBytesHex()));
        RedsimptCases.checkJavaObject(dfhcommarea);
    }
    /**
     * Unmarshal host data and test java data object result.
     * Alternative choice.
     * @throws Exception if marshaling fails
     */
    public void testRedsimptSecondChoice() throws Exception {

        String hexString = RedsimptCases.getHostBytesHexSecondChoice();
        byte[] hostBytes = HostData.toByteArray(hexString);
        Dfhcommarea dfhcommarea = (Dfhcommarea) Util.unmarshal(hostBytes, "redsimpt");
        RedsimptCases.checkJavaObjectSecondChoice(dfhcommarea);
    }
    /**
     * Transform host data and test java data object result.
     * @throws Exception if transforming fails
     */
    public void testHostToJavaTransformerSecondChoice() throws Exception {

        DfhcommareaHostToJavaTransformer transformer = new DfhcommareaHostToJavaTransformer();
        Dfhcommarea dfhcommarea = transformer.transform(
                HostData.toByteArray(RedsimptCases.getHostBytesHexSecondChoice()));
        RedsimptCases.checkJavaObjectSecondChoice(dfhcommarea);
    }
}
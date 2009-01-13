/*******************************************************************************
 * Copyright (c) 2008 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.coxb.convert.simple.perf.test;

import java.math.BigDecimal;

import com.legstar.coxb.convert.simple.CobolBinarySimpleConverter;
import com.legstar.coxb.host.HostData;
import com.legstar.coxb.host.HostException;

import junit.framework.TestCase;

public class BinaryToHostTest extends TestCase {
	
	private static int ITERATIONS = 100;
	public void testToHost() throws HostException {
    	BigDecimal javaDecimal = new BigDecimal("+456790.00675");
		// Create a host buffer
		byte[] hostBytes = new byte[8];
		for (int i = 0; i < ITERATIONS; i++) {
			assertEquals(8, CobolBinarySimpleConverter.toHostSingle(javaDecimal, 8, false, hostBytes, 0));
			assertEquals("0000000aa2ae3c63", HostData.toHexString(hostBytes));
		}
	}

}
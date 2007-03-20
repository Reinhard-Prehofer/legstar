/*******************************************************************************
 * LegStar legacy Web-enablement .
 * Copyright (C)  2007 LegSem
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301  USA
 * 
 *     
 *****************************************************************************/
package com.legstar.coxb.gen.test;


import com.legstar.coxb.CobolContext;
import com.legstar.coxb.CobolMarshalVisitor;
import com.legstar.coxb.convert.simple.CobolSimpleConverters;
import com.legstar.host.HostData;
import com.legstar.host.HostException;

import junit.framework.TestCase;

public class MarshalFixarsimTest extends TestCase {

	public void testFixarsim() throws HostException {

		// Create a cobol context 
		CobolContext cobolContext = new CobolContext();
		// Select a conversion strategy 
		CobolSimpleConverters cc = new CobolSimpleConverters(cobolContext);
		// Create a concrete visitor
		byte[] hostBytes = new byte[15];
		CobolMarshalVisitor mv = new CobolMarshalVisitor(hostBytes, 0, cc);

		// Create an instance of the JAXB object factory
		com.legstar.test.coxb.fixarsim.ObjectFactory objectFactory = new com.legstar.test.coxb.fixarsim.ObjectFactory();
		// Create and populate an instance of an object (JAXB annotated)
		com.legstar.test.coxb.fixarsim.DfhcommareaType dfhcommareaType = objectFactory.createDfhcommareaType();
		dfhcommareaType.getCArray().add("PREMI");
		dfhcommareaType.getCArray().add("DEUXI");
		dfhcommareaType.getCArray().add("TROIS");

		// Traverse the object structure, visiting each node with the visitor
		com.legstar.test.coxb.fixarsim.bind.DfhcommareaTypeBinding ccem = new com.legstar.test.coxb.fixarsim.bind.DfhcommareaTypeBinding(objectFactory, dfhcommareaType);
		ccem.accept(mv);
		//		      <---------------------------->
		//		      1 2 3 4 5 6 7 8 9 101112131415
		//		      P R E M I D E U X I T R O I S             
		assertEquals("d7d9c5d4c9c4c5e4e7c9e3d9d6c9e2",HostData.toHexString(hostBytes));
	}
}

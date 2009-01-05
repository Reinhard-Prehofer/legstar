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
import com.legstar.test.coxb.binnatsi.LsUnsignedNativeType;
import com.legstar.test.coxb.binnatsi.LsDoublewordsType;
import com.legstar.test.coxb.binnatsi.LsFullwordsType;
import com.legstar.test.coxb.binnatsi.LsHalfwordsType;

import junit.framework.TestCase;

public class MarshalBinnatsiTest extends TestCase {

	public void testBinnatsi() throws HostException {

		// Create a cobol context 
		CobolContext cobolContext = new CobolContext();
		// Select a conversion strategy 
		CobolSimpleConverters cc = new CobolSimpleConverters(cobolContext);
		// Create a concrete visitor
		byte[] hostBytes = new byte[56];
		CobolMarshalVisitor mv = new CobolMarshalVisitor(hostBytes, 0, cc);

		// Create an instance of the JAXB object factory
		com.legstar.test.coxb.binnatsi.ObjectFactory objectFactory = new com.legstar.test.coxb.binnatsi.ObjectFactory();
		// Create and populate an instance of an object (JAXB annotated)
		com.legstar.test.coxb.binnatsi.DfhcommareaType dfhcommareaType = objectFactory.createDfhcommareaType();
		
		LsUnsignedNativeType lsUnsignedNativeType = objectFactory.createLsUnsignedNativeType(); 
		
		LsHalfwordsType lsHalfwordsType = objectFactory.createLsHalfwordsType();
		lsHalfwordsType.setLsPs9X4High(new Short("1045"));
		lsHalfwordsType.setLsPs9X4Low(new Short("-128"));
		lsHalfwordsType.setLsPs9X4Max(new Short("32767"));
		lsHalfwordsType.setLsPs9X4Min(new Short("-32768"));
		
		LsFullwordsType lsFullwordsType = objectFactory.createLsFullwordsType();
		lsFullwordsType.setLsPs9X9High(123456789);
		lsFullwordsType.setLsPs9X9Low(-128);
		lsFullwordsType.setLsPs9X9Max(2147483647);
		lsFullwordsType.setLsPs9X9Min(-2147483648);
		
		LsDoublewordsType lsDoublewordsType = objectFactory.createLsDoublewordsType();
		lsDoublewordsType.setLsPs9X18High(17179869183l);
		lsDoublewordsType.setLsPs9X18Low(-4294967294l);
		lsDoublewordsType.setLsPs9X18Max(9223372036854775807l);
		lsDoublewordsType.setLsPs9X18Min(-9223372036854775808l);
		
		lsUnsignedNativeType.setLsHalfwords(lsHalfwordsType);
		lsUnsignedNativeType.setLsFullwords(lsFullwordsType);
		lsUnsignedNativeType.setLsDoublewords(lsDoublewordsType);
		
		dfhcommareaType.setLsUnsignedNative(lsUnsignedNativeType);
		

		// Traverse the object structure, visiting each node with the visitor
		com.legstar.test.coxb.binnatsi.bind.DfhcommareaTypeBinding ccem = new com.legstar.test.coxb.binnatsi.bind.DfhcommareaTypeBinding(objectFactory, dfhcommareaType);
		ccem.accept(mv);
		assertEquals("8000ff8004157fff80000000ffffff80075bcd157fffffff8000000000000000ffffffff0000000200000003ffffffff7fffffffffffffff",HostData.toHexString(hostBytes));
	}
}
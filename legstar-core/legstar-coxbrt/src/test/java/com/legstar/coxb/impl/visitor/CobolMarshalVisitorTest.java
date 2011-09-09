/*******************************************************************************
 * Copyright (c) 2011 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.coxb.impl.visitor;

import java.math.BigDecimal;

import junit.framework.TestCase;

import com.legstar.coxb.convert.simple.CobolSimpleConverters;
import com.legstar.coxb.host.HostData;
import com.legstar.coxb.impl.reflect.CComplexReflectBinding;
import com.legstar.test.coxb.coxb137.BoolPojo;
import com.legstar.test.coxb.pojo156.jaxb.SomeClass;
import com.legstar.test.coxb.pojo156.jaxb.SomeItem;

/**
 * There are several marshaling tests elsewhere in this project. Here we focus
 * on special cases.
 * 
 */
public class CobolMarshalVisitorTest extends TestCase {

    /**
     * Tests related to http://code.google.com/p/legstar/issues/detail?id=137.
     * 
     * @throws Exception if unmarshaling fails
     */
    public void testBooleanField() throws Exception {
        BoolPojo boolPojo = new BoolPojo();
        CComplexReflectBinding ccem = new CComplexReflectBinding(
                new com.legstar.test.coxb.coxb137.ObjectFactory(), boolPojo);

        byte[] hostBytes = new byte[6];
        boolPojo.setABoolean(true);
        CobolMarshalVisitor mv = new CobolMarshalVisitor(hostBytes, 0,
                new CobolSimpleConverters());
        ccem.accept(mv);
        assertEquals("000000000001", HostData.toHexString(hostBytes));

        hostBytes = new byte[8];
        boolPojo.setABoolean(true);
        boolPojo.getBooleanList().add(false);
        mv = new CobolMarshalVisitor(hostBytes, 0, new CobolSimpleConverters());
        ccem.accept(mv);
        assertEquals("0000000100000001", HostData.toHexString(hostBytes));

    }

    /**
     * Tests that an implicit dynamic counter is marshaled correctly.
     * 
     * @throws Exception if test fails
     */
    public void testDynCountersPojo() throws Exception {
        SomeClass someClass = new SomeClass();
        for (int i = 0; i < 2; i++) {
            SomeItem item = new SomeItem();
            item.setAmount(new BigDecimal(125.23 * i));
            item.setLabel("item" + i);
            item.setNumber(i);
            someClass.getItems().add(item);
        }

        CComplexReflectBinding ccem = new CComplexReflectBinding(
                new com.legstar.test.coxb.pojo156.jaxb.ObjectFactory(),
                someClass);
        byte[] hostBytes = new byte[86];
        CobolMarshalVisitor mv = new CobolMarshalVisitor(hostBytes, 0,
                new CobolSimpleConverters());
        ccem.accept(mv);
        assertEquals(86, mv.getOffset());
        assertEquals(
                "00000002"
                        + "000000000c89a38594f040404040404040404040404040404040404040404040404040404000000000"
                        + "000012523c89a38594f140404040404040404040404040404040404040404040404040404000000001",
                HostData.toHexString(hostBytes));
    }

    /**
     * Tests that an explicit dynamic counter is marshaled correctly.
     * 
     * @throws Exception if test fails
     */
    public void testDynCountersCobol() throws Exception {
        com.legstar.test.coxb.cob156.A parent = new com.legstar.test.coxb.cob156.A();
        // Don't set the explicit B counter, it should be automatically valued
        com.legstar.test.coxb.cob156.C child = new com.legstar.test.coxb.cob156.C();
        for (int i = 0; i < 3; i++) {
            child.getD().add(Integer.toString(i));
        }
        parent.setC(child);

        CComplexReflectBinding ccem = new CComplexReflectBinding(
                new com.legstar.test.coxb.cob156.ObjectFactory(), parent);
        byte[] hostBytes = new byte[6];
        CobolMarshalVisitor mv = new CobolMarshalVisitor(hostBytes, 0,
                new CobolSimpleConverters());
        ccem.accept(mv);
        assertEquals(6, mv.getOffset());
        assertEquals("f0f0f3f0f1f2", HostData.toHexString(hostBytes));

    }
}

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
package com.legstar.cobc.gen;

import junit.framework.TestCase;

import com.legstar.coxb.impl.CArrayStringBinding;
import com.legstar.coxb.impl.CDbcsBinding;
import com.legstar.coxb.impl.CStringBinding;
import com.legstar.coxb.impl.CZonedDecimalBinding;

/**
 * The COBOL formatter produces COBOL sentences.
 * 
 */
public class CobolGenFormatterTest extends TestCase {

    /** Need to be platform independent. */
    private static final String CRLF = System.getProperty("line.separator");

    /**
     * Test elementary string.
     */
    public void testElementaryStringItem() {
        CStringBinding cb = new CStringBinding("astring", null, null, null,
                null);
        cb.setLevelNumber(5);
        cb.setCobolName("A-STRING");
        cb.setUsage("DISPLAY");
        cb.setPicture("X(8)");
        cb.setIsJustifiedRight(true);
        cb.setDefaultValue("\"BIG\"");

        /* ...........0000000001111111111222222222233333333334444444444555 */
        /* ...........1234567890123456789012345678901234567890123456789012 */
        assertEquals("           05 A-STRING PIC X(8) JUST VALUE \"BIG\".",
                CobolGenFormatter.formatCobolClause(cb, 1));
    }

    /**
     * Test elementary dbcs string.
     */
    public void testElementaryDbcsStringItem() {
        CDbcsBinding cb = new CDbcsBinding("astring", null, null, null, null);
        cb.setLevelNumber(5);
        cb.setCobolName("A-STRING");
        cb.setUsage("DISPLAY-1");
        cb.setPicture("G(8)");

        /* ...........0000000001111111111222222222233333333334444444444555 */
        /* ...........1234567890123456789012345678901234567890123456789012 */
        assertEquals("           05 A-STRING PIC G(8) DISPLAY-1.",
                CobolGenFormatter.formatCobolClause(cb, 1));
    }

    /**
     * Test elementary zoned decimal.
     */
    public void testElementaryZonedDecimalItem() {
        CZonedDecimalBinding cb = new CZonedDecimalBinding("astring", null,
                null, null, null);
        cb.setLevelNumber(10);
        cb.setCobolName("A-ZONED-DEC");
        cb.setUsage("DISPLAY");
        cb.setPicture("S9(8)V99");
        cb.setIsSignLeading(true);
        cb.setIsSignSeparate(true);

        /* ......00000000011111111112222222222333333333344444444445555555 */
        /* ......12345678901234567890123456789012345678901234567890123456 */
        assertEquals(
                "           10 A-ZONED-DEC PIC S9(8)V99 LEADING SEPARATE.",
                CobolGenFormatter.formatCobolClause(cb, 1));
    }

    /**
     * Test an array of strings (fixed size).
     */
    public void testFixedArrayElementaryStringItem() {
        CArrayStringBinding cb = new CArrayStringBinding("astringArray", null,
                null, null, null);
        cb.setLevelNumber(5);
        cb.setCobolName("A-STRING-ARRAY");
        cb.setUsage("DISPLAY");
        cb.setPicture("X(8)");
        cb.setMinOccurs(3);
        cb.setMaxOccurs(3);

        /* ...........0000000001111111111222222222233333333334444444444555 */
        /* ...........1234567890123456789012345678901234567890123456789012 */
        assertEquals("           05 A-STRING-ARRAY PIC X(8) OCCURS 3.",
                CobolGenFormatter.formatCobolClause(cb, 1));
    }

    /**
     * Test an array of strings (variable size). Split on 2 lines.
     */
    public void testVariableArrayElementaryStringItem() {
        CArrayStringBinding cb = new CArrayStringBinding("astringArray", null,
                null, null, null);
        cb.setLevelNumber(5);
        cb.setCobolName("A-STRING-ARRAY");
        cb.setUsage("DISPLAY");
        cb.setPicture("X(8)");
        cb.setMinOccurs(0);
        cb.setMaxOccurs(3);
        cb.setDependingOn("ODO-COUNTER");

        assertEquals(
        /* 0000000111111111122222222223333333333444444444455555555556666666666777 */
        /* 3456789012345678901234567890123456789012345678901234567890123456789012 */
        "           05 A-STRING-ARRAY PIC X(8) OCCURS 0 TO 3 DEPENDING ON"
                + CRLF + "               ODO-COUNTER.",
                CobolGenFormatter.formatCobolClause(cb, 1));
    }

    /**
     * Test a redefined item.
     */
    public void testRedefinesItem() {
        CStringBinding cb = new CStringBinding("astring", null, null, null,
                null);
        cb.setLevelNumber(5);
        cb.setCobolName("A-STRING");
        cb.setUsage("DISPLAY");
        cb.setPicture("X(8)");
        cb.setRedefines("A-REDEFINED-STRING");

        /* ......0000000001111111111222222222233333333334444444444555555555566 */
        /* ......1234567890123456789012345678901234567890123456789012345678901 */
        assertEquals(
                "           05 A-STRING PIC X(8) REDEFINES A-REDEFINED-STRING.",
                CobolGenFormatter.formatCobolClause(cb, 1));
    }

}

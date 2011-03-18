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

/**
 * Test the CobolGenSentence class.
 *
 */
public class CobolGenSentenceTest extends TestCase {

    /**
     * Single line cases.
     */
    public void testSingleLine() {
        CobolGenSentence s = new CobolGenSentence(0);
        assertEquals(7, s.getStartColumn());
        assertEquals(7, s.getEndColumn());
        assertEquals(1, s.getLinesCount());
        /*            1234567*/
        assertEquals("       ", s.toString());

        s.addClause("01");
        assertEquals(7, s.getStartColumn());
        assertEquals(9, s.getEndColumn());
        assertEquals(1, s.getLinesCount());
        /*            123456789*/
        assertEquals("       01", s.toString());

        s.addClause("VAR");
        assertEquals(7, s.getStartColumn());
        assertEquals(13, s.getEndColumn());
        assertEquals(1, s.getLinesCount());
        /*            1234567890123*/
        assertEquals("       01 VAR", s.toString());
    }

    /**
     * 2 lines cases.
     */
    public void test2Lines() {
        CobolGenSentence s = new CobolGenSentence(0);
        s.addClause("01");
        s.addClause("A-VERY-LONG-VARIABLE-NAME");
        s.addClause("PICTURE 9999999999V99");
        s.addClause("USAGE   DISPLAY");
        assertEquals(7, s.getStartColumn());
        assertEquals(71, s.getEndColumn());
        assertEquals(1, s.getLinesCount());
        /*            000000000111111111122222222223333333333444444444455555555556666666666777*/
        /*            123456789012345678901234567890123456789012345678901234567890123456789012*/
        assertEquals("       01 A-VERY-LONG-VARIABLE-NAME PICTURE 9999999999V99 USAGE DISPLAY", s.toString());

        s.addClause("VALUE");
        s.addClause("\"23435.78\"");
        assertEquals(7, s.getStartColumn());
        assertEquals(27, s.getEndColumn());
        assertEquals(2, s.getLinesCount());
        assertEquals(
                /*            000000000111111111122222222223333333333444444444455555555556666666666777*/
                /*            123456789012345678901234567890123456789012345678901234567890123456789012*/
                             "       01 A-VERY-LONG-VARIABLE-NAME PICTURE 9999999999V99 USAGE DISPLAY"
                /*            000000000111111111122222222223333333333444444444455555555556666666666777*/
                /*            123456789012345678901234567890123456789012345678901234567890123456789012*/
                      +  "\r\n           VALUE \"23435.78\"", s.toString());
    }

    /**
     * Test closing a sentence.
     */
    public void testClose() {
        CobolGenSentence s = new CobolGenSentence(0);
        s.addClause("01");
        s.addClause("VAR");
        s.close();
        assertEquals(7, s.getStartColumn());
        assertEquals(14, s.getEndColumn());
        assertEquals(1, s.getLinesCount());
        /*            12345678901234*/
        assertEquals("       01 VAR.", s.toString());
    }

    /**
     * Test a long value that splits over several lines.
     */
    public void testLongValue() {
        CobolGenSentence s = new CobolGenSentence(0);
        s.addValue("'12345678901234567890123456789012345678901234567890123456789012345678901234567890'");
        s.close();
        assertEquals(7, s.getStartColumn());
        assertEquals(30, s.getEndColumn());
        assertEquals(2, s.getLinesCount());
        assertEquals(
                /*            000000000111111111122222222223333333333444444444455555555556666666666777*/
                /*            123456789012345678901234567890123456789012345678901234567890123456789012*/
                             "       '1234567890123456789012345678901234567890123456789012345678901234"
                /*            000000000111111111122222222223333333333444444444455555555556666666666777*/
                /*            123456789012345678901234567890123456789012345678901234567890123456789012*/
                +        "\r\n      -    '5678901234567890'.", s.toString());
    }
}

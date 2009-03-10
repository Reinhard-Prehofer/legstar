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
package com.legstar.coxb.transform;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.host.HostContext;
import com.legstar.coxb.impl.reflect.CComplexReflectBinding;
import com.legstar.coxb.impl.reflect.ReflectBindingException;

import junit.framework.TestCase;

/**
 * Test AbstractTransformer.
 */
public class AbstractTransformerTest extends TestCase {

    /**
     * Test constructors.
     */
    public void testConstructors() {
        HostToJavaLsfileaeTransformer hostToJavaTransformer = new HostToJavaLsfileaeTransformer();
        assertEquals(HostContext.getDefaultHostCharsetName(), hostToJavaTransformer.getCobolContext().getHostCharsetName());
        hostToJavaTransformer = new HostToJavaLsfileaeTransformer("IBM01147");
        assertEquals("IBM01147", hostToJavaTransformer.getCobolContext().getHostCharsetName());
        CobolContext cobolContext = new CobolContext();
        cobolContext.setHostCharsetName("IBM01147");
        hostToJavaTransformer = new HostToJavaLsfileaeTransformer(cobolContext);
        assertEquals("IBM01147", hostToJavaTransformer.getCobolContext().getHostCharsetName());
    }
    /**
     * An implementation of the abstract class under test.
     *
     */
    public final class HostToJavaLsfileaeTransformer extends AbstractTransformer {

        
        public HostToJavaLsfileaeTransformer() {
            super();
        }
        
        public HostToJavaLsfileaeTransformer(CobolContext cobolContext) {
            super(cobolContext);
        }

        public HostToJavaLsfileaeTransformer(final String hostCharset) {
            super(hostCharset);
        }
        
        @Override
        public ICobolComplexBinding getBinding() throws CobolBindingException {
            try {
                CComplexReflectBinding ccem = new CComplexReflectBinding(
                        new com.legstar.test.coxb.lsfileae.ObjectFactory(),
                        com.legstar.test.coxb.lsfileae.Dfhcommarea.class);
                return ccem;
            } catch (ReflectBindingException e) {
                throw new CobolBindingException(e);
            }
        }
        
    }
}
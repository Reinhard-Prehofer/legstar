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

package com.legstar.test.coxb.charsets.bind;

import com.legstar.host.HostException;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.rt.CComplexBinding;

import com.legstar.coxb.rt.COctetStreamBinding;
import com.legstar.coxb.rt.CStringBinding;
import com.legstar.coxb.rt.CNationalBinding;

import com.legstar.test.coxb.charsets.DfhcommareaType;
import com.legstar.test.coxb.charsets.ObjectFactory;

/**
 * This class was generated by COXB version 1.0.
 * 2007-01-26T18:17:26.531+01:00
 * This class implements a bi-directional binding between a cobol structure and
 * a java object. Visitors can use this class to visit each element of the
 * structure in turn. No reflection or annotations are used which makes this
 * class suitable for heavy loads.
 */

public class DfhcommareaTypeBinding 
             extends CComplexBinding
             implements ICobolBinding {
  
    /** Name of java property to which this cobol element is bound. */
    private static final String JAVA_NAME = "DfhcommareaType";
  
    /** Type of java property to which this cobol element is bound. */
    private static final String JAVA_TYPE = "DfhcommareaType";
    
    /** Child property CStringBinding of simple type. */
    public CStringBinding comLocal;
            
    /** Child property COctetStreamBinding of simple type. */
    public COctetStreamBinding comDbcs;
            
    /** Child property CNationalBinding of simple type. */
    public CNationalBinding comNational;
            
    /** Java object to which this cobol complex array element is bound. */
    private DfhcommareaType mJaxbObject;
  
    /** Java object factory for objects creation. */
    private ObjectFactory mObjectFactory;
  
    /**
     * No argument constructor.
     */
    public DfhcommareaTypeBinding() {
        this(null, null, null);
    }
  
    /**
     * Constructor for a child complex binding which be later bound to a JAXB
     * object.
     * @param parentObject the parent binding
     */
    public DfhcommareaTypeBinding(
        final CComplexBinding parentObject) {
        this(parentObject, null, null);
    }
  
    /**
     * Constructor for a root complex binding without an initial bound object.
     * @param objectFactory the java factory to use to create children instances
     */
    public DfhcommareaTypeBinding(
        final ObjectFactory objectFactory) {
        this(null, objectFactory, null);
    }

    /**
     * Constructor for a root complex binding from an existing java object.
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public DfhcommareaTypeBinding(
        final ObjectFactory objectFactory,
        final DfhcommareaType jaxbObject) {
        this(null, objectFactory, jaxbObject);
    }

    /**
     * Constructor for a child complex binding with immediate binding to a JAXB
     * object.
     * @param parentObject the parent binding
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public DfhcommareaTypeBinding(
        final CComplexBinding parentObject,
        final ObjectFactory objectFactory,
        final DfhcommareaType jaxbObject) {
        
        super(JAVA_NAME, JAVA_TYPE, parentObject);
        mJaxbObject = jaxbObject;
        mObjectFactory = objectFactory;
        initChildren();
    }
  
    /** Creates a binding property for each child. */
    public final void initChildren() {
    
        /* Create binding children instances */
        comLocal = new CStringBinding("comLocal", 32, false);
        comLocal.setCobolName("COM-LOCAL");
        comDbcs = new COctetStreamBinding("comDbcs", 64);
        comDbcs.setCobolName("COM-DBCS");
        comNational = new CNationalBinding("comNational", 64, false);
        comNational.setCobolName("COM-NATIONAL");
        
        /* Add children to children list */
           
        getChildrenList().add(comLocal);
        getChildrenList().add(comDbcs);
        getChildrenList().add(comNational);
    }
  
   
    /** {@inheritDoc} */
    public final void createBoundObject() throws HostException {
        setJaxbObject(mObjectFactory.createDfhcommareaType());
    }
       
    /** {@inheritDoc} */
    public final void prepareChildren() throws HostException {
    
    }
  
   
    /** {@inheritDoc} */
    public final void getValuesFromBoundObject() throws HostException {
        /* Set this binding properties from java object property values */
                     
        if (mJaxbObject.getComLocal() != null) {
            /* Set value from comLocal*/
            comLocal.setValue(mJaxbObject.getComLocal());
        }
                
        if (mJaxbObject.getComDbcs() != null) {
            /* Set value from comDbcs*/
            comDbcs.setValue(mJaxbObject.getComDbcs());
        }
                
        if (mJaxbObject.getComNational() != null) {
            /* Set value from comNational*/
            comNational.setValue(mJaxbObject.getComNational());
        }
    
    }
       
    /** {@inheritDoc} */
    public final void setBoundObjectValue(final int index) throws HostException {
        /* Set the JAXB object property value from binding object */
        switch (index) {
        case 0:
            setBoundObjectValueComLocal();
            break;
        case 1:
            setBoundObjectValueComDbcs();
            break;
        case 2:
            setBoundObjectValueComNational();
            break;
        }
    }
            
    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueComLocal() throws HostException {
    
        if (comLocal.getValue() != null) {
            /* Set value of comLocal*/
            mJaxbObject.setComLocal(comLocal.getValue());
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueComDbcs() throws HostException {
    
        if (comDbcs.getValue() != null) {
            /* Set value of comDbcs*/
            mJaxbObject.setComDbcs(comDbcs.getValue());
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueComNational() throws HostException {
    
        if (comNational.getValue() != null) {
            /* Set value of comNational*/
            mJaxbObject.setComNational(comNational.getValue());
        }
        
    }

    /** {@inheritDoc} */
    public final Object getValue() throws HostException {
        return mJaxbObject;
    }

    /**
     * @return the java object to which this cobol complex element is bound
     */
    public final DfhcommareaType getJaxbObject() {
        return mJaxbObject;
    }

    /**
     * @param jaxbObject the java object to which this cobol complex element
     * is bound
     */
    public final void setJaxbObject(
        final DfhcommareaType jaxbObject) {
        mJaxbObject = jaxbObject;
    }

    /**
     * @return the java object factory for objects creation
     */
    public final ObjectFactory getObjectFactory() {
        return mObjectFactory;
    }

    /**
     * @param objectFactory the java object factory for objects creation to set
     */
    public final void setObjectFactory(final ObjectFactory objectFactory) {
        mObjectFactory = objectFactory;
    }

}

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

package com.legstar.test.lsfileae.bind;

import com.legstar.host.HostException;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.rt.CComplexBinding;

import com.legstar.coxb.rt.CStringBinding;
import com.legstar.coxb.rt.CZonedDecimalBinding;
import java.math.BigDecimal;

import com.legstar.test.lsfileae.DfhcommareaType;
import com.legstar.test.lsfileae.ObjectFactory;

/**
 * This class was generated by COXB version 1.0.
 * 2007-03-09T09:09:56.332+01:00
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
    
    /** Child property CZonedDecimalBinding of simple type. */
    public CZonedDecimalBinding comNumber;
            
    /** Child property ComPersonalTypeBinding of complex type. */
    public ComPersonalTypeBinding comPersonal;
            
    /** Child property CStringBinding of simple type. */
    public CStringBinding comDate;
            
    /** Child property CStringBinding of simple type. */
    public CStringBinding comAmount;
            
    /** Child property CStringBinding of simple type. */
    public CStringBinding comComment;
            
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
        comNumber = new CZonedDecimalBinding("comNumber", 6, 6, 0, false, false, false);
        comNumber.setCobolName("COM-NUMBER");
        comPersonal = new ComPersonalTypeBinding(this);
        comDate = new CStringBinding("comDate", 8, false);
        comDate.setCobolName("COM-DATE");
        comAmount = new CStringBinding("comAmount", 8, false);
        comAmount.setCobolName("COM-AMOUNT");
        comComment = new CStringBinding("comComment", 9, false);
        comComment.setCobolName("COM-COMMENT");
        
        /* Add children to children list */
           
        getChildrenList().add(comNumber);
        getChildrenList().add(comPersonal);
        getChildrenList().add(comDate);
        getChildrenList().add(comAmount);
        getChildrenList().add(comComment);
    }
  
   
    /** {@inheritDoc} */
    public final void createBoundObject() throws HostException {
        setJaxbObject(mObjectFactory.createDfhcommareaType());
    }
       
    /** {@inheritDoc} */
    public final void prepareChildren() throws HostException {
    
        /* Pass on the JAXB factory to child comPersonal  */
        comPersonal.setObjectFactory(mObjectFactory);

    }
  
   
    /** {@inheritDoc} */
    public final void getValuesFromBoundObject() throws HostException {
        /* Set this binding properties from java object property values */
                     
        if (mJaxbObject.getComNumber() != 0L) {
            /* Set value from comNumber*/
            comNumber.setValue(new BigDecimal(mJaxbObject.getComNumber()));
        
        }
                
        if (mJaxbObject.getComPersonal() != null) {
            /* Set value from comPersonal*/
            comPersonal.setJaxbObject(mJaxbObject.getComPersonal());
            
        } else {
            comPersonal.setJaxbObject(mObjectFactory.createComPersonalType());
        }
                            
        if (mJaxbObject.getComDate() != null) {
            /* Set value from comDate*/
            comDate.setValue(mJaxbObject.getComDate());
        }
                
        if (mJaxbObject.getComAmount() != null) {
            /* Set value from comAmount*/
            comAmount.setValue(mJaxbObject.getComAmount());
        }
                
        if (mJaxbObject.getComComment() != null) {
            /* Set value from comComment*/
            comComment.setValue(mJaxbObject.getComComment());
        }
    
    }
       
    /** {@inheritDoc} */
    public final void setBoundObjectValue(final int index) throws HostException {
        /* Set the JAXB object property value from binding object */
        switch (index) {
        case 0:
            setBoundObjectValueComNumber();
            break;
        case 1:
            setBoundObjectValueComPersonal();
            break;
        case 2:
            setBoundObjectValueComDate();
            break;
        case 3:
            setBoundObjectValueComAmount();
            break;
        case 4:
            setBoundObjectValueComComment();
            break;
        }
    }
            
    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueComNumber() throws HostException {
    
        if (comNumber.getValue() != null) {
            
            /* Set value of comNumber*/
            mJaxbObject.setComNumber(comNumber.getValue().longValueExact());
                
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueComPersonal() throws HostException {
    
        /* Set value of complex child comPersonal*/
        mJaxbObject.setComPersonal(comPersonal.getJaxbObject());
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueComDate() throws HostException {
    
        if (comDate.getValue() != null) {
            /* Set value of comDate*/
            mJaxbObject.setComDate(comDate.getValue());
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueComAmount() throws HostException {
    
        if (comAmount.getValue() != null) {
            /* Set value of comAmount*/
            mJaxbObject.setComAmount(comAmount.getValue());
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueComComment() throws HostException {
    
        if (comComment.getValue() != null) {
            /* Set value of comComment*/
            mJaxbObject.setComComment(comComment.getValue());
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
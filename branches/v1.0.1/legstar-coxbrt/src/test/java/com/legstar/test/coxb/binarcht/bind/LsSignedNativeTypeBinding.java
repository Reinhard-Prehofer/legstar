
package com.legstar.test.coxb.binarcht.bind;

import com.legstar.host.HostException;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.rt.CComplexBinding;

import com.legstar.coxb.rt.CBinaryBinding;
import java.math.BigDecimal;

import com.legstar.test.coxb.binarcht.LsSignedNativeType;
import com.legstar.test.coxb.binarcht.ObjectFactory;

/**
 * This class was generated by COXB version 1.0.
 * 2007-04-23T17:01:07.734+02:00
 * This class implements a bi-directional binding between a cobol structure and
 * a java object. Visitors can use this class to visit each element of the
 * structure in turn. No reflection or annotations are used which makes this
 * class suitable for heavy loads.
 */

public class LsSignedNativeTypeBinding 
             extends CComplexBinding
             implements ICobolBinding {
  
    /** Name of java property to which this cobol element is bound. */
    private static final String JAVA_NAME = "lsSignedNative";
  
    /** Type of java property to which this cobol element is bound. */
    private static final String JAVA_TYPE = "LsSignedNativeType";
    
    /** Child property CBinaryBinding of simple type. */
    public CBinaryBinding lsPs9X4Min;
            
    /** Child property CBinaryBinding of simple type. */
    public CBinaryBinding lsPs9X4Max;
            
    /** Child property CBinaryBinding of simple type. */
    public CBinaryBinding lsPs9X9Min;
            
    /** Child property CBinaryBinding of simple type. */
    public CBinaryBinding lsPs9X9Max;
            
    /** Child property CBinaryBinding of simple type. */
    public CBinaryBinding lsPs9X18Min;
            
    /** Child property CBinaryBinding of simple type. */
    public CBinaryBinding lsPs9X18Max;
            
    /** Java object to which this cobol complex array element is bound. */
    private LsSignedNativeType mJaxbObject;
  
    /** Java object factory for objects creation. */
    private ObjectFactory mObjectFactory;
  
    /**
     * No argument constructor.
     */
    public LsSignedNativeTypeBinding() {
        this(null, null, null);
    }
  
    /**
     * Constructor for a child complex binding which be later bound to a JAXB
     * object.
     * @param parentObject the parent binding
     */
    public LsSignedNativeTypeBinding(
        final CComplexBinding parentObject) {
        this(parentObject, null, null);
    }
  
    /**
     * Constructor for a root complex binding without an initial bound object.
     * @param objectFactory the java factory to use to create children instances
     */
    public LsSignedNativeTypeBinding(
        final ObjectFactory objectFactory) {
        this(null, objectFactory, null);
    }

    /**
     * Constructor for a root complex binding from an existing java object.
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public LsSignedNativeTypeBinding(
        final ObjectFactory objectFactory,
        final LsSignedNativeType jaxbObject) {
        this(null, objectFactory, jaxbObject);
    }

    /**
     * Constructor for a child complex binding with immediate binding to a JAXB
     * object.
     * @param parentObject the parent binding
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public LsSignedNativeTypeBinding(
        final CComplexBinding parentObject,
        final ObjectFactory objectFactory,
        final LsSignedNativeType jaxbObject) {
        
        super(JAVA_NAME, JAVA_TYPE, parentObject);
        mJaxbObject = jaxbObject;
        mObjectFactory = objectFactory;
        initChildren();
    }
  
    /** Creates a binding property for each child. */
    public final void initChildren() {
    
        /* Create binding children instances */
        lsPs9X4Min = new CBinaryBinding("lsPs9X4Min", 2, 4, 0, true);
        lsPs9X4Min.setCobolName("LS-PS9X4-MIN");
        lsPs9X4Max = new CBinaryBinding("lsPs9X4Max", 2, 4, 0, true);
        lsPs9X4Max.setCobolName("LS-PS9X4-MAX");
        lsPs9X9Min = new CBinaryBinding("lsPs9X9Min", 4, 9, 0, true);
        lsPs9X9Min.setCobolName("LS-PS9X9-MIN");
        lsPs9X9Max = new CBinaryBinding("lsPs9X9Max", 4, 9, 0, true);
        lsPs9X9Max.setCobolName("LS-PS9X9-MAX");
        lsPs9X18Min = new CBinaryBinding("lsPs9X18Min", 8, 18, 0, true);
        lsPs9X18Min.setCobolName("LS-PS9X18-MIN");
        lsPs9X18Max = new CBinaryBinding("lsPs9X18Max", 8, 18, 0, true);
        lsPs9X18Max.setCobolName("LS-PS9X18-MAX");
        
        /* Add children to children list */
           
        getChildrenList().add(lsPs9X4Min);
        getChildrenList().add(lsPs9X4Max);
        getChildrenList().add(lsPs9X9Min);
        getChildrenList().add(lsPs9X9Max);
        getChildrenList().add(lsPs9X18Min);
        getChildrenList().add(lsPs9X18Max);
    }
  
   
    /** {@inheritDoc} */
    public final void createBoundObject() throws HostException {
        setJaxbObject(mObjectFactory.createLsSignedNativeType());
    }
       
    /** {@inheritDoc} */
    public final void prepareChildren() throws HostException {
    
    }
  
   
    /** {@inheritDoc} */
    public final void getValuesFromBoundObject() throws HostException {
        /* Set this binding properties from java object property values */
                     
        if (mJaxbObject.getLsPs9X4Min() != 0) {
            /* Set value from lsPs9X4Min*/
            lsPs9X4Min.setValue(new BigDecimal(mJaxbObject.getLsPs9X4Min()));
        
        }
                
        if (mJaxbObject.getLsPs9X4Max() != 0) {
            /* Set value from lsPs9X4Max*/
            lsPs9X4Max.setValue(new BigDecimal(mJaxbObject.getLsPs9X4Max()));
        
        }
                
        if (mJaxbObject.getLsPs9X9Min() != 0) {
            /* Set value from lsPs9X9Min*/
            lsPs9X9Min.setValue(new BigDecimal(mJaxbObject.getLsPs9X9Min()));
        
        }
                
        if (mJaxbObject.getLsPs9X9Max() != 0) {
            /* Set value from lsPs9X9Max*/
            lsPs9X9Max.setValue(new BigDecimal(mJaxbObject.getLsPs9X9Max()));
        
        }
                
        if (mJaxbObject.getLsPs9X18Min() != 0L) {
            /* Set value from lsPs9X18Min*/
            lsPs9X18Min.setValue(new BigDecimal(mJaxbObject.getLsPs9X18Min()));
        
        }
                
        if (mJaxbObject.getLsPs9X18Max() != 0L) {
            /* Set value from lsPs9X18Max*/
            lsPs9X18Max.setValue(new BigDecimal(mJaxbObject.getLsPs9X18Max()));
        
        }
    
    }
       
    /** {@inheritDoc} */
    public final void setBoundObjectValue(final int index) throws HostException {
        /* Set the JAXB object property value from binding object */
        switch (index) {
        case 0:
            setBoundObjectValueLsPs9X4Min();
            break;
        case 1:
            setBoundObjectValueLsPs9X4Max();
            break;
        case 2:
            setBoundObjectValueLsPs9X9Min();
            break;
        case 3:
            setBoundObjectValueLsPs9X9Max();
            break;
        case 4:
            setBoundObjectValueLsPs9X18Min();
            break;
        case 5:
            setBoundObjectValueLsPs9X18Max();
            break;
        }
    }
            
    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsPs9X4Min() throws HostException {
    
        if (lsPs9X4Min.getValue() != null) {
            
            /* Set value of lsPs9X4Min*/
            mJaxbObject.setLsPs9X4Min(lsPs9X4Min.getValue().shortValueExact());
                
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsPs9X4Max() throws HostException {
    
        if (lsPs9X4Max.getValue() != null) {
            
            /* Set value of lsPs9X4Max*/
            mJaxbObject.setLsPs9X4Max(lsPs9X4Max.getValue().shortValueExact());
                
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsPs9X9Min() throws HostException {
    
        if (lsPs9X9Min.getValue() != null) {
            
            /* Set value of lsPs9X9Min*/
            mJaxbObject.setLsPs9X9Min(lsPs9X9Min.getValue().intValueExact());
                
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsPs9X9Max() throws HostException {
    
        if (lsPs9X9Max.getValue() != null) {
            
            /* Set value of lsPs9X9Max*/
            mJaxbObject.setLsPs9X9Max(lsPs9X9Max.getValue().intValueExact());
                
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsPs9X18Min() throws HostException {
    
        if (lsPs9X18Min.getValue() != null) {
            
            /* Set value of lsPs9X18Min*/
            mJaxbObject.setLsPs9X18Min(lsPs9X18Min.getValue().longValueExact());
                
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsPs9X18Max() throws HostException {
    
        if (lsPs9X18Max.getValue() != null) {
            
            /* Set value of lsPs9X18Max*/
            mJaxbObject.setLsPs9X18Max(lsPs9X18Max.getValue().longValueExact());
                
        }
        
    }

    /** {@inheritDoc} */
    public final Object getValue() throws HostException {
        return mJaxbObject;
    }

    /**
     * @return the java object to which this cobol complex element is bound
     */
    public final LsSignedNativeType getJaxbObject() {
        return mJaxbObject;
    }

    /**
     * @param jaxbObject the java object to which this cobol complex element
     * is bound
     */
    public final void setJaxbObject(
        final LsSignedNativeType jaxbObject) {
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
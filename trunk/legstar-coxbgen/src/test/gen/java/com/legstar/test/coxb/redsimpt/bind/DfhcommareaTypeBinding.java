
package com.legstar.test.coxb.redsimpt.bind;

import com.legstar.coxb.host.HostException;
import com.legstar.coxb.ICobolComplexBinding;

import com.legstar.coxb.ICobolBinding;

import com.legstar.coxb.common.CComplexBinding;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.redsimpt.ObjectFactory;
import com.legstar.test.coxb.redsimpt.DfhcommareaType;


/**
 * This class was generated by LegStar coxbgen version 1.1.
 * 2007-07-05T15:23:31.39+02:00
 * This class implements a bi-directional binding between a cobol structure and
 * a java object.
 */

public class DfhcommareaTypeBinding 
             extends CComplexBinding {

    /** Jaxb object to which this cobol complex element is bound. */
    private DfhcommareaType mJaxbObject;
  
    /** Indicates that the associated Jaxb object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedJaxbObject = false;
    
    /** Children of this complex binding. */
    
    /** Child bound to jaxb property (). */
    public CDefinition1ChoiceBinding cDefinition1Choice;
            
    /** Logger. */
    private static final Log LOG
        = LogFactory.getLog(DfhcommareaTypeBinding.class);
    
    
    /** Static reference to Jaxb object factory to be used as default. */
    private static final ObjectFactory JF = new ObjectFactory();
    
    /** Current Jaxb object factory (Defaults to the static one but can be
     *  changed). */
    private ObjectFactory mJaxbObjectFactory = JF;
    
    /**
     * Constructor for a root Complex element without a bound JAXB object.
     */
    public DfhcommareaTypeBinding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound JAXB object.
     * 
     * @param jaxbObject the concrete JAXB object instance bound to this
     *        complex element
     */
    public DfhcommareaTypeBinding(
            final DfhcommareaType jaxbObject) {
        this("", "", null, jaxbObject);
    }

     /**
     * Constructor for a Complex element as a child of another element and
     * an associated JAXB object.
     * 
     * @param name the identifier for this binding
     * @param jaxbName name of field in parent JAXB object
     * @param jaxbObject the concrete JAXB object instance bound to this
     *        complex element
     * @param parentBinding a reference to the parent binding
     */
    public DfhcommareaTypeBinding(
            final String name,
            final String jaxbName,
            final ICobolComplexBinding parentBinding,
            final DfhcommareaType jaxbObject) {
        
        super(name, jaxbName, DfhcommareaType.class, null, parentBinding);
        mJaxbObject = jaxbObject;
        if (mJaxbObject != null) {
            mUnusedJaxbObject = true;
        }
        initChildren();
    }

    /** Creates a binding property for each child. */
    private void initChildren() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Initializing started");
        }
        /* Create binding children instances */
        cDefinition1Choice = new CDefinition1ChoiceBinding("CDefinition1Choice", this);
        cDefinition1Choice.setUnmarshalChoiceStrategyClassName("com.legstar.coxb.cust.redsimpt.ChoiceSelector");
        
        /* Add children to children list */
        getChildrenList().add(cDefinition1Choice);

        if (LOG.isDebugEnabled()) {
            LOG.debug("Initializing successful");
        }
    }

    /** {@inheritDoc} */
    public final void createJaxbObject() throws HostException {
        /* Since this complex binding has a constructor that takes a
         * JAXB object, we might already have a Jaxb object that
         * was not used yet. */
        if (mUnusedJaxbObject && mJaxbObject != null) {
            mUnusedJaxbObject = false;
            return;
        }
        mJaxbObject = mJaxbObjectFactory.createDfhcommareaType();
    }

    /** {@inheritDoc} */
    public final void setChildrenValues() throws HostException {

         /* Make sure there is an associated JAXB object*/
        if (mJaxbObject == null) {
            createJaxbObject();
        }
        
    }

    /** {@inheritDoc} */
    @SuppressWarnings("unchecked")
    public final void setJaxbPropertyValue(final int index) throws HostException {
 
        ICobolBinding child = getChildrenList().get(index);
        
    	/* Children that are not bound to a jaxb property are ignored.
    	 * This includes Choices and dynamically generated counbters
    	 * for instance.  */
        if (!child.isBound()) {
            return;
        }
        
        Object value = child.getObjectValue(child.getJaxbType());
        if (LOG.isDebugEnabled()) {
            LOG.debug("Setting value of JAXB property "
                    + child.getJaxbName()
                    + " value=" + value);
        }
        /* Set the JAXB object property value from binding object */
        switch (index) {
        case 0:
            break;
        default:
            break;
        }
    }
            
    /** {@inheritDoc} */
    public final Object getObjectValue(final Class type) throws HostException {
        if (type.equals(DfhcommareaType.class)) {
            return mJaxbObject;
        } else {
            throw new HostException("Attempt to get binding " + getBindingName()
                    + " as an incompatible type " + type);
        }
    }

    /** {@inheritDoc} */
    public final void setObjectValue(final Object value) throws HostException {
        if (value == null) {
            mJaxbObject = null;
            return;
        }
        if (value.getClass().equals(DfhcommareaType.class)) {
            mJaxbObject = (DfhcommareaType) value;
        } else {
            throw new HostException("Attempt to set binding " + getBindingName()
                    + " from an incompatible value " + value);
        }
    }

    /**
     * @return the java object factory for objects creation
     */
    public final ObjectFactory getObjectFactory() {
        return mJaxbObjectFactory;
    }

    /**
     * @param jaxbObjectFactory the java object factory for objects creation 
     */
    public final void setObjectFactory(final Object jaxbObjectFactory) {
        mJaxbObjectFactory = (ObjectFactory) jaxbObjectFactory;
    }

    /** {@inheritDoc} */
    public final boolean isSet() {
        return (mJaxbObject != null);
    }

    /**
     * @return the bound JAXB object
     */
    public final DfhcommareaType getDfhcommareaType() {
        return mJaxbObject;
    }
    
}

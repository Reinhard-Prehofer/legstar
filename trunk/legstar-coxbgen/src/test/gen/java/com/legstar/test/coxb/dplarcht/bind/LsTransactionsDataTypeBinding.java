
package com.legstar.test.coxb.dplarcht.bind;

import com.legstar.coxb.host.HostException;
import com.legstar.coxb.ICobolComplexBinding;

import com.legstar.coxb.ICobolBinding;

import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.ICobolStringBinding;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.dplarcht.ObjectFactory;
import com.legstar.test.coxb.dplarcht.LsTransactionsDataType;


/**
 * This class was generated by LegStar coxbgen version 1.1.
 * 2007-07-05T15:23:31.281+02:00
 * This class implements a bi-directional binding between a cobol structure and
 * a java object.
 */

public class LsTransactionsDataTypeBinding 
             extends CComplexBinding {

    /** Jaxb object to which this cobol complex element is bound. */
    private LsTransactionsDataType mJaxbObject;
  
    /** Indicates that the associated Jaxb object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedJaxbObject = false;
    
    /** Children of this complex binding. */
    
    /** Child bound to jaxb property LsTransactionName(String). */
    public ICobolStringBinding lsTransactionName;
    /** Child bound to jaxb property LsTransactionProgram(String). */
    public ICobolStringBinding lsTransactionProgram;
    /** Child bound to jaxb property LsTransactionStatus(String). */
    public ICobolStringBinding lsTransactionStatus;
    /** Child bound to jaxb property Filler119(String). */
    public ICobolStringBinding filler119;
            
    /** Logger. */
    private static final Log LOG
        = LogFactory.getLog(LsTransactionsDataTypeBinding.class);
    
    /** Binding factory. */
    private static final ICobolBindingFactory BF
        = CobolBindingFactory.getBindingFactory();
    
    /** Static reference to Jaxb object factory to be used as default. */
    private static final ObjectFactory JF = new ObjectFactory();
    
    /** Current Jaxb object factory (Defaults to the static one but can be
     *  changed). */
    private ObjectFactory mJaxbObjectFactory = JF;
    
    /**
     * Constructor for a root Complex element without a bound JAXB object.
     */
    public LsTransactionsDataTypeBinding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound JAXB object.
     * 
     * @param jaxbObject the concrete JAXB object instance bound to this
     *        complex element
     */
    public LsTransactionsDataTypeBinding(
            final LsTransactionsDataType jaxbObject) {
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
    public LsTransactionsDataTypeBinding(
            final String name,
            final String jaxbName,
            final ICobolComplexBinding parentBinding,
            final LsTransactionsDataType jaxbObject) {
        
        super(name, jaxbName, LsTransactionsDataType.class, null, parentBinding);
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
        lsTransactionName = BF.createStringBinding("LsTransactionName", 
               "LsTransactionName", String.class, this);
        lsTransactionName.setByteLength(8);
        lsTransactionName.setCobolName("LS-TRANSACTION-NAME");
        lsTransactionProgram = BF.createStringBinding("LsTransactionProgram", 
               "LsTransactionProgram", String.class, this);
        lsTransactionProgram.setByteLength(8);
        lsTransactionProgram.setCobolName("LS-TRANSACTION-PROGRAM");
        lsTransactionStatus = BF.createStringBinding("LsTransactionStatus", 
               "LsTransactionStatus", String.class, this);
        lsTransactionStatus.setByteLength(12);
        lsTransactionStatus.setCobolName("LS-TRANSACTION-STATUS");
        filler119 = BF.createStringBinding("Filler119", 
               "Filler119", String.class, this);
        filler119.setByteLength(36);
        filler119.setCobolName("FILLER-119");
        
        /* Add children to children list */
        getChildrenList().add(lsTransactionName);
        getChildrenList().add(lsTransactionProgram);
        getChildrenList().add(lsTransactionStatus);
        getChildrenList().add(filler119);

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
        mJaxbObject = mJaxbObjectFactory.createLsTransactionsDataType();
    }

    /** {@inheritDoc} */
    public final void setChildrenValues() throws HostException {

         /* Make sure there is an associated JAXB object*/
        if (mJaxbObject == null) {
            createJaxbObject();
        }
        
        /* Get JAXB property LsTransactionName */
        if (LOG.isDebugEnabled()) {
            LOG.debug("Getting value from JAXB property "
                    + "LsTransactionName"
                    + " value=" + mJaxbObject.getLsTransactionName());
        }
        lsTransactionName.setObjectValue(mJaxbObject.getLsTransactionName());
        
        /* Get JAXB property LsTransactionProgram */
        if (LOG.isDebugEnabled()) {
            LOG.debug("Getting value from JAXB property "
                    + "LsTransactionProgram"
                    + " value=" + mJaxbObject.getLsTransactionProgram());
        }
        lsTransactionProgram.setObjectValue(mJaxbObject.getLsTransactionProgram());
        
        /* Get JAXB property LsTransactionStatus */
        if (LOG.isDebugEnabled()) {
            LOG.debug("Getting value from JAXB property "
                    + "LsTransactionStatus"
                    + " value=" + mJaxbObject.getLsTransactionStatus());
        }
        lsTransactionStatus.setObjectValue(mJaxbObject.getLsTransactionStatus());
        
        /* Get JAXB property Filler119 */
        if (LOG.isDebugEnabled()) {
            LOG.debug("Getting value from JAXB property "
                    + "Filler119"
                    + " value=" + mJaxbObject.getFiller119());
        }
        filler119.setObjectValue(mJaxbObject.getFiller119());
        
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
            mJaxbObject.setLsTransactionName((String) value);
            break;
        case 1:
            mJaxbObject.setLsTransactionProgram((String) value);
            break;
        case 2:
            mJaxbObject.setLsTransactionStatus((String) value);
            break;
        case 3:
            mJaxbObject.setFiller119((String) value);
            break;
        default:
            break;
        }
    }
            
    /** {@inheritDoc} */
    public final Object getObjectValue(final Class type) throws HostException {
        if (type.equals(LsTransactionsDataType.class)) {
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
        if (value.getClass().equals(LsTransactionsDataType.class)) {
            mJaxbObject = (LsTransactionsDataType) value;
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
    public final LsTransactionsDataType getLsTransactionsDataType() {
        return mJaxbObject;
    }
    
}

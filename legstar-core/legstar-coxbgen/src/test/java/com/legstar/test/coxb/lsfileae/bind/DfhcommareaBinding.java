


package com.legstar.test.coxb.lsfileae.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.test.coxb.lsfileae.ComPersonal;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.lsfileae.Dfhcommarea;
import com.legstar.test.coxb.lsfileae.ObjectFactory;

/**
 * LegStar Binding for Complex element :
 *   Dfhcommarea.
 * 
 * This class was generated by LegStar Binding generator.
 */
public class DfhcommareaBinding 
             extends CComplexBinding {

    /** Value object to which this cobol complex element is bound. */
    private Dfhcommarea mValueObject;
  
    /** Indicates that the associated Value object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedValueObject = false;
    
    /** Maximum host bytes size for this complex object. */
    private static final int BYTE_LENGTH = 79;
    
    /** Child bound to value object property ComNumber(Long). */
    public ICobolZonedDecimalBinding _comNumber;
    /** Child bound to value object property ComPersonal(ComPersonal). */
    public ICobolComplexBinding _comPersonal;
    /** Child bound to value object property ComDate(String). */
    public ICobolStringBinding _comDate;
    /** Child bound to value object property ComAmount(String). */
    public ICobolStringBinding _comAmount;
    /** Child bound to value object property ComComment(String). */
    public ICobolStringBinding _comComment;
            
    /** Logger. */
    private final Log _log = LogFactory.getLog(getClass());

    /** Binding factory. */
    private static final ICobolBindingFactory BF
        = CobolBindingFactory.getBindingFactory();
 
    /** Static reference to Value object factory to be used as default. */
    private static final ObjectFactory JF = new ObjectFactory();
    
    /** Current Value object factory (Defaults to the static one but can be
     *  changed). */
    private ObjectFactory mValueObjectFactory = JF;
    
    /**
     * Constructor for a root Complex element without a bound Value object.
     */
    public DfhcommareaBinding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound Value object.
     * 
     * @param valueObject the concrete Value object instance bound to this
     *        complex element
     */
    public DfhcommareaBinding(
            final Dfhcommarea valueObject) {
        this("", "", null, valueObject);
    }

    /**
    * Constructor for a Complex element as a child of another element and
    * an associated Value object.
    * 
    * @param bindingName the identifier for this binding
    * @param fieldName field name in parent Value object
    * @param valueObject the concrete Value object instance bound to this
    *        complex element
    * @param parentBinding a reference to the parent binding
    */
    public DfhcommareaBinding(
            final String bindingName,
            final String fieldName,
            final ICobolComplexBinding parentBinding,
            final Dfhcommarea valueObject) {
        
        super(bindingName, fieldName, Dfhcommarea.class, null, parentBinding);
        mValueObject = valueObject;
        if (mValueObject != null) {
            mUnusedValueObject = true;
        }
        initChildren();
        setByteLength(BYTE_LENGTH);
    }

    /** Creates a binding property for each child. */
    private void initChildren() {
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing started");
        }
        /* Create binding children instances */

        _comNumber = BF.createZonedDecimalBinding("ComNumber",
               "ComNumber", Long.class, this);
        _comNumber.setCobolName("COM-NUMBER");
        _comNumber.setByteLength(6);
        _comNumber.setTotalDigits(6);
        _comPersonal = new ComPersonalBinding("ComPersonal",
               "ComPersonal", this, null);
        _comPersonal.setCobolName("COM-PERSONAL");
        _comPersonal.setByteLength(48);
        _comDate = BF.createStringBinding("ComDate",
               "ComDate", String.class, this);
        _comDate.setCobolName("COM-DATE");
        _comDate.setByteLength(8);
        _comAmount = BF.createStringBinding("ComAmount",
               "ComAmount", String.class, this);
        _comAmount.setCobolName("COM-AMOUNT");
        _comAmount.setByteLength(8);
        _comComment = BF.createStringBinding("ComComment",
               "ComComment", String.class, this);
        _comComment.setCobolName("COM-COMMENT");
        _comComment.setByteLength(9);

        /* Add children to children list */
        getChildrenList().add(_comNumber);
        getChildrenList().add(_comPersonal);
        getChildrenList().add(_comDate);
        getChildrenList().add(_comAmount);
        getChildrenList().add(_comComment);
 
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing successful");
        }
    }
    
    /** {@inheritDoc} */
    public void createValueObject() throws HostException {
        /* Since this complex binding has a constructor that takes a
         * Value object, we might already have a Value object that
         * was not used yet. */
        if (mUnusedValueObject && mValueObject != null) {
            mUnusedValueObject = false;
            return;
        }
        mValueObject = mValueObjectFactory.createDfhcommarea();
    }

    /** {@inheritDoc} */
    public void setChildrenValues() throws HostException {

         /* Make sure there is an associated Value object*/
        if (mValueObject == null) {
            createValueObject();
        }
        /* Get Value object property _comNumber */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_comNumber"
                    + " value=" + mValueObject.getComNumber());
        }
        _comNumber.setObjectValue(mValueObject.getComNumber());
        /* Get Value object property _comPersonal */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_comPersonal"
                    + " value=" + mValueObject.getComPersonal());
        }
        _comPersonal.setObjectValue(mValueObject.getComPersonal());
        /* Get Value object property _comDate */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_comDate"
                    + " value=" + mValueObject.getComDate());
        }
        _comDate.setObjectValue(mValueObject.getComDate());
        /* Get Value object property _comAmount */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_comAmount"
                    + " value=" + mValueObject.getComAmount());
        }
        _comAmount.setObjectValue(mValueObject.getComAmount());
        /* Get Value object property _comComment */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_comComment"
                    + " value=" + mValueObject.getComComment());
        }
        _comComment.setObjectValue(mValueObject.getComComment());
     }

    /** {@inheritDoc} */
    public void setPropertyValue(final int index) throws HostException {
 
        ICobolBinding child = getChildrenList().get(index);
        
       /* Children that are not bound to a value object are ignored.
        * This includes Choices and dynamically generated counters
        * for instance.  */
        if (!child.isBound()) {
            return;
        }
        
        /* Set the Value object property value from binding object */
        Object bindingValue = null;
        switch (index) {
        case 0:
            bindingValue = child.getObjectValue(Long.class);
            mValueObject.setComNumber((Long) bindingValue);
            break;
        case 1:
            bindingValue = child.getObjectValue(ComPersonal.class);
            mValueObject.setComPersonal((ComPersonal) bindingValue);
            break;
        case 2:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setComDate((String) bindingValue);
            break;
        case 3:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setComAmount((String) bindingValue);
            break;
        case 4:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setComComment((String) bindingValue);
            break;
         default:
            break;
        }
        if (_log.isDebugEnabled()) {
            _log.debug("Setting value of Value object property "
                    + child.getJaxbName()
                    + " value=" + bindingValue);
        }
    }

    /** {@inheritDoc} */
    public Object getObjectValue(
            final Class < ? > type) throws HostException {
        if (type.equals(Dfhcommarea.class)) {
            return mValueObject;
        } else {
            throw new HostException("Attempt to get binding " + getBindingName()
                    + " as an incompatible type " + type);
        }
    }

    /** {@inheritDoc} */
    public void setObjectValue(
            final Object bindingValue) throws HostException {
        if (bindingValue == null) {
            mValueObject = null;
            return;
        }
        if (bindingValue.getClass().equals(Dfhcommarea.class)) {
            mValueObject = (Dfhcommarea) bindingValue;
        } else {
            throw new HostException("Attempt to set binding " + getBindingName()
                    + " from an incompatible value " + bindingValue);
        }
    }

    /**
     * @return the java object factory for objects creation
     */
    public ObjectFactory getObjectFactory() {
        return mValueObjectFactory;
    }

    /**
     * @param valueObjectFactory the java object factory for objects creation 
     */
    public void setObjectFactory(final Object valueObjectFactory) {
        mValueObjectFactory = (ObjectFactory) valueObjectFactory;
    }

    /** {@inheritDoc} */
    public boolean isSet() {
        return (mValueObject != null);
    }

    /**
     * @return the bound Value object
     */
    public Dfhcommarea getDfhcommarea() {
        return mValueObject;
    }
    
    /**
     * The COBOL complex element maximum length in bytes.
     * 
     * @return COBOL complex element maximum length in bytes
     */
    public int getByteLength() {
        return BYTE_LENGTH;
    }
}

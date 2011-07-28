


package com.legstar.test.coxb.lsfileaq.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.test.coxb.lsfileaq.PersonalData;
import com.legstar.coxb.ICobolChoiceBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.lsfileaq.Customer;
import com.legstar.test.coxb.lsfileaq.ObjectFactory;

/**
 * LegStar Binding for Complex element :
 *   Customer.
 * 
 * This class was generated by LegStar Binding generator.
 */
public class CustomerBinding 
             extends CComplexBinding {

    /** Value object to which this cobol complex element is bound. */
    private Customer mValueObject;
  
    /** Indicates that the associated Value object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedValueObject = false;
    
    /** Maximum host bytes size for this complex object. */
    private static final int BYTE_LENGTH = 79;
    
    /** Child bound to value object property CustomerId(Long). */
    public ICobolZonedDecimalBinding _customerId;
    /** Child bound to value object property PersonalData(PersonalData). */
    public ICobolComplexBinding _personalData;
    /** Unbound child. */
    public ICobolChoiceBinding _lastTransDateChoice;
    /** Child bound to value object property LastTransAmount(String). */
    public ICobolStringBinding _lastTransAmount;
    /** Child bound to value object property LastTransComment(String). */
    public ICobolStringBinding _lastTransComment;
            
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
    public CustomerBinding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound Value object.
     * 
     * @param valueObject the concrete Value object instance bound to this
     *        complex element
     */
    public CustomerBinding(
            final Customer valueObject) {
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
    public CustomerBinding(
            final String bindingName,
            final String fieldName,
            final ICobolComplexBinding parentBinding,
            final Customer valueObject) {
        
        super(bindingName, fieldName, Customer.class, null, parentBinding);
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

        _customerId = BF.createZonedDecimalBinding("CustomerId",
               "CustomerId", Long.class, this);
        _customerId.setCobolName("CUSTOMER-ID");
        _customerId.setByteLength(6);
        _customerId.setTotalDigits(6);
        _personalData = new PersonalDataBinding("PersonalData",
               "PersonalData", this, null);
        _personalData.setCobolName("PERSONAL-DATA");
        _personalData.setByteLength(48);
        _lastTransDateChoice = new LastTransDateChoiceBinding("LastTransDateChoice", this);
        _lastTransDateChoice.setCobolName("LAST-TRANS-DATE");
        _lastTransDateChoice.setByteLength(8);
        _lastTransAmount = BF.createStringBinding("LastTransAmount",
               "LastTransAmount", String.class, this);
        _lastTransAmount.setCobolName("LAST-TRANS-AMOUNT");
        _lastTransAmount.setByteLength(8);
        _lastTransAmount.setTotalDigits(6);
        _lastTransAmount.setFractionDigits(2);
        _lastTransComment = BF.createStringBinding("LastTransComment",
               "LastTransComment", String.class, this);
        _lastTransComment.setCobolName("LAST-TRANS-COMMENT");
        _lastTransComment.setByteLength(9);

        /* Add children to children list */
        getChildrenList().add(_customerId);
        getChildrenList().add(_personalData);
        getChildrenList().add(_lastTransDateChoice);
        getChildrenList().add(_lastTransAmount);
        getChildrenList().add(_lastTransComment);
 
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
        mValueObject = mValueObjectFactory.createCustomer();
    }

    /** {@inheritDoc} */
    public void setChildrenValues() throws HostException {

         /* Make sure there is an associated Value object*/
        if (mValueObject == null) {
            createValueObject();
        }
        /* Get Value object property _customerId */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_customerId"
                    + " value=" + mValueObject.getCustomerId());
        }
        _customerId.setObjectValue(mValueObject.getCustomerId());
        /* Get Value object property _personalData */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_personalData"
                    + " value=" + mValueObject.getPersonalData());
        }
        _personalData.setObjectValue(mValueObject.getPersonalData());
        /* Get Value object property _lastTransAmount */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_lastTransAmount"
                    + " value=" + mValueObject.getLastTransAmount());
        }
        _lastTransAmount.setObjectValue(mValueObject.getLastTransAmount());
        /* Get Value object property _lastTransComment */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_lastTransComment"
                    + " value=" + mValueObject.getLastTransComment());
        }
        _lastTransComment.setObjectValue(mValueObject.getLastTransComment());
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
            mValueObject.setCustomerId((Long) bindingValue);
            break;
        case 1:
            bindingValue = child.getObjectValue(PersonalData.class);
            mValueObject.setPersonalData((PersonalData) bindingValue);
            break;
        case 2:
            break;
        case 3:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setLastTransAmount((String) bindingValue);
            break;
        case 4:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setLastTransComment((String) bindingValue);
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
        if (type.equals(Customer.class)) {
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
        if (bindingValue.getClass().equals(Customer.class)) {
            mValueObject = (Customer) bindingValue;
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
    public Customer getCustomer() {
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


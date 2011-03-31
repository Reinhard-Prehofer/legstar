


package com.legstar.test.coxb.MSNSearch.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.test.coxb.MSNSearch.SafeSearchOptionsType;
import com.legstar.coxb.ICobolArrayStringBinding;
import java.util.List;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.test.coxb.MSNSearch.LocationType;
import com.legstar.test.coxb.MSNSearch.ArrayOfSourceRequestRequestsType;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.MSNSearch.SearchRequestType;
import com.legstar.test.coxb.MSNSearch.ObjectFactory;

/**
 * LegStar Binding for Complex element :
 *   SearchRequestType.
 * 
 * This class was generated by LegStar Binding generator.
 */
public class SearchRequestTypeBinding 
             extends CComplexBinding {

    /** Value object to which this cobol complex element is bound. */
    private SearchRequestType mValueObject;
  
    /** Indicates that the associated Value object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedValueObject = false;
    
    /** Maximum host bytes size for this complex object. */
    private static final int BYTE_LENGTH = 10896;
    
    /** Child bound to value object property AppID(String). */
    public ICobolStringBinding _appID;
    /** Child bound to value object property Query(String). */
    public ICobolStringBinding _query;
    /** Child bound to value object property CultureInfo(String). */
    public ICobolStringBinding _cultureInfo;
    /** Child bound to value object property SafeSearch(SafeSearchOptionsType). */
    public ICobolStringBinding _safeSearch;
    /** Child bound to value object property Flags(String). */
    public ICobolArrayStringBinding _flags;
    /** Child bound to value object property Location(LocationType). */
    public ICobolComplexBinding _location;
    /** Child bound to value object property Requests(ArrayOfSourceRequestRequestsType). */
    public ICobolComplexBinding _requests;
            
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
    public SearchRequestTypeBinding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound Value object.
     * 
     * @param valueObject the concrete Value object instance bound to this
     *        complex element
     */
    public SearchRequestTypeBinding(
            final SearchRequestType valueObject) {
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
    public SearchRequestTypeBinding(
            final String bindingName,
            final String fieldName,
            final ICobolComplexBinding parentBinding,
            final SearchRequestType valueObject) {
        
        super(bindingName, fieldName, SearchRequestType.class, null, parentBinding);
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

        _appID = BF.createStringBinding("AppID",
               "AppID", String.class, this);
        _appID.setCobolName("AppID");
        _appID.setByteLength(40);
        _query = BF.createStringBinding("Query",
               "Query", String.class, this);
        _query.setCobolName("Query");
        _query.setByteLength(128);
        _cultureInfo = BF.createStringBinding("CultureInfo",
               "CultureInfo", String.class, this);
        _cultureInfo.setCobolName("CultureInfo");
        _cultureInfo.setByteLength(32);
        _safeSearch = BF.createStringBinding("SafeSearch",
               "SafeSearch", SafeSearchOptionsType.class, this);
        _safeSearch.setCobolName("SafeSearch");
        _safeSearch.setByteLength(32);
        _flags = BF.createArrayStringBinding("Flags",
               "Flags", String.class, this);
        _flags.setCobolName("Flags");
        _flags.setByteLength(320);
        _flags.setItemByteLength(32);
        _flags.setMinOccurs(1);
        _flags.setMaxOccurs(10);
        _flags.setDependingOn("Flags--C");
        _location = new LocationTypeBinding("Location",
               "Location", this, null);
        _location.setCobolName("Location");
        _location.setByteLength(24);
        _requests = new ArrayOfSourceRequestRequestsTypeBinding("Requests",
               "Requests", this, null);
        _requests.setCobolName("Requests");
        _requests.setByteLength(10320);

        /* Add children to children list */
        getChildrenList().add(_appID);
        getChildrenList().add(_query);
        getChildrenList().add(_cultureInfo);
        getChildrenList().add(_safeSearch);
        getChildrenList().add(_flags);
        getChildrenList().add(_location);
        getChildrenList().add(_requests);
 
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
        mValueObject = mValueObjectFactory.createSearchRequestType();
    }

    /** {@inheritDoc} */
    public void setChildrenValues() throws HostException {

         /* Make sure there is an associated Value object*/
        if (mValueObject == null) {
            createValueObject();
        }
        /* Get Value object property _appID */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_appID"
                    + " value=" + mValueObject.getAppID());
        }
        _appID.setObjectValue(mValueObject.getAppID());
        /* Get Value object property _query */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_query"
                    + " value=" + mValueObject.getQuery());
        }
        _query.setObjectValue(mValueObject.getQuery());
        /* Get Value object property _cultureInfo */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cultureInfo"
                    + " value=" + mValueObject.getCultureInfo());
        }
        _cultureInfo.setObjectValue(mValueObject.getCultureInfo());
        /* Get Value object property _safeSearch */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_safeSearch"
                    + " value=" + mValueObject.getSafeSearch());
        }
        _safeSearch.setObjectValue(mValueObject.getSafeSearch());
        /* Get Value object property _flags */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_flags"
                    + " value=" + mValueObject.getFlags());
        }
        _flags.setObjectValue(mValueObject.getFlags());
        /* For variable size array or list, we make sure any
         * associated counter is updated */
        setCounterValue(_flags.getDependingOn(),
                ((List < ? >) mValueObject.getFlags()).size());
        /* Get Value object property _location */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_location"
                    + " value=" + mValueObject.getLocation());
        }
        _location.setObjectValue(mValueObject.getLocation());
        /* Get Value object property _requests */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_requests"
                    + " value=" + mValueObject.getRequests());
        }
        _requests.setObjectValue(mValueObject.getRequests());
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
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setAppID((String) bindingValue);
            break;
        case 1:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setQuery((String) bindingValue);
            break;
        case 2:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCultureInfo((String) bindingValue);
            break;
        case 3:
            bindingValue = child.getObjectValue(SafeSearchOptionsType.class);
            mValueObject.setSafeSearch((SafeSearchOptionsType) bindingValue);
            break;
        case 4:
            bindingValue = child.getObjectValue(String.class);
            List < String > listFlags = cast(bindingValue);
            mValueObject.getFlags().clear();
            mValueObject.getFlags().addAll(listFlags);
            break;
        case 5:
            bindingValue = child.getObjectValue(LocationType.class);
            mValueObject.setLocation((LocationType) bindingValue);
            break;
        case 6:
            bindingValue = child.getObjectValue(ArrayOfSourceRequestRequestsType.class);
            mValueObject.setRequests((ArrayOfSourceRequestRequestsType) bindingValue);
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
        if (type.equals(SearchRequestType.class)) {
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
        if (bindingValue.getClass().equals(SearchRequestType.class)) {
            mValueObject = (SearchRequestType) bindingValue;
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
    public SearchRequestType getSearchRequestType() {
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


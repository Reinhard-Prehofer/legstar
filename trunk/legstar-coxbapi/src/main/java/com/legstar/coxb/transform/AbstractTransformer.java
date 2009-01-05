package com.legstar.coxb.transform;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolBindingVisitorsFactory;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolBindingVisitorsFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.convert.CobolConvertersFactory;
import com.legstar.coxb.convert.ICobolConverters;
import com.legstar.coxb.convert.ICobolConvertersFactory;

/**
 * Transformers provide the foundation for host data transformations.
 * Implementing classes typically provide the binding class and inherit the
 * transformation capabilities.
 */
public abstract class AbstractTransformer implements IHostTransformer {

    /** The current set of COBOL converters.*/
    private ICobolConverters mCobolConverters;
    
    /** Factory that provides concrete implementations of marshalers/unmarshalers. */
    private ICobolBindingVisitorsFactory mCobolBindingVisitorsFactory;

    /**
     * @return the binding corresponding to the host structure type.
     * Such a binding can either be statically produced by {@link com.legstar.coxb.gen.CoxbBindingGenerator},
     * or dynamically built by {@link com.legstar.coxb.impl.reflect.CComplexBinding}.
     * @throws CobolBindingException if binding cannot be returned
     */
    public abstract ICobolComplexBinding getBinding() throws CobolBindingException;

    /**
     * Create a transformer using default COBOL parameters.
     */
    public AbstractTransformer() {
        this(new CobolContext());
    }

    /**
     * Create a transformer using a specific host character set while
     * other COBOL parameters are set by default.
     * @param hostCharset the host character set
     */
    public AbstractTransformer(final String hostCharset) {
        this(new CobolContext());
        getCobolContext().setHostCharsetName(hostCharset);
    }

    /**
     * Create a transformer using a specific COBOL parameters set.
     * @param cobolContext the COBOL parameters set.
     */
    public AbstractTransformer(final CobolContext cobolContext) {
        ICobolConvertersFactory factory = CobolConvertersFactory.createCobolConvertersFactory();
        mCobolConverters = factory.createCobolConverters();
        mCobolBindingVisitorsFactory = CobolBindingVisitorsFactory.createCobolBindingVisitorsFactory();
        setCobolContext(cobolContext);
    }

    /**
     * This method returns the current set of COBOL converters.
     * @return a set of COBOL converters
     */
    public ICobolConverters getCobolConverters() {
        return mCobolConverters;
    }

    /**
     * Caller can pass his own set of converters if he is not satisfied with the default.
     * @param cobolConverters the new set of COBOL converters
     */
    public void setCobolConverters(final ICobolConverters cobolConverters) {
        mCobolConverters = cobolConverters;
    }

    /**
     * Returns the current COBOL parameter set.
     * @return a COBOL parameter set
     */
    public CobolContext getCobolContext() {
        return getCobolConverters().getCobolContext();
    }

    /**
     * Change the COBOL parameter sets of the converters.
     * @param cobolContext the new COBOL parameter set
     */
    public void setCobolContext(final CobolContext cobolContext) {
        getCobolConverters().setCobolContext(cobolContext);
    }

    /**
     * @return the Factory that provides concrete implementations of marshalers/unmarshalers
     */
    public ICobolBindingVisitorsFactory getCobolBindingVisitorsFactory() {
        return mCobolBindingVisitorsFactory;
    }

    /**
     * @param cobolBindingVisitorsFactory the Factory that provides concrete implementations
     *  of marshalers/unmarshalers to set
     */
    public void setCobolBindingVisitorsFactory(
            final ICobolBindingVisitorsFactory cobolBindingVisitorsFactory) {
        mCobolBindingVisitorsFactory = cobolBindingVisitorsFactory;
    }

}

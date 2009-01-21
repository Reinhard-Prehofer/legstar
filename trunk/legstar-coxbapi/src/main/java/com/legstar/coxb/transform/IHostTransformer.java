package com.legstar.coxb.transform;

import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolBindingVisitorsFactory;
import com.legstar.coxb.convert.ICobolConverters;

/**
 * Transformers convert complex objects to/from raw mainframe byte arrays described
 * by COBOL structures.
 */
public interface IHostTransformer {

    /**
     * This method returns the current set of COBOL converters.
     * @return a set of COBOL converters
     */
    ICobolConverters getCobolConverters();

    /**
     * Caller can pass his own set of converters if he is not satisfied with the default.
     * @param cobolConverters the new set of COBOL converters
     */
    void setCobolConverters(final ICobolConverters cobolConverters);

    /**
     * Returns the current COBOL parameter set.
     * @return a COBOL parameter set
     */
    CobolContext getCobolContext();

    /**
     * Change the COBOL parameter sets of the converters.
     * @param cobolContext the new COBOL parameter set
     */
    void setCobolContext(final CobolContext cobolContext);

    /**
     * @return the Factory that provides concrete implementations of marshalers/unmarshalers
     */
    ICobolBindingVisitorsFactory getCobolBindingVisitorsFactory();

    /**
     * @param cobolBindingVisitorsFactory the Factory that provides concrete implementations
     *  of marshalers/unmarshalers to set
     */
    void setCobolBindingVisitorsFactory(
            final ICobolBindingVisitorsFactory cobolBindingVisitorsFactory);
}
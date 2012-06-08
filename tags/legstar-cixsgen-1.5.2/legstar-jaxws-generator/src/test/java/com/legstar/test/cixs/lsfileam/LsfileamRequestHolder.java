package com.legstar.test.cixs.lsfileam;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.lsfileac.QueryData;
import com.legstar.test.coxb.lsfileac.QueryLimit;

/**
 * LegStar/Jaxws Operation Request Holder.
 * A container class for multi-elements Requests.
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */

@XmlRootElement(name = "LsfileamRequestHolder")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsfileamRequestHolder",
         namespace = "http://cixs.test.legstar.com/lsfileam",
         propOrder = {
    "queryData",
    "queryLimit" })
public class LsfileamRequestHolder
    implements Serializable {

    /** Serial version ID. */
    private static final long serialVersionUID = 1L;

    /** Inner QueryData JAXB-bound object. */
    @XmlElement(name = "QueryData",
                namespace = "http://legstar.com/test/coxb/lsfileac",
                required = true)
    private QueryData queryData;
    /** Inner QueryLimit JAXB-bound object. */
    @XmlElement(name = "QueryLimit",
                namespace = "http://legstar.com/test/coxb/lsfileac",
                required = true)
    private QueryLimit queryLimit;

    /**
     * Get the inner QueryData JAXB-bound object.
     * 
     * @return JAXB-bound object
     */
    public QueryData getQueryData() {
        return queryData;
    }
    
    /**
     * Set the inner QueryData JAXB-bound object.
     * 
     * @param value JAXB-bound object
     */
    public void setQueryData(
            final QueryData value) {
        queryData = value;
    }
    /**
     * Get the inner QueryLimit JAXB-bound object.
     * 
     * @return JAXB-bound object
     */
    public QueryLimit getQueryLimit() {
        return queryLimit;
    }
    
    /**
     * Set the inner QueryLimit JAXB-bound object.
     * 
     * @param value JAXB-bound object
     */
    public void setQueryLimit(
            final QueryLimit value) {
        queryLimit = value;
    }
}
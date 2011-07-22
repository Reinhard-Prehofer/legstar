package com.legstar.test.cixs.lsfileac1;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.lsfileac.QueryData;

/**
 * LegStar/Jaxws Operation Request Wrapper.
 * A wrapper class for the Request.
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */

@XmlRootElement(name = "LsfileacRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsfileacRequest",
         namespace = "http://cixs.test.legstar.com/lsfileac1",
         propOrder = {
    "request"
})
public class LsfileacRequest {
    
    /** Inner JAXB-bound object. */
    @XmlElement(name = "QueryData",
                namespace = "http://legstar.com/test/coxb/lsfileac",
                required = true)
    private QueryData request;

    /**
    * Get the inner JAXB-bound object.
    * 
    * @return JAXB-bound object
    */
    public QueryData getRequest() {
        return request;
    }

  /**
   * Set the inner JAXB-bound object.
   * 
   * @param value JAXB-bound object
   */
    public void setRequest(
            final QueryData value) {
        request = value;
    }

}

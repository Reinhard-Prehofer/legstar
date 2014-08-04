package com.legstar.test.cixs.lsfileam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * LegStar/Jaxws Operation Request Wrapper.
 * A wrapper class for the Request.
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */

@XmlRootElement(name = "LsfileamRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsfileamRequest",
         namespace = "http://cixs.test.legstar.com/lsfileam",
         propOrder = {
    "request"
})
public class LsfileamRequest {
    
    /** Inner JAXB-bound object. */
    @XmlElement(name = "LsfileamRequestHolder",
                namespace = "http://cixs.test.legstar.com/lsfileam",
                required = true)
    private LsfileamRequestHolder request;

    /**
    * Get the inner JAXB-bound object.
    * 
    * @return JAXB-bound object
    */
    public LsfileamRequestHolder getRequest() {
        return request;
    }

  /**
   * Set the inner JAXB-bound object.
   * 
   * @param value JAXB-bound object
   */
    public void setRequest(
            final LsfileamRequestHolder value) {
        request = value;
    }

}

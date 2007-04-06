
package com.legstar.test.cixs.lsfileae;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.lsfileae.DfhcommareaType;

/**
 * Response wrapper element.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:19.171+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsfileaeResponse",
         namespace = "http://cixs.test.legstar.com/lsfileae",
         propOrder = {
    "response" 
})
public class LsfileaeResponse {
	
    /** Inner JAXB-bound object. */
    @XmlElement(name = "Response",
                namespace = "http://cixs.test.legstar.com/lsfileae",
                required = true)
    private DfhcommareaType response;

	/**
	 * Get the inner JAXB-bound object.
	 * 
	 * @return JAXB-bound object
	 */
	public final DfhcommareaType getResponse() {
		return response;
	}

	/**
	 * Set the inner JAXB-bound object.
	 * 
	 * @param value JAXB-bound object
	 */
	public final void setResponse(
	    final DfhcommareaType value) {
		this.response = value;
	}
}


package com.legstar.test.cixs.vararcom;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.vararcom.DfhcommareaType;

/**
 * Response wrapper element.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:30.218+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VararcomResponse",
         namespace = "http://cixs.test.legstar.com/vararcom",
         propOrder = {
    "response" 
})
public class VararcomResponse {
	
    /** Inner JAXB-bound object. */
    @XmlElement(name = "Response",
                namespace = "http://cixs.test.legstar.com/vararcom",
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

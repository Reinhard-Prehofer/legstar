
package com.legstar.test.cixs.binnatsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.test.coxb.binnatsi.DfhcommareaType;


/**
 * <p>Java class for BinnatsiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinnatsiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{http://legstar.com/test/coxb/binnatsi}DfhcommareaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinnatsiResponse", propOrder = {
    "response"
})
public class BinnatsiResponse {

    @XmlElement(name = "Response", required = true)
    protected DfhcommareaType response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link DfhcommareaType }
     *     
     */
    public DfhcommareaType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link DfhcommareaType }
     *     
     */
    public void setResponse(DfhcommareaType value) {
        this.response = value;
    }

}

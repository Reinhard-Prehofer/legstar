//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.11 at 02:03:49 PM CEST 
//


package com.legstar.test.coxb.binnatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for DfhcommareaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DfhcommareaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LsUnsignedNative" type="{http://legstar.com/test/coxb/binnatus}LsUnsignedNativeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DfhcommareaType", propOrder = {
    "lsUnsignedNative"
})
public class DfhcommareaType {

    @XmlElement(name = "LsUnsignedNative", required = true)
    @CobolElement(cobolName = "LS-UNSIGNED-NATIVE", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 68)
    protected LsUnsignedNativeType lsUnsignedNative;

    /**
     * Gets the value of the lsUnsignedNative property.
     * 
     * @return
     *     possible object is
     *     {@link LsUnsignedNativeType }
     *     
     */
    public LsUnsignedNativeType getLsUnsignedNative() {
        return lsUnsignedNative;
    }

    /**
     * Sets the value of the lsUnsignedNative property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsUnsignedNativeType }
     *     
     */
    public void setLsUnsignedNative(LsUnsignedNativeType value) {
        this.lsUnsignedNative = value;
    }

    public boolean isSetLsUnsignedNative() {
        return (this.lsUnsignedNative!= null);
    }

}

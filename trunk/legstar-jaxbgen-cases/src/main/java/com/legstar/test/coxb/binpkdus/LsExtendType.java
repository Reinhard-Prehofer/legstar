//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.11 at 02:03:49 PM CEST 
//


package com.legstar.test.coxb.binpkdus;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for LsExtendType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LsExtendType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LsP9X19">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsP9X31">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999999999999999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsExtendType", propOrder = {
    "lsP9X19",
    "lsP9X31"
})
public class LsExtendType {

    @XmlElement(name = "LsP9X19", required = true)
    @CobolElement(cobolName = "LS-P9X19", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, byteLength = 10, isSigned = false, totalDigits = 19, picture = "9(19)", usage = "PACKED-DECIMAL", srceLine = 64)
    protected BigInteger lsP9X19;
    @XmlElement(name = "LsP9X31", required = true)
    @CobolElement(cobolName = "LS-P9X31", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, byteLength = 16, isSigned = false, totalDigits = 31, picture = "9(31)", usage = "PACKED-DECIMAL", srceLine = 65)
    protected BigInteger lsP9X31;

    /**
     * Gets the value of the lsP9X19 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLsP9X19() {
        return lsP9X19;
    }

    /**
     * Sets the value of the lsP9X19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLsP9X19(BigInteger value) {
        this.lsP9X19 = value;
    }

    public boolean isSetLsP9X19() {
        return (this.lsP9X19 != null);
    }

    /**
     * Gets the value of the lsP9X31 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLsP9X31() {
        return lsP9X31;
    }

    /**
     * Sets the value of the lsP9X31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLsP9X31(BigInteger value) {
        this.lsP9X31 = value;
    }

    public boolean isSetLsP9X31() {
        return (this.lsP9X31 != null);
    }

}

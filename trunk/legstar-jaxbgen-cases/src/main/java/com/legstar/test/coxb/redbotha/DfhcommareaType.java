//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.11 at 01:37:31 PM CEST 
//


package com.legstar.test.coxb.redbotha;

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
 *         &lt;choice>
 *           &lt;element name="CNumeric">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *                 &lt;minInclusive value="0"/>
 *                 &lt;maxInclusive value="9999"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="Filler22" type="{http://legstar.com/test/coxb/redbotha}Filler22Type"/>
 *         &lt;/choice>
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
    "cNumeric",
    "filler22"
})
public class DfhcommareaType {

    @XmlElement(name = "CNumeric")
    @CobolElement(cobolName = "C-NUMERIC", type = CobolType.BINARY_ITEM, levelNumber = 5, byteLength = 2, isSigned = false, totalDigits = 4, isRedefined = true, picture = "9(4)", usage = "BINARY", unmarshalChoiceStrategyClassName = "com.legstar.coxb.cust.redbotha.ChoiceSelector", srceLine = 21)
    protected Integer cNumeric;
    @XmlElement(name = "Filler22")
    @CobolElement(cobolName = "FILLER-22", type = CobolType.GROUP_ITEM, levelNumber = 5, redefines = "C-NUMERIC", srceLine = 22)
    protected Filler22Type filler22;

    /**
     * Gets the value of the cNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCNumeric() {
        return cNumeric;
    }

    /**
     * Sets the value of the cNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCNumeric(Integer value) {
        this.cNumeric = value;
    }

    public boolean isSetCNumeric() {
        return (this.cNumeric!= null);
    }

    /**
     * Gets the value of the filler22 property.
     * 
     * @return
     *     possible object is
     *     {@link Filler22Type }
     *     
     */
    public Filler22Type getFiller22() {
        return filler22;
    }

    /**
     * Sets the value of the filler22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filler22Type }
     *     
     */
    public void setFiller22(Filler22Type value) {
        this.filler22 = value;
    }

    public boolean isSetFiller22() {
        return (this.filler22 != null);
    }

}

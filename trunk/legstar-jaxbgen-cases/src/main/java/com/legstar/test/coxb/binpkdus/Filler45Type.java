//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.11 at 02:03:49 PM CEST 
//


package com.legstar.test.coxb.binpkdus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Filler45Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filler45Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsPs9X18Dis1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{18}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X18Dis2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{18}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X31Dis1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{31}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X31Dis2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{31}"/>
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
@XmlType(name = "Filler45Type", propOrder = {
    "wsPs9X18Dis1",
    "wsPs9X18Dis2",
    "wsPs9X31Dis1",
    "wsPs9X31Dis2"
})
public class Filler45Type {

    @XmlElement(name = "WsPs9X18Dis1", required = true)
    @CobolElement(cobolName = "WS-PS9X18-DIS-1", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, byteLength = 19, isSigned = true, totalDigits = 18, picture = "+9(18)", usage = "DISPLAY", srceLine = 46)
    protected String wsPs9X18Dis1;
    @XmlElement(name = "WsPs9X18Dis2", required = true)
    @CobolElement(cobolName = "WS-PS9X18-DIS-2", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, byteLength = 19, isSigned = true, totalDigits = 18, picture = "+9(18)", usage = "DISPLAY", srceLine = 47)
    protected String wsPs9X18Dis2;
    @XmlElement(name = "WsPs9X31Dis1", required = true)
    @CobolElement(cobolName = "WS-PS9X31-DIS-1", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, byteLength = 32, isSigned = true, totalDigits = 31, picture = "+9(31)", usage = "DISPLAY", srceLine = 48)
    protected String wsPs9X31Dis1;
    @XmlElement(name = "WsPs9X31Dis2", required = true)
    @CobolElement(cobolName = "WS-PS9X31-DIS-2", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, byteLength = 32, isSigned = true, totalDigits = 31, picture = "+9(31)", usage = "DISPLAY", srceLine = 49)
    protected String wsPs9X31Dis2;

    /**
     * Gets the value of the wsPs9X18Dis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X18Dis1() {
        return wsPs9X18Dis1;
    }

    /**
     * Sets the value of the wsPs9X18Dis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X18Dis1(String value) {
        this.wsPs9X18Dis1 = value;
    }

    public boolean isSetWsPs9X18Dis1() {
        return (this.wsPs9X18Dis1 != null);
    }

    /**
     * Gets the value of the wsPs9X18Dis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X18Dis2() {
        return wsPs9X18Dis2;
    }

    /**
     * Sets the value of the wsPs9X18Dis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X18Dis2(String value) {
        this.wsPs9X18Dis2 = value;
    }

    public boolean isSetWsPs9X18Dis2() {
        return (this.wsPs9X18Dis2 != null);
    }

    /**
     * Gets the value of the wsPs9X31Dis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X31Dis1() {
        return wsPs9X31Dis1;
    }

    /**
     * Sets the value of the wsPs9X31Dis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X31Dis1(String value) {
        this.wsPs9X31Dis1 = value;
    }

    public boolean isSetWsPs9X31Dis1() {
        return (this.wsPs9X31Dis1 != null);
    }

    /**
     * Gets the value of the wsPs9X31Dis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X31Dis2() {
        return wsPs9X31Dis2;
    }

    /**
     * Sets the value of the wsPs9X31Dis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X31Dis2(String value) {
        this.wsPs9X31Dis2 = value;
    }

    public boolean isSetWsPs9X31Dis2() {
        return (this.wsPs9X31Dis2 != null);
    }

}

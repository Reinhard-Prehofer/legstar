//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.11 at 02:03:49 PM CEST 
//


package com.legstar.test.coxb.binarcht;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsSignedNativeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsSignedNativeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsPs9X4Min">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{5}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X4Max">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{5}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X9Min">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{10}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X9Max">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{10}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X18Min">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{19}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X18Max">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{19}"/>
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
@XmlType(name = "WsSignedNativeType", propOrder = {
    "wsPs9X4Min",
    "wsPs9X4Max",
    "wsPs9X9Min",
    "wsPs9X9Max",
    "wsPs9X18Min",
    "wsPs9X18Max"
})
public class WsSignedNativeType {

    @XmlElement(name = "WsPs9X4Min", required = true)
    @CobolElement(cobolName = "WS-PS9X4-MIN", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, byteLength = 6, isSigned = true, totalDigits = 5, picture = "+9(5)", usage = "DISPLAY", srceLine = 29)
    protected String wsPs9X4Min;
    @XmlElement(name = "WsPs9X4Max", required = true)
    @CobolElement(cobolName = "WS-PS9X4-MAX", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, byteLength = 6, isSigned = true, totalDigits = 5, picture = "+9(5)", usage = "DISPLAY", srceLine = 30)
    protected String wsPs9X4Max;
    @XmlElement(name = "WsPs9X9Min", required = true)
    @CobolElement(cobolName = "WS-PS9X9-MIN", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, byteLength = 11, isSigned = true, totalDigits = 10, picture = "+9(10)", usage = "DISPLAY", srceLine = 31)
    protected String wsPs9X9Min;
    @XmlElement(name = "WsPs9X9Max", required = true)
    @CobolElement(cobolName = "WS-PS9X9-MAX", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, byteLength = 11, isSigned = true, totalDigits = 10, picture = "+9(10)", usage = "DISPLAY", srceLine = 32)
    protected String wsPs9X9Max;
    @XmlElement(name = "WsPs9X18Min", required = true)
    @CobolElement(cobolName = "WS-PS9X18-MIN", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, byteLength = 20, isSigned = true, totalDigits = 19, picture = "+9(19)", usage = "DISPLAY", srceLine = 33)
    protected String wsPs9X18Min;
    @XmlElement(name = "WsPs9X18Max", required = true)
    @CobolElement(cobolName = "WS-PS9X18-MAX", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, byteLength = 20, isSigned = true, totalDigits = 19, picture = "+9(19)", usage = "DISPLAY", srceLine = 34)
    protected String wsPs9X18Max;

    /**
     * Gets the value of the wsPs9X4Min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X4Min() {
        return wsPs9X4Min;
    }

    /**
     * Sets the value of the wsPs9X4Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X4Min(String value) {
        this.wsPs9X4Min = value;
    }

    public boolean isSetWsPs9X4Min() {
        return (this.wsPs9X4Min!= null);
    }

    /**
     * Gets the value of the wsPs9X4Max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X4Max() {
        return wsPs9X4Max;
    }

    /**
     * Sets the value of the wsPs9X4Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X4Max(String value) {
        this.wsPs9X4Max = value;
    }

    public boolean isSetWsPs9X4Max() {
        return (this.wsPs9X4Max!= null);
    }

    /**
     * Gets the value of the wsPs9X9Min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X9Min() {
        return wsPs9X9Min;
    }

    /**
     * Sets the value of the wsPs9X9Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X9Min(String value) {
        this.wsPs9X9Min = value;
    }

    public boolean isSetWsPs9X9Min() {
        return (this.wsPs9X9Min!= null);
    }

    /**
     * Gets the value of the wsPs9X9Max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X9Max() {
        return wsPs9X9Max;
    }

    /**
     * Sets the value of the wsPs9X9Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X9Max(String value) {
        this.wsPs9X9Max = value;
    }

    public boolean isSetWsPs9X9Max() {
        return (this.wsPs9X9Max!= null);
    }

    /**
     * Gets the value of the wsPs9X18Min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X18Min() {
        return wsPs9X18Min;
    }

    /**
     * Sets the value of the wsPs9X18Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X18Min(String value) {
        this.wsPs9X18Min = value;
    }

    public boolean isSetWsPs9X18Min() {
        return (this.wsPs9X18Min!= null);
    }

    /**
     * Gets the value of the wsPs9X18Max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X18Max() {
        return wsPs9X18Max;
    }

    /**
     * Sets the value of the wsPs9X18Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X18Max(String value) {
        this.wsPs9X18Max = value;
    }

    public boolean isSetWsPs9X18Max() {
        return (this.wsPs9X18Max!= null);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.13 at 09:00:27 AM CEST 
//


package com.legstar.test.coxb.binnatsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsFullwordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsFullwordsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsPs9X9Min">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X9Low">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X9High">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X9Max">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
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
@XmlType(name = "WsFullwordsType", propOrder = {
    "wsPs9X9Min",
    "wsPs9X9Low",
    "wsPs9X9High",
    "wsPs9X9Max"
})
public class WsFullwordsType {

    @XmlElement(name = "WsPs9X9Min")
    @CobolElement(cobolName = "WS-PS9X9-MIN", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, byteLength = 4, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "COMP-5", srceLine = 37)
    protected int wsPs9X9Min;
    @XmlElement(name = "WsPs9X9Low")
    @CobolElement(cobolName = "WS-PS9X9-LOW", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, byteLength = 4, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "COMP-5", srceLine = 38)
    protected int wsPs9X9Low;
    @XmlElement(name = "WsPs9X9High")
    @CobolElement(cobolName = "WS-PS9X9-HIGH", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, byteLength = 4, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "COMP-5", srceLine = 39)
    protected int wsPs9X9High;
    @XmlElement(name = "WsPs9X9Max")
    @CobolElement(cobolName = "WS-PS9X9-MAX", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, byteLength = 4, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "COMP-5", srceLine = 40)
    protected int wsPs9X9Max;

    /**
     * Gets the value of the wsPs9X9Min property.
     * 
     */
    public int getWsPs9X9Min() {
        return wsPs9X9Min;
    }

    /**
     * Sets the value of the wsPs9X9Min property.
     * 
     */
    public void setWsPs9X9Min(int value) {
        this.wsPs9X9Min = value;
    }

    public boolean isSetWsPs9X9Min() {
        return true;
    }

    /**
     * Gets the value of the wsPs9X9Low property.
     * 
     */
    public int getWsPs9X9Low() {
        return wsPs9X9Low;
    }

    /**
     * Sets the value of the wsPs9X9Low property.
     * 
     */
    public void setWsPs9X9Low(int value) {
        this.wsPs9X9Low = value;
    }

    public boolean isSetWsPs9X9Low() {
        return true;
    }

    /**
     * Gets the value of the wsPs9X9High property.
     * 
     */
    public int getWsPs9X9High() {
        return wsPs9X9High;
    }

    /**
     * Sets the value of the wsPs9X9High property.
     * 
     */
    public void setWsPs9X9High(int value) {
        this.wsPs9X9High = value;
    }

    public boolean isSetWsPs9X9High() {
        return true;
    }

    /**
     * Gets the value of the wsPs9X9Max property.
     * 
     */
    public int getWsPs9X9Max() {
        return wsPs9X9Max;
    }

    /**
     * Sets the value of the wsPs9X9Max property.
     * 
     */
    public void setWsPs9X9Max(int value) {
        this.wsPs9X9Max = value;
    }

    public boolean isSetWsPs9X9Max() {
        return true;
    }

}

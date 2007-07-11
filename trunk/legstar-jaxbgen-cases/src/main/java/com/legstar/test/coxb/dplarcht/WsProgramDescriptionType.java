//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.11 at 01:37:31 PM CEST 
//


package com.legstar.test.coxb.dplarcht;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsProgramDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsProgramDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsProgramStart">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsProgramName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsProgramType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsProgramLanguage">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsProgramLength">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="-999999999"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsProgramUsecount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="-999999999"/>
 *               &lt;maxInclusive value="999999999"/>
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
@XmlType(name = "WsProgramDescriptionType", propOrder = {
    "wsProgramStart",
    "wsProgramName",
    "wsProgramType",
    "wsProgramLanguage",
    "wsProgramLength",
    "wsProgramUsecount"
})
public class WsProgramDescriptionType {

    @XmlElement(name = "WsProgramStart", required = true)
    @CobolElement(cobolName = "WS-PROGRAM-START", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, byteLength = 8, picture = "X(8)", usage = "DISPLAY", srceLine = 60)
    protected String wsProgramStart;
    @XmlElement(name = "WsProgramName", required = true)
    @CobolElement(cobolName = "WS-PROGRAM-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, byteLength = 8, picture = "X(8)", usage = "DISPLAY", srceLine = 61)
    protected String wsProgramName;
    @XmlElement(name = "WsProgramType")
    @CobolElement(cobolName = "WS-PROGRAM-TYPE", type = CobolType.BINARY_ITEM, levelNumber = 5, byteLength = 4, isSigned = false, totalDigits = 8, picture = "9(8)", usage = "BINARY", srceLine = 62)
    protected long wsProgramType;
    @XmlElement(name = "WsProgramLanguage")
    @CobolElement(cobolName = "WS-PROGRAM-LANGUAGE", type = CobolType.BINARY_ITEM, levelNumber = 5, byteLength = 4, isSigned = false, totalDigits = 8, picture = "9(8)", usage = "BINARY", srceLine = 63)
    protected long wsProgramLanguage;
    @XmlElement(name = "WsProgramLength")
    @CobolElement(cobolName = "WS-PROGRAM-LENGTH", type = CobolType.BINARY_ITEM, levelNumber = 5, byteLength = 4, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "BINARY", srceLine = 64)
    protected int wsProgramLength;
    @XmlElement(name = "WsProgramUsecount")
    @CobolElement(cobolName = "WS-PROGRAM-USECOUNT", type = CobolType.BINARY_ITEM, levelNumber = 5, byteLength = 4, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "BINARY", srceLine = 65)
    protected int wsProgramUsecount;

    /**
     * Gets the value of the wsProgramStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsProgramStart() {
        return wsProgramStart;
    }

    /**
     * Sets the value of the wsProgramStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsProgramStart(String value) {
        this.wsProgramStart = value;
    }

    public boolean isSetWsProgramStart() {
        return (this.wsProgramStart!= null);
    }

    /**
     * Gets the value of the wsProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsProgramName() {
        return wsProgramName;
    }

    /**
     * Sets the value of the wsProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsProgramName(String value) {
        this.wsProgramName = value;
    }

    public boolean isSetWsProgramName() {
        return (this.wsProgramName!= null);
    }

    /**
     * Gets the value of the wsProgramType property.
     * 
     */
    public long getWsProgramType() {
        return wsProgramType;
    }

    /**
     * Sets the value of the wsProgramType property.
     * 
     */
    public void setWsProgramType(long value) {
        this.wsProgramType = value;
    }

    public boolean isSetWsProgramType() {
        return true;
    }

    /**
     * Gets the value of the wsProgramLanguage property.
     * 
     */
    public long getWsProgramLanguage() {
        return wsProgramLanguage;
    }

    /**
     * Sets the value of the wsProgramLanguage property.
     * 
     */
    public void setWsProgramLanguage(long value) {
        this.wsProgramLanguage = value;
    }

    public boolean isSetWsProgramLanguage() {
        return true;
    }

    /**
     * Gets the value of the wsProgramLength property.
     * 
     */
    public int getWsProgramLength() {
        return wsProgramLength;
    }

    /**
     * Sets the value of the wsProgramLength property.
     * 
     */
    public void setWsProgramLength(int value) {
        this.wsProgramLength = value;
    }

    public boolean isSetWsProgramLength() {
        return true;
    }

    /**
     * Gets the value of the wsProgramUsecount property.
     * 
     */
    public int getWsProgramUsecount() {
        return wsProgramUsecount;
    }

    /**
     * Sets the value of the wsProgramUsecount property.
     * 
     */
    public void setWsProgramUsecount(int value) {
        this.wsProgramUsecount = value;
    }

    public boolean isSetWsProgramUsecount() {
        return true;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.13 at 09:00:27 AM CEST 
//


package com.legstar.test.coxb.binpkdus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for LsCompatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LsCompatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LsP9X1Null">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsP9X1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsP9X2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsP9X7">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsP9X18">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999999999999"/>
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
@XmlType(name = "LsCompatType", propOrder = {
    "lsP9X1Null",
    "lsP9X1",
    "lsP9X2",
    "lsP9X7",
    "lsP9X18"
})
public class LsCompatType {

    @XmlElement(name = "LsP9X1Null")
    @CobolElement(cobolName = "LS-P9X1-NULL", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, byteLength = 1, isSigned = false, totalDigits = 1, picture = "9(1)", usage = "PACKED-DECIMAL", srceLine = 58)
    protected int lsP9X1Null;
    @XmlElement(name = "LsP9X1")
    @CobolElement(cobolName = "LS-P9X1", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, byteLength = 1, isSigned = false, totalDigits = 1, picture = "9(1)", usage = "PACKED-DECIMAL", srceLine = 59)
    protected int lsP9X1;
    @XmlElement(name = "LsP9X2")
    @CobolElement(cobolName = "LS-P9X2", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, byteLength = 2, isSigned = false, totalDigits = 2, picture = "9(2)", usage = "PACKED-DECIMAL", srceLine = 60)
    protected int lsP9X2;
    @XmlElement(name = "LsP9X7")
    @CobolElement(cobolName = "LS-P9X7", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, byteLength = 4, isSigned = false, totalDigits = 7, picture = "9(7)", usage = "PACKED-DECIMAL", srceLine = 61)
    protected long lsP9X7;
    @XmlElement(name = "LsP9X18")
    @CobolElement(cobolName = "LS-P9X18", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, byteLength = 10, isSigned = false, totalDigits = 18, picture = "9(18)", usage = "PACKED-DECIMAL", srceLine = 62)
    protected long lsP9X18;

    /**
     * Gets the value of the lsP9X1Null property.
     * 
     */
    public int getLsP9X1Null() {
        return lsP9X1Null;
    }

    /**
     * Sets the value of the lsP9X1Null property.
     * 
     */
    public void setLsP9X1Null(int value) {
        this.lsP9X1Null = value;
    }

    public boolean isSetLsP9X1Null() {
        return true;
    }

    /**
     * Gets the value of the lsP9X1 property.
     * 
     */
    public int getLsP9X1() {
        return lsP9X1;
    }

    /**
     * Sets the value of the lsP9X1 property.
     * 
     */
    public void setLsP9X1(int value) {
        this.lsP9X1 = value;
    }

    public boolean isSetLsP9X1() {
        return true;
    }

    /**
     * Gets the value of the lsP9X2 property.
     * 
     */
    public int getLsP9X2() {
        return lsP9X2;
    }

    /**
     * Sets the value of the lsP9X2 property.
     * 
     */
    public void setLsP9X2(int value) {
        this.lsP9X2 = value;
    }

    public boolean isSetLsP9X2() {
        return true;
    }

    /**
     * Gets the value of the lsP9X7 property.
     * 
     */
    public long getLsP9X7() {
        return lsP9X7;
    }

    /**
     * Sets the value of the lsP9X7 property.
     * 
     */
    public void setLsP9X7(long value) {
        this.lsP9X7 = value;
    }

    public boolean isSetLsP9X7() {
        return true;
    }

    /**
     * Gets the value of the lsP9X18 property.
     * 
     */
    public long getLsP9X18() {
        return lsP9X18;
    }

    /**
     * Sets the value of the lsP9X18 property.
     * 
     */
    public void setLsP9X18(long value) {
        this.lsP9X18 = value;
    }

    public boolean isSetLsP9X18() {
        return true;
    }

}

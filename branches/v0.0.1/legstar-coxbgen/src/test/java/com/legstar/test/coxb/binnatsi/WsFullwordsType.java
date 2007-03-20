/*******************************************************************************
 * LegStar legacy Web-enablement .
 * Copyright (C)  2007 LegSem
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301  USA
 * 
 *     
 *****************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.26 at 06:16:42 PM CET 
//


package com.legstar.test.coxb.binnatsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


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
    @CobolElement(cobolName = "WS-PS9X9-MIN", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 9)
    protected int wsPs9X9Min;
    @XmlElement(name = "WsPs9X9Low")
    @CobolElement(cobolName = "WS-PS9X9-LOW", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 9)
    protected int wsPs9X9Low;
    @XmlElement(name = "WsPs9X9High")
    @CobolElement(cobolName = "WS-PS9X9-HIGH", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 9)
    protected int wsPs9X9High;
    @XmlElement(name = "WsPs9X9Max")
    @CobolElement(cobolName = "WS-PS9X9-MAX", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 9)
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

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
// Generated on: 2007.01.26 at 06:16:43 PM CET 
//


package com.legstar.test.coxb.binnatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for Filler55Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filler55Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsPs9X4Dis1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{5}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X9Dis1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{10}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X18Dis1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{20}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X4Dis2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{5}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X9Dis2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{10}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsPs9X18Dis2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d]\d{20}"/>
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
@XmlType(name = "Filler55Type", propOrder = {
    "wsPs9X4Dis1",
    "wsPs9X9Dis1",
    "wsPs9X18Dis1",
    "wsPs9X4Dis2",
    "wsPs9X9Dis2",
    "wsPs9X18Dis2"
})
public class Filler55Type {

    @XmlElement(name = "WsPs9X4Dis1", required = true)
    @CobolElement(cobolName = "WS-PS9X4-DIS-1", type = CobolType.NUMERIC_EDITED_ITEM, byteLength = 6, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 5)
    protected String wsPs9X4Dis1;
    @XmlElement(name = "WsPs9X9Dis1", required = true)
    @CobolElement(cobolName = "WS-PS9X9-DIS-1", type = CobolType.NUMERIC_EDITED_ITEM, byteLength = 11, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 10)
    protected String wsPs9X9Dis1;
    @XmlElement(name = "WsPs9X18Dis1", required = true)
    @CobolElement(cobolName = "WS-PS9X18-DIS-1", type = CobolType.NUMERIC_EDITED_ITEM, byteLength = 21, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 20)
    protected String wsPs9X18Dis1;
    @XmlElement(name = "WsPs9X4Dis2", required = true)
    @CobolElement(cobolName = "WS-PS9X4-DIS-2", type = CobolType.NUMERIC_EDITED_ITEM, byteLength = 6, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 5)
    protected String wsPs9X4Dis2;
    @XmlElement(name = "WsPs9X9Dis2", required = true)
    @CobolElement(cobolName = "WS-PS9X9-DIS-2", type = CobolType.NUMERIC_EDITED_ITEM, byteLength = 11, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 10)
    protected String wsPs9X9Dis2;
    @XmlElement(name = "WsPs9X18Dis2", required = true)
    @CobolElement(cobolName = "WS-PS9X18-DIS-2", type = CobolType.NUMERIC_EDITED_ITEM, byteLength = 21, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 20)
    protected String wsPs9X18Dis2;

    /**
     * Gets the value of the wsPs9X4Dis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X4Dis1() {
        return wsPs9X4Dis1;
    }

    /**
     * Sets the value of the wsPs9X4Dis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X4Dis1(String value) {
        this.wsPs9X4Dis1 = value;
    }

    public boolean isSetWsPs9X4Dis1() {
        return (this.wsPs9X4Dis1 != null);
    }

    /**
     * Gets the value of the wsPs9X9Dis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X9Dis1() {
        return wsPs9X9Dis1;
    }

    /**
     * Sets the value of the wsPs9X9Dis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X9Dis1(String value) {
        this.wsPs9X9Dis1 = value;
    }

    public boolean isSetWsPs9X9Dis1() {
        return (this.wsPs9X9Dis1 != null);
    }

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
     * Gets the value of the wsPs9X4Dis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X4Dis2() {
        return wsPs9X4Dis2;
    }

    /**
     * Sets the value of the wsPs9X4Dis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X4Dis2(String value) {
        this.wsPs9X4Dis2 = value;
    }

    public boolean isSetWsPs9X4Dis2() {
        return (this.wsPs9X4Dis2 != null);
    }

    /**
     * Gets the value of the wsPs9X9Dis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X9Dis2() {
        return wsPs9X9Dis2;
    }

    /**
     * Sets the value of the wsPs9X9Dis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X9Dis2(String value) {
        this.wsPs9X9Dis2 = value;
    }

    public boolean isSetWsPs9X9Dis2() {
        return (this.wsPs9X9Dis2 != null);
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

}

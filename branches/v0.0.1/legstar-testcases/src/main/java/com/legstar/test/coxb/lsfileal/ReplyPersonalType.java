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
// Generated on: 2007.01.26 at 06:17:00 PM CET 
//


package com.legstar.test.coxb.lsfileal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for ReplyPersonalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplyPersonalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReplyName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReplyAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReplyPhone">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
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
@XmlType(name = "ReplyPersonalType", propOrder = {
    "replyName",
    "replyAddress",
    "replyPhone"
})
public class ReplyPersonalType {

    @XmlElement(name = "ReplyName", required = true)
    @CobolElement(cobolName = "REPLY-NAME", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 20, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String replyName;
    @XmlElement(name = "ReplyAddress", required = true)
    @CobolElement(cobolName = "REPLY-ADDRESS", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 20, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String replyAddress;
    @XmlElement(name = "ReplyPhone", required = true)
    @CobolElement(cobolName = "REPLY-PHONE", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String replyPhone;

    /**
     * Gets the value of the replyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyName() {
        return replyName;
    }

    /**
     * Sets the value of the replyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyName(String value) {
        this.replyName = value;
    }

    public boolean isSetReplyName() {
        return (this.replyName!= null);
    }

    /**
     * Gets the value of the replyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyAddress() {
        return replyAddress;
    }

    /**
     * Sets the value of the replyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyAddress(String value) {
        this.replyAddress = value;
    }

    public boolean isSetReplyAddress() {
        return (this.replyAddress!= null);
    }

    /**
     * Gets the value of the replyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyPhone() {
        return replyPhone;
    }

    /**
     * Sets the value of the replyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyPhone(String value) {
        this.replyPhone = value;
    }

    public boolean isSetReplyPhone() {
        return (this.replyPhone!= null);
    }

}
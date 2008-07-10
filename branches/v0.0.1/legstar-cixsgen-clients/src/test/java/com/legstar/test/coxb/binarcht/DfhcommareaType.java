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

package com.legstar.test.coxb.binarcht;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="LsUnsignedNative" type="{http://legstar.com/test/coxb/binarcht}LsUnsignedNativeType"/>
 *         &lt;element name="LsSignedNative" type="{http://legstar.com/test/coxb/binarcht}LsSignedNativeType"/>
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
    "lsUnsignedNative",
    "lsSignedNative"
})
public class DfhcommareaType {

    @XmlElement(name = "LsUnsignedNative", required = true)
    protected LsUnsignedNativeType lsUnsignedNative;
    @XmlElement(name = "LsSignedNative", required = true)
    protected LsSignedNativeType lsSignedNative;

    /**
     * Gets the value of the lsUnsignedNative property.
     * 
     * @return
     *     possible object is
     *     {@link LsUnsignedNativeType }
     *     
     */
    public LsUnsignedNativeType getLsUnsignedNative() {
        return lsUnsignedNative;
    }

    /**
     * Sets the value of the lsUnsignedNative property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsUnsignedNativeType }
     *     
     */
    public void setLsUnsignedNative(LsUnsignedNativeType value) {
        this.lsUnsignedNative = value;
    }

    /**
     * Gets the value of the lsSignedNative property.
     * 
     * @return
     *     possible object is
     *     {@link LsSignedNativeType }
     *     
     */
    public LsSignedNativeType getLsSignedNative() {
        return lsSignedNative;
    }

    /**
     * Sets the value of the lsSignedNative property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsSignedNativeType }
     *     
     */
    public void setLsSignedNative(LsSignedNativeType value) {
        this.lsSignedNative = value;
    }

}
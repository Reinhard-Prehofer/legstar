/*******************************************************************************
 *  LegStar legacy Web-enablement .
 *  Copyright (C) 2007 LegSem
 *  
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *  
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *   
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 *  02110-1301  USA
 *  
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.26 at 06:17:06 PM CET 
//


package com.legstar.test.coxb.redmulti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for Filler20Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filler20Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeedHours">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SeedMinutes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SeedSeconds">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SeedHundredth">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
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
@XmlType(name = "Filler20Type", propOrder = {
    "seedHours",
    "seedMinutes",
    "seedSeconds",
    "seedHundredth"
})
public class Filler20Type {

    @XmlElement(name = "SeedHours")
    @CobolElement(cobolName = "SEED-HOURS", type = CobolType.ZONED_DECIMAL_ITEM, byteLength = 2, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 2)
    protected int seedHours;
    @XmlElement(name = "SeedMinutes")
    @CobolElement(cobolName = "SEED-MINUTES", type = CobolType.ZONED_DECIMAL_ITEM, byteLength = 2, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 2)
    protected int seedMinutes;
    @XmlElement(name = "SeedSeconds")
    @CobolElement(cobolName = "SEED-SECONDS", type = CobolType.ZONED_DECIMAL_ITEM, byteLength = 2, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 2)
    protected int seedSeconds;
    @XmlElement(name = "SeedHundredth")
    @CobolElement(cobolName = "SEED-HUNDREDTH", type = CobolType.ZONED_DECIMAL_ITEM, byteLength = 2, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 2)
    protected int seedHundredth;

    /**
     * Gets the value of the seedHours property.
     * 
     */
    public int getSeedHours() {
        return seedHours;
    }

    /**
     * Sets the value of the seedHours property.
     * 
     */
    public void setSeedHours(int value) {
        this.seedHours = value;
    }

    public boolean isSetSeedHours() {
        return true;
    }

    /**
     * Gets the value of the seedMinutes property.
     * 
     */
    public int getSeedMinutes() {
        return seedMinutes;
    }

    /**
     * Sets the value of the seedMinutes property.
     * 
     */
    public void setSeedMinutes(int value) {
        this.seedMinutes = value;
    }

    public boolean isSetSeedMinutes() {
        return true;
    }

    /**
     * Gets the value of the seedSeconds property.
     * 
     */
    public int getSeedSeconds() {
        return seedSeconds;
    }

    /**
     * Sets the value of the seedSeconds property.
     * 
     */
    public void setSeedSeconds(int value) {
        this.seedSeconds = value;
    }

    public boolean isSetSeedSeconds() {
        return true;
    }

    /**
     * Gets the value of the seedHundredth property.
     * 
     */
    public int getSeedHundredth() {
        return seedHundredth;
    }

    /**
     * Sets the value of the seedHundredth property.
     * 
     */
    public void setSeedHundredth(int value) {
        this.seedHundredth = value;
    }

    public boolean isSetSeedHundredth() {
        return true;
    }

}

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

package com.legstar.test.coxb.dplarcht;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LsItemsArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LsItemsArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LsFilesData" type="{http://legstar.com/test/coxb/dplarcht}LsFilesDataType" minOccurs="0"/>
 *         &lt;element name="LsProgramsData" type="{http://legstar.com/test/coxb/dplarcht}LsProgramsDataType" minOccurs="0"/>
 *         &lt;element name="LsTransactionsData" type="{http://legstar.com/test/coxb/dplarcht}LsTransactionsDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsItemsArrayType", propOrder = {
    "lsFilesData",
    "lsProgramsData",
    "lsTransactionsData"
})
public class LsItemsArrayType {

    @XmlElement(name = "LsFilesData")
    protected LsFilesDataType lsFilesData;
    @XmlElement(name = "LsProgramsData")
    protected LsProgramsDataType lsProgramsData;
    @XmlElement(name = "LsTransactionsData")
    protected LsTransactionsDataType lsTransactionsData;

    /**
     * Gets the value of the lsFilesData property.
     * 
     * @return
     *     possible object is
     *     {@link LsFilesDataType }
     *     
     */
    public LsFilesDataType getLsFilesData() {
        return lsFilesData;
    }

    /**
     * Sets the value of the lsFilesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsFilesDataType }
     *     
     */
    public void setLsFilesData(LsFilesDataType value) {
        this.lsFilesData = value;
    }

    /**
     * Gets the value of the lsProgramsData property.
     * 
     * @return
     *     possible object is
     *     {@link LsProgramsDataType }
     *     
     */
    public LsProgramsDataType getLsProgramsData() {
        return lsProgramsData;
    }

    /**
     * Sets the value of the lsProgramsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsProgramsDataType }
     *     
     */
    public void setLsProgramsData(LsProgramsDataType value) {
        this.lsProgramsData = value;
    }

    /**
     * Gets the value of the lsTransactionsData property.
     * 
     * @return
     *     possible object is
     *     {@link LsTransactionsDataType }
     *     
     */
    public LsTransactionsDataType getLsTransactionsData() {
        return lsTransactionsData;
    }

    /**
     * Sets the value of the lsTransactionsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsTransactionsDataType }
     *     
     */
    public void setLsTransactionsData(LsTransactionsDataType value) {
        this.lsTransactionsData = value;
    }

}
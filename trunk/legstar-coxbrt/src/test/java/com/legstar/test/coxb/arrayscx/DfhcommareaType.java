//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.23 at 05:00:19 PM CEST 
//


package com.legstar.test.coxb.arrayscx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


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
 *         &lt;element name="TableThree" type="{http://legstar.com/test/coxb/arrayscx}TableThreeType"/>
 *         &lt;element name="TableRedef" type="{http://legstar.com/test/coxb/arrayscx}TableRedefType" maxOccurs="3" minOccurs="3"/>
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
    "tableThree",
    "tableRedef"
})
public class DfhcommareaType {

    @XmlElement(name = "TableThree", required = true)
    @CobolElement(cobolName = "TABLE-THREE", type = CobolType.GROUP_ITEM, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected TableThreeType tableThree;
    @XmlElement(name = "TableRedef", required = true)
    @CobolElement(cobolName = "TABLE-REDEF", type = CobolType.GROUP_ITEM, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, minOccurs = 3, maxOccurs = 3)
    protected List<TableRedefType> tableRedef;

    /**
     * Gets the value of the tableThree property.
     * 
     * @return
     *     possible object is
     *     {@link TableThreeType }
     *     
     */
    public TableThreeType getTableThree() {
        return tableThree;
    }

    /**
     * Sets the value of the tableThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableThreeType }
     *     
     */
    public void setTableThree(TableThreeType value) {
        this.tableThree = value;
    }

    public boolean isSetTableThree() {
        return (this.tableThree!= null);
    }

    /**
     * Gets the value of the tableRedef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableRedef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableRedef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableRedefType }
     * 
     * 
     */
    public List<TableRedefType> getTableRedef() {
        if (tableRedef == null) {
            tableRedef = new ArrayList<TableRedefType>();
        }
        return this.tableRedef;
    }

    public boolean isSetTableRedef() {
        return ((this.tableRedef!= null)&&(!this.tableRedef.isEmpty()));
    }

    public void unsetTableRedef() {
        this.tableRedef = null;
    }

}

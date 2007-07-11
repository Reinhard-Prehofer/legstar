//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.11 at 02:03:49 PM CEST 
//


package com.legstar.test.coxb.arrayssm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for TableComplex2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableComplex2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElementComplex2" maxOccurs="4" minOccurs="4">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="7"/>
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
@XmlType(name = "TableComplex2Type", propOrder = {
    "elementComplex2"
})
public class TableComplex2Type {

    @XmlElement(name = "ElementComplex2", required = true)
    @CobolElement(cobolName = "ELEMENT-COMPLEX-2", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 10, byteLength = 7, minOccurs = 4, maxOccurs = 4, picture = "X(7)", usage = "DISPLAY", srceLine = 36)
    protected List<String> elementComplex2;

    /**
     * Gets the value of the elementComplex2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementComplex2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementComplex2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElementComplex2() {
        if (elementComplex2 == null) {
            elementComplex2 = new ArrayList<String>();
        }
        return this.elementComplex2;
    }

    public boolean isSetElementComplex2() {
        return ((this.elementComplex2 != null)&&(!this.elementComplex2 .isEmpty()));
    }

    public void unsetElementComplex2() {
        this.elementComplex2 = null;
    }

}

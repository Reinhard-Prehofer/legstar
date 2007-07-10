//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.09 at 12:58:22 PM CEST 
//


package com.legstar.test.coxb.arrayscx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for ElementTwoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementTwoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElementThree" maxOccurs="2" minOccurs="2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
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
@XmlType(name = "ElementTwoType", propOrder = {
    "elementThree"
})
public class ElementTwoType {

    @XmlElement(name = "ElementThree", required = true)
    @CobolElement(cobolName = "ELEMENT-THREE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 20, byteLength = 3, minOccurs = 2, maxOccurs = 2, picture = "X(3)", usage = "DISPLAY", srceLine = 32)
    protected List<String> elementThree;

    /**
     * Gets the value of the elementThree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementThree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementThree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElementThree() {
        if (elementThree == null) {
            elementThree = new ArrayList<String>();
        }
        return this.elementThree;
    }

    public boolean isSetElementThree() {
        return ((this.elementThree!= null)&&(!this.elementThree.isEmpty()));
    }

    public void unsetElementThree() {
        this.elementThree = null;
    }

}

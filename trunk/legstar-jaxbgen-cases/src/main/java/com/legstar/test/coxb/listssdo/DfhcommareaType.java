//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.09 at 12:58:22 PM CEST 
//


package com.legstar.test.coxb.listssdo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


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
 *         &lt;element name="ListOdo" maxOccurs="100">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
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
@XmlType(name = "DfhcommareaType", propOrder = {
    "listOdo"
})
public class DfhcommareaType {

    @XmlElement(name = "ListOdo", required = true)
    @CobolElement(cobolName = "LIST-ODO", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, byteLength = 5, minOccurs = 1, maxOccurs = 100, picture = "X(5)", usage = "DISPLAY", srceLine = 28)
    protected List<String> listOdo;

    /**
     * Gets the value of the listOdo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOdo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOdo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOdo() {
        if (listOdo == null) {
            listOdo = new ArrayList<String>();
        }
        return this.listOdo;
    }

    public boolean isSetListOdo() {
        return ((this.listOdo!= null)&&(!this.listOdo.isEmpty()));
    }

    public void unsetListOdo() {
        this.listOdo = null;
    }

}

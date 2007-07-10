//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.09 at 12:58:22 PM CEST 
//


package com.legstar.test.coxb.lsfileal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Filler65Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filler65Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReplyItemscount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReplyItem" type="{http://legstar.com/test/coxb/lsfileal}ReplyItemType" maxOccurs="100"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filler65Type", propOrder = {
    "replyItemscount",
    "replyItem"
})
public class Filler65Type {

    @XmlElement(name = "ReplyItemscount")
    @CobolElement(cobolName = "REPLY-ITEMSCOUNT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 10, byteLength = 5, isSigned = false, totalDigits = 8, isODOObject = true, picture = "9(8)", usage = "PACKED-DECIMAL", srceLine = 66)
    protected long replyItemscount;
    @XmlElement(name = "ReplyItem", required = true)
    @CobolElement(cobolName = "REPLY-ITEM", type = CobolType.GROUP_ITEM, levelNumber = 10, minOccurs = 1, maxOccurs = 100, dependingOn = "REPLY-ITEMSCOUNT", srceLine = 68)
    protected List<ReplyItemType> replyItem;

    /**
     * Gets the value of the replyItemscount property.
     * 
     */
    public long getReplyItemscount() {
        return replyItemscount;
    }

    /**
     * Sets the value of the replyItemscount property.
     * 
     */
    public void setReplyItemscount(long value) {
        this.replyItemscount = value;
    }

    public boolean isSetReplyItemscount() {
        return true;
    }

    /**
     * Gets the value of the replyItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replyItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplyItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplyItemType }
     * 
     * 
     */
    public List<ReplyItemType> getReplyItem() {
        if (replyItem == null) {
            replyItem = new ArrayList<ReplyItemType>();
        }
        return this.replyItem;
    }

    public boolean isSetReplyItem() {
        return ((this.replyItem!= null)&&(!this.replyItem.isEmpty()));
    }

    public void unsetReplyItem() {
        this.replyItem = null;
    }

}

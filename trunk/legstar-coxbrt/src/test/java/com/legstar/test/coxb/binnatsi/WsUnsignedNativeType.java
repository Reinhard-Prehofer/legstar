//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.23 at 05:00:22 PM CEST 
//


package com.legstar.test.coxb.binnatsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for WsUnsignedNativeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsUnsignedNativeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsHalfwords" type="{http://legstar.com/test/coxb/binnatsi}WsHalfwordsType"/>
 *         &lt;element name="WsFullwords" type="{http://legstar.com/test/coxb/binnatsi}WsFullwordsType"/>
 *         &lt;element name="WsDoublewords" type="{http://legstar.com/test/coxb/binnatsi}WsDoublewordsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsUnsignedNativeType", propOrder = {
    "wsHalfwords",
    "wsFullwords",
    "wsDoublewords"
})
public class WsUnsignedNativeType {

    @XmlElement(name = "WsHalfwords", required = true)
    @CobolElement(cobolName = "WS-HALFWORDS", type = CobolType.GROUP_ITEM, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected WsHalfwordsType wsHalfwords;
    @XmlElement(name = "WsFullwords", required = true)
    @CobolElement(cobolName = "WS-FULLWORDS", type = CobolType.GROUP_ITEM, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected WsFullwordsType wsFullwords;
    @XmlElement(name = "WsDoublewords", required = true)
    @CobolElement(cobolName = "WS-DOUBLEWORDS", type = CobolType.GROUP_ITEM, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected WsDoublewordsType wsDoublewords;

    /**
     * Gets the value of the wsHalfwords property.
     * 
     * @return
     *     possible object is
     *     {@link WsHalfwordsType }
     *     
     */
    public WsHalfwordsType getWsHalfwords() {
        return wsHalfwords;
    }

    /**
     * Sets the value of the wsHalfwords property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsHalfwordsType }
     *     
     */
    public void setWsHalfwords(WsHalfwordsType value) {
        this.wsHalfwords = value;
    }

    public boolean isSetWsHalfwords() {
        return (this.wsHalfwords!= null);
    }

    /**
     * Gets the value of the wsFullwords property.
     * 
     * @return
     *     possible object is
     *     {@link WsFullwordsType }
     *     
     */
    public WsFullwordsType getWsFullwords() {
        return wsFullwords;
    }

    /**
     * Sets the value of the wsFullwords property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsFullwordsType }
     *     
     */
    public void setWsFullwords(WsFullwordsType value) {
        this.wsFullwords = value;
    }

    public boolean isSetWsFullwords() {
        return (this.wsFullwords!= null);
    }

    /**
     * Gets the value of the wsDoublewords property.
     * 
     * @return
     *     possible object is
     *     {@link WsDoublewordsType }
     *     
     */
    public WsDoublewordsType getWsDoublewords() {
        return wsDoublewords;
    }

    /**
     * Sets the value of the wsDoublewords property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDoublewordsType }
     *     
     */
    public void setWsDoublewords(WsDoublewordsType value) {
        this.wsDoublewords = value;
    }

    public boolean isSetWsDoublewords() {
        return (this.wsDoublewords!= null);
    }

}

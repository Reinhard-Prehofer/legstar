//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.16 at 01:26:10 PM CET 
//


package com.legstar.test.coxb.rdef128;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Alt2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Alt2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0"/>
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
@XmlType(name = "Alt2", propOrder = {
    "c"
})
public class Alt2
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @CobolElement(cobolName = "C", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = false, totalDigits = 7, fractionDigits = 2, picture = "9(5)V99", usage = "PACKED-DECIMAL", srceLine = 5)
    protected BigDecimal c;

    /**
     * Gets the value of the c property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setC(BigDecimal value) {
        this.c = value;
    }

    public boolean isSetC() {
        return (this.c!= null);
    }

}
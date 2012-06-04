
package com.legstar.test.cixs.charsets;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "CharsetsFaultInfo", targetNamespace = "http://cixs.test.legstar.com/charsets")
public class CharsetsFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CharsetsFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public CharsetsFault(String message, CharsetsFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public CharsetsFault(String message, CharsetsFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.charsets.CharsetsFaultInfo
     */
    public CharsetsFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

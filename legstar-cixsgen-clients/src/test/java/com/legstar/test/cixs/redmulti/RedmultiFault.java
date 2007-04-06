
package com.legstar.test.cixs.redmulti;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.1-01/26/2007 12:09 AM(kohsuke)-RC2
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "RedmultiFaultInfo", targetNamespace = "http://cixs.test.legstar.com/redmulti")
public class RedmultiFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RedmultiFaultInfo faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RedmultiFault(String message, RedmultiFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param message
     * @param cause
     */
    public RedmultiFault(String message, RedmultiFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.redmulti.RedmultiFaultInfo
     */
    public RedmultiFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

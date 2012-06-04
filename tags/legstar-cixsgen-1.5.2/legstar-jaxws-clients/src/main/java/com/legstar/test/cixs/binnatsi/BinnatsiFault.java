
package com.legstar.test.cixs.binnatsi;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "BinnatsiFaultInfo", targetNamespace = "http://cixs.test.legstar.com/binnatsi")
public class BinnatsiFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BinnatsiFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public BinnatsiFault(String message, BinnatsiFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public BinnatsiFault(String message, BinnatsiFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.binnatsi.BinnatsiFaultInfo
     */
    public BinnatsiFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

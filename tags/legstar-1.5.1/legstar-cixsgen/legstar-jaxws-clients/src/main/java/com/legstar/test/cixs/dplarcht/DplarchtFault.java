
package com.legstar.test.cixs.dplarcht;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "DplarchtFaultInfo", targetNamespace = "http://cixs.test.legstar.com/dplarcht")
public class DplarchtFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DplarchtFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DplarchtFault(String message, DplarchtFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DplarchtFault(String message, DplarchtFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.dplarcht.DplarchtFaultInfo
     */
    public DplarchtFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
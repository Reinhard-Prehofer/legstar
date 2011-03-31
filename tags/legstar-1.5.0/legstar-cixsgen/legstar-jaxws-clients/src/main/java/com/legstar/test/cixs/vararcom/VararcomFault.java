
package com.legstar.test.cixs.vararcom;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "VararcomFaultInfo", targetNamespace = "http://cixs.test.legstar.com/vararcom")
public class VararcomFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private VararcomFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public VararcomFault(String message, VararcomFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public VararcomFault(String message, VararcomFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.vararcom.VararcomFaultInfo
     */
    public VararcomFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

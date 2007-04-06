
package com.legstar.test.cixs.redinout;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.1-01/26/2007 12:09 AM(kohsuke)-RC2
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "RedinoutFaultInfo", targetNamespace = "http://cixs.test.legstar.com/redinout")
public class RedinoutFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RedinoutFaultInfo faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RedinoutFault(String message, RedinoutFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param message
     * @param cause
     */
    public RedinoutFault(String message, RedinoutFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.redinout.RedinoutFaultInfo
     */
    public RedinoutFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

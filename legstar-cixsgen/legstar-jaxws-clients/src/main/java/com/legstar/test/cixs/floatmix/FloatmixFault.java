
package com.legstar.test.cixs.floatmix;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "FloatmixFaultInfo", targetNamespace = "http://cixs.test.legstar.com/floatmix")
public class FloatmixFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FloatmixFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public FloatmixFault(String message, FloatmixFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public FloatmixFault(String message, FloatmixFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.floatmix.FloatmixFaultInfo
     */
    public FloatmixFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
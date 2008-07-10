
package com.legstar.test.cixs.vararcom;
import javax.xml.ws.WebFault;

/**
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by CIXS version 1.0.
 * 2007-02-06T14:31:01.781+01:00
 */

@WebFault(name = "VararcomFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/vararcom")
public class VararcomFault
    extends Exception {

    /** Default serialVersionUID.  */
	private static final long serialVersionUID = 1L;
	
    /** Java type that goes as soapenv:Fault detail element. */
    private VararcomFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public VararcomFault(
    	final String message,
    	final VararcomFaultInfo fault) {
    	
        super(message);
        this.faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public VararcomFault(
        final String message,
        final VararcomFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        this.faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.vararcom.VararcomFaultInfo
     */
    public final VararcomFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
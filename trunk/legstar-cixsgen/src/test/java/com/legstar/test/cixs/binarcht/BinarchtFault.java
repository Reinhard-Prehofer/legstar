
package com.legstar.test.cixs.binarcht;
import javax.xml.ws.WebFault;

/**
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:03.125+02:00
 */

@WebFault(name = "BinarchtFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/binarcht")
public class BinarchtFault
    extends Exception {

    /** Default serialVersionUID.  */
	private static final long serialVersionUID = 1L;
	
    /** Java type that goes as soapenv:Fault detail element. */
    private BinarchtFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public BinarchtFault(
    	final String message,
    	final BinarchtFaultInfo fault) {
    	
        super(message);
        this.faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public BinarchtFault(
        final String message,
        final BinarchtFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        this.faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.binarcht.BinarchtFaultInfo
     */
    public final BinarchtFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

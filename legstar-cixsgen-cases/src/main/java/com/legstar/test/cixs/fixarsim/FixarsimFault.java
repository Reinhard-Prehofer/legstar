
package com.legstar.test.cixs.fixarsim;
import javax.xml.ws.WebFault;

/**
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by CIXS generator.
 * 2007-07-09T13:01:03.375+02:00
 */

@WebFault(name = "FixarsimFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/fixarsim")
public class FixarsimFault
    extends Exception {

    /** Default serialVersionUID.  */
	private static final long serialVersionUID = 1L;
	
    /** Java type that goes as soapenv:Fault detail element. */
    private FixarsimFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public FixarsimFault(
    	final String message,
    	final FixarsimFaultInfo fault) {
    	
        super(message);
        this.faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public FixarsimFault(
        final String message,
        final FixarsimFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        this.faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.fixarsim.FixarsimFaultInfo
     */
    public final FixarsimFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

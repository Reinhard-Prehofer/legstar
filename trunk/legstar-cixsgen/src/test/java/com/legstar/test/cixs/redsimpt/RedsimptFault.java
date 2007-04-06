
package com.legstar.test.cixs.redsimpt;
import javax.xml.ws.WebFault;

/**
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:27.187+02:00
 */

@WebFault(name = "RedsimptFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/redsimpt")
public class RedsimptFault
    extends Exception {

    /** Default serialVersionUID.  */
	private static final long serialVersionUID = 1L;
	
    /** Java type that goes as soapenv:Fault detail element. */
    private RedsimptFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public RedsimptFault(
    	final String message,
    	final RedsimptFaultInfo fault) {
    	
        super(message);
        this.faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public RedsimptFault(
        final String message,
        final RedsimptFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        this.faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.redsimpt.RedsimptFaultInfo
     */
    public final RedsimptFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

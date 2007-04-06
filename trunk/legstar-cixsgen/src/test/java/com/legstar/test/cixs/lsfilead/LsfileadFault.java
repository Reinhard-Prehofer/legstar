
package com.legstar.test.cixs.lsfilead;
import javax.xml.ws.WebFault;

/**
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:17.765+02:00
 */

@WebFault(name = "LsfileadFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/lsfilead")
public class LsfileadFault
    extends Exception {

    /** Default serialVersionUID.  */
	private static final long serialVersionUID = 1L;
	
    /** Java type that goes as soapenv:Fault detail element. */
    private LsfileadFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public LsfileadFault(
    	final String message,
    	final LsfileadFaultInfo fault) {
    	
        super(message);
        this.faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public LsfileadFault(
        final String message,
        final LsfileadFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        this.faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.lsfilead.LsfileadFaultInfo
     */
    public final LsfileadFaultInfo getFaultInfo() {
        return faultInfo;
    }

}


package com.legstar.test.cixs.arrayssm;
import javax.xml.ws.WebFault;

/**
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by CIXS generator.
 * 2007-07-09T13:00:42.562+02:00
 */

@WebFault(name = "ArrayssmFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/arrayssm")
public class ArrayssmFault
    extends Exception {

    /** Default serialVersionUID.  */
	private static final long serialVersionUID = 1L;
	
    /** Java type that goes as soapenv:Fault detail element. */
    private ArrayssmFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public ArrayssmFault(
    	final String message,
    	final ArrayssmFaultInfo fault) {
    	
        super(message);
        this.faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public ArrayssmFault(
        final String message,
        final ArrayssmFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        this.faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.arrayssm.ArrayssmFaultInfo
     */
    public final ArrayssmFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

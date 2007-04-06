
package com.legstar.test.cixs.alltypes;
import javax.xml.ws.WebFault;

/**
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:48.328+02:00
 */

@WebFault(name = "AlltypesFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/alltypes")
public class AlltypesFault
    extends Exception {

    /** Default serialVersionUID.  */
	private static final long serialVersionUID = 1L;
	
    /** Java type that goes as soapenv:Fault detail element. */
    private AlltypesFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public AlltypesFault(
    	final String message,
    	final AlltypesFaultInfo fault) {
    	
        super(message);
        this.faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public AlltypesFault(
        final String message,
        final AlltypesFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        this.faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.alltypes.AlltypesFaultInfo
     */
    public final AlltypesFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

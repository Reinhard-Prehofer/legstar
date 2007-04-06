
package com.legstar.test.cixs.dplarcht;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Configuration parameters that a client can send as a SOAP header element.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:48.468+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DplarchtHostHeader",
         namespace = "http://cixs.test.legstar.com/dplarcht",
         propOrder = {
    "hostUserID", 
	"hostPassword", 
	"hostEndPoint", 
	"hostCharset", 
	"hostTraceMode", 
	"hostRequestID"  
})
public class DplarchtHostHeader {
	
    /** User ID used for host authentication/impersonation. */
    @XmlElement(name = "hostUserID",
                namespace = "http://cixs.test.legstar.com/dplarcht",
                required = false)
    private String hostUserID;

    /** Password used for authentication. */
    @XmlElement(name = "hostPassword",
                namespace = "http://cixs.test.legstar.com/dplarcht",
                required = false)
    private String hostPassword;

    /** The host endpoint identifier. */
    @XmlElement(name = "hostEndPoint",
                namespace = "http://cixs.test.legstar.com/dplarcht",
                required = false)
    private String hostEndPoint;

    /** The host character set. */
    @XmlElement(name = "hostCharset",
                namespace = "http://cixs.test.legstar.com/dplarcht",
                required = false)
    private String hostCharset;

    /** Whether the host should trace this request. */
    @XmlElement(name = "hostTraceMode",
                namespace = "http://cixs.test.legstar.com/dplarcht",
                required = false)
    private boolean hostTraceMode = false;

    /** An identifier for this request (used for tracability). */
    @XmlElement(name = "hostRequestID",
                namespace = "http://cixs.test.legstar.com/dplarcht",
                required = false)
    private String hostRequestID = "dplarcht";

	/** Gets the user ID used for host authentication/impersonation.
	 * @return host user ID
	 */
	public final String getHostUserID() {
		return hostUserID;
	}

	/**
	 * Sets the user ID used for host authentication/impersonation.
	 * @param userID host user ID to set
	 */
	public final void setHostUserID(final String userID) {
		this.hostUserID = userID;
	}

	/** 
	 * Gets the password used for authentication.
	 * @return host user ID
	 */
	public final String getHostPassword() {
		return hostPassword;
	}

	/**
	 * Sets the password used for authentication.
	 * @param password host user ID to set
	 */
	public final void setHostPassword(final String password) {
		this.hostPassword = password;
	}

	/**
	 * Gets the target host identifier.
	 * @return the target host identifier
	 */
	public final String getHostEndPoint() {
		return hostEndPoint;
	}

	/**
	 * Sets the target host identifier.
	 * @param endPoint target host identifier
	 */
	public final void setHostEndPoint(final String endPoint) {
		this.hostEndPoint = endPoint;
	}

	/**
	 * Gets the target host character set.
	 * @return the target host character set
	 */
	public final String getHostCharset() {
		return hostCharset;
	}

	/**
	 * Sets the target host character set.
	 * @param charset target host character set
	 */
	public final void setHostCharset(final String charset) {
		this.hostCharset = charset;
	}

	/**
	 * Gets the host trace mode.
	 * @return the host trace mode
	 */
	public final boolean getHostTraceMode() {
		return hostTraceMode;
	}

	/**
	 * Sets the host trace mode.
	 * @param traceMode the host trace mode
	 */
	public final void setTraceMode(final boolean traceMode) {
		this.hostTraceMode = traceMode;
	}

	/**
	 * Gets the identifier for this request.
	 * @return the request identifier
	 */
	public final String getHostRequestID() {
		return hostRequestID;
	}

	/**
	 * Sets the identifier for this request.
	 * @param requestID the identifier for this request
	 */
	public final void setHostRequestID(final String requestID) {
		this.hostRequestID = requestID;
	}

}


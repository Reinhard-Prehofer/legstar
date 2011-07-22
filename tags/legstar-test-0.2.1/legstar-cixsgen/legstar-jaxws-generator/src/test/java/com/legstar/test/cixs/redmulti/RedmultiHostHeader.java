package com.legstar.test.cixs.redmulti;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * LegStar/Jaxws Component host header.
 * Configuration parameters that a client can send as a SOAP header element. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
 
@XmlRootElement(name = "RedmultiHostHeader")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedmultiHostHeader",
         namespace = "http://cixs.test.legstar.com/redmulti",
         propOrder = {
    "hostUserID", 
    "hostPassword", 
    "hostEndPoint", 
    "hostCharset", 
    "hostTraceMode", 
    "hostRequestID"  
})
public class RedmultiHostHeader {
  
    /** User ID used for host authentication/impersonation. */
    private String hostUserID;

    /** Password used for authentication. */
    private String hostPassword;

    /** The host endpoint identifier. */
    private String hostEndPoint;

    /** The host character set. */
    private String hostCharset;

    /** Whether the host should trace this request. */
    private boolean hostTraceMode = false;

    /** An identifier for this request (used for tracability). */
    private String hostRequestID;

    /** Gets the user ID used for host authentication/impersonation.
     * @return host user ID
     */
    public String getHostUserID() {
        return hostUserID;
    }

    /**
     * Sets the user ID used for host authentication/impersonation.
     * @param userID host user ID to set
     */
    public void setHostUserID(final String userID) {
        this.hostUserID = userID;
    }

    /** 
     * Gets the password used for authentication.
     * @return host user ID
     */
    public String getHostPassword() {
        return hostPassword;
    }

    /**
     * Sets the password used for authentication.
     * @param password host user ID to set
     */
    public void setHostPassword(final String password) {
        this.hostPassword = password;
    }

    /**
     * Gets the target host identifier.
     * @return the target host identifier
     */
    public String getHostEndPoint() {
        return hostEndPoint;
    }

    /**
     * Sets the target host identifier.
     * @param endPoint target host identifier
     */
    public void setHostEndPoint(final String endPoint) {
        this.hostEndPoint = endPoint;
    }

    /**
     * Gets the target host character set.
     * @return the target host character set
     */
    public String getHostCharset() {
        return hostCharset;
    }

    /**
     * Sets the target host character set.
     * @param charset target host character set
     */
    public void setHostCharset(final String charset) {
        this.hostCharset = charset;
    }

    /**
     * Gets the host trace mode.
     * @return the host trace mode
     */
    public boolean getHostTraceMode() {
        return hostTraceMode;
    }

    /**
     * Sets the host trace mode.
     * @param traceMode the host trace mode
     */
    public void setTraceMode(final boolean traceMode) {
        this.hostTraceMode = traceMode;
    }

    /**
     * Gets the identifier for this request.
     * @return the request identifier
     */
    public String getHostRequestID() {
        return hostRequestID;
    }

    /**
     * Sets the identifier for this request.
     * @param requestID the identifier for this request
     */
    public void setHostRequestID(final String requestID) {
        this.hostRequestID = requestID;
    }

}
 

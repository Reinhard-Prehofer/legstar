package com.legstar.csok.client;

import org.apache.commons.configuration.HierarchicalConfiguration;

/**
 * This class represents the parameters that are necessary for a client
 * to sucessfully connect to CICS over sockets.
 */
public class CicsSocketEndpoint {
	
	/** Host IP address. */
	private String mHostIPAddress;

	/** Host IP port. */
	private int mHostIPPort;

	/** Host charset. */
	private String mHostCharset;

	/** Host user ID. */
	private String mHostUserID;

	/** Host password. */
	private String mHostPassword;

	/** Host trace mode. */
	private boolean mHostTraceMode;

	/** Configuration XPath location for IP address. */
	private static final String IP_ADDRESS_CFG = "hostIPAddress";

	/** Configuration XPath location for IP port. */
	private static final String IP_PORT_CFG = "hostIPPort";

	/** Configuration XPath location for host charset. */
	private static final String HOST_CHARSET_CFG = "hostCharset";

	/** Configuration XPath location for host user ID. */
	private static final String HOST_USERID_CFG = "hostUserID";
	
	/** Configuration XPath location for host password. */
	private static final String HOST_PASSWORD_CFG = "hostPassword";
	
	/** Configuration XPath location for host trace mode. */
	private static final String HOST_TRACE_CFG = "hostTraceMode";

	
	/**
	 * No-argument constructor.
	 */
	public CicsSocketEndpoint() {
		
	}
	
	/**
	 * Constructor from a configuration fragment.
	 * @param config a configuration sub hierarchy
	 */
	public CicsSocketEndpoint(final HierarchicalConfiguration config) {
		
		/* Get default connection parameters from the configuration */
		mHostIPAddress = config.getString(IP_ADDRESS_CFG);
		mHostIPPort = config.getInt(IP_PORT_CFG, 0);
		mHostCharset = config.getString(HOST_CHARSET_CFG);
		mHostUserID = config.getString(HOST_USERID_CFG);
		mHostPassword = config.getString(HOST_PASSWORD_CFG);
		mHostTraceMode = config.getBoolean(HOST_TRACE_CFG, false);
	}
	
	/**
	 * Helper to pretty print the endpoint content.
	 * @return formatted endpoint report
	 */
	public final String getReport() {
		String report = "CICS Socket endpoint:\n"
			+ "  " + IP_ADDRESS_CFG + "\t : " + mHostIPAddress + "\n"
			+ "  " + IP_PORT_CFG + "\t : " + mHostIPPort + "\n"
			+ "  " + HOST_CHARSET_CFG + "\t : " + mHostCharset + "\n"
			+ "  " + HOST_USERID_CFG + "\t : " + mHostUserID + "\n"
			+ "  " + HOST_TRACE_CFG + "\t : " + mHostTraceMode;
		return report;
	}
	
	/**
	 * @return the host charset
	 */
	public final String getHostCharset() {
		return mHostCharset;
	}

	/**
	 * @param hostCharset the host charset to set
	 */
	public final void setHostCharset(final String hostCharset) {
		mHostCharset = hostCharset;
	}

	/**
	 * @return the host IP address
	 */
	public final String getHostIPAddress() {
		return mHostIPAddress;
	}

	/**
	 * @param hostIPAddress the host IP address to set
	 */
	public final void setHostIPAddress(final String hostIPAddress) {
		mHostIPAddress = hostIPAddress;
	}

	/**
	 * @return the host IP port
	 */
	public final int getHostIPPort() {
		return mHostIPPort;
	}

	/**
	 * @param hostIPPort the host IP port to set
	 */
	public final void setHostIPPort(final int hostIPPort) {
		mHostIPPort = hostIPPort;
	}

	/**
	 * @return the host password
	 */
	public final String getHostPassword() {
		return mHostPassword;
	}

	/**
	 * @param hostPassword the host password to set
	 */
	public final void setHostPassword(final String hostPassword) {
		mHostPassword = hostPassword;
	}

	/**
	 * @return the host trace mode enabled or or
	 */
	public final boolean isHostTraceMode() {
		return mHostTraceMode;
	}

	/**
	 * @param hostTraceMode the host trace mode to set
	 */
	public final void setHostTraceMode(final boolean hostTraceMode) {
		mHostTraceMode = hostTraceMode;
	}

	/**
	 * @return the host user ID
	 */
	public final String getHostUserID() {
		return mHostUserID;
	}

	/**
	 * @param hostUserID the host user ID to set
	 */
	public final void setHostUserID(final String hostUserID) {
		mHostUserID = hostUserID;
	}

}

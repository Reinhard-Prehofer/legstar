
package com.legstar.test.cixs.alltypes;
import javax.jws.WebService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.legstar.host.invoke.HostInvoke;
import com.legstar.host.invoke.HostInvokeException;
import com.legstar.host.invoke.HostInvokeFactory;
import com.legstar.messaging.Address;


/**
 * Web service enpoint implementation.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:48.25+02:00
 */

@WebService(endpointInterface = "com.legstar.test.cixs.alltypes.Alltypes",
        serviceName = "alltypesService",
        targetNamespace = "http://cixs.test.legstar.com/alltypes")
public class AlltypesImpl implements Alltypes {

  /** The JNDI locator for the configuration file name.*/
  private static final String JNDI_CONFIG_FILE =
	  "java:comp/env/legstar/configFileName";
	  
  /** The default configuration file name if it cannot be recovered from JNDI.*/
  private static final String DEFAULT_CONFIG_FILE = "config.xml";

  /** The configuration file name. */
  private String mConfigFileName;


  /** Properties for operation alltypes. */    
  private static final String  ALLTYPES_PROP_FILE = "alltypes.properties";

  /** {@inheritDoc} */
  public final com.legstar.test.coxb.alltypes.
          DfhcommareaType alltypes(
          final com.legstar.test.coxb.alltypes.
                DfhcommareaType request,
          final AlltypesHostHeader hostHeader)
      throws AlltypesFault {
    
    /* The JAXB input factory. */
    com.legstar.test.coxb.alltypes.ObjectFactory jaxbInFactory =
          new com.legstar.test.coxb.alltypes.ObjectFactory(); 
    
    /* The JAXB output factory. */
    com.legstar.test.coxb.alltypes.ObjectFactory jaxbOutFactory =
          new com.legstar.test.coxb.alltypes.ObjectFactory();  
    
    com.legstar.test.coxb.alltypes.
    DfhcommareaType reply = null;
    
    try {
              
      /* Initialize invoker with static data and data from headers */
      HostInvoke mInvoker = HostInvokeFactory.createHostInvoke(
              mConfigFileName, getAddress(hostHeader), ALLTYPES_PROP_FILE);

      /* Prepare the input parameter set using static binding */
      com.legstar.test.coxb.alltypes.bind.
        DfhcommareaTypeBinding cein =
          new com.legstar.test.coxb.alltypes.bind.
              DfhcommareaTypeBinding(jaxbInFactory, request);
      
      /* Prepare the output parameter set using static binding */
      com.legstar.test.coxb.alltypes.bind.
      DfhcommareaTypeBinding ceout =
          new com.legstar.test.coxb.alltypes.bind.
              DfhcommareaTypeBinding(jaxbOutFactory);
      
      /* Call remote program */
      mInvoker.invoke((hostHeader == null) ? "alltypes" 
    		  : hostHeader.getHostRequestID(), cein, ceout);
      
      /* Get reply object */
      reply = ceout.getJaxbObject(); 
      
    } catch (HostInvokeException e) {
      reportAlltypesFaultException(e,
          "Failed to invoke host program:");
    }

    return reply;
  }

  /**
   * Formats a fault element to notify client of an exception.
   *
   * @param e the exception which occured
   * @param text short message describing the context
   * @throws AlltypesFault the fault exception
   */
  private void reportAlltypesFaultException(
      final Exception e,
      final String text) throws AlltypesFault {
    e.printStackTrace();
    AlltypesFaultInfo faultInfo = new AlltypesFaultInfo();
    faultInfo.setMessage(e.getMessage());
    faultInfo.setDetail("Operation="
            + "Alltypes"
            + " Package="
            + "com.legstar.test.cixs.alltypes");
    throw (new AlltypesFault(text + ' ' 
            + faultInfo.getMessage(), faultInfo));
    
  }


  /** Lookup the fonfiguration file name at construction time. */
  public AlltypesImpl() {
	try {
		Context initCtx = new InitialContext();
		mConfigFileName = (String) initCtx.lookup(JNDI_CONFIG_FILE);
	} catch (NamingException e) {
		mConfigFileName = DEFAULT_CONFIG_FILE;
	}
  }

  /**
   * Extracts header data from SOAP header and create an Address.
   * @param hostHeader the JAXB object mapping the SOAP header element
   * @return the new host Address
   */
  private Address getAddress(
          final AlltypesHostHeader hostHeader) {
      if (hostHeader == null) {
          return null;
      }
      Address address = new Address(hostHeader.getHostEndPoint());
      address.setHostCharset(hostHeader.getHostCharset());
      address.setHostUserID(hostHeader.getHostUserID());
      address.setHostPassword(hostHeader.getHostPassword());
      address.setHostTraceMode(hostHeader.getHostTraceMode());
      return address;
  }
  
}

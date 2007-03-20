
package com.legstar.test.cixs.binarcht;
import javax.jws.WebService;
import com.legstar.cixs.coxb.CIXSParameter;
import com.legstar.cixs.coxb.ICIXSInvoker;
import com.legstar.cixs.coxb.CIXSInvokerFactory;
import com.legstar.cixs.coxb.CIXSHeader;
import com.legstar.cixs.coxb.CIXSException;


/**
 * Web service enpoint implementation.
 * 
 * This class was generated by CIXS version 1.0.
 * 2007-02-06T14:30:34.593+01:00
 */

@WebService(endpointInterface = "com.legstar.test.cixs.binarcht.Binarcht",
        serviceName = "binarchtService",
        targetNamespace = "http://cixs.test.legstar.com/binarcht")
public class BinarchtImpl implements Binarcht {

  /** The input parameter set for the invoke method. */
  private CIXSParameter mInParameter;
  
  /** The output parameter set for the invoke method. */
  private CIXSParameter mOutParameter;

  /** The invoker object. */
  private ICIXSInvoker mInvoker;


  /**
   * Contructor gets an invoker object.
   * @throws BinarchtFault if fails to get invoker 
   */
  public BinarchtImpl() throws BinarchtFault {
    CIXSInvokerFactory cf = new CIXSInvokerFactory();
    try {
        mInvoker = cf.createInvoker();
        mInParameter = mInvoker.createParameter();
        mOutParameter = mInvoker.createParameter();
    } catch (CIXSException e) {
        reportBinarchtFaultException(e, "Failed to create an invoker");
    }
  }
  
  /** {@inheritDoc} */
  public final com.legstar.test.coxb.binarcht.
          DfhcommareaType binarcht(
          final com.legstar.test.coxb.binarcht.
                DfhcommareaType request,
          final BinarchtHostHeader hostHeader)
      throws BinarchtFault {
    
    /* The JAXB input factory. */
    com.legstar.test.coxb.binarcht.ObjectFactory jaxbInFactory =
          new com.legstar.test.coxb.binarcht.ObjectFactory(); 
    
    /* The JAXB output factory. */
    com.legstar.test.coxb.binarcht.ObjectFactory jaxbOutFactory =
          new com.legstar.test.coxb.binarcht.ObjectFactory();  
    
    com.legstar.test.coxb.binarcht.
    DfhcommareaType reply = null;
    
    try {
              
      /* Initialize invoker with static data and data from headers */
      mInvoker.initialize(getHostParameters(hostHeader), "binarcht");

      /* Prepare the input parameter set using static binding */
      com.legstar.test.coxb.binarcht.bind.
        DfhcommareaTypeBinding cein =
          new com.legstar.test.coxb.binarcht.bind.
              DfhcommareaTypeBinding(jaxbInFactory, request);
      mInParameter.setComplexBinding(cein);
      
      /* Prepare the output parameter set using static binding */
      com.legstar.test.coxb.binarcht.bind.
      DfhcommareaTypeBinding ceout =
          new com.legstar.test.coxb.binarcht.bind.
              DfhcommareaTypeBinding(jaxbOutFactory);
      mOutParameter.setComplexBinding(ceout);
      
      /* Call remote program */
      mInvoker.invoke(mInParameter, mOutParameter);
      
      /* Get reply object */
      reply = ceout.getJaxbObject(); 
      
    } catch (CIXSException e) {
      reportBinarchtFaultException(e,
          "Failed to invoke host program:");
    }

    return reply;
  }

  /**
   * Formats a fault element to notify client of an exception.
   *
   * @param e the exception which occured
   * @param text short message describing the context
   * @throws BinarchtFault the fault exception
   */
  private void reportBinarchtFaultException(
      final Exception e,
      final String text) throws BinarchtFault {
    e.printStackTrace();
    BinarchtFaultInfo faultInfo = new BinarchtFaultInfo();
    faultInfo.setMessage(e.getMessage());
    faultInfo.setDetail("Operation="
            + "Binarcht"
            + " Package="
            + "com.legstar.test.cixs.binarcht");
    throw (new BinarchtFault(text + ' ' 
            + faultInfo.getMessage(), faultInfo));
    
  }


  /**
   * Extracts header data from SOAP header.
   * 
   * @param hostHeader the JAXB object mapping the SOAP header element
   * @return the header data
   */
  private CIXSHeader getHostParameters(
          final BinarchtHostHeader hostHeader) {
    if (hostHeader == null) {
        return null;
    }
    CIXSHeader ch = new CIXSHeader();
    ch.setHostUser(hostHeader.getHostUser());
    ch.setHostPassword(hostHeader.getHostPassword());
    ch.setHostIPAddress(hostHeader.getHostIPAddress());
    ch.setHostIPPort(hostHeader.getHostIPPort());
    ch.setHostCICWPath(hostHeader.getHostCICWPath());
    return ch;
  }
  
}

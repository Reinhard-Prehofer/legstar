
package com.legstar.test.cixs.redbotha;
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
 * 2007-02-06T14:30:53.5+01:00
 */

@WebService(endpointInterface = "com.legstar.test.cixs.redbotha.Redbotha",
        serviceName = "redbothaService",
        targetNamespace = "http://cixs.test.legstar.com/redbotha")
public class RedbothaImpl implements Redbotha {

  /** The input parameter set for the invoke method. */
  private CIXSParameter mInParameter;
  
  /** The output parameter set for the invoke method. */
  private CIXSParameter mOutParameter;

  /** The invoker object. */
  private ICIXSInvoker mInvoker;


  /**
   * Contructor gets an invoker object.
   * @throws RedbothaFault if fails to get invoker 
   */
  public RedbothaImpl() throws RedbothaFault {
    CIXSInvokerFactory cf = new CIXSInvokerFactory();
    try {
        mInvoker = cf.createInvoker();
        mInParameter = mInvoker.createParameter();
        mOutParameter = mInvoker.createParameter();
    } catch (CIXSException e) {
        reportRedbothaFaultException(e, "Failed to create an invoker");
    }
  }
  
  /** {@inheritDoc} */
  public final com.legstar.test.coxb.redbotha.
          DfhcommareaType redbotha(
          final com.legstar.test.coxb.redbotha.
                DfhcommareaType request,
          final RedbothaHostHeader hostHeader)
      throws RedbothaFault {
    
    /* The JAXB input factory. */
    com.legstar.test.coxb.redbotha.ObjectFactory jaxbInFactory =
          new com.legstar.test.coxb.redbotha.ObjectFactory(); 
    
    /* The JAXB output factory. */
    com.legstar.test.coxb.redbotha.ObjectFactory jaxbOutFactory =
          new com.legstar.test.coxb.redbotha.ObjectFactory();  
    
    com.legstar.test.coxb.redbotha.
    DfhcommareaType reply = null;
    
    try {
              
      /* Initialize invoker with static data and data from headers */
      mInvoker.initialize(getHostParameters(hostHeader), "redbotha");

      /* Prepare the input parameter set using static binding */
      com.legstar.test.coxb.redbotha.bind.
        DfhcommareaTypeBinding cein =
          new com.legstar.test.coxb.redbotha.bind.
              DfhcommareaTypeBinding(jaxbInFactory, request);
      mInParameter.setComplexBinding(cein);
      
      /* Prepare the output parameter set using static binding */
      com.legstar.test.coxb.redbotha.bind.
      DfhcommareaTypeBinding ceout =
          new com.legstar.test.coxb.redbotha.bind.
              DfhcommareaTypeBinding(jaxbOutFactory);
      mOutParameter.setComplexBinding(ceout);
      
      /* Call remote program */
      mInvoker.invoke(mInParameter, mOutParameter);
      
      /* Get reply object */
      reply = ceout.getJaxbObject(); 
      
    } catch (CIXSException e) {
      reportRedbothaFaultException(e,
          "Failed to invoke host program:");
    }

    return reply;
  }

  /**
   * Formats a fault element to notify client of an exception.
   *
   * @param e the exception which occured
   * @param text short message describing the context
   * @throws RedbothaFault the fault exception
   */
  private void reportRedbothaFaultException(
      final Exception e,
      final String text) throws RedbothaFault {
    e.printStackTrace();
    RedbothaFaultInfo faultInfo = new RedbothaFaultInfo();
    faultInfo.setMessage(e.getMessage());
    faultInfo.setDetail("Operation="
            + "Redbotha"
            + " Package="
            + "com.legstar.test.cixs.redbotha");
    throw (new RedbothaFault(text + ' ' 
            + faultInfo.getMessage(), faultInfo));
    
  }


  /**
   * Extracts header data from SOAP header.
   * 
   * @param hostHeader the JAXB object mapping the SOAP header element
   * @return the header data
   */
  private CIXSHeader getHostParameters(
          final RedbothaHostHeader hostHeader) {
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

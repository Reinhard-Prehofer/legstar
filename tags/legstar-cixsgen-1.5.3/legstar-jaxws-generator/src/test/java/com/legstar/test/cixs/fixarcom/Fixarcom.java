package com.legstar.test.cixs.fixarcom;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.legstar.test.coxb.fixarcom.Dfhcommarea;
/**
 * LegStar/Jaxws Component interface.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(name = "fixarcomPort",
            targetNamespace = "http://cixs.test.legstar.com/fixarcom")
public interface Fixarcom {
  
    /**
     * LegStar operation fixarcom.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader an object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws FixarcomFault if method fails
     */
    @WebMethod(operationName = "fixarcom", action = "urn:fixarcom")
    @WebResult(name = "Dfhcommarea",
        targetNamespace = "http://legstar.com/test/coxb/fixarcom")
    @RequestWrapper(localName = "FixarcomRequest",
        targetNamespace = "http://cixs.test.legstar.com/fixarcom",
        className = "com.legstar.test.cixs.fixarcom.FixarcomRequest")
    @ResponseWrapper(localName = "FixarcomResponse",
        targetNamespace = "http://cixs.test.legstar.com/fixarcom",
        className = "com.legstar.test.cixs.fixarcom.FixarcomResponse")
    Dfhcommarea fixarcom(
        @WebParam(name = "Dfhcommarea",
               targetNamespace = "http://legstar.com/test/coxb/fixarcom")
            Dfhcommarea request,
        @WebParam(name = "FixarcomHostHeader", header = true, partName = "hostHeader",
                targetNamespace = "http://cixs.test.legstar.com/fixarcom")
            FixarcomHostHeader hostHeader)
        throws FixarcomFault;
        
}
package com.legstar.test.cixs.doublmix;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.legstar.test.coxb.doublmix.Dfhcommarea;
/**
 * LegStar/Jaxws Component interface.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(name = "doublmixPort",
            targetNamespace = "http://cixs.test.legstar.com/doublmix")
public interface Doublmix {
  
    /**
     * LegStar operation doublmix.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader an object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws DoublmixFault if method fails
     */
    @WebMethod(operationName = "doublmix", action = "urn:doublmix")
    @WebResult(name = "Dfhcommarea",
        targetNamespace = "http://legstar.com/test/coxb/doublmix")
    @RequestWrapper(localName = "DoublmixRequest",
        targetNamespace = "http://cixs.test.legstar.com/doublmix",
        className = "com.legstar.test.cixs.doublmix.DoublmixRequest")
    @ResponseWrapper(localName = "DoublmixResponse",
        targetNamespace = "http://cixs.test.legstar.com/doublmix",
        className = "com.legstar.test.cixs.doublmix.DoublmixResponse")
    Dfhcommarea doublmix(
        @WebParam(name = "Dfhcommarea",
               targetNamespace = "http://legstar.com/test/coxb/doublmix")
            Dfhcommarea request,
        @WebParam(name = "DoublmixHostHeader", header = true, partName = "hostHeader",
                targetNamespace = "http://cixs.test.legstar.com/doublmix")
            DoublmixHostHeader hostHeader)
        throws DoublmixFault;
        
}
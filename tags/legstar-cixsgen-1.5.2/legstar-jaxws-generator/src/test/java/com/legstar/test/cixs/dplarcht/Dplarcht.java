package com.legstar.test.cixs.dplarcht;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.legstar.test.coxb.dplarcht.Dfhcommarea;
/**
 * LegStar/Jaxws Component interface.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(name = "dplarchtPort",
            targetNamespace = "http://cixs.test.legstar.com/dplarcht")
public interface Dplarcht {
  
    /**
     * LegStar operation dplarcht.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader an object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws DplarchtFault if method fails
     */
    @WebMethod(operationName = "dplarcht", action = "urn:dplarcht")
    @WebResult(name = "Dfhcommarea",
        targetNamespace = "http://legstar.com/test/coxb/dplarcht")
    @RequestWrapper(localName = "DplarchtRequest",
        targetNamespace = "http://cixs.test.legstar.com/dplarcht",
        className = "com.legstar.test.cixs.dplarcht.DplarchtRequest")
    @ResponseWrapper(localName = "DplarchtResponse",
        targetNamespace = "http://cixs.test.legstar.com/dplarcht",
        className = "com.legstar.test.cixs.dplarcht.DplarchtResponse")
    Dfhcommarea dplarcht(
        @WebParam(name = "Dfhcommarea",
               targetNamespace = "http://legstar.com/test/coxb/dplarcht")
            Dfhcommarea request,
        @WebParam(name = "DplarchtHostHeader", header = true, partName = "hostHeader",
                targetNamespace = "http://cixs.test.legstar.com/dplarcht")
            DplarchtHostHeader hostHeader)
        throws DplarchtFault;
        
}

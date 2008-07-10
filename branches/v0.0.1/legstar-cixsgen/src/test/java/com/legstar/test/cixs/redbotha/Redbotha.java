
package com.legstar.test.cixs.redbotha;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * Web service endpoint interface.
 * 
 * This class was generated by CIXS version 1.0.
 * 2007-02-06T14:30:53.453+01:00
 */

@WebService(name = "redbothaPort",
            targetNamespace = "http://cixs.test.legstar.com/redbotha")
public interface Redbotha {


    /**
     * Service operation redbotha.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws RedbothaFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
               targetNamespace = "http://cixs.test.legstar.com/redbotha")
    @RequestWrapper(localName = "RedbothaRequest",
               targetNamespace = "http://cixs.test.legstar.com/redbotha",
               className = "com.legstar.test.cixs.redbotha.RedbothaRequest")
    @ResponseWrapper(localName = "RedbothaResponse",
               targetNamespace = "http://cixs.test.legstar.com/redbotha",
               className = "com.legstar.test.cixs.redbotha.RedbothaResponse")
    com.legstar.test.coxb.redbotha.
    DfhcommareaType redbotha(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/redbotha")
        com.legstar.test.coxb.redbotha.
        DfhcommareaType request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/redbotha")
        RedbothaHostHeader hostHeader)
        throws RedbothaFault;

}

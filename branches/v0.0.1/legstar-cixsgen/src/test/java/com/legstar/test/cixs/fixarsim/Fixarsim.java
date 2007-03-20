
package com.legstar.test.cixs.fixarsim;
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
 * 2007-02-06T14:30:46.625+01:00
 */

@WebService(name = "fixarsimPort",
            targetNamespace = "http://cixs.test.legstar.com/fixarsim")
public interface Fixarsim {


    /**
     * Service operation fixarsim.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws FixarsimFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
               targetNamespace = "http://cixs.test.legstar.com/fixarsim")
    @RequestWrapper(localName = "FixarsimRequest",
               targetNamespace = "http://cixs.test.legstar.com/fixarsim",
               className = "com.legstar.test.cixs.fixarsim.FixarsimRequest")
    @ResponseWrapper(localName = "FixarsimResponse",
               targetNamespace = "http://cixs.test.legstar.com/fixarsim",
               className = "com.legstar.test.cixs.fixarsim.FixarsimResponse")
    com.legstar.test.coxb.fixarsim.
    DfhcommareaType fixarsim(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/fixarsim")
        com.legstar.test.coxb.fixarsim.
        DfhcommareaType request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/fixarsim")
        FixarsimHostHeader hostHeader)
        throws FixarsimFault;

}


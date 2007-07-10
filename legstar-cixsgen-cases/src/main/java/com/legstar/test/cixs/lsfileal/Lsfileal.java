
package com.legstar.test.cixs.lsfileal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * Web service endpoint interface.
 * 
 * This class was generated by CIXS generator.
 * 2007-07-09T13:01:37.468+02:00
 */

@WebService(name = "lsfilealPort",
            targetNamespace = "http://cixs.test.legstar.com/lsfileal")
public interface Lsfileal {


    /**
     * Service operation lsfileal.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws LsfilealFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
        targetNamespace = "http://cixs.test.legstar.com/lsfileal")
    @RequestWrapper(localName = "LsfilealRequest",
        targetNamespace = "http://cixs.test.legstar.com/lsfileal",
        className = "com.legstar.test.cixs.lsfileal.LsfilealRequest")
    @ResponseWrapper(localName = "LsfilealResponse",
        targetNamespace = "http://cixs.test.legstar.com/lsfileal",
        className = "com.legstar.test.cixs.lsfileal.LsfilealResponse")
    com.legstar.test.coxb.lsfileal.ReplyDataType lsfileal(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/lsfileal")
        com.legstar.test.coxb.lsfileal.RequestParmsType request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/lsfileal")
        LsfilealHostHeader hostHeader)
        throws LsfilealFault;

}


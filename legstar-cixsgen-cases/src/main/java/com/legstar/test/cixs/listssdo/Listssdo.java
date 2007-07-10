
package com.legstar.test.cixs.listssdo;
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
 * 2007-07-09T13:01:07.171+02:00
 */

@WebService(name = "listssdoPort",
            targetNamespace = "http://cixs.test.legstar.com/listssdo")
public interface Listssdo {


    /**
     * Service operation listssdo.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws ListssdoFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
        targetNamespace = "http://cixs.test.legstar.com/listssdo")
    @RequestWrapper(localName = "ListssdoRequest",
        targetNamespace = "http://cixs.test.legstar.com/listssdo",
        className = "com.legstar.test.cixs.listssdo.ListssdoRequest")
    @ResponseWrapper(localName = "ListssdoResponse",
        targetNamespace = "http://cixs.test.legstar.com/listssdo",
        className = "com.legstar.test.cixs.listssdo.ListssdoResponse")
    com.legstar.test.coxb.listssdo.DfhcommareaType listssdo(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/listssdo")
        com.legstar.test.coxb.listssdo.DfhcommareaType request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/listssdo")
        ListssdoHostHeader hostHeader)
        throws ListssdoFault;

}


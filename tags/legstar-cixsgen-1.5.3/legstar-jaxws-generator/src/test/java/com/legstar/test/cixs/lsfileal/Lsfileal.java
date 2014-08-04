package com.legstar.test.cixs.lsfileal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.legstar.test.coxb.lsfileal.RequestParms;
import com.legstar.test.coxb.lsfileal.ReplyData;
/**
 * LegStar/Jaxws Component interface.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(name = "lsfilealPort",
            targetNamespace = "http://cixs.test.legstar.com/lsfileal")
public interface Lsfileal {
  
    /**
     * LegStar operation lsfileal.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader an object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws LsfilealFault if method fails
     */
    @WebMethod(operationName = "lsfileal", action = "urn:lsfileal")
    @WebResult(name = "ReplyData",
        targetNamespace = "http://legstar.com/test/coxb/lsfileal")
    @RequestWrapper(localName = "LsfilealRequest",
        targetNamespace = "http://cixs.test.legstar.com/lsfileal",
        className = "com.legstar.test.cixs.lsfileal.LsfilealRequest")
    @ResponseWrapper(localName = "LsfilealResponse",
        targetNamespace = "http://cixs.test.legstar.com/lsfileal",
        className = "com.legstar.test.cixs.lsfileal.LsfilealResponse")
    ReplyData lsfileal(
        @WebParam(name = "RequestParms",
               targetNamespace = "http://legstar.com/test/coxb/lsfileal")
            RequestParms request,
        @WebParam(name = "LsfilealHostHeader", header = true, partName = "hostHeader",
                targetNamespace = "http://cixs.test.legstar.com/lsfileal")
            LsfilealHostHeader hostHeader)
        throws LsfilealFault;
        
}

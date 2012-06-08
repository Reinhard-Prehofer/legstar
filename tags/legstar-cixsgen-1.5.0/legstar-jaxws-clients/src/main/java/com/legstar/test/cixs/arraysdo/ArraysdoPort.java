
package com.legstar.test.cixs.arraysdo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "arraysdoPort", targetNamespace = "http://cixs.test.legstar.com/arraysdo")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.legstar.test.cixs.arraysdo.ObjectFactory.class,
    com.legstar.test.coxb.arraysdo.ObjectFactory.class
})
public interface ArraysdoPort {


    /**
     * 
     * @param hostHeader
     * @param parameters
     * @return
     *     returns com.legstar.test.cixs.arraysdo.ArraysdoResponse
     * @throws ArraysdoFault
     */
    @WebMethod(action = "urn:arraysdo")
    @WebResult(name = "ArraysdoResponse", targetNamespace = "http://cixs.test.legstar.com/arraysdo", partName = "result")
    public ArraysdoResponse arraysdo(
        @WebParam(name = "ArraysdoRequest", targetNamespace = "http://cixs.test.legstar.com/arraysdo", partName = "parameters")
        ArraysdoRequest parameters,
        @WebParam(name = "ArraysdoHostHeader", targetNamespace = "http://cixs.test.legstar.com/arraysdo", header = true, partName = "hostHeader")
        ArraysdoHostHeader hostHeader)
        throws ArraysdoFault
    ;

}
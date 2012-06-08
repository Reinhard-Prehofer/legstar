
package com.legstar.test.cixs.numzoned;

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
@WebService(name = "numzonedPort", targetNamespace = "http://cixs.test.legstar.com/numzoned")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.legstar.test.coxb.numzoned.ObjectFactory.class,
    com.legstar.test.cixs.numzoned.ObjectFactory.class
})
public interface NumzonedPort {


    /**
     * 
     * @param hostHeader
     * @param parameters
     * @return
     *     returns com.legstar.test.cixs.numzoned.NumzonedResponse
     * @throws NumzonedFault
     */
    @WebMethod(action = "urn:numzoned")
    @WebResult(name = "NumzonedResponse", targetNamespace = "http://cixs.test.legstar.com/numzoned", partName = "result")
    public NumzonedResponse numzoned(
        @WebParam(name = "NumzonedRequest", targetNamespace = "http://cixs.test.legstar.com/numzoned", partName = "parameters")
        NumzonedRequest parameters,
        @WebParam(name = "NumzonedHostHeader", targetNamespace = "http://cixs.test.legstar.com/numzoned", header = true, partName = "hostHeader")
        NumzonedHostHeader hostHeader)
        throws NumzonedFault
    ;

}
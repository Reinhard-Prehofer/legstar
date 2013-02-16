
package com.legstar.test.cixs.lsfileae;

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
@WebService(name = "lsfileaePort", targetNamespace = "http://cixs.test.legstar.com/lsfileae")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.legstar.test.coxb.lsfileae.ObjectFactory.class,
    com.legstar.test.cixs.lsfileae.ObjectFactory.class
})
public interface LsfileaePort {


    /**
     * 
     * @param hostHeader
     * @param parameters
     * @return
     *     returns com.legstar.test.cixs.lsfileae.LsfileaeResponse
     * @throws LsfileaeFault
     */
    @WebMethod(action = "urn:lsfileae")
    @WebResult(name = "LsfileaeResponse", targetNamespace = "http://cixs.test.legstar.com/lsfileae", partName = "result")
    public LsfileaeResponse lsfileae(
        @WebParam(name = "LsfileaeRequest", targetNamespace = "http://cixs.test.legstar.com/lsfileae", partName = "parameters")
        LsfileaeRequest parameters,
        @WebParam(name = "LsfileaeHostHeader", targetNamespace = "http://cixs.test.legstar.com/lsfileae", header = true, partName = "hostHeader")
        LsfileaeHostHeader hostHeader)
        throws LsfileaeFault
    ;

}
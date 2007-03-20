/*******************************************************************************
 * LegStar legacy Web-enablement .
 * Copyright (C)  2007 LegSem
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301  USA
 * 
 *     
 *****************************************************************************/

package com.legstar.test.cixs.redbotha;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.1-01/26/2007 12:09 AM(kohsuke)-RC2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "redbothaPort", targetNamespace = "http://cixs.test.legstar.com/redbotha")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.legstar.test.cixs.redbotha.ObjectFactory.class,
    com.legstar.test.coxb.redbotha.ObjectFactory.class
})
public interface RedbothaPort {


    /**
     * 
     * @param hostHeader
     * @param parameters
     * @return
     *     returns com.legstar.test.cixs.redbotha.RedbothaResponse
     * @throws RedbothaFault
     */
    @WebMethod
    @WebResult(name = "RedbothaResponse", targetNamespace = "http://cixs.test.legstar.com/redbotha", partName = "result")
    public RedbothaResponse redbotha(
        @WebParam(name = "RedbothaRequest", targetNamespace = "http://cixs.test.legstar.com/redbotha", partName = "parameters")
        RedbothaRequest parameters,
        @WebParam(name = "HostHeader", targetNamespace = "http://cixs.test.legstar.com/redbotha", header = true, partName = "HostHeader")
        RedbothaHostHeader hostHeader)
        throws RedbothaFault
    ;

}

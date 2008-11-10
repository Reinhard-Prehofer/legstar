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

package com.legstar.test.cixs.binnatsi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.1-01/26/2007 12:09 AM(kohsuke)-RC2
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "binnatsiService", targetNamespace = "http://cixs.test.legstar.com/binnatsi", wsdlLocation = "http://localhost:8080/cixs-binnatsi/binnatsi?wsdl")
public class BinnatsiService
    extends Service
{

    private final static URL BINNATSISERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/cixs-binnatsi/binnatsi?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        BINNATSISERVICE_WSDL_LOCATION = url;
    }

    public BinnatsiService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BinnatsiService() {
        super(BINNATSISERVICE_WSDL_LOCATION, new QName("http://cixs.test.legstar.com/binnatsi", "binnatsiService"));
    }

    /**
     * 
     * @return
     *     returns BinnatsiPort
     */
    @WebEndpoint(name = "BinnatsiImplPort")
    public BinnatsiPort getBinnatsiImplPort() {
        return (BinnatsiPort)super.getPort(new QName("http://cixs.test.legstar.com/binnatsi", "BinnatsiImplPort"), BinnatsiPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BinnatsiPort
     */
    @WebEndpoint(name = "BinnatsiImplPort")
    public BinnatsiPort getBinnatsiImplPort(WebServiceFeature... features) {
        return (BinnatsiPort)super.getPort(new QName("http://cixs.test.legstar.com/binnatsi", "BinnatsiImplPort"), BinnatsiPort.class, features);
    }

}
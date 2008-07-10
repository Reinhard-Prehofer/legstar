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

package com.legstar.test.cixs.fixarsim;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.legstar.test.cixs.fixarsim package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FixarsimFaultInfo_QNAME = new QName("http://cixs.test.legstar.com/fixarsim", "FixarsimFaultInfo");
    private final static QName _HostHeader_QNAME = new QName("http://cixs.test.legstar.com/fixarsim", "HostHeader");
    private final static QName _FixarsimRequest_QNAME = new QName("http://cixs.test.legstar.com/fixarsim", "FixarsimRequest");
    private final static QName _FixarsimResponse_QNAME = new QName("http://cixs.test.legstar.com/fixarsim", "FixarsimResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.legstar.test.cixs.fixarsim
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FixarsimRequest }
     * 
     */
    public FixarsimRequest createFixarsimRequest() {
        return new FixarsimRequest();
    }

    /**
     * Create an instance of {@link FixarsimFaultInfo }
     * 
     */
    public FixarsimFaultInfo createFixarsimFaultInfo() {
        return new FixarsimFaultInfo();
    }

    /**
     * Create an instance of {@link FixarsimResponse }
     * 
     */
    public FixarsimResponse createFixarsimResponse() {
        return new FixarsimResponse();
    }

    /**
     * Create an instance of {@link FixarsimHostHeader }
     * 
     */
    public FixarsimHostHeader createFixarsimHostHeader() {
        return new FixarsimHostHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixarsimFaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cixs.test.legstar.com/fixarsim", name = "FixarsimFaultInfo")
    public JAXBElement<FixarsimFaultInfo> createFixarsimFaultInfo(FixarsimFaultInfo value) {
        return new JAXBElement<FixarsimFaultInfo>(_FixarsimFaultInfo_QNAME, FixarsimFaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixarsimHostHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cixs.test.legstar.com/fixarsim", name = "HostHeader")
    public JAXBElement<FixarsimHostHeader> createHostHeader(FixarsimHostHeader value) {
        return new JAXBElement<FixarsimHostHeader>(_HostHeader_QNAME, FixarsimHostHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixarsimRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cixs.test.legstar.com/fixarsim", name = "FixarsimRequest")
    public JAXBElement<FixarsimRequest> createFixarsimRequest(FixarsimRequest value) {
        return new JAXBElement<FixarsimRequest>(_FixarsimRequest_QNAME, FixarsimRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixarsimResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cixs.test.legstar.com/fixarsim", name = "FixarsimResponse")
    public JAXBElement<FixarsimResponse> createFixarsimResponse(FixarsimResponse value) {
        return new JAXBElement<FixarsimResponse>(_FixarsimResponse_QNAME, FixarsimResponse.class, null, value);
    }

}
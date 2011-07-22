
package com.legstar.test.coxb.binarcht;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.legstar.test.coxb.binarcht package. 
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

    private final static QName _Dfhcommarea_QNAME = new QName("http://legstar.com/test/coxb/binarcht", "Dfhcommarea");
    private final static QName _WsSignedNative_QNAME = new QName("http://legstar.com/test/coxb/binarcht", "WsSignedNative");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.legstar.test.coxb.binarcht
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LsUnsignedNative }
     * 
     */
    public LsUnsignedNative createLsUnsignedNative() {
        return new LsUnsignedNative();
    }

    /**
     * Create an instance of {@link LsSignedNative }
     * 
     */
    public LsSignedNative createLsSignedNative() {
        return new LsSignedNative();
    }

    /**
     * Create an instance of {@link WsSignedNative }
     * 
     */
    public WsSignedNative createWsSignedNative() {
        return new WsSignedNative();
    }

    /**
     * Create an instance of {@link Dfhcommarea }
     * 
     */
    public Dfhcommarea createDfhcommarea() {
        return new Dfhcommarea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dfhcommarea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legstar.com/test/coxb/binarcht", name = "Dfhcommarea")
    public JAXBElement<Dfhcommarea> createDfhcommarea(Dfhcommarea value) {
        return new JAXBElement<Dfhcommarea>(_Dfhcommarea_QNAME, Dfhcommarea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSignedNative }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legstar.com/test/coxb/binarcht", name = "WsSignedNative")
    public JAXBElement<WsSignedNative> createWsSignedNative(WsSignedNative value) {
        return new JAXBElement<WsSignedNative>(_WsSignedNative_QNAME, WsSignedNative.class, null, value);
    }

}
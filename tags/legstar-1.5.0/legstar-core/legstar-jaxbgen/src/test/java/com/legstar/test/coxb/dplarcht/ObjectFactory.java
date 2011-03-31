
package com.legstar.test.coxb.dplarcht;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.legstar.test.coxb.dplarcht package. 
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

    private final static QName _WsTransactionDescription_QNAME = new QName("http://legstar.com/test/coxb/dplarcht", "WsTransactionDescription");
    private final static QName _WsItemsSelection_QNAME = new QName("http://legstar.com/test/coxb/dplarcht", "WsItemsSelection");
    private final static QName _WsFileDescription_QNAME = new QName("http://legstar.com/test/coxb/dplarcht", "WsFileDescription");
    private final static QName _WsSearchStatus_QNAME = new QName("http://legstar.com/test/coxb/dplarcht", "WsSearchStatus");
    private final static QName _Dfhcommarea_QNAME = new QName("http://legstar.com/test/coxb/dplarcht", "Dfhcommarea");
    private final static QName _WsErrorStatus_QNAME = new QName("http://legstar.com/test/coxb/dplarcht", "WsErrorStatus");
    private final static QName _WsProgramDescription_QNAME = new QName("http://legstar.com/test/coxb/dplarcht", "WsProgramDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.legstar.test.coxb.dplarcht
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WsTransactionDescription }
     * 
     */
    public WsTransactionDescription createWsTransactionDescription() {
        return new WsTransactionDescription();
    }

    /**
     * Create an instance of {@link LsItemsArray }
     * 
     */
    public LsItemsArray createLsItemsArray() {
        return new LsItemsArray();
    }

    /**
     * Create an instance of {@link LsTransactionsData }
     * 
     */
    public LsTransactionsData createLsTransactionsData() {
        return new LsTransactionsData();
    }

    /**
     * Create an instance of {@link Dfhcommarea }
     * 
     */
    public Dfhcommarea createDfhcommarea() {
        return new Dfhcommarea();
    }

    /**
     * Create an instance of {@link LsSearchCriteria }
     * 
     */
    public LsSearchCriteria createLsSearchCriteria() {
        return new LsSearchCriteria();
    }

    /**
     * Create an instance of {@link WsFileDescription }
     * 
     */
    public WsFileDescription createWsFileDescription() {
        return new WsFileDescription();
    }

    /**
     * Create an instance of {@link LsRequest }
     * 
     */
    public LsRequest createLsRequest() {
        return new LsRequest();
    }

    /**
     * Create an instance of {@link LsReply }
     * 
     */
    public LsReply createLsReply() {
        return new LsReply();
    }

    /**
     * Create an instance of {@link LsReplyData }
     * 
     */
    public LsReplyData createLsReplyData() {
        return new LsReplyData();
    }

    /**
     * Create an instance of {@link LsProgramsData }
     * 
     */
    public LsProgramsData createLsProgramsData() {
        return new LsProgramsData();
    }

    /**
     * Create an instance of {@link LsFilesData }
     * 
     */
    public LsFilesData createLsFilesData() {
        return new LsFilesData();
    }

    /**
     * Create an instance of {@link WsProgramDescription }
     * 
     */
    public WsProgramDescription createWsProgramDescription() {
        return new WsProgramDescription();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsTransactionDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legstar.com/test/coxb/dplarcht", name = "WsTransactionDescription")
    public JAXBElement<WsTransactionDescription> createWsTransactionDescription(WsTransactionDescription value) {
        return new JAXBElement<WsTransactionDescription>(_WsTransactionDescription_QNAME, WsTransactionDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legstar.com/test/coxb/dplarcht", name = "WsItemsSelection")
    public JAXBElement<Integer> createWsItemsSelection(Integer value) {
        return new JAXBElement<Integer>(_WsItemsSelection_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsFileDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legstar.com/test/coxb/dplarcht", name = "WsFileDescription")
    public JAXBElement<WsFileDescription> createWsFileDescription(WsFileDescription value) {
        return new JAXBElement<WsFileDescription>(_WsFileDescription_QNAME, WsFileDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legstar.com/test/coxb/dplarcht", name = "WsSearchStatus")
    public JAXBElement<Integer> createWsSearchStatus(Integer value) {
        return new JAXBElement<Integer>(_WsSearchStatus_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dfhcommarea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legstar.com/test/coxb/dplarcht", name = "Dfhcommarea")
    public JAXBElement<Dfhcommarea> createDfhcommarea(Dfhcommarea value) {
        return new JAXBElement<Dfhcommarea>(_Dfhcommarea_QNAME, Dfhcommarea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legstar.com/test/coxb/dplarcht", name = "WsErrorStatus")
    public JAXBElement<Integer> createWsErrorStatus(Integer value) {
        return new JAXBElement<Integer>(_WsErrorStatus_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsProgramDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legstar.com/test/coxb/dplarcht", name = "WsProgramDescription")
    public JAXBElement<WsProgramDescription> createWsProgramDescription(WsProgramDescription value) {
        return new JAXBElement<WsProgramDescription>(_WsProgramDescription_QNAME, WsProgramDescription.class, null, value);
    }

}

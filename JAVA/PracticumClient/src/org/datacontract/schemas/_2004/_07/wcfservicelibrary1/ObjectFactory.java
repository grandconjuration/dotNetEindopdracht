
package org.datacontract.schemas._2004._07.wcfservicelibrary1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wcfservicelibrary1 package. 
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

    private final static QName _Usersproducten_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "usersproducten");
    private final static QName _ArrayOfproducten_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "ArrayOfproducten");
    private final static QName _ArrayOfusersproducten_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "ArrayOfusersproducten");
    private final static QName _Producten_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "producten");
    private final static QName _ProductenNaam_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "naam");
    private final static QName _ProductenUsersproductens_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "usersproductens");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcfservicelibrary1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfusersproducten }
     * 
     */
    public ArrayOfusersproducten createArrayOfusersproducten() {
        return new ArrayOfusersproducten();
    }

    /**
     * Create an instance of {@link ArrayOfproducten }
     * 
     */
    public ArrayOfproducten createArrayOfproducten() {
        return new ArrayOfproducten();
    }

    /**
     * Create an instance of {@link Usersproducten }
     * 
     */
    public Usersproducten createUsersproducten() {
        return new Usersproducten();
    }

    /**
     * Create an instance of {@link Producten }
     * 
     */
    public Producten createProducten() {
        return new Producten();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usersproducten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", name = "usersproducten")
    public JAXBElement<Usersproducten> createUsersproducten(Usersproducten value) {
        return new JAXBElement<Usersproducten>(_Usersproducten_QNAME, Usersproducten.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfproducten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", name = "ArrayOfproducten")
    public JAXBElement<ArrayOfproducten> createArrayOfproducten(ArrayOfproducten value) {
        return new JAXBElement<ArrayOfproducten>(_ArrayOfproducten_QNAME, ArrayOfproducten.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfusersproducten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", name = "ArrayOfusersproducten")
    public JAXBElement<ArrayOfusersproducten> createArrayOfusersproducten(ArrayOfusersproducten value) {
        return new JAXBElement<ArrayOfusersproducten>(_ArrayOfusersproducten_QNAME, ArrayOfusersproducten.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", name = "producten")
    public JAXBElement<Producten> createProducten(Producten value) {
        return new JAXBElement<Producten>(_Producten_QNAME, Producten.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", name = "naam", scope = Producten.class)
    public JAXBElement<String> createProductenNaam(String value) {
        return new JAXBElement<String>(_ProductenNaam_QNAME, String.class, Producten.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfusersproducten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", name = "usersproductens", scope = Producten.class)
    public JAXBElement<ArrayOfusersproducten> createProductenUsersproductens(ArrayOfusersproducten value) {
        return new JAXBElement<ArrayOfusersproducten>(_ProductenUsersproductens_QNAME, ArrayOfusersproducten.class, Producten.class, value);
    }

}

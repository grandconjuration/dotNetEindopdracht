
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelibrary1.ArrayOfproducten;
import org.datacontract.schemas._2004._07.wcfservicelibrary1.ArrayOfusersproducten;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _BuyProductPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _BuyProductUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _GetSaldoResponseGetSaldoResult_QNAME = new QName("http://tempuri.org/", "GetSaldoResult");
    private final static QName _GetProductsResponseGetProductsResult_QNAME = new QName("http://tempuri.org/", "getProductsResult");
    private final static QName _BuyProductResponseBuyProductResult_QNAME = new QName("http://tempuri.org/", "BuyProductResult");
    private final static QName _GetPurchasesResponseGetPurchasesResult_QNAME = new QName("http://tempuri.org/", "GetPurchasesResult");
    private final static QName _RegisterResponseRegisterResult_QNAME = new QName("http://tempuri.org/", "RegisterResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LogInResponse }
     * 
     */
    public LogInResponse createLogInResponse() {
        return new LogInResponse();
    }

    /**
     * Create an instance of {@link BuyProductResponse }
     * 
     */
    public BuyProductResponse createBuyProductResponse() {
        return new BuyProductResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetPurchasesResponse }
     * 
     */
    public GetPurchasesResponse createGetPurchasesResponse() {
        return new GetPurchasesResponse();
    }

    /**
     * Create an instance of {@link BuyProduct }
     * 
     */
    public BuyProduct createBuyProduct() {
        return new BuyProduct();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link GetSaldo }
     * 
     */
    public GetSaldo createGetSaldo() {
        return new GetSaldo();
    }

    /**
     * Create an instance of {@link LogIn }
     * 
     */
    public LogIn createLogIn() {
        return new LogIn();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetPurchases }
     * 
     */
    public GetPurchases createGetPurchases() {
        return new GetPurchases();
    }

    /**
     * Create an instance of {@link GetSaldoResponse }
     * 
     */
    public GetSaldoResponse createGetSaldoResponse() {
        return new GetSaldoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = BuyProduct.class)
    public JAXBElement<String> createBuyProductPassword(String value) {
        return new JAXBElement<String>(_BuyProductPassword_QNAME, String.class, BuyProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = BuyProduct.class)
    public JAXBElement<String> createBuyProductUsername(String value) {
        return new JAXBElement<String>(_BuyProductUsername_QNAME, String.class, BuyProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSaldoResult", scope = GetSaldoResponse.class)
    public JAXBElement<Double> createGetSaldoResponseGetSaldoResult(Double value) {
        return new JAXBElement<Double>(_GetSaldoResponseGetSaldoResult_QNAME, Double.class, GetSaldoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = LogIn.class)
    public JAXBElement<String> createLogInPassword(String value) {
        return new JAXBElement<String>(_BuyProductPassword_QNAME, String.class, LogIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = LogIn.class)
    public JAXBElement<String> createLogInUsername(String value) {
        return new JAXBElement<String>(_BuyProductUsername_QNAME, String.class, LogIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Register.class)
    public JAXBElement<String> createRegisterUsername(String value) {
        return new JAXBElement<String>(_BuyProductUsername_QNAME, String.class, Register.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfproducten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getProductsResult", scope = GetProductsResponse.class)
    public JAXBElement<ArrayOfproducten> createGetProductsResponseGetProductsResult(ArrayOfproducten value) {
        return new JAXBElement<ArrayOfproducten>(_GetProductsResponseGetProductsResult_QNAME, ArrayOfproducten.class, GetProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BuyProductResult", scope = BuyProductResponse.class)
    public JAXBElement<String> createBuyProductResponseBuyProductResult(String value) {
        return new JAXBElement<String>(_BuyProductResponseBuyProductResult_QNAME, String.class, BuyProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfusersproducten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPurchasesResult", scope = GetPurchasesResponse.class)
    public JAXBElement<ArrayOfusersproducten> createGetPurchasesResponseGetPurchasesResult(ArrayOfusersproducten value) {
        return new JAXBElement<ArrayOfusersproducten>(_GetPurchasesResponseGetPurchasesResult_QNAME, ArrayOfusersproducten.class, GetPurchasesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = GetSaldo.class)
    public JAXBElement<String> createGetSaldoPassword(String value) {
        return new JAXBElement<String>(_BuyProductPassword_QNAME, String.class, GetSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetSaldo.class)
    public JAXBElement<String> createGetSaldoUsername(String value) {
        return new JAXBElement<String>(_BuyProductUsername_QNAME, String.class, GetSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterResult", scope = RegisterResponse.class)
    public JAXBElement<String> createRegisterResponseRegisterResult(String value) {
        return new JAXBElement<String>(_RegisterResponseRegisterResult_QNAME, String.class, RegisterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = GetProducts.class)
    public JAXBElement<String> createGetProductsPassword(String value) {
        return new JAXBElement<String>(_BuyProductPassword_QNAME, String.class, GetProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetProducts.class)
    public JAXBElement<String> createGetProductsUsername(String value) {
        return new JAXBElement<String>(_BuyProductUsername_QNAME, String.class, GetProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = GetPurchases.class)
    public JAXBElement<String> createGetPurchasesPassword(String value) {
        return new JAXBElement<String>(_BuyProductPassword_QNAME, String.class, GetPurchases.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetPurchases.class)
    public JAXBElement<String> createGetPurchasesUsername(String value) {
        return new JAXBElement<String>(_BuyProductUsername_QNAME, String.class, GetPurchases.class, value);
    }

}

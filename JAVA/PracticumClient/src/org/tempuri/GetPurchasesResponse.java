
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelibrary1.ArrayOfusersproducten;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetPurchasesResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLibrary1}ArrayOfusersproducten" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPurchasesResult"
})
@XmlRootElement(name = "GetPurchasesResponse")
public class GetPurchasesResponse {

    @XmlElementRef(name = "GetPurchasesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfusersproducten> getPurchasesResult;

    /**
     * Gets the value of the getPurchasesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfusersproducten }{@code >}
     *     
     */
    public JAXBElement<ArrayOfusersproducten> getGetPurchasesResult() {
        return getPurchasesResult;
    }

    /**
     * Sets the value of the getPurchasesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfusersproducten }{@code >}
     *     
     */
    public void setGetPurchasesResult(JAXBElement<ArrayOfusersproducten> value) {
        this.getPurchasesResult = value;
    }

}

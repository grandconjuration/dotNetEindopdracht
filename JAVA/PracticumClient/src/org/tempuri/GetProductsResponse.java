
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="getProductsResult" type="{http://tempuri.org/}ArrayOfProducten" minOccurs="0"/>
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
    "getProductsResult"
})
@XmlRootElement(name = "getProductsResponse")
public class GetProductsResponse {

    protected ArrayOfProducten getProductsResult;

    /**
     * Gets the value of the getProductsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProducten }
     *     
     */
    public ArrayOfProducten getGetProductsResult() {
        return getProductsResult;
    }

    /**
     * Sets the value of the getProductsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProducten }
     *     
     */
    public void setGetProductsResult(ArrayOfProducten value) {
        this.getProductsResult = value;
    }

}

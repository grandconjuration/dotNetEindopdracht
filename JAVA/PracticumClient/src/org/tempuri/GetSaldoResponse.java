
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetSaldoResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "getSaldoResult"
})
@XmlRootElement(name = "GetSaldoResponse")
public class GetSaldoResponse {

    @XmlElement(name = "GetSaldoResult", required = true, type = Double.class, nillable = true)
    protected Double getSaldoResult;

    /**
     * Gets the value of the getSaldoResult property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGetSaldoResult() {
        return getSaldoResult;
    }

    /**
     * Sets the value of the getSaldoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGetSaldoResult(Double value) {
        this.getSaldoResult = value;
    }

}

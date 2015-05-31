
package org.datacontract.schemas._2004._07.wcfservicelibrary1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for producten complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="producten">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aantal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prijs" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="usersproductens" type="{http://schemas.datacontract.org/2004/07/WcfServiceLibrary1}ArrayOfusersproducten" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producten", propOrder = {
    "aantal",
    "id",
    "naam",
    "prijs",
    "usersproductens"
})
public class Producten {

    protected Integer aantal;
    protected Integer id;
    @XmlElementRef(name = "naam", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naam;
    protected Double prijs;
    @XmlElementRef(name = "usersproductens", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfusersproducten> usersproductens;

    /**
     * Gets the value of the aantal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAantal() {
        return aantal;
    }

    /**
     * Sets the value of the aantal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAantal(Integer value) {
        this.aantal = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNaam(JAXBElement<String> value) {
        this.naam = value;
    }

    /**
     * Gets the value of the prijs property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrijs() {
        return prijs;
    }

    /**
     * Sets the value of the prijs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrijs(Double value) {
        this.prijs = value;
    }

    /**
     * Gets the value of the usersproductens property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfusersproducten }{@code >}
     *     
     */
    public JAXBElement<ArrayOfusersproducten> getUsersproductens() {
        return usersproductens;
    }

    /**
     * Sets the value of the usersproductens property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfusersproducten }{@code >}
     *     
     */
    public void setUsersproductens(JAXBElement<ArrayOfusersproducten> value) {
        this.usersproductens = value;
    }

}


package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prijs" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="aantal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usersproductens" type="{http://tempuri.org/}ArrayOfUsersproducten" minOccurs="0"/>
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
    "id",
    "naam",
    "prijs",
    "aantal",
    "usersproductens"
})
public class Producten {

    protected int id;
    protected String naam;
    protected double prijs;
    protected int aantal;
    protected ArrayOfUsersproducten usersproductens;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the prijs property.
     * 
     */
    public double getPrijs() {
        return prijs;
    }

    /**
     * Sets the value of the prijs property.
     * 
     */
    public void setPrijs(double value) {
        this.prijs = value;
    }

    /**
     * Gets the value of the aantal property.
     * 
     */
    public int getAantal() {
        return aantal;
    }

    /**
     * Sets the value of the aantal property.
     * 
     */
    public void setAantal(int value) {
        this.aantal = value;
    }

    /**
     * Gets the value of the usersproductens property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUsersproducten }
     *     
     */
    public ArrayOfUsersproducten getUsersproductens() {
        return usersproductens;
    }

    /**
     * Sets the value of the usersproductens property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUsersproducten }
     *     
     */
    public void setUsersproductens(ArrayOfUsersproducten value) {
        this.usersproductens = value;
    }

}

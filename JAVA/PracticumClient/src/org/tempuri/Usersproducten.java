
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usersproducten complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usersproducten">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aantal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="producten" type="{http://tempuri.org/}producten" minOccurs="0"/>
 *         &lt;element name="user" type="{http://tempuri.org/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usersproducten", propOrder = {
    "id",
    "userid",
    "productid",
    "aantal",
    "producten",
    "user"
})
public class Usersproducten {

    protected int id;
    protected int userid;
    protected int productid;
    protected int aantal;
    protected Producten producten;
    protected User user;

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
     * Gets the value of the userid property.
     * 
     */
    public int getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     */
    public void setUserid(int value) {
        this.userid = value;
    }

    /**
     * Gets the value of the productid property.
     * 
     */
    public int getProductid() {
        return productid;
    }

    /**
     * Sets the value of the productid property.
     * 
     */
    public void setProductid(int value) {
        this.productid = value;
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
     * Gets the value of the producten property.
     * 
     * @return
     *     possible object is
     *     {@link Producten }
     *     
     */
    public Producten getProducten() {
        return producten;
    }

    /**
     * Sets the value of the producten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Producten }
     *     
     */
    public void setProducten(Producten value) {
        this.producten = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}

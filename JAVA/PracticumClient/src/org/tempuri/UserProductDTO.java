
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserProductDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserProductDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aantal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productNaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProductDTO", propOrder = {
    "id",
    "userid",
    "productid",
    "aantal",
    "productNaam"
})
public class UserProductDTO {

    protected int id;
    protected int userid;
    protected int productid;
    protected int aantal;
    protected String productNaam;

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
     * Gets the value of the productNaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNaam() {
        return productNaam;
    }

    /**
     * Sets the value of the productNaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNaam(String value) {
        this.productNaam = value;
    }

}

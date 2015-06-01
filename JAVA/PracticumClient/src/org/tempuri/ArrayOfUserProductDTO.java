
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserProductDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserProductDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserProductDTO" type="{http://tempuri.org/}UserProductDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserProductDTO", propOrder = {
    "userProductDTO"
})
public class ArrayOfUserProductDTO {

    @XmlElement(name = "UserProductDTO", nillable = true)
    protected List<UserProductDTO> userProductDTO;

    /**
     * Gets the value of the userProductDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userProductDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserProductDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserProductDTO }
     * 
     * 
     */
    public List<UserProductDTO> getUserProductDTO() {
        if (userProductDTO == null) {
            userProductDTO = new ArrayList<UserProductDTO>();
        }
        return this.userProductDTO;
    }

}

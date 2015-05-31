
package org.datacontract.schemas._2004._07.wcfservicelibrary1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfusersproducten complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfusersproducten">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usersproducten" type="{http://schemas.datacontract.org/2004/07/WcfServiceLibrary1}usersproducten" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfusersproducten", propOrder = {
    "usersproducten"
})
public class ArrayOfusersproducten {

    @XmlElement(nillable = true)
    protected List<Usersproducten> usersproducten;

    /**
     * Gets the value of the usersproducten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usersproducten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsersproducten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Usersproducten }
     * 
     * 
     */
    public List<Usersproducten> getUsersproducten() {
        if (usersproducten == null) {
            usersproducten = new ArrayList<Usersproducten>();
        }
        return this.usersproducten;
    }

}

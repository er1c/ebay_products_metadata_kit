
package com.ebay.services.productmetadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Container for any string type constraint information. 
 * 					
 * 
 * <p>Java class for StringTypeSpecificInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringTypeSpecificInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managedValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maximumCharactersAllowed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringTypeSpecificInformation", propOrder = {
    "managedValue",
    "maximumCharactersAllowed"
})
public class StringTypeSpecificInformation
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected List<String> managedValue;
    protected int maximumCharactersAllowed;

    /**
     * Gets the value of the managedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManagedValue() {
        if (managedValue == null) {
            managedValue = new ArrayList<String>();
        }
        return this.managedValue;
    }

    /**
     * Gets the value of the maximumCharactersAllowed property.
     * 
     */
    public int getMaximumCharactersAllowed() {
        return maximumCharactersAllowed;
    }

    /**
     * Sets the value of the maximumCharactersAllowed property.
     * 
     */
    public void setMaximumCharactersAllowed(int value) {
        this.maximumCharactersAllowed = value;
    }

}

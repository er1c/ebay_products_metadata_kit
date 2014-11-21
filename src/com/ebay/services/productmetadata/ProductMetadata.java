
package com.ebay.services.productmetadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Defines the product metadata associated with eBay catalog products for the
 * 						given category.
 * 					
 * 
 * <p>Java class for ProductMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyMetadata" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}PropertyMetadata" maxOccurs="unbounded"/>
 *         &lt;element name="groupProperties" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}GroupProperties" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productMetadataVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMetadata", propOrder = {
    "propertyMetadata",
    "groupProperties",
    "productMetadataVersion"
})
public class ProductMetadata
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected List<PropertyMetadata> propertyMetadata;
    protected List<GroupProperties> groupProperties;
    @XmlElement(required = true)
    protected String productMetadataVersion;

    /**
     * Gets the value of the propertyMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyMetadata }
     * 
     * 
     */
    public List<PropertyMetadata> getPropertyMetadata() {
        if (propertyMetadata == null) {
            propertyMetadata = new ArrayList<PropertyMetadata>();
        }
        return this.propertyMetadata;
    }

    /**
     * Gets the value of the groupProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupProperties }
     * 
     * 
     */
    public List<GroupProperties> getGroupProperties() {
        if (groupProperties == null) {
            groupProperties = new ArrayList<GroupProperties>();
        }
        return this.groupProperties;
    }

    /**
     * Gets the value of the productMetadataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductMetadataVersion() {
        return productMetadataVersion;
    }

    /**
     * Sets the value of the productMetadataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductMetadataVersion(String value) {
        this.productMetadataVersion = value;
    }

}

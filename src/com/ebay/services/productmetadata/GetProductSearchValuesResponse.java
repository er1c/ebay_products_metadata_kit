
package com.ebay.services.productmetadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProductSearchValuesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductSearchValuesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="metadataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyValues" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}PropertyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propertyValuesTree" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}PropertyNameValue" minOccurs="0"/>
 *         &lt;element name="treeFormat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductSearchValuesResponse", propOrder = {
    "metadataVersion",
    "propertyValues",
    "propertyValuesTree",
    "treeFormat"
})
@XmlSeeAlso({
    GetProductSearchValuesBulkResponse.class,
    GetCompatibilitySearchValuesBulkResponse.class
})
public class GetProductSearchValuesResponse
    extends BaseServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String metadataVersion;
    protected List<PropertyValue> propertyValues;
    protected PropertyNameValue propertyValuesTree;
    protected boolean treeFormat;

    /**
     * Gets the value of the metadataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataVersion() {
        return metadataVersion;
    }

    /**
     * Sets the value of the metadataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataVersion(String value) {
        this.metadataVersion = value;
    }

    /**
     * Gets the value of the propertyValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyValue }
     * 
     * 
     */
    public List<PropertyValue> getPropertyValues() {
        if (propertyValues == null) {
            propertyValues = new ArrayList<PropertyValue>();
        }
        return this.propertyValues;
    }

    /**
     * Gets the value of the propertyValuesTree property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyNameValue }
     *     
     */
    public PropertyNameValue getPropertyValuesTree() {
        return propertyValuesTree;
    }

    /**
     * Sets the value of the propertyValuesTree property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyNameValue }
     *     
     */
    public void setPropertyValuesTree(PropertyNameValue value) {
        this.propertyValuesTree = value;
    }

    /**
     * Gets the value of the treeFormat property.
     * 
     */
    public boolean isTreeFormat() {
        return treeFormat;
    }

    /**
     * Sets the value of the treeFormat property.
     * 
     */
    public void setTreeFormat(boolean value) {
        this.treeFormat = value;
    }

}

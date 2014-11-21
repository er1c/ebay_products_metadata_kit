
package com.ebay.services.productmetadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Base request type used by the GetProductSearchValuesRequest type. 
 * 					
 * 
 * <p>Java class for GetProductSearchValuesBaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductSearchValuesBaseRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="propertyFilter" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}PropertyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listFormatOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}SortOrder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductSearchValuesBaseRequest", propOrder = {
    "categoryId",
    "propertyFilter",
    "listFormatOnly",
    "sortOrder"
})
@XmlSeeAlso({
    GetProductSearchValuesRequest.class,
    GetProductSearchValuesBulkRequest.class
})
public class GetProductSearchValuesBaseRequest
    extends BaseServiceRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String categoryId;
    protected List<PropertyValue> propertyFilter;
    protected Boolean listFormatOnly;
    protected List<SortOrder> sortOrder;

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryId(String value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the propertyFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyValue }
     * 
     * 
     */
    public List<PropertyValue> getPropertyFilter() {
        if (propertyFilter == null) {
            propertyFilter = new ArrayList<PropertyValue>();
        }
        return this.propertyFilter;
    }

    /**
     * Gets the value of the listFormatOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListFormatOnly() {
        return listFormatOnly;
    }

    /**
     * Sets the value of the listFormatOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListFormatOnly(Boolean value) {
        this.listFormatOnly = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortOrder }
     * 
     * 
     */
    public List<SortOrder> getSortOrder() {
        if (sortOrder == null) {
            sortOrder = new ArrayList<SortOrder>();
        }
        return this.sortOrder;
    }

}

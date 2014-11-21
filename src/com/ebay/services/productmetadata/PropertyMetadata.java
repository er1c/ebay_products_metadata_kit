
package com.ebay.services.productmetadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 						Defines the characteristics of a property for a  community catalog metadata.
 * 					
 * 
 * <p>Java class for PropertyMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alternatePropertyName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="typeSpecificInformation" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}TypeSpecificInformation"/>
 *         &lt;element name="multiValued" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canonicalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="propertyTags" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}Tag" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyMetadata", propOrder = {
    "propertyName",
    "alternatePropertyName",
    "dataType",
    "typeSpecificInformation",
    "multiValued",
    "canonicalName",
    "propertyTags",
    "description"
})
public class PropertyMetadata
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String propertyName;
    protected List<String> alternatePropertyName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataType;
    @XmlElement(required = true)
    protected TypeSpecificInformation typeSpecificInformation;
    protected boolean multiValued;
    @XmlElement(required = true)
    protected String canonicalName;
    protected List<Tag> propertyTags;
    protected String description;

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the alternatePropertyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternatePropertyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternatePropertyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternatePropertyName() {
        if (alternatePropertyName == null) {
            alternatePropertyName = new ArrayList<String>();
        }
        return this.alternatePropertyName;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the typeSpecificInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSpecificInformation }
     *     
     */
    public TypeSpecificInformation getTypeSpecificInformation() {
        return typeSpecificInformation;
    }

    /**
     * Sets the value of the typeSpecificInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSpecificInformation }
     *     
     */
    public void setTypeSpecificInformation(TypeSpecificInformation value) {
        this.typeSpecificInformation = value;
    }

    /**
     * Gets the value of the multiValued property.
     * 
     */
    public boolean isMultiValued() {
        return multiValued;
    }

    /**
     * Sets the value of the multiValued property.
     * 
     */
    public void setMultiValued(boolean value) {
        this.multiValued = value;
    }

    /**
     * Gets the value of the canonicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanonicalName() {
        return canonicalName;
    }

    /**
     * Sets the value of the canonicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanonicalName(String value) {
        this.canonicalName = value;
    }

    /**
     * Gets the value of the propertyTags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyTags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tag }
     * 
     * 
     */
    public List<Tag> getPropertyTags() {
        if (propertyTags == null) {
            propertyTags = new ArrayList<Tag>();
        }
        return this.propertyTags;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}

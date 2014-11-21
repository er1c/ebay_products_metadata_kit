
package com.ebay.services.productmetadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Response containter for getCompatibilitySearchValuesBulk call.
 * 					
 * 
 * <p>Java class for GetCompatibilitySearchValuesBulkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCompatibilitySearchValuesBulkResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}GetProductSearchValuesResponse">
 *       &lt;sequence>
 *         &lt;element name="medataDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCompatibilitySearchValuesBulkResponse", propOrder = {
    "medataDetails"
})
public class GetCompatibilitySearchValuesBulkResponse
    extends GetProductSearchValuesResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String medataDetails;

    /**
     * Gets the value of the medataDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedataDetails() {
        return medataDetails;
    }

    /**
     * Sets the value of the medataDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedataDetails(String value) {
        this.medataDetails = value;
    }

}

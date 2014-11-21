
package com.ebay.services.productmetadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Response container for getCompatibilitySearchDataVersion and 
 * 						getProductSearchDataVersion calls. 
 * 					
 * 
 * <p>Java class for GetProductSearchDataVersionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductSearchDataVersionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="namesDetails" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}VersionDetails" minOccurs="0"/>
 *         &lt;element name="valueDetails" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}VersionDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductSearchDataVersionResponse", propOrder = {
    "namesDetails",
    "valueDetails"
})
public class GetProductSearchDataVersionResponse
    extends BaseServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected VersionDetails namesDetails;
    protected VersionDetails valueDetails;

    /**
     * Gets the value of the namesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VersionDetails }
     *     
     */
    public VersionDetails getNamesDetails() {
        return namesDetails;
    }

    /**
     * Sets the value of the namesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionDetails }
     *     
     */
    public void setNamesDetails(VersionDetails value) {
        this.namesDetails = value;
    }

    /**
     * Gets the value of the valueDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VersionDetails }
     *     
     */
    public VersionDetails getValueDetails() {
        return valueDetails;
    }

    /**
     * Sets the value of the valueDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionDetails }
     *     
     */
    public void setValueDetails(VersionDetails value) {
        this.valueDetails = value;
    }

}


package com.ebay.services.productmetadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						contains the product metadata ( aka catalog metadata) 
 * 					
 * 
 * <p>Java class for ProductMetadataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMetadataResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="productMetadata" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductMetadata" minOccurs="0"/>
 *         &lt;element name="requestInformation" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductMetadataRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMetadataResponse", propOrder = {
    "productMetadata",
    "requestInformation"
})
public class ProductMetadataResponse
    extends BaseResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected ProductMetadata productMetadata;
    @XmlElement(required = true)
    protected ProductMetadataRequest requestInformation;

    /**
     * Gets the value of the productMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMetadata }
     *     
     */
    public ProductMetadata getProductMetadata() {
        return productMetadata;
    }

    /**
     * Sets the value of the productMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMetadata }
     *     
     */
    public void setProductMetadata(ProductMetadata value) {
        this.productMetadata = value;
    }

    /**
     * Gets the value of the requestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMetadataRequest }
     *     
     */
    public ProductMetadataRequest getRequestInformation() {
        return requestInformation;
    }

    /**
     * Sets the value of the requestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMetadataRequest }
     *     
     */
    public void setRequestInformation(ProductMetadataRequest value) {
        this.requestInformation = value;
    }

}

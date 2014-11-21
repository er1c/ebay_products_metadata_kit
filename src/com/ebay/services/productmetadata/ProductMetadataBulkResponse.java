
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
 * 						Defines batch response where each response elements contains product metadata ( aka catalog
 * 						metadata) based on request criteria
 * 					
 * 
 * <p>Java class for ProductMetadataBulkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMetadataBulkResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="productMetadataResponse" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductMetadataResponse" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMetadataBulkResponse", propOrder = {
    "productMetadataResponse"
})
public class ProductMetadataBulkResponse
    extends BaseResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected List<ProductMetadataResponse> productMetadataResponse;

    /**
     * Gets the value of the productMetadataResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMetadataResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMetadataResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMetadataResponse }
     * 
     * 
     */
    public List<ProductMetadataResponse> getProductMetadataResponse() {
        if (productMetadataResponse == null) {
            productMetadataResponse = new ArrayList<ProductMetadataResponse>();
        }
        return this.productMetadataResponse;
    }

}

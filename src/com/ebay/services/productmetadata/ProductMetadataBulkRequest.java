
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
 * 						Request container for a batch of individual requests for product metadata for
 * 						a specific category.
 * 					
 * 
 * <p>Java class for ProductMetadataBulkRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMetadataBulkRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="productMetadataRequest" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}ProductMetadataRequest" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMetadataBulkRequest", propOrder = {
    "productMetadataRequest"
})
public class ProductMetadataBulkRequest
    extends BaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected List<ProductMetadataRequest> productMetadataRequest;

    /**
     * Gets the value of the productMetadataRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMetadataRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMetadataRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMetadataRequest }
     * 
     * 
     */
    public List<ProductMetadataRequest> getProductMetadataRequest() {
        if (productMetadataRequest == null) {
            productMetadataRequest = new ArrayList<ProductMetadataRequest>();
        }
        return this.productMetadataRequest;
    }

}

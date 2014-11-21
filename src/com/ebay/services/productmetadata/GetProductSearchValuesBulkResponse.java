
package com.ebay.services.productmetadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Response containter for getProductSearchValuesBulk call.
 * 					
 * 
 * <p>Java class for GetProductSearchValuesBulkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductSearchValuesBulkResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}GetProductSearchValuesResponse">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductSearchValuesBulkResponse")
public class GetProductSearchValuesBulkResponse
    extends GetProductSearchValuesResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;

}

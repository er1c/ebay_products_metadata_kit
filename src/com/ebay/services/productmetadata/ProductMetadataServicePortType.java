
package com.ebay.services.productmetadata;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductMetadataServicePortType", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductMetadataServicePortType {


    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.services.productmetadata.GetProductSearchNamesResponse
     */
    @WebMethod(action = "urn:getProductSearchNames")
    @WebResult(name = "getProductSearchNamesResponse", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
    public GetProductSearchNamesResponse getProductSearchNames(
        @WebParam(name = "getProductSearchNamesRequest", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
        GetProductSearchNamesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.services.productmetadata.GetProductSearchValuesResponse
     */
    @WebMethod(action = "urn:getProductSearchValues")
    @WebResult(name = "getProductSearchValuesResponse", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
    public GetProductSearchValuesResponse getProductSearchValues(
        @WebParam(name = "getProductSearchValuesRequest", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
        GetProductSearchValuesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.services.productmetadata.GetProductSearchNamesResponse
     */
    @WebMethod(action = "urn:getCompatibilitySearchNames")
    @WebResult(name = "getCompatibilitySearchNamesResponse", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
    public GetProductSearchNamesResponse getCompatibilitySearchNames(
        @WebParam(name = "getCompatibilitySearchNamesRequest", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
        GetCompatibilitySearchNamesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.services.productmetadata.GetProductSearchValuesBulkResponse
     */
    @WebMethod(action = "urn:getProductSearchValuesBulk")
    @WebResult(name = "getProductSearchValuesBulkResponse", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
    public GetProductSearchValuesBulkResponse getProductSearchValuesBulk(
        @WebParam(name = "getProductSearchValuesBulkRequest", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
        GetProductSearchValuesBulkRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.services.productmetadata.GetProductSearchValuesResponse
     */
    @WebMethod(action = "urn:getCompatibilitySearchValues")
    @WebResult(name = "getCompatibilitySearchValuesResponse", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
    public GetProductSearchValuesResponse getCompatibilitySearchValues(
        @WebParam(name = "getCompatibilitySearchValuesRequest", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
        GetProductSearchValuesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.services.productmetadata.GetCompatibilitySearchValuesBulkResponse
     */
    @WebMethod(action = "urn:getCompatibilitySearchValuesBulk")
    @WebResult(name = "getCompatibilitySearchValuesBulkResponse", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
    public GetCompatibilitySearchValuesBulkResponse getCompatibilitySearchValuesBulk(
        @WebParam(name = "getCompatibilitySearchValuesBulkRequest", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
        GetProductSearchValuesBulkRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.services.productmetadata.GetProductSearchDataVersionResponse
     */
    @WebMethod(action = "urn:getProductSearchDataVersion")
    @WebResult(name = "getProductSearchDataVersionResponse", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
    public GetProductSearchDataVersionResponse getProductSearchDataVersion(
        @WebParam(name = "getProductSearchDataVersionRequest", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
        GetProductSearchDataVersionRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.services.productmetadata.GetProductSearchDataVersionResponse
     */
    @WebMethod(action = "urn:getCompatibilitySearchDataVersion")
    @WebResult(name = "getCompatibilitySearchDataVersionResponse", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
    public GetProductSearchDataVersionResponse getCompatibilitySearchDataVersion(
        @WebParam(name = "getCompatibilitySearchDataVersionRequest", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "params")
        GetProductSearchDataVersionRequest params);

    /**
     * This operation provides product metadata( aka catalog metadata). This can be used to create addProduct call in ProductService API.
     * 
     * 
     * @param getProductMetadataBulkRequest
     * @return
     *     returns com.ebay.services.productmetadata.ProductMetadataBulkResponse
     */
    @WebMethod(action = "urn:getProductMetadataBulk")
    @WebResult(name = "getProductMetadataBulkResponse", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "getProductMetadataBulkResponse")
    public ProductMetadataBulkResponse getProductMetadataBulk(
        @WebParam(name = "getProductMetadataBulkRequest", targetNamespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", partName = "getProductMetadataBulkRequest")
        ProductMetadataBulkRequest getProductMetadataBulkRequest);

}

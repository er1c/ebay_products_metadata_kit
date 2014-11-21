/*
Copyright (c) 2011 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and 
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent 
version thereof released by eBay.  The then-current version of the License 
can be found at https://www.codebase.ebay.com/Licenses.html and in the 
eBaySDKLicense file that is under the eBay SDK install directory.
*/
package com.ebay.services.client;

import com.ebay.common.ClientFactory;
import com.ebay.common.Constants;
import com.ebay.services.productmetadata.ProductMetadataService;
import com.ebay.services.productmetadata.ProductMetadataServicePortType;

/**
 * Factory class to get eBay Finding Service client proxy
 * 
 * @author boyang
 *
 */
public class ProductMetadataServiceClientFactory {
	
	/**
	 * Get a client object which can communicate with
	 * Finding service.
	 * 
	 * @param config, client-side configuration object
	 * @return a client object which implements the interface
	 *         of Finding service.
	 */
	public static ProductMetadataServicePortType getServiceClient(ClientConfig config) {
        ProductMetadataServicePortType serviceClient = 
        	ClientFactory.getServiceClient(ProductMetadataServicePortType.class, ProductMetadataService.class, 
        			config, Constants.PRODUCT_METADATA_SERVICE_TRACKING_NAME);
        return serviceClient;
	}

}

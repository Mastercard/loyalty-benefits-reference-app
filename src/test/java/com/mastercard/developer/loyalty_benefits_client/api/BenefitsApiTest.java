/*
 *  Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 * Loyalty Benefits API
 * The Loyalty Benefits API provides benefits management including presentment and selection.  It also supports insurance certificate generation for insurance benefits that need certificates.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.loyalty_benefits_client.api;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.when;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mastercard.developer.loyalty_benefits_client.ApiClient;
import com.mastercard.developer.loyalty_benefits_client.ApiException;
import com.mastercard.developer.loyalty_benefits_client.ApiResponse;
import com.mastercard.developer.loyalty_benefits_client.ProgressRequestBody;
import com.mastercard.developer.loyalty_benefits_client.model.AssignedBenefits;
import com.mastercard.developer.loyalty_benefits_client.model.Benefits;
import com.mastercard.developer.loyalty_benefits_client.model.BenefitsSelection;
import com.squareup.okhttp.Call;


/**
 * API tests for BenefitsApi
 */
public class BenefitsApiTest {
	
    private BenefitsApi api;
	    
    @Mock
    private ApiClient apiClientMock;
    
    @Mock
    private Call call;
    
	@Before
    public void setUp() throws ApiException {
               MockitoAnnotations.initMocks(this);
               api = new BenefitsApi(apiClientMock);
               when(apiClientMock.buildCall(any(String.class), any(String.class), any(List.class), any(List.class), any(Object.class), any(Map.class), any(Map.class), any(String[].class), (ProgressRequestBody.ProgressRequestListener)isNull())).thenReturn(call);
    }

    /**
     * List of assigned benefits
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @SuppressWarnings({ "rawtypes" })
	@Test
    public void loyaltyBenefitsAssignedBenefitsGetTest() throws ApiException {

        ApiResponse apiResponse = new ApiResponse(200, null, new AssignedBenefits());
        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
		AssignedBenefits response = api.loyaltyBenefitsAssignedBenefitsGet(1216, "user", "2244", "web", "eng");
        assertNotNull(response);
        
    }
    
    /**
     * List of assigned benefits
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @SuppressWarnings({ "rawtypes" })
	@Test(expected = ApiException.class)
    public void loyaltyBenefitsAssignedBenefitsGetTest_Exception() throws ApiException {

        ApiResponse apiResponse = new ApiResponse(200, null, new AssignedBenefits());
        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
		AssignedBenefits response = api.loyaltyBenefitsAssignedBenefitsGet(null, "user", "2244", "web", "eng");
        assertNotNull(response);
        
    }
    
    /**
     * Select optional benefits
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @SuppressWarnings({ "unchecked" })
	@Test
    public void loyaltyBenefitsBenefitSelectionsPostTest() throws ApiException {
    	
    	ApiResponse apiResponse = new ApiResponse(200, null, new BenefitsSelection());
        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
    	api.loyaltyBenefitsBenefitSelectionsPost(new BenefitsSelection());
    	
    }
    
    /**
     * List all default and selectable benefits for the card product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @SuppressWarnings({ "rawtypes" })
	@Test
    public void loyaltyBenefitsProductBenefitsGetTest() throws ApiException {
      
    	ApiResponse apiResponse = new ApiResponse(200,null, new Benefits());
        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
        Benefits response = api.loyaltyBenefitsProductBenefitsGet(1234, "product", "channel", "eng");
        assertNotNull(response);

    }
    
    /**
     * List all default and selectable benefits for the card product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @SuppressWarnings({ "rawtypes" })
	@Test(expected = ApiException.class)
    public void loyaltyBenefitsProductBenefitsGetTest_Exception() throws ApiException {
      
    	ApiResponse apiResponse = new ApiResponse(200,null, new Benefits());
        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
        Benefits response = api.loyaltyBenefitsProductBenefitsGet(null, "product", "channel", "eng");
        assertNotNull(response);

    }
}

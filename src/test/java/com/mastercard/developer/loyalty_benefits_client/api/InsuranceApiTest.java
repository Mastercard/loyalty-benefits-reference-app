/*
 * 
 * Copyright (c) 2019 Mastercard
 
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
import com.mastercard.developer.loyalty_benefits_client.model.ClaimStatus;
import com.mastercard.developer.loyalty_benefits_client.model.ClaimStatusRequest;
import com.mastercard.developer.loyalty_benefits_client.model.SubmitClaimUserData;
import com.mastercard.developer.loyalty_benefits_client.model.SubmitClaimUserToken;
import com.squareup.okhttp.Call;

/**
 * API tests for InsuranceApi
 */
public class InsuranceApiTest {

    private InsuranceApi api;

    @Mock
    private ApiClient apiClientMock;
    
    @Mock
    private Call call;
    
	@Before
    public void setUp() throws ApiException {
               MockitoAnnotations.initMocks(this);
               api = new InsuranceApi(apiClientMock);
               when(apiClientMock.buildCall(any(String.class), any(String.class), any(List.class), any(List.class), any(Object.class), any(Map.class), any(Map.class), any(String[].class), (ProgressRequestBody.ProgressRequestListener)isNull())).thenReturn(call);
    }
	
    /**
     * Retrieve the claim status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @SuppressWarnings("rawtypes")
	@Test
    public void loyaltyInsuranceClaimSearchesPostTest() throws ApiException {
        
        ApiResponse apiResponse = new ApiResponse(200, null, new ClaimStatus());

        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);

        ClaimStatus response = api.loyaltyInsuranceClaimSearchesPost(new ClaimStatusRequest("1234","0000","eng"));
        assertNotNull(response);
    }
    
    /**
     * Retrieve the claim status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @SuppressWarnings("rawtypes")
	@Test(expected=ApiException.class)
    public void loyaltyInsuranceClaimSearchesPostTest_Exception() throws ApiException {
        
        ApiResponse apiResponse = new ApiResponse(200, null, new ClaimStatus());

        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);

        api.loyaltyInsuranceClaimSearchesPost(null);
    }
    
    /**
     * Create a user data token for submitting a new claim
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @SuppressWarnings("rawtypes")
	@Test
    public void loyaltyInsuranceUserDataTokensPostTest() throws ApiException {
    	
        ApiResponse apiResponse = new ApiResponse(200, null, new SubmitClaimUserToken());
        
        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
        
        SubmitClaimUserToken response = api.loyaltyInsuranceUserDataTokensPost(new SubmitClaimUserData());
        assertNotNull(response);
    }
    
    /**
     * Create a user data token for submitting a new claim
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @SuppressWarnings("rawtypes")
	@Test(expected=ApiException.class)
    public void loyaltyInsuranceUserDataTokensPostTest_Exception() throws ApiException {
    	
        ApiResponse apiResponse = new ApiResponse(200, null, new SubmitClaimUserToken());
        
        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
        
        api.loyaltyInsuranceUserDataTokensPost(null);
    }
    
}

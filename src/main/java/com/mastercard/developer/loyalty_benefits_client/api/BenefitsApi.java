/*Copyright (c) 2019 Mastercard
 
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

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.mastercard.developer.loyalty_benefits_client.ApiCallback;
import com.mastercard.developer.loyalty_benefits_client.ApiClient;
import com.mastercard.developer.loyalty_benefits_client.ApiException;
import com.mastercard.developer.loyalty_benefits_client.ApiResponse;
import com.mastercard.developer.loyalty_benefits_client.Configuration;
import com.mastercard.developer.loyalty_benefits_client.Pair;
import com.mastercard.developer.loyalty_benefits_client.ProgressRequestBody;
import com.mastercard.developer.loyalty_benefits_client.ProgressResponseBody;
import com.mastercard.developer.loyalty_benefits_client.model.AssignedBenefits;
import com.mastercard.developer.loyalty_benefits_client.model.Benefits;
import com.mastercard.developer.loyalty_benefits_client.model.BenefitsSelection;
import com.mastercard.developer.loyalty_benefits_client.model.BilheteRequest;

public class BenefitsApi {
    private ApiClient apiClient;

    public BenefitsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BenefitsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for loyaltyBenefitsAssignedBenefitsGet
     * @param ica Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. (required)
     * @param userId Opaque identifier for the consumer. This is the same userId used while enrolling for benefits via Bundle Profile API. (required)
     * @param panLastFourDigits Last four digits of user&#39;s registered 16 digit credit card number (required)
     * @param channel Delivery channel.  One of mobile, tablet, or web (optional)
     * @param preferredLanguage User&#39;s preferred language in localized ISO 639-1 format such as pt-BR (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyBenefitsAssignedBenefitsGetCall(Integer ica, String userId, String panLastFourDigits, String channel, String preferredLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/loyalty/benefits/reference/assigned-benefits";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ica != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("ica", ica));
        }

        if (userId != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("user_id", userId));
        }

        if (panLastFourDigits != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("pan_last_four_digits", panLastFourDigits));
        }

        if (channel != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("channel", channel));
        }

        if (preferredLanguage != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("preferred_language", preferredLanguage));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loyaltyBenefitsAssignedBenefitsGetValidateBeforeCall(Integer ica, String userId, String panLastFourDigits, String channel, String preferredLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ica' is set
        if (ica == null) {
            throw new ApiException("Missing the required parameter 'ica' when calling loyaltyBenefitsAssignedBenefitsGet(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling loyaltyBenefitsAssignedBenefitsGet(Async)");
        }
        
        // verify the required parameter 'panLastFourDigits' is set
        if (panLastFourDigits == null) {
            throw new ApiException("Missing the required parameter 'panLastFourDigits' when calling loyaltyBenefitsAssignedBenefitsGet(Async)");
        }
        

        com.squareup.okhttp.Call call = loyaltyBenefitsAssignedBenefitsGetCall(ica, userId, panLastFourDigits, channel, preferredLanguage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List of assigned benefits
     * 
     * @param ica Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. (required)
     * @param userId Opaque identifier for the consumer. This is the same userId used while enrolling for benefits via Bundle Profile API. (required)
     * @param panLastFourDigits Last four digits of user&#39;s registered 16 digit credit card number (required)
     * @param channel Delivery channel.  One of mobile, tablet, or web (optional)
     * @param preferredLanguage User&#39;s preferred language in localized ISO 639-1 format such as pt-BR (optional)
     * @return AssignedBenefits
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AssignedBenefits loyaltyBenefitsAssignedBenefitsGet(Integer ica, String userId, String panLastFourDigits, String channel, String preferredLanguage) throws ApiException {
        ApiResponse<AssignedBenefits> resp = loyaltyBenefitsAssignedBenefitsGetWithHttpInfo(ica, userId, panLastFourDigits, channel, preferredLanguage);
        return resp.getData();
    }

    /**
     * List of assigned benefits
     * 
     * @param ica Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. (required)
     * @param userId Opaque identifier for the consumer. This is the same userId used while enrolling for benefits via Bundle Profile API. (required)
     * @param panLastFourDigits Last four digits of user&#39;s registered 16 digit credit card number (required)
     * @param channel Delivery channel.  One of mobile, tablet, or web (optional)
     * @param preferredLanguage User&#39;s preferred language in localized ISO 639-1 format such as pt-BR (optional)
     * @return ApiResponse&lt;AssignedBenefits&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AssignedBenefits> loyaltyBenefitsAssignedBenefitsGetWithHttpInfo(Integer ica, String userId, String panLastFourDigits, String channel, String preferredLanguage) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyBenefitsAssignedBenefitsGetValidateBeforeCall(ica, userId, panLastFourDigits, channel, preferredLanguage, null, null);
        Type localVarReturnType = new TypeToken<AssignedBenefits>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List of assigned benefits (asynchronously)
     * 
     * @param ica Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. (required)
     * @param userId Opaque identifier for the consumer. This is the same userId used while enrolling for benefits via Bundle Profile API. (required)
     * @param panLastFourDigits Last four digits of user&#39;s registered 16 digit credit card number (required)
     * @param channel Delivery channel.  One of mobile, tablet, or web (optional)
     * @param preferredLanguage User&#39;s preferred language in localized ISO 639-1 format such as pt-BR (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyBenefitsAssignedBenefitsGetAsync(Integer ica, String userId, String panLastFourDigits, String channel, String preferredLanguage, final ApiCallback<AssignedBenefits> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = loyaltyBenefitsAssignedBenefitsGetValidateBeforeCall(ica, userId, panLastFourDigits, channel, preferredLanguage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AssignedBenefits>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyBenefitsBenefitSelectionsPost
     * @param benefitsSelection Selection payload (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyBenefitsBenefitSelectionsPostCall(BenefitsSelection benefitsSelection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = benefitsSelection;

        // create path and map variables
        String localVarPath = "/loyalty/benefits/reference/benefit-selections";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loyaltyBenefitsBenefitSelectionsPostValidateBeforeCall(BenefitsSelection benefitsSelection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'benefitsSelection' is set
        if (benefitsSelection == null) {
            throw new ApiException("Missing the required parameter 'benefitsSelection' when calling loyaltyBenefitsBenefitSelectionsPost(Async)");
        }
        

        com.squareup.okhttp.Call call = loyaltyBenefitsBenefitSelectionsPostCall(benefitsSelection, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Select optional benefits
     * 
     * @param benefitsSelection Selection payload (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void loyaltyBenefitsBenefitSelectionsPost(BenefitsSelection benefitsSelection) throws ApiException {
        loyaltyBenefitsBenefitSelectionsPostWithHttpInfo(benefitsSelection);
    }

    /**
     * Select optional benefits
     * 
     * @param benefitsSelection Selection payload (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> loyaltyBenefitsBenefitSelectionsPostWithHttpInfo(BenefitsSelection benefitsSelection) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyBenefitsBenefitSelectionsPostValidateBeforeCall(benefitsSelection, null, null);
        return apiClient.execute(call);
    }

    /**
     * Select optional benefits (asynchronously)
     * 
     * @param benefitsSelection Selection payload (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyBenefitsBenefitSelectionsPostAsync(BenefitsSelection benefitsSelection, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = loyaltyBenefitsBenefitSelectionsPostValidateBeforeCall(benefitsSelection, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for loyaltyBenefitsProductBenefitsGet
     * @param ica Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. (required)
     * @param productName Card product for which benefits have been set up by issuer during onboarding (i.e. black, gold) gold) (required)
     * @param channel Delivery channel.  One of mobile, tablet, or web (optional)
     * @param preferredLanguage User&#39;s preferred language in localized ISO 639-1 format such as pt-BR (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyBenefitsProductBenefitsGetCall(Integer ica, String productName, String channel, String preferredLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/loyalty/benefits/reference/product-benefits";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ica != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("ica", ica));
        }

        if (productName != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("product_name", productName));
        }

        if (channel != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("channel", channel));
        }

        if (preferredLanguage != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("preferred_language", preferredLanguage));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loyaltyBenefitsProductBenefitsGetValidateBeforeCall(Integer ica, String productName, String channel, String preferredLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ica' is set
        if (ica == null) {
            throw new ApiException("Missing the required parameter 'ica' when calling loyaltyBenefitsProductBenefitsGet(Async)");
        }
        
        // verify the required parameter 'productName' is set
        if (productName == null) {
            throw new ApiException("Missing the required parameter 'productName' when calling loyaltyBenefitsProductBenefitsGet(Async)");
        }
        

        com.squareup.okhttp.Call call = loyaltyBenefitsProductBenefitsGetCall(ica, productName, channel, preferredLanguage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all default and selectable benefits for the card product
     * 
     * @param ica Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. (required)
     * @param productName Card product for which benefits have been set up by issuer during onboarding (i.e. black, gold) gold) (required)
     * @param channel Delivery channel.  One of mobile, tablet, or web (optional)
     * @param preferredLanguage User&#39;s preferred language in localized ISO 639-1 format such as pt-BR (optional)
     * @return Benefits
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Benefits loyaltyBenefitsProductBenefitsGet(Integer ica, String productName, String channel, String preferredLanguage) throws ApiException {
        ApiResponse<Benefits> resp = loyaltyBenefitsProductBenefitsGetWithHttpInfo(ica, productName, channel, preferredLanguage);
        return resp.getData();
    }

    /**
     * List all default and selectable benefits for the card product
     * 
     * @param ica Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. (required)
     * @param productName Card product for which benefits have been set up by issuer during onboarding (i.e. black, gold) gold) (required)
     * @param channel Delivery channel.  One of mobile, tablet, or web (optional)
     * @param preferredLanguage User&#39;s preferred language in localized ISO 639-1 format such as pt-BR (optional)
     * @return ApiResponse&lt;Benefits&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Benefits> loyaltyBenefitsProductBenefitsGetWithHttpInfo(Integer ica, String productName, String channel, String preferredLanguage) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyBenefitsProductBenefitsGetValidateBeforeCall(ica, productName, channel, preferredLanguage, null, null);
        Type localVarReturnType = new TypeToken<Benefits>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all default and selectable benefits for the card product (asynchronously)
     * 
     * @param ica Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. (required)
     * @param productName Card product for which benefits have been set up by issuer during onboarding (i.e. black, gold) gold) (required)
     * @param channel Delivery channel.  One of mobile, tablet, or web (optional)
     * @param preferredLanguage User&#39;s preferred language in localized ISO 639-1 format such as pt-BR (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyBenefitsProductBenefitsGetAsync(Integer ica, String productName, String channel, String preferredLanguage, final ApiCallback<Benefits> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = loyaltyBenefitsProductBenefitsGetValidateBeforeCall(ica, productName, channel, preferredLanguage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Benefits>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    

    /**
     * Build call for insuranceCertificatesPost
     * @param bilheteRequest Bilhete payload (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insuranceCertificatesPostCall(BilheteRequest bilheteRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = bilheteRequest;

        // create path and map variables
        String localVarPath = "/loyalty/benefits/reference/insurance-certificates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insuranceCertificatesPostValidateBeforeCall(BilheteRequest bilheteRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'bilheteRequest' is set
        if (bilheteRequest == null) {
            throw new ApiException("Missing the required parameter 'bilheteRequest' when calling insuranceCertificatesPost(Async)");
        }
        

        com.squareup.okhttp.Call call = insuranceCertificatesPostCall(bilheteRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Submit Insurance Certificates request
     * 
     * @param bilheteRequest Bilhete payload (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void insuranceCertificatesPost(BilheteRequest bilheteRequest) throws ApiException {
        insuranceCertificatesPostWithHttpInfo(bilheteRequest);
    }

    /**
     * Submit Insurance Certificates request
     * 
     * @param bilheteRequest Bilhete payload (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> insuranceCertificatesPostWithHttpInfo(BilheteRequest bilheteRequest) throws ApiException {
        com.squareup.okhttp.Call call = insuranceCertificatesPostValidateBeforeCall(bilheteRequest, null, null);
        return apiClient.execute(call);
    }

    /**
     * Submit Insurance Certificates request (asynchronously)
     * 
     * @param bilheteRequest Bilhete payload (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call insuranceCertificatesPostAsync(BilheteRequest bilheteRequest, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = insuranceCertificatesPostValidateBeforeCall(bilheteRequest, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}

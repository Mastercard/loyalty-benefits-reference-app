# InsuranceApi

All URIs are relative to *https://api.mastercard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loyaltyInsuranceClaimSearchesPost**](InsuranceApi.md#loyaltyInsuranceClaimSearchesPost) | **POST** /loyalty/insurance/claim-searches | Retrieve the claim status
[**loyaltyInsuranceUserDataTokensPost**](InsuranceApi.md#loyaltyInsuranceUserDataTokensPost) | **POST** /loyalty/insurance/user-data-tokens | Create a user data token for submitting a new claim


<a name="loyaltyInsuranceClaimSearchesPost"></a>
# **loyaltyInsuranceClaimSearchesPost**
> ClaimStatus loyaltyInsuranceClaimSearchesPost(claimStatusRequest)

Retrieve the claim status

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_benefits_client.ApiException;
//import com.mastercard.developer.loyalty_benefits_client.api.InsuranceApi;


InsuranceApi apiInstance = new InsuranceApi();
ClaimStatusRequest claimStatusRequest = new ClaimStatusRequest(); // ClaimStatusRequest | Claim status payload
try {
    ClaimStatus result = apiInstance.loyaltyInsuranceClaimSearchesPost(claimStatusRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#loyaltyInsuranceClaimSearchesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **claimStatusRequest** | [**ClaimStatusRequest**](ClaimStatusRequest.md)| Claim status payload |

### Return type

[**ClaimStatus**](ClaimStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loyaltyInsuranceUserDataTokensPost"></a>
# **loyaltyInsuranceUserDataTokensPost**
> SubmitClaimUserToken loyaltyInsuranceUserDataTokensPost(submitClaimUserData)

Create a user data token for submitting a new claim

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_benefits_client.ApiException;
//import com.mastercard.developer.loyalty_benefits_client.api.InsuranceApi;


InsuranceApi apiInstance = new InsuranceApi();
SubmitClaimUserData submitClaimUserData = new SubmitClaimUserData(); // SubmitClaimUserData | User data
try {
    SubmitClaimUserToken result = apiInstance.loyaltyInsuranceUserDataTokensPost(submitClaimUserData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#loyaltyInsuranceUserDataTokensPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submitClaimUserData** | [**SubmitClaimUserData**](SubmitClaimUserData.md)| User data |

### Return type

[**SubmitClaimUserToken**](SubmitClaimUserToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


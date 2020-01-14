# BenefitsApi

All URIs are relative to *https://api.mastercard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loyaltyBenefitsAssignedBenefitsGet**](BenefitsApi.md#loyaltyBenefitsAssignedBenefitsGet) | **GET** /loyalty/benefits/assigned-benefits | List of assigned benefits
[**loyaltyBenefitsBenefitSelectionsPost**](BenefitsApi.md#loyaltyBenefitsBenefitSelectionsPost) | **POST** /loyalty/benefits/benefit-selections | Select optional benefits
[**loyaltyBenefitsProductBenefitsGet**](BenefitsApi.md#loyaltyBenefitsProductBenefitsGet) | **GET** /loyalty/benefits/product-benefits | List all default and selectable benefits for the card product


<a name="loyaltyBenefitsAssignedBenefitsGet"></a>
# **loyaltyBenefitsAssignedBenefitsGet**
> AssignedBenefits loyaltyBenefitsAssignedBenefitsGet(ica, userId, panLastFourDigits, channel, preferredLanguage)

List of assigned benefits

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_benefits_client.ApiException;
//import com.mastercard.developer.loyalty_benefits_client.api.BenefitsApi;


BenefitsApi apiInstance = new BenefitsApi();
Integer ica = 4567; // Integer | Card Issuer's ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution.
String userId = user1235; // String | Opaque identifier for the consumer. This is the same userId used while enrolling for benefits via Bundle Profile API.
String panLastFourDigits = 2244; // String | Last four digits of user's registered 16 digit credit card number
String channel = mobile; // String | Delivery channel.  One of mobile, tablet, or web
String preferredLanguage = pt-BR; // String | User's preferred language in localized ISO 639-1 format such as pt-BR
try {
    AssignedBenefits result = apiInstance.loyaltyBenefitsAssignedBenefitsGet(ica, userId, panLastFourDigits, channel, preferredLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenefitsApi#loyaltyBenefitsAssignedBenefitsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ica** | **Integer**| Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. |
 **userId** | **String**| Opaque identifier for the consumer. This is the same userId used while enrolling for benefits via Bundle Profile API. |
 **panLastFourDigits** | **String**| Last four digits of user&#39;s registered 16 digit credit card number |
 **channel** | **String**| Delivery channel.  One of mobile, tablet, or web | [optional]
 **preferredLanguage** | **String**| User&#39;s preferred language in localized ISO 639-1 format such as pt-BR | [optional]

### Return type

[**AssignedBenefits**](AssignedBenefits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loyaltyBenefitsBenefitSelectionsPost"></a>
# **loyaltyBenefitsBenefitSelectionsPost**
> loyaltyBenefitsBenefitSelectionsPost(benefitsSelection)

Select optional benefits

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_benefits_client.ApiException;
//import com.mastercard.developer.loyalty_benefits_client.api.BenefitsApi;


BenefitsApi apiInstance = new BenefitsApi();
BenefitsSelection benefitsSelection = new BenefitsSelection(); // BenefitsSelection | Selection payload
try {
    apiInstance.loyaltyBenefitsBenefitSelectionsPost(benefitsSelection);
} catch (ApiException e) {
    System.err.println("Exception when calling BenefitsApi#loyaltyBenefitsBenefitSelectionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benefitsSelection** | [**BenefitsSelection**](BenefitsSelection.md)| Selection payload |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loyaltyBenefitsProductBenefitsGet"></a>
# **loyaltyBenefitsProductBenefitsGet**
> Benefits loyaltyBenefitsProductBenefitsGet(ica, productName, channel, preferredLanguage)

List all default and selectable benefits for the card product

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_benefits_client.ApiException;
//import com.mastercard.developer.loyalty_benefits_client.api.BenefitsApi;


BenefitsApi apiInstance = new BenefitsApi();
Integer ica = 4567; // Integer | Card Issuer's ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution.
String productName = black; // String | Card product for which benefits have been set up by issuer during onboarding (i.e. black, gold) gold)
String channel = mobile; // String | Delivery channel.  One of mobile, tablet, or web
String preferredLanguage = pt-BR; // String | User's preferred language in localized ISO 639-1 format such as pt-BR
try {
    Benefits result = apiInstance.loyaltyBenefitsProductBenefitsGet(ica, productName, channel, preferredLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenefitsApi#loyaltyBenefitsProductBenefitsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ica** | **Integer**| Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. |
 **productName** | **String**| Card product for which benefits have been set up by issuer during onboarding (i.e. black, gold) gold) |
 **channel** | **String**| Delivery channel.  One of mobile, tablet, or web | [optional]
 **preferredLanguage** | **String**| User&#39;s preferred language in localized ISO 639-1 format such as pt-BR | [optional]

### Return type

[**Benefits**](Benefits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


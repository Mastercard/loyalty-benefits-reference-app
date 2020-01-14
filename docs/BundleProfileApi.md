# BundleProfileApi

All URIs are relative to *https://api.mastercard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](BundleProfileApi.md#createUser) | **POST** /bundle/profile/users | Create Profile


<a name="createUser"></a>
# **createUser**
> BundleUserResponse createUser(bundleUser)

Create Profile

Create Profile user and associated product service(s) consents and card account(s)

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_benefits_client.ApiException;
//import com.mastercard.developer.loyalty_benefits_client.api.BundleProfileApi;


BundleProfileApi apiInstance = new BundleProfileApi();
BundleUser bundleUser = new BundleUser(); // BundleUser | Bundle Profile body
try {
    BundleUserResponse result = apiInstance.createUser(bundleUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundleProfileApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleUser** | [**BundleUser**](BundleUser.md)| Bundle Profile body |

### Return type

[**BundleUserResponse**](BundleUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# BilheteRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ica** | **Integer** | Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. | 
**userId** | **String** | Opaque identifier for the consumer. This is the same userId used while enrolling for benefits via Bundle Profile API. | 
**cardProductType** | **String** | Card product for which benefits have been set up by issuer during onboarding (i.e. black, gold) | 
**panLastFourDigits** | **String** | Last four digits of the user&#39;s registered 16 digit card | 
**additionalInformation** | [**BilheteRequestAdditionalInformation**](BilheteRequestAdditionalInformation.md) |  | 




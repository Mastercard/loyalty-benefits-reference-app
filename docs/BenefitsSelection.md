
# BenefitsSelection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ica** | **Integer** | Card Issuer&#39;s ICA Number (Interbank Card Association number). A four digit number assigned by MasterCard to a financial institution. | 
**userId** | **String** | Opaque identifier for the consumer. Issuer/Acquirer to send it complies to IETF RFC2396; MC provisions it depends on the use case, such as user123-partnerBank | 
**cardProductType** | **String** | Card product for which benefits have been set up by issuer during onboarding (i.e. black, gold) | 
**panLastFourDigits** | **String** | Last four digits of user&#39;s registered 16 digit credit card number | 
**benefitIds** | **List&lt;String&gt;** | Array of benefit IDs to assign to user. Typically holds benefitIds selected by user. | 
**additionalInformation** | [**BenefitsSelectionAdditionalInformation**](BenefitsSelectionAdditionalInformation.md) |  |  [optional]




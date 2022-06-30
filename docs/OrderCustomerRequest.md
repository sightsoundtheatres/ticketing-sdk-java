

# OrderCustomerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**phoneNumber** | **String** |  |  [optional] |
|**phoneType** | [**PhoneTypeEnum**](#PhoneTypeEnum) |  |  [optional] |
|**emailAddress** | **String** |  |  [optional] |
|**organizationName** | **String** |  |  [optional] |
|**billingAddress** | [**AddressExtended**](AddressExtended.md) |  |  [optional] |
|**shippingAddress** | [**AddressExtended**](AddressExtended.md) |  |  [optional] |
|**websiteCustomerSearchRequest** | [**CreateWebsiteCustomerRequest**](CreateWebsiteCustomerRequest.md) |  |  [optional] |



## Enum: PhoneTypeEnum

| Name | Value |
|---- | -----|
| FAX | &quot;FAX&quot; |
| WORK | &quot;WORK&quot; |
| DAYTIME | &quot;DAYTIME&quot; |
| HOME | &quot;HOME&quot; |
| CHURCH | &quot;CHURCH&quot; |
| EVENING | &quot;EVENING&quot; |
| CELL | &quot;CELL&quot; |
| MOBILE | &quot;MOBILE&quot; |
| AUTH_USER | &quot;AUTH_USER&quot; |




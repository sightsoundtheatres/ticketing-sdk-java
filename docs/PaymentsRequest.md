

# PaymentsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountInfo** | [**AccountInfo**](AccountInfo.md) |  |  [optional] |
|**additionalData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**amount** | [**Amount**](Amount.md) |  |  [optional] |
|**billingAddress** | [**Address**](Address.md) |  |  [optional] |
|**captureDelayHours** | **Integer** |  |  [optional] |
|**checkoutAttemptId** | **String** |  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) |  |  [optional] |
|**company** | [**Company**](Company.md) |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**dateOfBirth** | **OffsetDateTime** |  |  [optional] |
|**dccQuote** | [**ForexQuote**](ForexQuote.md) |  |  [optional] |
|**deliveryAddress** | [**Address**](Address.md) |  |  [optional] |
|**deliveryDate** | **OffsetDateTime** |  |  [optional] |
|**enableOneClick** | **Boolean** |  |  [optional] |
|**enablePayOut** | **Boolean** |  |  [optional] |
|**enableRecurring** | **Boolean** |  |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  [optional] |
|**fraudOffset** | **Integer** |  |  [optional] |
|**installments** | [**Installments**](Installments.md) |  |  [optional] |
|**lineItems** | [**List&lt;LineItem&gt;**](LineItem.md) |  |  [optional] |
|**mcc** | **String** |  |  [optional] |
|**merchantAccount** | **String** |  |  [optional] |
|**merchantOrderReference** | **String** |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |
|**orderReference** | **String** |  |  [optional] |
|**paymentMethod** | [**PaymentMethodDetails**](PaymentMethodDetails.md) |  |  [optional] |
|**reference** | **String** |  |  [optional] |
|**returnUrl** | **String** |  |  [optional] |
|**sessionValidity** | **String** |  |  [optional] |
|**shopperEmail** | **String** |  |  [optional] |
|**shopperIP** | **String** |  |  [optional] |
|**shopperInteraction** | [**ShopperInteractionEnum**](#ShopperInteractionEnum) |  |  [optional] |
|**shopperLocale** | **String** |  |  [optional] |
|**shopperName** | [**Name**](Name.md) |  |  [optional] |
|**shopperReference** | **String** |  |  [optional] |
|**shopperStatement** | **String** |  |  [optional] |
|**socialSecurityNumber** | **String** |  |  [optional] |
|**telephoneNumber** | **String** |  |  [optional] |
|**browserInfo** | [**BrowserInfo**](BrowserInfo.md) |  |  [optional] |
|**deviceFingerprint** | **String** |  |  [optional] |
|**applicationInfo** | [**ApplicationInfo**](ApplicationInfo.md) |  |  [optional] |
|**splits** | [**List&lt;Split&gt;**](Split.md) |  |  [optional] |
|**merchantRiskIndicator** | [**MerchantRiskIndicator**](MerchantRiskIndicator.md) |  |  [optional] |
|**threeDS2RequestData** | [**ThreeDS2RequestData**](ThreeDS2RequestData.md) |  |  [optional] |
|**trustedShopper** | **Boolean** |  |  [optional] |
|**origin** | **String** |  |  [optional] |
|**recurringProcessingModel** | [**RecurringProcessingModelEnum**](#RecurringProcessingModelEnum) |  |  [optional] |
|**mpiData** | [**ThreeDSecureData**](ThreeDSecureData.md) |  |  [optional] |
|**redirectFromIssuerMethod** | **String** |  |  [optional] |
|**redirectToIssuerMethod** | **String** |  |  [optional] |
|**order** | [**CheckoutOrder**](CheckoutOrder.md) |  |  [optional] |
|**storePaymentMethod** | **Boolean** |  |  [optional] |
|**store** | **String** |  |  [optional] |
|**threeDSAuthenticationOnly** | **Boolean** |  |  [optional] |
|**riskData** | [**RiskData**](RiskData.md) |  |  [optional] |
|**conversionId** | **String** |  |  [optional] |
|**recurringExpiry** | **String** |  |  [optional] |
|**recurringFrequency** | **String** |  |  [optional] |
|**mandate** | [**Mandate**](Mandate.md) |  |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| IOS | &quot;iOS&quot; |
| ANDROID | &quot;Android&quot; |
| WEB | &quot;Web&quot; |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| NATURALPERSON | &quot;NaturalPerson&quot; |
| COMPANYNAME | &quot;CompanyName&quot; |



## Enum: ShopperInteractionEnum

| Name | Value |
|---- | -----|
| ECOMMERCE | &quot;Ecommerce&quot; |
| CONTAUTH | &quot;ContAuth&quot; |
| MOTO | &quot;Moto&quot; |
| POS | &quot;POS&quot; |



## Enum: RecurringProcessingModelEnum

| Name | Value |
|---- | -----|
| SUBSCRIPTION | &quot;Subscription&quot; |
| CARDONFILE | &quot;CardOnFile&quot; |
| UNSCHEDULEDCARDONFILE | &quot;UnscheduledCardOnFile&quot; |






# Customer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerNumber** | **Long** |  |  [optional] |
|**companyName** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**mailingList** | **Boolean** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**corpIdExpirationDate** | **OffsetDateTime** |  |  [optional] |
|**lastBookingDate** | **OffsetDateTime** |  |  [optional] |
|**numberBookedCurrYear** | **Integer** |  |  [optional] |
|**numberCanceledCurrYear** | **Integer** |  |  [optional] |
|**numberBookedLastYear** | **Integer** |  |  [optional] |
|**numberCanceledLastYear** | **Integer** |  |  [optional] |
|**numberBookedNextYear** | **Integer** |  |  [optional] |
|**numberCanceledNextYear** | **Integer** |  |  [optional] |
|**addUserId** | **String** |  |  [optional] |
|**addDate** | **OffsetDateTime** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**sourceCode** | **String** |  |  [optional] |
|**additionalDiscPercent** | **BigDecimal** |  |  [optional] |
|**corpIdNumber** | **String** |  |  [optional] |
|**corpAffiliatedCode** | **String** |  |  [optional] |
|**sourceCodeComments** | **String** |  |  [optional] |
|**emailList** | **Boolean** |  |  [optional] |
|**emailStyle** | **String** |  |  [optional] |
|**rpOfficeNumber** | **String** |  |  [optional] |
|**taxExempt** | **Boolean** |  |  [optional] |
|**oldCustTypeCode** | [**OldCustTypeCodeEnum**](#OldCustTypeCodeEnum) |  |  [optional] |
|**callList** | **Boolean** |  |  [optional] |
|**textList** | **Boolean** |  |  [optional] |
|**address** | [**AddressExtended**](AddressExtended.md) |  |  |
|**sysProcessDate** | **OffsetDateTime** |  |  [optional] |
|**sysStatusCode** | **String** |  |  [optional] |
|**sysCheckDate** | **OffsetDateTime** |  |  [optional] |
|**sysCheckResult** | **String** |  |  [optional] |
|**club** | **Boolean** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**birthDay** | **String** |  |  [optional] |
|**birthMonth** | **String** |  |  [optional] |
|**birthYear** | **String** |  |  [optional] |
|**press** | **Boolean** |  |  [optional] |
|**clubMemberCancelComments** | **String** |  |  [optional] |
|**ageRange** | **String** |  |  [optional] |
|**clubCancelDate** | **OffsetDateTime** |  |  [optional] |
|**specialNeeds** | **Boolean** |  |  [optional] |
|**addressVerifyDate** | **OffsetDateTime** |  |  [optional] |
|**custDetail** | **Boolean** |  |  [optional] |
|**fitFrozen** | **Boolean** |  |  [optional] |
|**fitMaxTickets** | **Integer** |  |  [optional] |
|**fitMaxTicketsEmailSent** | **Boolean** |  |  [optional] |
|**addressVerifyFailDate** | **OffsetDateTime** |  |  [optional] |
|**fitPrepaidThresholdEmail** | **Boolean** |  |  [optional] |
|**fitFrozenOverride** | **Boolean** |  |  [optional] |
|**passPhrase** | **String** |  |  [optional] |
|**extraCompTickets** | **Integer** |  |  [optional] |
|**empNumber** | **Long** |  |  [optional] |
|**bookUntilDate** | **OffsetDateTime** |  |  [optional] |
|**checkPayment** | **Boolean** |  |  [optional] |
|**emailPaperwork** | **Boolean** |  |  [optional] |
|**emailVerifiedDate** | **OffsetDateTime** |  |  [optional] |
|**church** | **Boolean** |  |  [optional] |
|**congregationSize** | **Integer** |  |  [optional] |
|**marketingPartner** | **Boolean** |  |  [optional] |
|**immediateSeatAssign** | **Boolean** |  |  [optional] |
|**printETicket** | **Boolean** |  |  [optional] |
|**slidingScaleDiscount** | **Boolean** |  |  [optional] |
|**groupNumber** | **Integer** |  |  [optional] |
|**tier** | **Boolean** |  |  [optional] |
|**tour** | **Boolean** |  |  [optional] |
|**receptive** | **Boolean** |  |  [optional] |
|**employeeExitDate** | **OffsetDateTime** |  |  [optional] |
|**group** | **Boolean** |  |  [optional] |
|**lastShowCode** | **String** |  |  [optional] |
|**lastShowDate** | **OffsetDateTime** |  |  [optional] |
|**lastShowTickets** | **String** |  |  [optional] |
|**lastShowOrderNumber** | **Integer** |  |  [optional] |
|**company** | **Boolean** |  |  [optional] |
|**uspsAddressError** | **String** |  |  [optional] |
|**ticketDelivery** | [**TicketDeliveryEnum**](#TicketDeliveryEnum) |  |  [optional] |
|**documents** | [**List&lt;CustomerDocument&gt;**](CustomerDocument.md) |  |  [optional] |
|**upsAddresses** | [**List&lt;CustomerUPSAddress&gt;**](CustomerUPSAddress.md) |  |  [optional] |
|**prices** | [**List&lt;CustomerPricingLevel&gt;**](CustomerPricingLevel.md) |  |  [optional] |
|**phones** | [**List&lt;CustomerPhone&gt;**](CustomerPhone.md) |  |  [optional] |
|**contacts** | [**List&lt;CustomerContactInfo&gt;**](CustomerContactInfo.md) |  |  [optional] |
|**customerAttributes** | [**List&lt;CustomerAttribute&gt;**](CustomerAttribute.md) |  |  [optional] |
|**orders** | [**List&lt;Order&gt;**](Order.md) |  |  [optional] |
|**notes** | [**List&lt;Note&gt;**](Note.md) |  |  [optional] |
|**additionalContacts** | [**List&lt;CustomerContactInfo&gt;**](CustomerContactInfo.md) |  |  [optional] |
|**employee** | **Boolean** |  |  [optional] |
|**reseller** | **Boolean** |  |  [optional] |
|**customerTypeResponse** | [**CustomerTypeResponseEnum**](#CustomerTypeResponseEnum) |  |  [optional] |
|**defaultPhoneNumber** | **String** |  |  [optional] |
|**generalConsumer** | **Boolean** |  |  [optional] |
|**customerNameToDisplay** | **String** |  |  [optional] |
|**primaryContact** | [**CustomerContactInfo**](CustomerContactInfo.md) |  |  [optional] |
|**accountFrozen** | **Boolean** |  |  [optional] |
|**organization** | **Boolean** |  |  [optional] |
|**addressVerifiedStatus** | [**AddressVerifiedStatusEnum**](#AddressVerifiedStatusEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONSUMER | &quot;CONSUMER&quot; |
| PARTNER | &quot;PARTNER&quot; |
| POS | &quot;POS&quot; |
| GROUP | &quot;GROUP&quot; |



## Enum: OldCustTypeCodeEnum

| Name | Value |
|---- | -----|
| HOUSE_ACCOUNT | &quot;House Account&quot; |
| COMP_LETTER | &quot;Comp Letter&quot; |



## Enum: TicketDeliveryEnum

| Name | Value |
|---- | -----|
| AGENT | &quot;AGENT&quot; |
| ETICKET | &quot;ETICKET&quot; |
| HELD | &quot;HELD&quot; |



## Enum: CustomerTypeResponseEnum

| Name | Value |
|---- | -----|
| CONSUMER | &quot;CONSUMER&quot; |
| ORGANIZATION | &quot;ORGANIZATION&quot; |
| RESELLER | &quot;RESELLER&quot; |
| EMPLOYEE | &quot;EMPLOYEE&quot; |



## Enum: AddressVerifiedStatusEnum

| Name | Value |
|---- | -----|
| UNEXPIRED | &quot;UNEXPIRED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNVERIFIED | &quot;UNVERIFIED&quot; |






# Special


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**specialCode** | **String** |  |  |
|**longDescription** | **String** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**seatsAvailableLimit** | **Integer** |  |  [optional] |
|**numberEventsInCombo** | **String** |  |  |
|**allowCustTypeDisc** | **Boolean** |  |  [optional] |
|**acceptOrderStartDate** | **OffsetDateTime** |  |  |
|**acceptOrderEndDate** | **OffsetDateTime** |  |  |
|**specialTypeCode** | [**SpecialTypeCodeEnum**](#SpecialTypeCodeEnum) |  |  |
|**custFirstOrder** | **Boolean** |  |  [optional] |
|**detailsValueTypeCode** | **String** |  |  |
|**couponLine1** | **String** |  |  [optional] |
|**couponLine2** | **String** |  |  [optional] |
|**couponLine3** | **String** |  |  [optional] |
|**couponLine4** | **String** |  |  [optional] |
|**couponLine5** | **String** |  |  [optional] |
|**showSpanDays** | **Integer** |  |  [optional] |
|**autoApply** | **Boolean** |  |  [optional] |
|**groupMinimum** | **Long** |  |  [optional] |
|**groupMaximum** | **Long** |  |  [optional] |
|**finalSale** | **Boolean** |  |  [optional] |
|**waiveTrans** | **Boolean** |  |  [optional] |
|**heldBatch** | **Boolean** |  |  [optional] |
|**allowTier** | **Boolean** |  |  [optional] |
|**allowHot** | **Boolean** |  |  [optional] |
|**allowFit** | **Boolean** |  |  [optional] |
|**allowOrdertix** | **Boolean** |  |  [optional] |
|**custDiscAddonOnly** | **Boolean** |  |  [optional] |
|**subTypeCode** | [**SubTypeCodeEnum**](#SubTypeCodeEnum) |  |  [optional] |
|**specialComments** | **String** |  |  [optional] |
|**showDayMins** | **Integer** |  |  [optional] |
|**allowEmployee** | **Boolean** |  |  [optional] |
|**validateZipCode** | **Boolean** |  |  [optional] |
|**allowGroupDisc** | **Boolean** |  |  [optional] |
|**waiveDeposit** | **Boolean** |  |  [optional] |
|**allowFreeTicket** | **Boolean** |  |  [optional] |
|**maxDiscCount** | **Integer** |  |  [optional] |
|**rptColor** | **String** |  |  [optional] |
|**rptDescription** | **String** |  |  [optional] |
|**rptNotes** | **String** |  |  [optional] |
|**rptGroupName** | **String** |  |  [optional] |
|**rptDisplayName** | **String** |  |  [optional] |
|**allowIndividual** | **Boolean** |  |  [optional] |
|**restriction** | [**RestrictionEnum**](#RestrictionEnum) |  |  [optional] |
|**salesConf** | **Boolean** |  |  [optional] |
|**salesConfCat** | **String** |  |  [optional] |
|**detail** | [**Set&lt;SpecialDetail&gt;**](SpecialDetail.md) |  |  [optional] |
|**events** | [**Set&lt;SpecialAssociatedEvent&gt;**](SpecialAssociatedEvent.md) |  |  [optional] |
|**corpAffilCodes** | [**Set&lt;SpecialType&gt;**](SpecialType.md) |  |  [optional] |
|**specialAutoApplied** | **Boolean** |  |  [optional] |
|**savings** | **BigDecimal** |  |  [optional] |
|**validForIndividual** | **Boolean** |  |  [optional] |
|**validForOrderTix** | **Boolean** |  |  [optional] |
|**compsSpecial** | **Boolean** |  |  [optional] |



## Enum: SpecialTypeCodeEnum

| Name | Value |
|---- | -----|
| BUY_GET | &quot;BUY_GET&quot; |
| COMBO | &quot;COMBO&quot; |
| MULTI_EVENT | &quot;MULTI_EVENT&quot; |
| NET | &quot;NET&quot; |



## Enum: SubTypeCodeEnum

| Name | Value |
|---- | -----|
| _1FAMPACK | &quot;1FAMPACK&quot; |
| _2FAMPACK | &quot;2FAMPACK&quot; |
| NET | &quot;NET&quot; |
| SHOWDAY | &quot;SHOWDAY&quot; |



## Enum: RestrictionEnum

| Name | Value |
|---- | -----|
| I | &quot;I&quot; |
| E | &quot;E&quot; |
| N | &quot;N&quot; |




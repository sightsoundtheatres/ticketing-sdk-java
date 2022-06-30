

# Event


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventCode** | **String** |  |  [optional] |
|**eventName** | **String** |  |  [optional] |
|**itemType** | [**ItemTypeEnum**](#ItemTypeEnum) |  |  [optional] |
|**eventTimeMinutes** | **Integer** |  |  [optional] |
|**ticketed** | **Boolean** |  |  [optional] |
|**ticketStyleCode** | **String** |  |  [optional] |
|**locationCode** | **String** |  |  [optional] |
|**seatingTemplateCode** | **String** |  |  [optional] |
|**eventDisplayColor** | **String** |  |  [optional] |
|**allowOrderTix** | **Boolean** |  |  [optional] |
|**internetSeatsMinimumLimit** | **Integer** |  |  [optional] |
|**eventStartDate** | **OffsetDateTime** |  |  [optional] |
|**eventEndDate** | **OffsetDateTime** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**eventTypeDetailCode** | **String** |  |  [optional] |
|**compTicketsSeatsMin** | **Integer** |  |  [optional] |
|**compTicketsStartDate** | **OffsetDateTime** |  |  [optional] |
|**theaterLocation** | [**TheaterLocationEnum**](#TheaterLocationEnum) |  |  [optional] |
|**empDiscDaysToShow** | **Integer** |  |  [optional] |
|**empDiscPercent** | **BigDecimal** |  |  [optional] |
|**taxCode** | **String** |  |  [optional] |
|**externalBooking** | **Boolean** |  |  [optional] |
|**externalBookingThreshold** | **Integer** |  |  [optional] |
|**compTicketsMax** | **Integer** |  |  [optional] |
|**empDayTicketsMax** | **Integer** |  |  [optional] |
|**premierShow** | **Boolean** |  |  [optional] |
|**taxable** | **Boolean** |  |  [optional] |
|**allowGroup** | **Boolean** |  |  [optional] |
|**empSeatsMin** | **Integer** |  |  [optional] |
|**empShowMinutes** | **Integer** |  |  [optional] |
|**empShowMinutesSeatsMin** | **Integer** |  |  [optional] |
|**partnerEvent** | **Boolean** |  |  [optional] |
|**enTaxCode** | **String** |  |  [optional] |
|**eventLogoUrl** | **String** |  |  [optional] |
|**txnCharge** | **Boolean** |  |  [optional] |
|**allowGroupDisc** | **Boolean** |  |  [optional] |
|**sortSequence** | **Integer** |  |  [optional] |
|**schedule** | [**List&lt;Schedule&gt;**](Schedule.md) |  |  [optional] |
|**showTrackingDetails** | [**List&lt;ShowTrackingDetail&gt;**](ShowTrackingDetail.md) |  |  [optional] |
|**budget** | [**ShowBudget**](ShowBudget.md) |  |  [optional] |
|**zonedEventEndDateTime** | **OffsetDateTime** |  |  [optional] |
|**zonedEventStartDateTime** | **OffsetDateTime** |  |  [optional] |



## Enum: ItemTypeEnum

| Name | Value |
|---- | -----|
| SHOW | &quot;SHOW&quot; |
| TOUR | &quot;TOUR&quot; |
| CHARGE | &quot;CHARGE&quot; |
| MERCH | &quot;MERCH&quot; |
| SHIPPING | &quot;SHIPPING&quot; |
| GIFTCARD | &quot;GIFTCARD&quot; |
| ATTRACTION | &quot;ATTRACTION&quot; |
| COUPON | &quot;COUPON&quot; |
| FOOD | &quot;FOOD&quot; |
| HOTEL | &quot;HOTEL&quot; |
| INTLSHIPPING | &quot;INTLSHIPPING&quot; |
| MEAL | &quot;MEAL&quot; |
| MERCHANDISE | &quot;MERCHANDISE&quot; |
| MERCHSHIPPING | &quot;MERCHSHIPPING&quot; |
| MISC | &quot;MISC&quot; |
| VMEAL | &quot;VMEAL&quot; |



## Enum: TheaterLocationEnum

| Name | Value |
|---- | -----|
| STRASBURG_PA | &quot;STRASBURG_PA&quot; |
| BRANSON_MO | &quot;BRANSON_MO&quot; |




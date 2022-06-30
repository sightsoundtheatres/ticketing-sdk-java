

# CustomerPricingLevel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerNumber** | **Long** |  |  [optional] |
|**pricingLevel** | [**PricingLevelEnum**](#PricingLevelEnum) |  |  [optional] |
|**tierYear** | **Integer** |  |  [optional] |
|**booked** | **Integer** |  |  [optional] |
|**cancelled** | **Integer** |  |  [optional] |
|**slidingScaleTickets** | **Integer** |  |  [optional] |
|**slidingScaleDiscount** | **BigDecimal** |  |  [optional] |
|**tickets1** | **Integer** |  |  [optional] |
|**percent1** | **BigDecimal** |  |  [optional] |
|**tickets2** | **Integer** |  |  [optional] |
|**percent2** | **BigDecimal** |  |  [optional] |
|**tickets3** | **Integer** |  |  [optional] |
|**percent3** | **BigDecimal** |  |  [optional] |
|**tickets4** | **Integer** |  |  [optional] |
|**percent4** | **BigDecimal** |  |  [optional] |
|**tickets5** | **Integer** |  |  [optional] |
|**percent5** | **BigDecimal** |  |  [optional] |
|**salesRepId** | **String** |  |  [optional] |
|**bookingLocation** | [**BookingLocationEnum**](#BookingLocationEnum) |  |  [optional] |
|**postPay** | **Boolean** |  |  [optional] |
|**ticketIncrease** | **Integer** |  |  [optional] |
|**ticketDecrease** | **Integer** |  |  [optional] |
|**speculativeBooking** | **Integer** |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |



## Enum: PricingLevelEnum

| Name | Value |
|---- | -----|
| NOLEVEL | &quot;NOLEVEL&quot; |
| POSTPAY | &quot;POSTPAY&quot; |
| LEVEL1 | &quot;LEVEL1&quot; |
| LEVEL2 | &quot;LEVEL2&quot; |
| LEVEL3 | &quot;LEVEL3&quot; |
| HOT | &quot;HOT&quot; |
| RECEPTOR | &quot;RECEPTOR&quot; |
| RECEPTIVE | &quot;RECEPTIVE&quot; |
| NOTIER | &quot;NOTIER&quot; |
| TIER1 | &quot;TIER1&quot; |
| TIER2 | &quot;TIER2&quot; |
| TIER3 | &quot;TIER3&quot; |
| TIER4 | &quot;TIER4&quot; |



## Enum: BookingLocationEnum

| Name | Value |
|---- | -----|
| STRASBURG_PA | &quot;STRASBURG_PA&quot; |
| BRANSON_MO | &quot;BRANSON_MO&quot; |
| ALL | &quot;ALL&quot; |




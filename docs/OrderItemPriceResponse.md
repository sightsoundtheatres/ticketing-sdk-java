

# OrderItemPriceResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**orderNumber** | **Long** |  |  [optional] |
|**itemNumber** | **Integer** |  |  [optional] |
|**subtotalPrice** | **BigDecimal** |  |  [optional] |
|**totalDiscount** | **BigDecimal** |  |  [optional] |
|**itemStatus** | [**ItemStatusEnum**](#ItemStatusEnum) |  |  [optional] |
|**bus** | **Boolean** |  |  [optional] |
|**busCount** | **Integer** |  |  [optional] |



## Enum: TypeEnum

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



## Enum: ItemStatusEnum

| Name | Value |
|---- | -----|
| SEATS_CHOSEN | &quot;SEATS_CHOSEN&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| SEATS_ASSIGNED | &quot;SEATS_ASSIGNED&quot; |




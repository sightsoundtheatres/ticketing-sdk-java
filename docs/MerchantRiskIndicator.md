

# MerchantRiskIndicator


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressMatch** | **Boolean** |  |  [optional] |
|**deliveryAddressIndicator** | [**DeliveryAddressIndicatorEnum**](#DeliveryAddressIndicatorEnum) |  |  [optional] |
|**deliveryEmail** | **String** |  |  [optional] |
|**deliveryTimeframe** | [**DeliveryTimeframeEnum**](#DeliveryTimeframeEnum) |  |  [optional] |
|**giftCardAmount** | [**Amount**](Amount.md) |  |  [optional] |
|**giftCardCount** | **Integer** |  |  [optional] |
|**preOrderDate** | **OffsetDateTime** |  |  [optional] |
|**preOrderPurchase** | **Boolean** |  |  [optional] |
|**reorderItems** | **Boolean** |  |  [optional] |



## Enum: DeliveryAddressIndicatorEnum

| Name | Value |
|---- | -----|
| DIGITALGOODS | &quot;digitalGoods&quot; |
| GOODSNOTSHIPPED | &quot;goodsNotShipped&quot; |
| OTHER | &quot;other&quot; |
| SHIPTOBILLINGADDRESS | &quot;shipToBillingAddress&quot; |
| SHIPTONEWADDRESS | &quot;shipToNewAddress&quot; |
| SHIPTOSTORE | &quot;shipToStore&quot; |
| SHIPTOVERIFIEDADDRESS | &quot;shipToVerifiedAddress&quot; |



## Enum: DeliveryTimeframeEnum

| Name | Value |
|---- | -----|
| ELECTRONICDELIVERY | &quot;electronicDelivery&quot; |
| OVERNIGHTSHIPPING | &quot;overnightShipping&quot; |
| SAMEDAYSHIPPING | &quot;sameDayShipping&quot; |
| TWOORMOREDAYSSHIPPING | &quot;twoOrMoreDaysShipping&quot; |




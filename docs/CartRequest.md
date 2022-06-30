

# CartRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderNumber** | **Long** |  |  [optional] |
|**promoCode** | **String** |  |  [optional] |
|**groupName** | **String** |  |  [optional] |
|**referenceNumber** | **String** |  |  [optional] |
|**items** | [**List&lt;OrderItemPriceRequest&gt;**](OrderItemPriceRequest.md) |  |  [optional] |
|**customer** | [**OrderCustomerRequest**](OrderCustomerRequest.md) |  |  [optional] |
|**ticketBatch** | [**TicketBatchEnum**](#TicketBatchEnum) |  |  [optional] |



## Enum: TicketBatchEnum

| Name | Value |
|---- | -----|
| AGENT | &quot;AGENT&quot; |
| ETICKET | &quot;ETICKET&quot; |
| HELD | &quot;HELD&quot; |




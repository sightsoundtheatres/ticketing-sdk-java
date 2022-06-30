

# CartResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderNumber** | **Long** |  |  [optional] |
|**totalPrice** | **BigDecimal** |  |  [optional] |
|**taxesFeesPrice** | **BigDecimal** |  |  [optional] |
|**totalDiscount** | **BigDecimal** |  |  [optional] |
|**totalSavings** | **BigDecimal** |  |  [optional] |
|**totalTransactionCharge** | **BigDecimal** |  |  [optional] |
|**totalDueAmount** | **BigDecimal** |  |  [optional] |
|**refundPolicy** | **String** |  |  [optional] |
|**location** | [**LocationEnum**](#LocationEnum) |  |  [optional] |
|**ticketBatch** | [**TicketBatchEnum**](#TicketBatchEnum) |  |  [optional] |
|**heldName** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**items** | [**List&lt;OrderItemPriceResponse&gt;**](OrderItemPriceResponse.md) |  |  [optional] |
|**finalSaleDate** | **OffsetDateTime** |  |  [optional] |
|**tierYear** | **Integer** |  |  [optional] |
|**canTicketsBeMailed** | **Boolean** |  |  [optional] |
|**customerNumber** | **Long** |  |  [optional] |
|**postPay** | **Boolean** |  |  [optional] |
|**mustPay** | **Boolean** |  |  [optional] |
|**totalPaidAmount** | **BigDecimal** |  |  [optional] |
|**groupName** | **String** |  |  [optional] |
|**refNumber** | **String** |  |  [optional] |
|**eticketsAllowed** | **Boolean** |  |  [optional] |



## Enum: LocationEnum

| Name | Value |
|---- | -----|
| STRASBURG_PA | &quot;STRASBURG_PA&quot; |
| BRANSON_MO | &quot;BRANSON_MO&quot; |



## Enum: TicketBatchEnum

| Name | Value |
|---- | -----|
| AGENT | &quot;AGENT&quot; |
| ETICKET | &quot;ETICKET&quot; |
| HELD | &quot;HELD&quot; |




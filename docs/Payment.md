

# Payment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentDate** | **OffsetDateTime** |  |  [optional] |
|**amount** | **BigDecimal** |  |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  |
|**accountNumber** | **String** |  |  [optional] |
|**transSequenceNumber** | **Long** |  |  [optional] |
|**checks** | [**List&lt;PaperCheckRequest&gt;**](PaperCheckRequest.md) |  |  [optional] |
|**achRequest** | [**ACHRequest**](ACHRequest.md) |  |  [optional] |
|**paymentAch** | [**PaymentAch**](PaymentAch.md) |  |  [optional] |
|**paymentCreditCard** | [**PaymentCreditCard**](PaymentCreditCard.md) |  |  [optional] |
|**adyenPaymentRequest** | [**PaymentsRequest**](PaymentsRequest.md) |  |  [optional] |
|**giftCards** | [**List&lt;PaymentGiftCard&gt;**](PaymentGiftCard.md) |  |  [optional] |
|**storeCreditCard** | **Boolean** |  |  [optional] |
|**applyMoa** | **Boolean** |  |  [optional] |
|**paymentAppliedInfo** | **String** |  |  [optional] |
|**cashApplied** | [**PaymentAppliedDetail**](PaymentAppliedDetail.md) |  |  [optional] |
|**moaApplied** | [**PaymentAppliedDetail**](PaymentAppliedDetail.md) |  |  [optional] |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| W | &quot;W&quot; |
| CH | &quot;CH&quot; |
| AC | &quot;AC&quot; |
| CS | &quot;CS&quot; |
| RF | &quot;RF&quot; |
| CV | &quot;CV&quot; |
| GV | &quot;GV&quot; |
| NF | &quot;NF&quot; |
| CR | &quot;CR&quot; |
| GC | &quot;GC&quot; |
| MX | &quot;MX&quot; |




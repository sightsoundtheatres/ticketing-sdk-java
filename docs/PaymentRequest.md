

# PaymentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  |
|**checks** | [**List&lt;PaperCheckRequest&gt;**](PaperCheckRequest.md) |  |  [optional] |
|**achRequest** | [**ACHRequest**](ACHRequest.md) |  |  [optional] |
|**adyenPaymentRequest** | [**PaymentsRequest**](PaymentsRequest.md) |  |  [optional] |
|**giftCards** | [**List&lt;PaymentGiftCardRequest&gt;**](PaymentGiftCardRequest.md) |  |  [optional] |
|**storeCreditCard** | **Boolean** |  |  [optional] |
|**applyMoa** | **Boolean** |  |  [optional] |



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




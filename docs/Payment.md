

# Payment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentDate** | **OffsetDateTime** |  |  [optional] |
|**amount** | **BigDecimal** |  |  [optional] |
|**paymentType** | **ReceiptPaymentType** |  |  |
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




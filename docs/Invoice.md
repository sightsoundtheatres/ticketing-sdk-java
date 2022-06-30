

# Invoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceNumber** | **Long** |  |  [optional] |
|**company** | **InvoiceCompany** |  |  |
|**invoiceDate** | **OffsetDateTime** |  |  |
|**totalAmount** | **BigDecimal** |  |  [optional] |
|**paidDate** | **OffsetDateTime** |  |  [optional] |
|**paidAmount** | **BigDecimal** |  |  [optional] |
|**customerNumber** | **Long** |  |  [optional] |
|**status** | **InvoiceStatus** |  |  [optional] |
|**dueDate** | **OffsetDateTime** |  |  [optional] |
|**type** | **InvoiceType** |  |  [optional] |
|**batchNumber** | **String** |  |  [optional] |
|**category** | **ImpSSIInvoiceCategory** |  |  [optional] |
|**baseAmount** | **BigDecimal** |  |  [optional] |
|**arSegment1** | **String** |  |  [optional] |
|**arSegment2** | **String** |  |  [optional] |
|**arSegment3** | **String** |  |  [optional] |
|**arSegment4** | **String** |  |  [optional] |
|**arSegment5** | **String** |  |  [optional] |
|**paymentTerms** | **PaymentTerms** |  |  [optional] |
|**postFlag** | **String** |  |  [optional] |
|**lockFlag** | **Boolean** |  |  [optional] |
|**voidDate** | **OffsetDateTime** |  |  [optional] |
|**orderNumber** | **Long** |  |  [optional] |
|**orderDate** | **OffsetDateTime** |  |  [optional] |
|**lastPrintDate** | **OffsetDateTime** |  |  [optional] |
|**contactFirstName** | **String** |  |  [optional] |
|**contactLastName** | **String** |  |  [optional] |
|**reservationLocation** | **String** |  |  [optional] |
|**addUserId** | **String** |  |  [optional] |
|**executiveSeriesInvoiceNumber** | **Long** |  |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**invoiceDetails** | [**List&lt;InvoiceDetail&gt;**](InvoiceDetail.md) |  |  [optional] |
|**modifyDate** | **OffsetDateTime** |  |  [optional] |
|**syncSource** | **SyncSource** |  |  [optional] |
|**receiptDetails** | [**List&lt;ReceiptDetail&gt;**](ReceiptDetail.md) |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |




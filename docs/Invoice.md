

# Invoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceNumber** | **Long** |  |  [optional] |
|**company** | [**CompanyEnum**](#CompanyEnum) |  |  |
|**invoiceDate** | **OffsetDateTime** |  |  |
|**totalAmount** | **BigDecimal** |  |  [optional] |
|**paidDate** | **OffsetDateTime** |  |  [optional] |
|**paidAmount** | **BigDecimal** |  |  [optional] |
|**customerNumber** | **Long** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**dueDate** | **OffsetDateTime** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**batchNumber** | **String** |  |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) |  |  [optional] |
|**baseAmount** | **BigDecimal** |  |  [optional] |
|**arSegment1** | **String** |  |  [optional] |
|**arSegment2** | **String** |  |  [optional] |
|**arSegment3** | **String** |  |  [optional] |
|**arSegment4** | **String** |  |  [optional] |
|**arSegment5** | **String** |  |  [optional] |
|**paymentTerms** | [**PaymentTermsEnum**](#PaymentTermsEnum) |  |  [optional] |
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
|**syncSource** | [**SyncSourceEnum**](#SyncSourceEnum) |  |  [optional] |
|**receiptDetails** | [**List&lt;ReceiptDetail&gt;**](ReceiptDetail.md) |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |



## Enum: CompanyEnum

| Name | Value |
|---- | -----|
| SS | &quot;SS&quot; |
| BR | &quot;BR&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| O | &quot;O&quot; |
| P | &quot;P&quot; |
| V | &quot;V&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| I | &quot;I&quot; |
| C | &quot;C&quot; |
| R | &quot;R&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| CONSUMER | &quot;CONSUMER&quot; |
| EMPLOYEE | &quot;EMPLOYEE&quot; |
| PARTNER | &quot;PARTNER&quot; |
| GROUP | &quot;GROUP&quot; |
| LEVEL1 | &quot;LEVEL1&quot; |
| LEVEL2 | &quot;LEVEL2&quot; |
| LEVEL3 | &quot;LEVEL3&quot; |
| TIER1 | &quot;TIER1&quot; |
| TIER2 | &quot;TIER2&quot; |
| POSTPAY | &quot;POSTPAY&quot; |
| POS | &quot;POS&quot; |
| MOA | &quot;MOA&quot; |



## Enum: PaymentTermsEnum

| Name | Value |
|---- | -----|
| NET30 | &quot;NET30&quot; |
| RECEIPT | &quot;RECEIPT&quot; |



## Enum: SyncSourceEnum

| Name | Value |
|---- | -----|
| H | &quot;H&quot; |
| A | &quot;A&quot; |




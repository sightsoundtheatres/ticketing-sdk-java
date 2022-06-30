

# ReceiptDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**receiptNumber** | **Long** |  |  |
|**seqNumber** | **Integer** |  |  |
|**receiptCompany** | [**ReceiptCompanyEnum**](#ReceiptCompanyEnum) |  |  [optional] |
|**receiptDetailStatus** | **String** |  |  [optional] |
|**receiptDetailAmount** | **BigDecimal** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  |
|**creditSegment1** | **String** |  |  [optional] |
|**creditSegment2** | **String** |  |  [optional] |
|**creditSegment3** | **String** |  |  [optional] |
|**creditSegment4** | **String** |  |  [optional] |
|**creditSegment5** | **String** |  |  [optional] |
|**debitSegment1** | **String** |  |  [optional] |
|**debitSegment2** | **String** |  |  [optional] |
|**debitSegment3** | **String** |  |  [optional] |
|**debitSegment4** | **String** |  |  [optional] |
|**debitSegment5** | **String** |  |  [optional] |
|**invoiceCompany** | [**InvoiceCompanyEnum**](#InvoiceCompanyEnum) |  |  [optional] |
|**invoiceNumber** | **Long** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**gltNumber** | **Integer** |  |  [optional] |
|**gltCompany** | [**GltCompanyEnum**](#GltCompanyEnum) |  |  [optional] |
|**modifyDate** | **OffsetDateTime** |  |  [optional] |
|**receipt** | [**Receipt**](Receipt.md) |  |  [optional] |
|**invoice** | [**Invoice**](Invoice.md) |  |  [optional] |



## Enum: ReceiptCompanyEnum

| Name | Value |
|---- | -----|
| SS | &quot;SS&quot; |
| BR | &quot;BR&quot; |



## Enum: InvoiceCompanyEnum

| Name | Value |
|---- | -----|
| SS | &quot;SS&quot; |
| BR | &quot;BR&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| M | &quot;M&quot; |
| N | &quot;N&quot; |
| O | &quot;O&quot; |



## Enum: GltCompanyEnum

| Name | Value |
|---- | -----|
| SS | &quot;SS&quot; |
| BR | &quot;BR&quot; |




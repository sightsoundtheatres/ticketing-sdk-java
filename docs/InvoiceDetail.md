

# InvoiceDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceNumber** | **Long** |  |  |
|**invoiceSeqNumber** | **Integer** |  |  |
|**company** | [**CompanyEnum**](#CompanyEnum) |  |  |
|**description** | **String** |  |  [optional] |
|**skuCode** | **String** |  |  [optional] |
|**glPeriod** | **Integer** |  |  [optional] |
|**units** | **Integer** |  |  [optional] |
|**rate** | **BigDecimal** |  |  [optional] |
|**totalCost** | **BigDecimal** |  |  [optional] |
|**crSegment1** | **String** |  |  [optional] |
|**crSegment2** | **String** |  |  [optional] |
|**crSegment3** | **String** |  |  [optional] |
|**crSegment4** | **String** |  |  [optional] |
|**crSegment5** | **String** |  |  [optional] |
|**gltCompany** | [**GltCompanyEnum**](#GltCompanyEnum) |  |  [optional] |
|**gltNumber** | **Integer** |  |  [optional] |
|**baseAmount** | **BigDecimal** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**locationCD** | **String** |  |  [optional] |
|**lineType** | **String** |  |  [optional] |
|**inventoryCost** | **BigDecimal** |  |  [optional] |
|**averageCost** | **BigDecimal** |  |  [optional] |
|**voidStatus** | [**VoidStatusEnum**](#VoidStatusEnum) |  |  [optional] |
|**eventDate** | **OffsetDateTime** |  |  [optional] |
|**processDate** | **OffsetDateTime** |  |  [optional] |
|**itemNumber** | **Integer** |  |  [optional] |
|**modifyDate** | **OffsetDateTime** |  |  [optional] |
|**invoice** | [**Invoice**](Invoice.md) |  |  [optional] |



## Enum: CompanyEnum

| Name | Value |
|---- | -----|
| SS | &quot;SS&quot; |
| BR | &quot;BR&quot; |



## Enum: GltCompanyEnum

| Name | Value |
|---- | -----|
| SS | &quot;SS&quot; |
| BR | &quot;BR&quot; |



## Enum: VoidStatusEnum

| Name | Value |
|---- | -----|
| O | &quot;O&quot; |
| P | &quot;P&quot; |
| V | &quot;V&quot; |






# Receipt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**receiptNumber** | **Long** |  |  [optional] |
|**company** | [**CompanyEnum**](#CompanyEnum) |  |  |
|**checkNumber** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**receiptDate** | **OffsetDateTime** |  |  |
|**customerNumber** | **Long** |  |  [optional] |
|**receiptAmount** | **BigDecimal** |  |  [optional] |
|**receiptStatus** | [**ReceiptStatusEnum**](#ReceiptStatusEnum) |  |  [optional] |
|**paidAmount** | **BigDecimal** |  |  [optional] |
|**glPeriod** | **Integer** |  |  [optional] |
|**bankCode** | **String** |  |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  [optional] |
|**receiptType** | [**ReceiptTypeEnum**](#ReceiptTypeEnum) |  |  [optional] |
|**controlNumber** | **Long** |  |  [optional] |
|**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) |  |  [optional] |
|**baseAmount** | **BigDecimal** |  |  [optional] |
|**location** | **String** |  |  [optional] |
|**ccSeqNumber** | **Long** |  |  [optional] |
|**modifyDate** | **OffsetDateTime** |  |  [optional] |
|**executiveSeriesReceiptNumber** | **Long** |  |  [optional] |
|**syncSource** | [**SyncSourceEnum**](#SyncSourceEnum) |  |  [optional] |
|**addUserId** | **String** |  |  [optional] |
|**editUserId** | **String** |  |  [optional] |
|**receiptDetails** | [**List&lt;ReceiptDetail&gt;**](ReceiptDetail.md) |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |



## Enum: CompanyEnum

| Name | Value |
|---- | -----|
| SS | &quot;SS&quot; |
| BR | &quot;BR&quot; |



## Enum: ReceiptStatusEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| V | &quot;V&quot; |



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



## Enum: ReceiptTypeEnum

| Name | Value |
|---- | -----|
| NA | &quot;NA&quot; |
| C | &quot;C&quot; |



## Enum: ReasonCodeEnum

| Name | Value |
|---- | -----|
| RECEIPTADJ | &quot;RECEIPTADJ&quot; |
| CLOSED | &quot;CLOSED&quot; |
| NSF | &quot;NSF&quot; |
| INVALIDPMT | &quot;INVALIDPMT&quot; |
| STOPPYMT | &quot;STOPPYMT&quot; |



## Enum: SyncSourceEnum

| Name | Value |
|---- | -----|
| H | &quot;H&quot; |
| A | &quot;A&quot; |






# FeeItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderNumber** | **Long** |  |  [optional] |
|**itemNumber** | **Integer** |  |  [optional] |
|**feeKindCode** | [**FeeKindCodeEnum**](#FeeKindCodeEnum) |  |  |
|**feeCount** | **Integer** |  |  [optional] |
|**feePerCount** | **BigDecimal** |  |  [optional] |
|**flatFee** | **BigDecimal** |  |  [optional] |
|**totalFee** | **BigDecimal** |  |  |
|**feeId** | **Long** |  |  [optional] |
|**feeTypeCode** | [**FeeTypeCodeEnum**](#FeeTypeCodeEnum) |  |  |
|**feeDate** | **OffsetDateTime** |  |  |
|**active** | **Boolean** |  |  [optional] |
|**addUserId** | **String** |  |  [optional] |
|**percent** | **BigDecimal** |  |  [optional] |
|**percentFee** | **BigDecimal** |  |  [optional] |
|**percentAmount** | **BigDecimal** |  |  [optional] |
|**orderItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**logChanges** | **Boolean** |  |  [optional] |
|**logActivity** | [**LogActivityEnum**](#LogActivityEnum) |  |  [optional] |



## Enum: FeeKindCodeEnum

| Name | Value |
|---- | -----|
| C | &quot;C&quot; |
| P | &quot;P&quot; |
| F | &quot;F&quot; |



## Enum: FeeTypeCodeEnum

| Name | Value |
|---- | -----|
| UG | &quot;UG&quot; |
| DC | &quot;DC&quot; |
| DG | &quot;DG&quot; |
| CE | &quot;CE&quot; |
| BC | &quot;BC&quot; |
| SA | &quot;SA&quot; |
| MF | &quot;MF&quot; |
| TE | &quot;TE&quot; |



## Enum: LogActivityEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| CHANGE | &quot;CHANGE&quot; |
| ADD | &quot;ADD&quot; |
| CHANGE | &quot;CHANGE&quot; |
| CANCEL | &quot;CANCEL&quot; |
| SPL_DISC_REMOVED | &quot;SPL DISC REMOVED&quot; |
| SPL_DISC_APPLIED | &quot;SPL DISC APPLIED&quot; |
| RESERVED | &quot;RESERVED&quot; |
| COUNT_INCREASED | &quot;COUNT INCREASED&quot; |
| COUNT_DECREASED | &quot;COUNT DECREASED&quot; |
| AMOUNT_INCREASED | &quot;AMOUNT INCREASED&quot; |
| AMOUNT_DECREASED | &quot;AMOUNT DECREASED&quot; |
| DESIGNATION_CHANGE | &quot;DESIGNATION CHANGE&quot; |
| TRANS_IN | &quot;TRANS IN&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| SPL_STN_MODIFIED | &quot;SPL STN MODIFIED&quot; |




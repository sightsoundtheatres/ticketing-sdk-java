

# OrderItemDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderNumber** | **Long** |  |  [optional] |
|**itemNumber** | **Integer** |  |  [optional] |
|**count** | **Integer** |  |  [optional] |
|**manDiscountCount** | **Integer** |  |  [optional] |
|**specialDiscountCount** | **Integer** |  |  [optional] |
|**designationCode** | [**DesignationCodeEnum**](#DesignationCodeEnum) |  |  |
|**seatDiscountCount** | **Integer** |  |  [optional] |
|**seatDiscountAmount** | **BigDecimal** |  |  |
|**custDiscountTypeCode** | [**CustDiscountTypeCodeEnum**](#CustDiscountTypeCodeEnum) |  |  [optional] |
|**custDiscountValue** | **BigDecimal** |  |  |
|**specialTypeCode** | [**SpecialTypeCodeEnum**](#SpecialTypeCodeEnum) |  |  [optional] |
|**specialDiscountValue** | **BigDecimal** |  |  |
|**manDiscountTypeCode** | [**ManDiscountTypeCodeEnum**](#ManDiscountTypeCodeEnum) |  |  [optional] |
|**manDiscountValue** | **BigDecimal** |  |  |
|**confirmedCount** | **Integer** |  |  [optional] |
|**totalPrice** | **BigDecimal** |  |  [optional] |
|**specialDiscountTotalAmount** | **BigDecimal** |  |  |
|**manDiscountTotalAmount** | **BigDecimal** |  |  |
|**seatDiscountTotalAmount** | **BigDecimal** |  |  |
|**custDiscountTotalAmount** | **BigDecimal** |  |  |
|**printedCount** | **Integer** |  |  [optional] |
|**priceValue** | **BigDecimal** |  |  [optional] |
|**price** | **BigDecimal** |  |  [optional] |
|**compCount** | **Integer** |  |  [optional] |
|**gratuity** | **BigDecimal** |  |  [optional] |
|**ssMargin** | **BigDecimal** |  |  [optional] |
|**custDiscountCount** | **Integer** |  |  [optional] |
|**orderItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**deltaCount** | **Integer** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**_new** | **Boolean** |  |  [optional] |
|**savings** | **BigDecimal** |  |  [optional] |
|**totalDiscount** | **BigDecimal** |  |  [optional] |
|**manDiscountDollarAmount** | **BigDecimal** |  |  [optional] |
|**unprintedCount** | **Integer** |  |  [optional] |
|**listPriceWithDiscounts** | **BigDecimal** |  |  [optional] |
|**totalSavings** | **BigDecimal** |  |  [optional] |



## Enum: DesignationCodeEnum

| Name | Value |
|---- | -----|
| ADULT | &quot;ADULT&quot; |
| CHILD | &quot;CHILD&quot; |
| ESCORT | &quot;ESCORT&quot; |
| DRIVER | &quot;DRIVER&quot; |
| TEEN | &quot;TEEN&quot; |
| ANY | &quot;ANY&quot; |



## Enum: CustDiscountTypeCodeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| N | &quot;N&quot; |
| E | &quot;E&quot; |
| P | &quot;P&quot; |



## Enum: SpecialTypeCodeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| N | &quot;N&quot; |
| E | &quot;E&quot; |
| P | &quot;P&quot; |



## Enum: ManDiscountTypeCodeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| N | &quot;N&quot; |
| E | &quot;E&quot; |
| P | &quot;P&quot; |




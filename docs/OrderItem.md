

# OrderItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderNumber** | **Long** |  |  [optional] |
|**itemNumber** | **Integer** |  |  [optional] |
|**seatDriverWithGroup** | **Boolean** |  |  [optional] |
|**confirmed** | **Boolean** |  |  [optional] |
|**canDoSteps** | **Boolean** |  |  [optional] |
|**mealDateTime** | **OffsetDateTime** |  |  [optional] |
|**eventCode** | **String** |  |  |
|**showDateTime** | **OffsetDateTime** |  |  [optional] |
|**lumpSumDiscount** | **BigDecimal** |  |  [optional] |
|**itemTotalPrice** | **BigDecimal** |  |  |
|**overflowCount** | **Integer** |  |  |
|**orderItemStatusCode** | [**OrderItemStatusCodeEnum**](#OrderItemStatusCodeEnum) |  |  |
|**custTanDCProfileCode** | **String** |  |  [optional] |
|**priceListCode** | **String** |  |  [optional] |
|**printedCount** | **Integer** |  |  [optional] |
|**voucherPrinted** | **Boolean** |  |  |
|**cancelUserId** | **String** |  |  [optional] |
|**cancelDate** | **OffsetDateTime** |  |  [optional] |
|**cancelConfirmDate** | **OffsetDateTime** |  |  [optional] |
|**confirmDate** | **OffsetDateTime** |  |  [optional] |
|**activeWithOrder** | **Boolean** |  |  [optional] |
|**restContactName** | **String** |  |  [optional] |
|**addUserId** | **String** |  |  [optional] |
|**addLocation** | **String** |  |  [optional] |
|**addDate** | **OffsetDateTime** |  |  [optional] |
|**cancelLocation** | **String** |  |  [optional] |
|**transFromItem** | **Long** |  |  [optional] |
|**transToItem** | **Long** |  |  [optional] |
|**itemType** | [**ItemTypeEnum**](#ItemTypeEnum) |  |  [optional] |
|**eventDateTime** | **OffsetDateTime** |  |  [optional] |
|**voucherExpirationDate** | **OffsetDateTime** |  |  [optional] |
|**busCount** | **Integer** |  |  [optional] |
|**givexNumber** | **String** |  |  [optional] |
|**givexSecurityCode** | **String** |  |  [optional] |
|**activateUserId** | **String** |  |  [optional] |
|**activateDate** | **OffsetDateTime** |  |  [optional] |
|**empBenefitCode** | [**EmpBenefitCodeEnum**](#EmpBenefitCodeEnum) |  |  [optional] |
|**partnerConfirm** | **String** |  |  [optional] |
|**partnerEvent** | **Boolean** |  |  [optional] |
|**pluNumber** | **String** |  |  [optional] |
|**skuCode** | **String** |  |  [optional] |
|**skuDescription** | **String** |  |  [optional] |
|**skuBinLocation** | **String** |  |  [optional] |
|**skuTaxType** | [**SkuTaxTypeEnum**](#SkuTaxTypeEnum) |  |  [optional] |
|**sale** | **Boolean** |  |  [optional] |
|**manDiscountCode** | **String** |  |  [optional] |
|**miscSkuRef** | **String** |  |  [optional] |
|**shipDate** | **OffsetDateTime** |  |  [optional] |
|**trackNumber** | **String** |  |  [optional] |
|**damaged** | **Boolean** |  |  [optional] |
|**shipMethod** | **String** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**itemGrandTotalPrice** | **BigDecimal** |  |  [optional] |
|**traDevCount** | **Integer** |  |  [optional] |
|**miscSkuDescription** | **String** |  |  [optional] |
|**free** | **Boolean** |  |  [optional] |
|**oldPartnerConfirm** | **String** |  |  [optional] |
|**freeForItemNumber** | **Integer** |  |  [optional] |
|**traDevLangCode** | **String** |  |  [optional] |
|**bus** | **Boolean** |  |  [optional] |
|**travelPhoneNumber** | **String** |  |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**specialSituations** | [**List&lt;OIShowSpecialSituation&gt;**](OIShowSpecialSituation.md) |  |  [optional] |
|**orderItemDetails** | [**List&lt;OrderItemDetail&gt;**](OrderItemDetail.md) |  |  [optional] |
|**seats** | [**List&lt;ShowScheduleSeat&gt;**](ShowScheduleSeat.md) |  |  [optional] |
|**overflowSeats** | [**List&lt;ShowOverflowSeat&gt;**](ShowOverflowSeat.md) |  |  [optional] |
|**itemFees** | [**List&lt;FeeItem&gt;**](FeeItem.md) |  |  [optional] |
|**itemTaxes** | [**List&lt;OrderItemTax&gt;**](OrderItemTax.md) |  |  [optional] |
|**itemComps** | [**List&lt;OrderItemComp&gt;**](OrderItemComp.md) |  |  [optional] |
|**groupInfo** | [**GroupInfo**](GroupInfo.md) |  |  [optional] |
|**event** | [**Event**](Event.md) |  |  [optional] |
|**miscEvent** | [**MiscEvent**](MiscEvent.md) |  |  [optional] |
|**logActivity** | [**LogActivityEnum**](#LogActivityEnum) |  |  [optional] |
|**logChanges** | **Boolean** |  |  [optional] |
|**seatOverBooked** | **Boolean** |  |  [optional] |
|**seatOverbookCount** | **Integer** |  |  [optional] |
|**sendToAccpac** | **Boolean** |  |  [optional] |
|**groupNumber** | **Integer** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**count** | **Integer** |  |  [optional] |
|**itemCount** | **Integer** |  |  [optional] |
|**cancelled** | **Boolean** |  |  [optional] |
|**_new** | **Boolean** |  |  [optional] |
|**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) |  |  [optional] |
|**totalTax** | **BigDecimal** |  |  [optional] |
|**totalGratuity** | **BigDecimal** |  |  [optional] |
|**totalDiscount** | **BigDecimal** |  |  [optional] |
|**transactionChargeItem** | **Boolean** |  |  [optional] |
|**firstOccurringFeeDate** | **OffsetDateTime** |  |  [optional] |
|**allAssignedSeatCount** | **Integer** |  |  [optional] |
|**unprintedCount** | **Integer** |  |  [optional] |
|**totalCustomerDiscount** | **BigDecimal** |  |  [optional] |
|**seatedCount** | **Integer** |  |  [optional] |
|**totalDesignationCount** | **Integer** |  |  [optional] |
|**zonedEventDateTime** | **OffsetDateTime** |  |  [optional] |
|**totalFee** | **BigDecimal** |  |  [optional] |
|**compCount** | **Integer** |  |  [optional] |
|**paidCount** | **Integer** |  |  [optional] |
|**assignedSeatCount** | **Integer** |  |  [optional] |
|**totalSavings** | **BigDecimal** |  |  [optional] |
|**grandTotalSavings** | **BigDecimal** |  |  [optional] |
|**netPrice** | **BigDecimal** |  |  [optional] |
|**manualDiscountValue** | **BigDecimal** |  |  [optional] |
|**taxable** | **Boolean** |  |  [optional] |



## Enum: OrderItemStatusCodeEnum

| Name | Value |
|---- | -----|
| SEATS_CHOSEN | &quot;SEATS_CHOSEN&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| SEATS_ASSIGNED | &quot;SEATS_ASSIGNED&quot; |



## Enum: ItemTypeEnum

| Name | Value |
|---- | -----|
| SHOW | &quot;SHOW&quot; |
| TOUR | &quot;TOUR&quot; |
| CHARGE | &quot;CHARGE&quot; |
| MERCH | &quot;MERCH&quot; |
| SHIPPING | &quot;SHIPPING&quot; |
| GIFTCARD | &quot;GIFTCARD&quot; |
| ATTRACTION | &quot;ATTRACTION&quot; |
| COUPON | &quot;COUPON&quot; |
| FOOD | &quot;FOOD&quot; |
| HOTEL | &quot;HOTEL&quot; |
| INTLSHIPPING | &quot;INTLSHIPPING&quot; |
| MEAL | &quot;MEAL&quot; |
| MERCHANDISE | &quot;MERCHANDISE&quot; |
| MERCHSHIPPING | &quot;MERCHSHIPPING&quot; |
| MISC | &quot;MISC&quot; |
| VMEAL | &quot;VMEAL&quot; |



## Enum: EmpBenefitCodeEnum

| Name | Value |
|---- | -----|
| EMPDISC | &quot;EMPDISC&quot; |
| EMPCOMP | &quot;EMPCOMP&quot; |
| EMPDAY | &quot;EMPDAY&quot; |
| TOUR_EMPCOMP | &quot;TOUR_EMPCOMP&quot; |



## Enum: SkuTaxTypeEnum

| Name | Value |
|---- | -----|
| EN | &quot;EN&quot; |
| XC | &quot;XC&quot; |
| SC | &quot;SC&quot; |
| SP | &quot;SP&quot; |
| SH | &quot;SH&quot; |
| PT | &quot;PT&quot; |



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



## Enum: TaxTypeEnum

| Name | Value |
|---- | -----|
| EN | &quot;EN&quot; |
| XC | &quot;XC&quot; |
| SC | &quot;SC&quot; |
| SP | &quot;SP&quot; |
| SH | &quot;SH&quot; |
| PT | &quot;PT&quot; |




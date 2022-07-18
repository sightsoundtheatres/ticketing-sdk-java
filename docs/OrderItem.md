

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
|**orderItemStatusCode** | **OrderItemStatus** |  |  |
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
|**itemType** | **ItemType** |  |  [optional] |
|**eventDateTime** | **OffsetDateTime** |  |  [optional] |
|**voucherExpirationDate** | **OffsetDateTime** |  |  [optional] |
|**busCount** | **Integer** |  |  [optional] |
|**givexNumber** | **String** |  |  [optional] |
|**givexSecurityCode** | **String** |  |  [optional] |
|**activateUserId** | **String** |  |  [optional] |
|**activateDate** | **OffsetDateTime** |  |  [optional] |
|**empBenefitCode** | **EmployeeBenefitType** |  |  [optional] |
|**partnerConfirm** | **String** |  |  [optional] |
|**partnerEvent** | **Boolean** |  |  [optional] |
|**pluNumber** | **String** |  |  [optional] |
|**skuCode** | **String** |  |  [optional] |
|**skuDescription** | **String** |  |  [optional] |
|**skuBinLocation** | **String** |  |  [optional] |
|**skuTaxType** | **TaxType** |  |  [optional] |
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
|**logActivity** | **ActivityType** |  |  [optional] |
|**logChanges** | **Boolean** |  |  [optional] |
|**seatOverBooked** | **Boolean** |  |  [optional] |
|**seatOverbookCount** | **Integer** |  |  [optional] |
|**sendToAccpac** | **Boolean** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**count** | **Integer** |  |  [optional] |
|**itemCount** | **Integer** |  |  [optional] |
|**cancelled** | **Boolean** |  |  [optional] |
|**totalCustomerDiscount** | **BigDecimal** |  |  [optional] |
|**firstOccurringFeeDate** | **OffsetDateTime** |  |  [optional] |
|**_new** | **Boolean** |  |  [optional] |
|**allAssignedSeatCount** | **Integer** |  |  [optional] |
|**transactionChargeItem** | **Boolean** |  |  [optional] |
|**totalFee** | **BigDecimal** |  |  [optional] |
|**taxType** | **TaxType** |  |  [optional] |
|**totalTax** | **BigDecimal** |  |  [optional] |
|**totalGratuity** | **BigDecimal** |  |  [optional] |
|**totalDesignationCount** | **Integer** |  |  [optional] |
|**seatedCount** | **Integer** |  |  [optional] |
|**totalDiscount** | **BigDecimal** |  |  [optional] |
|**paidCount** | **Integer** |  |  [optional] |
|**unprintedCount** | **Integer** |  |  [optional] |
|**compCount** | **Integer** |  |  [optional] |
|**zonedEventDateTime** | **OffsetDateTime** |  |  [optional] |
|**assignedSeatCount** | **Integer** |  |  [optional] |
|**manualDiscountValue** | **BigDecimal** |  |  [optional] |
|**grandTotalSavings** | **BigDecimal** |  |  [optional] |
|**netPrice** | **BigDecimal** |  |  [optional] |
|**totalSavings** | **BigDecimal** |  |  [optional] |
|**taxable** | **Boolean** |  |  [optional] |




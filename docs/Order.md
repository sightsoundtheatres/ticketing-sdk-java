

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderNumber** | **Long** |  |  [optional] |
|**customerNumber** | **Long** |  |  [optional] |
|**orderDate** | **OffsetDateTime** |  |  [optional] |
|**groupName** | **String** |  |  [optional] |
|**mailToAddress** | [**AddressExtended**](AddressExtended.md) |  |  [optional] |
|**specialCode** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**addUserId** | **String** |  |  |
|**finalPaymentDueDate** | **OffsetDateTime** |  |  [optional] |
|**cancelUserId** | **String** |  |  [optional] |
|**cancelDate** | **OffsetDateTime** |  |  [optional] |
|**contractReceivedDate** | **OffsetDateTime** |  |  [optional] |
|**addLocationCode** | **String** |  |  [optional] |
|**cancelLocationCode** | **String** |  |  [optional] |
|**sourceCode** | **String** |  |  [optional] |
|**finalPaymentExtDueDate** | **OffsetDateTime** |  |  [optional] |
|**orderTotalPrice** | **BigDecimal** |  |  |
|**companyName** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**editUserId** | **String** |  |  [optional] |
|**editDate** | **OffsetDateTime** |  |  [optional] |
|**orderOrigin** | [**OrderOriginEnum**](#OrderOriginEnum) |  |  |
|**printUserId** | **String** |  |  [optional] |
|**sourceCodeComments** | **String** |  |  [optional] |
|**depositDueAmount** | **BigDecimal** |  |  [optional] |
|**contactFirstName** | **String** |  |  [optional] |
|**contactLastName** | **String** |  |  [optional] |
|**rpCustNumber** | **Long** |  |  [optional] |
|**mailToSameAsCustomer** | **Boolean** |  |  [optional] |
|**bypassAutoSpecial** | **Boolean** |  |  [optional] |
|**orderTypeCode** | **String** |  |  [optional] |
|**waiveDepositDue** | **Boolean** |  |  [optional] |
|**pricingLevel** | [**PricingLevelEnum**](#PricingLevelEnum) |  |  [optional] |
|**tierYear** | **Integer** |  |  [optional] |
|**depositDueDate** | **OffsetDateTime** |  |  [optional] |
|**theaterLocationCode** | [**TheaterLocationCodeEnum**](#TheaterLocationCodeEnum) |  |  [optional] |
|**depositAmount** | **BigDecimal** |  |  [optional] |
|**cancelReminderSent** | **Boolean** |  |  [optional] |
|**emailTicketsProcessed** | **Boolean** |  |  [optional] |
|**presentedByName** | **String** |  |  [optional] |
|**mailToOrganizationName** | **String** |  |  [optional] |
|**mailToPhone** | **String** |  |  [optional] |
|**authorizedUsers** | **String** |  |  [optional] |
|**resReqEncText** | **String** |  |  [optional] |
|**salesRepId** | **String** |  |  [optional] |
|**lockShippingDate** | **OffsetDateTime** |  |  [optional] |
|**lockRefundDate** | **OffsetDateTime** |  |  [optional] |
|**finalSale** | **Boolean** |  |  [optional] |
|**heldName** | **String** |  |  [optional] |
|**refNumber** | **String** |  |  [optional] |
|**taxExempt** | **Boolean** |  |  [optional] |
|**recalculate** | **Boolean** |  |  [optional] |
|**slidingScaleDiscount** | **BigDecimal** |  |  [optional] |
|**shipDate** | **OffsetDateTime** |  |  [optional] |
|**trackingNumber** | **String** |  |  [optional] |
|**shipFromLocation** | **String** |  |  [optional] |
|**mailToAddressVerified** | **Boolean** |  |  [optional] |
|**ticketBatch** | [**TicketBatchEnum**](#TicketBatchEnum) |  |  [optional] |
|**ticketBatchAgent** | **String** |  |  [optional] |
|**invoiceType** | [**InvoiceTypeEnum**](#InvoiceTypeEnum) |  |  [optional] |
|**returnOrderNumber** | **Long** |  |  [optional] |
|**contactPhone** | **String** |  |  [optional] |
|**inventoryMoved** | **Boolean** |  |  [optional] |
|**invalid** | **Boolean** |  |  [optional] |
|**mailOrder** | **Boolean** |  |  [optional] |
|**deliverStatus** | **String** |  |  [optional] |
|**deliverUserId** | **String** |  |  [optional] |
|**deliverDateTime** | **OffsetDateTime** |  |  [optional] |
|**intlGroup** | **Boolean** |  |  [optional] |
|**intlCountryCode** | **String** |  |  [optional] |
|**salesConfCode** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**authUserPhoneNumber** | **String** |  |  [optional] |
|**completedDate** | **OffsetDateTime** |  |  [optional] |
|**orderToken** | **UUID** |  |  [optional] |
|**notes** | [**List&lt;Note&gt;**](Note.md) |  |  [optional] |
|**orderItems** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**watchLists** | [**List&lt;WatchList&gt;**](WatchList.md) |  |  [optional] |
|**invoices** | [**List&lt;Invoice&gt;**](Invoice.md) |  |  [optional] |
|**groupInfo** | [**List&lt;GroupInfo&gt;**](GroupInfo.md) |  |  [optional] |
|**payments** | [**List&lt;Payment&gt;**](Payment.md) |  |  [optional] |
|**special** | [**Special**](Special.md) |  |  [optional] |
|**changeExistingDiscounts** | **Boolean** |  |  [optional] |
|**sendToAccpac** | **Boolean** |  |  [optional] |
|**sessionPaidAmount** | **BigDecimal** |  |  [optional] |
|**sessionRefundAmount** | **BigDecimal** |  |  [optional] |
|**amountPaidWhenOrderLoaded** | **BigDecimal** |  |  [optional] |
|**editMode** | **Boolean** |  |  [optional] |
|**specialAutoApplied** | **Boolean** |  |  [optional] |
|**logChanges** | **Boolean** |  |  [optional] |
|**specialRemoved** | **Boolean** |  |  [optional] |
|**promoCode** | **String** |  |  [optional] |
|**discountAutoApplied** | **Boolean** |  |  [optional] |
|**logActivity** | [**LogActivityEnum**](#LogActivityEnum) |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**alreadyLoggedActivity** | **Boolean** |  |  [optional] |
|**ticketDeliveryMessage** | **String** |  |  [optional] |
|**cancelled** | **Boolean** |  |  [optional] |
|**_new** | **Boolean** |  |  [optional] |
|**group** | **Boolean** |  |  [optional] |
|**firstOccurringShowItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**firstOccurringTourItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**activeWithOrder** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**postPayPricingLevel** | [**PostPayPricingLevelEnum**](#PostPayPricingLevelEnum) |  |  [optional] |
|**allItemsTotalPrice** | **BigDecimal** |  |  [optional] |
|**totalTax** | **BigDecimal** |  |  [optional] |
|**totalGratuity** | **BigDecimal** |  |  [optional] |
|**totalDiscount** | **BigDecimal** |  |  [optional] |
|**activeOrderItemList** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**calculatedPricingLevel** | [**CalculatedPricingLevelEnum**](#CalculatedPricingLevelEnum) |  |  [optional] |
|**paymentPast** | **Boolean** |  |  [optional] |
|**finalPaymentDueDays** | **Long** |  |  [optional] |
|**maxItemNumber** | **Integer** |  |  [optional] |
|**ticketsMailed** | **Boolean** |  |  [optional] |
|**earliestEventDate** | **OffsetDateTime** |  |  [optional] |
|**firstShowDate** | **OffsetDateTime** |  |  [optional] |
|**seatsUnderAssigned** | **Boolean** |  |  [optional] |
|**latestEventOrderItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**totalTransactionCharge** | **BigDecimal** |  |  [optional] |
|**showsDaysSpan** | **Long** |  |  [optional] |
|**highCountByOrderItem** | **Integer** |  |  [optional] |
|**readyForPrinting** | **Boolean** |  |  [optional] |
|**activeShowItems** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**mailToName** | **String** |  |  [optional] |
|**shipMethod** | **String** |  |  [optional] |
|**totalCustomerDiscount** | **BigDecimal** |  |  [optional] |
|**invoiceCompany** | [**InvoiceCompanyEnum**](#InvoiceCompanyEnum) |  |  [optional] |
|**dueAmount** | **BigDecimal** |  |  [optional] |
|**totalPaidAmount** | **BigDecimal** |  |  [optional] |
|**companyCode** | **String** |  |  [optional] |
|**groupCount** | **Integer** |  |  [optional] |
|**activeShowTourItem** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**totalFee** | **BigDecimal** |  |  [optional] |
|**seatsOverAssigned** | **Boolean** |  |  [optional] |
|**allSeatAssigned** | **Boolean** |  |  [optional] |
|**activeShowTourItemCount** | **Integer** |  |  [optional] |
|**allShowTourItem** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**grandTotalSaving** | **BigDecimal** |  |  [optional] |
|**autoApplyDiscounts** | **Boolean** |  |  [optional] |
|**lastShowDate** | **OffsetDateTime** |  |  [optional] |
|**firstOccurringShowItemWithValidCount** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**lastOccurringShowTourItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**firstOccurringShowTourItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**cancelledShowTourItemList** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**allPartnerEventsConfirmed** | **Boolean** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELLED | &quot;CANCELLED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| OPEN | &quot;OPEN&quot; |



## Enum: OrderOriginEnum

| Name | Value |
|---- | -----|
| FAST_SALE | &quot;FAST_SALE&quot; |
| POS | &quot;POS&quot; |
| INTERNET | &quot;INTERNET&quot; |
| SHOWTIX | &quot;SHOWTIX&quot; |



## Enum: PricingLevelEnum

| Name | Value |
|---- | -----|
| NOLEVEL | &quot;NOLEVEL&quot; |
| POSTPAY | &quot;POSTPAY&quot; |
| LEVEL1 | &quot;LEVEL1&quot; |
| LEVEL2 | &quot;LEVEL2&quot; |
| LEVEL3 | &quot;LEVEL3&quot; |
| HOT | &quot;HOT&quot; |
| RECEPTOR | &quot;RECEPTOR&quot; |
| RECEPTIVE | &quot;RECEPTIVE&quot; |
| NOTIER | &quot;NOTIER&quot; |
| TIER1 | &quot;TIER1&quot; |
| TIER2 | &quot;TIER2&quot; |
| TIER3 | &quot;TIER3&quot; |
| TIER4 | &quot;TIER4&quot; |



## Enum: TheaterLocationCodeEnum

| Name | Value |
|---- | -----|
| STRASBURG_PA | &quot;STRASBURG_PA&quot; |
| BRANSON_MO | &quot;BRANSON_MO&quot; |



## Enum: TicketBatchEnum

| Name | Value |
|---- | -----|
| AGENT | &quot;AGENT&quot; |
| ETICKET | &quot;ETICKET&quot; |
| HELD | &quot;HELD&quot; |



## Enum: InvoiceTypeEnum

| Name | Value |
|---- | -----|
| I | &quot;I&quot; |
| C | &quot;C&quot; |
| R | &quot;R&quot; |



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



## Enum: PostPayPricingLevelEnum

| Name | Value |
|---- | -----|
| NOLEVEL | &quot;NOLEVEL&quot; |
| POSTPAY | &quot;POSTPAY&quot; |
| LEVEL1 | &quot;LEVEL1&quot; |
| LEVEL2 | &quot;LEVEL2&quot; |
| LEVEL3 | &quot;LEVEL3&quot; |
| HOT | &quot;HOT&quot; |
| RECEPTOR | &quot;RECEPTOR&quot; |
| RECEPTIVE | &quot;RECEPTIVE&quot; |
| NOTIER | &quot;NOTIER&quot; |
| TIER1 | &quot;TIER1&quot; |
| TIER2 | &quot;TIER2&quot; |
| TIER3 | &quot;TIER3&quot; |
| TIER4 | &quot;TIER4&quot; |



## Enum: CalculatedPricingLevelEnum

| Name | Value |
|---- | -----|
| NOLEVEL | &quot;NOLEVEL&quot; |
| POSTPAY | &quot;POSTPAY&quot; |
| LEVEL1 | &quot;LEVEL1&quot; |
| LEVEL2 | &quot;LEVEL2&quot; |
| LEVEL3 | &quot;LEVEL3&quot; |
| HOT | &quot;HOT&quot; |
| RECEPTOR | &quot;RECEPTOR&quot; |
| RECEPTIVE | &quot;RECEPTIVE&quot; |
| NOTIER | &quot;NOTIER&quot; |
| TIER1 | &quot;TIER1&quot; |
| TIER2 | &quot;TIER2&quot; |
| TIER3 | &quot;TIER3&quot; |
| TIER4 | &quot;TIER4&quot; |



## Enum: InvoiceCompanyEnum

| Name | Value |
|---- | -----|
| SS | &quot;SS&quot; |
| BR | &quot;BR&quot; |




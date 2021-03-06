

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
|**status** | **OrderStatus** |  |  |
|**editUserId** | **String** |  |  [optional] |
|**editDate** | **OffsetDateTime** |  |  [optional] |
|**orderOrigin** | **OrderOrigin** |  |  |
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
|**pricingLevel** | **PricingLevel** |  |  [optional] |
|**tierYear** | **Integer** |  |  [optional] |
|**depositDueDate** | **OffsetDateTime** |  |  [optional] |
|**theaterLocationCode** | **LocationDescription** |  |  [optional] |
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
|**ticketBatch** | **TicketBatch** |  |  [optional] |
|**ticketBatchAgent** | **String** |  |  [optional] |
|**invoiceType** | **InvoiceType** |  |  [optional] |
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
|**logActivity** | **ActivityType** |  |  [optional] |
|**persisted** | **Boolean** |  |  [optional] |
|**alreadyLoggedActivity** | **Boolean** |  |  [optional] |
|**cancelled** | **Boolean** |  |  [optional] |
|**lastOccurringShowTourItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**totalTransactionCharge** | **BigDecimal** |  |  [optional] |
|**totalCustomerDiscount** | **BigDecimal** |  |  [optional] |
|**highCountByOrderItem** | **Integer** |  |  [optional] |
|**_new** | **Boolean** |  |  [optional] |
|**firstOccurringShowTourItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**activeOrderItemList** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**seatsUnderAssigned** | **Boolean** |  |  [optional] |
|**maxItemNumber** | **Integer** |  |  [optional] |
|**paymentPast** | **Boolean** |  |  [optional] |
|**ticketsMailed** | **Boolean** |  |  [optional] |
|**latestEventOrderItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**earliestEventDate** | **OffsetDateTime** |  |  [optional] |
|**firstShowDate** | **OffsetDateTime** |  |  [optional] |
|**cancelledShowTourItemList** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**groupCount** | **Integer** |  |  [optional] |
|**calculatedPricingLevel** | **PricingLevel** |  |  [optional] |
|**dueAmount** | **BigDecimal** |  |  [optional] |
|**totalFee** | **BigDecimal** |  |  [optional] |
|**invoiceCompany** | **InvoiceCompany** |  |  [optional] |
|**activeShowTourItem** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**companyCode** | **String** |  |  [optional] |
|**firstOccurringShowItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**firstOccurringTourItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**activeWithOrder** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**postPayPricingLevel** | **PricingLevel** |  |  [optional] |
|**allItemsTotalPrice** | **BigDecimal** |  |  [optional] |
|**totalTax** | **BigDecimal** |  |  [optional] |
|**totalGratuity** | **BigDecimal** |  |  [optional] |
|**totalPaidAmount** | **BigDecimal** |  |  [optional] |
|**totalDiscount** | **BigDecimal** |  |  [optional] |
|**readyForPrinting** | **Boolean** |  |  [optional] |
|**group** | **Boolean** |  |  [optional] |
|**activeShowItems** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**mailToName** | **String** |  |  [optional] |
|**shipMethod** | **String** |  |  [optional] |
|**firstOccurringShowItemWithValidCount** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**showsDaysSpan** | **Long** |  |  [optional] |
|**allSeatAssigned** | **Boolean** |  |  [optional] |
|**seatsOverAssigned** | **Boolean** |  |  [optional] |
|**activeShowTourItemCount** | **Integer** |  |  [optional] |
|**finalPaymentDueDays** | **Long** |  |  [optional] |
|**lastShowDate** | **OffsetDateTime** |  |  [optional] |
|**allShowTourItem** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**allPartnerEventsConfirmed** | **Boolean** |  |  [optional] |
|**grandTotalSaving** | **BigDecimal** |  |  [optional] |
|**autoApplyDiscounts** | **Boolean** |  |  [optional] |




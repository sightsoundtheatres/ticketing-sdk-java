/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sightsound.sdk.ticketing.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sightsound.sdk.ticketing.model.Event;
import com.sightsound.sdk.ticketing.model.FeeItem;
import com.sightsound.sdk.ticketing.model.GroupInfo;
import com.sightsound.sdk.ticketing.model.MiscEvent;
import com.sightsound.sdk.ticketing.model.OIShowSpecialSituation;
import com.sightsound.sdk.ticketing.model.Order;
import com.sightsound.sdk.ticketing.model.OrderItemComp;
import com.sightsound.sdk.ticketing.model.OrderItemDetail;
import com.sightsound.sdk.ticketing.model.OrderItemTax;
import com.sightsound.sdk.ticketing.model.ShowOverflowSeat;
import com.sightsound.sdk.ticketing.model.ShowScheduleSeat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for OrderItem
 */
public class OrderItemTest {
    private final OrderItem model = new OrderItem();

    /**
     * Model tests for OrderItem
     */
    @Test
    public void testOrderItem() {
        // TODO: test OrderItem
    }

    /**
     * Test the property 'orderNumber'
     */
    @Test
    public void orderNumberTest() {
        // TODO: test orderNumber
    }

    /**
     * Test the property 'itemNumber'
     */
    @Test
    public void itemNumberTest() {
        // TODO: test itemNumber
    }

    /**
     * Test the property 'seatDriverWithGroup'
     */
    @Test
    public void seatDriverWithGroupTest() {
        // TODO: test seatDriverWithGroup
    }

    /**
     * Test the property 'confirmed'
     */
    @Test
    public void confirmedTest() {
        // TODO: test confirmed
    }

    /**
     * Test the property 'canDoSteps'
     */
    @Test
    public void canDoStepsTest() {
        // TODO: test canDoSteps
    }

    /**
     * Test the property 'mealDateTime'
     */
    @Test
    public void mealDateTimeTest() {
        // TODO: test mealDateTime
    }

    /**
     * Test the property 'eventCode'
     */
    @Test
    public void eventCodeTest() {
        // TODO: test eventCode
    }

    /**
     * Test the property 'showDateTime'
     */
    @Test
    public void showDateTimeTest() {
        // TODO: test showDateTime
    }

    /**
     * Test the property 'lumpSumDiscount'
     */
    @Test
    public void lumpSumDiscountTest() {
        // TODO: test lumpSumDiscount
    }

    /**
     * Test the property 'itemTotalPrice'
     */
    @Test
    public void itemTotalPriceTest() {
        // TODO: test itemTotalPrice
    }

    /**
     * Test the property 'overflowCount'
     */
    @Test
    public void overflowCountTest() {
        // TODO: test overflowCount
    }

    /**
     * Test the property 'orderItemStatusCode'
     */
    @Test
    public void orderItemStatusCodeTest() {
        // TODO: test orderItemStatusCode
    }

    /**
     * Test the property 'custTanDCProfileCode'
     */
    @Test
    public void custTanDCProfileCodeTest() {
        // TODO: test custTanDCProfileCode
    }

    /**
     * Test the property 'priceListCode'
     */
    @Test
    public void priceListCodeTest() {
        // TODO: test priceListCode
    }

    /**
     * Test the property 'printedCount'
     */
    @Test
    public void printedCountTest() {
        // TODO: test printedCount
    }

    /**
     * Test the property 'voucherPrinted'
     */
    @Test
    public void voucherPrintedTest() {
        // TODO: test voucherPrinted
    }

    /**
     * Test the property 'cancelUserId'
     */
    @Test
    public void cancelUserIdTest() {
        // TODO: test cancelUserId
    }

    /**
     * Test the property 'cancelDate'
     */
    @Test
    public void cancelDateTest() {
        // TODO: test cancelDate
    }

    /**
     * Test the property 'cancelConfirmDate'
     */
    @Test
    public void cancelConfirmDateTest() {
        // TODO: test cancelConfirmDate
    }

    /**
     * Test the property 'confirmDate'
     */
    @Test
    public void confirmDateTest() {
        // TODO: test confirmDate
    }

    /**
     * Test the property 'activeWithOrder'
     */
    @Test
    public void activeWithOrderTest() {
        // TODO: test activeWithOrder
    }

    /**
     * Test the property 'restContactName'
     */
    @Test
    public void restContactNameTest() {
        // TODO: test restContactName
    }

    /**
     * Test the property 'addUserId'
     */
    @Test
    public void addUserIdTest() {
        // TODO: test addUserId
    }

    /**
     * Test the property 'addLocation'
     */
    @Test
    public void addLocationTest() {
        // TODO: test addLocation
    }

    /**
     * Test the property 'addDate'
     */
    @Test
    public void addDateTest() {
        // TODO: test addDate
    }

    /**
     * Test the property 'cancelLocation'
     */
    @Test
    public void cancelLocationTest() {
        // TODO: test cancelLocation
    }

    /**
     * Test the property 'transFromItem'
     */
    @Test
    public void transFromItemTest() {
        // TODO: test transFromItem
    }

    /**
     * Test the property 'transToItem'
     */
    @Test
    public void transToItemTest() {
        // TODO: test transToItem
    }

    /**
     * Test the property 'itemType'
     */
    @Test
    public void itemTypeTest() {
        // TODO: test itemType
    }

    /**
     * Test the property 'eventDateTime'
     */
    @Test
    public void eventDateTimeTest() {
        // TODO: test eventDateTime
    }

    /**
     * Test the property 'voucherExpirationDate'
     */
    @Test
    public void voucherExpirationDateTest() {
        // TODO: test voucherExpirationDate
    }

    /**
     * Test the property 'busCount'
     */
    @Test
    public void busCountTest() {
        // TODO: test busCount
    }

    /**
     * Test the property 'givexNumber'
     */
    @Test
    public void givexNumberTest() {
        // TODO: test givexNumber
    }

    /**
     * Test the property 'givexSecurityCode'
     */
    @Test
    public void givexSecurityCodeTest() {
        // TODO: test givexSecurityCode
    }

    /**
     * Test the property 'activateUserId'
     */
    @Test
    public void activateUserIdTest() {
        // TODO: test activateUserId
    }

    /**
     * Test the property 'activateDate'
     */
    @Test
    public void activateDateTest() {
        // TODO: test activateDate
    }

    /**
     * Test the property 'empBenefitCode'
     */
    @Test
    public void empBenefitCodeTest() {
        // TODO: test empBenefitCode
    }

    /**
     * Test the property 'partnerConfirm'
     */
    @Test
    public void partnerConfirmTest() {
        // TODO: test partnerConfirm
    }

    /**
     * Test the property 'partnerEvent'
     */
    @Test
    public void partnerEventTest() {
        // TODO: test partnerEvent
    }

    /**
     * Test the property 'pluNumber'
     */
    @Test
    public void pluNumberTest() {
        // TODO: test pluNumber
    }

    /**
     * Test the property 'skuCode'
     */
    @Test
    public void skuCodeTest() {
        // TODO: test skuCode
    }

    /**
     * Test the property 'skuDescription'
     */
    @Test
    public void skuDescriptionTest() {
        // TODO: test skuDescription
    }

    /**
     * Test the property 'skuBinLocation'
     */
    @Test
    public void skuBinLocationTest() {
        // TODO: test skuBinLocation
    }

    /**
     * Test the property 'skuTaxType'
     */
    @Test
    public void skuTaxTypeTest() {
        // TODO: test skuTaxType
    }

    /**
     * Test the property 'sale'
     */
    @Test
    public void saleTest() {
        // TODO: test sale
    }

    /**
     * Test the property 'manDiscountCode'
     */
    @Test
    public void manDiscountCodeTest() {
        // TODO: test manDiscountCode
    }

    /**
     * Test the property 'miscSkuRef'
     */
    @Test
    public void miscSkuRefTest() {
        // TODO: test miscSkuRef
    }

    /**
     * Test the property 'shipDate'
     */
    @Test
    public void shipDateTest() {
        // TODO: test shipDate
    }

    /**
     * Test the property 'trackNumber'
     */
    @Test
    public void trackNumberTest() {
        // TODO: test trackNumber
    }

    /**
     * Test the property 'damaged'
     */
    @Test
    public void damagedTest() {
        // TODO: test damaged
    }

    /**
     * Test the property 'shipMethod'
     */
    @Test
    public void shipMethodTest() {
        // TODO: test shipMethod
    }

    /**
     * Test the property 'comments'
     */
    @Test
    public void commentsTest() {
        // TODO: test comments
    }

    /**
     * Test the property 'itemGrandTotalPrice'
     */
    @Test
    public void itemGrandTotalPriceTest() {
        // TODO: test itemGrandTotalPrice
    }

    /**
     * Test the property 'traDevCount'
     */
    @Test
    public void traDevCountTest() {
        // TODO: test traDevCount
    }

    /**
     * Test the property 'miscSkuDescription'
     */
    @Test
    public void miscSkuDescriptionTest() {
        // TODO: test miscSkuDescription
    }

    /**
     * Test the property 'free'
     */
    @Test
    public void freeTest() {
        // TODO: test free
    }

    /**
     * Test the property 'oldPartnerConfirm'
     */
    @Test
    public void oldPartnerConfirmTest() {
        // TODO: test oldPartnerConfirm
    }

    /**
     * Test the property 'freeForItemNumber'
     */
    @Test
    public void freeForItemNumberTest() {
        // TODO: test freeForItemNumber
    }

    /**
     * Test the property 'traDevLangCode'
     */
    @Test
    public void traDevLangCodeTest() {
        // TODO: test traDevLangCode
    }

    /**
     * Test the property 'bus'
     */
    @Test
    public void busTest() {
        // TODO: test bus
    }

    /**
     * Test the property 'travelPhoneNumber'
     */
    @Test
    public void travelPhoneNumberTest() {
        // TODO: test travelPhoneNumber
    }

    /**
     * Test the property 'order'
     */
    @Test
    public void orderTest() {
        // TODO: test order
    }

    /**
     * Test the property 'specialSituations'
     */
    @Test
    public void specialSituationsTest() {
        // TODO: test specialSituations
    }

    /**
     * Test the property 'orderItemDetails'
     */
    @Test
    public void orderItemDetailsTest() {
        // TODO: test orderItemDetails
    }

    /**
     * Test the property 'seats'
     */
    @Test
    public void seatsTest() {
        // TODO: test seats
    }

    /**
     * Test the property 'overflowSeats'
     */
    @Test
    public void overflowSeatsTest() {
        // TODO: test overflowSeats
    }

    /**
     * Test the property 'itemFees'
     */
    @Test
    public void itemFeesTest() {
        // TODO: test itemFees
    }

    /**
     * Test the property 'itemTaxes'
     */
    @Test
    public void itemTaxesTest() {
        // TODO: test itemTaxes
    }

    /**
     * Test the property 'itemComps'
     */
    @Test
    public void itemCompsTest() {
        // TODO: test itemComps
    }

    /**
     * Test the property 'groupInfo'
     */
    @Test
    public void groupInfoTest() {
        // TODO: test groupInfo
    }

    /**
     * Test the property 'event'
     */
    @Test
    public void eventTest() {
        // TODO: test event
    }

    /**
     * Test the property 'miscEvent'
     */
    @Test
    public void miscEventTest() {
        // TODO: test miscEvent
    }

    /**
     * Test the property 'logActivity'
     */
    @Test
    public void logActivityTest() {
        // TODO: test logActivity
    }

    /**
     * Test the property 'logChanges'
     */
    @Test
    public void logChangesTest() {
        // TODO: test logChanges
    }

    /**
     * Test the property 'seatOverBooked'
     */
    @Test
    public void seatOverBookedTest() {
        // TODO: test seatOverBooked
    }

    /**
     * Test the property 'seatOverbookCount'
     */
    @Test
    public void seatOverbookCountTest() {
        // TODO: test seatOverbookCount
    }

    /**
     * Test the property 'sendToAccpac'
     */
    @Test
    public void sendToAccpacTest() {
        // TODO: test sendToAccpac
    }

    /**
     * Test the property 'groupNumber'
     */
    @Test
    public void groupNumberTest() {
        // TODO: test groupNumber
    }

    /**
     * Test the property 'persisted'
     */
    @Test
    public void persistedTest() {
        // TODO: test persisted
    }

    /**
     * Test the property 'count'
     */
    @Test
    public void countTest() {
        // TODO: test count
    }

    /**
     * Test the property 'itemCount'
     */
    @Test
    public void itemCountTest() {
        // TODO: test itemCount
    }

    /**
     * Test the property 'cancelled'
     */
    @Test
    public void cancelledTest() {
        // TODO: test cancelled
    }

    /**
     * Test the property '_new'
     */
    @Test
    public void _newTest() {
        // TODO: test _new
    }

    /**
     * Test the property 'taxType'
     */
    @Test
    public void taxTypeTest() {
        // TODO: test taxType
    }

    /**
     * Test the property 'totalTax'
     */
    @Test
    public void totalTaxTest() {
        // TODO: test totalTax
    }

    /**
     * Test the property 'totalGratuity'
     */
    @Test
    public void totalGratuityTest() {
        // TODO: test totalGratuity
    }

    /**
     * Test the property 'totalDiscount'
     */
    @Test
    public void totalDiscountTest() {
        // TODO: test totalDiscount
    }

    /**
     * Test the property 'transactionChargeItem'
     */
    @Test
    public void transactionChargeItemTest() {
        // TODO: test transactionChargeItem
    }

    /**
     * Test the property 'firstOccurringFeeDate'
     */
    @Test
    public void firstOccurringFeeDateTest() {
        // TODO: test firstOccurringFeeDate
    }

    /**
     * Test the property 'allAssignedSeatCount'
     */
    @Test
    public void allAssignedSeatCountTest() {
        // TODO: test allAssignedSeatCount
    }

    /**
     * Test the property 'unprintedCount'
     */
    @Test
    public void unprintedCountTest() {
        // TODO: test unprintedCount
    }

    /**
     * Test the property 'totalCustomerDiscount'
     */
    @Test
    public void totalCustomerDiscountTest() {
        // TODO: test totalCustomerDiscount
    }

    /**
     * Test the property 'seatedCount'
     */
    @Test
    public void seatedCountTest() {
        // TODO: test seatedCount
    }

    /**
     * Test the property 'totalDesignationCount'
     */
    @Test
    public void totalDesignationCountTest() {
        // TODO: test totalDesignationCount
    }

    /**
     * Test the property 'zonedEventDateTime'
     */
    @Test
    public void zonedEventDateTimeTest() {
        // TODO: test zonedEventDateTime
    }

    /**
     * Test the property 'totalFee'
     */
    @Test
    public void totalFeeTest() {
        // TODO: test totalFee
    }

    /**
     * Test the property 'compCount'
     */
    @Test
    public void compCountTest() {
        // TODO: test compCount
    }

    /**
     * Test the property 'paidCount'
     */
    @Test
    public void paidCountTest() {
        // TODO: test paidCount
    }

    /**
     * Test the property 'assignedSeatCount'
     */
    @Test
    public void assignedSeatCountTest() {
        // TODO: test assignedSeatCount
    }

    /**
     * Test the property 'totalSavings'
     */
    @Test
    public void totalSavingsTest() {
        // TODO: test totalSavings
    }

    /**
     * Test the property 'grandTotalSavings'
     */
    @Test
    public void grandTotalSavingsTest() {
        // TODO: test grandTotalSavings
    }

    /**
     * Test the property 'netPrice'
     */
    @Test
    public void netPriceTest() {
        // TODO: test netPrice
    }

    /**
     * Test the property 'manualDiscountValue'
     */
    @Test
    public void manualDiscountValueTest() {
        // TODO: test manualDiscountValue
    }

    /**
     * Test the property 'taxable'
     */
    @Test
    public void taxableTest() {
        // TODO: test taxable
    }

}

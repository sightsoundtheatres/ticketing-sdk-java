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


package com.sightsound.sdk.ticketing.api;

import com.sightsound.sdk.ticketing.ApiException;
import com.sightsound.sdk.ticketing.model.OrderCompleteRequest;
import com.sightsound.sdk.ticketing.model.OrderCompleteResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderControllerApi
 */
@Disabled
public class OrderControllerApiTest {

    private final OrderControllerApi api = new OrderControllerApi();

    /**
     * Complete order
     *
     * Completes a new order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void completeNewOrderTest() throws ApiException {
        OrderCompleteRequest orderCompleteRequest = null;
        OrderCompleteResponse response = api.completeNewOrder(orderCompleteRequest);
        // TODO: test validations
    }

}

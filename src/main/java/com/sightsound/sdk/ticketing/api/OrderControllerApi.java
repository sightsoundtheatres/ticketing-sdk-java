/*
 * Helios
 * Sight & Sound Theatres Ticketing API
 *
 * The version of the OpenAPI document: 0.0.1-SNAPSHOT
 * Contact: DeveloperTeam@sight-sound.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sightsound.sdk.ticketing.api;

import com.sightsound.sdk.ticketing.ApiCallback;
import com.sightsound.sdk.ticketing.ApiClient;
import com.sightsound.sdk.ticketing.ApiException;
import com.sightsound.sdk.ticketing.ApiResponse;
import com.sightsound.sdk.ticketing.Configuration;
import com.sightsound.sdk.ticketing.Pair;
import com.sightsound.sdk.ticketing.ProgressRequestBody;
import com.sightsound.sdk.ticketing.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sightsound.sdk.ticketing.model.OrderCompleteRequest;
import com.sightsound.sdk.ticketing.model.OrderCompleteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OrderControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OrderControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderControllerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for completeOrder
     * @param orderNumber  (required)
     * @param orderCompleteRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call completeOrderCall(Long orderNumber, OrderCompleteRequest orderCompleteRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = orderCompleteRequest;

        // create path and map variables
        String localVarPath = "/order/complete"
            .replaceAll("\\{" + "orderNumber" + "\\}", localVarApiClient.escapeString(orderNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call completeOrderValidateBeforeCall(Long orderNumber, OrderCompleteRequest orderCompleteRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'orderNumber' is set
        if (orderNumber == null) {
            throw new ApiException("Missing the required parameter 'orderNumber' when calling completeOrder(Async)");
        }
        
        // verify the required parameter 'orderCompleteRequest' is set
        if (orderCompleteRequest == null) {
            throw new ApiException("Missing the required parameter 'orderCompleteRequest' when calling completeOrder(Async)");
        }
        

        okhttp3.Call localVarCall = completeOrderCall(orderNumber, orderCompleteRequest, _callback);
        return localVarCall;

    }

    /**
     * Complete order
     * Completes an order. Can be new or existing.
     * @param orderNumber  (required)
     * @param orderCompleteRequest  (required)
     * @return OrderCompleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public OrderCompleteResponse completeOrder(Long orderNumber, OrderCompleteRequest orderCompleteRequest) throws ApiException {
        ApiResponse<OrderCompleteResponse> localVarResp = completeOrderWithHttpInfo(orderNumber, orderCompleteRequest);
        return localVarResp.getData();
    }

    /**
     * Complete order
     * Completes an order. Can be new or existing.
     * @param orderNumber  (required)
     * @param orderCompleteRequest  (required)
     * @return ApiResponse&lt;OrderCompleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderCompleteResponse> completeOrderWithHttpInfo(Long orderNumber, OrderCompleteRequest orderCompleteRequest) throws ApiException {
        okhttp3.Call localVarCall = completeOrderValidateBeforeCall(orderNumber, orderCompleteRequest, null);
        Type localVarReturnType = new TypeToken<OrderCompleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Complete order (asynchronously)
     * Completes an order. Can be new or existing.
     * @param orderNumber  (required)
     * @param orderCompleteRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call completeOrderAsync(Long orderNumber, OrderCompleteRequest orderCompleteRequest, final ApiCallback<OrderCompleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = completeOrderValidateBeforeCall(orderNumber, orderCompleteRequest, _callback);
        Type localVarReturnType = new TypeToken<OrderCompleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

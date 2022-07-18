# OrderControllerApi

All URIs are relative to *https://dev-helios.sight-sound.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**completeNewOrder**](OrderControllerApi.md#completeNewOrder) | **POST** /order/complete | Complete order |


<a name="completeNewOrder"></a>
# **completeNewOrder**
> OrderCompleteResponse completeNewOrder(orderCompleteRequest)

Complete order

Completes a new order.

### Example
```java
// Import classes:
import com.sightsound.sdk.ticketing.ApiClient;
import com.sightsound.sdk.ticketing.ApiException;
import com.sightsound.sdk.ticketing.Configuration;
import com.sightsound.sdk.ticketing.auth.*;
import com.sightsound.sdk.ticketing.models.*;
import com.sightsound.sdk.ticketing.api.OrderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-helios.sight-sound.com");
    
    // Configure OAuth2 access token for authorization: DEV
    OAuth DEV = (OAuth) defaultClient.getAuthentication("DEV");
    DEV.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: PROD
    OAuth PROD = (OAuth) defaultClient.getAuthentication("PROD");
    PROD.setAccessToken("YOUR ACCESS TOKEN");

    OrderControllerApi apiInstance = new OrderControllerApi(defaultClient);
    OrderCompleteRequest orderCompleteRequest = new OrderCompleteRequest(); // OrderCompleteRequest | 
    try {
      OrderCompleteResponse result = apiInstance.completeNewOrder(orderCompleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderControllerApi#completeNewOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderCompleteRequest** | [**OrderCompleteRequest**](OrderCompleteRequest.md)|  | |

### Return type

[**OrderCompleteResponse**](OrderCompleteResponse.md)

### Authorization

[DEV](../README.md#DEV), [PROD](../README.md#PROD)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


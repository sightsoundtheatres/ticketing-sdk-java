# OrderControllerApi

All URIs are relative to *https://helios.sight-sound.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**completeOrder**](OrderControllerApi.md#completeOrder) | **POST** /order/complete | Complete order |


<a name="completeOrder"></a>
# **completeOrder**
> OrderCompleteResponse completeOrder(orderNumber, orderCompleteRequest)

Complete order

Completes an order. Can be new or existing.

### Example
```java
// Import classes:
import com.sightsound.sdk.ticketing.ApiClient;
import com.sightsound.sdk.ticketing.ApiException;
import com.sightsound.sdk.ticketing.Configuration;
import com.sightsound.sdk.ticketing.models.*;
import com.sightsound.sdk.ticketing.api.OrderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://helios.sight-sound.com");

    OrderControllerApi apiInstance = new OrderControllerApi(defaultClient);
    Long orderNumber = 56L; // Long | 
    OrderCompleteRequest orderCompleteRequest = new OrderCompleteRequest(); // OrderCompleteRequest | 
    try {
      OrderCompleteResponse result = apiInstance.completeOrder(orderNumber, orderCompleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderControllerApi#completeOrder");
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
| **orderNumber** | **Long**|  | |
| **orderCompleteRequest** | [**OrderCompleteRequest**](OrderCompleteRequest.md)|  | |

### Return type

[**OrderCompleteResponse**](OrderCompleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


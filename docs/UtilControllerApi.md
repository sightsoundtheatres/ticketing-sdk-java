# UtilControllerApi

All URIs are relative to *https://dev-helios.sight-sound.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**status**](UtilControllerApi.md#status) | **GET** /system/util/status |  |


<a name="status"></a>
# **status**
> status()



### Example
```java
// Import classes:
import com.sightsound.sdk.ticketing.ApiClient;
import com.sightsound.sdk.ticketing.ApiException;
import com.sightsound.sdk.ticketing.Configuration;
import com.sightsound.sdk.ticketing.auth.*;
import com.sightsound.sdk.ticketing.models.*;
import com.sightsound.sdk.ticketing.api.UtilControllerApi;

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

    UtilControllerApi apiInstance = new UtilControllerApi(defaultClient);
    try {
      apiInstance.status();
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilControllerApi#status");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[DEV](../README.md#DEV), [PROD](../README.md#PROD)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


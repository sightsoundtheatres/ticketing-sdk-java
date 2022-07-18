/*
 * Partner Ticketing API
 * Sight & Sound Theatres Partner Ticketing API
 *
 * The version of the OpenAPI document: 0.0.1-SNAPSHOT
 * Contact: DeveloperTeam@sight-sound.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sightsound.sdk.ticketing.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sightsound.sdk.ticketing.model.CommonField;
import com.sightsound.sdk.ticketing.model.ExternalPlatform;
import com.sightsound.sdk.ticketing.model.MerchantDevice;
import com.sightsound.sdk.ticketing.model.ShopperInteractionDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sightsound.sdk.ticketing.JSON;

/**
 * ApplicationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T19:37:37.998841Z[Etc/UTC]")
public class ApplicationInfo {
  public static final String SERIALIZED_NAME_ADYEN_LIBRARY = "adyenLibrary";
  @SerializedName(SERIALIZED_NAME_ADYEN_LIBRARY)
  private CommonField adyenLibrary;

  public static final String SERIALIZED_NAME_ADYEN_PAYMENT_SOURCE = "adyenPaymentSource";
  @SerializedName(SERIALIZED_NAME_ADYEN_PAYMENT_SOURCE)
  private CommonField adyenPaymentSource;

  public static final String SERIALIZED_NAME_EXTERNAL_PLATFORM = "externalPlatform";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_PLATFORM)
  private ExternalPlatform externalPlatform;

  public static final String SERIALIZED_NAME_MERCHANT_APPLICATION = "merchantApplication";
  @SerializedName(SERIALIZED_NAME_MERCHANT_APPLICATION)
  private CommonField merchantApplication;

  public static final String SERIALIZED_NAME_MERCHANT_DEVICE = "merchantDevice";
  @SerializedName(SERIALIZED_NAME_MERCHANT_DEVICE)
  private MerchantDevice merchantDevice;

  public static final String SERIALIZED_NAME_PAYMENT_DETAILS_SOURCE = "paymentDetailsSource";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DETAILS_SOURCE)
  private CommonField paymentDetailsSource;

  public static final String SERIALIZED_NAME_SHOPPER_INTERACTION_DEVICE = "shopperInteractionDevice";
  @SerializedName(SERIALIZED_NAME_SHOPPER_INTERACTION_DEVICE)
  private ShopperInteractionDevice shopperInteractionDevice;

  public ApplicationInfo() { 
  }

  public ApplicationInfo adyenLibrary(CommonField adyenLibrary) {
    
    this.adyenLibrary = adyenLibrary;
    return this;
  }

   /**
   * Get adyenLibrary
   * @return adyenLibrary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonField getAdyenLibrary() {
    return adyenLibrary;
  }


  public void setAdyenLibrary(CommonField adyenLibrary) {
    this.adyenLibrary = adyenLibrary;
  }


  public ApplicationInfo adyenPaymentSource(CommonField adyenPaymentSource) {
    
    this.adyenPaymentSource = adyenPaymentSource;
    return this;
  }

   /**
   * Get adyenPaymentSource
   * @return adyenPaymentSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonField getAdyenPaymentSource() {
    return adyenPaymentSource;
  }


  public void setAdyenPaymentSource(CommonField adyenPaymentSource) {
    this.adyenPaymentSource = adyenPaymentSource;
  }


  public ApplicationInfo externalPlatform(ExternalPlatform externalPlatform) {
    
    this.externalPlatform = externalPlatform;
    return this;
  }

   /**
   * Get externalPlatform
   * @return externalPlatform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPlatform getExternalPlatform() {
    return externalPlatform;
  }


  public void setExternalPlatform(ExternalPlatform externalPlatform) {
    this.externalPlatform = externalPlatform;
  }


  public ApplicationInfo merchantApplication(CommonField merchantApplication) {
    
    this.merchantApplication = merchantApplication;
    return this;
  }

   /**
   * Get merchantApplication
   * @return merchantApplication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonField getMerchantApplication() {
    return merchantApplication;
  }


  public void setMerchantApplication(CommonField merchantApplication) {
    this.merchantApplication = merchantApplication;
  }


  public ApplicationInfo merchantDevice(MerchantDevice merchantDevice) {
    
    this.merchantDevice = merchantDevice;
    return this;
  }

   /**
   * Get merchantDevice
   * @return merchantDevice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantDevice getMerchantDevice() {
    return merchantDevice;
  }


  public void setMerchantDevice(MerchantDevice merchantDevice) {
    this.merchantDevice = merchantDevice;
  }


  public ApplicationInfo paymentDetailsSource(CommonField paymentDetailsSource) {
    
    this.paymentDetailsSource = paymentDetailsSource;
    return this;
  }

   /**
   * Get paymentDetailsSource
   * @return paymentDetailsSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonField getPaymentDetailsSource() {
    return paymentDetailsSource;
  }


  public void setPaymentDetailsSource(CommonField paymentDetailsSource) {
    this.paymentDetailsSource = paymentDetailsSource;
  }


  public ApplicationInfo shopperInteractionDevice(ShopperInteractionDevice shopperInteractionDevice) {
    
    this.shopperInteractionDevice = shopperInteractionDevice;
    return this;
  }

   /**
   * Get shopperInteractionDevice
   * @return shopperInteractionDevice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShopperInteractionDevice getShopperInteractionDevice() {
    return shopperInteractionDevice;
  }


  public void setShopperInteractionDevice(ShopperInteractionDevice shopperInteractionDevice) {
    this.shopperInteractionDevice = shopperInteractionDevice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationInfo applicationInfo = (ApplicationInfo) o;
    return Objects.equals(this.adyenLibrary, applicationInfo.adyenLibrary) &&
        Objects.equals(this.adyenPaymentSource, applicationInfo.adyenPaymentSource) &&
        Objects.equals(this.externalPlatform, applicationInfo.externalPlatform) &&
        Objects.equals(this.merchantApplication, applicationInfo.merchantApplication) &&
        Objects.equals(this.merchantDevice, applicationInfo.merchantDevice) &&
        Objects.equals(this.paymentDetailsSource, applicationInfo.paymentDetailsSource) &&
        Objects.equals(this.shopperInteractionDevice, applicationInfo.shopperInteractionDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adyenLibrary, adyenPaymentSource, externalPlatform, merchantApplication, merchantDevice, paymentDetailsSource, shopperInteractionDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationInfo {\n");
    sb.append("    adyenLibrary: ").append(toIndentedString(adyenLibrary)).append("\n");
    sb.append("    adyenPaymentSource: ").append(toIndentedString(adyenPaymentSource)).append("\n");
    sb.append("    externalPlatform: ").append(toIndentedString(externalPlatform)).append("\n");
    sb.append("    merchantApplication: ").append(toIndentedString(merchantApplication)).append("\n");
    sb.append("    merchantDevice: ").append(toIndentedString(merchantDevice)).append("\n");
    sb.append("    paymentDetailsSource: ").append(toIndentedString(paymentDetailsSource)).append("\n");
    sb.append("    shopperInteractionDevice: ").append(toIndentedString(shopperInteractionDevice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("adyenLibrary");
    openapiFields.add("adyenPaymentSource");
    openapiFields.add("externalPlatform");
    openapiFields.add("merchantApplication");
    openapiFields.add("merchantDevice");
    openapiFields.add("paymentDetailsSource");
    openapiFields.add("shopperInteractionDevice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplicationInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationInfo is not found in the empty JSON string", ApplicationInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `adyenLibrary`
      if (jsonObj.getAsJsonObject("adyenLibrary") != null) {
        CommonField.validateJsonObject(jsonObj.getAsJsonObject("adyenLibrary"));
      }
      // validate the optional field `adyenPaymentSource`
      if (jsonObj.getAsJsonObject("adyenPaymentSource") != null) {
        CommonField.validateJsonObject(jsonObj.getAsJsonObject("adyenPaymentSource"));
      }
      // validate the optional field `externalPlatform`
      if (jsonObj.getAsJsonObject("externalPlatform") != null) {
        ExternalPlatform.validateJsonObject(jsonObj.getAsJsonObject("externalPlatform"));
      }
      // validate the optional field `merchantApplication`
      if (jsonObj.getAsJsonObject("merchantApplication") != null) {
        CommonField.validateJsonObject(jsonObj.getAsJsonObject("merchantApplication"));
      }
      // validate the optional field `merchantDevice`
      if (jsonObj.getAsJsonObject("merchantDevice") != null) {
        MerchantDevice.validateJsonObject(jsonObj.getAsJsonObject("merchantDevice"));
      }
      // validate the optional field `paymentDetailsSource`
      if (jsonObj.getAsJsonObject("paymentDetailsSource") != null) {
        CommonField.validateJsonObject(jsonObj.getAsJsonObject("paymentDetailsSource"));
      }
      // validate the optional field `shopperInteractionDevice`
      if (jsonObj.getAsJsonObject("shopperInteractionDevice") != null) {
        ShopperInteractionDevice.validateJsonObject(jsonObj.getAsJsonObject("shopperInteractionDevice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationInfo>() {
           @Override
           public void write(JsonWriter out, ApplicationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationInfo
  * @throws IOException if the JSON string is invalid with respect to ApplicationInfo
  */
  public static ApplicationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationInfo.class);
  }

 /**
  * Convert an instance of ApplicationInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


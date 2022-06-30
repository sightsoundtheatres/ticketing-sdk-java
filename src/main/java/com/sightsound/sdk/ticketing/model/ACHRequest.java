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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sightsound.sdk.ticketing.model.PaymentsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

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
 * ACHRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T16:06:07.372728-05:00[America/Chicago]")
public class ACHRequest {
  public static final String SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  @SerializedName(SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID)
  private String storedPaymentMethodId;

  public static final String SERIALIZED_NAME_PAYMENTS_REQUEST = "paymentsRequest";
  @SerializedName(SERIALIZED_NAME_PAYMENTS_REQUEST)
  private PaymentsRequest paymentsRequest;

  public static final String SERIALIZED_NAME_CHECK_AMOUNT = "checkAmount";
  @SerializedName(SERIALIZED_NAME_CHECK_AMOUNT)
  private BigDecimal checkAmount;

  public ACHRequest() { 
  }

  public ACHRequest storedPaymentMethodId(String storedPaymentMethodId) {
    
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * Get storedPaymentMethodId
   * @return storedPaymentMethodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public ACHRequest paymentsRequest(PaymentsRequest paymentsRequest) {
    
    this.paymentsRequest = paymentsRequest;
    return this;
  }

   /**
   * Get paymentsRequest
   * @return paymentsRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsRequest getPaymentsRequest() {
    return paymentsRequest;
  }


  public void setPaymentsRequest(PaymentsRequest paymentsRequest) {
    this.paymentsRequest = paymentsRequest;
  }


  public ACHRequest checkAmount(BigDecimal checkAmount) {
    
    this.checkAmount = checkAmount;
    return this;
  }

   /**
   * Get checkAmount
   * @return checkAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCheckAmount() {
    return checkAmount;
  }


  public void setCheckAmount(BigDecimal checkAmount) {
    this.checkAmount = checkAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ACHRequest acHRequest = (ACHRequest) o;
    return Objects.equals(this.storedPaymentMethodId, acHRequest.storedPaymentMethodId) &&
        Objects.equals(this.paymentsRequest, acHRequest.paymentsRequest) &&
        Objects.equals(this.checkAmount, acHRequest.checkAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storedPaymentMethodId, paymentsRequest, checkAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ACHRequest {\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
    sb.append("    paymentsRequest: ").append(toIndentedString(paymentsRequest)).append("\n");
    sb.append("    checkAmount: ").append(toIndentedString(checkAmount)).append("\n");
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
    openapiFields.add("storedPaymentMethodId");
    openapiFields.add("paymentsRequest");
    openapiFields.add("checkAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ACHRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ACHRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ACHRequest is not found in the empty JSON string", ACHRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ACHRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ACHRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("storedPaymentMethodId") != null && !jsonObj.get("storedPaymentMethodId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storedPaymentMethodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storedPaymentMethodId").toString()));
      }
      // validate the optional field `paymentsRequest`
      if (jsonObj.getAsJsonObject("paymentsRequest") != null) {
        PaymentsRequest.validateJsonObject(jsonObj.getAsJsonObject("paymentsRequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ACHRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ACHRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ACHRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ACHRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ACHRequest>() {
           @Override
           public void write(JsonWriter out, ACHRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ACHRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ACHRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ACHRequest
  * @throws IOException if the JSON string is invalid with respect to ACHRequest
  */
  public static ACHRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ACHRequest.class);
  }

 /**
  * Convert an instance of ACHRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

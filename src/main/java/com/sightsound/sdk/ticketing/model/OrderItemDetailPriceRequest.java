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
import com.sightsound.sdk.ticketing.model.Designation;
import com.sightsound.sdk.ticketing.model.OrderItemDetail;
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
 * OrderItemDetailPriceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T20:01:03.115466Z[Etc/UTC]")
public class OrderItemDetailPriceRequest {
  public static final String SERIALIZED_NAME_DESIGNATION = "designation";
  @SerializedName(SERIALIZED_NAME_DESIGNATION)
  private Designation designation;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_ORDER_ITEM_DETAIL = "orderItemDetail";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_DETAIL)
  private OrderItemDetail orderItemDetail;

  public OrderItemDetailPriceRequest() { 
  }

  public OrderItemDetailPriceRequest designation(Designation designation) {
    
    this.designation = designation;
    return this;
  }

   /**
   * Get designation
   * @return designation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Designation getDesignation() {
    return designation;
  }


  public void setDesignation(Designation designation) {
    this.designation = designation;
  }


  public OrderItemDetailPriceRequest count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public OrderItemDetailPriceRequest orderItemDetail(OrderItemDetail orderItemDetail) {
    
    this.orderItemDetail = orderItemDetail;
    return this;
  }

   /**
   * Get orderItemDetail
   * @return orderItemDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderItemDetail getOrderItemDetail() {
    return orderItemDetail;
  }


  public void setOrderItemDetail(OrderItemDetail orderItemDetail) {
    this.orderItemDetail = orderItemDetail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemDetailPriceRequest orderItemDetailPriceRequest = (OrderItemDetailPriceRequest) o;
    return Objects.equals(this.designation, orderItemDetailPriceRequest.designation) &&
        Objects.equals(this.count, orderItemDetailPriceRequest.count) &&
        Objects.equals(this.orderItemDetail, orderItemDetailPriceRequest.orderItemDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(designation, count, orderItemDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemDetailPriceRequest {\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    orderItemDetail: ").append(toIndentedString(orderItemDetail)).append("\n");
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
    openapiFields.add("designation");
    openapiFields.add("count");
    openapiFields.add("orderItemDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("designation");
    openapiRequiredFields.add("count");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemDetailPriceRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderItemDetailPriceRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemDetailPriceRequest is not found in the empty JSON string", OrderItemDetailPriceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemDetailPriceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemDetailPriceRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderItemDetailPriceRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `orderItemDetail`
      if (jsonObj.getAsJsonObject("orderItemDetail") != null) {
        OrderItemDetail.validateJsonObject(jsonObj.getAsJsonObject("orderItemDetail"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemDetailPriceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemDetailPriceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemDetailPriceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemDetailPriceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemDetailPriceRequest>() {
           @Override
           public void write(JsonWriter out, OrderItemDetailPriceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemDetailPriceRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemDetailPriceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemDetailPriceRequest
  * @throws IOException if the JSON string is invalid with respect to OrderItemDetailPriceRequest
  */
  public static OrderItemDetailPriceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemDetailPriceRequest.class);
  }

 /**
  * Convert an instance of OrderItemDetailPriceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


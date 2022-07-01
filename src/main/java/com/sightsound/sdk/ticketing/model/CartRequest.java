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


package com.sightsound.sdk.ticketing.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sightsound.sdk.ticketing.model.OrderCustomerRequest;
import com.sightsound.sdk.ticketing.model.OrderItemPriceRequest;
import com.sightsound.sdk.ticketing.model.TicketBatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * CartRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T08:40:20.483181-05:00[America/Chicago]")
public class CartRequest {
  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_PROMO_CODE = "promoCode";
  @SerializedName(SERIALIZED_NAME_PROMO_CODE)
  private String promoCode;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderItemPriceRequest> items = null;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private OrderCustomerRequest customer;

  public static final String SERIALIZED_NAME_TICKET_BATCH = "ticketBatch";
  @SerializedName(SERIALIZED_NAME_TICKET_BATCH)
  private TicketBatch ticketBatch;

  public CartRequest() { 
  }

  public CartRequest orderNumber(Long orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
  }


  public CartRequest promoCode(String promoCode) {
    
    this.promoCode = promoCode;
    return this;
  }

   /**
   * Get promoCode
   * @return promoCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPromoCode() {
    return promoCode;
  }


  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }


  public CartRequest groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public CartRequest referenceNumber(String referenceNumber) {
    
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Get referenceNumber
   * @return referenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReferenceNumber() {
    return referenceNumber;
  }


  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public CartRequest items(List<OrderItemPriceRequest> items) {
    
    this.items = items;
    return this;
  }

  public CartRequest addItemsItem(OrderItemPriceRequest itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OrderItemPriceRequest> getItems() {
    return items;
  }


  public void setItems(List<OrderItemPriceRequest> items) {
    this.items = items;
  }


  public CartRequest customer(OrderCustomerRequest customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderCustomerRequest getCustomer() {
    return customer;
  }


  public void setCustomer(OrderCustomerRequest customer) {
    this.customer = customer;
  }


  public CartRequest ticketBatch(TicketBatch ticketBatch) {
    
    this.ticketBatch = ticketBatch;
    return this;
  }

   /**
   * Get ticketBatch
   * @return ticketBatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TicketBatch getTicketBatch() {
    return ticketBatch;
  }


  public void setTicketBatch(TicketBatch ticketBatch) {
    this.ticketBatch = ticketBatch;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartRequest cartRequest = (CartRequest) o;
    return Objects.equals(this.orderNumber, cartRequest.orderNumber) &&
        Objects.equals(this.promoCode, cartRequest.promoCode) &&
        Objects.equals(this.groupName, cartRequest.groupName) &&
        Objects.equals(this.referenceNumber, cartRequest.referenceNumber) &&
        Objects.equals(this.items, cartRequest.items) &&
        Objects.equals(this.customer, cartRequest.customer) &&
        Objects.equals(this.ticketBatch, cartRequest.ticketBatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber, promoCode, groupName, referenceNumber, items, customer, ticketBatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartRequest {\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    ticketBatch: ").append(toIndentedString(ticketBatch)).append("\n");
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
    openapiFields.add("orderNumber");
    openapiFields.add("promoCode");
    openapiFields.add("groupName");
    openapiFields.add("referenceNumber");
    openapiFields.add("items");
    openapiFields.add("customer");
    openapiFields.add("ticketBatch");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CartRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CartRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartRequest is not found in the empty JSON string", CartRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CartRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("promoCode") != null && !jsonObj.get("promoCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promoCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promoCode").toString()));
      }
      if (jsonObj.get("groupName") != null && !jsonObj.get("groupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupName").toString()));
      }
      if (jsonObj.get("referenceNumber") != null && !jsonObj.get("referenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceNumber").toString()));
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          OrderItemPriceRequest.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `customer`
      if (jsonObj.getAsJsonObject("customer") != null) {
        OrderCustomerRequest.validateJsonObject(jsonObj.getAsJsonObject("customer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CartRequest>() {
           @Override
           public void write(JsonWriter out, CartRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartRequest
  * @throws IOException if the JSON string is invalid with respect to CartRequest
  */
  public static CartRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartRequest.class);
  }

 /**
  * Convert an instance of CartRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


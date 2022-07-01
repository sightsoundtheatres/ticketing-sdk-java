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
import com.sightsound.sdk.ticketing.model.CartRequest;
import com.sightsound.sdk.ticketing.model.OrderTicketDeliveryRequest;
import com.sightsound.sdk.ticketing.model.PaymentRequest;
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
 * OrderCompleteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T17:16:16.028085Z[Etc/UTC]")
public class OrderCompleteRequest {
  public static final String SERIALIZED_NAME_CART = "cart";
  @SerializedName(SERIALIZED_NAME_CART)
  private CartRequest cart;

  public static final String SERIALIZED_NAME_DELIVERY = "delivery";
  @SerializedName(SERIALIZED_NAME_DELIVERY)
  private OrderTicketDeliveryRequest delivery;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  private PaymentRequest payment;

  public static final String SERIALIZED_NAME_SEAT_LOCK_TOKEN = "seatLockToken";
  @SerializedName(SERIALIZED_NAME_SEAT_LOCK_TOKEN)
  private Long seatLockToken;

  public static final String SERIALIZED_NAME_EMAIL_LIST = "emailList";
  @SerializedName(SERIALIZED_NAME_EMAIL_LIST)
  private Boolean emailList;

  public static final String SERIALIZED_NAME_SAME_GROUP_CONFIRM = "sameGroupConfirm";
  @SerializedName(SERIALIZED_NAME_SAME_GROUP_CONFIRM)
  private Boolean sameGroupConfirm;

  public OrderCompleteRequest() { 
  }

  public OrderCompleteRequest cart(CartRequest cart) {
    
    this.cart = cart;
    return this;
  }

   /**
   * Get cart
   * @return cart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CartRequest getCart() {
    return cart;
  }


  public void setCart(CartRequest cart) {
    this.cart = cart;
  }


  public OrderCompleteRequest delivery(OrderTicketDeliveryRequest delivery) {
    
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderTicketDeliveryRequest getDelivery() {
    return delivery;
  }


  public void setDelivery(OrderTicketDeliveryRequest delivery) {
    this.delivery = delivery;
  }


  public OrderCompleteRequest payment(PaymentRequest payment) {
    
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentRequest getPayment() {
    return payment;
  }


  public void setPayment(PaymentRequest payment) {
    this.payment = payment;
  }


  public OrderCompleteRequest seatLockToken(Long seatLockToken) {
    
    this.seatLockToken = seatLockToken;
    return this;
  }

   /**
   * Get seatLockToken
   * @return seatLockToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSeatLockToken() {
    return seatLockToken;
  }


  public void setSeatLockToken(Long seatLockToken) {
    this.seatLockToken = seatLockToken;
  }


  public OrderCompleteRequest emailList(Boolean emailList) {
    
    this.emailList = emailList;
    return this;
  }

   /**
   * Get emailList
   * @return emailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEmailList() {
    return emailList;
  }


  public void setEmailList(Boolean emailList) {
    this.emailList = emailList;
  }


  public OrderCompleteRequest sameGroupConfirm(Boolean sameGroupConfirm) {
    
    this.sameGroupConfirm = sameGroupConfirm;
    return this;
  }

   /**
   * Get sameGroupConfirm
   * @return sameGroupConfirm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSameGroupConfirm() {
    return sameGroupConfirm;
  }


  public void setSameGroupConfirm(Boolean sameGroupConfirm) {
    this.sameGroupConfirm = sameGroupConfirm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCompleteRequest orderCompleteRequest = (OrderCompleteRequest) o;
    return Objects.equals(this.cart, orderCompleteRequest.cart) &&
        Objects.equals(this.delivery, orderCompleteRequest.delivery) &&
        Objects.equals(this.payment, orderCompleteRequest.payment) &&
        Objects.equals(this.seatLockToken, orderCompleteRequest.seatLockToken) &&
        Objects.equals(this.emailList, orderCompleteRequest.emailList) &&
        Objects.equals(this.sameGroupConfirm, orderCompleteRequest.sameGroupConfirm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cart, delivery, payment, seatLockToken, emailList, sameGroupConfirm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCompleteRequest {\n");
    sb.append("    cart: ").append(toIndentedString(cart)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    seatLockToken: ").append(toIndentedString(seatLockToken)).append("\n");
    sb.append("    emailList: ").append(toIndentedString(emailList)).append("\n");
    sb.append("    sameGroupConfirm: ").append(toIndentedString(sameGroupConfirm)).append("\n");
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
    openapiFields.add("cart");
    openapiFields.add("delivery");
    openapiFields.add("payment");
    openapiFields.add("seatLockToken");
    openapiFields.add("emailList");
    openapiFields.add("sameGroupConfirm");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cart");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderCompleteRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderCompleteRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCompleteRequest is not found in the empty JSON string", OrderCompleteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderCompleteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCompleteRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderCompleteRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `cart`
      if (jsonObj.getAsJsonObject("cart") != null) {
        CartRequest.validateJsonObject(jsonObj.getAsJsonObject("cart"));
      }
      // validate the optional field `delivery`
      if (jsonObj.getAsJsonObject("delivery") != null) {
        OrderTicketDeliveryRequest.validateJsonObject(jsonObj.getAsJsonObject("delivery"));
      }
      // validate the optional field `payment`
      if (jsonObj.getAsJsonObject("payment") != null) {
        PaymentRequest.validateJsonObject(jsonObj.getAsJsonObject("payment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCompleteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCompleteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCompleteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCompleteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCompleteRequest>() {
           @Override
           public void write(JsonWriter out, OrderCompleteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCompleteRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCompleteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCompleteRequest
  * @throws IOException if the JSON string is invalid with respect to OrderCompleteRequest
  */
  public static OrderCompleteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCompleteRequest.class);
  }

 /**
  * Convert an instance of OrderCompleteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


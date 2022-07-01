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
import com.sightsound.sdk.ticketing.model.ItemType;
import com.sightsound.sdk.ticketing.model.OrderItemStatus;
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
 * OrderItemPriceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T08:27:57.763723-05:00[America/Chicago]")
public class OrderItemPriceResponse {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ItemType type;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "itemNumber";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private Integer itemNumber;

  public static final String SERIALIZED_NAME_SUBTOTAL_PRICE = "subtotalPrice";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL_PRICE)
  private BigDecimal subtotalPrice;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT = "totalDiscount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT)
  private BigDecimal totalDiscount;

  public static final String SERIALIZED_NAME_ITEM_STATUS = "itemStatus";
  @SerializedName(SERIALIZED_NAME_ITEM_STATUS)
  private OrderItemStatus itemStatus;

  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private Boolean bus;

  public static final String SERIALIZED_NAME_BUS_COUNT = "busCount";
  @SerializedName(SERIALIZED_NAME_BUS_COUNT)
  private Integer busCount;

  public OrderItemPriceResponse() { 
  }

  public OrderItemPriceResponse type(ItemType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemType getType() {
    return type;
  }


  public void setType(ItemType type) {
    this.type = type;
  }


  public OrderItemPriceResponse orderNumber(Long orderNumber) {
    
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


  public OrderItemPriceResponse itemNumber(Integer itemNumber) {
    
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * Get itemNumber
   * @return itemNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getItemNumber() {
    return itemNumber;
  }


  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }


  public OrderItemPriceResponse subtotalPrice(BigDecimal subtotalPrice) {
    
    this.subtotalPrice = subtotalPrice;
    return this;
  }

   /**
   * Get subtotalPrice
   * @return subtotalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSubtotalPrice() {
    return subtotalPrice;
  }


  public void setSubtotalPrice(BigDecimal subtotalPrice) {
    this.subtotalPrice = subtotalPrice;
  }


  public OrderItemPriceResponse totalDiscount(BigDecimal totalDiscount) {
    
    this.totalDiscount = totalDiscount;
    return this;
  }

   /**
   * Get totalDiscount
   * @return totalDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalDiscount() {
    return totalDiscount;
  }


  public void setTotalDiscount(BigDecimal totalDiscount) {
    this.totalDiscount = totalDiscount;
  }


  public OrderItemPriceResponse itemStatus(OrderItemStatus itemStatus) {
    
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Get itemStatus
   * @return itemStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderItemStatus getItemStatus() {
    return itemStatus;
  }


  public void setItemStatus(OrderItemStatus itemStatus) {
    this.itemStatus = itemStatus;
  }


  public OrderItemPriceResponse bus(Boolean bus) {
    
    this.bus = bus;
    return this;
  }

   /**
   * Get bus
   * @return bus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBus() {
    return bus;
  }


  public void setBus(Boolean bus) {
    this.bus = bus;
  }


  public OrderItemPriceResponse busCount(Integer busCount) {
    
    this.busCount = busCount;
    return this;
  }

   /**
   * Get busCount
   * @return busCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBusCount() {
    return busCount;
  }


  public void setBusCount(Integer busCount) {
    this.busCount = busCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemPriceResponse orderItemPriceResponse = (OrderItemPriceResponse) o;
    return Objects.equals(this.type, orderItemPriceResponse.type) &&
        Objects.equals(this.orderNumber, orderItemPriceResponse.orderNumber) &&
        Objects.equals(this.itemNumber, orderItemPriceResponse.itemNumber) &&
        Objects.equals(this.subtotalPrice, orderItemPriceResponse.subtotalPrice) &&
        Objects.equals(this.totalDiscount, orderItemPriceResponse.totalDiscount) &&
        Objects.equals(this.itemStatus, orderItemPriceResponse.itemStatus) &&
        Objects.equals(this.bus, orderItemPriceResponse.bus) &&
        Objects.equals(this.busCount, orderItemPriceResponse.busCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, orderNumber, itemNumber, subtotalPrice, totalDiscount, itemStatus, bus, busCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemPriceResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    subtotalPrice: ").append(toIndentedString(subtotalPrice)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
    sb.append("    busCount: ").append(toIndentedString(busCount)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("orderNumber");
    openapiFields.add("itemNumber");
    openapiFields.add("subtotalPrice");
    openapiFields.add("totalDiscount");
    openapiFields.add("itemStatus");
    openapiFields.add("bus");
    openapiFields.add("busCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemPriceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderItemPriceResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemPriceResponse is not found in the empty JSON string", OrderItemPriceResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemPriceResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemPriceResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemPriceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemPriceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemPriceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemPriceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemPriceResponse>() {
           @Override
           public void write(JsonWriter out, OrderItemPriceResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemPriceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemPriceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemPriceResponse
  * @throws IOException if the JSON string is invalid with respect to OrderItemPriceResponse
  */
  public static OrderItemPriceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemPriceResponse.class);
  }

 /**
  * Convert an instance of OrderItemPriceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


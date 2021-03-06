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
import com.sightsound.sdk.ticketing.model.OrderItem;
import com.sightsound.sdk.ticketing.model.TicketPrintStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * ShowOverflowSeat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T20:01:03.115466Z[Etc/UTC]")
public class ShowOverflowSeat {
  public static final String SERIALIZED_NAME_OVERFLOW_ID = "overflowId";
  @SerializedName(SERIALIZED_NAME_OVERFLOW_ID)
  private Long overflowId;

  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_SHOW_DATE_TIME = "showDateTime";
  @SerializedName(SERIALIZED_NAME_SHOW_DATE_TIME)
  private OffsetDateTime showDateTime;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "itemNumber";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private Integer itemNumber;

  public static final String SERIALIZED_NAME_TICKET_TEXT = "ticketText";
  @SerializedName(SERIALIZED_NAME_TICKET_TEXT)
  private String ticketText;

  public static final String SERIALIZED_NAME_TICKET_STATUS = "ticketStatus";
  @SerializedName(SERIALIZED_NAME_TICKET_STATUS)
  private TicketPrintStatus ticketStatus;

  public static final String SERIALIZED_NAME_ORDER_ITEM = "orderItem";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM)
  private OrderItem orderItem;

  public ShowOverflowSeat() { 
  }

  public ShowOverflowSeat overflowId(Long overflowId) {
    
    this.overflowId = overflowId;
    return this;
  }

   /**
   * Get overflowId
   * @return overflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOverflowId() {
    return overflowId;
  }


  public void setOverflowId(Long overflowId) {
    this.overflowId = overflowId;
  }


  public ShowOverflowSeat eventCode(String eventCode) {
    
    this.eventCode = eventCode;
    return this;
  }

   /**
   * Get eventCode
   * @return eventCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEventCode() {
    return eventCode;
  }


  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }


  public ShowOverflowSeat showDateTime(OffsetDateTime showDateTime) {
    
    this.showDateTime = showDateTime;
    return this;
  }

   /**
   * Get showDateTime
   * @return showDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getShowDateTime() {
    return showDateTime;
  }


  public void setShowDateTime(OffsetDateTime showDateTime) {
    this.showDateTime = showDateTime;
  }


  public ShowOverflowSeat orderNumber(Long orderNumber) {
    
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


  public ShowOverflowSeat itemNumber(Integer itemNumber) {
    
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


  public ShowOverflowSeat ticketText(String ticketText) {
    
    this.ticketText = ticketText;
    return this;
  }

   /**
   * Get ticketText
   * @return ticketText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTicketText() {
    return ticketText;
  }


  public void setTicketText(String ticketText) {
    this.ticketText = ticketText;
  }


  public ShowOverflowSeat ticketStatus(TicketPrintStatus ticketStatus) {
    
    this.ticketStatus = ticketStatus;
    return this;
  }

   /**
   * Get ticketStatus
   * @return ticketStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TicketPrintStatus getTicketStatus() {
    return ticketStatus;
  }


  public void setTicketStatus(TicketPrintStatus ticketStatus) {
    this.ticketStatus = ticketStatus;
  }


  public ShowOverflowSeat orderItem(OrderItem orderItem) {
    
    this.orderItem = orderItem;
    return this;
  }

   /**
   * Get orderItem
   * @return orderItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderItem getOrderItem() {
    return orderItem;
  }


  public void setOrderItem(OrderItem orderItem) {
    this.orderItem = orderItem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShowOverflowSeat showOverflowSeat = (ShowOverflowSeat) o;
    return Objects.equals(this.overflowId, showOverflowSeat.overflowId) &&
        Objects.equals(this.eventCode, showOverflowSeat.eventCode) &&
        Objects.equals(this.showDateTime, showOverflowSeat.showDateTime) &&
        Objects.equals(this.orderNumber, showOverflowSeat.orderNumber) &&
        Objects.equals(this.itemNumber, showOverflowSeat.itemNumber) &&
        Objects.equals(this.ticketText, showOverflowSeat.ticketText) &&
        Objects.equals(this.ticketStatus, showOverflowSeat.ticketStatus) &&
        Objects.equals(this.orderItem, showOverflowSeat.orderItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overflowId, eventCode, showDateTime, orderNumber, itemNumber, ticketText, ticketStatus, orderItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowOverflowSeat {\n");
    sb.append("    overflowId: ").append(toIndentedString(overflowId)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    showDateTime: ").append(toIndentedString(showDateTime)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    ticketText: ").append(toIndentedString(ticketText)).append("\n");
    sb.append("    ticketStatus: ").append(toIndentedString(ticketStatus)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
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
    openapiFields.add("overflowId");
    openapiFields.add("eventCode");
    openapiFields.add("showDateTime");
    openapiFields.add("orderNumber");
    openapiFields.add("itemNumber");
    openapiFields.add("ticketText");
    openapiFields.add("ticketStatus");
    openapiFields.add("orderItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eventCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShowOverflowSeat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShowOverflowSeat.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShowOverflowSeat is not found in the empty JSON string", ShowOverflowSeat.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShowOverflowSeat.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShowOverflowSeat` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShowOverflowSeat.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("eventCode") != null && !jsonObj.get("eventCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventCode").toString()));
      }
      if (jsonObj.get("ticketText") != null && !jsonObj.get("ticketText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticketText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticketText").toString()));
      }
      // validate the optional field `orderItem`
      if (jsonObj.getAsJsonObject("orderItem") != null) {
        OrderItem.validateJsonObject(jsonObj.getAsJsonObject("orderItem"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShowOverflowSeat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShowOverflowSeat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShowOverflowSeat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShowOverflowSeat.class));

       return (TypeAdapter<T>) new TypeAdapter<ShowOverflowSeat>() {
           @Override
           public void write(JsonWriter out, ShowOverflowSeat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShowOverflowSeat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShowOverflowSeat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShowOverflowSeat
  * @throws IOException if the JSON string is invalid with respect to ShowOverflowSeat
  */
  public static ShowOverflowSeat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShowOverflowSeat.class);
  }

 /**
  * Convert an instance of ShowOverflowSeat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


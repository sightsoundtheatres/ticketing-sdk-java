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
import com.sightsound.sdk.ticketing.model.Order;
import com.sightsound.sdk.ticketing.model.OrderItem;
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
 * GroupInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T20:01:03.115466Z[Etc/UTC]")
public class GroupInfo {
  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "itemNumber";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private Integer itemNumber;

  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_SHOW_DATE_TIME = "showDateTime";
  @SerializedName(SERIALIZED_NAME_SHOW_DATE_TIME)
  private OffsetDateTime showDateTime;

  public static final String SERIALIZED_NAME_GROUP_NUMBER = "groupNumber";
  @SerializedName(SERIALIZED_NAME_GROUP_NUMBER)
  private Integer groupNumber;

  public static final String SERIALIZED_NAME_GROUP_COUNT = "groupCount";
  @SerializedName(SERIALIZED_NAME_GROUP_COUNT)
  private Integer groupCount;

  public static final String SERIALIZED_NAME_ARRIVAL_DATE_TIME = "arrivalDateTime";
  @SerializedName(SERIALIZED_NAME_ARRIVAL_DATE_TIME)
  private OffsetDateTime arrivalDateTime;

  public static final String SERIALIZED_NAME_BUS_SPACES = "busSpaces";
  @SerializedName(SERIALIZED_NAME_BUS_SPACES)
  private String busSpaces;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_ORDER_ITEM = "orderItem";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM)
  private OrderItem orderItem;

  public GroupInfo() { 
  }

  public GroupInfo orderNumber(Long orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
  }


  public GroupInfo itemNumber(Integer itemNumber) {
    
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * Get itemNumber
   * @return itemNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getItemNumber() {
    return itemNumber;
  }


  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }


  public GroupInfo eventCode(String eventCode) {
    
    this.eventCode = eventCode;
    return this;
  }

   /**
   * Get eventCode
   * @return eventCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventCode() {
    return eventCode;
  }


  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }


  public GroupInfo showDateTime(OffsetDateTime showDateTime) {
    
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


  public GroupInfo groupNumber(Integer groupNumber) {
    
    this.groupNumber = groupNumber;
    return this;
  }

   /**
   * Get groupNumber
   * @return groupNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGroupNumber() {
    return groupNumber;
  }


  public void setGroupNumber(Integer groupNumber) {
    this.groupNumber = groupNumber;
  }


  public GroupInfo groupCount(Integer groupCount) {
    
    this.groupCount = groupCount;
    return this;
  }

   /**
   * Get groupCount
   * @return groupCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGroupCount() {
    return groupCount;
  }


  public void setGroupCount(Integer groupCount) {
    this.groupCount = groupCount;
  }


  public GroupInfo arrivalDateTime(OffsetDateTime arrivalDateTime) {
    
    this.arrivalDateTime = arrivalDateTime;
    return this;
  }

   /**
   * Get arrivalDateTime
   * @return arrivalDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getArrivalDateTime() {
    return arrivalDateTime;
  }


  public void setArrivalDateTime(OffsetDateTime arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
  }


  public GroupInfo busSpaces(String busSpaces) {
    
    this.busSpaces = busSpaces;
    return this;
  }

   /**
   * Get busSpaces
   * @return busSpaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusSpaces() {
    return busSpaces;
  }


  public void setBusSpaces(String busSpaces) {
    this.busSpaces = busSpaces;
  }


  public GroupInfo order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }


  public GroupInfo orderItem(OrderItem orderItem) {
    
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
    GroupInfo groupInfo = (GroupInfo) o;
    return Objects.equals(this.orderNumber, groupInfo.orderNumber) &&
        Objects.equals(this.itemNumber, groupInfo.itemNumber) &&
        Objects.equals(this.eventCode, groupInfo.eventCode) &&
        Objects.equals(this.showDateTime, groupInfo.showDateTime) &&
        Objects.equals(this.groupNumber, groupInfo.groupNumber) &&
        Objects.equals(this.groupCount, groupInfo.groupCount) &&
        Objects.equals(this.arrivalDateTime, groupInfo.arrivalDateTime) &&
        Objects.equals(this.busSpaces, groupInfo.busSpaces) &&
        Objects.equals(this.order, groupInfo.order) &&
        Objects.equals(this.orderItem, groupInfo.orderItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber, itemNumber, eventCode, showDateTime, groupNumber, groupCount, arrivalDateTime, busSpaces, order, orderItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupInfo {\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    showDateTime: ").append(toIndentedString(showDateTime)).append("\n");
    sb.append("    groupNumber: ").append(toIndentedString(groupNumber)).append("\n");
    sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
    sb.append("    arrivalDateTime: ").append(toIndentedString(arrivalDateTime)).append("\n");
    sb.append("    busSpaces: ").append(toIndentedString(busSpaces)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("orderNumber");
    openapiFields.add("itemNumber");
    openapiFields.add("eventCode");
    openapiFields.add("showDateTime");
    openapiFields.add("groupNumber");
    openapiFields.add("groupCount");
    openapiFields.add("arrivalDateTime");
    openapiFields.add("busSpaces");
    openapiFields.add("order");
    openapiFields.add("orderItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orderNumber");
    openapiRequiredFields.add("itemNumber");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupInfo is not found in the empty JSON string", GroupInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("eventCode") != null && !jsonObj.get("eventCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventCode").toString()));
      }
      if (jsonObj.get("busSpaces") != null && !jsonObj.get("busSpaces").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `busSpaces` to be a primitive type in the JSON string but got `%s`", jsonObj.get("busSpaces").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.getAsJsonObject("order") != null) {
        Order.validateJsonObject(jsonObj.getAsJsonObject("order"));
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
       if (!GroupInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupInfo>() {
           @Override
           public void write(JsonWriter out, GroupInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupInfo
  * @throws IOException if the JSON string is invalid with respect to GroupInfo
  */
  public static GroupInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupInfo.class);
  }

 /**
  * Convert an instance of GroupInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


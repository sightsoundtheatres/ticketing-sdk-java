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
import com.sightsound.sdk.ticketing.model.CompCodeType;
import com.sightsound.sdk.ticketing.model.OrderItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * OrderItemComp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T08:40:20.483181-05:00[America/Chicago]")
public class OrderItemComp {
  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "itemNumber";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private Integer itemNumber;

  public static final String SERIALIZED_NAME_COMP_NUMBER = "compNumber";
  @SerializedName(SERIALIZED_NAME_COMP_NUMBER)
  private Long compNumber;

  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_COMP_TYPE = "compType";
  @SerializedName(SERIALIZED_NAME_COMP_TYPE)
  private CompCodeType compType;

  public static final String SERIALIZED_NAME_UNIQUE_CODE = "uniqueCode";
  @SerializedName(SERIALIZED_NAME_UNIQUE_CODE)
  private String uniqueCode;

  public static final String SERIALIZED_NAME_ADD_USER_ID = "addUserId";
  @SerializedName(SERIALIZED_NAME_ADD_USER_ID)
  private String addUserId;

  public static final String SERIALIZED_NAME_ADD_DATE = "addDate";
  @SerializedName(SERIALIZED_NAME_ADD_DATE)
  private OffsetDateTime addDate;

  public static final String SERIALIZED_NAME_ADULT = "adult";
  @SerializedName(SERIALIZED_NAME_ADULT)
  private Integer adult;

  public static final String SERIALIZED_NAME_TEEN = "teen";
  @SerializedName(SERIALIZED_NAME_TEEN)
  private Integer teen;

  public static final String SERIALIZED_NAME_CHILD = "child";
  @SerializedName(SERIALIZED_NAME_CHILD)
  private Integer child;

  public static final String SERIALIZED_NAME_DISCOUNT_PERCENT = "discountPercent";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_PERCENT)
  private BigDecimal discountPercent;

  public static final String SERIALIZED_NAME_DISC_COUNT_MAX = "discCountMax";
  @SerializedName(SERIALIZED_NAME_DISC_COUNT_MAX)
  private Integer discCountMax;

  public static final String SERIALIZED_NAME_ORDER_ITEM = "orderItem";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM)
  private OrderItem orderItem;

  public OrderItemComp() { 
  }

  public OrderItemComp orderNumber(Long orderNumber) {
    
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


  public OrderItemComp itemNumber(Integer itemNumber) {
    
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


  public OrderItemComp compNumber(Long compNumber) {
    
    this.compNumber = compNumber;
    return this;
  }

   /**
   * Get compNumber
   * @return compNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCompNumber() {
    return compNumber;
  }


  public void setCompNumber(Long compNumber) {
    this.compNumber = compNumber;
  }


  public OrderItemComp eventCode(String eventCode) {
    
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


  public OrderItemComp compType(CompCodeType compType) {
    
    this.compType = compType;
    return this;
  }

   /**
   * Get compType
   * @return compType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CompCodeType getCompType() {
    return compType;
  }


  public void setCompType(CompCodeType compType) {
    this.compType = compType;
  }


  public OrderItemComp uniqueCode(String uniqueCode) {
    
    this.uniqueCode = uniqueCode;
    return this;
  }

   /**
   * Get uniqueCode
   * @return uniqueCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUniqueCode() {
    return uniqueCode;
  }


  public void setUniqueCode(String uniqueCode) {
    this.uniqueCode = uniqueCode;
  }


  public OrderItemComp addUserId(String addUserId) {
    
    this.addUserId = addUserId;
    return this;
  }

   /**
   * Get addUserId
   * @return addUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAddUserId() {
    return addUserId;
  }


  public void setAddUserId(String addUserId) {
    this.addUserId = addUserId;
  }


  public OrderItemComp addDate(OffsetDateTime addDate) {
    
    this.addDate = addDate;
    return this;
  }

   /**
   * Get addDate
   * @return addDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getAddDate() {
    return addDate;
  }


  public void setAddDate(OffsetDateTime addDate) {
    this.addDate = addDate;
  }


  public OrderItemComp adult(Integer adult) {
    
    this.adult = adult;
    return this;
  }

   /**
   * Get adult
   * @return adult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAdult() {
    return adult;
  }


  public void setAdult(Integer adult) {
    this.adult = adult;
  }


  public OrderItemComp teen(Integer teen) {
    
    this.teen = teen;
    return this;
  }

   /**
   * Get teen
   * @return teen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTeen() {
    return teen;
  }


  public void setTeen(Integer teen) {
    this.teen = teen;
  }


  public OrderItemComp child(Integer child) {
    
    this.child = child;
    return this;
  }

   /**
   * Get child
   * @return child
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getChild() {
    return child;
  }


  public void setChild(Integer child) {
    this.child = child;
  }


  public OrderItemComp discountPercent(BigDecimal discountPercent) {
    
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * Get discountPercent
   * @return discountPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDiscountPercent() {
    return discountPercent;
  }


  public void setDiscountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }


  public OrderItemComp discCountMax(Integer discCountMax) {
    
    this.discCountMax = discCountMax;
    return this;
  }

   /**
   * Get discCountMax
   * @return discCountMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiscCountMax() {
    return discCountMax;
  }


  public void setDiscCountMax(Integer discCountMax) {
    this.discCountMax = discCountMax;
  }


  public OrderItemComp orderItem(OrderItem orderItem) {
    
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
    OrderItemComp orderItemComp = (OrderItemComp) o;
    return Objects.equals(this.orderNumber, orderItemComp.orderNumber) &&
        Objects.equals(this.itemNumber, orderItemComp.itemNumber) &&
        Objects.equals(this.compNumber, orderItemComp.compNumber) &&
        Objects.equals(this.eventCode, orderItemComp.eventCode) &&
        Objects.equals(this.compType, orderItemComp.compType) &&
        Objects.equals(this.uniqueCode, orderItemComp.uniqueCode) &&
        Objects.equals(this.addUserId, orderItemComp.addUserId) &&
        Objects.equals(this.addDate, orderItemComp.addDate) &&
        Objects.equals(this.adult, orderItemComp.adult) &&
        Objects.equals(this.teen, orderItemComp.teen) &&
        Objects.equals(this.child, orderItemComp.child) &&
        Objects.equals(this.discountPercent, orderItemComp.discountPercent) &&
        Objects.equals(this.discCountMax, orderItemComp.discCountMax) &&
        Objects.equals(this.orderItem, orderItemComp.orderItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber, itemNumber, compNumber, eventCode, compType, uniqueCode, addUserId, addDate, adult, teen, child, discountPercent, discCountMax, orderItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemComp {\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    compNumber: ").append(toIndentedString(compNumber)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    compType: ").append(toIndentedString(compType)).append("\n");
    sb.append("    uniqueCode: ").append(toIndentedString(uniqueCode)).append("\n");
    sb.append("    addUserId: ").append(toIndentedString(addUserId)).append("\n");
    sb.append("    addDate: ").append(toIndentedString(addDate)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    teen: ").append(toIndentedString(teen)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    discCountMax: ").append(toIndentedString(discCountMax)).append("\n");
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
    openapiFields.add("compNumber");
    openapiFields.add("eventCode");
    openapiFields.add("compType");
    openapiFields.add("uniqueCode");
    openapiFields.add("addUserId");
    openapiFields.add("addDate");
    openapiFields.add("adult");
    openapiFields.add("teen");
    openapiFields.add("child");
    openapiFields.add("discountPercent");
    openapiFields.add("discCountMax");
    openapiFields.add("orderItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eventCode");
    openapiRequiredFields.add("compType");
    openapiRequiredFields.add("addUserId");
    openapiRequiredFields.add("addDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemComp
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderItemComp.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemComp is not found in the empty JSON string", OrderItemComp.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemComp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemComp` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderItemComp.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("eventCode") != null && !jsonObj.get("eventCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventCode").toString()));
      }
      if (jsonObj.get("uniqueCode") != null && !jsonObj.get("uniqueCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uniqueCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uniqueCode").toString()));
      }
      if (jsonObj.get("addUserId") != null && !jsonObj.get("addUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addUserId").toString()));
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
       if (!OrderItemComp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemComp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemComp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemComp.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemComp>() {
           @Override
           public void write(JsonWriter out, OrderItemComp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemComp read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemComp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemComp
  * @throws IOException if the JSON string is invalid with respect to OrderItemComp
  */
  public static OrderItemComp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemComp.class);
  }

 /**
  * Convert an instance of OrderItemComp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


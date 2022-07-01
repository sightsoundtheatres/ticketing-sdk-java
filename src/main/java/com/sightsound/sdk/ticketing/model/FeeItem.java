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
import com.sightsound.sdk.ticketing.model.ActivityType;
import com.sightsound.sdk.ticketing.model.FeeKind;
import com.sightsound.sdk.ticketing.model.FeeType;
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
 * FeeItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T08:27:57.763723-05:00[America/Chicago]")
public class FeeItem {
  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "itemNumber";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private Integer itemNumber;

  public static final String SERIALIZED_NAME_FEE_KIND_CODE = "feeKindCode";
  @SerializedName(SERIALIZED_NAME_FEE_KIND_CODE)
  private FeeKind feeKindCode;

  public static final String SERIALIZED_NAME_FEE_COUNT = "feeCount";
  @SerializedName(SERIALIZED_NAME_FEE_COUNT)
  private Integer feeCount;

  public static final String SERIALIZED_NAME_FEE_PER_COUNT = "feePerCount";
  @SerializedName(SERIALIZED_NAME_FEE_PER_COUNT)
  private BigDecimal feePerCount;

  public static final String SERIALIZED_NAME_FLAT_FEE = "flatFee";
  @SerializedName(SERIALIZED_NAME_FLAT_FEE)
  private BigDecimal flatFee;

  public static final String SERIALIZED_NAME_TOTAL_FEE = "totalFee";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEE)
  private BigDecimal totalFee;

  public static final String SERIALIZED_NAME_FEE_ID = "feeId";
  @SerializedName(SERIALIZED_NAME_FEE_ID)
  private Long feeId;

  public static final String SERIALIZED_NAME_FEE_TYPE_CODE = "feeTypeCode";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE_CODE)
  private FeeType feeTypeCode;

  public static final String SERIALIZED_NAME_FEE_DATE = "feeDate";
  @SerializedName(SERIALIZED_NAME_FEE_DATE)
  private OffsetDateTime feeDate;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ADD_USER_ID = "addUserId";
  @SerializedName(SERIALIZED_NAME_ADD_USER_ID)
  private String addUserId;

  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private BigDecimal percent;

  public static final String SERIALIZED_NAME_PERCENT_FEE = "percentFee";
  @SerializedName(SERIALIZED_NAME_PERCENT_FEE)
  private BigDecimal percentFee;

  public static final String SERIALIZED_NAME_PERCENT_AMOUNT = "percentAmount";
  @SerializedName(SERIALIZED_NAME_PERCENT_AMOUNT)
  private BigDecimal percentAmount;

  public static final String SERIALIZED_NAME_ORDER_ITEM = "orderItem";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM)
  private OrderItem orderItem;

  public static final String SERIALIZED_NAME_LOG_CHANGES = "logChanges";
  @SerializedName(SERIALIZED_NAME_LOG_CHANGES)
  private Boolean logChanges;

  public static final String SERIALIZED_NAME_LOG_ACTIVITY = "logActivity";
  @SerializedName(SERIALIZED_NAME_LOG_ACTIVITY)
  private ActivityType logActivity;

  public FeeItem() { 
  }

  public FeeItem orderNumber(Long orderNumber) {
    
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


  public FeeItem itemNumber(Integer itemNumber) {
    
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


  public FeeItem feeKindCode(FeeKind feeKindCode) {
    
    this.feeKindCode = feeKindCode;
    return this;
  }

   /**
   * Get feeKindCode
   * @return feeKindCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FeeKind getFeeKindCode() {
    return feeKindCode;
  }


  public void setFeeKindCode(FeeKind feeKindCode) {
    this.feeKindCode = feeKindCode;
  }


  public FeeItem feeCount(Integer feeCount) {
    
    this.feeCount = feeCount;
    return this;
  }

   /**
   * Get feeCount
   * @return feeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFeeCount() {
    return feeCount;
  }


  public void setFeeCount(Integer feeCount) {
    this.feeCount = feeCount;
  }


  public FeeItem feePerCount(BigDecimal feePerCount) {
    
    this.feePerCount = feePerCount;
    return this;
  }

   /**
   * Get feePerCount
   * @return feePerCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getFeePerCount() {
    return feePerCount;
  }


  public void setFeePerCount(BigDecimal feePerCount) {
    this.feePerCount = feePerCount;
  }


  public FeeItem flatFee(BigDecimal flatFee) {
    
    this.flatFee = flatFee;
    return this;
  }

   /**
   * Get flatFee
   * @return flatFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getFlatFee() {
    return flatFee;
  }


  public void setFlatFee(BigDecimal flatFee) {
    this.flatFee = flatFee;
  }


  public FeeItem totalFee(BigDecimal totalFee) {
    
    this.totalFee = totalFee;
    return this;
  }

   /**
   * Get totalFee
   * @return totalFee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getTotalFee() {
    return totalFee;
  }


  public void setTotalFee(BigDecimal totalFee) {
    this.totalFee = totalFee;
  }


  public FeeItem feeId(Long feeId) {
    
    this.feeId = feeId;
    return this;
  }

   /**
   * Get feeId
   * @return feeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFeeId() {
    return feeId;
  }


  public void setFeeId(Long feeId) {
    this.feeId = feeId;
  }


  public FeeItem feeTypeCode(FeeType feeTypeCode) {
    
    this.feeTypeCode = feeTypeCode;
    return this;
  }

   /**
   * Get feeTypeCode
   * @return feeTypeCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FeeType getFeeTypeCode() {
    return feeTypeCode;
  }


  public void setFeeTypeCode(FeeType feeTypeCode) {
    this.feeTypeCode = feeTypeCode;
  }


  public FeeItem feeDate(OffsetDateTime feeDate) {
    
    this.feeDate = feeDate;
    return this;
  }

   /**
   * Get feeDate
   * @return feeDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getFeeDate() {
    return feeDate;
  }


  public void setFeeDate(OffsetDateTime feeDate) {
    this.feeDate = feeDate;
  }


  public FeeItem active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public FeeItem addUserId(String addUserId) {
    
    this.addUserId = addUserId;
    return this;
  }

   /**
   * Get addUserId
   * @return addUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddUserId() {
    return addUserId;
  }


  public void setAddUserId(String addUserId) {
    this.addUserId = addUserId;
  }


  public FeeItem percent(BigDecimal percent) {
    
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * minimum: 0
   * @return percent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercent() {
    return percent;
  }


  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }


  public FeeItem percentFee(BigDecimal percentFee) {
    
    this.percentFee = percentFee;
    return this;
  }

   /**
   * Get percentFee
   * minimum: 0
   * @return percentFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercentFee() {
    return percentFee;
  }


  public void setPercentFee(BigDecimal percentFee) {
    this.percentFee = percentFee;
  }


  public FeeItem percentAmount(BigDecimal percentAmount) {
    
    this.percentAmount = percentAmount;
    return this;
  }

   /**
   * Get percentAmount
   * minimum: 0
   * @return percentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercentAmount() {
    return percentAmount;
  }


  public void setPercentAmount(BigDecimal percentAmount) {
    this.percentAmount = percentAmount;
  }


  public FeeItem orderItem(OrderItem orderItem) {
    
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


  public FeeItem logChanges(Boolean logChanges) {
    
    this.logChanges = logChanges;
    return this;
  }

   /**
   * Get logChanges
   * @return logChanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLogChanges() {
    return logChanges;
  }


  public void setLogChanges(Boolean logChanges) {
    this.logChanges = logChanges;
  }


  public FeeItem logActivity(ActivityType logActivity) {
    
    this.logActivity = logActivity;
    return this;
  }

   /**
   * Get logActivity
   * @return logActivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActivityType getLogActivity() {
    return logActivity;
  }


  public void setLogActivity(ActivityType logActivity) {
    this.logActivity = logActivity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeItem feeItem = (FeeItem) o;
    return Objects.equals(this.orderNumber, feeItem.orderNumber) &&
        Objects.equals(this.itemNumber, feeItem.itemNumber) &&
        Objects.equals(this.feeKindCode, feeItem.feeKindCode) &&
        Objects.equals(this.feeCount, feeItem.feeCount) &&
        Objects.equals(this.feePerCount, feeItem.feePerCount) &&
        Objects.equals(this.flatFee, feeItem.flatFee) &&
        Objects.equals(this.totalFee, feeItem.totalFee) &&
        Objects.equals(this.feeId, feeItem.feeId) &&
        Objects.equals(this.feeTypeCode, feeItem.feeTypeCode) &&
        Objects.equals(this.feeDate, feeItem.feeDate) &&
        Objects.equals(this.active, feeItem.active) &&
        Objects.equals(this.addUserId, feeItem.addUserId) &&
        Objects.equals(this.percent, feeItem.percent) &&
        Objects.equals(this.percentFee, feeItem.percentFee) &&
        Objects.equals(this.percentAmount, feeItem.percentAmount) &&
        Objects.equals(this.orderItem, feeItem.orderItem) &&
        Objects.equals(this.logChanges, feeItem.logChanges) &&
        Objects.equals(this.logActivity, feeItem.logActivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber, itemNumber, feeKindCode, feeCount, feePerCount, flatFee, totalFee, feeId, feeTypeCode, feeDate, active, addUserId, percent, percentFee, percentAmount, orderItem, logChanges, logActivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeItem {\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    feeKindCode: ").append(toIndentedString(feeKindCode)).append("\n");
    sb.append("    feeCount: ").append(toIndentedString(feeCount)).append("\n");
    sb.append("    feePerCount: ").append(toIndentedString(feePerCount)).append("\n");
    sb.append("    flatFee: ").append(toIndentedString(flatFee)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
    sb.append("    feeId: ").append(toIndentedString(feeId)).append("\n");
    sb.append("    feeTypeCode: ").append(toIndentedString(feeTypeCode)).append("\n");
    sb.append("    feeDate: ").append(toIndentedString(feeDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    addUserId: ").append(toIndentedString(addUserId)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    percentFee: ").append(toIndentedString(percentFee)).append("\n");
    sb.append("    percentAmount: ").append(toIndentedString(percentAmount)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
    sb.append("    logChanges: ").append(toIndentedString(logChanges)).append("\n");
    sb.append("    logActivity: ").append(toIndentedString(logActivity)).append("\n");
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
    openapiFields.add("feeKindCode");
    openapiFields.add("feeCount");
    openapiFields.add("feePerCount");
    openapiFields.add("flatFee");
    openapiFields.add("totalFee");
    openapiFields.add("feeId");
    openapiFields.add("feeTypeCode");
    openapiFields.add("feeDate");
    openapiFields.add("active");
    openapiFields.add("addUserId");
    openapiFields.add("percent");
    openapiFields.add("percentFee");
    openapiFields.add("percentAmount");
    openapiFields.add("orderItem");
    openapiFields.add("logChanges");
    openapiFields.add("logActivity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("feeKindCode");
    openapiRequiredFields.add("totalFee");
    openapiRequiredFields.add("feeTypeCode");
    openapiRequiredFields.add("feeDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeeItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FeeItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeeItem is not found in the empty JSON string", FeeItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FeeItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeeItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FeeItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
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
       if (!FeeItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeeItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeeItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeeItem.class));

       return (TypeAdapter<T>) new TypeAdapter<FeeItem>() {
           @Override
           public void write(JsonWriter out, FeeItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeeItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeeItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeeItem
  * @throws IOException if the JSON string is invalid with respect to FeeItem
  */
  public static FeeItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeeItem.class);
  }

 /**
  * Convert an instance of FeeItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.sightsound.sdk.ticketing.model.DiscountType;
import com.sightsound.sdk.ticketing.model.Special;
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
 * SpecialDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T20:01:03.115466Z[Etc/UTC]")
public class SpecialDetail {
  public static final String SERIALIZED_NAME_SPECIAL_CODE = "specialCode";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CODE)
  private String specialCode;

  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_DESIGNATION_CODE = "designationCode";
  @SerializedName(SERIALIZED_NAME_DESIGNATION_CODE)
  private Designation designationCode;

  public static final String SERIALIZED_NAME_BUY_COUNT = "buyCount";
  @SerializedName(SERIALIZED_NAME_BUY_COUNT)
  private Integer buyCount;

  public static final String SERIALIZED_NAME_DESIGNATION_MAX = "designationMax";
  @SerializedName(SERIALIZED_NAME_DESIGNATION_MAX)
  private Integer designationMax;

  public static final String SERIALIZED_NAME_DESIGNATION_MIN = "designationMin";
  @SerializedName(SERIALIZED_NAME_DESIGNATION_MIN)
  private Integer designationMin;

  public static final String SERIALIZED_NAME_DISC_COUNT = "discCount";
  @SerializedName(SERIALIZED_NAME_DISC_COUNT)
  private Integer discCount;

  public static final String SERIALIZED_NAME_DISC_TYPE_CODE = "discTypeCode";
  @SerializedName(SERIALIZED_NAME_DISC_TYPE_CODE)
  private DiscountType discTypeCode;

  public static final String SERIALIZED_NAME_DISC_VALUE = "discValue";
  @SerializedName(SERIALIZED_NAME_DISC_VALUE)
  private BigDecimal discValue;

  public static final String SERIALIZED_NAME_GET_COUNT = "getCount";
  @SerializedName(SERIALIZED_NAME_GET_COUNT)
  private Integer getCount;

  public static final String SERIALIZED_NAME_MAX_DISC_COUNT = "maxDiscCount";
  @SerializedName(SERIALIZED_NAME_MAX_DISC_COUNT)
  private Integer maxDiscCount;

  public static final String SERIALIZED_NAME_SPECIAL = "special";
  @SerializedName(SERIALIZED_NAME_SPECIAL)
  private Special special;

  public SpecialDetail() { 
  }

  public SpecialDetail specialCode(String specialCode) {
    
    this.specialCode = specialCode;
    return this;
  }

   /**
   * Get specialCode
   * @return specialCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSpecialCode() {
    return specialCode;
  }


  public void setSpecialCode(String specialCode) {
    this.specialCode = specialCode;
  }


  public SpecialDetail eventCode(String eventCode) {
    
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


  public SpecialDetail designationCode(Designation designationCode) {
    
    this.designationCode = designationCode;
    return this;
  }

   /**
   * Get designationCode
   * @return designationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Designation getDesignationCode() {
    return designationCode;
  }


  public void setDesignationCode(Designation designationCode) {
    this.designationCode = designationCode;
  }


  public SpecialDetail buyCount(Integer buyCount) {
    
    this.buyCount = buyCount;
    return this;
  }

   /**
   * Get buyCount
   * @return buyCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBuyCount() {
    return buyCount;
  }


  public void setBuyCount(Integer buyCount) {
    this.buyCount = buyCount;
  }


  public SpecialDetail designationMax(Integer designationMax) {
    
    this.designationMax = designationMax;
    return this;
  }

   /**
   * Get designationMax
   * @return designationMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDesignationMax() {
    return designationMax;
  }


  public void setDesignationMax(Integer designationMax) {
    this.designationMax = designationMax;
  }


  public SpecialDetail designationMin(Integer designationMin) {
    
    this.designationMin = designationMin;
    return this;
  }

   /**
   * Get designationMin
   * @return designationMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDesignationMin() {
    return designationMin;
  }


  public void setDesignationMin(Integer designationMin) {
    this.designationMin = designationMin;
  }


  public SpecialDetail discCount(Integer discCount) {
    
    this.discCount = discCount;
    return this;
  }

   /**
   * Get discCount
   * @return discCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiscCount() {
    return discCount;
  }


  public void setDiscCount(Integer discCount) {
    this.discCount = discCount;
  }


  public SpecialDetail discTypeCode(DiscountType discTypeCode) {
    
    this.discTypeCode = discTypeCode;
    return this;
  }

   /**
   * Get discTypeCode
   * @return discTypeCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DiscountType getDiscTypeCode() {
    return discTypeCode;
  }


  public void setDiscTypeCode(DiscountType discTypeCode) {
    this.discTypeCode = discTypeCode;
  }


  public SpecialDetail discValue(BigDecimal discValue) {
    
    this.discValue = discValue;
    return this;
  }

   /**
   * Get discValue
   * @return discValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getDiscValue() {
    return discValue;
  }


  public void setDiscValue(BigDecimal discValue) {
    this.discValue = discValue;
  }


  public SpecialDetail getCount(Integer getCount) {
    
    this.getCount = getCount;
    return this;
  }

   /**
   * Get getCount
   * @return getCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGetCount() {
    return getCount;
  }


  public void setGetCount(Integer getCount) {
    this.getCount = getCount;
  }


  public SpecialDetail maxDiscCount(Integer maxDiscCount) {
    
    this.maxDiscCount = maxDiscCount;
    return this;
  }

   /**
   * Get maxDiscCount
   * @return maxDiscCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxDiscCount() {
    return maxDiscCount;
  }


  public void setMaxDiscCount(Integer maxDiscCount) {
    this.maxDiscCount = maxDiscCount;
  }


  public SpecialDetail special(Special special) {
    
    this.special = special;
    return this;
  }

   /**
   * Get special
   * @return special
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Special getSpecial() {
    return special;
  }


  public void setSpecial(Special special) {
    this.special = special;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialDetail specialDetail = (SpecialDetail) o;
    return Objects.equals(this.specialCode, specialDetail.specialCode) &&
        Objects.equals(this.eventCode, specialDetail.eventCode) &&
        Objects.equals(this.designationCode, specialDetail.designationCode) &&
        Objects.equals(this.buyCount, specialDetail.buyCount) &&
        Objects.equals(this.designationMax, specialDetail.designationMax) &&
        Objects.equals(this.designationMin, specialDetail.designationMin) &&
        Objects.equals(this.discCount, specialDetail.discCount) &&
        Objects.equals(this.discTypeCode, specialDetail.discTypeCode) &&
        Objects.equals(this.discValue, specialDetail.discValue) &&
        Objects.equals(this.getCount, specialDetail.getCount) &&
        Objects.equals(this.maxDiscCount, specialDetail.maxDiscCount) &&
        Objects.equals(this.special, specialDetail.special);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialCode, eventCode, designationCode, buyCount, designationMax, designationMin, discCount, discTypeCode, discValue, getCount, maxDiscCount, special);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialDetail {\n");
    sb.append("    specialCode: ").append(toIndentedString(specialCode)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    designationCode: ").append(toIndentedString(designationCode)).append("\n");
    sb.append("    buyCount: ").append(toIndentedString(buyCount)).append("\n");
    sb.append("    designationMax: ").append(toIndentedString(designationMax)).append("\n");
    sb.append("    designationMin: ").append(toIndentedString(designationMin)).append("\n");
    sb.append("    discCount: ").append(toIndentedString(discCount)).append("\n");
    sb.append("    discTypeCode: ").append(toIndentedString(discTypeCode)).append("\n");
    sb.append("    discValue: ").append(toIndentedString(discValue)).append("\n");
    sb.append("    getCount: ").append(toIndentedString(getCount)).append("\n");
    sb.append("    maxDiscCount: ").append(toIndentedString(maxDiscCount)).append("\n");
    sb.append("    special: ").append(toIndentedString(special)).append("\n");
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
    openapiFields.add("specialCode");
    openapiFields.add("eventCode");
    openapiFields.add("designationCode");
    openapiFields.add("buyCount");
    openapiFields.add("designationMax");
    openapiFields.add("designationMin");
    openapiFields.add("discCount");
    openapiFields.add("discTypeCode");
    openapiFields.add("discValue");
    openapiFields.add("getCount");
    openapiFields.add("maxDiscCount");
    openapiFields.add("special");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("specialCode");
    openapiRequiredFields.add("eventCode");
    openapiRequiredFields.add("designationCode");
    openapiRequiredFields.add("discTypeCode");
    openapiRequiredFields.add("discValue");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpecialDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SpecialDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpecialDetail is not found in the empty JSON string", SpecialDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SpecialDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpecialDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SpecialDetail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("specialCode") != null && !jsonObj.get("specialCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialCode").toString()));
      }
      if (jsonObj.get("eventCode") != null && !jsonObj.get("eventCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventCode").toString()));
      }
      // validate the optional field `special`
      if (jsonObj.getAsJsonObject("special") != null) {
        Special.validateJsonObject(jsonObj.getAsJsonObject("special"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpecialDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpecialDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpecialDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpecialDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<SpecialDetail>() {
           @Override
           public void write(JsonWriter out, SpecialDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpecialDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpecialDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpecialDetail
  * @throws IOException if the JSON string is invalid with respect to SpecialDetail
  */
  public static SpecialDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpecialDetail.class);
  }

 /**
  * Convert an instance of SpecialDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


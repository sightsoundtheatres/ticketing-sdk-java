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
import com.sightsound.sdk.ticketing.model.SeatType;
import com.sightsound.sdk.ticketing.model.SeatingProfile;
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
 * SeatingProfileDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T19:32:42.242731Z[Etc/UTC]")
public class SeatingProfileDetail {
  public static final String SERIALIZED_NAME_SEAT_TYPE_CODE = "seatTypeCode";
  @SerializedName(SERIALIZED_NAME_SEAT_TYPE_CODE)
  private SeatType seatTypeCode;

  public static final String SERIALIZED_NAME_DOLLARS_OFF = "dollarsOff";
  @SerializedName(SERIALIZED_NAME_DOLLARS_OFF)
  private BigDecimal dollarsOff;

  public static final String SERIALIZED_NAME_DAY_OF_SHOW = "dayOfShow";
  @SerializedName(SERIALIZED_NAME_DAY_OF_SHOW)
  private String dayOfShow;

  public static final String SERIALIZED_NAME_WARNING_TEXT = "warningText";
  @SerializedName(SERIALIZED_NAME_WARNING_TEXT)
  private String warningText;

  public static final String SERIALIZED_NAME_COUNT_BUCKET_CODE = "countBucketCode";
  @SerializedName(SERIALIZED_NAME_COUNT_BUCKET_CODE)
  private String countBucketCode;

  public static final String SERIALIZED_NAME_SEAT_PROFILE_CODE = "seatProfileCode";
  @SerializedName(SERIALIZED_NAME_SEAT_PROFILE_CODE)
  private String seatProfileCode;

  public static final String SERIALIZED_NAME_SEAT_DISPLAY_CHAR = "seatDisplayChar";
  @SerializedName(SERIALIZED_NAME_SEAT_DISPLAY_CHAR)
  private String seatDisplayChar;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private SeatingProfile profile;

  public SeatingProfileDetail() { 
  }

  public SeatingProfileDetail seatTypeCode(SeatType seatTypeCode) {
    
    this.seatTypeCode = seatTypeCode;
    return this;
  }

   /**
   * Get seatTypeCode
   * @return seatTypeCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SeatType getSeatTypeCode() {
    return seatTypeCode;
  }


  public void setSeatTypeCode(SeatType seatTypeCode) {
    this.seatTypeCode = seatTypeCode;
  }


  public SeatingProfileDetail dollarsOff(BigDecimal dollarsOff) {
    
    this.dollarsOff = dollarsOff;
    return this;
  }

   /**
   * Get dollarsOff
   * @return dollarsOff
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getDollarsOff() {
    return dollarsOff;
  }


  public void setDollarsOff(BigDecimal dollarsOff) {
    this.dollarsOff = dollarsOff;
  }


  public SeatingProfileDetail dayOfShow(String dayOfShow) {
    
    this.dayOfShow = dayOfShow;
    return this;
  }

   /**
   * Get dayOfShow
   * @return dayOfShow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDayOfShow() {
    return dayOfShow;
  }


  public void setDayOfShow(String dayOfShow) {
    this.dayOfShow = dayOfShow;
  }


  public SeatingProfileDetail warningText(String warningText) {
    
    this.warningText = warningText;
    return this;
  }

   /**
   * Get warningText
   * @return warningText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWarningText() {
    return warningText;
  }


  public void setWarningText(String warningText) {
    this.warningText = warningText;
  }


  public SeatingProfileDetail countBucketCode(String countBucketCode) {
    
    this.countBucketCode = countBucketCode;
    return this;
  }

   /**
   * Get countBucketCode
   * @return countBucketCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCountBucketCode() {
    return countBucketCode;
  }


  public void setCountBucketCode(String countBucketCode) {
    this.countBucketCode = countBucketCode;
  }


  public SeatingProfileDetail seatProfileCode(String seatProfileCode) {
    
    this.seatProfileCode = seatProfileCode;
    return this;
  }

   /**
   * Get seatProfileCode
   * @return seatProfileCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSeatProfileCode() {
    return seatProfileCode;
  }


  public void setSeatProfileCode(String seatProfileCode) {
    this.seatProfileCode = seatProfileCode;
  }


  public SeatingProfileDetail seatDisplayChar(String seatDisplayChar) {
    
    this.seatDisplayChar = seatDisplayChar;
    return this;
  }

   /**
   * Get seatDisplayChar
   * @return seatDisplayChar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSeatDisplayChar() {
    return seatDisplayChar;
  }


  public void setSeatDisplayChar(String seatDisplayChar) {
    this.seatDisplayChar = seatDisplayChar;
  }


  public SeatingProfileDetail profile(SeatingProfile profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeatingProfile getProfile() {
    return profile;
  }


  public void setProfile(SeatingProfile profile) {
    this.profile = profile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatingProfileDetail seatingProfileDetail = (SeatingProfileDetail) o;
    return Objects.equals(this.seatTypeCode, seatingProfileDetail.seatTypeCode) &&
        Objects.equals(this.dollarsOff, seatingProfileDetail.dollarsOff) &&
        Objects.equals(this.dayOfShow, seatingProfileDetail.dayOfShow) &&
        Objects.equals(this.warningText, seatingProfileDetail.warningText) &&
        Objects.equals(this.countBucketCode, seatingProfileDetail.countBucketCode) &&
        Objects.equals(this.seatProfileCode, seatingProfileDetail.seatProfileCode) &&
        Objects.equals(this.seatDisplayChar, seatingProfileDetail.seatDisplayChar) &&
        Objects.equals(this.profile, seatingProfileDetail.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatTypeCode, dollarsOff, dayOfShow, warningText, countBucketCode, seatProfileCode, seatDisplayChar, profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatingProfileDetail {\n");
    sb.append("    seatTypeCode: ").append(toIndentedString(seatTypeCode)).append("\n");
    sb.append("    dollarsOff: ").append(toIndentedString(dollarsOff)).append("\n");
    sb.append("    dayOfShow: ").append(toIndentedString(dayOfShow)).append("\n");
    sb.append("    warningText: ").append(toIndentedString(warningText)).append("\n");
    sb.append("    countBucketCode: ").append(toIndentedString(countBucketCode)).append("\n");
    sb.append("    seatProfileCode: ").append(toIndentedString(seatProfileCode)).append("\n");
    sb.append("    seatDisplayChar: ").append(toIndentedString(seatDisplayChar)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
    openapiFields.add("seatTypeCode");
    openapiFields.add("dollarsOff");
    openapiFields.add("dayOfShow");
    openapiFields.add("warningText");
    openapiFields.add("countBucketCode");
    openapiFields.add("seatProfileCode");
    openapiFields.add("seatDisplayChar");
    openapiFields.add("profile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("seatTypeCode");
    openapiRequiredFields.add("dollarsOff");
    openapiRequiredFields.add("dayOfShow");
    openapiRequiredFields.add("countBucketCode");
    openapiRequiredFields.add("seatProfileCode");
    openapiRequiredFields.add("seatDisplayChar");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SeatingProfileDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SeatingProfileDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SeatingProfileDetail is not found in the empty JSON string", SeatingProfileDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SeatingProfileDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SeatingProfileDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SeatingProfileDetail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("dayOfShow") != null && !jsonObj.get("dayOfShow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dayOfShow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dayOfShow").toString()));
      }
      if (jsonObj.get("warningText") != null && !jsonObj.get("warningText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warningText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warningText").toString()));
      }
      if (jsonObj.get("countBucketCode") != null && !jsonObj.get("countBucketCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countBucketCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countBucketCode").toString()));
      }
      if (jsonObj.get("seatProfileCode") != null && !jsonObj.get("seatProfileCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatProfileCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatProfileCode").toString()));
      }
      if (jsonObj.get("seatDisplayChar") != null && !jsonObj.get("seatDisplayChar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatDisplayChar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatDisplayChar").toString()));
      }
      // validate the optional field `profile`
      if (jsonObj.getAsJsonObject("profile") != null) {
        SeatingProfile.validateJsonObject(jsonObj.getAsJsonObject("profile"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SeatingProfileDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SeatingProfileDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SeatingProfileDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SeatingProfileDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<SeatingProfileDetail>() {
           @Override
           public void write(JsonWriter out, SeatingProfileDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SeatingProfileDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SeatingProfileDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SeatingProfileDetail
  * @throws IOException if the JSON string is invalid with respect to SeatingProfileDetail
  */
  public static SeatingProfileDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SeatingProfileDetail.class);
  }

 /**
  * Convert an instance of SeatingProfileDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


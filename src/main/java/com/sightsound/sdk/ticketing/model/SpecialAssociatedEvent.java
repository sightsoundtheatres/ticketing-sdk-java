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
import com.sightsound.sdk.ticketing.model.Special;
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
 * SpecialAssociatedEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T17:37:03.061697Z[Etc/UTC]")
public class SpecialAssociatedEvent {
  public static final String SERIALIZED_NAME_SPECIAL_CODE = "specialCode";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CODE)
  private String specialCode;

  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_SPECIAL_RANGE_START_DATE = "specialRangeStartDate";
  @SerializedName(SERIALIZED_NAME_SPECIAL_RANGE_START_DATE)
  private OffsetDateTime specialRangeStartDate;

  public static final String SERIALIZED_NAME_SPECIAL_RANGE_END_DATE = "specialRangeEndDate";
  @SerializedName(SERIALIZED_NAME_SPECIAL_RANGE_END_DATE)
  private OffsetDateTime specialRangeEndDate;

  public static final String SERIALIZED_NAME_COMBO_EVENT_NUMBER = "comboEventNumber";
  @SerializedName(SERIALIZED_NAME_COMBO_EVENT_NUMBER)
  private Integer comboEventNumber;

  public static final String SERIALIZED_NAME_SPECIAL = "special";
  @SerializedName(SERIALIZED_NAME_SPECIAL)
  private Special special;

  public SpecialAssociatedEvent() { 
  }

  public SpecialAssociatedEvent specialCode(String specialCode) {
    
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


  public SpecialAssociatedEvent eventCode(String eventCode) {
    
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


  public SpecialAssociatedEvent specialRangeStartDate(OffsetDateTime specialRangeStartDate) {
    
    this.specialRangeStartDate = specialRangeStartDate;
    return this;
  }

   /**
   * Get specialRangeStartDate
   * @return specialRangeStartDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getSpecialRangeStartDate() {
    return specialRangeStartDate;
  }


  public void setSpecialRangeStartDate(OffsetDateTime specialRangeStartDate) {
    this.specialRangeStartDate = specialRangeStartDate;
  }


  public SpecialAssociatedEvent specialRangeEndDate(OffsetDateTime specialRangeEndDate) {
    
    this.specialRangeEndDate = specialRangeEndDate;
    return this;
  }

   /**
   * Get specialRangeEndDate
   * @return specialRangeEndDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getSpecialRangeEndDate() {
    return specialRangeEndDate;
  }


  public void setSpecialRangeEndDate(OffsetDateTime specialRangeEndDate) {
    this.specialRangeEndDate = specialRangeEndDate;
  }


  public SpecialAssociatedEvent comboEventNumber(Integer comboEventNumber) {
    
    this.comboEventNumber = comboEventNumber;
    return this;
  }

   /**
   * Get comboEventNumber
   * @return comboEventNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getComboEventNumber() {
    return comboEventNumber;
  }


  public void setComboEventNumber(Integer comboEventNumber) {
    this.comboEventNumber = comboEventNumber;
  }


  public SpecialAssociatedEvent special(Special special) {
    
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
    SpecialAssociatedEvent specialAssociatedEvent = (SpecialAssociatedEvent) o;
    return Objects.equals(this.specialCode, specialAssociatedEvent.specialCode) &&
        Objects.equals(this.eventCode, specialAssociatedEvent.eventCode) &&
        Objects.equals(this.specialRangeStartDate, specialAssociatedEvent.specialRangeStartDate) &&
        Objects.equals(this.specialRangeEndDate, specialAssociatedEvent.specialRangeEndDate) &&
        Objects.equals(this.comboEventNumber, specialAssociatedEvent.comboEventNumber) &&
        Objects.equals(this.special, specialAssociatedEvent.special);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialCode, eventCode, specialRangeStartDate, specialRangeEndDate, comboEventNumber, special);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialAssociatedEvent {\n");
    sb.append("    specialCode: ").append(toIndentedString(specialCode)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    specialRangeStartDate: ").append(toIndentedString(specialRangeStartDate)).append("\n");
    sb.append("    specialRangeEndDate: ").append(toIndentedString(specialRangeEndDate)).append("\n");
    sb.append("    comboEventNumber: ").append(toIndentedString(comboEventNumber)).append("\n");
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
    openapiFields.add("specialRangeStartDate");
    openapiFields.add("specialRangeEndDate");
    openapiFields.add("comboEventNumber");
    openapiFields.add("special");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("specialCode");
    openapiRequiredFields.add("eventCode");
    openapiRequiredFields.add("specialRangeStartDate");
    openapiRequiredFields.add("specialRangeEndDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpecialAssociatedEvent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SpecialAssociatedEvent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpecialAssociatedEvent is not found in the empty JSON string", SpecialAssociatedEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SpecialAssociatedEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpecialAssociatedEvent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SpecialAssociatedEvent.openapiRequiredFields) {
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
       if (!SpecialAssociatedEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpecialAssociatedEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpecialAssociatedEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpecialAssociatedEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<SpecialAssociatedEvent>() {
           @Override
           public void write(JsonWriter out, SpecialAssociatedEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpecialAssociatedEvent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpecialAssociatedEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpecialAssociatedEvent
  * @throws IOException if the JSON string is invalid with respect to SpecialAssociatedEvent
  */
  public static SpecialAssociatedEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpecialAssociatedEvent.class);
  }

 /**
  * Convert an instance of SpecialAssociatedEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


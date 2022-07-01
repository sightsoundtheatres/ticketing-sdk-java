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
 * SpecialSituationDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T08:40:20.483181-05:00[America/Chicago]")
public class SpecialSituationDefinition {
  public static final String SERIALIZED_NAME_SPECIAL_SITUATION_CODE = "specialSituationCode";
  @SerializedName(SERIALIZED_NAME_SPECIAL_SITUATION_CODE)
  private String specialSituationCode;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private Boolean display;

  public static final String SERIALIZED_NAME_EMAIL_DESTINATION = "emailDestination";
  @SerializedName(SERIALIZED_NAME_EMAIL_DESTINATION)
  private String emailDestination;

  public static final String SERIALIZED_NAME_ITEM_TYPE_CODE = "itemTypeCode";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE_CODE)
  private ItemType itemTypeCode;

  public static final String SERIALIZED_NAME_SEND_EMAIL = "sendEmail";
  @SerializedName(SERIALIZED_NAME_SEND_EMAIL)
  private Boolean sendEmail;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_SPECIAL_SITUATION_DESC = "specialSituationDesc";
  @SerializedName(SERIALIZED_NAME_SPECIAL_SITUATION_DESC)
  private String specialSituationDesc;

  public SpecialSituationDefinition() { 
  }

  public SpecialSituationDefinition specialSituationCode(String specialSituationCode) {
    
    this.specialSituationCode = specialSituationCode;
    return this;
  }

   /**
   * Get specialSituationCode
   * @return specialSituationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSpecialSituationCode() {
    return specialSituationCode;
  }


  public void setSpecialSituationCode(String specialSituationCode) {
    this.specialSituationCode = specialSituationCode;
  }


  public SpecialSituationDefinition display(Boolean display) {
    
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisplay() {
    return display;
  }


  public void setDisplay(Boolean display) {
    this.display = display;
  }


  public SpecialSituationDefinition emailDestination(String emailDestination) {
    
    this.emailDestination = emailDestination;
    return this;
  }

   /**
   * Get emailDestination
   * @return emailDestination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailDestination() {
    return emailDestination;
  }


  public void setEmailDestination(String emailDestination) {
    this.emailDestination = emailDestination;
  }


  public SpecialSituationDefinition itemTypeCode(ItemType itemTypeCode) {
    
    this.itemTypeCode = itemTypeCode;
    return this;
  }

   /**
   * Get itemTypeCode
   * @return itemTypeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemType getItemTypeCode() {
    return itemTypeCode;
  }


  public void setItemTypeCode(ItemType itemTypeCode) {
    this.itemTypeCode = itemTypeCode;
  }


  public SpecialSituationDefinition sendEmail(Boolean sendEmail) {
    
    this.sendEmail = sendEmail;
    return this;
  }

   /**
   * Get sendEmail
   * @return sendEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSendEmail() {
    return sendEmail;
  }


  public void setSendEmail(Boolean sendEmail) {
    this.sendEmail = sendEmail;
  }


  public SpecialSituationDefinition sortOrder(Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  public SpecialSituationDefinition specialSituationDesc(String specialSituationDesc) {
    
    this.specialSituationDesc = specialSituationDesc;
    return this;
  }

   /**
   * Get specialSituationDesc
   * @return specialSituationDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpecialSituationDesc() {
    return specialSituationDesc;
  }


  public void setSpecialSituationDesc(String specialSituationDesc) {
    this.specialSituationDesc = specialSituationDesc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialSituationDefinition specialSituationDefinition = (SpecialSituationDefinition) o;
    return Objects.equals(this.specialSituationCode, specialSituationDefinition.specialSituationCode) &&
        Objects.equals(this.display, specialSituationDefinition.display) &&
        Objects.equals(this.emailDestination, specialSituationDefinition.emailDestination) &&
        Objects.equals(this.itemTypeCode, specialSituationDefinition.itemTypeCode) &&
        Objects.equals(this.sendEmail, specialSituationDefinition.sendEmail) &&
        Objects.equals(this.sortOrder, specialSituationDefinition.sortOrder) &&
        Objects.equals(this.specialSituationDesc, specialSituationDefinition.specialSituationDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialSituationCode, display, emailDestination, itemTypeCode, sendEmail, sortOrder, specialSituationDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialSituationDefinition {\n");
    sb.append("    specialSituationCode: ").append(toIndentedString(specialSituationCode)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    emailDestination: ").append(toIndentedString(emailDestination)).append("\n");
    sb.append("    itemTypeCode: ").append(toIndentedString(itemTypeCode)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    specialSituationDesc: ").append(toIndentedString(specialSituationDesc)).append("\n");
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
    openapiFields.add("specialSituationCode");
    openapiFields.add("display");
    openapiFields.add("emailDestination");
    openapiFields.add("itemTypeCode");
    openapiFields.add("sendEmail");
    openapiFields.add("sortOrder");
    openapiFields.add("specialSituationDesc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("specialSituationCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpecialSituationDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SpecialSituationDefinition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpecialSituationDefinition is not found in the empty JSON string", SpecialSituationDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SpecialSituationDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpecialSituationDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SpecialSituationDefinition.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("specialSituationCode") != null && !jsonObj.get("specialSituationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialSituationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialSituationCode").toString()));
      }
      if (jsonObj.get("emailDestination") != null && !jsonObj.get("emailDestination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailDestination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailDestination").toString()));
      }
      if (jsonObj.get("specialSituationDesc") != null && !jsonObj.get("specialSituationDesc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialSituationDesc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialSituationDesc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpecialSituationDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpecialSituationDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpecialSituationDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpecialSituationDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<SpecialSituationDefinition>() {
           @Override
           public void write(JsonWriter out, SpecialSituationDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpecialSituationDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpecialSituationDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpecialSituationDefinition
  * @throws IOException if the JSON string is invalid with respect to SpecialSituationDefinition
  */
  public static SpecialSituationDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpecialSituationDefinition.class);
  }

 /**
  * Convert an instance of SpecialSituationDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


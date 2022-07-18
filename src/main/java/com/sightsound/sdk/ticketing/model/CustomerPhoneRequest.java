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
import com.sightsound.sdk.ticketing.model.PhoneType;
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
 * CustomerPhoneRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T19:32:42.242731Z[Etc/UTC]")
public class CustomerPhoneRequest {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PHONE_TYPE = "phoneType";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE)
  private PhoneType phoneType;

  public static final String SERIALIZED_NAME_PHONE_NOTE = "phoneNote";
  @SerializedName(SERIALIZED_NAME_PHONE_NOTE)
  private String phoneNote;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "sequenceNumber";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private Long sequenceNumber;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public CustomerPhoneRequest() { 
  }

  public CustomerPhoneRequest phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public CustomerPhoneRequest phoneType(PhoneType phoneType) {
    
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PhoneType getPhoneType() {
    return phoneType;
  }


  public void setPhoneType(PhoneType phoneType) {
    this.phoneType = phoneType;
  }


  public CustomerPhoneRequest phoneNote(String phoneNote) {
    
    this.phoneNote = phoneNote;
    return this;
  }

   /**
   * Get phoneNote
   * @return phoneNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNote() {
    return phoneNote;
  }


  public void setPhoneNote(String phoneNote) {
    this.phoneNote = phoneNote;
  }


  public CustomerPhoneRequest sequenceNumber(Long sequenceNumber) {
    
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Get sequenceNumber
   * @return sequenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSequenceNumber() {
    return sequenceNumber;
  }


  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public CustomerPhoneRequest deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPhoneRequest customerPhoneRequest = (CustomerPhoneRequest) o;
    return Objects.equals(this.phoneNumber, customerPhoneRequest.phoneNumber) &&
        Objects.equals(this.phoneType, customerPhoneRequest.phoneType) &&
        Objects.equals(this.phoneNote, customerPhoneRequest.phoneNote) &&
        Objects.equals(this.sequenceNumber, customerPhoneRequest.sequenceNumber) &&
        Objects.equals(this.deleted, customerPhoneRequest.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, phoneType, phoneNote, sequenceNumber, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPhoneRequest {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    phoneNote: ").append(toIndentedString(phoneNote)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
    openapiFields.add("phoneNumber");
    openapiFields.add("phoneType");
    openapiFields.add("phoneNote");
    openapiFields.add("sequenceNumber");
    openapiFields.add("deleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("phoneNumber");
    openapiRequiredFields.add("phoneType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerPhoneRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomerPhoneRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerPhoneRequest is not found in the empty JSON string", CustomerPhoneRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerPhoneRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerPhoneRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerPhoneRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if (jsonObj.get("phoneNote") != null && !jsonObj.get("phoneNote").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNote` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNote").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerPhoneRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerPhoneRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerPhoneRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerPhoneRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerPhoneRequest>() {
           @Override
           public void write(JsonWriter out, CustomerPhoneRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerPhoneRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerPhoneRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerPhoneRequest
  * @throws IOException if the JSON string is invalid with respect to CustomerPhoneRequest
  */
  public static CustomerPhoneRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerPhoneRequest.class);
  }

 /**
  * Convert an instance of CustomerPhoneRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


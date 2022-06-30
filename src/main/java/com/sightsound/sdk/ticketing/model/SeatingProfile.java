/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
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
import com.sightsound.sdk.ticketing.model.SeatingProfileDetail;
import com.sightsound.sdk.ticketing.model.SeatingTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * SeatingProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T16:05:59.817736-05:00[America/Chicago]")
public class SeatingProfile {
  public static final String SERIALIZED_NAME_SEAT_PROFILE_CODE = "seatProfileCode";
  @SerializedName(SERIALIZED_NAME_SEAT_PROFILE_CODE)
  private String seatProfileCode;

  public static final String SERIALIZED_NAME_SEAT_PROFILE_DESCRIPTION = "seatProfileDescription";
  @SerializedName(SERIALIZED_NAME_SEAT_PROFILE_DESCRIPTION)
  private String seatProfileDescription;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<SeatingProfileDetail> details = null;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<SeatingTemplate> templates = null;

  public SeatingProfile() { 
  }

  public SeatingProfile seatProfileCode(String seatProfileCode) {
    
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


  public SeatingProfile seatProfileDescription(String seatProfileDescription) {
    
    this.seatProfileDescription = seatProfileDescription;
    return this;
  }

   /**
   * Get seatProfileDescription
   * @return seatProfileDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeatProfileDescription() {
    return seatProfileDescription;
  }


  public void setSeatProfileDescription(String seatProfileDescription) {
    this.seatProfileDescription = seatProfileDescription;
  }


  public SeatingProfile details(List<SeatingProfileDetail> details) {
    
    this.details = details;
    return this;
  }

  public SeatingProfile addDetailsItem(SeatingProfileDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SeatingProfileDetail> getDetails() {
    return details;
  }


  public void setDetails(List<SeatingProfileDetail> details) {
    this.details = details;
  }


  public SeatingProfile templates(List<SeatingTemplate> templates) {
    
    this.templates = templates;
    return this;
  }

  public SeatingProfile addTemplatesItem(SeatingTemplate templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SeatingTemplate> getTemplates() {
    return templates;
  }


  public void setTemplates(List<SeatingTemplate> templates) {
    this.templates = templates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatingProfile seatingProfile = (SeatingProfile) o;
    return Objects.equals(this.seatProfileCode, seatingProfile.seatProfileCode) &&
        Objects.equals(this.seatProfileDescription, seatingProfile.seatProfileDescription) &&
        Objects.equals(this.details, seatingProfile.details) &&
        Objects.equals(this.templates, seatingProfile.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatProfileCode, seatProfileDescription, details, templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatingProfile {\n");
    sb.append("    seatProfileCode: ").append(toIndentedString(seatProfileCode)).append("\n");
    sb.append("    seatProfileDescription: ").append(toIndentedString(seatProfileDescription)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
    openapiFields.add("seatProfileCode");
    openapiFields.add("seatProfileDescription");
    openapiFields.add("details");
    openapiFields.add("templates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("seatProfileCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SeatingProfile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SeatingProfile.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SeatingProfile is not found in the empty JSON string", SeatingProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SeatingProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SeatingProfile` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SeatingProfile.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("seatProfileCode") != null && !jsonObj.get("seatProfileCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatProfileCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatProfileCode").toString()));
      }
      if (jsonObj.get("seatProfileDescription") != null && !jsonObj.get("seatProfileDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatProfileDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatProfileDescription").toString()));
      }
      JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
      if (jsonArraydetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("details").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
        }

        // validate the optional field `details` (array)
        for (int i = 0; i < jsonArraydetails.size(); i++) {
          SeatingProfileDetail.validateJsonObject(jsonArraydetails.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraytemplates = jsonObj.getAsJsonArray("templates");
      if (jsonArraytemplates != null) {
        // ensure the json data is an array
        if (!jsonObj.get("templates").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `templates` to be an array in the JSON string but got `%s`", jsonObj.get("templates").toString()));
        }

        // validate the optional field `templates` (array)
        for (int i = 0; i < jsonArraytemplates.size(); i++) {
          SeatingTemplate.validateJsonObject(jsonArraytemplates.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SeatingProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SeatingProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SeatingProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SeatingProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<SeatingProfile>() {
           @Override
           public void write(JsonWriter out, SeatingProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SeatingProfile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SeatingProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SeatingProfile
  * @throws IOException if the JSON string is invalid with respect to SeatingProfile
  */
  public static SeatingProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SeatingProfile.class);
  }

 /**
  * Convert an instance of SeatingProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


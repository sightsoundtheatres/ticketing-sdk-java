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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * ShopperInteractionDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T15:31:17.450182-05:00[America/Chicago]")
public class ShopperInteractionDevice {
  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_OS_VERSION = "osVersion";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public ShopperInteractionDevice() { 
  }

  public ShopperInteractionDevice os(String os) {
    
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOs() {
    return os;
  }


  public void setOs(String os) {
    this.os = os;
  }


  public ShopperInteractionDevice osVersion(String osVersion) {
    
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersion() {
    return osVersion;
  }


  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public ShopperInteractionDevice locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopperInteractionDevice shopperInteractionDevice = (ShopperInteractionDevice) o;
    return Objects.equals(this.os, shopperInteractionDevice.os) &&
        Objects.equals(this.osVersion, shopperInteractionDevice.osVersion) &&
        Objects.equals(this.locale, shopperInteractionDevice.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(os, osVersion, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopperInteractionDevice {\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
    openapiFields.add("os");
    openapiFields.add("osVersion");
    openapiFields.add("locale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopperInteractionDevice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShopperInteractionDevice.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopperInteractionDevice is not found in the empty JSON string", ShopperInteractionDevice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopperInteractionDevice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopperInteractionDevice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("os") != null && !jsonObj.get("os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os").toString()));
      }
      if (jsonObj.get("osVersion") != null && !jsonObj.get("osVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `osVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("osVersion").toString()));
      }
      if (jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopperInteractionDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopperInteractionDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopperInteractionDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopperInteractionDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopperInteractionDevice>() {
           @Override
           public void write(JsonWriter out, ShopperInteractionDevice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopperInteractionDevice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopperInteractionDevice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopperInteractionDevice
  * @throws IOException if the JSON string is invalid with respect to ShopperInteractionDevice
  */
  public static ShopperInteractionDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopperInteractionDevice.class);
  }

 /**
  * Convert an instance of ShopperInteractionDevice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


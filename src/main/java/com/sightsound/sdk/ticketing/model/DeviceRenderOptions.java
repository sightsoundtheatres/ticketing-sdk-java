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
import com.sightsound.sdk.ticketing.model.SdkInterfaceEnum;
import com.sightsound.sdk.ticketing.model.SdkUiTypeEnum;
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
 * DeviceRenderOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T16:06:07.372728-05:00[America/Chicago]")
public class DeviceRenderOptions {
  public static final String SERIALIZED_NAME_SDK_INTERFACE = "sdkInterface";
  @SerializedName(SERIALIZED_NAME_SDK_INTERFACE)
  private SdkInterfaceEnum sdkInterface;

  public static final String SERIALIZED_NAME_SDK_UI_TYPE = "sdkUiType";
  @SerializedName(SERIALIZED_NAME_SDK_UI_TYPE)
  private List<SdkUiTypeEnum> sdkUiType = null;

  public DeviceRenderOptions() { 
  }

  public DeviceRenderOptions sdkInterface(SdkInterfaceEnum sdkInterface) {
    
    this.sdkInterface = sdkInterface;
    return this;
  }

   /**
   * Get sdkInterface
   * @return sdkInterface
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SdkInterfaceEnum getSdkInterface() {
    return sdkInterface;
  }


  public void setSdkInterface(SdkInterfaceEnum sdkInterface) {
    this.sdkInterface = sdkInterface;
  }


  public DeviceRenderOptions sdkUiType(List<SdkUiTypeEnum> sdkUiType) {
    
    this.sdkUiType = sdkUiType;
    return this;
  }

  public DeviceRenderOptions addSdkUiTypeItem(SdkUiTypeEnum sdkUiTypeItem) {
    if (this.sdkUiType == null) {
      this.sdkUiType = new ArrayList<>();
    }
    this.sdkUiType.add(sdkUiTypeItem);
    return this;
  }

   /**
   * Get sdkUiType
   * @return sdkUiType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SdkUiTypeEnum> getSdkUiType() {
    return sdkUiType;
  }


  public void setSdkUiType(List<SdkUiTypeEnum> sdkUiType) {
    this.sdkUiType = sdkUiType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRenderOptions deviceRenderOptions = (DeviceRenderOptions) o;
    return Objects.equals(this.sdkInterface, deviceRenderOptions.sdkInterface) &&
        Objects.equals(this.sdkUiType, deviceRenderOptions.sdkUiType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdkInterface, sdkUiType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRenderOptions {\n");
    sb.append("    sdkInterface: ").append(toIndentedString(sdkInterface)).append("\n");
    sb.append("    sdkUiType: ").append(toIndentedString(sdkUiType)).append("\n");
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
    openapiFields.add("sdkInterface");
    openapiFields.add("sdkUiType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeviceRenderOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeviceRenderOptions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceRenderOptions is not found in the empty JSON string", DeviceRenderOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeviceRenderOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeviceRenderOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("sdkUiType") != null && !jsonObj.get("sdkUiType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdkUiType` to be an array in the JSON string but got `%s`", jsonObj.get("sdkUiType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeviceRenderOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeviceRenderOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeviceRenderOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeviceRenderOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<DeviceRenderOptions>() {
           @Override
           public void write(JsonWriter out, DeviceRenderOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeviceRenderOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeviceRenderOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeviceRenderOptions
  * @throws IOException if the JSON string is invalid with respect to DeviceRenderOptions
  */
  public static DeviceRenderOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeviceRenderOptions.class);
  }

 /**
  * Convert an instance of DeviceRenderOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

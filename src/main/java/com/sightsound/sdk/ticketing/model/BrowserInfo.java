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
 * BrowserInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T19:37:37.998841Z[Etc/UTC]")
public class BrowserInfo {
  public static final String SERIALIZED_NAME_USER_AGENT = "userAgent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_COLOR_DEPTH = "colorDepth";
  @SerializedName(SERIALIZED_NAME_COLOR_DEPTH)
  private Integer colorDepth;

  public static final String SERIALIZED_NAME_JAVA_ENABLED = "javaEnabled";
  @SerializedName(SERIALIZED_NAME_JAVA_ENABLED)
  private Boolean javaEnabled;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_SCREEN_HEIGHT = "screenHeight";
  @SerializedName(SERIALIZED_NAME_SCREEN_HEIGHT)
  private Integer screenHeight;

  public static final String SERIALIZED_NAME_SCREEN_WIDTH = "screenWidth";
  @SerializedName(SERIALIZED_NAME_SCREEN_WIDTH)
  private Integer screenWidth;

  public static final String SERIALIZED_NAME_TIME_ZONE_OFFSET = "timeZoneOffset";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_OFFSET)
  private Integer timeZoneOffset;

  public static final String SERIALIZED_NAME_ACCEPT_HEADER = "acceptHeader";
  @SerializedName(SERIALIZED_NAME_ACCEPT_HEADER)
  private String acceptHeader;

  public static final String SERIALIZED_NAME_JAVA_SCRIPT_ENABLED = "javaScriptEnabled";
  @SerializedName(SERIALIZED_NAME_JAVA_SCRIPT_ENABLED)
  private Boolean javaScriptEnabled;

  public BrowserInfo() { 
  }

  public BrowserInfo userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public BrowserInfo colorDepth(Integer colorDepth) {
    
    this.colorDepth = colorDepth;
    return this;
  }

   /**
   * Get colorDepth
   * @return colorDepth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getColorDepth() {
    return colorDepth;
  }


  public void setColorDepth(Integer colorDepth) {
    this.colorDepth = colorDepth;
  }


  public BrowserInfo javaEnabled(Boolean javaEnabled) {
    
    this.javaEnabled = javaEnabled;
    return this;
  }

   /**
   * Get javaEnabled
   * @return javaEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getJavaEnabled() {
    return javaEnabled;
  }


  public void setJavaEnabled(Boolean javaEnabled) {
    this.javaEnabled = javaEnabled;
  }


  public BrowserInfo language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public BrowserInfo screenHeight(Integer screenHeight) {
    
    this.screenHeight = screenHeight;
    return this;
  }

   /**
   * Get screenHeight
   * @return screenHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScreenHeight() {
    return screenHeight;
  }


  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }


  public BrowserInfo screenWidth(Integer screenWidth) {
    
    this.screenWidth = screenWidth;
    return this;
  }

   /**
   * Get screenWidth
   * @return screenWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScreenWidth() {
    return screenWidth;
  }


  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }


  public BrowserInfo timeZoneOffset(Integer timeZoneOffset) {
    
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

   /**
   * Get timeZoneOffset
   * @return timeZoneOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeZoneOffset() {
    return timeZoneOffset;
  }


  public void setTimeZoneOffset(Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }


  public BrowserInfo acceptHeader(String acceptHeader) {
    
    this.acceptHeader = acceptHeader;
    return this;
  }

   /**
   * Get acceptHeader
   * @return acceptHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAcceptHeader() {
    return acceptHeader;
  }


  public void setAcceptHeader(String acceptHeader) {
    this.acceptHeader = acceptHeader;
  }


  public BrowserInfo javaScriptEnabled(Boolean javaScriptEnabled) {
    
    this.javaScriptEnabled = javaScriptEnabled;
    return this;
  }

   /**
   * Get javaScriptEnabled
   * @return javaScriptEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getJavaScriptEnabled() {
    return javaScriptEnabled;
  }


  public void setJavaScriptEnabled(Boolean javaScriptEnabled) {
    this.javaScriptEnabled = javaScriptEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserInfo browserInfo = (BrowserInfo) o;
    return Objects.equals(this.userAgent, browserInfo.userAgent) &&
        Objects.equals(this.colorDepth, browserInfo.colorDepth) &&
        Objects.equals(this.javaEnabled, browserInfo.javaEnabled) &&
        Objects.equals(this.language, browserInfo.language) &&
        Objects.equals(this.screenHeight, browserInfo.screenHeight) &&
        Objects.equals(this.screenWidth, browserInfo.screenWidth) &&
        Objects.equals(this.timeZoneOffset, browserInfo.timeZoneOffset) &&
        Objects.equals(this.acceptHeader, browserInfo.acceptHeader) &&
        Objects.equals(this.javaScriptEnabled, browserInfo.javaScriptEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAgent, colorDepth, javaEnabled, language, screenHeight, screenWidth, timeZoneOffset, acceptHeader, javaScriptEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowserInfo {\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    colorDepth: ").append(toIndentedString(colorDepth)).append("\n");
    sb.append("    javaEnabled: ").append(toIndentedString(javaEnabled)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
    sb.append("    acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
    sb.append("    javaScriptEnabled: ").append(toIndentedString(javaScriptEnabled)).append("\n");
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
    openapiFields.add("userAgent");
    openapiFields.add("colorDepth");
    openapiFields.add("javaEnabled");
    openapiFields.add("language");
    openapiFields.add("screenHeight");
    openapiFields.add("screenWidth");
    openapiFields.add("timeZoneOffset");
    openapiFields.add("acceptHeader");
    openapiFields.add("javaScriptEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BrowserInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BrowserInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrowserInfo is not found in the empty JSON string", BrowserInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BrowserInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrowserInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("userAgent") != null && !jsonObj.get("userAgent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userAgent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userAgent").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("acceptHeader") != null && !jsonObj.get("acceptHeader").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceptHeader` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceptHeader").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrowserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrowserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrowserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrowserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrowserInfo>() {
           @Override
           public void write(JsonWriter out, BrowserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrowserInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrowserInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrowserInfo
  * @throws IOException if the JSON string is invalid with respect to BrowserInfo
  */
  public static BrowserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrowserInfo.class);
  }

 /**
  * Convert an instance of BrowserInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


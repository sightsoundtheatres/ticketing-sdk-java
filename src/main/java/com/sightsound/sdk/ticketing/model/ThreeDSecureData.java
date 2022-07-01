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
import com.sightsound.sdk.ticketing.model.AuthenticationResponseEnum;
import com.sightsound.sdk.ticketing.model.DirectoryResponseEnum;
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
 * ThreeDSecureData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T08:27:57.763723-05:00[America/Chicago]")
public class ThreeDSecureData {
  public static final String SERIALIZED_NAME_AUTHENTICATION_RESPONSE = "authenticationResponse";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_RESPONSE)
  private AuthenticationResponseEnum authenticationResponse;

  public static final String SERIALIZED_NAME_CAVV = "cavv";
  @SerializedName(SERIALIZED_NAME_CAVV)
  private String cavv;

  public static final String SERIALIZED_NAME_CAVV_ALGORITHM = "cavvAlgorithm";
  @SerializedName(SERIALIZED_NAME_CAVV_ALGORITHM)
  private String cavvAlgorithm;

  public static final String SERIALIZED_NAME_DIRECTORY_RESPONSE = "directoryResponse";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_RESPONSE)
  private DirectoryResponseEnum directoryResponse;

  public static final String SERIALIZED_NAME_ECI = "eci";
  @SerializedName(SERIALIZED_NAME_ECI)
  private String eci;

  public static final String SERIALIZED_NAME_THREE_D_S_VERSION = "threeDSVersion";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_VERSION)
  private String threeDSVersion;

  public static final String SERIALIZED_NAME_XID = "xid";
  @SerializedName(SERIALIZED_NAME_XID)
  private String xid;

  public static final String SERIALIZED_NAME_DS_TRANS_I_D = "dsTransID";
  @SerializedName(SERIALIZED_NAME_DS_TRANS_I_D)
  private String dsTransID;

  public ThreeDSecureData() { 
  }

  public ThreeDSecureData authenticationResponse(AuthenticationResponseEnum authenticationResponse) {
    
    this.authenticationResponse = authenticationResponse;
    return this;
  }

   /**
   * Get authenticationResponse
   * @return authenticationResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthenticationResponseEnum getAuthenticationResponse() {
    return authenticationResponse;
  }


  public void setAuthenticationResponse(AuthenticationResponseEnum authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }


  public ThreeDSecureData cavv(String cavv) {
    
    this.cavv = cavv;
    return this;
  }

   /**
   * Get cavv
   * @return cavv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCavv() {
    return cavv;
  }


  public void setCavv(String cavv) {
    this.cavv = cavv;
  }


  public ThreeDSecureData cavvAlgorithm(String cavvAlgorithm) {
    
    this.cavvAlgorithm = cavvAlgorithm;
    return this;
  }

   /**
   * Get cavvAlgorithm
   * @return cavvAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCavvAlgorithm() {
    return cavvAlgorithm;
  }


  public void setCavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
  }


  public ThreeDSecureData directoryResponse(DirectoryResponseEnum directoryResponse) {
    
    this.directoryResponse = directoryResponse;
    return this;
  }

   /**
   * Get directoryResponse
   * @return directoryResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DirectoryResponseEnum getDirectoryResponse() {
    return directoryResponse;
  }


  public void setDirectoryResponse(DirectoryResponseEnum directoryResponse) {
    this.directoryResponse = directoryResponse;
  }


  public ThreeDSecureData eci(String eci) {
    
    this.eci = eci;
    return this;
  }

   /**
   * Get eci
   * @return eci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEci() {
    return eci;
  }


  public void setEci(String eci) {
    this.eci = eci;
  }


  public ThreeDSecureData threeDSVersion(String threeDSVersion) {
    
    this.threeDSVersion = threeDSVersion;
    return this;
  }

   /**
   * Get threeDSVersion
   * @return threeDSVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThreeDSVersion() {
    return threeDSVersion;
  }


  public void setThreeDSVersion(String threeDSVersion) {
    this.threeDSVersion = threeDSVersion;
  }


  public ThreeDSecureData xid(String xid) {
    
    this.xid = xid;
    return this;
  }

   /**
   * Get xid
   * @return xid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getXid() {
    return xid;
  }


  public void setXid(String xid) {
    this.xid = xid;
  }


  public ThreeDSecureData dsTransID(String dsTransID) {
    
    this.dsTransID = dsTransID;
    return this;
  }

   /**
   * Get dsTransID
   * @return dsTransID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDsTransID() {
    return dsTransID;
  }


  public void setDsTransID(String dsTransID) {
    this.dsTransID = dsTransID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecureData threeDSecureData = (ThreeDSecureData) o;
    return Objects.equals(this.authenticationResponse, threeDSecureData.authenticationResponse) &&
        Objects.equals(this.cavv, threeDSecureData.cavv) &&
        Objects.equals(this.cavvAlgorithm, threeDSecureData.cavvAlgorithm) &&
        Objects.equals(this.directoryResponse, threeDSecureData.directoryResponse) &&
        Objects.equals(this.eci, threeDSecureData.eci) &&
        Objects.equals(this.threeDSVersion, threeDSecureData.threeDSVersion) &&
        Objects.equals(this.xid, threeDSecureData.xid) &&
        Objects.equals(this.dsTransID, threeDSecureData.dsTransID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationResponse, cavv, cavvAlgorithm, directoryResponse, eci, threeDSVersion, xid, dsTransID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureData {\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    cavvAlgorithm: ").append(toIndentedString(cavvAlgorithm)).append("\n");
    sb.append("    directoryResponse: ").append(toIndentedString(directoryResponse)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    threeDSVersion: ").append(toIndentedString(threeDSVersion)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
    sb.append("    dsTransID: ").append(toIndentedString(dsTransID)).append("\n");
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
    openapiFields.add("authenticationResponse");
    openapiFields.add("cavv");
    openapiFields.add("cavvAlgorithm");
    openapiFields.add("directoryResponse");
    openapiFields.add("eci");
    openapiFields.add("threeDSVersion");
    openapiFields.add("xid");
    openapiFields.add("dsTransID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDSecureData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ThreeDSecureData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDSecureData is not found in the empty JSON string", ThreeDSecureData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ThreeDSecureData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThreeDSecureData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cavv") != null && !jsonObj.get("cavv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cavv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cavv").toString()));
      }
      if (jsonObj.get("cavvAlgorithm") != null && !jsonObj.get("cavvAlgorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cavvAlgorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cavvAlgorithm").toString()));
      }
      if (jsonObj.get("eci") != null && !jsonObj.get("eci").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eci` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eci").toString()));
      }
      if (jsonObj.get("threeDSVersion") != null && !jsonObj.get("threeDSVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSVersion").toString()));
      }
      if (jsonObj.get("xid") != null && !jsonObj.get("xid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xid").toString()));
      }
      if (jsonObj.get("dsTransID") != null && !jsonObj.get("dsTransID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsTransID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsTransID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDSecureData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDSecureData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDSecureData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDSecureData.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDSecureData>() {
           @Override
           public void write(JsonWriter out, ThreeDSecureData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDSecureData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreeDSecureData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDSecureData
  * @throws IOException if the JSON string is invalid with respect to ThreeDSecureData
  */
  public static ThreeDSecureData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDSecureData.class);
  }

 /**
  * Convert an instance of ThreeDSecureData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


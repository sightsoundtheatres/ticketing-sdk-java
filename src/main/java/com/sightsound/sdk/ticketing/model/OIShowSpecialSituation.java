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
import com.sightsound.sdk.ticketing.model.OrderItem;
import com.sightsound.sdk.ticketing.model.SpecialSituationDefinition;
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
 * OIShowSpecialSituation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T20:01:03.115466Z[Etc/UTC]")
public class OIShowSpecialSituation {
  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "itemNumber";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private Integer itemNumber;

  public static final String SERIALIZED_NAME_SPECIAL_SITUATION_CODE = "specialSituationCode";
  @SerializedName(SERIALIZED_NAME_SPECIAL_SITUATION_CODE)
  private String specialSituationCode;

  public static final String SERIALIZED_NAME_ORDER_ITEM = "orderItem";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM)
  private OrderItem orderItem;

  public static final String SERIALIZED_NAME_SPECIAL_SITUATION_DEFINITION = "specialSituationDefinition";
  @SerializedName(SERIALIZED_NAME_SPECIAL_SITUATION_DEFINITION)
  private SpecialSituationDefinition specialSituationDefinition;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;

  public OIShowSpecialSituation() { 
  }

  public OIShowSpecialSituation orderNumber(Long orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
  }


  public OIShowSpecialSituation itemNumber(Integer itemNumber) {
    
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * Get itemNumber
   * @return itemNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getItemNumber() {
    return itemNumber;
  }


  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }


  public OIShowSpecialSituation specialSituationCode(String specialSituationCode) {
    
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


  public OIShowSpecialSituation orderItem(OrderItem orderItem) {
    
    this.orderItem = orderItem;
    return this;
  }

   /**
   * Get orderItem
   * @return orderItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderItem getOrderItem() {
    return orderItem;
  }


  public void setOrderItem(OrderItem orderItem) {
    this.orderItem = orderItem;
  }


  public OIShowSpecialSituation specialSituationDefinition(SpecialSituationDefinition specialSituationDefinition) {
    
    this.specialSituationDefinition = specialSituationDefinition;
    return this;
  }

   /**
   * Get specialSituationDefinition
   * @return specialSituationDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpecialSituationDefinition getSpecialSituationDefinition() {
    return specialSituationDefinition;
  }


  public void setSpecialSituationDefinition(SpecialSituationDefinition specialSituationDefinition) {
    this.specialSituationDefinition = specialSituationDefinition;
  }


  public OIShowSpecialSituation deleted(Boolean deleted) {
    
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


  public OIShowSpecialSituation _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIShowSpecialSituation oiShowSpecialSituation = (OIShowSpecialSituation) o;
    return Objects.equals(this.orderNumber, oiShowSpecialSituation.orderNumber) &&
        Objects.equals(this.itemNumber, oiShowSpecialSituation.itemNumber) &&
        Objects.equals(this.specialSituationCode, oiShowSpecialSituation.specialSituationCode) &&
        Objects.equals(this.orderItem, oiShowSpecialSituation.orderItem) &&
        Objects.equals(this.specialSituationDefinition, oiShowSpecialSituation.specialSituationDefinition) &&
        Objects.equals(this.deleted, oiShowSpecialSituation.deleted) &&
        Objects.equals(this._new, oiShowSpecialSituation._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber, itemNumber, specialSituationCode, orderItem, specialSituationDefinition, deleted, _new);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIShowSpecialSituation {\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    specialSituationCode: ").append(toIndentedString(specialSituationCode)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
    sb.append("    specialSituationDefinition: ").append(toIndentedString(specialSituationDefinition)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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
    openapiFields.add("orderNumber");
    openapiFields.add("itemNumber");
    openapiFields.add("specialSituationCode");
    openapiFields.add("orderItem");
    openapiFields.add("specialSituationDefinition");
    openapiFields.add("deleted");
    openapiFields.add("new");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("specialSituationCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OIShowSpecialSituation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OIShowSpecialSituation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OIShowSpecialSituation is not found in the empty JSON string", OIShowSpecialSituation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OIShowSpecialSituation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OIShowSpecialSituation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OIShowSpecialSituation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("specialSituationCode") != null && !jsonObj.get("specialSituationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialSituationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialSituationCode").toString()));
      }
      // validate the optional field `orderItem`
      if (jsonObj.getAsJsonObject("orderItem") != null) {
        OrderItem.validateJsonObject(jsonObj.getAsJsonObject("orderItem"));
      }
      // validate the optional field `specialSituationDefinition`
      if (jsonObj.getAsJsonObject("specialSituationDefinition") != null) {
        SpecialSituationDefinition.validateJsonObject(jsonObj.getAsJsonObject("specialSituationDefinition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OIShowSpecialSituation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OIShowSpecialSituation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OIShowSpecialSituation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OIShowSpecialSituation.class));

       return (TypeAdapter<T>) new TypeAdapter<OIShowSpecialSituation>() {
           @Override
           public void write(JsonWriter out, OIShowSpecialSituation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OIShowSpecialSituation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OIShowSpecialSituation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OIShowSpecialSituation
  * @throws IOException if the JSON string is invalid with respect to OIShowSpecialSituation
  */
  public static OIShowSpecialSituation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OIShowSpecialSituation.class);
  }

 /**
  * Convert an instance of OIShowSpecialSituation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.sightsound.sdk.ticketing.model.Amount;
import com.sightsound.sdk.ticketing.model.DeliveryAddressIndicatorEnum;
import com.sightsound.sdk.ticketing.model.DeliveryTimeframeEnum;
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
 * MerchantRiskIndicator
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T16:06:07.372728-05:00[America/Chicago]")
public class MerchantRiskIndicator {
  public static final String SERIALIZED_NAME_ADDRESS_MATCH = "addressMatch";
  @SerializedName(SERIALIZED_NAME_ADDRESS_MATCH)
  private Boolean addressMatch;

  public static final String SERIALIZED_NAME_DELIVERY_ADDRESS_INDICATOR = "deliveryAddressIndicator";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ADDRESS_INDICATOR)
  private DeliveryAddressIndicatorEnum deliveryAddressIndicator;

  public static final String SERIALIZED_NAME_DELIVERY_EMAIL = "deliveryEmail";
  @SerializedName(SERIALIZED_NAME_DELIVERY_EMAIL)
  private String deliveryEmail;

  public static final String SERIALIZED_NAME_DELIVERY_TIMEFRAME = "deliveryTimeframe";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TIMEFRAME)
  private DeliveryTimeframeEnum deliveryTimeframe;

  public static final String SERIALIZED_NAME_GIFT_CARD_AMOUNT = "giftCardAmount";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_AMOUNT)
  private Amount giftCardAmount;

  public static final String SERIALIZED_NAME_GIFT_CARD_COUNT = "giftCardCount";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_COUNT)
  private Integer giftCardCount;

  public static final String SERIALIZED_NAME_PRE_ORDER_DATE = "preOrderDate";
  @SerializedName(SERIALIZED_NAME_PRE_ORDER_DATE)
  private OffsetDateTime preOrderDate;

  public static final String SERIALIZED_NAME_PRE_ORDER_PURCHASE = "preOrderPurchase";
  @SerializedName(SERIALIZED_NAME_PRE_ORDER_PURCHASE)
  private Boolean preOrderPurchase;

  public static final String SERIALIZED_NAME_REORDER_ITEMS = "reorderItems";
  @SerializedName(SERIALIZED_NAME_REORDER_ITEMS)
  private Boolean reorderItems;

  public MerchantRiskIndicator() { 
  }

  public MerchantRiskIndicator addressMatch(Boolean addressMatch) {
    
    this.addressMatch = addressMatch;
    return this;
  }

   /**
   * Get addressMatch
   * @return addressMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAddressMatch() {
    return addressMatch;
  }


  public void setAddressMatch(Boolean addressMatch) {
    this.addressMatch = addressMatch;
  }


  public MerchantRiskIndicator deliveryAddressIndicator(DeliveryAddressIndicatorEnum deliveryAddressIndicator) {
    
    this.deliveryAddressIndicator = deliveryAddressIndicator;
    return this;
  }

   /**
   * Get deliveryAddressIndicator
   * @return deliveryAddressIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryAddressIndicatorEnum getDeliveryAddressIndicator() {
    return deliveryAddressIndicator;
  }


  public void setDeliveryAddressIndicator(DeliveryAddressIndicatorEnum deliveryAddressIndicator) {
    this.deliveryAddressIndicator = deliveryAddressIndicator;
  }


  public MerchantRiskIndicator deliveryEmail(String deliveryEmail) {
    
    this.deliveryEmail = deliveryEmail;
    return this;
  }

   /**
   * Get deliveryEmail
   * @return deliveryEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeliveryEmail() {
    return deliveryEmail;
  }


  public void setDeliveryEmail(String deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }


  public MerchantRiskIndicator deliveryTimeframe(DeliveryTimeframeEnum deliveryTimeframe) {
    
    this.deliveryTimeframe = deliveryTimeframe;
    return this;
  }

   /**
   * Get deliveryTimeframe
   * @return deliveryTimeframe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryTimeframeEnum getDeliveryTimeframe() {
    return deliveryTimeframe;
  }


  public void setDeliveryTimeframe(DeliveryTimeframeEnum deliveryTimeframe) {
    this.deliveryTimeframe = deliveryTimeframe;
  }


  public MerchantRiskIndicator giftCardAmount(Amount giftCardAmount) {
    
    this.giftCardAmount = giftCardAmount;
    return this;
  }

   /**
   * Get giftCardAmount
   * @return giftCardAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getGiftCardAmount() {
    return giftCardAmount;
  }


  public void setGiftCardAmount(Amount giftCardAmount) {
    this.giftCardAmount = giftCardAmount;
  }


  public MerchantRiskIndicator giftCardCount(Integer giftCardCount) {
    
    this.giftCardCount = giftCardCount;
    return this;
  }

   /**
   * Get giftCardCount
   * @return giftCardCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGiftCardCount() {
    return giftCardCount;
  }


  public void setGiftCardCount(Integer giftCardCount) {
    this.giftCardCount = giftCardCount;
  }


  public MerchantRiskIndicator preOrderDate(OffsetDateTime preOrderDate) {
    
    this.preOrderDate = preOrderDate;
    return this;
  }

   /**
   * Get preOrderDate
   * @return preOrderDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getPreOrderDate() {
    return preOrderDate;
  }


  public void setPreOrderDate(OffsetDateTime preOrderDate) {
    this.preOrderDate = preOrderDate;
  }


  public MerchantRiskIndicator preOrderPurchase(Boolean preOrderPurchase) {
    
    this.preOrderPurchase = preOrderPurchase;
    return this;
  }

   /**
   * Get preOrderPurchase
   * @return preOrderPurchase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPreOrderPurchase() {
    return preOrderPurchase;
  }


  public void setPreOrderPurchase(Boolean preOrderPurchase) {
    this.preOrderPurchase = preOrderPurchase;
  }


  public MerchantRiskIndicator reorderItems(Boolean reorderItems) {
    
    this.reorderItems = reorderItems;
    return this;
  }

   /**
   * Get reorderItems
   * @return reorderItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReorderItems() {
    return reorderItems;
  }


  public void setReorderItems(Boolean reorderItems) {
    this.reorderItems = reorderItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantRiskIndicator merchantRiskIndicator = (MerchantRiskIndicator) o;
    return Objects.equals(this.addressMatch, merchantRiskIndicator.addressMatch) &&
        Objects.equals(this.deliveryAddressIndicator, merchantRiskIndicator.deliveryAddressIndicator) &&
        Objects.equals(this.deliveryEmail, merchantRiskIndicator.deliveryEmail) &&
        Objects.equals(this.deliveryTimeframe, merchantRiskIndicator.deliveryTimeframe) &&
        Objects.equals(this.giftCardAmount, merchantRiskIndicator.giftCardAmount) &&
        Objects.equals(this.giftCardCount, merchantRiskIndicator.giftCardCount) &&
        Objects.equals(this.preOrderDate, merchantRiskIndicator.preOrderDate) &&
        Objects.equals(this.preOrderPurchase, merchantRiskIndicator.preOrderPurchase) &&
        Objects.equals(this.reorderItems, merchantRiskIndicator.reorderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressMatch, deliveryAddressIndicator, deliveryEmail, deliveryTimeframe, giftCardAmount, giftCardCount, preOrderDate, preOrderPurchase, reorderItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantRiskIndicator {\n");
    sb.append("    addressMatch: ").append(toIndentedString(addressMatch)).append("\n");
    sb.append("    deliveryAddressIndicator: ").append(toIndentedString(deliveryAddressIndicator)).append("\n");
    sb.append("    deliveryEmail: ").append(toIndentedString(deliveryEmail)).append("\n");
    sb.append("    deliveryTimeframe: ").append(toIndentedString(deliveryTimeframe)).append("\n");
    sb.append("    giftCardAmount: ").append(toIndentedString(giftCardAmount)).append("\n");
    sb.append("    giftCardCount: ").append(toIndentedString(giftCardCount)).append("\n");
    sb.append("    preOrderDate: ").append(toIndentedString(preOrderDate)).append("\n");
    sb.append("    preOrderPurchase: ").append(toIndentedString(preOrderPurchase)).append("\n");
    sb.append("    reorderItems: ").append(toIndentedString(reorderItems)).append("\n");
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
    openapiFields.add("addressMatch");
    openapiFields.add("deliveryAddressIndicator");
    openapiFields.add("deliveryEmail");
    openapiFields.add("deliveryTimeframe");
    openapiFields.add("giftCardAmount");
    openapiFields.add("giftCardCount");
    openapiFields.add("preOrderDate");
    openapiFields.add("preOrderPurchase");
    openapiFields.add("reorderItems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantRiskIndicator
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantRiskIndicator.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantRiskIndicator is not found in the empty JSON string", MerchantRiskIndicator.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantRiskIndicator.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantRiskIndicator` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("deliveryEmail") != null && !jsonObj.get("deliveryEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryEmail").toString()));
      }
      // validate the optional field `giftCardAmount`
      if (jsonObj.getAsJsonObject("giftCardAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("giftCardAmount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantRiskIndicator.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantRiskIndicator' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantRiskIndicator> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantRiskIndicator.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantRiskIndicator>() {
           @Override
           public void write(JsonWriter out, MerchantRiskIndicator value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantRiskIndicator read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantRiskIndicator given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantRiskIndicator
  * @throws IOException if the JSON string is invalid with respect to MerchantRiskIndicator
  */
  public static MerchantRiskIndicator fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantRiskIndicator.class);
  }

 /**
  * Convert an instance of MerchantRiskIndicator to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

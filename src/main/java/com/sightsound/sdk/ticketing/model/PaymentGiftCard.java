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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

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
 * PaymentGiftCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T17:16:16.028085Z[Etc/UTC]")
public class PaymentGiftCard {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_AMOUNT_TO_CHARGE = "amountToCharge";
  @SerializedName(SERIALIZED_NAME_AMOUNT_TO_CHARGE)
  private BigDecimal amountToCharge;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_MERCHANT_REFERENCE = "merchantReference";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFERENCE)
  private String merchantReference;

  public static final String SERIALIZED_NAME_APPLIED = "applied";
  @SerializedName(SERIALIZED_NAME_APPLIED)
  private Boolean applied;

  public PaymentGiftCard() { 
  }

  public PaymentGiftCard balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public PaymentGiftCard amountToCharge(BigDecimal amountToCharge) {
    
    this.amountToCharge = amountToCharge;
    return this;
  }

   /**
   * Get amountToCharge
   * @return amountToCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmountToCharge() {
    return amountToCharge;
  }


  public void setAmountToCharge(BigDecimal amountToCharge) {
    this.amountToCharge = amountToCharge;
  }


  public PaymentGiftCard cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public PaymentGiftCard pspReference(String pspReference) {
    
    this.pspReference = pspReference;
    return this;
  }

   /**
   * Get pspReference
   * @return pspReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPspReference() {
    return pspReference;
  }


  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public PaymentGiftCard merchantReference(String merchantReference) {
    
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * Get merchantReference
   * @return merchantReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMerchantReference() {
    return merchantReference;
  }


  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  public PaymentGiftCard applied(Boolean applied) {
    
    this.applied = applied;
    return this;
  }

   /**
   * Get applied
   * @return applied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getApplied() {
    return applied;
  }


  public void setApplied(Boolean applied) {
    this.applied = applied;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentGiftCard paymentGiftCard = (PaymentGiftCard) o;
    return Objects.equals(this.balance, paymentGiftCard.balance) &&
        Objects.equals(this.amountToCharge, paymentGiftCard.amountToCharge) &&
        Objects.equals(this.cardNumber, paymentGiftCard.cardNumber) &&
        Objects.equals(this.pspReference, paymentGiftCard.pspReference) &&
        Objects.equals(this.merchantReference, paymentGiftCard.merchantReference) &&
        Objects.equals(this.applied, paymentGiftCard.applied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, amountToCharge, cardNumber, pspReference, merchantReference, applied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentGiftCard {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    amountToCharge: ").append(toIndentedString(amountToCharge)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("amountToCharge");
    openapiFields.add("cardNumber");
    openapiFields.add("pspReference");
    openapiFields.add("merchantReference");
    openapiFields.add("applied");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cardNumber");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentGiftCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentGiftCard.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentGiftCard is not found in the empty JSON string", PaymentGiftCard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentGiftCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentGiftCard` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentGiftCard.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("cardNumber") != null && !jsonObj.get("cardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNumber").toString()));
      }
      if (jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
      if (jsonObj.get("merchantReference") != null && !jsonObj.get("merchantReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantReference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentGiftCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentGiftCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentGiftCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentGiftCard.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentGiftCard>() {
           @Override
           public void write(JsonWriter out, PaymentGiftCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentGiftCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentGiftCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentGiftCard
  * @throws IOException if the JSON string is invalid with respect to PaymentGiftCard
  */
  public static PaymentGiftCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentGiftCard.class);
  }

 /**
  * Convert an instance of PaymentGiftCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.sightsound.sdk.ticketing.model.LocationDescription;
import com.sightsound.sdk.ticketing.model.OrderItemPriceResponse;
import com.sightsound.sdk.ticketing.model.TicketBatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
 * CartResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T17:37:03.061697Z[Etc/UTC]")
public class CartResponse {
  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private BigDecimal totalPrice;

  public static final String SERIALIZED_NAME_TAXES_FEES_PRICE = "taxesFeesPrice";
  @SerializedName(SERIALIZED_NAME_TAXES_FEES_PRICE)
  private BigDecimal taxesFeesPrice;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT = "totalDiscount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT)
  private BigDecimal totalDiscount;

  public static final String SERIALIZED_NAME_TOTAL_SAVINGS = "totalSavings";
  @SerializedName(SERIALIZED_NAME_TOTAL_SAVINGS)
  private BigDecimal totalSavings;

  public static final String SERIALIZED_NAME_TOTAL_TRANSACTION_CHARGE = "totalTransactionCharge";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRANSACTION_CHARGE)
  private BigDecimal totalTransactionCharge;

  public static final String SERIALIZED_NAME_TOTAL_DUE_AMOUNT = "totalDueAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DUE_AMOUNT)
  private BigDecimal totalDueAmount;

  public static final String SERIALIZED_NAME_REFUND_POLICY = "refundPolicy";
  @SerializedName(SERIALIZED_NAME_REFUND_POLICY)
  private String refundPolicy;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationDescription location;

  public static final String SERIALIZED_NAME_TICKET_BATCH = "ticketBatch";
  @SerializedName(SERIALIZED_NAME_TICKET_BATCH)
  private TicketBatch ticketBatch;

  public static final String SERIALIZED_NAME_HELD_NAME = "heldName";
  @SerializedName(SERIALIZED_NAME_HELD_NAME)
  private String heldName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderItemPriceResponse> items = null;

  public static final String SERIALIZED_NAME_FINAL_SALE_DATE = "finalSaleDate";
  @SerializedName(SERIALIZED_NAME_FINAL_SALE_DATE)
  private OffsetDateTime finalSaleDate;

  public static final String SERIALIZED_NAME_TIER_YEAR = "tierYear";
  @SerializedName(SERIALIZED_NAME_TIER_YEAR)
  private Integer tierYear;

  public static final String SERIALIZED_NAME_CAN_TICKETS_BE_MAILED = "canTicketsBeMailed";
  @SerializedName(SERIALIZED_NAME_CAN_TICKETS_BE_MAILED)
  private Boolean canTicketsBeMailed;

  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private Long customerNumber;

  public static final String SERIALIZED_NAME_POST_PAY = "postPay";
  @SerializedName(SERIALIZED_NAME_POST_PAY)
  private Boolean postPay;

  public static final String SERIALIZED_NAME_MUST_PAY = "mustPay";
  @SerializedName(SERIALIZED_NAME_MUST_PAY)
  private Boolean mustPay;

  public static final String SERIALIZED_NAME_TOTAL_PAID_AMOUNT = "totalPaidAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAID_AMOUNT)
  private BigDecimal totalPaidAmount;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_REF_NUMBER = "refNumber";
  @SerializedName(SERIALIZED_NAME_REF_NUMBER)
  private String refNumber;

  public static final String SERIALIZED_NAME_ETICKETS_ALLOWED = "eticketsAllowed";
  @SerializedName(SERIALIZED_NAME_ETICKETS_ALLOWED)
  private Boolean eticketsAllowed;

  public CartResponse() { 
  }

  public CartResponse orderNumber(Long orderNumber) {
    
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


  public CartResponse totalPrice(BigDecimal totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalPrice() {
    return totalPrice;
  }


  public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }


  public CartResponse taxesFeesPrice(BigDecimal taxesFeesPrice) {
    
    this.taxesFeesPrice = taxesFeesPrice;
    return this;
  }

   /**
   * Get taxesFeesPrice
   * @return taxesFeesPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTaxesFeesPrice() {
    return taxesFeesPrice;
  }


  public void setTaxesFeesPrice(BigDecimal taxesFeesPrice) {
    this.taxesFeesPrice = taxesFeesPrice;
  }


  public CartResponse totalDiscount(BigDecimal totalDiscount) {
    
    this.totalDiscount = totalDiscount;
    return this;
  }

   /**
   * Get totalDiscount
   * @return totalDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalDiscount() {
    return totalDiscount;
  }


  public void setTotalDiscount(BigDecimal totalDiscount) {
    this.totalDiscount = totalDiscount;
  }


  public CartResponse totalSavings(BigDecimal totalSavings) {
    
    this.totalSavings = totalSavings;
    return this;
  }

   /**
   * Get totalSavings
   * @return totalSavings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalSavings() {
    return totalSavings;
  }


  public void setTotalSavings(BigDecimal totalSavings) {
    this.totalSavings = totalSavings;
  }


  public CartResponse totalTransactionCharge(BigDecimal totalTransactionCharge) {
    
    this.totalTransactionCharge = totalTransactionCharge;
    return this;
  }

   /**
   * Get totalTransactionCharge
   * @return totalTransactionCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalTransactionCharge() {
    return totalTransactionCharge;
  }


  public void setTotalTransactionCharge(BigDecimal totalTransactionCharge) {
    this.totalTransactionCharge = totalTransactionCharge;
  }


  public CartResponse totalDueAmount(BigDecimal totalDueAmount) {
    
    this.totalDueAmount = totalDueAmount;
    return this;
  }

   /**
   * Get totalDueAmount
   * @return totalDueAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalDueAmount() {
    return totalDueAmount;
  }


  public void setTotalDueAmount(BigDecimal totalDueAmount) {
    this.totalDueAmount = totalDueAmount;
  }


  public CartResponse refundPolicy(String refundPolicy) {
    
    this.refundPolicy = refundPolicy;
    return this;
  }

   /**
   * Get refundPolicy
   * @return refundPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefundPolicy() {
    return refundPolicy;
  }


  public void setRefundPolicy(String refundPolicy) {
    this.refundPolicy = refundPolicy;
  }


  public CartResponse location(LocationDescription location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocationDescription getLocation() {
    return location;
  }


  public void setLocation(LocationDescription location) {
    this.location = location;
  }


  public CartResponse ticketBatch(TicketBatch ticketBatch) {
    
    this.ticketBatch = ticketBatch;
    return this;
  }

   /**
   * Get ticketBatch
   * @return ticketBatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TicketBatch getTicketBatch() {
    return ticketBatch;
  }


  public void setTicketBatch(TicketBatch ticketBatch) {
    this.ticketBatch = ticketBatch;
  }


  public CartResponse heldName(String heldName) {
    
    this.heldName = heldName;
    return this;
  }

   /**
   * Get heldName
   * @return heldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHeldName() {
    return heldName;
  }


  public void setHeldName(String heldName) {
    this.heldName = heldName;
  }


  public CartResponse email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CartResponse items(List<OrderItemPriceResponse> items) {
    
    this.items = items;
    return this;
  }

  public CartResponse addItemsItem(OrderItemPriceResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OrderItemPriceResponse> getItems() {
    return items;
  }


  public void setItems(List<OrderItemPriceResponse> items) {
    this.items = items;
  }


  public CartResponse finalSaleDate(OffsetDateTime finalSaleDate) {
    
    this.finalSaleDate = finalSaleDate;
    return this;
  }

   /**
   * Get finalSaleDate
   * @return finalSaleDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getFinalSaleDate() {
    return finalSaleDate;
  }


  public void setFinalSaleDate(OffsetDateTime finalSaleDate) {
    this.finalSaleDate = finalSaleDate;
  }


  public CartResponse tierYear(Integer tierYear) {
    
    this.tierYear = tierYear;
    return this;
  }

   /**
   * Get tierYear
   * @return tierYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTierYear() {
    return tierYear;
  }


  public void setTierYear(Integer tierYear) {
    this.tierYear = tierYear;
  }


  public CartResponse canTicketsBeMailed(Boolean canTicketsBeMailed) {
    
    this.canTicketsBeMailed = canTicketsBeMailed;
    return this;
  }

   /**
   * Get canTicketsBeMailed
   * @return canTicketsBeMailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanTicketsBeMailed() {
    return canTicketsBeMailed;
  }


  public void setCanTicketsBeMailed(Boolean canTicketsBeMailed) {
    this.canTicketsBeMailed = canTicketsBeMailed;
  }


  public CartResponse customerNumber(Long customerNumber) {
    
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Get customerNumber
   * @return customerNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCustomerNumber() {
    return customerNumber;
  }


  public void setCustomerNumber(Long customerNumber) {
    this.customerNumber = customerNumber;
  }


  public CartResponse postPay(Boolean postPay) {
    
    this.postPay = postPay;
    return this;
  }

   /**
   * Get postPay
   * @return postPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPostPay() {
    return postPay;
  }


  public void setPostPay(Boolean postPay) {
    this.postPay = postPay;
  }


  public CartResponse mustPay(Boolean mustPay) {
    
    this.mustPay = mustPay;
    return this;
  }

   /**
   * Get mustPay
   * @return mustPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMustPay() {
    return mustPay;
  }


  public void setMustPay(Boolean mustPay) {
    this.mustPay = mustPay;
  }


  public CartResponse totalPaidAmount(BigDecimal totalPaidAmount) {
    
    this.totalPaidAmount = totalPaidAmount;
    return this;
  }

   /**
   * Get totalPaidAmount
   * @return totalPaidAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalPaidAmount() {
    return totalPaidAmount;
  }


  public void setTotalPaidAmount(BigDecimal totalPaidAmount) {
    this.totalPaidAmount = totalPaidAmount;
  }


  public CartResponse groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public CartResponse refNumber(String refNumber) {
    
    this.refNumber = refNumber;
    return this;
  }

   /**
   * Get refNumber
   * @return refNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefNumber() {
    return refNumber;
  }


  public void setRefNumber(String refNumber) {
    this.refNumber = refNumber;
  }


  public CartResponse eticketsAllowed(Boolean eticketsAllowed) {
    
    this.eticketsAllowed = eticketsAllowed;
    return this;
  }

   /**
   * Get eticketsAllowed
   * @return eticketsAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEticketsAllowed() {
    return eticketsAllowed;
  }


  public void setEticketsAllowed(Boolean eticketsAllowed) {
    this.eticketsAllowed = eticketsAllowed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartResponse cartResponse = (CartResponse) o;
    return Objects.equals(this.orderNumber, cartResponse.orderNumber) &&
        Objects.equals(this.totalPrice, cartResponse.totalPrice) &&
        Objects.equals(this.taxesFeesPrice, cartResponse.taxesFeesPrice) &&
        Objects.equals(this.totalDiscount, cartResponse.totalDiscount) &&
        Objects.equals(this.totalSavings, cartResponse.totalSavings) &&
        Objects.equals(this.totalTransactionCharge, cartResponse.totalTransactionCharge) &&
        Objects.equals(this.totalDueAmount, cartResponse.totalDueAmount) &&
        Objects.equals(this.refundPolicy, cartResponse.refundPolicy) &&
        Objects.equals(this.location, cartResponse.location) &&
        Objects.equals(this.ticketBatch, cartResponse.ticketBatch) &&
        Objects.equals(this.heldName, cartResponse.heldName) &&
        Objects.equals(this.email, cartResponse.email) &&
        Objects.equals(this.items, cartResponse.items) &&
        Objects.equals(this.finalSaleDate, cartResponse.finalSaleDate) &&
        Objects.equals(this.tierYear, cartResponse.tierYear) &&
        Objects.equals(this.canTicketsBeMailed, cartResponse.canTicketsBeMailed) &&
        Objects.equals(this.customerNumber, cartResponse.customerNumber) &&
        Objects.equals(this.postPay, cartResponse.postPay) &&
        Objects.equals(this.mustPay, cartResponse.mustPay) &&
        Objects.equals(this.totalPaidAmount, cartResponse.totalPaidAmount) &&
        Objects.equals(this.groupName, cartResponse.groupName) &&
        Objects.equals(this.refNumber, cartResponse.refNumber) &&
        Objects.equals(this.eticketsAllowed, cartResponse.eticketsAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber, totalPrice, taxesFeesPrice, totalDiscount, totalSavings, totalTransactionCharge, totalDueAmount, refundPolicy, location, ticketBatch, heldName, email, items, finalSaleDate, tierYear, canTicketsBeMailed, customerNumber, postPay, mustPay, totalPaidAmount, groupName, refNumber, eticketsAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartResponse {\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    taxesFeesPrice: ").append(toIndentedString(taxesFeesPrice)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    totalSavings: ").append(toIndentedString(totalSavings)).append("\n");
    sb.append("    totalTransactionCharge: ").append(toIndentedString(totalTransactionCharge)).append("\n");
    sb.append("    totalDueAmount: ").append(toIndentedString(totalDueAmount)).append("\n");
    sb.append("    refundPolicy: ").append(toIndentedString(refundPolicy)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    ticketBatch: ").append(toIndentedString(ticketBatch)).append("\n");
    sb.append("    heldName: ").append(toIndentedString(heldName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    finalSaleDate: ").append(toIndentedString(finalSaleDate)).append("\n");
    sb.append("    tierYear: ").append(toIndentedString(tierYear)).append("\n");
    sb.append("    canTicketsBeMailed: ").append(toIndentedString(canTicketsBeMailed)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    postPay: ").append(toIndentedString(postPay)).append("\n");
    sb.append("    mustPay: ").append(toIndentedString(mustPay)).append("\n");
    sb.append("    totalPaidAmount: ").append(toIndentedString(totalPaidAmount)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
    sb.append("    eticketsAllowed: ").append(toIndentedString(eticketsAllowed)).append("\n");
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
    openapiFields.add("totalPrice");
    openapiFields.add("taxesFeesPrice");
    openapiFields.add("totalDiscount");
    openapiFields.add("totalSavings");
    openapiFields.add("totalTransactionCharge");
    openapiFields.add("totalDueAmount");
    openapiFields.add("refundPolicy");
    openapiFields.add("location");
    openapiFields.add("ticketBatch");
    openapiFields.add("heldName");
    openapiFields.add("email");
    openapiFields.add("items");
    openapiFields.add("finalSaleDate");
    openapiFields.add("tierYear");
    openapiFields.add("canTicketsBeMailed");
    openapiFields.add("customerNumber");
    openapiFields.add("postPay");
    openapiFields.add("mustPay");
    openapiFields.add("totalPaidAmount");
    openapiFields.add("groupName");
    openapiFields.add("refNumber");
    openapiFields.add("eticketsAllowed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CartResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CartResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartResponse is not found in the empty JSON string", CartResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CartResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("refundPolicy") != null && !jsonObj.get("refundPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refundPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refundPolicy").toString()));
      }
      if (jsonObj.get("heldName") != null && !jsonObj.get("heldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `heldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("heldName").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          OrderItemPriceResponse.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("groupName") != null && !jsonObj.get("groupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupName").toString()));
      }
      if (jsonObj.get("refNumber") != null && !jsonObj.get("refNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CartResponse>() {
           @Override
           public void write(JsonWriter out, CartResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartResponse
  * @throws IOException if the JSON string is invalid with respect to CartResponse
  */
  public static CartResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartResponse.class);
  }

 /**
  * Convert an instance of CartResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


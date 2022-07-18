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
import com.sightsound.sdk.ticketing.model.BookingLocation;
import com.sightsound.sdk.ticketing.model.Customer;
import com.sightsound.sdk.ticketing.model.PricingLevel;
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
 * CustomerPricingLevel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T19:32:42.242731Z[Etc/UTC]")
public class CustomerPricingLevel {
  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private Long customerNumber;

  public static final String SERIALIZED_NAME_PRICING_LEVEL = "pricingLevel";
  @SerializedName(SERIALIZED_NAME_PRICING_LEVEL)
  private PricingLevel pricingLevel;

  public static final String SERIALIZED_NAME_TIER_YEAR = "tierYear";
  @SerializedName(SERIALIZED_NAME_TIER_YEAR)
  private Integer tierYear;

  public static final String SERIALIZED_NAME_BOOKED = "booked";
  @SerializedName(SERIALIZED_NAME_BOOKED)
  private Integer booked;

  public static final String SERIALIZED_NAME_CANCELLED = "cancelled";
  @SerializedName(SERIALIZED_NAME_CANCELLED)
  private Integer cancelled;

  public static final String SERIALIZED_NAME_SLIDING_SCALE_TICKETS = "slidingScaleTickets";
  @SerializedName(SERIALIZED_NAME_SLIDING_SCALE_TICKETS)
  private Integer slidingScaleTickets;

  public static final String SERIALIZED_NAME_SLIDING_SCALE_DISCOUNT = "slidingScaleDiscount";
  @SerializedName(SERIALIZED_NAME_SLIDING_SCALE_DISCOUNT)
  private BigDecimal slidingScaleDiscount;

  public static final String SERIALIZED_NAME_TICKETS1 = "tickets1";
  @SerializedName(SERIALIZED_NAME_TICKETS1)
  private Integer tickets1;

  public static final String SERIALIZED_NAME_PERCENT1 = "percent1";
  @SerializedName(SERIALIZED_NAME_PERCENT1)
  private BigDecimal percent1;

  public static final String SERIALIZED_NAME_TICKETS2 = "tickets2";
  @SerializedName(SERIALIZED_NAME_TICKETS2)
  private Integer tickets2;

  public static final String SERIALIZED_NAME_PERCENT2 = "percent2";
  @SerializedName(SERIALIZED_NAME_PERCENT2)
  private BigDecimal percent2;

  public static final String SERIALIZED_NAME_TICKETS3 = "tickets3";
  @SerializedName(SERIALIZED_NAME_TICKETS3)
  private Integer tickets3;

  public static final String SERIALIZED_NAME_PERCENT3 = "percent3";
  @SerializedName(SERIALIZED_NAME_PERCENT3)
  private BigDecimal percent3;

  public static final String SERIALIZED_NAME_TICKETS4 = "tickets4";
  @SerializedName(SERIALIZED_NAME_TICKETS4)
  private Integer tickets4;

  public static final String SERIALIZED_NAME_PERCENT4 = "percent4";
  @SerializedName(SERIALIZED_NAME_PERCENT4)
  private BigDecimal percent4;

  public static final String SERIALIZED_NAME_TICKETS5 = "tickets5";
  @SerializedName(SERIALIZED_NAME_TICKETS5)
  private Integer tickets5;

  public static final String SERIALIZED_NAME_PERCENT5 = "percent5";
  @SerializedName(SERIALIZED_NAME_PERCENT5)
  private BigDecimal percent5;

  public static final String SERIALIZED_NAME_SALES_REP_ID = "salesRepId";
  @SerializedName(SERIALIZED_NAME_SALES_REP_ID)
  private String salesRepId;

  public static final String SERIALIZED_NAME_BOOKING_LOCATION = "bookingLocation";
  @SerializedName(SERIALIZED_NAME_BOOKING_LOCATION)
  private BookingLocation bookingLocation;

  public static final String SERIALIZED_NAME_POST_PAY = "postPay";
  @SerializedName(SERIALIZED_NAME_POST_PAY)
  private Boolean postPay;

  public static final String SERIALIZED_NAME_TICKET_INCREASE = "ticketIncrease";
  @SerializedName(SERIALIZED_NAME_TICKET_INCREASE)
  private Integer ticketIncrease;

  public static final String SERIALIZED_NAME_TICKET_DECREASE = "ticketDecrease";
  @SerializedName(SERIALIZED_NAME_TICKET_DECREASE)
  private Integer ticketDecrease;

  public static final String SERIALIZED_NAME_SPECULATIVE_BOOKING = "speculativeBooking";
  @SerializedName(SERIALIZED_NAME_SPECULATIVE_BOOKING)
  private Integer speculativeBooking;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public CustomerPricingLevel() { 
  }

  public CustomerPricingLevel customerNumber(Long customerNumber) {
    
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


  public CustomerPricingLevel pricingLevel(PricingLevel pricingLevel) {
    
    this.pricingLevel = pricingLevel;
    return this;
  }

   /**
   * Get pricingLevel
   * @return pricingLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PricingLevel getPricingLevel() {
    return pricingLevel;
  }


  public void setPricingLevel(PricingLevel pricingLevel) {
    this.pricingLevel = pricingLevel;
  }


  public CustomerPricingLevel tierYear(Integer tierYear) {
    
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


  public CustomerPricingLevel booked(Integer booked) {
    
    this.booked = booked;
    return this;
  }

   /**
   * Get booked
   * @return booked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBooked() {
    return booked;
  }


  public void setBooked(Integer booked) {
    this.booked = booked;
  }


  public CustomerPricingLevel cancelled(Integer cancelled) {
    
    this.cancelled = cancelled;
    return this;
  }

   /**
   * Get cancelled
   * @return cancelled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCancelled() {
    return cancelled;
  }


  public void setCancelled(Integer cancelled) {
    this.cancelled = cancelled;
  }


  public CustomerPricingLevel slidingScaleTickets(Integer slidingScaleTickets) {
    
    this.slidingScaleTickets = slidingScaleTickets;
    return this;
  }

   /**
   * Get slidingScaleTickets
   * @return slidingScaleTickets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSlidingScaleTickets() {
    return slidingScaleTickets;
  }


  public void setSlidingScaleTickets(Integer slidingScaleTickets) {
    this.slidingScaleTickets = slidingScaleTickets;
  }


  public CustomerPricingLevel slidingScaleDiscount(BigDecimal slidingScaleDiscount) {
    
    this.slidingScaleDiscount = slidingScaleDiscount;
    return this;
  }

   /**
   * Get slidingScaleDiscount
   * @return slidingScaleDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSlidingScaleDiscount() {
    return slidingScaleDiscount;
  }


  public void setSlidingScaleDiscount(BigDecimal slidingScaleDiscount) {
    this.slidingScaleDiscount = slidingScaleDiscount;
  }


  public CustomerPricingLevel tickets1(Integer tickets1) {
    
    this.tickets1 = tickets1;
    return this;
  }

   /**
   * Get tickets1
   * @return tickets1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTickets1() {
    return tickets1;
  }


  public void setTickets1(Integer tickets1) {
    this.tickets1 = tickets1;
  }


  public CustomerPricingLevel percent1(BigDecimal percent1) {
    
    this.percent1 = percent1;
    return this;
  }

   /**
   * Get percent1
   * @return percent1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercent1() {
    return percent1;
  }


  public void setPercent1(BigDecimal percent1) {
    this.percent1 = percent1;
  }


  public CustomerPricingLevel tickets2(Integer tickets2) {
    
    this.tickets2 = tickets2;
    return this;
  }

   /**
   * Get tickets2
   * @return tickets2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTickets2() {
    return tickets2;
  }


  public void setTickets2(Integer tickets2) {
    this.tickets2 = tickets2;
  }


  public CustomerPricingLevel percent2(BigDecimal percent2) {
    
    this.percent2 = percent2;
    return this;
  }

   /**
   * Get percent2
   * @return percent2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercent2() {
    return percent2;
  }


  public void setPercent2(BigDecimal percent2) {
    this.percent2 = percent2;
  }


  public CustomerPricingLevel tickets3(Integer tickets3) {
    
    this.tickets3 = tickets3;
    return this;
  }

   /**
   * Get tickets3
   * @return tickets3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTickets3() {
    return tickets3;
  }


  public void setTickets3(Integer tickets3) {
    this.tickets3 = tickets3;
  }


  public CustomerPricingLevel percent3(BigDecimal percent3) {
    
    this.percent3 = percent3;
    return this;
  }

   /**
   * Get percent3
   * @return percent3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercent3() {
    return percent3;
  }


  public void setPercent3(BigDecimal percent3) {
    this.percent3 = percent3;
  }


  public CustomerPricingLevel tickets4(Integer tickets4) {
    
    this.tickets4 = tickets4;
    return this;
  }

   /**
   * Get tickets4
   * @return tickets4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTickets4() {
    return tickets4;
  }


  public void setTickets4(Integer tickets4) {
    this.tickets4 = tickets4;
  }


  public CustomerPricingLevel percent4(BigDecimal percent4) {
    
    this.percent4 = percent4;
    return this;
  }

   /**
   * Get percent4
   * @return percent4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercent4() {
    return percent4;
  }


  public void setPercent4(BigDecimal percent4) {
    this.percent4 = percent4;
  }


  public CustomerPricingLevel tickets5(Integer tickets5) {
    
    this.tickets5 = tickets5;
    return this;
  }

   /**
   * Get tickets5
   * @return tickets5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTickets5() {
    return tickets5;
  }


  public void setTickets5(Integer tickets5) {
    this.tickets5 = tickets5;
  }


  public CustomerPricingLevel percent5(BigDecimal percent5) {
    
    this.percent5 = percent5;
    return this;
  }

   /**
   * Get percent5
   * @return percent5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercent5() {
    return percent5;
  }


  public void setPercent5(BigDecimal percent5) {
    this.percent5 = percent5;
  }


  public CustomerPricingLevel salesRepId(String salesRepId) {
    
    this.salesRepId = salesRepId;
    return this;
  }

   /**
   * Get salesRepId
   * @return salesRepId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSalesRepId() {
    return salesRepId;
  }


  public void setSalesRepId(String salesRepId) {
    this.salesRepId = salesRepId;
  }


  public CustomerPricingLevel bookingLocation(BookingLocation bookingLocation) {
    
    this.bookingLocation = bookingLocation;
    return this;
  }

   /**
   * Get bookingLocation
   * @return bookingLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BookingLocation getBookingLocation() {
    return bookingLocation;
  }


  public void setBookingLocation(BookingLocation bookingLocation) {
    this.bookingLocation = bookingLocation;
  }


  public CustomerPricingLevel postPay(Boolean postPay) {
    
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


  public CustomerPricingLevel ticketIncrease(Integer ticketIncrease) {
    
    this.ticketIncrease = ticketIncrease;
    return this;
  }

   /**
   * Get ticketIncrease
   * @return ticketIncrease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTicketIncrease() {
    return ticketIncrease;
  }


  public void setTicketIncrease(Integer ticketIncrease) {
    this.ticketIncrease = ticketIncrease;
  }


  public CustomerPricingLevel ticketDecrease(Integer ticketDecrease) {
    
    this.ticketDecrease = ticketDecrease;
    return this;
  }

   /**
   * Get ticketDecrease
   * @return ticketDecrease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTicketDecrease() {
    return ticketDecrease;
  }


  public void setTicketDecrease(Integer ticketDecrease) {
    this.ticketDecrease = ticketDecrease;
  }


  public CustomerPricingLevel speculativeBooking(Integer speculativeBooking) {
    
    this.speculativeBooking = speculativeBooking;
    return this;
  }

   /**
   * Get speculativeBooking
   * @return speculativeBooking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSpeculativeBooking() {
    return speculativeBooking;
  }


  public void setSpeculativeBooking(Integer speculativeBooking) {
    this.speculativeBooking = speculativeBooking;
  }


  public CustomerPricingLevel customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Customer getCustomer() {
    return customer;
  }


  public void setCustomer(Customer customer) {
    this.customer = customer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPricingLevel customerPricingLevel = (CustomerPricingLevel) o;
    return Objects.equals(this.customerNumber, customerPricingLevel.customerNumber) &&
        Objects.equals(this.pricingLevel, customerPricingLevel.pricingLevel) &&
        Objects.equals(this.tierYear, customerPricingLevel.tierYear) &&
        Objects.equals(this.booked, customerPricingLevel.booked) &&
        Objects.equals(this.cancelled, customerPricingLevel.cancelled) &&
        Objects.equals(this.slidingScaleTickets, customerPricingLevel.slidingScaleTickets) &&
        Objects.equals(this.slidingScaleDiscount, customerPricingLevel.slidingScaleDiscount) &&
        Objects.equals(this.tickets1, customerPricingLevel.tickets1) &&
        Objects.equals(this.percent1, customerPricingLevel.percent1) &&
        Objects.equals(this.tickets2, customerPricingLevel.tickets2) &&
        Objects.equals(this.percent2, customerPricingLevel.percent2) &&
        Objects.equals(this.tickets3, customerPricingLevel.tickets3) &&
        Objects.equals(this.percent3, customerPricingLevel.percent3) &&
        Objects.equals(this.tickets4, customerPricingLevel.tickets4) &&
        Objects.equals(this.percent4, customerPricingLevel.percent4) &&
        Objects.equals(this.tickets5, customerPricingLevel.tickets5) &&
        Objects.equals(this.percent5, customerPricingLevel.percent5) &&
        Objects.equals(this.salesRepId, customerPricingLevel.salesRepId) &&
        Objects.equals(this.bookingLocation, customerPricingLevel.bookingLocation) &&
        Objects.equals(this.postPay, customerPricingLevel.postPay) &&
        Objects.equals(this.ticketIncrease, customerPricingLevel.ticketIncrease) &&
        Objects.equals(this.ticketDecrease, customerPricingLevel.ticketDecrease) &&
        Objects.equals(this.speculativeBooking, customerPricingLevel.speculativeBooking) &&
        Objects.equals(this.customer, customerPricingLevel.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNumber, pricingLevel, tierYear, booked, cancelled, slidingScaleTickets, slidingScaleDiscount, tickets1, percent1, tickets2, percent2, tickets3, percent3, tickets4, percent4, tickets5, percent5, salesRepId, bookingLocation, postPay, ticketIncrease, ticketDecrease, speculativeBooking, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPricingLevel {\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    pricingLevel: ").append(toIndentedString(pricingLevel)).append("\n");
    sb.append("    tierYear: ").append(toIndentedString(tierYear)).append("\n");
    sb.append("    booked: ").append(toIndentedString(booked)).append("\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    slidingScaleTickets: ").append(toIndentedString(slidingScaleTickets)).append("\n");
    sb.append("    slidingScaleDiscount: ").append(toIndentedString(slidingScaleDiscount)).append("\n");
    sb.append("    tickets1: ").append(toIndentedString(tickets1)).append("\n");
    sb.append("    percent1: ").append(toIndentedString(percent1)).append("\n");
    sb.append("    tickets2: ").append(toIndentedString(tickets2)).append("\n");
    sb.append("    percent2: ").append(toIndentedString(percent2)).append("\n");
    sb.append("    tickets3: ").append(toIndentedString(tickets3)).append("\n");
    sb.append("    percent3: ").append(toIndentedString(percent3)).append("\n");
    sb.append("    tickets4: ").append(toIndentedString(tickets4)).append("\n");
    sb.append("    percent4: ").append(toIndentedString(percent4)).append("\n");
    sb.append("    tickets5: ").append(toIndentedString(tickets5)).append("\n");
    sb.append("    percent5: ").append(toIndentedString(percent5)).append("\n");
    sb.append("    salesRepId: ").append(toIndentedString(salesRepId)).append("\n");
    sb.append("    bookingLocation: ").append(toIndentedString(bookingLocation)).append("\n");
    sb.append("    postPay: ").append(toIndentedString(postPay)).append("\n");
    sb.append("    ticketIncrease: ").append(toIndentedString(ticketIncrease)).append("\n");
    sb.append("    ticketDecrease: ").append(toIndentedString(ticketDecrease)).append("\n");
    sb.append("    speculativeBooking: ").append(toIndentedString(speculativeBooking)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
    openapiFields.add("customerNumber");
    openapiFields.add("pricingLevel");
    openapiFields.add("tierYear");
    openapiFields.add("booked");
    openapiFields.add("cancelled");
    openapiFields.add("slidingScaleTickets");
    openapiFields.add("slidingScaleDiscount");
    openapiFields.add("tickets1");
    openapiFields.add("percent1");
    openapiFields.add("tickets2");
    openapiFields.add("percent2");
    openapiFields.add("tickets3");
    openapiFields.add("percent3");
    openapiFields.add("tickets4");
    openapiFields.add("percent4");
    openapiFields.add("tickets5");
    openapiFields.add("percent5");
    openapiFields.add("salesRepId");
    openapiFields.add("bookingLocation");
    openapiFields.add("postPay");
    openapiFields.add("ticketIncrease");
    openapiFields.add("ticketDecrease");
    openapiFields.add("speculativeBooking");
    openapiFields.add("customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerPricingLevel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomerPricingLevel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerPricingLevel is not found in the empty JSON string", CustomerPricingLevel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerPricingLevel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerPricingLevel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("salesRepId") != null && !jsonObj.get("salesRepId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salesRepId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salesRepId").toString()));
      }
      // validate the optional field `customer`
      if (jsonObj.getAsJsonObject("customer") != null) {
        Customer.validateJsonObject(jsonObj.getAsJsonObject("customer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerPricingLevel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerPricingLevel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerPricingLevel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerPricingLevel.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerPricingLevel>() {
           @Override
           public void write(JsonWriter out, CustomerPricingLevel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerPricingLevel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerPricingLevel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerPricingLevel
  * @throws IOException if the JSON string is invalid with respect to CustomerPricingLevel
  */
  public static CustomerPricingLevel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerPricingLevel.class);
  }

 /**
  * Convert an instance of CustomerPricingLevel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


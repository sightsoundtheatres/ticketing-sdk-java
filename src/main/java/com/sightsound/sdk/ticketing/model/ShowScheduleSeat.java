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
import com.sightsound.sdk.ticketing.model.OrderItem;
import com.sightsound.sdk.ticketing.model.SeatStatus;
import com.sightsound.sdk.ticketing.model.SeatType;
import com.sightsound.sdk.ticketing.model.SeatingTemplateSectionSeat;
import com.sightsound.sdk.ticketing.model.TicketPrintStatus;
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
 * ShowScheduleSeat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T16:05:59.817736-05:00[America/Chicago]")
public class ShowScheduleSeat {
  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_SHOW_DATE_TIME = "showDateTime";
  @SerializedName(SERIALIZED_NAME_SHOW_DATE_TIME)
  private OffsetDateTime showDateTime;

  public static final String SERIALIZED_NAME_SECTION_CODE = "sectionCode";
  @SerializedName(SERIALIZED_NAME_SECTION_CODE)
  private String sectionCode;

  public static final String SERIALIZED_NAME_ROW_NUMBER = "rowNumber";
  @SerializedName(SERIALIZED_NAME_ROW_NUMBER)
  private String rowNumber;

  public static final String SERIALIZED_NAME_SEAT_NUMBER = "seatNumber";
  @SerializedName(SERIALIZED_NAME_SEAT_NUMBER)
  private Integer seatNumber;

  public static final String SERIALIZED_NAME_PRICE_GRADE = "priceGrade";
  @SerializedName(SERIALIZED_NAME_PRICE_GRADE)
  private String priceGrade;

  public static final String SERIALIZED_NAME_SEATING_TEMPLATE_CODE = "seatingTemplateCode";
  @SerializedName(SERIALIZED_NAME_SEATING_TEMPLATE_CODE)
  private String seatingTemplateCode;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "itemNumber";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private Integer itemNumber;

  public static final String SERIALIZED_NAME_BOOKING_PHASE = "bookingPhase";
  @SerializedName(SERIALIZED_NAME_BOOKING_PHASE)
  private Integer bookingPhase;

  public static final String SERIALIZED_NAME_SSS_DATE_TIME = "sssDateTime";
  @SerializedName(SERIALIZED_NAME_SSS_DATE_TIME)
  private OffsetDateTime sssDateTime;

  public static final String SERIALIZED_NAME_SEAT_TYPE = "seatType";
  @SerializedName(SERIALIZED_NAME_SEAT_TYPE)
  private SeatType seatType;

  public static final String SERIALIZED_NAME_SEAT_STATUS = "seatStatus";
  @SerializedName(SERIALIZED_NAME_SEAT_STATUS)
  private SeatStatus seatStatus;

  public static final String SERIALIZED_NAME_TICKET_PRINT_STATUS = "ticketPrintStatus";
  @SerializedName(SERIALIZED_NAME_TICKET_PRINT_STATUS)
  private TicketPrintStatus ticketPrintStatus;

  public static final String SERIALIZED_NAME_MODIFY_USER_ID = "modifyUserId";
  @SerializedName(SERIALIZED_NAME_MODIFY_USER_ID)
  private String modifyUserId;

  public static final String SERIALIZED_NAME_ORDER_ITEM = "orderItem";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM)
  private OrderItem orderItem;

  public static final String SERIALIZED_NAME_TEMPLATE_SECTION_SEAT = "templateSectionSeat";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_SECTION_SEAT)
  private SeatingTemplateSectionSeat templateSectionSeat;

  public static final String SERIALIZED_NAME_SEAT_CODE = "seatCode";
  @SerializedName(SERIALIZED_NAME_SEAT_CODE)
  private String seatCode;

  public static final String SERIALIZED_NAME_WHEELCHAIR_OR_MOTORIZED = "wheelchairOrMotorized";
  @SerializedName(SERIALIZED_NAME_WHEELCHAIR_OR_MOTORIZED)
  private Boolean wheelchairOrMotorized;

  public ShowScheduleSeat() { 
  }

  public ShowScheduleSeat eventCode(String eventCode) {
    
    this.eventCode = eventCode;
    return this;
  }

   /**
   * Get eventCode
   * @return eventCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEventCode() {
    return eventCode;
  }


  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }


  public ShowScheduleSeat showDateTime(OffsetDateTime showDateTime) {
    
    this.showDateTime = showDateTime;
    return this;
  }

   /**
   * Get showDateTime
   * @return showDateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getShowDateTime() {
    return showDateTime;
  }


  public void setShowDateTime(OffsetDateTime showDateTime) {
    this.showDateTime = showDateTime;
  }


  public ShowScheduleSeat sectionCode(String sectionCode) {
    
    this.sectionCode = sectionCode;
    return this;
  }

   /**
   * Get sectionCode
   * @return sectionCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSectionCode() {
    return sectionCode;
  }


  public void setSectionCode(String sectionCode) {
    this.sectionCode = sectionCode;
  }


  public ShowScheduleSeat rowNumber(String rowNumber) {
    
    this.rowNumber = rowNumber;
    return this;
  }

   /**
   * Get rowNumber
   * @return rowNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRowNumber() {
    return rowNumber;
  }


  public void setRowNumber(String rowNumber) {
    this.rowNumber = rowNumber;
  }


  public ShowScheduleSeat seatNumber(Integer seatNumber) {
    
    this.seatNumber = seatNumber;
    return this;
  }

   /**
   * Get seatNumber
   * @return seatNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeatNumber() {
    return seatNumber;
  }


  public void setSeatNumber(Integer seatNumber) {
    this.seatNumber = seatNumber;
  }


  public ShowScheduleSeat priceGrade(String priceGrade) {
    
    this.priceGrade = priceGrade;
    return this;
  }

   /**
   * Get priceGrade
   * @return priceGrade
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPriceGrade() {
    return priceGrade;
  }


  public void setPriceGrade(String priceGrade) {
    this.priceGrade = priceGrade;
  }


  public ShowScheduleSeat seatingTemplateCode(String seatingTemplateCode) {
    
    this.seatingTemplateCode = seatingTemplateCode;
    return this;
  }

   /**
   * Get seatingTemplateCode
   * @return seatingTemplateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeatingTemplateCode() {
    return seatingTemplateCode;
  }


  public void setSeatingTemplateCode(String seatingTemplateCode) {
    this.seatingTemplateCode = seatingTemplateCode;
  }


  public ShowScheduleSeat orderNumber(Long orderNumber) {
    
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


  public ShowScheduleSeat itemNumber(Integer itemNumber) {
    
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


  public ShowScheduleSeat bookingPhase(Integer bookingPhase) {
    
    this.bookingPhase = bookingPhase;
    return this;
  }

   /**
   * Get bookingPhase
   * @return bookingPhase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBookingPhase() {
    return bookingPhase;
  }


  public void setBookingPhase(Integer bookingPhase) {
    this.bookingPhase = bookingPhase;
  }


  public ShowScheduleSeat sssDateTime(OffsetDateTime sssDateTime) {
    
    this.sssDateTime = sssDateTime;
    return this;
  }

   /**
   * Get sssDateTime
   * @return sssDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getSssDateTime() {
    return sssDateTime;
  }


  public void setSssDateTime(OffsetDateTime sssDateTime) {
    this.sssDateTime = sssDateTime;
  }


  public ShowScheduleSeat seatType(SeatType seatType) {
    
    this.seatType = seatType;
    return this;
  }

   /**
   * Get seatType
   * @return seatType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeatType getSeatType() {
    return seatType;
  }


  public void setSeatType(SeatType seatType) {
    this.seatType = seatType;
  }


  public ShowScheduleSeat seatStatus(SeatStatus seatStatus) {
    
    this.seatStatus = seatStatus;
    return this;
  }

   /**
   * Get seatStatus
   * @return seatStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeatStatus getSeatStatus() {
    return seatStatus;
  }


  public void setSeatStatus(SeatStatus seatStatus) {
    this.seatStatus = seatStatus;
  }


  public ShowScheduleSeat ticketPrintStatus(TicketPrintStatus ticketPrintStatus) {
    
    this.ticketPrintStatus = ticketPrintStatus;
    return this;
  }

   /**
   * Get ticketPrintStatus
   * @return ticketPrintStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TicketPrintStatus getTicketPrintStatus() {
    return ticketPrintStatus;
  }


  public void setTicketPrintStatus(TicketPrintStatus ticketPrintStatus) {
    this.ticketPrintStatus = ticketPrintStatus;
  }


  public ShowScheduleSeat modifyUserId(String modifyUserId) {
    
    this.modifyUserId = modifyUserId;
    return this;
  }

   /**
   * Get modifyUserId
   * @return modifyUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifyUserId() {
    return modifyUserId;
  }


  public void setModifyUserId(String modifyUserId) {
    this.modifyUserId = modifyUserId;
  }


  public ShowScheduleSeat orderItem(OrderItem orderItem) {
    
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


  public ShowScheduleSeat templateSectionSeat(SeatingTemplateSectionSeat templateSectionSeat) {
    
    this.templateSectionSeat = templateSectionSeat;
    return this;
  }

   /**
   * Get templateSectionSeat
   * @return templateSectionSeat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeatingTemplateSectionSeat getTemplateSectionSeat() {
    return templateSectionSeat;
  }


  public void setTemplateSectionSeat(SeatingTemplateSectionSeat templateSectionSeat) {
    this.templateSectionSeat = templateSectionSeat;
  }


  public ShowScheduleSeat seatCode(String seatCode) {
    
    this.seatCode = seatCode;
    return this;
  }

   /**
   * Get seatCode
   * @return seatCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeatCode() {
    return seatCode;
  }


  public void setSeatCode(String seatCode) {
    this.seatCode = seatCode;
  }


  public ShowScheduleSeat wheelchairOrMotorized(Boolean wheelchairOrMotorized) {
    
    this.wheelchairOrMotorized = wheelchairOrMotorized;
    return this;
  }

   /**
   * Get wheelchairOrMotorized
   * @return wheelchairOrMotorized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWheelchairOrMotorized() {
    return wheelchairOrMotorized;
  }


  public void setWheelchairOrMotorized(Boolean wheelchairOrMotorized) {
    this.wheelchairOrMotorized = wheelchairOrMotorized;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShowScheduleSeat showScheduleSeat = (ShowScheduleSeat) o;
    return Objects.equals(this.eventCode, showScheduleSeat.eventCode) &&
        Objects.equals(this.showDateTime, showScheduleSeat.showDateTime) &&
        Objects.equals(this.sectionCode, showScheduleSeat.sectionCode) &&
        Objects.equals(this.rowNumber, showScheduleSeat.rowNumber) &&
        Objects.equals(this.seatNumber, showScheduleSeat.seatNumber) &&
        Objects.equals(this.priceGrade, showScheduleSeat.priceGrade) &&
        Objects.equals(this.seatingTemplateCode, showScheduleSeat.seatingTemplateCode) &&
        Objects.equals(this.orderNumber, showScheduleSeat.orderNumber) &&
        Objects.equals(this.itemNumber, showScheduleSeat.itemNumber) &&
        Objects.equals(this.bookingPhase, showScheduleSeat.bookingPhase) &&
        Objects.equals(this.sssDateTime, showScheduleSeat.sssDateTime) &&
        Objects.equals(this.seatType, showScheduleSeat.seatType) &&
        Objects.equals(this.seatStatus, showScheduleSeat.seatStatus) &&
        Objects.equals(this.ticketPrintStatus, showScheduleSeat.ticketPrintStatus) &&
        Objects.equals(this.modifyUserId, showScheduleSeat.modifyUserId) &&
        Objects.equals(this.orderItem, showScheduleSeat.orderItem) &&
        Objects.equals(this.templateSectionSeat, showScheduleSeat.templateSectionSeat) &&
        Objects.equals(this.seatCode, showScheduleSeat.seatCode) &&
        Objects.equals(this.wheelchairOrMotorized, showScheduleSeat.wheelchairOrMotorized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCode, showDateTime, sectionCode, rowNumber, seatNumber, priceGrade, seatingTemplateCode, orderNumber, itemNumber, bookingPhase, sssDateTime, seatType, seatStatus, ticketPrintStatus, modifyUserId, orderItem, templateSectionSeat, seatCode, wheelchairOrMotorized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowScheduleSeat {\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    showDateTime: ").append(toIndentedString(showDateTime)).append("\n");
    sb.append("    sectionCode: ").append(toIndentedString(sectionCode)).append("\n");
    sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
    sb.append("    priceGrade: ").append(toIndentedString(priceGrade)).append("\n");
    sb.append("    seatingTemplateCode: ").append(toIndentedString(seatingTemplateCode)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    bookingPhase: ").append(toIndentedString(bookingPhase)).append("\n");
    sb.append("    sssDateTime: ").append(toIndentedString(sssDateTime)).append("\n");
    sb.append("    seatType: ").append(toIndentedString(seatType)).append("\n");
    sb.append("    seatStatus: ").append(toIndentedString(seatStatus)).append("\n");
    sb.append("    ticketPrintStatus: ").append(toIndentedString(ticketPrintStatus)).append("\n");
    sb.append("    modifyUserId: ").append(toIndentedString(modifyUserId)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
    sb.append("    templateSectionSeat: ").append(toIndentedString(templateSectionSeat)).append("\n");
    sb.append("    seatCode: ").append(toIndentedString(seatCode)).append("\n");
    sb.append("    wheelchairOrMotorized: ").append(toIndentedString(wheelchairOrMotorized)).append("\n");
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
    openapiFields.add("eventCode");
    openapiFields.add("showDateTime");
    openapiFields.add("sectionCode");
    openapiFields.add("rowNumber");
    openapiFields.add("seatNumber");
    openapiFields.add("priceGrade");
    openapiFields.add("seatingTemplateCode");
    openapiFields.add("orderNumber");
    openapiFields.add("itemNumber");
    openapiFields.add("bookingPhase");
    openapiFields.add("sssDateTime");
    openapiFields.add("seatType");
    openapiFields.add("seatStatus");
    openapiFields.add("ticketPrintStatus");
    openapiFields.add("modifyUserId");
    openapiFields.add("orderItem");
    openapiFields.add("templateSectionSeat");
    openapiFields.add("seatCode");
    openapiFields.add("wheelchairOrMotorized");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eventCode");
    openapiRequiredFields.add("showDateTime");
    openapiRequiredFields.add("sectionCode");
    openapiRequiredFields.add("rowNumber");
    openapiRequiredFields.add("priceGrade");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShowScheduleSeat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShowScheduleSeat.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShowScheduleSeat is not found in the empty JSON string", ShowScheduleSeat.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShowScheduleSeat.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShowScheduleSeat` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShowScheduleSeat.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("eventCode") != null && !jsonObj.get("eventCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventCode").toString()));
      }
      if (jsonObj.get("sectionCode") != null && !jsonObj.get("sectionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionCode").toString()));
      }
      if (jsonObj.get("rowNumber") != null && !jsonObj.get("rowNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rowNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rowNumber").toString()));
      }
      if (jsonObj.get("priceGrade") != null && !jsonObj.get("priceGrade").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceGrade` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceGrade").toString()));
      }
      if (jsonObj.get("seatingTemplateCode") != null && !jsonObj.get("seatingTemplateCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatingTemplateCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatingTemplateCode").toString()));
      }
      if (jsonObj.get("modifyUserId") != null && !jsonObj.get("modifyUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifyUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifyUserId").toString()));
      }
      // validate the optional field `orderItem`
      if (jsonObj.getAsJsonObject("orderItem") != null) {
        OrderItem.validateJsonObject(jsonObj.getAsJsonObject("orderItem"));
      }
      // validate the optional field `templateSectionSeat`
      if (jsonObj.getAsJsonObject("templateSectionSeat") != null) {
        SeatingTemplateSectionSeat.validateJsonObject(jsonObj.getAsJsonObject("templateSectionSeat"));
      }
      if (jsonObj.get("seatCode") != null && !jsonObj.get("seatCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShowScheduleSeat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShowScheduleSeat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShowScheduleSeat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShowScheduleSeat.class));

       return (TypeAdapter<T>) new TypeAdapter<ShowScheduleSeat>() {
           @Override
           public void write(JsonWriter out, ShowScheduleSeat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShowScheduleSeat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShowScheduleSeat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShowScheduleSeat
  * @throws IOException if the JSON string is invalid with respect to ShowScheduleSeat
  */
  public static ShowScheduleSeat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShowScheduleSeat.class);
  }

 /**
  * Convert an instance of ShowScheduleSeat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

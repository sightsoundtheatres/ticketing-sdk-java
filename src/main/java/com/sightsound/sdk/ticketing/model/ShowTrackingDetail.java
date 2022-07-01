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
import com.sightsound.sdk.ticketing.model.Event;
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
 * ShowTrackingDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T17:37:03.061697Z[Etc/UTC]")
public class ShowTrackingDetail {
  public static final String SERIALIZED_NAME_REPORT_DATE = "reportDate";
  @SerializedName(SERIALIZED_NAME_REPORT_DATE)
  private OffsetDateTime reportDate;

  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_SHOW_DATE_TIME = "showDateTime";
  @SerializedName(SERIALIZED_NAME_SHOW_DATE_TIME)
  private OffsetDateTime showDateTime;

  public static final String SERIALIZED_NAME_EVENT_DESCRIPTION = "eventDescription";
  @SerializedName(SERIALIZED_NAME_EVENT_DESCRIPTION)
  private String eventDescription;

  public static final String SERIALIZED_NAME_SEAT_CAPACITY = "seatCapacity";
  @SerializedName(SERIALIZED_NAME_SEAT_CAPACITY)
  private Long seatCapacity;

  public static final String SERIALIZED_NAME_SEATS_BOOKED = "seatsBooked";
  @SerializedName(SERIALIZED_NAME_SEATS_BOOKED)
  private Long seatsBooked;

  public static final String SERIALIZED_NAME_COMPS = "comps";
  @SerializedName(SERIALIZED_NAME_COMPS)
  private Long comps;

  public static final String SERIALIZED_NAME_SPECIAL_COMPS = "specialComps";
  @SerializedName(SERIALIZED_NAME_SPECIAL_COMPS)
  private Long specialComps;

  public static final String SERIALIZED_NAME_ESCORTS = "escorts";
  @SerializedName(SERIALIZED_NAME_ESCORTS)
  private Long escorts;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private Event event;

  public ShowTrackingDetail() { 
  }

  public ShowTrackingDetail reportDate(OffsetDateTime reportDate) {
    
    this.reportDate = reportDate;
    return this;
  }

   /**
   * Get reportDate
   * @return reportDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getReportDate() {
    return reportDate;
  }


  public void setReportDate(OffsetDateTime reportDate) {
    this.reportDate = reportDate;
  }


  public ShowTrackingDetail eventCode(String eventCode) {
    
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


  public ShowTrackingDetail showDateTime(OffsetDateTime showDateTime) {
    
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


  public ShowTrackingDetail eventDescription(String eventDescription) {
    
    this.eventDescription = eventDescription;
    return this;
  }

   /**
   * Get eventDescription
   * @return eventDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventDescription() {
    return eventDescription;
  }


  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }


  public ShowTrackingDetail seatCapacity(Long seatCapacity) {
    
    this.seatCapacity = seatCapacity;
    return this;
  }

   /**
   * Get seatCapacity
   * @return seatCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSeatCapacity() {
    return seatCapacity;
  }


  public void setSeatCapacity(Long seatCapacity) {
    this.seatCapacity = seatCapacity;
  }


  public ShowTrackingDetail seatsBooked(Long seatsBooked) {
    
    this.seatsBooked = seatsBooked;
    return this;
  }

   /**
   * Get seatsBooked
   * @return seatsBooked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSeatsBooked() {
    return seatsBooked;
  }


  public void setSeatsBooked(Long seatsBooked) {
    this.seatsBooked = seatsBooked;
  }


  public ShowTrackingDetail comps(Long comps) {
    
    this.comps = comps;
    return this;
  }

   /**
   * Get comps
   * @return comps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getComps() {
    return comps;
  }


  public void setComps(Long comps) {
    this.comps = comps;
  }


  public ShowTrackingDetail specialComps(Long specialComps) {
    
    this.specialComps = specialComps;
    return this;
  }

   /**
   * Get specialComps
   * @return specialComps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSpecialComps() {
    return specialComps;
  }


  public void setSpecialComps(Long specialComps) {
    this.specialComps = specialComps;
  }


  public ShowTrackingDetail escorts(Long escorts) {
    
    this.escorts = escorts;
    return this;
  }

   /**
   * Get escorts
   * @return escorts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getEscorts() {
    return escorts;
  }


  public void setEscorts(Long escorts) {
    this.escorts = escorts;
  }


  public ShowTrackingDetail event(Event event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Event getEvent() {
    return event;
  }


  public void setEvent(Event event) {
    this.event = event;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShowTrackingDetail showTrackingDetail = (ShowTrackingDetail) o;
    return Objects.equals(this.reportDate, showTrackingDetail.reportDate) &&
        Objects.equals(this.eventCode, showTrackingDetail.eventCode) &&
        Objects.equals(this.showDateTime, showTrackingDetail.showDateTime) &&
        Objects.equals(this.eventDescription, showTrackingDetail.eventDescription) &&
        Objects.equals(this.seatCapacity, showTrackingDetail.seatCapacity) &&
        Objects.equals(this.seatsBooked, showTrackingDetail.seatsBooked) &&
        Objects.equals(this.comps, showTrackingDetail.comps) &&
        Objects.equals(this.specialComps, showTrackingDetail.specialComps) &&
        Objects.equals(this.escorts, showTrackingDetail.escorts) &&
        Objects.equals(this.event, showTrackingDetail.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDate, eventCode, showDateTime, eventDescription, seatCapacity, seatsBooked, comps, specialComps, escorts, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowTrackingDetail {\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    showDateTime: ").append(toIndentedString(showDateTime)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    seatCapacity: ").append(toIndentedString(seatCapacity)).append("\n");
    sb.append("    seatsBooked: ").append(toIndentedString(seatsBooked)).append("\n");
    sb.append("    comps: ").append(toIndentedString(comps)).append("\n");
    sb.append("    specialComps: ").append(toIndentedString(specialComps)).append("\n");
    sb.append("    escorts: ").append(toIndentedString(escorts)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
    openapiFields.add("reportDate");
    openapiFields.add("eventCode");
    openapiFields.add("showDateTime");
    openapiFields.add("eventDescription");
    openapiFields.add("seatCapacity");
    openapiFields.add("seatsBooked");
    openapiFields.add("comps");
    openapiFields.add("specialComps");
    openapiFields.add("escorts");
    openapiFields.add("event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("reportDate");
    openapiRequiredFields.add("eventCode");
    openapiRequiredFields.add("showDateTime");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShowTrackingDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShowTrackingDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShowTrackingDetail is not found in the empty JSON string", ShowTrackingDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShowTrackingDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShowTrackingDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShowTrackingDetail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("eventCode") != null && !jsonObj.get("eventCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventCode").toString()));
      }
      if (jsonObj.get("eventDescription") != null && !jsonObj.get("eventDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventDescription").toString()));
      }
      // validate the optional field `event`
      if (jsonObj.getAsJsonObject("event") != null) {
        Event.validateJsonObject(jsonObj.getAsJsonObject("event"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShowTrackingDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShowTrackingDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShowTrackingDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShowTrackingDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ShowTrackingDetail>() {
           @Override
           public void write(JsonWriter out, ShowTrackingDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShowTrackingDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShowTrackingDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShowTrackingDetail
  * @throws IOException if the JSON string is invalid with respect to ShowTrackingDetail
  */
  public static ShowTrackingDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShowTrackingDetail.class);
  }

 /**
  * Convert an instance of ShowTrackingDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


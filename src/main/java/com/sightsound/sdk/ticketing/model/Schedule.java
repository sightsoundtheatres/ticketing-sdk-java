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
 * Schedule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T20:01:03.115466Z[Etc/UTC]")
public class Schedule {
  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_DATE_TIME = "dateTime";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  private OffsetDateTime dateTime;

  public static final String SERIALIZED_NAME_SEATS_AVAILABLE = "seatsAvailable";
  @SerializedName(SERIALIZED_NAME_SEATS_AVAILABLE)
  private Integer seatsAvailable;

  public static final String SERIALIZED_NAME_SEATS_BOOKED = "seatsBooked";
  @SerializedName(SERIALIZED_NAME_SEATS_BOOKED)
  private Integer seatsBooked;

  public static final String SERIALIZED_NAME_SEATS_BLOCKED = "seatsBlocked";
  @SerializedName(SERIALIZED_NAME_SEATS_BLOCKED)
  private Integer seatsBlocked;

  public static final String SERIALIZED_NAME_SEATS_OVERFLOW = "seatsOverflow";
  @SerializedName(SERIALIZED_NAME_SEATS_OVERFLOW)
  private Integer seatsOverflow;

  public static final String SERIALIZED_NAME_SEATING_TEMPLATE_CODE = "seatingTemplateCode";
  @SerializedName(SERIALIZED_NAME_SEATING_TEMPLATE_CODE)
  private String seatingTemplateCode;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_PRICE_LIST_CODE = "priceListCode";
  @SerializedName(SERIALIZED_NAME_PRICE_LIST_CODE)
  private String priceListCode;

  public static final String SERIALIZED_NAME_SEATS_OVERBOOKED = "seatsOverbooked";
  @SerializedName(SERIALIZED_NAME_SEATS_OVERBOOKED)
  private Integer seatsOverbooked;

  public static final String SERIALIZED_NAME_ALLOW_QTO_DISCOUNT = "allowQtoDiscount";
  @SerializedName(SERIALIZED_NAME_ALLOW_QTO_DISCOUNT)
  private Boolean allowQtoDiscount;

  public static final String SERIALIZED_NAME_CUST_TANDC_PROFILE_CODE = "custTandcProfileCode";
  @SerializedName(SERIALIZED_NAME_CUST_TANDC_PROFILE_CODE)
  private String custTandcProfileCode;

  public static final String SERIALIZED_NAME_HELD_COUNT = "heldCount";
  @SerializedName(SERIALIZED_NAME_HELD_COUNT)
  private Integer heldCount;

  public static final String SERIALIZED_NAME_WHEEL_CHAIR_COUNT = "wheelChairCount";
  @SerializedName(SERIALIZED_NAME_WHEEL_CHAIR_COUNT)
  private Integer wheelChairCount;

  public static final String SERIALIZED_NAME_BLACKOUT_UPDATE_SENT = "blackoutUpdateSent";
  @SerializedName(SERIALIZED_NAME_BLACKOUT_UPDATE_SENT)
  private Boolean blackoutUpdateSent;

  public static final String SERIALIZED_NAME_BLACKOUT_UPDATE_DATETIME = "blackoutUpdateDatetime";
  @SerializedName(SERIALIZED_NAME_BLACKOUT_UPDATE_DATETIME)
  private OffsetDateTime blackoutUpdateDatetime;

  public static final String SERIALIZED_NAME_TRA_DEV_COUNT = "traDevCount";
  @SerializedName(SERIALIZED_NAME_TRA_DEV_COUNT)
  private Integer traDevCount;

  public static final String SERIALIZED_NAME_HD_SHOOT = "hdShoot";
  @SerializedName(SERIALIZED_NAME_HD_SHOOT)
  private Boolean hdShoot;

  public static final String SERIALIZED_NAME_CMS_ANNOUNCEMENT = "cmsAnnouncement";
  @SerializedName(SERIALIZED_NAME_CMS_ANNOUNCEMENT)
  private String cmsAnnouncement;

  public static final String SERIALIZED_NAME_DENY_APPLICATION_CODE = "denyApplicationCode";
  @SerializedName(SERIALIZED_NAME_DENY_APPLICATION_CODE)
  private String denyApplicationCode;

  public static final String SERIALIZED_NAME_CANCELLED = "cancelled";
  @SerializedName(SERIALIZED_NAME_CANCELLED)
  private Boolean cancelled;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private Event event;

  public Schedule() { 
  }

  public Schedule eventCode(String eventCode) {
    
    this.eventCode = eventCode;
    return this;
  }

   /**
   * Get eventCode
   * @return eventCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventCode() {
    return eventCode;
  }


  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }


  public Schedule dateTime(OffsetDateTime dateTime) {
    
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateTime() {
    return dateTime;
  }


  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  public Schedule seatsAvailable(Integer seatsAvailable) {
    
    this.seatsAvailable = seatsAvailable;
    return this;
  }

   /**
   * Get seatsAvailable
   * @return seatsAvailable
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeatsAvailable() {
    return seatsAvailable;
  }


  public void setSeatsAvailable(Integer seatsAvailable) {
    this.seatsAvailable = seatsAvailable;
  }


  public Schedule seatsBooked(Integer seatsBooked) {
    
    this.seatsBooked = seatsBooked;
    return this;
  }

   /**
   * Get seatsBooked
   * @return seatsBooked
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeatsBooked() {
    return seatsBooked;
  }


  public void setSeatsBooked(Integer seatsBooked) {
    this.seatsBooked = seatsBooked;
  }


  public Schedule seatsBlocked(Integer seatsBlocked) {
    
    this.seatsBlocked = seatsBlocked;
    return this;
  }

   /**
   * Get seatsBlocked
   * @return seatsBlocked
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeatsBlocked() {
    return seatsBlocked;
  }


  public void setSeatsBlocked(Integer seatsBlocked) {
    this.seatsBlocked = seatsBlocked;
  }


  public Schedule seatsOverflow(Integer seatsOverflow) {
    
    this.seatsOverflow = seatsOverflow;
    return this;
  }

   /**
   * Get seatsOverflow
   * @return seatsOverflow
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeatsOverflow() {
    return seatsOverflow;
  }


  public void setSeatsOverflow(Integer seatsOverflow) {
    this.seatsOverflow = seatsOverflow;
  }


  public Schedule seatingTemplateCode(String seatingTemplateCode) {
    
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


  public Schedule active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Schedule priceListCode(String priceListCode) {
    
    this.priceListCode = priceListCode;
    return this;
  }

   /**
   * Get priceListCode
   * @return priceListCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPriceListCode() {
    return priceListCode;
  }


  public void setPriceListCode(String priceListCode) {
    this.priceListCode = priceListCode;
  }


  public Schedule seatsOverbooked(Integer seatsOverbooked) {
    
    this.seatsOverbooked = seatsOverbooked;
    return this;
  }

   /**
   * Get seatsOverbooked
   * @return seatsOverbooked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeatsOverbooked() {
    return seatsOverbooked;
  }


  public void setSeatsOverbooked(Integer seatsOverbooked) {
    this.seatsOverbooked = seatsOverbooked;
  }


  public Schedule allowQtoDiscount(Boolean allowQtoDiscount) {
    
    this.allowQtoDiscount = allowQtoDiscount;
    return this;
  }

   /**
   * Get allowQtoDiscount
   * @return allowQtoDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowQtoDiscount() {
    return allowQtoDiscount;
  }


  public void setAllowQtoDiscount(Boolean allowQtoDiscount) {
    this.allowQtoDiscount = allowQtoDiscount;
  }


  public Schedule custTandcProfileCode(String custTandcProfileCode) {
    
    this.custTandcProfileCode = custTandcProfileCode;
    return this;
  }

   /**
   * Get custTandcProfileCode
   * @return custTandcProfileCode
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustTandcProfileCode() {
    return custTandcProfileCode;
  }


  public void setCustTandcProfileCode(String custTandcProfileCode) {
    this.custTandcProfileCode = custTandcProfileCode;
  }


  public Schedule heldCount(Integer heldCount) {
    
    this.heldCount = heldCount;
    return this;
  }

   /**
   * Get heldCount
   * @return heldCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeldCount() {
    return heldCount;
  }


  public void setHeldCount(Integer heldCount) {
    this.heldCount = heldCount;
  }


  public Schedule wheelChairCount(Integer wheelChairCount) {
    
    this.wheelChairCount = wheelChairCount;
    return this;
  }

   /**
   * Get wheelChairCount
   * @return wheelChairCount
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWheelChairCount() {
    return wheelChairCount;
  }


  public void setWheelChairCount(Integer wheelChairCount) {
    this.wheelChairCount = wheelChairCount;
  }


  public Schedule blackoutUpdateSent(Boolean blackoutUpdateSent) {
    
    this.blackoutUpdateSent = blackoutUpdateSent;
    return this;
  }

   /**
   * Get blackoutUpdateSent
   * @return blackoutUpdateSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBlackoutUpdateSent() {
    return blackoutUpdateSent;
  }


  public void setBlackoutUpdateSent(Boolean blackoutUpdateSent) {
    this.blackoutUpdateSent = blackoutUpdateSent;
  }


  public Schedule blackoutUpdateDatetime(OffsetDateTime blackoutUpdateDatetime) {
    
    this.blackoutUpdateDatetime = blackoutUpdateDatetime;
    return this;
  }

   /**
   * Get blackoutUpdateDatetime
   * @return blackoutUpdateDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getBlackoutUpdateDatetime() {
    return blackoutUpdateDatetime;
  }


  public void setBlackoutUpdateDatetime(OffsetDateTime blackoutUpdateDatetime) {
    this.blackoutUpdateDatetime = blackoutUpdateDatetime;
  }


  public Schedule traDevCount(Integer traDevCount) {
    
    this.traDevCount = traDevCount;
    return this;
  }

   /**
   * Get traDevCount
   * @return traDevCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTraDevCount() {
    return traDevCount;
  }


  public void setTraDevCount(Integer traDevCount) {
    this.traDevCount = traDevCount;
  }


  public Schedule hdShoot(Boolean hdShoot) {
    
    this.hdShoot = hdShoot;
    return this;
  }

   /**
   * Get hdShoot
   * @return hdShoot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHdShoot() {
    return hdShoot;
  }


  public void setHdShoot(Boolean hdShoot) {
    this.hdShoot = hdShoot;
  }


  public Schedule cmsAnnouncement(String cmsAnnouncement) {
    
    this.cmsAnnouncement = cmsAnnouncement;
    return this;
  }

   /**
   * Get cmsAnnouncement
   * @return cmsAnnouncement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCmsAnnouncement() {
    return cmsAnnouncement;
  }


  public void setCmsAnnouncement(String cmsAnnouncement) {
    this.cmsAnnouncement = cmsAnnouncement;
  }


  public Schedule denyApplicationCode(String denyApplicationCode) {
    
    this.denyApplicationCode = denyApplicationCode;
    return this;
  }

   /**
   * Get denyApplicationCode
   * @return denyApplicationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDenyApplicationCode() {
    return denyApplicationCode;
  }


  public void setDenyApplicationCode(String denyApplicationCode) {
    this.denyApplicationCode = denyApplicationCode;
  }


  public Schedule cancelled(Boolean cancelled) {
    
    this.cancelled = cancelled;
    return this;
  }

   /**
   * Get cancelled
   * @return cancelled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCancelled() {
    return cancelled;
  }


  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }


  public Schedule event(Event event) {
    
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
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.eventCode, schedule.eventCode) &&
        Objects.equals(this.dateTime, schedule.dateTime) &&
        Objects.equals(this.seatsAvailable, schedule.seatsAvailable) &&
        Objects.equals(this.seatsBooked, schedule.seatsBooked) &&
        Objects.equals(this.seatsBlocked, schedule.seatsBlocked) &&
        Objects.equals(this.seatsOverflow, schedule.seatsOverflow) &&
        Objects.equals(this.seatingTemplateCode, schedule.seatingTemplateCode) &&
        Objects.equals(this.active, schedule.active) &&
        Objects.equals(this.priceListCode, schedule.priceListCode) &&
        Objects.equals(this.seatsOverbooked, schedule.seatsOverbooked) &&
        Objects.equals(this.allowQtoDiscount, schedule.allowQtoDiscount) &&
        Objects.equals(this.custTandcProfileCode, schedule.custTandcProfileCode) &&
        Objects.equals(this.heldCount, schedule.heldCount) &&
        Objects.equals(this.wheelChairCount, schedule.wheelChairCount) &&
        Objects.equals(this.blackoutUpdateSent, schedule.blackoutUpdateSent) &&
        Objects.equals(this.blackoutUpdateDatetime, schedule.blackoutUpdateDatetime) &&
        Objects.equals(this.traDevCount, schedule.traDevCount) &&
        Objects.equals(this.hdShoot, schedule.hdShoot) &&
        Objects.equals(this.cmsAnnouncement, schedule.cmsAnnouncement) &&
        Objects.equals(this.denyApplicationCode, schedule.denyApplicationCode) &&
        Objects.equals(this.cancelled, schedule.cancelled) &&
        Objects.equals(this.event, schedule.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCode, dateTime, seatsAvailable, seatsBooked, seatsBlocked, seatsOverflow, seatingTemplateCode, active, priceListCode, seatsOverbooked, allowQtoDiscount, custTandcProfileCode, heldCount, wheelChairCount, blackoutUpdateSent, blackoutUpdateDatetime, traDevCount, hdShoot, cmsAnnouncement, denyApplicationCode, cancelled, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    seatsAvailable: ").append(toIndentedString(seatsAvailable)).append("\n");
    sb.append("    seatsBooked: ").append(toIndentedString(seatsBooked)).append("\n");
    sb.append("    seatsBlocked: ").append(toIndentedString(seatsBlocked)).append("\n");
    sb.append("    seatsOverflow: ").append(toIndentedString(seatsOverflow)).append("\n");
    sb.append("    seatingTemplateCode: ").append(toIndentedString(seatingTemplateCode)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    priceListCode: ").append(toIndentedString(priceListCode)).append("\n");
    sb.append("    seatsOverbooked: ").append(toIndentedString(seatsOverbooked)).append("\n");
    sb.append("    allowQtoDiscount: ").append(toIndentedString(allowQtoDiscount)).append("\n");
    sb.append("    custTandcProfileCode: ").append(toIndentedString(custTandcProfileCode)).append("\n");
    sb.append("    heldCount: ").append(toIndentedString(heldCount)).append("\n");
    sb.append("    wheelChairCount: ").append(toIndentedString(wheelChairCount)).append("\n");
    sb.append("    blackoutUpdateSent: ").append(toIndentedString(blackoutUpdateSent)).append("\n");
    sb.append("    blackoutUpdateDatetime: ").append(toIndentedString(blackoutUpdateDatetime)).append("\n");
    sb.append("    traDevCount: ").append(toIndentedString(traDevCount)).append("\n");
    sb.append("    hdShoot: ").append(toIndentedString(hdShoot)).append("\n");
    sb.append("    cmsAnnouncement: ").append(toIndentedString(cmsAnnouncement)).append("\n");
    sb.append("    denyApplicationCode: ").append(toIndentedString(denyApplicationCode)).append("\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
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
    openapiFields.add("eventCode");
    openapiFields.add("dateTime");
    openapiFields.add("seatsAvailable");
    openapiFields.add("seatsBooked");
    openapiFields.add("seatsBlocked");
    openapiFields.add("seatsOverflow");
    openapiFields.add("seatingTemplateCode");
    openapiFields.add("active");
    openapiFields.add("priceListCode");
    openapiFields.add("seatsOverbooked");
    openapiFields.add("allowQtoDiscount");
    openapiFields.add("custTandcProfileCode");
    openapiFields.add("heldCount");
    openapiFields.add("wheelChairCount");
    openapiFields.add("blackoutUpdateSent");
    openapiFields.add("blackoutUpdateDatetime");
    openapiFields.add("traDevCount");
    openapiFields.add("hdShoot");
    openapiFields.add("cmsAnnouncement");
    openapiFields.add("denyApplicationCode");
    openapiFields.add("cancelled");
    openapiFields.add("event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Schedule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Schedule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedule is not found in the empty JSON string", Schedule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Schedule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("eventCode") != null && !jsonObj.get("eventCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventCode").toString()));
      }
      if (jsonObj.get("seatingTemplateCode") != null && !jsonObj.get("seatingTemplateCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatingTemplateCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatingTemplateCode").toString()));
      }
      if (jsonObj.get("priceListCode") != null && !jsonObj.get("priceListCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceListCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceListCode").toString()));
      }
      if (jsonObj.get("custTandcProfileCode") != null && !jsonObj.get("custTandcProfileCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custTandcProfileCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custTandcProfileCode").toString()));
      }
      if (jsonObj.get("cmsAnnouncement") != null && !jsonObj.get("cmsAnnouncement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cmsAnnouncement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cmsAnnouncement").toString()));
      }
      if (jsonObj.get("denyApplicationCode") != null && !jsonObj.get("denyApplicationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `denyApplicationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("denyApplicationCode").toString()));
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
       if (!Schedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedule.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedule>() {
           @Override
           public void write(JsonWriter out, Schedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedule
  * @throws IOException if the JSON string is invalid with respect to Schedule
  */
  public static Schedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedule.class);
  }

 /**
  * Convert an instance of Schedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


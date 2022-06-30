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


package org.openapitools.client.model;

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
import java.time.OffsetDateTime;
import org.openapitools.client.model.Event;

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
 * ShowBudget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T15:31:17.450182-05:00[America/Chicago]")
public class ShowBudget {
  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_SEATS_BUDGETED = "seatsBudgeted";
  @SerializedName(SERIALIZED_NAME_SEATS_BUDGETED)
  private Long seatsBudgeted;

  public static final String SERIALIZED_NAME_AVG_TICKET_PRICE = "avgTicketPrice";
  @SerializedName(SERIALIZED_NAME_AVG_TICKET_PRICE)
  private BigDecimal avgTicketPrice;

  public static final String SERIALIZED_NAME_PRODUCTION_CODE = "productionCode";
  @SerializedName(SERIALIZED_NAME_PRODUCTION_CODE)
  private String productionCode;

  public static final String SERIALIZED_NAME_SEASON = "season";
  @SerializedName(SERIALIZED_NAME_SEASON)
  private Integer season;

  public static final String SERIALIZED_NAME_BEGIN_TRACKING_DATE = "beginTrackingDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_TRACKING_DATE)
  private OffsetDateTime beginTrackingDate;

  public static final String SERIALIZED_NAME_YTD_TARGET = "ytdTarget";
  @SerializedName(SERIALIZED_NAME_YTD_TARGET)
  private Long ytdTarget;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private Event event;

  public ShowBudget() { 
  }

  public ShowBudget eventCode(String eventCode) {
    
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


  public ShowBudget seatsBudgeted(Long seatsBudgeted) {
    
    this.seatsBudgeted = seatsBudgeted;
    return this;
  }

   /**
   * Get seatsBudgeted
   * @return seatsBudgeted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSeatsBudgeted() {
    return seatsBudgeted;
  }


  public void setSeatsBudgeted(Long seatsBudgeted) {
    this.seatsBudgeted = seatsBudgeted;
  }


  public ShowBudget avgTicketPrice(BigDecimal avgTicketPrice) {
    
    this.avgTicketPrice = avgTicketPrice;
    return this;
  }

   /**
   * Get avgTicketPrice
   * @return avgTicketPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAvgTicketPrice() {
    return avgTicketPrice;
  }


  public void setAvgTicketPrice(BigDecimal avgTicketPrice) {
    this.avgTicketPrice = avgTicketPrice;
  }


  public ShowBudget productionCode(String productionCode) {
    
    this.productionCode = productionCode;
    return this;
  }

   /**
   * Get productionCode
   * @return productionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductionCode() {
    return productionCode;
  }


  public void setProductionCode(String productionCode) {
    this.productionCode = productionCode;
  }


  public ShowBudget season(Integer season) {
    
    this.season = season;
    return this;
  }

   /**
   * Get season
   * @return season
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeason() {
    return season;
  }


  public void setSeason(Integer season) {
    this.season = season;
  }


  public ShowBudget beginTrackingDate(OffsetDateTime beginTrackingDate) {
    
    this.beginTrackingDate = beginTrackingDate;
    return this;
  }

   /**
   * Get beginTrackingDate
   * @return beginTrackingDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getBeginTrackingDate() {
    return beginTrackingDate;
  }


  public void setBeginTrackingDate(OffsetDateTime beginTrackingDate) {
    this.beginTrackingDate = beginTrackingDate;
  }


  public ShowBudget ytdTarget(Long ytdTarget) {
    
    this.ytdTarget = ytdTarget;
    return this;
  }

   /**
   * Get ytdTarget
   * @return ytdTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getYtdTarget() {
    return ytdTarget;
  }


  public void setYtdTarget(Long ytdTarget) {
    this.ytdTarget = ytdTarget;
  }


  public ShowBudget event(Event event) {
    
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
    ShowBudget showBudget = (ShowBudget) o;
    return Objects.equals(this.eventCode, showBudget.eventCode) &&
        Objects.equals(this.seatsBudgeted, showBudget.seatsBudgeted) &&
        Objects.equals(this.avgTicketPrice, showBudget.avgTicketPrice) &&
        Objects.equals(this.productionCode, showBudget.productionCode) &&
        Objects.equals(this.season, showBudget.season) &&
        Objects.equals(this.beginTrackingDate, showBudget.beginTrackingDate) &&
        Objects.equals(this.ytdTarget, showBudget.ytdTarget) &&
        Objects.equals(this.event, showBudget.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCode, seatsBudgeted, avgTicketPrice, productionCode, season, beginTrackingDate, ytdTarget, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowBudget {\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    seatsBudgeted: ").append(toIndentedString(seatsBudgeted)).append("\n");
    sb.append("    avgTicketPrice: ").append(toIndentedString(avgTicketPrice)).append("\n");
    sb.append("    productionCode: ").append(toIndentedString(productionCode)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    beginTrackingDate: ").append(toIndentedString(beginTrackingDate)).append("\n");
    sb.append("    ytdTarget: ").append(toIndentedString(ytdTarget)).append("\n");
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
    openapiFields.add("seatsBudgeted");
    openapiFields.add("avgTicketPrice");
    openapiFields.add("productionCode");
    openapiFields.add("season");
    openapiFields.add("beginTrackingDate");
    openapiFields.add("ytdTarget");
    openapiFields.add("event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eventCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShowBudget
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShowBudget.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShowBudget is not found in the empty JSON string", ShowBudget.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShowBudget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShowBudget` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShowBudget.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("eventCode") != null && !jsonObj.get("eventCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventCode").toString()));
      }
      if (jsonObj.get("productionCode") != null && !jsonObj.get("productionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productionCode").toString()));
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
       if (!ShowBudget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShowBudget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShowBudget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShowBudget.class));

       return (TypeAdapter<T>) new TypeAdapter<ShowBudget>() {
           @Override
           public void write(JsonWriter out, ShowBudget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShowBudget read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShowBudget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShowBudget
  * @throws IOException if the JSON string is invalid with respect to ShowBudget
  */
  public static ShowBudget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShowBudget.class);
  }

 /**
  * Convert an instance of ShowBudget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


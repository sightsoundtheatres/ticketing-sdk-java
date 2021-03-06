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
import com.sightsound.sdk.ticketing.model.SeatingProfile;
import com.sightsound.sdk.ticketing.model.SeatingTemplateSection;
import com.sightsound.sdk.ticketing.model.SeatingTemplateSectionSeat;
import com.sightsound.sdk.ticketing.model.TheaterLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * SeatingTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T20:01:03.115466Z[Etc/UTC]")
public class SeatingTemplate {
  public static final String SERIALIZED_NAME_SEATING_TEMPLATE_CODE = "seatingTemplateCode";
  @SerializedName(SERIALIZED_NAME_SEATING_TEMPLATE_CODE)
  private String seatingTemplateCode;

  public static final String SERIALIZED_NAME_SEATING_CAPACITY = "seatingCapacity";
  @SerializedName(SERIALIZED_NAME_SEATING_CAPACITY)
  private Integer seatingCapacity;

  public static final String SERIALIZED_NAME_SEATING_TEMPLATE_DESCRIPTION = "seatingTemplateDescription";
  @SerializedName(SERIALIZED_NAME_SEATING_TEMPLATE_DESCRIPTION)
  private String seatingTemplateDescription;

  public static final String SERIALIZED_NAME_OVERFLOW = "overflow";
  @SerializedName(SERIALIZED_NAME_OVERFLOW)
  private Boolean overflow;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private TheaterLocation locationCode;

  public static final String SERIALIZED_NAME_MASTER_TEMPLATE_Y_N = "masterTemplateYN";
  @SerializedName(SERIALIZED_NAME_MASTER_TEMPLATE_Y_N)
  private String masterTemplateYN;

  public static final String SERIALIZED_NAME_OVERFLOW_MAX = "overflowMax";
  @SerializedName(SERIALIZED_NAME_OVERFLOW_MAX)
  private Integer overflowMax;

  public static final String SERIALIZED_NAME_SEAT_PROFILE_CODE = "seatProfileCode";
  @SerializedName(SERIALIZED_NAME_SEAT_PROFILE_CODE)
  private String seatProfileCode;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_WHEELCHAIR_CAPACITY = "wheelchairCapacity";
  @SerializedName(SERIALIZED_NAME_WHEELCHAIR_CAPACITY)
  private Integer wheelchairCapacity;

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<SeatingTemplateSection> sections = null;

  public static final String SERIALIZED_NAME_SEATS = "seats";
  @SerializedName(SERIALIZED_NAME_SEATS)
  private List<SeatingTemplateSectionSeat> seats = null;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private SeatingProfile profile;

  public static final String SERIALIZED_NAME_XCOORD_CENTER = "xcoordCenter";
  @SerializedName(SERIALIZED_NAME_XCOORD_CENTER)
  private Integer xcoordCenter;

  public static final String SERIALIZED_NAME_YCOORD_BEST_ROW = "ycoordBestRow";
  @SerializedName(SERIALIZED_NAME_YCOORD_BEST_ROW)
  private Integer ycoordBestRow;

  public SeatingTemplate() { 
  }

  public SeatingTemplate seatingTemplateCode(String seatingTemplateCode) {
    
    this.seatingTemplateCode = seatingTemplateCode;
    return this;
  }

   /**
   * Get seatingTemplateCode
   * @return seatingTemplateCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSeatingTemplateCode() {
    return seatingTemplateCode;
  }


  public void setSeatingTemplateCode(String seatingTemplateCode) {
    this.seatingTemplateCode = seatingTemplateCode;
  }


  public SeatingTemplate seatingCapacity(Integer seatingCapacity) {
    
    this.seatingCapacity = seatingCapacity;
    return this;
  }

   /**
   * Get seatingCapacity
   * @return seatingCapacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSeatingCapacity() {
    return seatingCapacity;
  }


  public void setSeatingCapacity(Integer seatingCapacity) {
    this.seatingCapacity = seatingCapacity;
  }


  public SeatingTemplate seatingTemplateDescription(String seatingTemplateDescription) {
    
    this.seatingTemplateDescription = seatingTemplateDescription;
    return this;
  }

   /**
   * Get seatingTemplateDescription
   * @return seatingTemplateDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeatingTemplateDescription() {
    return seatingTemplateDescription;
  }


  public void setSeatingTemplateDescription(String seatingTemplateDescription) {
    this.seatingTemplateDescription = seatingTemplateDescription;
  }


  public SeatingTemplate overflow(Boolean overflow) {
    
    this.overflow = overflow;
    return this;
  }

   /**
   * Get overflow
   * @return overflow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getOverflow() {
    return overflow;
  }


  public void setOverflow(Boolean overflow) {
    this.overflow = overflow;
  }


  public SeatingTemplate locationCode(TheaterLocation locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Get locationCode
   * @return locationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TheaterLocation getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(TheaterLocation locationCode) {
    this.locationCode = locationCode;
  }


  public SeatingTemplate masterTemplateYN(String masterTemplateYN) {
    
    this.masterTemplateYN = masterTemplateYN;
    return this;
  }

   /**
   * Get masterTemplateYN
   * @return masterTemplateYN
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMasterTemplateYN() {
    return masterTemplateYN;
  }


  public void setMasterTemplateYN(String masterTemplateYN) {
    this.masterTemplateYN = masterTemplateYN;
  }


  public SeatingTemplate overflowMax(Integer overflowMax) {
    
    this.overflowMax = overflowMax;
    return this;
  }

   /**
   * Get overflowMax
   * @return overflowMax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getOverflowMax() {
    return overflowMax;
  }


  public void setOverflowMax(Integer overflowMax) {
    this.overflowMax = overflowMax;
  }


  public SeatingTemplate seatProfileCode(String seatProfileCode) {
    
    this.seatProfileCode = seatProfileCode;
    return this;
  }

   /**
   * Get seatProfileCode
   * @return seatProfileCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeatProfileCode() {
    return seatProfileCode;
  }


  public void setSeatProfileCode(String seatProfileCode) {
    this.seatProfileCode = seatProfileCode;
  }


  public SeatingTemplate active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public SeatingTemplate wheelchairCapacity(Integer wheelchairCapacity) {
    
    this.wheelchairCapacity = wheelchairCapacity;
    return this;
  }

   /**
   * Get wheelchairCapacity
   * @return wheelchairCapacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getWheelchairCapacity() {
    return wheelchairCapacity;
  }


  public void setWheelchairCapacity(Integer wheelchairCapacity) {
    this.wheelchairCapacity = wheelchairCapacity;
  }


  public SeatingTemplate sections(List<SeatingTemplateSection> sections) {
    
    this.sections = sections;
    return this;
  }

  public SeatingTemplate addSectionsItem(SeatingTemplateSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SeatingTemplateSection> getSections() {
    return sections;
  }


  public void setSections(List<SeatingTemplateSection> sections) {
    this.sections = sections;
  }


  public SeatingTemplate seats(List<SeatingTemplateSectionSeat> seats) {
    
    this.seats = seats;
    return this;
  }

  public SeatingTemplate addSeatsItem(SeatingTemplateSectionSeat seatsItem) {
    if (this.seats == null) {
      this.seats = new ArrayList<>();
    }
    this.seats.add(seatsItem);
    return this;
  }

   /**
   * Get seats
   * @return seats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SeatingTemplateSectionSeat> getSeats() {
    return seats;
  }


  public void setSeats(List<SeatingTemplateSectionSeat> seats) {
    this.seats = seats;
  }


  public SeatingTemplate profile(SeatingProfile profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeatingProfile getProfile() {
    return profile;
  }


  public void setProfile(SeatingProfile profile) {
    this.profile = profile;
  }


  public SeatingTemplate xcoordCenter(Integer xcoordCenter) {
    
    this.xcoordCenter = xcoordCenter;
    return this;
  }

   /**
   * Get xcoordCenter
   * @return xcoordCenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getXcoordCenter() {
    return xcoordCenter;
  }


  public void setXcoordCenter(Integer xcoordCenter) {
    this.xcoordCenter = xcoordCenter;
  }


  public SeatingTemplate ycoordBestRow(Integer ycoordBestRow) {
    
    this.ycoordBestRow = ycoordBestRow;
    return this;
  }

   /**
   * Get ycoordBestRow
   * @return ycoordBestRow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getYcoordBestRow() {
    return ycoordBestRow;
  }


  public void setYcoordBestRow(Integer ycoordBestRow) {
    this.ycoordBestRow = ycoordBestRow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatingTemplate seatingTemplate = (SeatingTemplate) o;
    return Objects.equals(this.seatingTemplateCode, seatingTemplate.seatingTemplateCode) &&
        Objects.equals(this.seatingCapacity, seatingTemplate.seatingCapacity) &&
        Objects.equals(this.seatingTemplateDescription, seatingTemplate.seatingTemplateDescription) &&
        Objects.equals(this.overflow, seatingTemplate.overflow) &&
        Objects.equals(this.locationCode, seatingTemplate.locationCode) &&
        Objects.equals(this.masterTemplateYN, seatingTemplate.masterTemplateYN) &&
        Objects.equals(this.overflowMax, seatingTemplate.overflowMax) &&
        Objects.equals(this.seatProfileCode, seatingTemplate.seatProfileCode) &&
        Objects.equals(this.active, seatingTemplate.active) &&
        Objects.equals(this.wheelchairCapacity, seatingTemplate.wheelchairCapacity) &&
        Objects.equals(this.sections, seatingTemplate.sections) &&
        Objects.equals(this.seats, seatingTemplate.seats) &&
        Objects.equals(this.profile, seatingTemplate.profile) &&
        Objects.equals(this.xcoordCenter, seatingTemplate.xcoordCenter) &&
        Objects.equals(this.ycoordBestRow, seatingTemplate.ycoordBestRow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatingTemplateCode, seatingCapacity, seatingTemplateDescription, overflow, locationCode, masterTemplateYN, overflowMax, seatProfileCode, active, wheelchairCapacity, sections, seats, profile, xcoordCenter, ycoordBestRow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatingTemplate {\n");
    sb.append("    seatingTemplateCode: ").append(toIndentedString(seatingTemplateCode)).append("\n");
    sb.append("    seatingCapacity: ").append(toIndentedString(seatingCapacity)).append("\n");
    sb.append("    seatingTemplateDescription: ").append(toIndentedString(seatingTemplateDescription)).append("\n");
    sb.append("    overflow: ").append(toIndentedString(overflow)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    masterTemplateYN: ").append(toIndentedString(masterTemplateYN)).append("\n");
    sb.append("    overflowMax: ").append(toIndentedString(overflowMax)).append("\n");
    sb.append("    seatProfileCode: ").append(toIndentedString(seatProfileCode)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    wheelchairCapacity: ").append(toIndentedString(wheelchairCapacity)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    xcoordCenter: ").append(toIndentedString(xcoordCenter)).append("\n");
    sb.append("    ycoordBestRow: ").append(toIndentedString(ycoordBestRow)).append("\n");
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
    openapiFields.add("seatingTemplateCode");
    openapiFields.add("seatingCapacity");
    openapiFields.add("seatingTemplateDescription");
    openapiFields.add("overflow");
    openapiFields.add("locationCode");
    openapiFields.add("masterTemplateYN");
    openapiFields.add("overflowMax");
    openapiFields.add("seatProfileCode");
    openapiFields.add("active");
    openapiFields.add("wheelchairCapacity");
    openapiFields.add("sections");
    openapiFields.add("seats");
    openapiFields.add("profile");
    openapiFields.add("xcoordCenter");
    openapiFields.add("ycoordBestRow");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("seatingTemplateCode");
    openapiRequiredFields.add("seatingCapacity");
    openapiRequiredFields.add("overflow");
    openapiRequiredFields.add("locationCode");
    openapiRequiredFields.add("masterTemplateYN");
    openapiRequiredFields.add("overflowMax");
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("wheelchairCapacity");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SeatingTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SeatingTemplate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SeatingTemplate is not found in the empty JSON string", SeatingTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SeatingTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SeatingTemplate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SeatingTemplate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("seatingTemplateCode") != null && !jsonObj.get("seatingTemplateCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatingTemplateCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatingTemplateCode").toString()));
      }
      if (jsonObj.get("seatingTemplateDescription") != null && !jsonObj.get("seatingTemplateDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatingTemplateDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatingTemplateDescription").toString()));
      }
      if (jsonObj.get("masterTemplateYN") != null && !jsonObj.get("masterTemplateYN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masterTemplateYN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masterTemplateYN").toString()));
      }
      if (jsonObj.get("seatProfileCode") != null && !jsonObj.get("seatProfileCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatProfileCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatProfileCode").toString()));
      }
      JsonArray jsonArraysections = jsonObj.getAsJsonArray("sections");
      if (jsonArraysections != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sections").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sections` to be an array in the JSON string but got `%s`", jsonObj.get("sections").toString()));
        }

        // validate the optional field `sections` (array)
        for (int i = 0; i < jsonArraysections.size(); i++) {
          SeatingTemplateSection.validateJsonObject(jsonArraysections.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayseats = jsonObj.getAsJsonArray("seats");
      if (jsonArrayseats != null) {
        // ensure the json data is an array
        if (!jsonObj.get("seats").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `seats` to be an array in the JSON string but got `%s`", jsonObj.get("seats").toString()));
        }

        // validate the optional field `seats` (array)
        for (int i = 0; i < jsonArrayseats.size(); i++) {
          SeatingTemplateSectionSeat.validateJsonObject(jsonArrayseats.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `profile`
      if (jsonObj.getAsJsonObject("profile") != null) {
        SeatingProfile.validateJsonObject(jsonObj.getAsJsonObject("profile"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SeatingTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SeatingTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SeatingTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SeatingTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<SeatingTemplate>() {
           @Override
           public void write(JsonWriter out, SeatingTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SeatingTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SeatingTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SeatingTemplate
  * @throws IOException if the JSON string is invalid with respect to SeatingTemplate
  */
  public static SeatingTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SeatingTemplate.class);
  }

 /**
  * Convert an instance of SeatingTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


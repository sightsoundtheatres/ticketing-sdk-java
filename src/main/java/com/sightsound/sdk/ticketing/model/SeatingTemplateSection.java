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
import com.sightsound.sdk.ticketing.model.SeatingTemplate;
import com.sightsound.sdk.ticketing.model.SeatingTemplateSectionSeat;
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
 * SeatingTemplateSection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T08:27:57.763723-05:00[America/Chicago]")
public class SeatingTemplateSection {
  public static final String SERIALIZED_NAME_SECTION_CODE = "sectionCode";
  @SerializedName(SERIALIZED_NAME_SECTION_CODE)
  private String sectionCode;

  public static final String SERIALIZED_NAME_SECTION_DESCRIPTION = "sectionDescription";
  @SerializedName(SERIALIZED_NAME_SECTION_DESCRIPTION)
  private String sectionDescription;

  public static final String SERIALIZED_NAME_SECTION_CAPACITY = "sectionCapacity";
  @SerializedName(SERIALIZED_NAME_SECTION_CAPACITY)
  private Integer sectionCapacity;

  public static final String SERIALIZED_NAME_SEATING_TEMPLATE_CODE = "seatingTemplateCode";
  @SerializedName(SERIALIZED_NAME_SEATING_TEMPLATE_CODE)
  private String seatingTemplateCode;

  public static final String SERIALIZED_NAME_SECTION_LEVEL = "sectionLevel";
  @SerializedName(SERIALIZED_NAME_SECTION_LEVEL)
  private String sectionLevel;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_SECTION_LEVEL_DESCRIPTION = "sectionLevelDescription";
  @SerializedName(SERIALIZED_NAME_SECTION_LEVEL_DESCRIPTION)
  private String sectionLevelDescription;

  public static final String SERIALIZED_NAME_SECTION_STAIR_NOTE = "sectionStairNote";
  @SerializedName(SERIALIZED_NAME_SECTION_STAIR_NOTE)
  private String sectionStairNote;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private SeatingTemplate template;

  public static final String SERIALIZED_NAME_SEATS = "seats";
  @SerializedName(SERIALIZED_NAME_SEATS)
  private List<SeatingTemplateSectionSeat> seats = null;

  public static final String SERIALIZED_NAME_XCOORDINATE = "xcoordinate";
  @SerializedName(SERIALIZED_NAME_XCOORDINATE)
  private Integer xcoordinate;

  public static final String SERIALIZED_NAME_YCOORDINATE = "ycoordinate";
  @SerializedName(SERIALIZED_NAME_YCOORDINATE)
  private Integer ycoordinate;

  public SeatingTemplateSection() { 
  }

  public SeatingTemplateSection sectionCode(String sectionCode) {
    
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


  public SeatingTemplateSection sectionDescription(String sectionDescription) {
    
    this.sectionDescription = sectionDescription;
    return this;
  }

   /**
   * Get sectionDescription
   * @return sectionDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSectionDescription() {
    return sectionDescription;
  }


  public void setSectionDescription(String sectionDescription) {
    this.sectionDescription = sectionDescription;
  }


  public SeatingTemplateSection sectionCapacity(Integer sectionCapacity) {
    
    this.sectionCapacity = sectionCapacity;
    return this;
  }

   /**
   * Get sectionCapacity
   * @return sectionCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSectionCapacity() {
    return sectionCapacity;
  }


  public void setSectionCapacity(Integer sectionCapacity) {
    this.sectionCapacity = sectionCapacity;
  }


  public SeatingTemplateSection seatingTemplateCode(String seatingTemplateCode) {
    
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


  public SeatingTemplateSection sectionLevel(String sectionLevel) {
    
    this.sectionLevel = sectionLevel;
    return this;
  }

   /**
   * Get sectionLevel
   * @return sectionLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSectionLevel() {
    return sectionLevel;
  }


  public void setSectionLevel(String sectionLevel) {
    this.sectionLevel = sectionLevel;
  }


  public SeatingTemplateSection width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  public SeatingTemplateSection height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public SeatingTemplateSection sectionLevelDescription(String sectionLevelDescription) {
    
    this.sectionLevelDescription = sectionLevelDescription;
    return this;
  }

   /**
   * Get sectionLevelDescription
   * @return sectionLevelDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSectionLevelDescription() {
    return sectionLevelDescription;
  }


  public void setSectionLevelDescription(String sectionLevelDescription) {
    this.sectionLevelDescription = sectionLevelDescription;
  }


  public SeatingTemplateSection sectionStairNote(String sectionStairNote) {
    
    this.sectionStairNote = sectionStairNote;
    return this;
  }

   /**
   * Get sectionStairNote
   * @return sectionStairNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSectionStairNote() {
    return sectionStairNote;
  }


  public void setSectionStairNote(String sectionStairNote) {
    this.sectionStairNote = sectionStairNote;
  }


  public SeatingTemplateSection template(SeatingTemplate template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeatingTemplate getTemplate() {
    return template;
  }


  public void setTemplate(SeatingTemplate template) {
    this.template = template;
  }


  public SeatingTemplateSection seats(List<SeatingTemplateSectionSeat> seats) {
    
    this.seats = seats;
    return this;
  }

  public SeatingTemplateSection addSeatsItem(SeatingTemplateSectionSeat seatsItem) {
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


  public SeatingTemplateSection xcoordinate(Integer xcoordinate) {
    
    this.xcoordinate = xcoordinate;
    return this;
  }

   /**
   * Get xcoordinate
   * @return xcoordinate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getXcoordinate() {
    return xcoordinate;
  }


  public void setXcoordinate(Integer xcoordinate) {
    this.xcoordinate = xcoordinate;
  }


  public SeatingTemplateSection ycoordinate(Integer ycoordinate) {
    
    this.ycoordinate = ycoordinate;
    return this;
  }

   /**
   * Get ycoordinate
   * @return ycoordinate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getYcoordinate() {
    return ycoordinate;
  }


  public void setYcoordinate(Integer ycoordinate) {
    this.ycoordinate = ycoordinate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatingTemplateSection seatingTemplateSection = (SeatingTemplateSection) o;
    return Objects.equals(this.sectionCode, seatingTemplateSection.sectionCode) &&
        Objects.equals(this.sectionDescription, seatingTemplateSection.sectionDescription) &&
        Objects.equals(this.sectionCapacity, seatingTemplateSection.sectionCapacity) &&
        Objects.equals(this.seatingTemplateCode, seatingTemplateSection.seatingTemplateCode) &&
        Objects.equals(this.sectionLevel, seatingTemplateSection.sectionLevel) &&
        Objects.equals(this.width, seatingTemplateSection.width) &&
        Objects.equals(this.height, seatingTemplateSection.height) &&
        Objects.equals(this.sectionLevelDescription, seatingTemplateSection.sectionLevelDescription) &&
        Objects.equals(this.sectionStairNote, seatingTemplateSection.sectionStairNote) &&
        Objects.equals(this.template, seatingTemplateSection.template) &&
        Objects.equals(this.seats, seatingTemplateSection.seats) &&
        Objects.equals(this.xcoordinate, seatingTemplateSection.xcoordinate) &&
        Objects.equals(this.ycoordinate, seatingTemplateSection.ycoordinate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionCode, sectionDescription, sectionCapacity, seatingTemplateCode, sectionLevel, width, height, sectionLevelDescription, sectionStairNote, template, seats, xcoordinate, ycoordinate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatingTemplateSection {\n");
    sb.append("    sectionCode: ").append(toIndentedString(sectionCode)).append("\n");
    sb.append("    sectionDescription: ").append(toIndentedString(sectionDescription)).append("\n");
    sb.append("    sectionCapacity: ").append(toIndentedString(sectionCapacity)).append("\n");
    sb.append("    seatingTemplateCode: ").append(toIndentedString(seatingTemplateCode)).append("\n");
    sb.append("    sectionLevel: ").append(toIndentedString(sectionLevel)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    sectionLevelDescription: ").append(toIndentedString(sectionLevelDescription)).append("\n");
    sb.append("    sectionStairNote: ").append(toIndentedString(sectionStairNote)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
    sb.append("    xcoordinate: ").append(toIndentedString(xcoordinate)).append("\n");
    sb.append("    ycoordinate: ").append(toIndentedString(ycoordinate)).append("\n");
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
    openapiFields.add("sectionCode");
    openapiFields.add("sectionDescription");
    openapiFields.add("sectionCapacity");
    openapiFields.add("seatingTemplateCode");
    openapiFields.add("sectionLevel");
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("sectionLevelDescription");
    openapiFields.add("sectionStairNote");
    openapiFields.add("template");
    openapiFields.add("seats");
    openapiFields.add("xcoordinate");
    openapiFields.add("ycoordinate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sectionCode");
    openapiRequiredFields.add("seatingTemplateCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SeatingTemplateSection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SeatingTemplateSection.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SeatingTemplateSection is not found in the empty JSON string", SeatingTemplateSection.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SeatingTemplateSection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SeatingTemplateSection` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SeatingTemplateSection.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("sectionCode") != null && !jsonObj.get("sectionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionCode").toString()));
      }
      if (jsonObj.get("sectionDescription") != null && !jsonObj.get("sectionDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionDescription").toString()));
      }
      if (jsonObj.get("seatingTemplateCode") != null && !jsonObj.get("seatingTemplateCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seatingTemplateCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seatingTemplateCode").toString()));
      }
      if (jsonObj.get("sectionLevel") != null && !jsonObj.get("sectionLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionLevel").toString()));
      }
      if (jsonObj.get("sectionLevelDescription") != null && !jsonObj.get("sectionLevelDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionLevelDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionLevelDescription").toString()));
      }
      if (jsonObj.get("sectionStairNote") != null && !jsonObj.get("sectionStairNote").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionStairNote` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionStairNote").toString()));
      }
      // validate the optional field `template`
      if (jsonObj.getAsJsonObject("template") != null) {
        SeatingTemplate.validateJsonObject(jsonObj.getAsJsonObject("template"));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SeatingTemplateSection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SeatingTemplateSection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SeatingTemplateSection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SeatingTemplateSection.class));

       return (TypeAdapter<T>) new TypeAdapter<SeatingTemplateSection>() {
           @Override
           public void write(JsonWriter out, SeatingTemplateSection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SeatingTemplateSection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SeatingTemplateSection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SeatingTemplateSection
  * @throws IOException if the JSON string is invalid with respect to SeatingTemplateSection
  */
  public static SeatingTemplateSection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SeatingTemplateSection.class);
  }

 /**
  * Convert an instance of SeatingTemplateSection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


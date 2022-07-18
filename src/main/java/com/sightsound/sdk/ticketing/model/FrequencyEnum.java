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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets FrequencyEnum
 */
@JsonAdapter(FrequencyEnum.Adapter.class)
public enum FrequencyEnum {
  
  ADHOC("adhoc"),
  
  DAILY("daily"),
  
  WEEKLY("weekly"),
  
  BIWEEKLY("biWeekly"),
  
  MONTHLY("monthly"),
  
  QUARTERLY("quarterly"),
  
  HALFYEARLY("halfYearly"),
  
  YEARLY("yearly");

  private String value;

  FrequencyEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FrequencyEnum fromValue(String value) {
    for (FrequencyEnum b : FrequencyEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FrequencyEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FrequencyEnum.fromValue(value);
    }
  }
}


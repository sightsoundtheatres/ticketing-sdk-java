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
 * Gets or Sets TheaterEntrance
 */
@JsonAdapter(TheaterEntrance.Adapter.class)
public enum TheaterEntrance {
  
  BR_ECS("BR_ECS"),
  
  BR_EBS("BR_EBS"),
  
  BR_EB("BR_EB"),
  
  BR_EC("BR_EC"),
  
  SS_EB("SS_EB"),
  
  SS_EC("SS_EC"),
  
  SS_EAS("SS_EAS"),
  
  SS_EDS("SS_EDS");

  private String value;

  TheaterEntrance(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TheaterEntrance fromValue(String value) {
    for (TheaterEntrance b : TheaterEntrance.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TheaterEntrance> {
    @Override
    public void write(final JsonWriter jsonWriter, final TheaterEntrance enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TheaterEntrance read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TheaterEntrance.fromValue(value);
    }
  }
}


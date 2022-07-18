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
 * Gets or Sets TaxCategoryEnum
 */
@JsonAdapter(TaxCategoryEnum.Adapter.class)
public enum TaxCategoryEnum {
  
  HIGH("High"),
  
  LOW("Low"),
  
  NONE("None"),
  
  ZERO("Zero");

  private String value;

  TaxCategoryEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaxCategoryEnum fromValue(String value) {
    for (TaxCategoryEnum b : TaxCategoryEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TaxCategoryEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaxCategoryEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaxCategoryEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaxCategoryEnum.fromValue(value);
    }
  }
}


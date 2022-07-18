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
 * Gets or Sets PasswordChangeIndicatorEnum
 */
@JsonAdapter(PasswordChangeIndicatorEnum.Adapter.class)
public enum PasswordChangeIndicatorEnum {
  
  NOTAPPLICABLE("notApplicable"),
  
  THISTRANSACTION("thisTransaction"),
  
  LESSTHAN30DAYS("lessThan30Days"),
  
  FROM30TO60DAYS("from30To60Days"),
  
  MORETHAN60DAYS("moreThan60Days");

  private String value;

  PasswordChangeIndicatorEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PasswordChangeIndicatorEnum fromValue(String value) {
    for (PasswordChangeIndicatorEnum b : PasswordChangeIndicatorEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PasswordChangeIndicatorEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final PasswordChangeIndicatorEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PasswordChangeIndicatorEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PasswordChangeIndicatorEnum.fromValue(value);
    }
  }
}


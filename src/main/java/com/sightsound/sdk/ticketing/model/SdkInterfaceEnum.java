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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets SdkInterfaceEnum
 */
@JsonAdapter(SdkInterfaceEnum.Adapter.class)
public enum SdkInterfaceEnum {
  
  HTML("html"),
  
  NATIVE("native"),
  
  BOTH("both");

  private String value;

  SdkInterfaceEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SdkInterfaceEnum fromValue(String value) {
    for (SdkInterfaceEnum b : SdkInterfaceEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SdkInterfaceEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final SdkInterfaceEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SdkInterfaceEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SdkInterfaceEnum.fromValue(value);
    }
  }
}


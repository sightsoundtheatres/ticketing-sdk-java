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
 * Gets or Sets CompCodeType
 */
@JsonAdapter(CompCodeType.Adapter.class)
public enum CompCodeType {
  
  ADMINISTRATION("ADMINISTRATION"),
  
  MARKETING("MARKETING"),
  
  SALES("SALES"),
  
  SALESREP("SALESREP"),
  
  PARTNERSHIP("PARTNERSHIP"),
  
  CHARITY("CHARITY"),
  
  MANUAL("MANUAL"),
  
  LEADERSHIP("LEADERSHIP");

  private String value;

  CompCodeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CompCodeType fromValue(String value) {
    for (CompCodeType b : CompCodeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CompCodeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CompCodeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CompCodeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CompCodeType.fromValue(value);
    }
  }
}


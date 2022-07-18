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
 * Gets or Sets DirectoryResponseEnum
 */
@JsonAdapter(DirectoryResponseEnum.Adapter.class)
public enum DirectoryResponseEnum {
  
  Y("Y"),
  
  U("U"),
  
  N("N"),
  
  A("A"),
  
  C("C"),
  
  D("D"),
  
  R("R"),
  
  I("I"),
  
  E("E");

  private String value;

  DirectoryResponseEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DirectoryResponseEnum fromValue(String value) {
    for (DirectoryResponseEnum b : DirectoryResponseEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DirectoryResponseEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final DirectoryResponseEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DirectoryResponseEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DirectoryResponseEnum.fromValue(value);
    }
  }
}


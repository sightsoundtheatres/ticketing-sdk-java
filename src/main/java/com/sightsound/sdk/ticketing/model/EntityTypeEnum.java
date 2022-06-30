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
 * Gets or Sets EntityTypeEnum
 */
@JsonAdapter(EntityTypeEnum.Adapter.class)
public enum EntityTypeEnum {
  
  NATURALPERSON("NaturalPerson"),
  
  COMPANYNAME("CompanyName");

  private String value;

  EntityTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EntityTypeEnum fromValue(String value) {
    for (EntityTypeEnum b : EntityTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EntityTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EntityTypeEnum.fromValue(value);
    }
  }
}

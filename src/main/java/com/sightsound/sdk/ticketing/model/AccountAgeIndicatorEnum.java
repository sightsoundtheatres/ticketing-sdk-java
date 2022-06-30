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
 * Gets or Sets AccountAgeIndicatorEnum
 */
@JsonAdapter(AccountAgeIndicatorEnum.Adapter.class)
public enum AccountAgeIndicatorEnum {
  
  NOTAPPLICABLE("notApplicable"),
  
  THISTRANSACTION("thisTransaction"),
  
  LESSTHAN30DAYS("lessThan30Days"),
  
  FROM30TO60DAYS("from30To60Days"),
  
  MORETHAN60DAYS("moreThan60Days");

  private String value;

  AccountAgeIndicatorEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountAgeIndicatorEnum fromValue(String value) {
    for (AccountAgeIndicatorEnum b : AccountAgeIndicatorEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AccountAgeIndicatorEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountAgeIndicatorEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountAgeIndicatorEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountAgeIndicatorEnum.fromValue(value);
    }
  }
}


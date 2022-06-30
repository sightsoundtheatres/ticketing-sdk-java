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
 * Gets or Sets ChallengeIndicatorEnum
 */
@JsonAdapter(ChallengeIndicatorEnum.Adapter.class)
public enum ChallengeIndicatorEnum {
  
  NOPREFERENCE("noPreference"),
  
  REQUESTCHALLENGE("requestChallenge"),
  
  REQUESTNOCHALLENGE("requestNoChallenge"),
  
  REQUESTCHALLENGEASMANDATE("requestChallengeAsMandate");

  private String value;

  ChallengeIndicatorEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChallengeIndicatorEnum fromValue(String value) {
    for (ChallengeIndicatorEnum b : ChallengeIndicatorEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ChallengeIndicatorEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChallengeIndicatorEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChallengeIndicatorEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChallengeIndicatorEnum.fromValue(value);
    }
  }
}


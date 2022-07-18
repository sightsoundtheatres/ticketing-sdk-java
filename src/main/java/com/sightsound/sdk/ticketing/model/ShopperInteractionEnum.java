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
 * Gets or Sets ShopperInteractionEnum
 */
@JsonAdapter(ShopperInteractionEnum.Adapter.class)
public enum ShopperInteractionEnum {
  
  ECOMMERCE("Ecommerce"),
  
  CONTAUTH("ContAuth"),
  
  MOTO("Moto"),
  
  POS("POS");

  private String value;

  ShopperInteractionEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShopperInteractionEnum fromValue(String value) {
    for (ShopperInteractionEnum b : ShopperInteractionEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ShopperInteractionEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShopperInteractionEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShopperInteractionEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ShopperInteractionEnum.fromValue(value);
    }
  }
}


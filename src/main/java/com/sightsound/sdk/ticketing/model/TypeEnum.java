/*
 * Helios
 * Sight & Sound Theatres Ticketing API
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
 * Gets or Sets TypeEnum
 */
@JsonAdapter(TypeEnum.Adapter.class)
public enum TypeEnum {
  
  BALANCEACCOUNT("BalanceAccount"),
  
  COMMISSION("Commission"),
  
  DEFAULT("Default"),
  
  MARKETPLACE("MarketPlace"),
  
  PAYMENTFEE("PaymentFee"),
  
  VAT("VAT"),
  
  VERIFICATION("Verification");

  private String value;

  TypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TypeEnum fromValue(String value) {
    for (TypeEnum b : TypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TypeEnum.fromValue(value);
    }
  }
}


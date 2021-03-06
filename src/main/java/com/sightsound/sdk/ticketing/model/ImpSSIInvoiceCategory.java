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
 * Gets or Sets ImpSSIInvoiceCategory
 */
@JsonAdapter(ImpSSIInvoiceCategory.Adapter.class)
public enum ImpSSIInvoiceCategory {
  
  CONSUMER("CONSUMER"),
  
  EMPLOYEE("EMPLOYEE"),
  
  PARTNER("PARTNER"),
  
  GROUP("GROUP"),
  
  LEVEL1("LEVEL1"),
  
  LEVEL2("LEVEL2"),
  
  LEVEL3("LEVEL3"),
  
  TIER1("TIER1"),
  
  TIER2("TIER2"),
  
  POSTPAY("POSTPAY"),
  
  POS("POS"),
  
  MOA("MOA");

  private String value;

  ImpSSIInvoiceCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImpSSIInvoiceCategory fromValue(String value) {
    for (ImpSSIInvoiceCategory b : ImpSSIInvoiceCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ImpSSIInvoiceCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImpSSIInvoiceCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImpSSIInvoiceCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ImpSSIInvoiceCategory.fromValue(value);
    }
  }
}


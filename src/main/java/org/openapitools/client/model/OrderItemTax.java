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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OrderItem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sightsound.sdk.ticketing.JSON;

/**
 * OrderItemTax
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T15:31:17.450182-05:00[America/Chicago]")
public class OrderItemTax {
  public static final String SERIALIZED_NAME_ORDER_ITEM = "orderItem";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM)
  private OrderItem orderItem;

  /**
   * Gets or Sets taxType
   */
  @JsonAdapter(TaxTypeEnum.Adapter.class)
  public enum TaxTypeEnum {
    EN("EN"),
    
    XC("XC"),
    
    SC("SC"),
    
    SP("SP"),
    
    SH("SH"),
    
    PT("PT");

    private String value;

    TaxTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxTypeEnum fromValue(String value) {
      for (TaxTypeEnum b : TaxTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TaxTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TaxTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TAX_TYPE = "taxType";
  @SerializedName(SERIALIZED_NAME_TAX_TYPE)
  private TaxTypeEnum taxType;

  /**
   * Gets or Sets jurisdiction
   */
  @JsonAdapter(JurisdictionEnum.Adapter.class)
  public enum JurisdictionEnum {
    ET("ET"),
    
    MO("MO"),
    
    PA("PA");

    private String value;

    JurisdictionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JurisdictionEnum fromValue(String value) {
      for (JurisdictionEnum b : JurisdictionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<JurisdictionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JurisdictionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JurisdictionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return JurisdictionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_JURISDICTION = "jurisdiction";
  @SerializedName(SERIALIZED_NAME_JURISDICTION)
  private JurisdictionEnum jurisdiction;

  public static final String SERIALIZED_NAME_TAX_DESCRIPTION = "taxDescription";
  @SerializedName(SERIALIZED_NAME_TAX_DESCRIPTION)
  private String taxDescription;

  public static final String SERIALIZED_NAME_TAX_PERCENT = "taxPercent";
  @SerializedName(SERIALIZED_NAME_TAX_PERCENT)
  private BigDecimal taxPercent;

  public static final String SERIALIZED_NAME_TAX_PERCENT_AMOUNT = "taxPercentAmount";
  @SerializedName(SERIALIZED_NAME_TAX_PERCENT_AMOUNT)
  private BigDecimal taxPercentAmount;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private BigDecimal tax;

  public static final String SERIALIZED_NAME_ENTRY_DATE = "entryDate";
  @SerializedName(SERIALIZED_NAME_ENTRY_DATE)
  private OffsetDateTime entryDate;

  public OrderItemTax() { 
  }

  public OrderItemTax orderItem(OrderItem orderItem) {
    
    this.orderItem = orderItem;
    return this;
  }

   /**
   * Get orderItem
   * @return orderItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderItem getOrderItem() {
    return orderItem;
  }


  public void setOrderItem(OrderItem orderItem) {
    this.orderItem = orderItem;
  }


  public OrderItemTax taxType(TaxTypeEnum taxType) {
    
    this.taxType = taxType;
    return this;
  }

   /**
   * Get taxType
   * @return taxType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaxTypeEnum getTaxType() {
    return taxType;
  }


  public void setTaxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
  }


  public OrderItemTax jurisdiction(JurisdictionEnum jurisdiction) {
    
    this.jurisdiction = jurisdiction;
    return this;
  }

   /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JurisdictionEnum getJurisdiction() {
    return jurisdiction;
  }


  public void setJurisdiction(JurisdictionEnum jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  public OrderItemTax taxDescription(String taxDescription) {
    
    this.taxDescription = taxDescription;
    return this;
  }

   /**
   * Get taxDescription
   * @return taxDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaxDescription() {
    return taxDescription;
  }


  public void setTaxDescription(String taxDescription) {
    this.taxDescription = taxDescription;
  }


  public OrderItemTax taxPercent(BigDecimal taxPercent) {
    
    this.taxPercent = taxPercent;
    return this;
  }

   /**
   * Get taxPercent
   * @return taxPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTaxPercent() {
    return taxPercent;
  }


  public void setTaxPercent(BigDecimal taxPercent) {
    this.taxPercent = taxPercent;
  }


  public OrderItemTax taxPercentAmount(BigDecimal taxPercentAmount) {
    
    this.taxPercentAmount = taxPercentAmount;
    return this;
  }

   /**
   * Get taxPercentAmount
   * @return taxPercentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTaxPercentAmount() {
    return taxPercentAmount;
  }


  public void setTaxPercentAmount(BigDecimal taxPercentAmount) {
    this.taxPercentAmount = taxPercentAmount;
  }


  public OrderItemTax tax(BigDecimal tax) {
    
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTax() {
    return tax;
  }


  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }


  public OrderItemTax entryDate(OffsetDateTime entryDate) {
    
    this.entryDate = entryDate;
    return this;
  }

   /**
   * Get entryDate
   * @return entryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEntryDate() {
    return entryDate;
  }


  public void setEntryDate(OffsetDateTime entryDate) {
    this.entryDate = entryDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemTax orderItemTax = (OrderItemTax) o;
    return Objects.equals(this.orderItem, orderItemTax.orderItem) &&
        Objects.equals(this.taxType, orderItemTax.taxType) &&
        Objects.equals(this.jurisdiction, orderItemTax.jurisdiction) &&
        Objects.equals(this.taxDescription, orderItemTax.taxDescription) &&
        Objects.equals(this.taxPercent, orderItemTax.taxPercent) &&
        Objects.equals(this.taxPercentAmount, orderItemTax.taxPercentAmount) &&
        Objects.equals(this.tax, orderItemTax.tax) &&
        Objects.equals(this.entryDate, orderItemTax.entryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItem, taxType, jurisdiction, taxDescription, taxPercent, taxPercentAmount, tax, entryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemTax {\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    taxDescription: ").append(toIndentedString(taxDescription)).append("\n");
    sb.append("    taxPercent: ").append(toIndentedString(taxPercent)).append("\n");
    sb.append("    taxPercentAmount: ").append(toIndentedString(taxPercentAmount)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("orderItem");
    openapiFields.add("taxType");
    openapiFields.add("jurisdiction");
    openapiFields.add("taxDescription");
    openapiFields.add("taxPercent");
    openapiFields.add("taxPercentAmount");
    openapiFields.add("tax");
    openapiFields.add("entryDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("taxType");
    openapiRequiredFields.add("jurisdiction");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemTax
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderItemTax.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemTax is not found in the empty JSON string", OrderItemTax.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemTax.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemTax` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderItemTax.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `orderItem`
      if (jsonObj.getAsJsonObject("orderItem") != null) {
        OrderItem.validateJsonObject(jsonObj.getAsJsonObject("orderItem"));
      }
      if (jsonObj.get("taxType") != null && !jsonObj.get("taxType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxType").toString()));
      }
      if (jsonObj.get("jurisdiction") != null && !jsonObj.get("jurisdiction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jurisdiction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jurisdiction").toString()));
      }
      if (jsonObj.get("taxDescription") != null && !jsonObj.get("taxDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemTax.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemTax' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemTax> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemTax.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemTax>() {
           @Override
           public void write(JsonWriter out, OrderItemTax value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemTax read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemTax given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemTax
  * @throws IOException if the JSON string is invalid with respect to OrderItemTax
  */
  public static OrderItemTax fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemTax.class);
  }

 /**
  * Convert an instance of OrderItemTax to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


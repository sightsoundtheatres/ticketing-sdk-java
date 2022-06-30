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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sightsound.sdk.ticketing.model.Customer;
import com.sightsound.sdk.ticketing.model.CustomerAttributeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * CustomerAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T16:06:07.372728-05:00[America/Chicago]")
public class CustomerAttribute {
  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private Long customerNumber;

  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private String attribute;

  public static final String SERIALIZED_NAME_ATTRIBUTE_TYPE = "attributeType";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_TYPE)
  private CustomerAttributeType attributeType;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public CustomerAttribute() { 
  }

  public CustomerAttribute customerNumber(Long customerNumber) {
    
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Get customerNumber
   * @return customerNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCustomerNumber() {
    return customerNumber;
  }


  public void setCustomerNumber(Long customerNumber) {
    this.customerNumber = customerNumber;
  }


  public CustomerAttribute attribute(String attribute) {
    
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAttribute() {
    return attribute;
  }


  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  public CustomerAttribute attributeType(CustomerAttributeType attributeType) {
    
    this.attributeType = attributeType;
    return this;
  }

   /**
   * Get attributeType
   * @return attributeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomerAttributeType getAttributeType() {
    return attributeType;
  }


  public void setAttributeType(CustomerAttributeType attributeType) {
    this.attributeType = attributeType;
  }


  public CustomerAttribute customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Customer getCustomer() {
    return customer;
  }


  public void setCustomer(Customer customer) {
    this.customer = customer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAttribute customerAttribute = (CustomerAttribute) o;
    return Objects.equals(this.customerNumber, customerAttribute.customerNumber) &&
        Objects.equals(this.attribute, customerAttribute.attribute) &&
        Objects.equals(this.attributeType, customerAttribute.attributeType) &&
        Objects.equals(this.customer, customerAttribute.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNumber, attribute, attributeType, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAttribute {\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
    openapiFields.add("customerNumber");
    openapiFields.add("attribute");
    openapiFields.add("attributeType");
    openapiFields.add("customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attribute");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomerAttribute.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerAttribute is not found in the empty JSON string", CustomerAttribute.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerAttribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerAttribute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerAttribute.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("attribute") != null && !jsonObj.get("attribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attribute").toString()));
      }
      // validate the optional field `customer`
      if (jsonObj.getAsJsonObject("customer") != null) {
        Customer.validateJsonObject(jsonObj.getAsJsonObject("customer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerAttribute>() {
           @Override
           public void write(JsonWriter out, CustomerAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerAttribute
  * @throws IOException if the JSON string is invalid with respect to CustomerAttribute
  */
  public static CustomerAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerAttribute.class);
  }

 /**
  * Convert an instance of CustomerAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sightsound.sdk.ticketing.model.AddressExtended;
import com.sightsound.sdk.ticketing.model.CreateWebsiteCustomerRequest;
import com.sightsound.sdk.ticketing.model.PhoneType;
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
 * OrderCustomerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T17:37:03.061697Z[Etc/UTC]")
public class OrderCustomerRequest {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PHONE_TYPE = "phoneType";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE)
  private PhoneType phoneType;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organizationName";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private AddressExtended billingAddress;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shippingAddress";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private AddressExtended shippingAddress;

  public static final String SERIALIZED_NAME_WEBSITE_CUSTOMER_SEARCH_REQUEST = "websiteCustomerSearchRequest";
  @SerializedName(SERIALIZED_NAME_WEBSITE_CUSTOMER_SEARCH_REQUEST)
  private CreateWebsiteCustomerRequest websiteCustomerSearchRequest;

  public OrderCustomerRequest() { 
  }

  public OrderCustomerRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public OrderCustomerRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public OrderCustomerRequest phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public OrderCustomerRequest phoneType(PhoneType phoneType) {
    
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PhoneType getPhoneType() {
    return phoneType;
  }


  public void setPhoneType(PhoneType phoneType) {
    this.phoneType = phoneType;
  }


  public OrderCustomerRequest emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public OrderCustomerRequest organizationName(String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public OrderCustomerRequest billingAddress(AddressExtended billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressExtended getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(AddressExtended billingAddress) {
    this.billingAddress = billingAddress;
  }


  public OrderCustomerRequest shippingAddress(AddressExtended shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressExtended getShippingAddress() {
    return shippingAddress;
  }


  public void setShippingAddress(AddressExtended shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public OrderCustomerRequest websiteCustomerSearchRequest(CreateWebsiteCustomerRequest websiteCustomerSearchRequest) {
    
    this.websiteCustomerSearchRequest = websiteCustomerSearchRequest;
    return this;
  }

   /**
   * Get websiteCustomerSearchRequest
   * @return websiteCustomerSearchRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateWebsiteCustomerRequest getWebsiteCustomerSearchRequest() {
    return websiteCustomerSearchRequest;
  }


  public void setWebsiteCustomerSearchRequest(CreateWebsiteCustomerRequest websiteCustomerSearchRequest) {
    this.websiteCustomerSearchRequest = websiteCustomerSearchRequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCustomerRequest orderCustomerRequest = (OrderCustomerRequest) o;
    return Objects.equals(this.firstName, orderCustomerRequest.firstName) &&
        Objects.equals(this.lastName, orderCustomerRequest.lastName) &&
        Objects.equals(this.phoneNumber, orderCustomerRequest.phoneNumber) &&
        Objects.equals(this.phoneType, orderCustomerRequest.phoneType) &&
        Objects.equals(this.emailAddress, orderCustomerRequest.emailAddress) &&
        Objects.equals(this.organizationName, orderCustomerRequest.organizationName) &&
        Objects.equals(this.billingAddress, orderCustomerRequest.billingAddress) &&
        Objects.equals(this.shippingAddress, orderCustomerRequest.shippingAddress) &&
        Objects.equals(this.websiteCustomerSearchRequest, orderCustomerRequest.websiteCustomerSearchRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phoneNumber, phoneType, emailAddress, organizationName, billingAddress, shippingAddress, websiteCustomerSearchRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCustomerRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    websiteCustomerSearchRequest: ").append(toIndentedString(websiteCustomerSearchRequest)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("phoneNumber");
    openapiFields.add("phoneType");
    openapiFields.add("emailAddress");
    openapiFields.add("organizationName");
    openapiFields.add("billingAddress");
    openapiFields.add("shippingAddress");
    openapiFields.add("websiteCustomerSearchRequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderCustomerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderCustomerRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCustomerRequest is not found in the empty JSON string", OrderCustomerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderCustomerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCustomerRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if (jsonObj.get("emailAddress") != null && !jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      if (jsonObj.get("organizationName") != null && !jsonObj.get("organizationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationName").toString()));
      }
      // validate the optional field `billingAddress`
      if (jsonObj.getAsJsonObject("billingAddress") != null) {
        AddressExtended.validateJsonObject(jsonObj.getAsJsonObject("billingAddress"));
      }
      // validate the optional field `shippingAddress`
      if (jsonObj.getAsJsonObject("shippingAddress") != null) {
        AddressExtended.validateJsonObject(jsonObj.getAsJsonObject("shippingAddress"));
      }
      // validate the optional field `websiteCustomerSearchRequest`
      if (jsonObj.getAsJsonObject("websiteCustomerSearchRequest") != null) {
        CreateWebsiteCustomerRequest.validateJsonObject(jsonObj.getAsJsonObject("websiteCustomerSearchRequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCustomerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCustomerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCustomerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCustomerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCustomerRequest>() {
           @Override
           public void write(JsonWriter out, OrderCustomerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCustomerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCustomerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCustomerRequest
  * @throws IOException if the JSON string is invalid with respect to OrderCustomerRequest
  */
  public static OrderCustomerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCustomerRequest.class);
  }

 /**
  * Convert an instance of OrderCustomerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


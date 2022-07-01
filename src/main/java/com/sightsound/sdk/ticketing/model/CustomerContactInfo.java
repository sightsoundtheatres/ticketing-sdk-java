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
import com.sightsound.sdk.ticketing.model.AdditionalContactRole;
import com.sightsound.sdk.ticketing.model.Customer;
import com.sightsound.sdk.ticketing.model.CustomerContactInfoCommunicationTag;
import com.sightsound.sdk.ticketing.model.PhoneType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * CustomerContactInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T08:40:20.483181-05:00[America/Chicago]")
public class CustomerContactInfo {
  public static final String SERIALIZED_NAME_CONTACT_ID = "contactId";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private Long contactId;

  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private Long customerNumber;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_ADD_DATE = "addDate";
  @SerializedName(SERIALIZED_NAME_ADD_DATE)
  private OffsetDateTime addDate;

  public static final String SERIALIZED_NAME_ADD_USER_ID = "addUserId";
  @SerializedName(SERIALIZED_NAME_ADD_USER_ID)
  private String addUserId;

  public static final String SERIALIZED_NAME_PHONE_TYPE = "phoneType";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE)
  private PhoneType phoneType;

  public static final String SERIALIZED_NAME_EMAIL_LIST = "emailList";
  @SerializedName(SERIALIZED_NAME_EMAIL_LIST)
  private Boolean emailList;

  public static final String SERIALIZED_NAME_CALL_LIST = "callList";
  @SerializedName(SERIALIZED_NAME_CALL_LIST)
  private Boolean callList;

  public static final String SERIALIZED_NAME_TEXT_LIST = "textList";
  @SerializedName(SERIALIZED_NAME_TEXT_LIST)
  private Boolean textList;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private AdditionalContactRole role;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_MODIFY_DATE = "modifyDate";
  @SerializedName(SERIALIZED_NAME_MODIFY_DATE)
  private OffsetDateTime modifyDate;

  public static final String SERIALIZED_NAME_MODIFY_USER_ID = "modifyUserId";
  @SerializedName(SERIALIZED_NAME_MODIFY_USER_ID)
  private String modifyUserId;

  public static final String SERIALIZED_NAME_COMMUNICATION_PREFERENCES = "communicationPreferences";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_PREFERENCES)
  private List<CustomerContactInfoCommunicationTag> communicationPreferences = null;

  public CustomerContactInfo() { 
  }

  public CustomerContactInfo contactId(Long contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getContactId() {
    return contactId;
  }


  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }


  public CustomerContactInfo customerNumber(Long customerNumber) {
    
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


  public CustomerContactInfo customer(Customer customer) {
    
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


  public CustomerContactInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CustomerContactInfo firstName(String firstName) {
    
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


  public CustomerContactInfo lastName(String lastName) {
    
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


  public CustomerContactInfo emailAddress(String emailAddress) {
    
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


  public CustomerContactInfo phoneNumber(String phoneNumber) {
    
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


  public CustomerContactInfo extension(String extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExtension() {
    return extension;
  }


  public void setExtension(String extension) {
    this.extension = extension;
  }


  public CustomerContactInfo addDate(OffsetDateTime addDate) {
    
    this.addDate = addDate;
    return this;
  }

   /**
   * Get addDate
   * @return addDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAddDate() {
    return addDate;
  }


  public void setAddDate(OffsetDateTime addDate) {
    this.addDate = addDate;
  }


  public CustomerContactInfo addUserId(String addUserId) {
    
    this.addUserId = addUserId;
    return this;
  }

   /**
   * Get addUserId
   * @return addUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddUserId() {
    return addUserId;
  }


  public void setAddUserId(String addUserId) {
    this.addUserId = addUserId;
  }


  public CustomerContactInfo phoneType(PhoneType phoneType) {
    
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


  public CustomerContactInfo emailList(Boolean emailList) {
    
    this.emailList = emailList;
    return this;
  }

   /**
   * Get emailList
   * @return emailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEmailList() {
    return emailList;
  }


  public void setEmailList(Boolean emailList) {
    this.emailList = emailList;
  }


  public CustomerContactInfo callList(Boolean callList) {
    
    this.callList = callList;
    return this;
  }

   /**
   * Get callList
   * @return callList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCallList() {
    return callList;
  }


  public void setCallList(Boolean callList) {
    this.callList = callList;
  }


  public CustomerContactInfo textList(Boolean textList) {
    
    this.textList = textList;
    return this;
  }

   /**
   * Get textList
   * @return textList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTextList() {
    return textList;
  }


  public void setTextList(Boolean textList) {
    this.textList = textList;
  }


  public CustomerContactInfo role(AdditionalContactRole role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdditionalContactRole getRole() {
    return role;
  }


  public void setRole(AdditionalContactRole role) {
    this.role = role;
  }


  public CustomerContactInfo primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public CustomerContactInfo modifyDate(OffsetDateTime modifyDate) {
    
    this.modifyDate = modifyDate;
    return this;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }


  public void setModifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
  }


  public CustomerContactInfo modifyUserId(String modifyUserId) {
    
    this.modifyUserId = modifyUserId;
    return this;
  }

   /**
   * Get modifyUserId
   * @return modifyUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifyUserId() {
    return modifyUserId;
  }


  public void setModifyUserId(String modifyUserId) {
    this.modifyUserId = modifyUserId;
  }


  public CustomerContactInfo communicationPreferences(List<CustomerContactInfoCommunicationTag> communicationPreferences) {
    
    this.communicationPreferences = communicationPreferences;
    return this;
  }

  public CustomerContactInfo addCommunicationPreferencesItem(CustomerContactInfoCommunicationTag communicationPreferencesItem) {
    if (this.communicationPreferences == null) {
      this.communicationPreferences = new ArrayList<>();
    }
    this.communicationPreferences.add(communicationPreferencesItem);
    return this;
  }

   /**
   * Get communicationPreferences
   * @return communicationPreferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomerContactInfoCommunicationTag> getCommunicationPreferences() {
    return communicationPreferences;
  }


  public void setCommunicationPreferences(List<CustomerContactInfoCommunicationTag> communicationPreferences) {
    this.communicationPreferences = communicationPreferences;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerContactInfo customerContactInfo = (CustomerContactInfo) o;
    return Objects.equals(this.contactId, customerContactInfo.contactId) &&
        Objects.equals(this.customerNumber, customerContactInfo.customerNumber) &&
        Objects.equals(this.customer, customerContactInfo.customer) &&
        Objects.equals(this.title, customerContactInfo.title) &&
        Objects.equals(this.firstName, customerContactInfo.firstName) &&
        Objects.equals(this.lastName, customerContactInfo.lastName) &&
        Objects.equals(this.emailAddress, customerContactInfo.emailAddress) &&
        Objects.equals(this.phoneNumber, customerContactInfo.phoneNumber) &&
        Objects.equals(this.extension, customerContactInfo.extension) &&
        Objects.equals(this.addDate, customerContactInfo.addDate) &&
        Objects.equals(this.addUserId, customerContactInfo.addUserId) &&
        Objects.equals(this.phoneType, customerContactInfo.phoneType) &&
        Objects.equals(this.emailList, customerContactInfo.emailList) &&
        Objects.equals(this.callList, customerContactInfo.callList) &&
        Objects.equals(this.textList, customerContactInfo.textList) &&
        Objects.equals(this.role, customerContactInfo.role) &&
        Objects.equals(this.primary, customerContactInfo.primary) &&
        Objects.equals(this.modifyDate, customerContactInfo.modifyDate) &&
        Objects.equals(this.modifyUserId, customerContactInfo.modifyUserId) &&
        Objects.equals(this.communicationPreferences, customerContactInfo.communicationPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, customerNumber, customer, title, firstName, lastName, emailAddress, phoneNumber, extension, addDate, addUserId, phoneType, emailList, callList, textList, role, primary, modifyDate, modifyUserId, communicationPreferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerContactInfo {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    addDate: ").append(toIndentedString(addDate)).append("\n");
    sb.append("    addUserId: ").append(toIndentedString(addUserId)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    emailList: ").append(toIndentedString(emailList)).append("\n");
    sb.append("    callList: ").append(toIndentedString(callList)).append("\n");
    sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    modifyUserId: ").append(toIndentedString(modifyUserId)).append("\n");
    sb.append("    communicationPreferences: ").append(toIndentedString(communicationPreferences)).append("\n");
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
    openapiFields.add("contactId");
    openapiFields.add("customerNumber");
    openapiFields.add("customer");
    openapiFields.add("title");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("emailAddress");
    openapiFields.add("phoneNumber");
    openapiFields.add("extension");
    openapiFields.add("addDate");
    openapiFields.add("addUserId");
    openapiFields.add("phoneType");
    openapiFields.add("emailList");
    openapiFields.add("callList");
    openapiFields.add("textList");
    openapiFields.add("role");
    openapiFields.add("primary");
    openapiFields.add("modifyDate");
    openapiFields.add("modifyUserId");
    openapiFields.add("communicationPreferences");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerContactInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomerContactInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerContactInfo is not found in the empty JSON string", CustomerContactInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerContactInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerContactInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `customer`
      if (jsonObj.getAsJsonObject("customer") != null) {
        Customer.validateJsonObject(jsonObj.getAsJsonObject("customer"));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (jsonObj.get("emailAddress") != null && !jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      if (jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if (jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if (jsonObj.get("addUserId") != null && !jsonObj.get("addUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addUserId").toString()));
      }
      if (jsonObj.get("modifyUserId") != null && !jsonObj.get("modifyUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifyUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifyUserId").toString()));
      }
      JsonArray jsonArraycommunicationPreferences = jsonObj.getAsJsonArray("communicationPreferences");
      if (jsonArraycommunicationPreferences != null) {
        // ensure the json data is an array
        if (!jsonObj.get("communicationPreferences").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `communicationPreferences` to be an array in the JSON string but got `%s`", jsonObj.get("communicationPreferences").toString()));
        }

        // validate the optional field `communicationPreferences` (array)
        for (int i = 0; i < jsonArraycommunicationPreferences.size(); i++) {
          CustomerContactInfoCommunicationTag.validateJsonObject(jsonArraycommunicationPreferences.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerContactInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerContactInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerContactInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerContactInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerContactInfo>() {
           @Override
           public void write(JsonWriter out, CustomerContactInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerContactInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerContactInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerContactInfo
  * @throws IOException if the JSON string is invalid with respect to CustomerContactInfo
  */
  public static CustomerContactInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerContactInfo.class);
  }

 /**
  * Convert an instance of CustomerContactInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.sightsound.sdk.ticketing.model.DocumentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * CustomerDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T16:06:07.372728-05:00[America/Chicago]")
public class CustomerDocument {
  public static final String SERIALIZED_NAME_RECORD_ID = "recordId";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private Long recordId;

  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private Long customerNumber;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private DocumentType documentType;

  public static final String SERIALIZED_NAME_FILE_URL = "fileUrl";
  @SerializedName(SERIALIZED_NAME_FILE_URL)
  private String fileUrl;

  public static final String SERIALIZED_NAME_ADD_DATE = "addDate";
  @SerializedName(SERIALIZED_NAME_ADD_DATE)
  private OffsetDateTime addDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_ADD_USER_ID = "addUserId";
  @SerializedName(SERIALIZED_NAME_ADD_USER_ID)
  private String addUserId;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public CustomerDocument() { 
  }

  public CustomerDocument recordId(Long recordId) {
    
    this.recordId = recordId;
    return this;
  }

   /**
   * Get recordId
   * @return recordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRecordId() {
    return recordId;
  }


  public void setRecordId(Long recordId) {
    this.recordId = recordId;
  }


  public CustomerDocument customerNumber(Long customerNumber) {
    
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


  public CustomerDocument documentType(DocumentType documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentType getDocumentType() {
    return documentType;
  }


  public void setDocumentType(DocumentType documentType) {
    this.documentType = documentType;
  }


  public CustomerDocument fileUrl(String fileUrl) {
    
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * Get fileUrl
   * @return fileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileUrl() {
    return fileUrl;
  }


  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }


  public CustomerDocument addDate(OffsetDateTime addDate) {
    
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


  public CustomerDocument expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public CustomerDocument addUserId(String addUserId) {
    
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


  public CustomerDocument customer(Customer customer) {
    
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
    CustomerDocument customerDocument = (CustomerDocument) o;
    return Objects.equals(this.recordId, customerDocument.recordId) &&
        Objects.equals(this.customerNumber, customerDocument.customerNumber) &&
        Objects.equals(this.documentType, customerDocument.documentType) &&
        Objects.equals(this.fileUrl, customerDocument.fileUrl) &&
        Objects.equals(this.addDate, customerDocument.addDate) &&
        Objects.equals(this.expiryDate, customerDocument.expiryDate) &&
        Objects.equals(this.addUserId, customerDocument.addUserId) &&
        Objects.equals(this.customer, customerDocument.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordId, customerNumber, documentType, fileUrl, addDate, expiryDate, addUserId, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDocument {\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    addDate: ").append(toIndentedString(addDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    addUserId: ").append(toIndentedString(addUserId)).append("\n");
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
    openapiFields.add("recordId");
    openapiFields.add("customerNumber");
    openapiFields.add("documentType");
    openapiFields.add("fileUrl");
    openapiFields.add("addDate");
    openapiFields.add("expiryDate");
    openapiFields.add("addUserId");
    openapiFields.add("customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerDocument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomerDocument.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerDocument is not found in the empty JSON string", CustomerDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerDocument` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fileUrl") != null && !jsonObj.get("fileUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileUrl").toString()));
      }
      if (jsonObj.get("addUserId") != null && !jsonObj.get("addUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addUserId").toString()));
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
       if (!CustomerDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerDocument>() {
           @Override
           public void write(JsonWriter out, CustomerDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerDocument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerDocument
  * @throws IOException if the JSON string is invalid with respect to CustomerDocument
  */
  public static CustomerDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerDocument.class);
  }

 /**
  * Convert an instance of CustomerDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


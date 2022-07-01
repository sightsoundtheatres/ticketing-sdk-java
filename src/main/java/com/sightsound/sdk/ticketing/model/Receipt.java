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
import com.sightsound.sdk.ticketing.model.Customer;
import com.sightsound.sdk.ticketing.model.InvoiceCompany;
import com.sightsound.sdk.ticketing.model.ReceiptDetail;
import com.sightsound.sdk.ticketing.model.ReceiptPaymentType;
import com.sightsound.sdk.ticketing.model.ReceiptReasonCode;
import com.sightsound.sdk.ticketing.model.ReceiptStatus;
import com.sightsound.sdk.ticketing.model.ReceiptType;
import com.sightsound.sdk.ticketing.model.SyncSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * Receipt
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-01T17:37:03.061697Z[Etc/UTC]")
public class Receipt {
  public static final String SERIALIZED_NAME_RECEIPT_NUMBER = "receiptNumber";
  @SerializedName(SERIALIZED_NAME_RECEIPT_NUMBER)
  private Long receiptNumber;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private InvoiceCompany company;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "checkNumber";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private String checkNumber;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RECEIPT_DATE = "receiptDate";
  @SerializedName(SERIALIZED_NAME_RECEIPT_DATE)
  private OffsetDateTime receiptDate;

  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private Long customerNumber;

  public static final String SERIALIZED_NAME_RECEIPT_AMOUNT = "receiptAmount";
  @SerializedName(SERIALIZED_NAME_RECEIPT_AMOUNT)
  private BigDecimal receiptAmount;

  public static final String SERIALIZED_NAME_RECEIPT_STATUS = "receiptStatus";
  @SerializedName(SERIALIZED_NAME_RECEIPT_STATUS)
  private ReceiptStatus receiptStatus;

  public static final String SERIALIZED_NAME_PAID_AMOUNT = "paidAmount";
  @SerializedName(SERIALIZED_NAME_PAID_AMOUNT)
  private BigDecimal paidAmount;

  public static final String SERIALIZED_NAME_GL_PERIOD = "glPeriod";
  @SerializedName(SERIALIZED_NAME_GL_PERIOD)
  private Integer glPeriod;

  public static final String SERIALIZED_NAME_BANK_CODE = "bankCode";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private ReceiptPaymentType paymentType;

  public static final String SERIALIZED_NAME_RECEIPT_TYPE = "receiptType";
  @SerializedName(SERIALIZED_NAME_RECEIPT_TYPE)
  private ReceiptType receiptType;

  public static final String SERIALIZED_NAME_CONTROL_NUMBER = "controlNumber";
  @SerializedName(SERIALIZED_NAME_CONTROL_NUMBER)
  private Long controlNumber;

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private ReceiptReasonCode reasonCode;

  public static final String SERIALIZED_NAME_BASE_AMOUNT = "baseAmount";
  @SerializedName(SERIALIZED_NAME_BASE_AMOUNT)
  private BigDecimal baseAmount;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_CC_SEQ_NUMBER = "ccSeqNumber";
  @SerializedName(SERIALIZED_NAME_CC_SEQ_NUMBER)
  private Long ccSeqNumber;

  public static final String SERIALIZED_NAME_MODIFY_DATE = "modifyDate";
  @SerializedName(SERIALIZED_NAME_MODIFY_DATE)
  private OffsetDateTime modifyDate;

  public static final String SERIALIZED_NAME_EXECUTIVE_SERIES_RECEIPT_NUMBER = "executiveSeriesReceiptNumber";
  @SerializedName(SERIALIZED_NAME_EXECUTIVE_SERIES_RECEIPT_NUMBER)
  private Long executiveSeriesReceiptNumber;

  public static final String SERIALIZED_NAME_SYNC_SOURCE = "syncSource";
  @SerializedName(SERIALIZED_NAME_SYNC_SOURCE)
  private SyncSource syncSource;

  public static final String SERIALIZED_NAME_ADD_USER_ID = "addUserId";
  @SerializedName(SERIALIZED_NAME_ADD_USER_ID)
  private String addUserId;

  public static final String SERIALIZED_NAME_EDIT_USER_ID = "editUserId";
  @SerializedName(SERIALIZED_NAME_EDIT_USER_ID)
  private String editUserId;

  public static final String SERIALIZED_NAME_RECEIPT_DETAILS = "receiptDetails";
  @SerializedName(SERIALIZED_NAME_RECEIPT_DETAILS)
  private List<ReceiptDetail> receiptDetails = null;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public Receipt() { 
  }

  public Receipt receiptNumber(Long receiptNumber) {
    
    this.receiptNumber = receiptNumber;
    return this;
  }

   /**
   * Get receiptNumber
   * @return receiptNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getReceiptNumber() {
    return receiptNumber;
  }


  public void setReceiptNumber(Long receiptNumber) {
    this.receiptNumber = receiptNumber;
  }


  public Receipt company(InvoiceCompany company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InvoiceCompany getCompany() {
    return company;
  }


  public void setCompany(InvoiceCompany company) {
    this.company = company;
  }


  public Receipt checkNumber(String checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Get checkNumber
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  public Receipt description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Receipt receiptDate(OffsetDateTime receiptDate) {
    
    this.receiptDate = receiptDate;
    return this;
  }

   /**
   * Get receiptDate
   * @return receiptDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getReceiptDate() {
    return receiptDate;
  }


  public void setReceiptDate(OffsetDateTime receiptDate) {
    this.receiptDate = receiptDate;
  }


  public Receipt customerNumber(Long customerNumber) {
    
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


  public Receipt receiptAmount(BigDecimal receiptAmount) {
    
    this.receiptAmount = receiptAmount;
    return this;
  }

   /**
   * Get receiptAmount
   * @return receiptAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getReceiptAmount() {
    return receiptAmount;
  }


  public void setReceiptAmount(BigDecimal receiptAmount) {
    this.receiptAmount = receiptAmount;
  }


  public Receipt receiptStatus(ReceiptStatus receiptStatus) {
    
    this.receiptStatus = receiptStatus;
    return this;
  }

   /**
   * Get receiptStatus
   * @return receiptStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReceiptStatus getReceiptStatus() {
    return receiptStatus;
  }


  public void setReceiptStatus(ReceiptStatus receiptStatus) {
    this.receiptStatus = receiptStatus;
  }


  public Receipt paidAmount(BigDecimal paidAmount) {
    
    this.paidAmount = paidAmount;
    return this;
  }

   /**
   * Get paidAmount
   * @return paidAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPaidAmount() {
    return paidAmount;
  }


  public void setPaidAmount(BigDecimal paidAmount) {
    this.paidAmount = paidAmount;
  }


  public Receipt glPeriod(Integer glPeriod) {
    
    this.glPeriod = glPeriod;
    return this;
  }

   /**
   * Get glPeriod
   * @return glPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGlPeriod() {
    return glPeriod;
  }


  public void setGlPeriod(Integer glPeriod) {
    this.glPeriod = glPeriod;
  }


  public Receipt bankCode(String bankCode) {
    
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Get bankCode
   * @return bankCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBankCode() {
    return bankCode;
  }


  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  public Receipt paymentType(ReceiptPaymentType paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReceiptPaymentType getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(ReceiptPaymentType paymentType) {
    this.paymentType = paymentType;
  }


  public Receipt receiptType(ReceiptType receiptType) {
    
    this.receiptType = receiptType;
    return this;
  }

   /**
   * Get receiptType
   * @return receiptType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReceiptType getReceiptType() {
    return receiptType;
  }


  public void setReceiptType(ReceiptType receiptType) {
    this.receiptType = receiptType;
  }


  public Receipt controlNumber(Long controlNumber) {
    
    this.controlNumber = controlNumber;
    return this;
  }

   /**
   * Get controlNumber
   * @return controlNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getControlNumber() {
    return controlNumber;
  }


  public void setControlNumber(Long controlNumber) {
    this.controlNumber = controlNumber;
  }


  public Receipt reasonCode(ReceiptReasonCode reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReceiptReasonCode getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(ReceiptReasonCode reasonCode) {
    this.reasonCode = reasonCode;
  }


  public Receipt baseAmount(BigDecimal baseAmount) {
    
    this.baseAmount = baseAmount;
    return this;
  }

   /**
   * Get baseAmount
   * @return baseAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBaseAmount() {
    return baseAmount;
  }


  public void setBaseAmount(BigDecimal baseAmount) {
    this.baseAmount = baseAmount;
  }


  public Receipt location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public Receipt ccSeqNumber(Long ccSeqNumber) {
    
    this.ccSeqNumber = ccSeqNumber;
    return this;
  }

   /**
   * Get ccSeqNumber
   * @return ccSeqNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCcSeqNumber() {
    return ccSeqNumber;
  }


  public void setCcSeqNumber(Long ccSeqNumber) {
    this.ccSeqNumber = ccSeqNumber;
  }


  public Receipt modifyDate(OffsetDateTime modifyDate) {
    
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


  public Receipt executiveSeriesReceiptNumber(Long executiveSeriesReceiptNumber) {
    
    this.executiveSeriesReceiptNumber = executiveSeriesReceiptNumber;
    return this;
  }

   /**
   * Get executiveSeriesReceiptNumber
   * @return executiveSeriesReceiptNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getExecutiveSeriesReceiptNumber() {
    return executiveSeriesReceiptNumber;
  }


  public void setExecutiveSeriesReceiptNumber(Long executiveSeriesReceiptNumber) {
    this.executiveSeriesReceiptNumber = executiveSeriesReceiptNumber;
  }


  public Receipt syncSource(SyncSource syncSource) {
    
    this.syncSource = syncSource;
    return this;
  }

   /**
   * Get syncSource
   * @return syncSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SyncSource getSyncSource() {
    return syncSource;
  }


  public void setSyncSource(SyncSource syncSource) {
    this.syncSource = syncSource;
  }


  public Receipt addUserId(String addUserId) {
    
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


  public Receipt editUserId(String editUserId) {
    
    this.editUserId = editUserId;
    return this;
  }

   /**
   * Get editUserId
   * @return editUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEditUserId() {
    return editUserId;
  }


  public void setEditUserId(String editUserId) {
    this.editUserId = editUserId;
  }


  public Receipt receiptDetails(List<ReceiptDetail> receiptDetails) {
    
    this.receiptDetails = receiptDetails;
    return this;
  }

  public Receipt addReceiptDetailsItem(ReceiptDetail receiptDetailsItem) {
    if (this.receiptDetails == null) {
      this.receiptDetails = new ArrayList<>();
    }
    this.receiptDetails.add(receiptDetailsItem);
    return this;
  }

   /**
   * Get receiptDetails
   * @return receiptDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReceiptDetail> getReceiptDetails() {
    return receiptDetails;
  }


  public void setReceiptDetails(List<ReceiptDetail> receiptDetails) {
    this.receiptDetails = receiptDetails;
  }


  public Receipt customer(Customer customer) {
    
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
    Receipt receipt = (Receipt) o;
    return Objects.equals(this.receiptNumber, receipt.receiptNumber) &&
        Objects.equals(this.company, receipt.company) &&
        Objects.equals(this.checkNumber, receipt.checkNumber) &&
        Objects.equals(this.description, receipt.description) &&
        Objects.equals(this.receiptDate, receipt.receiptDate) &&
        Objects.equals(this.customerNumber, receipt.customerNumber) &&
        Objects.equals(this.receiptAmount, receipt.receiptAmount) &&
        Objects.equals(this.receiptStatus, receipt.receiptStatus) &&
        Objects.equals(this.paidAmount, receipt.paidAmount) &&
        Objects.equals(this.glPeriod, receipt.glPeriod) &&
        Objects.equals(this.bankCode, receipt.bankCode) &&
        Objects.equals(this.paymentType, receipt.paymentType) &&
        Objects.equals(this.receiptType, receipt.receiptType) &&
        Objects.equals(this.controlNumber, receipt.controlNumber) &&
        Objects.equals(this.reasonCode, receipt.reasonCode) &&
        Objects.equals(this.baseAmount, receipt.baseAmount) &&
        Objects.equals(this.location, receipt.location) &&
        Objects.equals(this.ccSeqNumber, receipt.ccSeqNumber) &&
        Objects.equals(this.modifyDate, receipt.modifyDate) &&
        Objects.equals(this.executiveSeriesReceiptNumber, receipt.executiveSeriesReceiptNumber) &&
        Objects.equals(this.syncSource, receipt.syncSource) &&
        Objects.equals(this.addUserId, receipt.addUserId) &&
        Objects.equals(this.editUserId, receipt.editUserId) &&
        Objects.equals(this.receiptDetails, receipt.receiptDetails) &&
        Objects.equals(this.customer, receipt.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiptNumber, company, checkNumber, description, receiptDate, customerNumber, receiptAmount, receiptStatus, paidAmount, glPeriod, bankCode, paymentType, receiptType, controlNumber, reasonCode, baseAmount, location, ccSeqNumber, modifyDate, executiveSeriesReceiptNumber, syncSource, addUserId, editUserId, receiptDetails, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Receipt {\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    receiptDate: ").append(toIndentedString(receiptDate)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    receiptAmount: ").append(toIndentedString(receiptAmount)).append("\n");
    sb.append("    receiptStatus: ").append(toIndentedString(receiptStatus)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    glPeriod: ").append(toIndentedString(glPeriod)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    receiptType: ").append(toIndentedString(receiptType)).append("\n");
    sb.append("    controlNumber: ").append(toIndentedString(controlNumber)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    ccSeqNumber: ").append(toIndentedString(ccSeqNumber)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    executiveSeriesReceiptNumber: ").append(toIndentedString(executiveSeriesReceiptNumber)).append("\n");
    sb.append("    syncSource: ").append(toIndentedString(syncSource)).append("\n");
    sb.append("    addUserId: ").append(toIndentedString(addUserId)).append("\n");
    sb.append("    editUserId: ").append(toIndentedString(editUserId)).append("\n");
    sb.append("    receiptDetails: ").append(toIndentedString(receiptDetails)).append("\n");
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
    openapiFields.add("receiptNumber");
    openapiFields.add("company");
    openapiFields.add("checkNumber");
    openapiFields.add("description");
    openapiFields.add("receiptDate");
    openapiFields.add("customerNumber");
    openapiFields.add("receiptAmount");
    openapiFields.add("receiptStatus");
    openapiFields.add("paidAmount");
    openapiFields.add("glPeriod");
    openapiFields.add("bankCode");
    openapiFields.add("paymentType");
    openapiFields.add("receiptType");
    openapiFields.add("controlNumber");
    openapiFields.add("reasonCode");
    openapiFields.add("baseAmount");
    openapiFields.add("location");
    openapiFields.add("ccSeqNumber");
    openapiFields.add("modifyDate");
    openapiFields.add("executiveSeriesReceiptNumber");
    openapiFields.add("syncSource");
    openapiFields.add("addUserId");
    openapiFields.add("editUserId");
    openapiFields.add("receiptDetails");
    openapiFields.add("customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("company");
    openapiRequiredFields.add("receiptDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Receipt
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Receipt.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Receipt is not found in the empty JSON string", Receipt.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Receipt.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Receipt` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Receipt.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("checkNumber") != null && !jsonObj.get("checkNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkNumber").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("bankCode") != null && !jsonObj.get("bankCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankCode").toString()));
      }
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (jsonObj.get("addUserId") != null && !jsonObj.get("addUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addUserId").toString()));
      }
      if (jsonObj.get("editUserId") != null && !jsonObj.get("editUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `editUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("editUserId").toString()));
      }
      JsonArray jsonArrayreceiptDetails = jsonObj.getAsJsonArray("receiptDetails");
      if (jsonArrayreceiptDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("receiptDetails").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `receiptDetails` to be an array in the JSON string but got `%s`", jsonObj.get("receiptDetails").toString()));
        }

        // validate the optional field `receiptDetails` (array)
        for (int i = 0; i < jsonArrayreceiptDetails.size(); i++) {
          ReceiptDetail.validateJsonObject(jsonArrayreceiptDetails.get(i).getAsJsonObject());
        };
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
       if (!Receipt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Receipt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Receipt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Receipt.class));

       return (TypeAdapter<T>) new TypeAdapter<Receipt>() {
           @Override
           public void write(JsonWriter out, Receipt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Receipt read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Receipt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Receipt
  * @throws IOException if the JSON string is invalid with respect to Receipt
  */
  public static Receipt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Receipt.class);
  }

 /**
  * Convert an instance of Receipt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


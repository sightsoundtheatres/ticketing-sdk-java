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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sightsound.sdk.ticketing.model.Customer;
import com.sightsound.sdk.ticketing.model.ImpSSIInvoiceCategory;
import com.sightsound.sdk.ticketing.model.InvoiceCompany;
import com.sightsound.sdk.ticketing.model.InvoiceDetail;
import com.sightsound.sdk.ticketing.model.InvoiceStatus;
import com.sightsound.sdk.ticketing.model.InvoiceType;
import com.sightsound.sdk.ticketing.model.Order;
import com.sightsound.sdk.ticketing.model.PaymentTerms;
import com.sightsound.sdk.ticketing.model.ReceiptDetail;
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
 * Invoice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T19:37:37.998841Z[Etc/UTC]")
public class Invoice {
  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private Long invoiceNumber;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private InvoiceCompany company;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoiceDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private OffsetDateTime invoiceDate;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "totalAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private BigDecimal totalAmount;

  public static final String SERIALIZED_NAME_PAID_DATE = "paidDate";
  @SerializedName(SERIALIZED_NAME_PAID_DATE)
  private OffsetDateTime paidDate;

  public static final String SERIALIZED_NAME_PAID_AMOUNT = "paidAmount";
  @SerializedName(SERIALIZED_NAME_PAID_AMOUNT)
  private BigDecimal paidAmount;

  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private Long customerNumber;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private InvoiceStatus status;

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private OffsetDateTime dueDate;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private InvoiceType type;

  public static final String SERIALIZED_NAME_BATCH_NUMBER = "batchNumber";
  @SerializedName(SERIALIZED_NAME_BATCH_NUMBER)
  private String batchNumber;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private ImpSSIInvoiceCategory category;

  public static final String SERIALIZED_NAME_BASE_AMOUNT = "baseAmount";
  @SerializedName(SERIALIZED_NAME_BASE_AMOUNT)
  private BigDecimal baseAmount;

  public static final String SERIALIZED_NAME_AR_SEGMENT1 = "arSegment1";
  @SerializedName(SERIALIZED_NAME_AR_SEGMENT1)
  private String arSegment1;

  public static final String SERIALIZED_NAME_AR_SEGMENT2 = "arSegment2";
  @SerializedName(SERIALIZED_NAME_AR_SEGMENT2)
  private String arSegment2;

  public static final String SERIALIZED_NAME_AR_SEGMENT3 = "arSegment3";
  @SerializedName(SERIALIZED_NAME_AR_SEGMENT3)
  private String arSegment3;

  public static final String SERIALIZED_NAME_AR_SEGMENT4 = "arSegment4";
  @SerializedName(SERIALIZED_NAME_AR_SEGMENT4)
  private String arSegment4;

  public static final String SERIALIZED_NAME_AR_SEGMENT5 = "arSegment5";
  @SerializedName(SERIALIZED_NAME_AR_SEGMENT5)
  private String arSegment5;

  public static final String SERIALIZED_NAME_PAYMENT_TERMS = "paymentTerms";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERMS)
  private PaymentTerms paymentTerms;

  public static final String SERIALIZED_NAME_POST_FLAG = "postFlag";
  @SerializedName(SERIALIZED_NAME_POST_FLAG)
  private String postFlag;

  public static final String SERIALIZED_NAME_LOCK_FLAG = "lockFlag";
  @SerializedName(SERIALIZED_NAME_LOCK_FLAG)
  private Boolean lockFlag;

  public static final String SERIALIZED_NAME_VOID_DATE = "voidDate";
  @SerializedName(SERIALIZED_NAME_VOID_DATE)
  private OffsetDateTime voidDate;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_ORDER_DATE = "orderDate";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE)
  private OffsetDateTime orderDate;

  public static final String SERIALIZED_NAME_LAST_PRINT_DATE = "lastPrintDate";
  @SerializedName(SERIALIZED_NAME_LAST_PRINT_DATE)
  private OffsetDateTime lastPrintDate;

  public static final String SERIALIZED_NAME_CONTACT_FIRST_NAME = "contactFirstName";
  @SerializedName(SERIALIZED_NAME_CONTACT_FIRST_NAME)
  private String contactFirstName;

  public static final String SERIALIZED_NAME_CONTACT_LAST_NAME = "contactLastName";
  @SerializedName(SERIALIZED_NAME_CONTACT_LAST_NAME)
  private String contactLastName;

  public static final String SERIALIZED_NAME_RESERVATION_LOCATION = "reservationLocation";
  @SerializedName(SERIALIZED_NAME_RESERVATION_LOCATION)
  private String reservationLocation;

  public static final String SERIALIZED_NAME_ADD_USER_ID = "addUserId";
  @SerializedName(SERIALIZED_NAME_ADD_USER_ID)
  private String addUserId;

  public static final String SERIALIZED_NAME_EXECUTIVE_SERIES_INVOICE_NUMBER = "executiveSeriesInvoiceNumber";
  @SerializedName(SERIALIZED_NAME_EXECUTIVE_SERIES_INVOICE_NUMBER)
  private Long executiveSeriesInvoiceNumber;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_INVOICE_DETAILS = "invoiceDetails";
  @SerializedName(SERIALIZED_NAME_INVOICE_DETAILS)
  private List<InvoiceDetail> invoiceDetails = null;

  public static final String SERIALIZED_NAME_MODIFY_DATE = "modifyDate";
  @SerializedName(SERIALIZED_NAME_MODIFY_DATE)
  private OffsetDateTime modifyDate;

  public static final String SERIALIZED_NAME_SYNC_SOURCE = "syncSource";
  @SerializedName(SERIALIZED_NAME_SYNC_SOURCE)
  private SyncSource syncSource;

  public static final String SERIALIZED_NAME_RECEIPT_DETAILS = "receiptDetails";
  @SerializedName(SERIALIZED_NAME_RECEIPT_DETAILS)
  private List<ReceiptDetail> receiptDetails = null;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public Invoice() { 
  }

  public Invoice invoiceNumber(Long invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(Long invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public Invoice company(InvoiceCompany company) {
    
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


  public Invoice invoiceDate(OffsetDateTime invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getInvoiceDate() {
    return invoiceDate;
  }


  public void setInvoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public Invoice totalAmount(BigDecimal totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }


  public Invoice paidDate(OffsetDateTime paidDate) {
    
    this.paidDate = paidDate;
    return this;
  }

   /**
   * Get paidDate
   * @return paidDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getPaidDate() {
    return paidDate;
  }


  public void setPaidDate(OffsetDateTime paidDate) {
    this.paidDate = paidDate;
  }


  public Invoice paidAmount(BigDecimal paidAmount) {
    
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


  public Invoice customerNumber(Long customerNumber) {
    
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


  public Invoice status(InvoiceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvoiceStatus getStatus() {
    return status;
  }


  public void setStatus(InvoiceStatus status) {
    this.status = status;
  }


  public Invoice dueDate(OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  public Invoice type(InvoiceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvoiceType getType() {
    return type;
  }


  public void setType(InvoiceType type) {
    this.type = type;
  }


  public Invoice batchNumber(String batchNumber) {
    
    this.batchNumber = batchNumber;
    return this;
  }

   /**
   * Get batchNumber
   * @return batchNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBatchNumber() {
    return batchNumber;
  }


  public void setBatchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
  }


  public Invoice category(ImpSSIInvoiceCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ImpSSIInvoiceCategory getCategory() {
    return category;
  }


  public void setCategory(ImpSSIInvoiceCategory category) {
    this.category = category;
  }


  public Invoice baseAmount(BigDecimal baseAmount) {
    
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


  public Invoice arSegment1(String arSegment1) {
    
    this.arSegment1 = arSegment1;
    return this;
  }

   /**
   * Get arSegment1
   * @return arSegment1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArSegment1() {
    return arSegment1;
  }


  public void setArSegment1(String arSegment1) {
    this.arSegment1 = arSegment1;
  }


  public Invoice arSegment2(String arSegment2) {
    
    this.arSegment2 = arSegment2;
    return this;
  }

   /**
   * Get arSegment2
   * @return arSegment2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArSegment2() {
    return arSegment2;
  }


  public void setArSegment2(String arSegment2) {
    this.arSegment2 = arSegment2;
  }


  public Invoice arSegment3(String arSegment3) {
    
    this.arSegment3 = arSegment3;
    return this;
  }

   /**
   * Get arSegment3
   * @return arSegment3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArSegment3() {
    return arSegment3;
  }


  public void setArSegment3(String arSegment3) {
    this.arSegment3 = arSegment3;
  }


  public Invoice arSegment4(String arSegment4) {
    
    this.arSegment4 = arSegment4;
    return this;
  }

   /**
   * Get arSegment4
   * @return arSegment4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArSegment4() {
    return arSegment4;
  }


  public void setArSegment4(String arSegment4) {
    this.arSegment4 = arSegment4;
  }


  public Invoice arSegment5(String arSegment5) {
    
    this.arSegment5 = arSegment5;
    return this;
  }

   /**
   * Get arSegment5
   * @return arSegment5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArSegment5() {
    return arSegment5;
  }


  public void setArSegment5(String arSegment5) {
    this.arSegment5 = arSegment5;
  }


  public Invoice paymentTerms(PaymentTerms paymentTerms) {
    
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * Get paymentTerms
   * @return paymentTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentTerms getPaymentTerms() {
    return paymentTerms;
  }


  public void setPaymentTerms(PaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }


  public Invoice postFlag(String postFlag) {
    
    this.postFlag = postFlag;
    return this;
  }

   /**
   * Get postFlag
   * @return postFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostFlag() {
    return postFlag;
  }


  public void setPostFlag(String postFlag) {
    this.postFlag = postFlag;
  }


  public Invoice lockFlag(Boolean lockFlag) {
    
    this.lockFlag = lockFlag;
    return this;
  }

   /**
   * Get lockFlag
   * @return lockFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLockFlag() {
    return lockFlag;
  }


  public void setLockFlag(Boolean lockFlag) {
    this.lockFlag = lockFlag;
  }


  public Invoice voidDate(OffsetDateTime voidDate) {
    
    this.voidDate = voidDate;
    return this;
  }

   /**
   * Get voidDate
   * @return voidDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getVoidDate() {
    return voidDate;
  }


  public void setVoidDate(OffsetDateTime voidDate) {
    this.voidDate = voidDate;
  }


  public Invoice orderNumber(Long orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
  }


  public Invoice orderDate(OffsetDateTime orderDate) {
    
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Get orderDate
   * @return orderDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getOrderDate() {
    return orderDate;
  }


  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }


  public Invoice lastPrintDate(OffsetDateTime lastPrintDate) {
    
    this.lastPrintDate = lastPrintDate;
    return this;
  }

   /**
   * Get lastPrintDate
   * @return lastPrintDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastPrintDate() {
    return lastPrintDate;
  }


  public void setLastPrintDate(OffsetDateTime lastPrintDate) {
    this.lastPrintDate = lastPrintDate;
  }


  public Invoice contactFirstName(String contactFirstName) {
    
    this.contactFirstName = contactFirstName;
    return this;
  }

   /**
   * Get contactFirstName
   * @return contactFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContactFirstName() {
    return contactFirstName;
  }


  public void setContactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }


  public Invoice contactLastName(String contactLastName) {
    
    this.contactLastName = contactLastName;
    return this;
  }

   /**
   * Get contactLastName
   * @return contactLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContactLastName() {
    return contactLastName;
  }


  public void setContactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
  }


  public Invoice reservationLocation(String reservationLocation) {
    
    this.reservationLocation = reservationLocation;
    return this;
  }

   /**
   * Get reservationLocation
   * @return reservationLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReservationLocation() {
    return reservationLocation;
  }


  public void setReservationLocation(String reservationLocation) {
    this.reservationLocation = reservationLocation;
  }


  public Invoice addUserId(String addUserId) {
    
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


  public Invoice executiveSeriesInvoiceNumber(Long executiveSeriesInvoiceNumber) {
    
    this.executiveSeriesInvoiceNumber = executiveSeriesInvoiceNumber;
    return this;
  }

   /**
   * Get executiveSeriesInvoiceNumber
   * @return executiveSeriesInvoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getExecutiveSeriesInvoiceNumber() {
    return executiveSeriesInvoiceNumber;
  }


  public void setExecutiveSeriesInvoiceNumber(Long executiveSeriesInvoiceNumber) {
    this.executiveSeriesInvoiceNumber = executiveSeriesInvoiceNumber;
  }


  public Invoice order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }


  public Invoice invoiceDetails(List<InvoiceDetail> invoiceDetails) {
    
    this.invoiceDetails = invoiceDetails;
    return this;
  }

  public Invoice addInvoiceDetailsItem(InvoiceDetail invoiceDetailsItem) {
    if (this.invoiceDetails == null) {
      this.invoiceDetails = new ArrayList<>();
    }
    this.invoiceDetails.add(invoiceDetailsItem);
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InvoiceDetail> getInvoiceDetails() {
    return invoiceDetails;
  }


  public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }


  public Invoice modifyDate(OffsetDateTime modifyDate) {
    
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


  public Invoice syncSource(SyncSource syncSource) {
    
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


  public Invoice receiptDetails(List<ReceiptDetail> receiptDetails) {
    
    this.receiptDetails = receiptDetails;
    return this;
  }

  public Invoice addReceiptDetailsItem(ReceiptDetail receiptDetailsItem) {
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


  public Invoice customer(Customer customer) {
    
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
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.company, invoice.company) &&
        Objects.equals(this.invoiceDate, invoice.invoiceDate) &&
        Objects.equals(this.totalAmount, invoice.totalAmount) &&
        Objects.equals(this.paidDate, invoice.paidDate) &&
        Objects.equals(this.paidAmount, invoice.paidAmount) &&
        Objects.equals(this.customerNumber, invoice.customerNumber) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.dueDate, invoice.dueDate) &&
        Objects.equals(this.type, invoice.type) &&
        Objects.equals(this.batchNumber, invoice.batchNumber) &&
        Objects.equals(this.category, invoice.category) &&
        Objects.equals(this.baseAmount, invoice.baseAmount) &&
        Objects.equals(this.arSegment1, invoice.arSegment1) &&
        Objects.equals(this.arSegment2, invoice.arSegment2) &&
        Objects.equals(this.arSegment3, invoice.arSegment3) &&
        Objects.equals(this.arSegment4, invoice.arSegment4) &&
        Objects.equals(this.arSegment5, invoice.arSegment5) &&
        Objects.equals(this.paymentTerms, invoice.paymentTerms) &&
        Objects.equals(this.postFlag, invoice.postFlag) &&
        Objects.equals(this.lockFlag, invoice.lockFlag) &&
        Objects.equals(this.voidDate, invoice.voidDate) &&
        Objects.equals(this.orderNumber, invoice.orderNumber) &&
        Objects.equals(this.orderDate, invoice.orderDate) &&
        Objects.equals(this.lastPrintDate, invoice.lastPrintDate) &&
        Objects.equals(this.contactFirstName, invoice.contactFirstName) &&
        Objects.equals(this.contactLastName, invoice.contactLastName) &&
        Objects.equals(this.reservationLocation, invoice.reservationLocation) &&
        Objects.equals(this.addUserId, invoice.addUserId) &&
        Objects.equals(this.executiveSeriesInvoiceNumber, invoice.executiveSeriesInvoiceNumber) &&
        Objects.equals(this.order, invoice.order) &&
        Objects.equals(this.invoiceDetails, invoice.invoiceDetails) &&
        Objects.equals(this.modifyDate, invoice.modifyDate) &&
        Objects.equals(this.syncSource, invoice.syncSource) &&
        Objects.equals(this.receiptDetails, invoice.receiptDetails) &&
        Objects.equals(this.customer, invoice.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, company, invoiceDate, totalAmount, paidDate, paidAmount, customerNumber, status, dueDate, type, batchNumber, category, baseAmount, arSegment1, arSegment2, arSegment3, arSegment4, arSegment5, paymentTerms, postFlag, lockFlag, voidDate, orderNumber, orderDate, lastPrintDate, contactFirstName, contactLastName, reservationLocation, addUserId, executiveSeriesInvoiceNumber, order, invoiceDetails, modifyDate, syncSource, receiptDetails, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    paidDate: ").append(toIndentedString(paidDate)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    arSegment1: ").append(toIndentedString(arSegment1)).append("\n");
    sb.append("    arSegment2: ").append(toIndentedString(arSegment2)).append("\n");
    sb.append("    arSegment3: ").append(toIndentedString(arSegment3)).append("\n");
    sb.append("    arSegment4: ").append(toIndentedString(arSegment4)).append("\n");
    sb.append("    arSegment5: ").append(toIndentedString(arSegment5)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    postFlag: ").append(toIndentedString(postFlag)).append("\n");
    sb.append("    lockFlag: ").append(toIndentedString(lockFlag)).append("\n");
    sb.append("    voidDate: ").append(toIndentedString(voidDate)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    lastPrintDate: ").append(toIndentedString(lastPrintDate)).append("\n");
    sb.append("    contactFirstName: ").append(toIndentedString(contactFirstName)).append("\n");
    sb.append("    contactLastName: ").append(toIndentedString(contactLastName)).append("\n");
    sb.append("    reservationLocation: ").append(toIndentedString(reservationLocation)).append("\n");
    sb.append("    addUserId: ").append(toIndentedString(addUserId)).append("\n");
    sb.append("    executiveSeriesInvoiceNumber: ").append(toIndentedString(executiveSeriesInvoiceNumber)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    syncSource: ").append(toIndentedString(syncSource)).append("\n");
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
    openapiFields.add("invoiceNumber");
    openapiFields.add("company");
    openapiFields.add("invoiceDate");
    openapiFields.add("totalAmount");
    openapiFields.add("paidDate");
    openapiFields.add("paidAmount");
    openapiFields.add("customerNumber");
    openapiFields.add("status");
    openapiFields.add("dueDate");
    openapiFields.add("type");
    openapiFields.add("batchNumber");
    openapiFields.add("category");
    openapiFields.add("baseAmount");
    openapiFields.add("arSegment1");
    openapiFields.add("arSegment2");
    openapiFields.add("arSegment3");
    openapiFields.add("arSegment4");
    openapiFields.add("arSegment5");
    openapiFields.add("paymentTerms");
    openapiFields.add("postFlag");
    openapiFields.add("lockFlag");
    openapiFields.add("voidDate");
    openapiFields.add("orderNumber");
    openapiFields.add("orderDate");
    openapiFields.add("lastPrintDate");
    openapiFields.add("contactFirstName");
    openapiFields.add("contactLastName");
    openapiFields.add("reservationLocation");
    openapiFields.add("addUserId");
    openapiFields.add("executiveSeriesInvoiceNumber");
    openapiFields.add("order");
    openapiFields.add("invoiceDetails");
    openapiFields.add("modifyDate");
    openapiFields.add("syncSource");
    openapiFields.add("receiptDetails");
    openapiFields.add("customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("company");
    openapiRequiredFields.add("invoiceDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Invoice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Invoice.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Invoice is not found in the empty JSON string", Invoice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Invoice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Invoice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Invoice.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("batchNumber") != null && !jsonObj.get("batchNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batchNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batchNumber").toString()));
      }
      if (jsonObj.get("arSegment1") != null && !jsonObj.get("arSegment1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arSegment1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arSegment1").toString()));
      }
      if (jsonObj.get("arSegment2") != null && !jsonObj.get("arSegment2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arSegment2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arSegment2").toString()));
      }
      if (jsonObj.get("arSegment3") != null && !jsonObj.get("arSegment3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arSegment3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arSegment3").toString()));
      }
      if (jsonObj.get("arSegment4") != null && !jsonObj.get("arSegment4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arSegment4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arSegment4").toString()));
      }
      if (jsonObj.get("arSegment5") != null && !jsonObj.get("arSegment5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arSegment5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arSegment5").toString()));
      }
      if (jsonObj.get("postFlag") != null && !jsonObj.get("postFlag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postFlag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postFlag").toString()));
      }
      if (jsonObj.get("contactFirstName") != null && !jsonObj.get("contactFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactFirstName").toString()));
      }
      if (jsonObj.get("contactLastName") != null && !jsonObj.get("contactLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactLastName").toString()));
      }
      if (jsonObj.get("reservationLocation") != null && !jsonObj.get("reservationLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reservationLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reservationLocation").toString()));
      }
      if (jsonObj.get("addUserId") != null && !jsonObj.get("addUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addUserId").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.getAsJsonObject("order") != null) {
        Order.validateJsonObject(jsonObj.getAsJsonObject("order"));
      }
      JsonArray jsonArrayinvoiceDetails = jsonObj.getAsJsonArray("invoiceDetails");
      if (jsonArrayinvoiceDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("invoiceDetails").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `invoiceDetails` to be an array in the JSON string but got `%s`", jsonObj.get("invoiceDetails").toString()));
        }

        // validate the optional field `invoiceDetails` (array)
        for (int i = 0; i < jsonArrayinvoiceDetails.size(); i++) {
          InvoiceDetail.validateJsonObject(jsonArrayinvoiceDetails.get(i).getAsJsonObject());
        };
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
       if (!Invoice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Invoice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Invoice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Invoice.class));

       return (TypeAdapter<T>) new TypeAdapter<Invoice>() {
           @Override
           public void write(JsonWriter out, Invoice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Invoice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Invoice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Invoice
  * @throws IOException if the JSON string is invalid with respect to Invoice
  */
  public static Invoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Invoice.class);
  }

 /**
  * Convert an instance of Invoice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.sightsound.sdk.ticketing.model.Invoice;
import com.sightsound.sdk.ticketing.model.InvoiceCompany;
import com.sightsound.sdk.ticketing.model.InvoiceStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * InvoiceDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T16:06:07.372728-05:00[America/Chicago]")
public class InvoiceDetail {
  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private Long invoiceNumber;

  public static final String SERIALIZED_NAME_INVOICE_SEQ_NUMBER = "invoiceSeqNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_SEQ_NUMBER)
  private Integer invoiceSeqNumber;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private InvoiceCompany company;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SKU_CODE = "skuCode";
  @SerializedName(SERIALIZED_NAME_SKU_CODE)
  private String skuCode;

  public static final String SERIALIZED_NAME_GL_PERIOD = "glPeriod";
  @SerializedName(SERIALIZED_NAME_GL_PERIOD)
  private Integer glPeriod;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Integer units;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_TOTAL_COST = "totalCost";
  @SerializedName(SERIALIZED_NAME_TOTAL_COST)
  private BigDecimal totalCost;

  public static final String SERIALIZED_NAME_CR_SEGMENT1 = "crSegment1";
  @SerializedName(SERIALIZED_NAME_CR_SEGMENT1)
  private String crSegment1;

  public static final String SERIALIZED_NAME_CR_SEGMENT2 = "crSegment2";
  @SerializedName(SERIALIZED_NAME_CR_SEGMENT2)
  private String crSegment2;

  public static final String SERIALIZED_NAME_CR_SEGMENT3 = "crSegment3";
  @SerializedName(SERIALIZED_NAME_CR_SEGMENT3)
  private String crSegment3;

  public static final String SERIALIZED_NAME_CR_SEGMENT4 = "crSegment4";
  @SerializedName(SERIALIZED_NAME_CR_SEGMENT4)
  private String crSegment4;

  public static final String SERIALIZED_NAME_CR_SEGMENT5 = "crSegment5";
  @SerializedName(SERIALIZED_NAME_CR_SEGMENT5)
  private String crSegment5;

  public static final String SERIALIZED_NAME_GLT_COMPANY = "gltCompany";
  @SerializedName(SERIALIZED_NAME_GLT_COMPANY)
  private InvoiceCompany gltCompany;

  public static final String SERIALIZED_NAME_GLT_NUMBER = "gltNumber";
  @SerializedName(SERIALIZED_NAME_GLT_NUMBER)
  private Integer gltNumber;

  public static final String SERIALIZED_NAME_BASE_AMOUNT = "baseAmount";
  @SerializedName(SERIALIZED_NAME_BASE_AMOUNT)
  private BigDecimal baseAmount;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_LOCATION_C_D = "locationCD";
  @SerializedName(SERIALIZED_NAME_LOCATION_C_D)
  private String locationCD;

  public static final String SERIALIZED_NAME_LINE_TYPE = "lineType";
  @SerializedName(SERIALIZED_NAME_LINE_TYPE)
  private String lineType;

  public static final String SERIALIZED_NAME_INVENTORY_COST = "inventoryCost";
  @SerializedName(SERIALIZED_NAME_INVENTORY_COST)
  private BigDecimal inventoryCost;

  public static final String SERIALIZED_NAME_AVERAGE_COST = "averageCost";
  @SerializedName(SERIALIZED_NAME_AVERAGE_COST)
  private BigDecimal averageCost;

  public static final String SERIALIZED_NAME_VOID_STATUS = "voidStatus";
  @SerializedName(SERIALIZED_NAME_VOID_STATUS)
  private InvoiceStatus voidStatus;

  public static final String SERIALIZED_NAME_EVENT_DATE = "eventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private OffsetDateTime eventDate;

  public static final String SERIALIZED_NAME_PROCESS_DATE = "processDate";
  @SerializedName(SERIALIZED_NAME_PROCESS_DATE)
  private OffsetDateTime processDate;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "itemNumber";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private Integer itemNumber;

  public static final String SERIALIZED_NAME_MODIFY_DATE = "modifyDate";
  @SerializedName(SERIALIZED_NAME_MODIFY_DATE)
  private OffsetDateTime modifyDate;

  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  private Invoice invoice;

  public InvoiceDetail() { 
  }

  public InvoiceDetail invoiceNumber(Long invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(Long invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public InvoiceDetail invoiceSeqNumber(Integer invoiceSeqNumber) {
    
    this.invoiceSeqNumber = invoiceSeqNumber;
    return this;
  }

   /**
   * Get invoiceSeqNumber
   * @return invoiceSeqNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getInvoiceSeqNumber() {
    return invoiceSeqNumber;
  }


  public void setInvoiceSeqNumber(Integer invoiceSeqNumber) {
    this.invoiceSeqNumber = invoiceSeqNumber;
  }


  public InvoiceDetail company(InvoiceCompany company) {
    
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


  public InvoiceDetail description(String description) {
    
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


  public InvoiceDetail skuCode(String skuCode) {
    
    this.skuCode = skuCode;
    return this;
  }

   /**
   * Get skuCode
   * @return skuCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSkuCode() {
    return skuCode;
  }


  public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
  }


  public InvoiceDetail glPeriod(Integer glPeriod) {
    
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


  public InvoiceDetail units(Integer units) {
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnits() {
    return units;
  }


  public void setUnits(Integer units) {
    this.units = units;
  }


  public InvoiceDetail rate(BigDecimal rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getRate() {
    return rate;
  }


  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }


  public InvoiceDetail totalCost(BigDecimal totalCost) {
    
    this.totalCost = totalCost;
    return this;
  }

   /**
   * Get totalCost
   * @return totalCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalCost() {
    return totalCost;
  }


  public void setTotalCost(BigDecimal totalCost) {
    this.totalCost = totalCost;
  }


  public InvoiceDetail crSegment1(String crSegment1) {
    
    this.crSegment1 = crSegment1;
    return this;
  }

   /**
   * Get crSegment1
   * @return crSegment1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCrSegment1() {
    return crSegment1;
  }


  public void setCrSegment1(String crSegment1) {
    this.crSegment1 = crSegment1;
  }


  public InvoiceDetail crSegment2(String crSegment2) {
    
    this.crSegment2 = crSegment2;
    return this;
  }

   /**
   * Get crSegment2
   * @return crSegment2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCrSegment2() {
    return crSegment2;
  }


  public void setCrSegment2(String crSegment2) {
    this.crSegment2 = crSegment2;
  }


  public InvoiceDetail crSegment3(String crSegment3) {
    
    this.crSegment3 = crSegment3;
    return this;
  }

   /**
   * Get crSegment3
   * @return crSegment3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCrSegment3() {
    return crSegment3;
  }


  public void setCrSegment3(String crSegment3) {
    this.crSegment3 = crSegment3;
  }


  public InvoiceDetail crSegment4(String crSegment4) {
    
    this.crSegment4 = crSegment4;
    return this;
  }

   /**
   * Get crSegment4
   * @return crSegment4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCrSegment4() {
    return crSegment4;
  }


  public void setCrSegment4(String crSegment4) {
    this.crSegment4 = crSegment4;
  }


  public InvoiceDetail crSegment5(String crSegment5) {
    
    this.crSegment5 = crSegment5;
    return this;
  }

   /**
   * Get crSegment5
   * @return crSegment5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCrSegment5() {
    return crSegment5;
  }


  public void setCrSegment5(String crSegment5) {
    this.crSegment5 = crSegment5;
  }


  public InvoiceDetail gltCompany(InvoiceCompany gltCompany) {
    
    this.gltCompany = gltCompany;
    return this;
  }

   /**
   * Get gltCompany
   * @return gltCompany
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvoiceCompany getGltCompany() {
    return gltCompany;
  }


  public void setGltCompany(InvoiceCompany gltCompany) {
    this.gltCompany = gltCompany;
  }


  public InvoiceDetail gltNumber(Integer gltNumber) {
    
    this.gltNumber = gltNumber;
    return this;
  }

   /**
   * Get gltNumber
   * @return gltNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGltNumber() {
    return gltNumber;
  }


  public void setGltNumber(Integer gltNumber) {
    this.gltNumber = gltNumber;
  }


  public InvoiceDetail baseAmount(BigDecimal baseAmount) {
    
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


  public InvoiceDetail comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public InvoiceDetail locationCD(String locationCD) {
    
    this.locationCD = locationCD;
    return this;
  }

   /**
   * Get locationCD
   * @return locationCD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationCD() {
    return locationCD;
  }


  public void setLocationCD(String locationCD) {
    this.locationCD = locationCD;
  }


  public InvoiceDetail lineType(String lineType) {
    
    this.lineType = lineType;
    return this;
  }

   /**
   * Get lineType
   * @return lineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLineType() {
    return lineType;
  }


  public void setLineType(String lineType) {
    this.lineType = lineType;
  }


  public InvoiceDetail inventoryCost(BigDecimal inventoryCost) {
    
    this.inventoryCost = inventoryCost;
    return this;
  }

   /**
   * Get inventoryCost
   * @return inventoryCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getInventoryCost() {
    return inventoryCost;
  }


  public void setInventoryCost(BigDecimal inventoryCost) {
    this.inventoryCost = inventoryCost;
  }


  public InvoiceDetail averageCost(BigDecimal averageCost) {
    
    this.averageCost = averageCost;
    return this;
  }

   /**
   * Get averageCost
   * @return averageCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAverageCost() {
    return averageCost;
  }


  public void setAverageCost(BigDecimal averageCost) {
    this.averageCost = averageCost;
  }


  public InvoiceDetail voidStatus(InvoiceStatus voidStatus) {
    
    this.voidStatus = voidStatus;
    return this;
  }

   /**
   * Get voidStatus
   * @return voidStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvoiceStatus getVoidStatus() {
    return voidStatus;
  }


  public void setVoidStatus(InvoiceStatus voidStatus) {
    this.voidStatus = voidStatus;
  }


  public InvoiceDetail eventDate(OffsetDateTime eventDate) {
    
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Get eventDate
   * @return eventDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEventDate() {
    return eventDate;
  }


  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }


  public InvoiceDetail processDate(OffsetDateTime processDate) {
    
    this.processDate = processDate;
    return this;
  }

   /**
   * Get processDate
   * @return processDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getProcessDate() {
    return processDate;
  }


  public void setProcessDate(OffsetDateTime processDate) {
    this.processDate = processDate;
  }


  public InvoiceDetail itemNumber(Integer itemNumber) {
    
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * Get itemNumber
   * @return itemNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getItemNumber() {
    return itemNumber;
  }


  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }


  public InvoiceDetail modifyDate(OffsetDateTime modifyDate) {
    
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


  public InvoiceDetail invoice(Invoice invoice) {
    
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Invoice getInvoice() {
    return invoice;
  }


  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetail invoiceDetail = (InvoiceDetail) o;
    return Objects.equals(this.invoiceNumber, invoiceDetail.invoiceNumber) &&
        Objects.equals(this.invoiceSeqNumber, invoiceDetail.invoiceSeqNumber) &&
        Objects.equals(this.company, invoiceDetail.company) &&
        Objects.equals(this.description, invoiceDetail.description) &&
        Objects.equals(this.skuCode, invoiceDetail.skuCode) &&
        Objects.equals(this.glPeriod, invoiceDetail.glPeriod) &&
        Objects.equals(this.units, invoiceDetail.units) &&
        Objects.equals(this.rate, invoiceDetail.rate) &&
        Objects.equals(this.totalCost, invoiceDetail.totalCost) &&
        Objects.equals(this.crSegment1, invoiceDetail.crSegment1) &&
        Objects.equals(this.crSegment2, invoiceDetail.crSegment2) &&
        Objects.equals(this.crSegment3, invoiceDetail.crSegment3) &&
        Objects.equals(this.crSegment4, invoiceDetail.crSegment4) &&
        Objects.equals(this.crSegment5, invoiceDetail.crSegment5) &&
        Objects.equals(this.gltCompany, invoiceDetail.gltCompany) &&
        Objects.equals(this.gltNumber, invoiceDetail.gltNumber) &&
        Objects.equals(this.baseAmount, invoiceDetail.baseAmount) &&
        Objects.equals(this.comments, invoiceDetail.comments) &&
        Objects.equals(this.locationCD, invoiceDetail.locationCD) &&
        Objects.equals(this.lineType, invoiceDetail.lineType) &&
        Objects.equals(this.inventoryCost, invoiceDetail.inventoryCost) &&
        Objects.equals(this.averageCost, invoiceDetail.averageCost) &&
        Objects.equals(this.voidStatus, invoiceDetail.voidStatus) &&
        Objects.equals(this.eventDate, invoiceDetail.eventDate) &&
        Objects.equals(this.processDate, invoiceDetail.processDate) &&
        Objects.equals(this.itemNumber, invoiceDetail.itemNumber) &&
        Objects.equals(this.modifyDate, invoiceDetail.modifyDate) &&
        Objects.equals(this.invoice, invoiceDetail.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, invoiceSeqNumber, company, description, skuCode, glPeriod, units, rate, totalCost, crSegment1, crSegment2, crSegment3, crSegment4, crSegment5, gltCompany, gltNumber, baseAmount, comments, locationCD, lineType, inventoryCost, averageCost, voidStatus, eventDate, processDate, itemNumber, modifyDate, invoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetail {\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceSeqNumber: ").append(toIndentedString(invoiceSeqNumber)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skuCode: ").append(toIndentedString(skuCode)).append("\n");
    sb.append("    glPeriod: ").append(toIndentedString(glPeriod)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    crSegment1: ").append(toIndentedString(crSegment1)).append("\n");
    sb.append("    crSegment2: ").append(toIndentedString(crSegment2)).append("\n");
    sb.append("    crSegment3: ").append(toIndentedString(crSegment3)).append("\n");
    sb.append("    crSegment4: ").append(toIndentedString(crSegment4)).append("\n");
    sb.append("    crSegment5: ").append(toIndentedString(crSegment5)).append("\n");
    sb.append("    gltCompany: ").append(toIndentedString(gltCompany)).append("\n");
    sb.append("    gltNumber: ").append(toIndentedString(gltNumber)).append("\n");
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    locationCD: ").append(toIndentedString(locationCD)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    inventoryCost: ").append(toIndentedString(inventoryCost)).append("\n");
    sb.append("    averageCost: ").append(toIndentedString(averageCost)).append("\n");
    sb.append("    voidStatus: ").append(toIndentedString(voidStatus)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    processDate: ").append(toIndentedString(processDate)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
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
    openapiFields.add("invoiceSeqNumber");
    openapiFields.add("company");
    openapiFields.add("description");
    openapiFields.add("skuCode");
    openapiFields.add("glPeriod");
    openapiFields.add("units");
    openapiFields.add("rate");
    openapiFields.add("totalCost");
    openapiFields.add("crSegment1");
    openapiFields.add("crSegment2");
    openapiFields.add("crSegment3");
    openapiFields.add("crSegment4");
    openapiFields.add("crSegment5");
    openapiFields.add("gltCompany");
    openapiFields.add("gltNumber");
    openapiFields.add("baseAmount");
    openapiFields.add("comments");
    openapiFields.add("locationCD");
    openapiFields.add("lineType");
    openapiFields.add("inventoryCost");
    openapiFields.add("averageCost");
    openapiFields.add("voidStatus");
    openapiFields.add("eventDate");
    openapiFields.add("processDate");
    openapiFields.add("itemNumber");
    openapiFields.add("modifyDate");
    openapiFields.add("invoice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invoiceNumber");
    openapiRequiredFields.add("invoiceSeqNumber");
    openapiRequiredFields.add("company");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoiceDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetail is not found in the empty JSON string", InvoiceDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoiceDetail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("skuCode") != null && !jsonObj.get("skuCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skuCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skuCode").toString()));
      }
      if (jsonObj.get("crSegment1") != null && !jsonObj.get("crSegment1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crSegment1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crSegment1").toString()));
      }
      if (jsonObj.get("crSegment2") != null && !jsonObj.get("crSegment2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crSegment2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crSegment2").toString()));
      }
      if (jsonObj.get("crSegment3") != null && !jsonObj.get("crSegment3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crSegment3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crSegment3").toString()));
      }
      if (jsonObj.get("crSegment4") != null && !jsonObj.get("crSegment4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crSegment4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crSegment4").toString()));
      }
      if (jsonObj.get("crSegment5") != null && !jsonObj.get("crSegment5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crSegment5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crSegment5").toString()));
      }
      if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
      if (jsonObj.get("locationCD") != null && !jsonObj.get("locationCD").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCD` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCD").toString()));
      }
      if (jsonObj.get("lineType") != null && !jsonObj.get("lineType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineType").toString()));
      }
      // validate the optional field `invoice`
      if (jsonObj.getAsJsonObject("invoice") != null) {
        Invoice.validateJsonObject(jsonObj.getAsJsonObject("invoice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetail>() {
           @Override
           public void write(JsonWriter out, InvoiceDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetail
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetail
  */
  public static InvoiceDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetail.class);
  }

 /**
  * Convert an instance of InvoiceDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

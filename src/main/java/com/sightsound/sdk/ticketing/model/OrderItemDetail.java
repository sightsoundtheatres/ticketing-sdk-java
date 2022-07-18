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
import com.sightsound.sdk.ticketing.model.Designation;
import com.sightsound.sdk.ticketing.model.DiscountType;
import com.sightsound.sdk.ticketing.model.OrderItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

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
 * OrderItemDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T19:32:42.242731Z[Etc/UTC]")
public class OrderItemDetail {
  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "itemNumber";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private Integer itemNumber;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_MAN_DISCOUNT_COUNT = "manDiscountCount";
  @SerializedName(SERIALIZED_NAME_MAN_DISCOUNT_COUNT)
  private Integer manDiscountCount;

  public static final String SERIALIZED_NAME_SPECIAL_DISCOUNT_COUNT = "specialDiscountCount";
  @SerializedName(SERIALIZED_NAME_SPECIAL_DISCOUNT_COUNT)
  private Integer specialDiscountCount;

  public static final String SERIALIZED_NAME_DESIGNATION_CODE = "designationCode";
  @SerializedName(SERIALIZED_NAME_DESIGNATION_CODE)
  private Designation designationCode;

  public static final String SERIALIZED_NAME_SEAT_DISCOUNT_COUNT = "seatDiscountCount";
  @SerializedName(SERIALIZED_NAME_SEAT_DISCOUNT_COUNT)
  private Integer seatDiscountCount;

  public static final String SERIALIZED_NAME_SEAT_DISCOUNT_AMOUNT = "seatDiscountAmount";
  @SerializedName(SERIALIZED_NAME_SEAT_DISCOUNT_AMOUNT)
  private BigDecimal seatDiscountAmount;

  public static final String SERIALIZED_NAME_CUST_DISCOUNT_TYPE_CODE = "custDiscountTypeCode";
  @SerializedName(SERIALIZED_NAME_CUST_DISCOUNT_TYPE_CODE)
  private DiscountType custDiscountTypeCode;

  public static final String SERIALIZED_NAME_CUST_DISCOUNT_VALUE = "custDiscountValue";
  @SerializedName(SERIALIZED_NAME_CUST_DISCOUNT_VALUE)
  private BigDecimal custDiscountValue;

  public static final String SERIALIZED_NAME_SPECIAL_TYPE_CODE = "specialTypeCode";
  @SerializedName(SERIALIZED_NAME_SPECIAL_TYPE_CODE)
  private DiscountType specialTypeCode;

  public static final String SERIALIZED_NAME_SPECIAL_DISCOUNT_VALUE = "specialDiscountValue";
  @SerializedName(SERIALIZED_NAME_SPECIAL_DISCOUNT_VALUE)
  private BigDecimal specialDiscountValue;

  public static final String SERIALIZED_NAME_MAN_DISCOUNT_TYPE_CODE = "manDiscountTypeCode";
  @SerializedName(SERIALIZED_NAME_MAN_DISCOUNT_TYPE_CODE)
  private DiscountType manDiscountTypeCode;

  public static final String SERIALIZED_NAME_MAN_DISCOUNT_VALUE = "manDiscountValue";
  @SerializedName(SERIALIZED_NAME_MAN_DISCOUNT_VALUE)
  private BigDecimal manDiscountValue;

  public static final String SERIALIZED_NAME_CONFIRMED_COUNT = "confirmedCount";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_COUNT)
  private Integer confirmedCount;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private BigDecimal totalPrice;

  public static final String SERIALIZED_NAME_SPECIAL_DISCOUNT_TOTAL_AMOUNT = "specialDiscountTotalAmount";
  @SerializedName(SERIALIZED_NAME_SPECIAL_DISCOUNT_TOTAL_AMOUNT)
  private BigDecimal specialDiscountTotalAmount;

  public static final String SERIALIZED_NAME_MAN_DISCOUNT_TOTAL_AMOUNT = "manDiscountTotalAmount";
  @SerializedName(SERIALIZED_NAME_MAN_DISCOUNT_TOTAL_AMOUNT)
  private BigDecimal manDiscountTotalAmount;

  public static final String SERIALIZED_NAME_SEAT_DISCOUNT_TOTAL_AMOUNT = "seatDiscountTotalAmount";
  @SerializedName(SERIALIZED_NAME_SEAT_DISCOUNT_TOTAL_AMOUNT)
  private BigDecimal seatDiscountTotalAmount;

  public static final String SERIALIZED_NAME_CUST_DISCOUNT_TOTAL_AMOUNT = "custDiscountTotalAmount";
  @SerializedName(SERIALIZED_NAME_CUST_DISCOUNT_TOTAL_AMOUNT)
  private BigDecimal custDiscountTotalAmount;

  public static final String SERIALIZED_NAME_PRINTED_COUNT = "printedCount";
  @SerializedName(SERIALIZED_NAME_PRINTED_COUNT)
  private Integer printedCount;

  public static final String SERIALIZED_NAME_PRICE_VALUE = "priceValue";
  @SerializedName(SERIALIZED_NAME_PRICE_VALUE)
  private BigDecimal priceValue;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_COMP_COUNT = "compCount";
  @SerializedName(SERIALIZED_NAME_COMP_COUNT)
  private Integer compCount;

  public static final String SERIALIZED_NAME_GRATUITY = "gratuity";
  @SerializedName(SERIALIZED_NAME_GRATUITY)
  private BigDecimal gratuity;

  public static final String SERIALIZED_NAME_SS_MARGIN = "ssMargin";
  @SerializedName(SERIALIZED_NAME_SS_MARGIN)
  private BigDecimal ssMargin;

  public static final String SERIALIZED_NAME_CUST_DISCOUNT_COUNT = "custDiscountCount";
  @SerializedName(SERIALIZED_NAME_CUST_DISCOUNT_COUNT)
  private Integer custDiscountCount;

  public static final String SERIALIZED_NAME_ORDER_ITEM = "orderItem";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM)
  private OrderItem orderItem;

  public static final String SERIALIZED_NAME_DELTA_COUNT = "deltaCount";
  @SerializedName(SERIALIZED_NAME_DELTA_COUNT)
  private Integer deltaCount;

  public static final String SERIALIZED_NAME_PERSISTED = "persisted";
  @SerializedName(SERIALIZED_NAME_PERSISTED)
  private Boolean persisted;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;

  public static final String SERIALIZED_NAME_LIST_PRICE_WITH_DISCOUNTS = "listPriceWithDiscounts";
  @SerializedName(SERIALIZED_NAME_LIST_PRICE_WITH_DISCOUNTS)
  private BigDecimal listPriceWithDiscounts;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT = "totalDiscount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT)
  private BigDecimal totalDiscount;

  public static final String SERIALIZED_NAME_UNPRINTED_COUNT = "unprintedCount";
  @SerializedName(SERIALIZED_NAME_UNPRINTED_COUNT)
  private Integer unprintedCount;

  public static final String SERIALIZED_NAME_MAN_DISCOUNT_DOLLAR_AMOUNT = "manDiscountDollarAmount";
  @SerializedName(SERIALIZED_NAME_MAN_DISCOUNT_DOLLAR_AMOUNT)
  private BigDecimal manDiscountDollarAmount;

  public static final String SERIALIZED_NAME_SAVINGS = "savings";
  @SerializedName(SERIALIZED_NAME_SAVINGS)
  private BigDecimal savings;

  public static final String SERIALIZED_NAME_TOTAL_SAVINGS = "totalSavings";
  @SerializedName(SERIALIZED_NAME_TOTAL_SAVINGS)
  private BigDecimal totalSavings;

  public OrderItemDetail() { 
  }

  public OrderItemDetail orderNumber(Long orderNumber) {
    
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


  public OrderItemDetail itemNumber(Integer itemNumber) {
    
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


  public OrderItemDetail count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public OrderItemDetail manDiscountCount(Integer manDiscountCount) {
    
    this.manDiscountCount = manDiscountCount;
    return this;
  }

   /**
   * Get manDiscountCount
   * @return manDiscountCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getManDiscountCount() {
    return manDiscountCount;
  }


  public void setManDiscountCount(Integer manDiscountCount) {
    this.manDiscountCount = manDiscountCount;
  }


  public OrderItemDetail specialDiscountCount(Integer specialDiscountCount) {
    
    this.specialDiscountCount = specialDiscountCount;
    return this;
  }

   /**
   * Get specialDiscountCount
   * @return specialDiscountCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSpecialDiscountCount() {
    return specialDiscountCount;
  }


  public void setSpecialDiscountCount(Integer specialDiscountCount) {
    this.specialDiscountCount = specialDiscountCount;
  }


  public OrderItemDetail designationCode(Designation designationCode) {
    
    this.designationCode = designationCode;
    return this;
  }

   /**
   * Get designationCode
   * @return designationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Designation getDesignationCode() {
    return designationCode;
  }


  public void setDesignationCode(Designation designationCode) {
    this.designationCode = designationCode;
  }


  public OrderItemDetail seatDiscountCount(Integer seatDiscountCount) {
    
    this.seatDiscountCount = seatDiscountCount;
    return this;
  }

   /**
   * Get seatDiscountCount
   * @return seatDiscountCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeatDiscountCount() {
    return seatDiscountCount;
  }


  public void setSeatDiscountCount(Integer seatDiscountCount) {
    this.seatDiscountCount = seatDiscountCount;
  }


  public OrderItemDetail seatDiscountAmount(BigDecimal seatDiscountAmount) {
    
    this.seatDiscountAmount = seatDiscountAmount;
    return this;
  }

   /**
   * Get seatDiscountAmount
   * @return seatDiscountAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSeatDiscountAmount() {
    return seatDiscountAmount;
  }


  public void setSeatDiscountAmount(BigDecimal seatDiscountAmount) {
    this.seatDiscountAmount = seatDiscountAmount;
  }


  public OrderItemDetail custDiscountTypeCode(DiscountType custDiscountTypeCode) {
    
    this.custDiscountTypeCode = custDiscountTypeCode;
    return this;
  }

   /**
   * Get custDiscountTypeCode
   * @return custDiscountTypeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiscountType getCustDiscountTypeCode() {
    return custDiscountTypeCode;
  }


  public void setCustDiscountTypeCode(DiscountType custDiscountTypeCode) {
    this.custDiscountTypeCode = custDiscountTypeCode;
  }


  public OrderItemDetail custDiscountValue(BigDecimal custDiscountValue) {
    
    this.custDiscountValue = custDiscountValue;
    return this;
  }

   /**
   * Get custDiscountValue
   * @return custDiscountValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getCustDiscountValue() {
    return custDiscountValue;
  }


  public void setCustDiscountValue(BigDecimal custDiscountValue) {
    this.custDiscountValue = custDiscountValue;
  }


  public OrderItemDetail specialTypeCode(DiscountType specialTypeCode) {
    
    this.specialTypeCode = specialTypeCode;
    return this;
  }

   /**
   * Get specialTypeCode
   * @return specialTypeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiscountType getSpecialTypeCode() {
    return specialTypeCode;
  }


  public void setSpecialTypeCode(DiscountType specialTypeCode) {
    this.specialTypeCode = specialTypeCode;
  }


  public OrderItemDetail specialDiscountValue(BigDecimal specialDiscountValue) {
    
    this.specialDiscountValue = specialDiscountValue;
    return this;
  }

   /**
   * Get specialDiscountValue
   * @return specialDiscountValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSpecialDiscountValue() {
    return specialDiscountValue;
  }


  public void setSpecialDiscountValue(BigDecimal specialDiscountValue) {
    this.specialDiscountValue = specialDiscountValue;
  }


  public OrderItemDetail manDiscountTypeCode(DiscountType manDiscountTypeCode) {
    
    this.manDiscountTypeCode = manDiscountTypeCode;
    return this;
  }

   /**
   * Get manDiscountTypeCode
   * @return manDiscountTypeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiscountType getManDiscountTypeCode() {
    return manDiscountTypeCode;
  }


  public void setManDiscountTypeCode(DiscountType manDiscountTypeCode) {
    this.manDiscountTypeCode = manDiscountTypeCode;
  }


  public OrderItemDetail manDiscountValue(BigDecimal manDiscountValue) {
    
    this.manDiscountValue = manDiscountValue;
    return this;
  }

   /**
   * Get manDiscountValue
   * @return manDiscountValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getManDiscountValue() {
    return manDiscountValue;
  }


  public void setManDiscountValue(BigDecimal manDiscountValue) {
    this.manDiscountValue = manDiscountValue;
  }


  public OrderItemDetail confirmedCount(Integer confirmedCount) {
    
    this.confirmedCount = confirmedCount;
    return this;
  }

   /**
   * Get confirmedCount
   * @return confirmedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getConfirmedCount() {
    return confirmedCount;
  }


  public void setConfirmedCount(Integer confirmedCount) {
    this.confirmedCount = confirmedCount;
  }


  public OrderItemDetail totalPrice(BigDecimal totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalPrice() {
    return totalPrice;
  }


  public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }


  public OrderItemDetail specialDiscountTotalAmount(BigDecimal specialDiscountTotalAmount) {
    
    this.specialDiscountTotalAmount = specialDiscountTotalAmount;
    return this;
  }

   /**
   * Get specialDiscountTotalAmount
   * @return specialDiscountTotalAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSpecialDiscountTotalAmount() {
    return specialDiscountTotalAmount;
  }


  public void setSpecialDiscountTotalAmount(BigDecimal specialDiscountTotalAmount) {
    this.specialDiscountTotalAmount = specialDiscountTotalAmount;
  }


  public OrderItemDetail manDiscountTotalAmount(BigDecimal manDiscountTotalAmount) {
    
    this.manDiscountTotalAmount = manDiscountTotalAmount;
    return this;
  }

   /**
   * Get manDiscountTotalAmount
   * @return manDiscountTotalAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getManDiscountTotalAmount() {
    return manDiscountTotalAmount;
  }


  public void setManDiscountTotalAmount(BigDecimal manDiscountTotalAmount) {
    this.manDiscountTotalAmount = manDiscountTotalAmount;
  }


  public OrderItemDetail seatDiscountTotalAmount(BigDecimal seatDiscountTotalAmount) {
    
    this.seatDiscountTotalAmount = seatDiscountTotalAmount;
    return this;
  }

   /**
   * Get seatDiscountTotalAmount
   * @return seatDiscountTotalAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSeatDiscountTotalAmount() {
    return seatDiscountTotalAmount;
  }


  public void setSeatDiscountTotalAmount(BigDecimal seatDiscountTotalAmount) {
    this.seatDiscountTotalAmount = seatDiscountTotalAmount;
  }


  public OrderItemDetail custDiscountTotalAmount(BigDecimal custDiscountTotalAmount) {
    
    this.custDiscountTotalAmount = custDiscountTotalAmount;
    return this;
  }

   /**
   * Get custDiscountTotalAmount
   * @return custDiscountTotalAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getCustDiscountTotalAmount() {
    return custDiscountTotalAmount;
  }


  public void setCustDiscountTotalAmount(BigDecimal custDiscountTotalAmount) {
    this.custDiscountTotalAmount = custDiscountTotalAmount;
  }


  public OrderItemDetail printedCount(Integer printedCount) {
    
    this.printedCount = printedCount;
    return this;
  }

   /**
   * Get printedCount
   * @return printedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPrintedCount() {
    return printedCount;
  }


  public void setPrintedCount(Integer printedCount) {
    this.printedCount = printedCount;
  }


  public OrderItemDetail priceValue(BigDecimal priceValue) {
    
    this.priceValue = priceValue;
    return this;
  }

   /**
   * Get priceValue
   * @return priceValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPriceValue() {
    return priceValue;
  }


  public void setPriceValue(BigDecimal priceValue) {
    this.priceValue = priceValue;
  }


  public OrderItemDetail price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public OrderItemDetail compCount(Integer compCount) {
    
    this.compCount = compCount;
    return this;
  }

   /**
   * Get compCount
   * @return compCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCompCount() {
    return compCount;
  }


  public void setCompCount(Integer compCount) {
    this.compCount = compCount;
  }


  public OrderItemDetail gratuity(BigDecimal gratuity) {
    
    this.gratuity = gratuity;
    return this;
  }

   /**
   * Get gratuity
   * @return gratuity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getGratuity() {
    return gratuity;
  }


  public void setGratuity(BigDecimal gratuity) {
    this.gratuity = gratuity;
  }


  public OrderItemDetail ssMargin(BigDecimal ssMargin) {
    
    this.ssMargin = ssMargin;
    return this;
  }

   /**
   * Get ssMargin
   * @return ssMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSsMargin() {
    return ssMargin;
  }


  public void setSsMargin(BigDecimal ssMargin) {
    this.ssMargin = ssMargin;
  }


  public OrderItemDetail custDiscountCount(Integer custDiscountCount) {
    
    this.custDiscountCount = custDiscountCount;
    return this;
  }

   /**
   * Get custDiscountCount
   * @return custDiscountCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCustDiscountCount() {
    return custDiscountCount;
  }


  public void setCustDiscountCount(Integer custDiscountCount) {
    this.custDiscountCount = custDiscountCount;
  }


  public OrderItemDetail orderItem(OrderItem orderItem) {
    
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


  public OrderItemDetail deltaCount(Integer deltaCount) {
    
    this.deltaCount = deltaCount;
    return this;
  }

   /**
   * Get deltaCount
   * @return deltaCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDeltaCount() {
    return deltaCount;
  }


  public void setDeltaCount(Integer deltaCount) {
    this.deltaCount = deltaCount;
  }


  public OrderItemDetail persisted(Boolean persisted) {
    
    this.persisted = persisted;
    return this;
  }

   /**
   * Get persisted
   * @return persisted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPersisted() {
    return persisted;
  }


  public void setPersisted(Boolean persisted) {
    this.persisted = persisted;
  }


  public OrderItemDetail _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }


  public OrderItemDetail listPriceWithDiscounts(BigDecimal listPriceWithDiscounts) {
    
    this.listPriceWithDiscounts = listPriceWithDiscounts;
    return this;
  }

   /**
   * Get listPriceWithDiscounts
   * @return listPriceWithDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getListPriceWithDiscounts() {
    return listPriceWithDiscounts;
  }


  public void setListPriceWithDiscounts(BigDecimal listPriceWithDiscounts) {
    this.listPriceWithDiscounts = listPriceWithDiscounts;
  }


  public OrderItemDetail totalDiscount(BigDecimal totalDiscount) {
    
    this.totalDiscount = totalDiscount;
    return this;
  }

   /**
   * Get totalDiscount
   * @return totalDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalDiscount() {
    return totalDiscount;
  }


  public void setTotalDiscount(BigDecimal totalDiscount) {
    this.totalDiscount = totalDiscount;
  }


  public OrderItemDetail unprintedCount(Integer unprintedCount) {
    
    this.unprintedCount = unprintedCount;
    return this;
  }

   /**
   * Get unprintedCount
   * @return unprintedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnprintedCount() {
    return unprintedCount;
  }


  public void setUnprintedCount(Integer unprintedCount) {
    this.unprintedCount = unprintedCount;
  }


  public OrderItemDetail manDiscountDollarAmount(BigDecimal manDiscountDollarAmount) {
    
    this.manDiscountDollarAmount = manDiscountDollarAmount;
    return this;
  }

   /**
   * Get manDiscountDollarAmount
   * @return manDiscountDollarAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getManDiscountDollarAmount() {
    return manDiscountDollarAmount;
  }


  public void setManDiscountDollarAmount(BigDecimal manDiscountDollarAmount) {
    this.manDiscountDollarAmount = manDiscountDollarAmount;
  }


  public OrderItemDetail savings(BigDecimal savings) {
    
    this.savings = savings;
    return this;
  }

   /**
   * Get savings
   * @return savings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSavings() {
    return savings;
  }


  public void setSavings(BigDecimal savings) {
    this.savings = savings;
  }


  public OrderItemDetail totalSavings(BigDecimal totalSavings) {
    
    this.totalSavings = totalSavings;
    return this;
  }

   /**
   * Get totalSavings
   * @return totalSavings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalSavings() {
    return totalSavings;
  }


  public void setTotalSavings(BigDecimal totalSavings) {
    this.totalSavings = totalSavings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemDetail orderItemDetail = (OrderItemDetail) o;
    return Objects.equals(this.orderNumber, orderItemDetail.orderNumber) &&
        Objects.equals(this.itemNumber, orderItemDetail.itemNumber) &&
        Objects.equals(this.count, orderItemDetail.count) &&
        Objects.equals(this.manDiscountCount, orderItemDetail.manDiscountCount) &&
        Objects.equals(this.specialDiscountCount, orderItemDetail.specialDiscountCount) &&
        Objects.equals(this.designationCode, orderItemDetail.designationCode) &&
        Objects.equals(this.seatDiscountCount, orderItemDetail.seatDiscountCount) &&
        Objects.equals(this.seatDiscountAmount, orderItemDetail.seatDiscountAmount) &&
        Objects.equals(this.custDiscountTypeCode, orderItemDetail.custDiscountTypeCode) &&
        Objects.equals(this.custDiscountValue, orderItemDetail.custDiscountValue) &&
        Objects.equals(this.specialTypeCode, orderItemDetail.specialTypeCode) &&
        Objects.equals(this.specialDiscountValue, orderItemDetail.specialDiscountValue) &&
        Objects.equals(this.manDiscountTypeCode, orderItemDetail.manDiscountTypeCode) &&
        Objects.equals(this.manDiscountValue, orderItemDetail.manDiscountValue) &&
        Objects.equals(this.confirmedCount, orderItemDetail.confirmedCount) &&
        Objects.equals(this.totalPrice, orderItemDetail.totalPrice) &&
        Objects.equals(this.specialDiscountTotalAmount, orderItemDetail.specialDiscountTotalAmount) &&
        Objects.equals(this.manDiscountTotalAmount, orderItemDetail.manDiscountTotalAmount) &&
        Objects.equals(this.seatDiscountTotalAmount, orderItemDetail.seatDiscountTotalAmount) &&
        Objects.equals(this.custDiscountTotalAmount, orderItemDetail.custDiscountTotalAmount) &&
        Objects.equals(this.printedCount, orderItemDetail.printedCount) &&
        Objects.equals(this.priceValue, orderItemDetail.priceValue) &&
        Objects.equals(this.price, orderItemDetail.price) &&
        Objects.equals(this.compCount, orderItemDetail.compCount) &&
        Objects.equals(this.gratuity, orderItemDetail.gratuity) &&
        Objects.equals(this.ssMargin, orderItemDetail.ssMargin) &&
        Objects.equals(this.custDiscountCount, orderItemDetail.custDiscountCount) &&
        Objects.equals(this.orderItem, orderItemDetail.orderItem) &&
        Objects.equals(this.deltaCount, orderItemDetail.deltaCount) &&
        Objects.equals(this.persisted, orderItemDetail.persisted) &&
        Objects.equals(this._new, orderItemDetail._new) &&
        Objects.equals(this.listPriceWithDiscounts, orderItemDetail.listPriceWithDiscounts) &&
        Objects.equals(this.totalDiscount, orderItemDetail.totalDiscount) &&
        Objects.equals(this.unprintedCount, orderItemDetail.unprintedCount) &&
        Objects.equals(this.manDiscountDollarAmount, orderItemDetail.manDiscountDollarAmount) &&
        Objects.equals(this.savings, orderItemDetail.savings) &&
        Objects.equals(this.totalSavings, orderItemDetail.totalSavings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber, itemNumber, count, manDiscountCount, specialDiscountCount, designationCode, seatDiscountCount, seatDiscountAmount, custDiscountTypeCode, custDiscountValue, specialTypeCode, specialDiscountValue, manDiscountTypeCode, manDiscountValue, confirmedCount, totalPrice, specialDiscountTotalAmount, manDiscountTotalAmount, seatDiscountTotalAmount, custDiscountTotalAmount, printedCount, priceValue, price, compCount, gratuity, ssMargin, custDiscountCount, orderItem, deltaCount, persisted, _new, listPriceWithDiscounts, totalDiscount, unprintedCount, manDiscountDollarAmount, savings, totalSavings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemDetail {\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    manDiscountCount: ").append(toIndentedString(manDiscountCount)).append("\n");
    sb.append("    specialDiscountCount: ").append(toIndentedString(specialDiscountCount)).append("\n");
    sb.append("    designationCode: ").append(toIndentedString(designationCode)).append("\n");
    sb.append("    seatDiscountCount: ").append(toIndentedString(seatDiscountCount)).append("\n");
    sb.append("    seatDiscountAmount: ").append(toIndentedString(seatDiscountAmount)).append("\n");
    sb.append("    custDiscountTypeCode: ").append(toIndentedString(custDiscountTypeCode)).append("\n");
    sb.append("    custDiscountValue: ").append(toIndentedString(custDiscountValue)).append("\n");
    sb.append("    specialTypeCode: ").append(toIndentedString(specialTypeCode)).append("\n");
    sb.append("    specialDiscountValue: ").append(toIndentedString(specialDiscountValue)).append("\n");
    sb.append("    manDiscountTypeCode: ").append(toIndentedString(manDiscountTypeCode)).append("\n");
    sb.append("    manDiscountValue: ").append(toIndentedString(manDiscountValue)).append("\n");
    sb.append("    confirmedCount: ").append(toIndentedString(confirmedCount)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    specialDiscountTotalAmount: ").append(toIndentedString(specialDiscountTotalAmount)).append("\n");
    sb.append("    manDiscountTotalAmount: ").append(toIndentedString(manDiscountTotalAmount)).append("\n");
    sb.append("    seatDiscountTotalAmount: ").append(toIndentedString(seatDiscountTotalAmount)).append("\n");
    sb.append("    custDiscountTotalAmount: ").append(toIndentedString(custDiscountTotalAmount)).append("\n");
    sb.append("    printedCount: ").append(toIndentedString(printedCount)).append("\n");
    sb.append("    priceValue: ").append(toIndentedString(priceValue)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    compCount: ").append(toIndentedString(compCount)).append("\n");
    sb.append("    gratuity: ").append(toIndentedString(gratuity)).append("\n");
    sb.append("    ssMargin: ").append(toIndentedString(ssMargin)).append("\n");
    sb.append("    custDiscountCount: ").append(toIndentedString(custDiscountCount)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
    sb.append("    deltaCount: ").append(toIndentedString(deltaCount)).append("\n");
    sb.append("    persisted: ").append(toIndentedString(persisted)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("    listPriceWithDiscounts: ").append(toIndentedString(listPriceWithDiscounts)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    unprintedCount: ").append(toIndentedString(unprintedCount)).append("\n");
    sb.append("    manDiscountDollarAmount: ").append(toIndentedString(manDiscountDollarAmount)).append("\n");
    sb.append("    savings: ").append(toIndentedString(savings)).append("\n");
    sb.append("    totalSavings: ").append(toIndentedString(totalSavings)).append("\n");
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
    openapiFields.add("orderNumber");
    openapiFields.add("itemNumber");
    openapiFields.add("count");
    openapiFields.add("manDiscountCount");
    openapiFields.add("specialDiscountCount");
    openapiFields.add("designationCode");
    openapiFields.add("seatDiscountCount");
    openapiFields.add("seatDiscountAmount");
    openapiFields.add("custDiscountTypeCode");
    openapiFields.add("custDiscountValue");
    openapiFields.add("specialTypeCode");
    openapiFields.add("specialDiscountValue");
    openapiFields.add("manDiscountTypeCode");
    openapiFields.add("manDiscountValue");
    openapiFields.add("confirmedCount");
    openapiFields.add("totalPrice");
    openapiFields.add("specialDiscountTotalAmount");
    openapiFields.add("manDiscountTotalAmount");
    openapiFields.add("seatDiscountTotalAmount");
    openapiFields.add("custDiscountTotalAmount");
    openapiFields.add("printedCount");
    openapiFields.add("priceValue");
    openapiFields.add("price");
    openapiFields.add("compCount");
    openapiFields.add("gratuity");
    openapiFields.add("ssMargin");
    openapiFields.add("custDiscountCount");
    openapiFields.add("orderItem");
    openapiFields.add("deltaCount");
    openapiFields.add("persisted");
    openapiFields.add("new");
    openapiFields.add("listPriceWithDiscounts");
    openapiFields.add("totalDiscount");
    openapiFields.add("unprintedCount");
    openapiFields.add("manDiscountDollarAmount");
    openapiFields.add("savings");
    openapiFields.add("totalSavings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("designationCode");
    openapiRequiredFields.add("seatDiscountAmount");
    openapiRequiredFields.add("custDiscountValue");
    openapiRequiredFields.add("specialDiscountValue");
    openapiRequiredFields.add("manDiscountValue");
    openapiRequiredFields.add("specialDiscountTotalAmount");
    openapiRequiredFields.add("manDiscountTotalAmount");
    openapiRequiredFields.add("seatDiscountTotalAmount");
    openapiRequiredFields.add("custDiscountTotalAmount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderItemDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderItemDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItemDetail is not found in the empty JSON string", OrderItemDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderItemDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItemDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderItemDetail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `orderItem`
      if (jsonObj.getAsJsonObject("orderItem") != null) {
        OrderItem.validateJsonObject(jsonObj.getAsJsonObject("orderItem"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemDetail>() {
           @Override
           public void write(JsonWriter out, OrderItemDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemDetail
  * @throws IOException if the JSON string is invalid with respect to OrderItemDetail
  */
  public static OrderItemDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemDetail.class);
  }

 /**
  * Convert an instance of OrderItemDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


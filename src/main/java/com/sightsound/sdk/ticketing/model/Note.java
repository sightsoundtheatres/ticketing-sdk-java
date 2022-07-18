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
import com.sightsound.sdk.ticketing.model.NoteType;
import com.sightsound.sdk.ticketing.model.Order;
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
 * Note
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T20:01:03.115466Z[Etc/UTC]")
public class Note {
  public static final String SERIALIZED_NAME_NOTE_ID = "noteId";
  @SerializedName(SERIALIZED_NAME_NOTE_ID)
  private Long noteId;

  public static final String SERIALIZED_NAME_NOTE_TYPE = "noteType";
  @SerializedName(SERIALIZED_NAME_NOTE_TYPE)
  private NoteType noteType;

  public static final String SERIALIZED_NAME_NOTE_DATE = "noteDate";
  @SerializedName(SERIALIZED_NAME_NOTE_DATE)
  private OffsetDateTime noteDate;

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private String agent;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Long orderNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private Long customerNumber;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "itemNumber";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private Integer itemNumber;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_DELETE_USER_ID = "deleteUserId";
  @SerializedName(SERIALIZED_NAME_DELETE_USER_ID)
  private String deleteUserId;

  public static final String SERIALIZED_NAME_DELETE_DATE = "deleteDate";
  @SerializedName(SERIALIZED_NAME_DELETE_DATE)
  private OffsetDateTime deleteDate;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public Note() { 
  }

  public Note noteId(Long noteId) {
    
    this.noteId = noteId;
    return this;
  }

   /**
   * Get noteId
   * @return noteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getNoteId() {
    return noteId;
  }


  public void setNoteId(Long noteId) {
    this.noteId = noteId;
  }


  public Note noteType(NoteType noteType) {
    
    this.noteType = noteType;
    return this;
  }

   /**
   * Get noteType
   * @return noteType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NoteType getNoteType() {
    return noteType;
  }


  public void setNoteType(NoteType noteType) {
    this.noteType = noteType;
  }


  public Note noteDate(OffsetDateTime noteDate) {
    
    this.noteDate = noteDate;
    return this;
  }

   /**
   * Get noteDate
   * @return noteDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNoteDate() {
    return noteDate;
  }


  public void setNoteDate(OffsetDateTime noteDate) {
    this.noteDate = noteDate;
  }


  public Note agent(String agent) {
    
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAgent() {
    return agent;
  }


  public void setAgent(String agent) {
    this.agent = agent;
  }


  public Note orderNumber(Long orderNumber) {
    
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


  public Note customerNumber(Long customerNumber) {
    
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


  public Note customer(Customer customer) {
    
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


  public Note note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public Note eventCode(String eventCode) {
    
    this.eventCode = eventCode;
    return this;
  }

   /**
   * Get eventCode
   * @return eventCode
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventCode() {
    return eventCode;
  }


  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }


  public Note itemNumber(Integer itemNumber) {
    
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * Get itemNumber
   * @return itemNumber
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getItemNumber() {
    return itemNumber;
  }


  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }


  public Note active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Note deleteUserId(String deleteUserId) {
    
    this.deleteUserId = deleteUserId;
    return this;
  }

   /**
   * Get deleteUserId
   * @return deleteUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeleteUserId() {
    return deleteUserId;
  }


  public void setDeleteUserId(String deleteUserId) {
    this.deleteUserId = deleteUserId;
  }


  public Note deleteDate(OffsetDateTime deleteDate) {
    
    this.deleteDate = deleteDate;
    return this;
  }

   /**
   * Get deleteDate
   * @return deleteDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDeleteDate() {
    return deleteDate;
  }


  public void setDeleteDate(OffsetDateTime deleteDate) {
    this.deleteDate = deleteDate;
  }


  public Note order(Order order) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.noteId, note.noteId) &&
        Objects.equals(this.noteType, note.noteType) &&
        Objects.equals(this.noteDate, note.noteDate) &&
        Objects.equals(this.agent, note.agent) &&
        Objects.equals(this.orderNumber, note.orderNumber) &&
        Objects.equals(this.customerNumber, note.customerNumber) &&
        Objects.equals(this.customer, note.customer) &&
        Objects.equals(this.note, note.note) &&
        Objects.equals(this.eventCode, note.eventCode) &&
        Objects.equals(this.itemNumber, note.itemNumber) &&
        Objects.equals(this.active, note.active) &&
        Objects.equals(this.deleteUserId, note.deleteUserId) &&
        Objects.equals(this.deleteDate, note.deleteDate) &&
        Objects.equals(this.order, note.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noteId, noteType, noteDate, agent, orderNumber, customerNumber, customer, note, eventCode, itemNumber, active, deleteUserId, deleteDate, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    sb.append("    noteId: ").append(toIndentedString(noteId)).append("\n");
    sb.append("    noteType: ").append(toIndentedString(noteType)).append("\n");
    sb.append("    noteDate: ").append(toIndentedString(noteDate)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    deleteUserId: ").append(toIndentedString(deleteUserId)).append("\n");
    sb.append("    deleteDate: ").append(toIndentedString(deleteDate)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("noteId");
    openapiFields.add("noteType");
    openapiFields.add("noteDate");
    openapiFields.add("agent");
    openapiFields.add("orderNumber");
    openapiFields.add("customerNumber");
    openapiFields.add("customer");
    openapiFields.add("note");
    openapiFields.add("eventCode");
    openapiFields.add("itemNumber");
    openapiFields.add("active");
    openapiFields.add("deleteUserId");
    openapiFields.add("deleteDate");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Note
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Note.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Note is not found in the empty JSON string", Note.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Note.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Note` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agent") != null && !jsonObj.get("agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent").toString()));
      }
      // validate the optional field `customer`
      if (jsonObj.getAsJsonObject("customer") != null) {
        Customer.validateJsonObject(jsonObj.getAsJsonObject("customer"));
      }
      if (jsonObj.get("note") != null && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if (jsonObj.get("eventCode") != null && !jsonObj.get("eventCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventCode").toString()));
      }
      if (jsonObj.get("deleteUserId") != null && !jsonObj.get("deleteUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleteUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deleteUserId").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.getAsJsonObject("order") != null) {
        Order.validateJsonObject(jsonObj.getAsJsonObject("order"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Note.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Note' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Note> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Note.class));

       return (TypeAdapter<T>) new TypeAdapter<Note>() {
           @Override
           public void write(JsonWriter out, Note value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Note read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Note given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Note
  * @throws IOException if the JSON string is invalid with respect to Note
  */
  public static Note fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Note.class);
  }

 /**
  * Convert an instance of Note to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


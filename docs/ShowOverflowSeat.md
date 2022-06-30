

# ShowOverflowSeat


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**overflowId** | **Long** |  |  [optional] |
|**eventCode** | **String** |  |  |
|**showDateTime** | **OffsetDateTime** |  |  [optional] |
|**orderNumber** | **Long** |  |  [optional] |
|**itemNumber** | **Integer** |  |  [optional] |
|**ticketText** | **String** |  |  [optional] |
|**seatStatus** | [**SeatStatusEnum**](#SeatStatusEnum) |  |  [optional] |
|**ticketStatus** | [**TicketStatusEnum**](#TicketStatusEnum) |  |  [optional] |
|**orderItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |



## Enum: SeatStatusEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| H | &quot;H&quot; |
| U | &quot;U&quot; |



## Enum: TicketStatusEnum

| Name | Value |
|---- | -----|
| MARK_NOT_PRINTED | &quot;MARK_NOT_PRINTED&quot; |
| MARK_PRINTED | &quot;MARK_PRINTED&quot; |
| PRINTED | &quot;PRINTED&quot; |
| NOT_PRINTED | &quot;NOT_PRINTED&quot; |




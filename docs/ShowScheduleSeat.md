

# ShowScheduleSeat


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventCode** | **String** |  |  |
|**showDateTime** | **OffsetDateTime** |  |  |
|**sectionCode** | **String** |  |  |
|**rowNumber** | **String** |  |  |
|**seatNumber** | **Integer** |  |  [optional] |
|**priceGrade** | **String** |  |  |
|**seatingTemplateCode** | **String** |  |  [optional] |
|**orderNumber** | **Long** |  |  [optional] |
|**itemNumber** | **Integer** |  |  [optional] |
|**bookingPhase** | **Integer** |  |  [optional] |
|**sssDateTime** | **OffsetDateTime** |  |  [optional] |
|**seatType** | [**SeatTypeEnum**](#SeatTypeEnum) |  |  [optional] |
|**seatStatus** | [**SeatStatusEnum**](#SeatStatusEnum) |  |  [optional] |
|**ticketPrintStatus** | [**TicketPrintStatusEnum**](#TicketPrintStatusEnum) |  |  [optional] |
|**modifyUserId** | **String** |  |  [optional] |
|**orderItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**templateSectionSeat** | [**SeatingTemplateSectionSeat**](SeatingTemplateSectionSeat.md) |  |  [optional] |
|**wheelchairOrMotorized** | **Boolean** |  |  [optional] |
|**seatCode** | **String** |  |  [optional] |



## Enum: SeatTypeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| F | &quot;F&quot; |
| H | &quot;H&quot; |
| I | &quot;I&quot; |
| M | &quot;M&quot; |
| S | &quot;S&quot; |
| T | &quot;T&quot; |
| V | &quot;V&quot; |
| W | &quot;W&quot; |



## Enum: SeatStatusEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| H | &quot;H&quot; |
| U | &quot;U&quot; |



## Enum: TicketPrintStatusEnum

| Name | Value |
|---- | -----|
| MARK_NOT_PRINTED | &quot;MARK_NOT_PRINTED&quot; |
| MARK_PRINTED | &quot;MARK_PRINTED&quot; |
| PRINTED | &quot;PRINTED&quot; |
| NOT_PRINTED | &quot;NOT_PRINTED&quot; |




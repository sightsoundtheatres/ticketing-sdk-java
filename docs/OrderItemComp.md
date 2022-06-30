

# OrderItemComp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderNumber** | **Long** |  |  [optional] |
|**itemNumber** | **Integer** |  |  [optional] |
|**compNumber** | **Long** |  |  [optional] |
|**eventCode** | **String** |  |  |
|**compType** | [**CompTypeEnum**](#CompTypeEnum) |  |  |
|**uniqueCode** | **String** |  |  [optional] |
|**addUserId** | **String** |  |  |
|**addDate** | **OffsetDateTime** |  |  |
|**adult** | **Integer** |  |  [optional] |
|**teen** | **Integer** |  |  [optional] |
|**child** | **Integer** |  |  [optional] |
|**discountPercent** | **BigDecimal** |  |  [optional] |
|**discCountMax** | **Integer** |  |  [optional] |
|**orderItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |



## Enum: CompTypeEnum

| Name | Value |
|---- | -----|
| ADMINISTRATION | &quot;ADMINISTRATION&quot; |
| MARKETING | &quot;MARKETING&quot; |
| SALES | &quot;SALES&quot; |
| SALESREP | &quot;SALESREP&quot; |
| PARTNERSHIP | &quot;PARTNERSHIP&quot; |
| CHARITY | &quot;CHARITY&quot; |
| MANUAL | &quot;MANUAL&quot; |
| LEADERSHIP | &quot;LEADERSHIP&quot; |




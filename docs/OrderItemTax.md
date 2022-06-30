

# OrderItemTax


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderItem** | [**OrderItem**](OrderItem.md) |  |  [optional] |
|**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) |  |  |
|**jurisdiction** | [**JurisdictionEnum**](#JurisdictionEnum) |  |  |
|**taxDescription** | **String** |  |  [optional] |
|**taxPercent** | **BigDecimal** |  |  [optional] |
|**taxPercentAmount** | **BigDecimal** |  |  [optional] |
|**tax** | **BigDecimal** |  |  [optional] |
|**entryDate** | **OffsetDateTime** |  |  [optional] |



## Enum: TaxTypeEnum

| Name | Value |
|---- | -----|
| EN | &quot;EN&quot; |
| XC | &quot;XC&quot; |
| SC | &quot;SC&quot; |
| SP | &quot;SP&quot; |
| SH | &quot;SH&quot; |
| PT | &quot;PT&quot; |



## Enum: JurisdictionEnum

| Name | Value |
|---- | -----|
| ET | &quot;ET&quot; |
| MO | &quot;MO&quot; |
| PA | &quot;PA&quot; |




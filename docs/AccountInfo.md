

# AccountInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountAgeIndicator** | [**AccountAgeIndicatorEnum**](#AccountAgeIndicatorEnum) |  |  [optional] |
|**accountChangeDate** | **OffsetDateTime** |  |  [optional] |
|**accountChangeIndicator** | [**AccountChangeIndicatorEnum**](#AccountChangeIndicatorEnum) |  |  [optional] |
|**accountCreationDate** | **OffsetDateTime** |  |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  |  [optional] |
|**addCardAttemptsDay** | **Integer** |  |  [optional] |
|**deliveryAddressUsageDate** | **OffsetDateTime** |  |  [optional] |
|**deliveryAddressUsageIndicator** | [**DeliveryAddressUsageIndicatorEnum**](#DeliveryAddressUsageIndicatorEnum) |  |  [optional] |
|**homePhone** | **String** |  |  [optional] |
|**mobilePhone** | **String** |  |  [optional] |
|**passwordChangeDate** | **OffsetDateTime** |  |  [optional] |
|**passwordChangeIndicator** | [**PasswordChangeIndicatorEnum**](#PasswordChangeIndicatorEnum) |  |  [optional] |
|**pastTransactionsDay** | **Integer** |  |  [optional] |
|**pastTransactionsYear** | **Integer** |  |  [optional] |
|**paymentAccountAge** | **OffsetDateTime** |  |  [optional] |
|**paymentAccountIndicator** | [**PaymentAccountIndicatorEnum**](#PaymentAccountIndicatorEnum) |  |  [optional] |
|**purchasesLast6Months** | **Integer** |  |  [optional] |
|**suspiciousActivity** | **Boolean** |  |  [optional] |
|**workPhone** | **String** |  |  [optional] |



## Enum: AccountAgeIndicatorEnum

| Name | Value |
|---- | -----|
| NOTAPPLICABLE | &quot;notApplicable&quot; |
| THISTRANSACTION | &quot;thisTransaction&quot; |
| LESSTHAN30DAYS | &quot;lessThan30Days&quot; |
| FROM30TO60DAYS | &quot;from30To60Days&quot; |
| MORETHAN60DAYS | &quot;moreThan60Days&quot; |



## Enum: AccountChangeIndicatorEnum

| Name | Value |
|---- | -----|
| THISTRANSACTION | &quot;thisTransaction&quot; |
| LESSTHAN30DAYS | &quot;lessThan30Days&quot; |
| FROM30TO60DAYS | &quot;from30To60Days&quot; |
| MORETHAN60DAYS | &quot;moreThan60Days&quot; |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| NOTAPPLICABLE | &quot;notApplicable&quot; |
| CREDIT | &quot;credit&quot; |
| DEBIT | &quot;debit&quot; |



## Enum: DeliveryAddressUsageIndicatorEnum

| Name | Value |
|---- | -----|
| THISTRANSACTION | &quot;thisTransaction&quot; |
| LESSTHAN30DAYS | &quot;lessThan30Days&quot; |
| FROM30TO60DAYS | &quot;from30To60Days&quot; |
| MORETHAN60DAYS | &quot;moreThan60Days&quot; |



## Enum: PasswordChangeIndicatorEnum

| Name | Value |
|---- | -----|
| NOTAPPLICABLE | &quot;notApplicable&quot; |
| THISTRANSACTION | &quot;thisTransaction&quot; |
| LESSTHAN30DAYS | &quot;lessThan30Days&quot; |
| FROM30TO60DAYS | &quot;from30To60Days&quot; |
| MORETHAN60DAYS | &quot;moreThan60Days&quot; |



## Enum: PaymentAccountIndicatorEnum

| Name | Value |
|---- | -----|
| NOTAPPLICABLE | &quot;notApplicable&quot; |
| THISTRANSACTION | &quot;thisTransaction&quot; |
| LESSTHAN30DAYS | &quot;lessThan30Days&quot; |
| FROM30TO60DAYS | &quot;from30To60Days&quot; |
| MORETHAN60DAYS | &quot;moreThan60Days&quot; |




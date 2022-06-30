

# Mandate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** |  |  [optional] |
|**amountRule** | [**AmountRuleEnum**](#AmountRuleEnum) |  |  [optional] |
|**billingAttemptsRule** | [**BillingAttemptsRuleEnum**](#BillingAttemptsRuleEnum) |  |  [optional] |
|**billingDay** | **String** |  |  [optional] |
|**endsAt** | **String** |  |  [optional] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) |  |  [optional] |
|**remarks** | **String** |  |  [optional] |
|**startsAt** | **String** |  |  [optional] |



## Enum: AmountRuleEnum

| Name | Value |
|---- | -----|
| MAX | &quot;max&quot; |
| EXACT | &quot;exact&quot; |



## Enum: BillingAttemptsRuleEnum

| Name | Value |
|---- | -----|
| ON | &quot;on&quot; |
| BEFORE | &quot;before&quot; |
| AFTER | &quot;after&quot; |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| ADHOC | &quot;adhoc&quot; |
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| BIWEEKLY | &quot;biWeekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| QUARTERLY | &quot;quarterly&quot; |
| HALFYEARLY | &quot;halfYearly&quot; |
| YEARLY | &quot;yearly&quot; |




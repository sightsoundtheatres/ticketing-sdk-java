

# CustomerContactInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactId** | **Long** |  |  [optional] |
|**customerNumber** | **Long** |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**emailAddress** | **String** |  |  [optional] |
|**phoneNumber** | **String** |  |  [optional] |
|**extension** | **String** |  |  [optional] |
|**addDate** | **OffsetDateTime** |  |  [optional] |
|**addUserId** | **String** |  |  [optional] |
|**phoneType** | [**PhoneTypeEnum**](#PhoneTypeEnum) |  |  [optional] |
|**emailList** | **Boolean** |  |  [optional] |
|**callList** | **Boolean** |  |  [optional] |
|**textList** | **Boolean** |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  [optional] |
|**primary** | **Boolean** |  |  [optional] |
|**modifyDate** | **OffsetDateTime** |  |  [optional] |
|**modifyUserId** | **String** |  |  [optional] |
|**communicationPreferences** | [**List&lt;CustomerContactInfoCommunicationTag&gt;**](CustomerContactInfoCommunicationTag.md) |  |  [optional] |



## Enum: PhoneTypeEnum

| Name | Value |
|---- | -----|
| FAX | &quot;FAX&quot; |
| WORK | &quot;WORK&quot; |
| DAYTIME | &quot;DAYTIME&quot; |
| HOME | &quot;HOME&quot; |
| CHURCH | &quot;CHURCH&quot; |
| EVENING | &quot;EVENING&quot; |
| CELL | &quot;CELL&quot; |
| MOBILE | &quot;MOBILE&quot; |
| AUTH_USER | &quot;AUTH_USER&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| MANAGER | &quot;MANAGER&quot; |
| ACCOUNTING | &quot;ACCOUNTING&quot; |
| MARKETING | &quot;MARKETING&quot; |
| GENERAL | &quot;GENERAL&quot; |






# ThreeDS2RequestData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authenticationOnly** | **Boolean** |  |  [optional] |
|**challengeIndicator** | [**ChallengeIndicatorEnum**](#ChallengeIndicatorEnum) |  |  [optional] |
|**deviceChannel** | **String** |  |  [optional] |
|**deviceRenderOptions** | [**DeviceRenderOptions**](DeviceRenderOptions.md) |  |  [optional] |
|**notificationURL** | **String** |  |  [optional] |
|**sdkAppID** | **String** |  |  [optional] |
|**sdkEncData** | **String** |  |  [optional] |
|**sdkEphemPubKey** | [**SDKEphemPubKey**](SDKEphemPubKey.md) |  |  [optional] |
|**sdkMaxTimeout** | **Integer** |  |  [optional] |
|**sdkReferenceNumber** | **String** |  |  [optional] |
|**sdkTransID** | **String** |  |  [optional] |
|**threeDSCompInd** | **String** |  |  [optional] |
|**threeDSRequestorURL** | **String** |  |  [optional] |
|**threeDSServerTransID** | **String** |  |  [optional] |
|**messageVersion** | **String** |  |  [optional] |
|**threeDSRequestorID** | **String** |  |  [optional] |
|**threeDSRequestorChallengeInd** | **String** |  |  [optional] |
|**threeDSRequestorName** | **String** |  |  [optional] |
|**acquirerBIN** | **String** |  |  [optional] |
|**acquirerMerchantID** | **String** |  |  [optional] |
|**mcc** | **String** |  |  [optional] |
|**merchantName** | **String** |  |  [optional] |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) |  |  [optional] |
|**whiteListStatus** | **String** |  |  [optional] |



## Enum: ChallengeIndicatorEnum

| Name | Value |
|---- | -----|
| NOPREFERENCE | &quot;noPreference&quot; |
| REQUESTCHALLENGE | &quot;requestChallenge&quot; |
| REQUESTNOCHALLENGE | &quot;requestNoChallenge&quot; |
| REQUESTCHALLENGEASMANDATE | &quot;requestChallengeAsMandate&quot; |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| GOODSORSERVICEPURCHASE | &quot;goodsOrServicePurchase&quot; |
| CHECKACCEPTANCE | &quot;checkAcceptance&quot; |
| ACCOUNTFUNDING | &quot;accountFunding&quot; |
| QUASICASHTRANSACTION | &quot;quasiCashTransaction&quot; |
| PREPAIDACTIVATIONANDLOAD | &quot;prepaidActivationAndLoad&quot; |




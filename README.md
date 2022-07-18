# ticketing-sdk-java

Partner Ticketing API
- API version: 0.0.1-SNAPSHOT
  - Build date: 2022-07-18T19:37:37.998841Z[Etc/UTC]

Sight & Sound Theatres Partner Ticketing API

  For more information, please visit [https://sight-sound.com](https://sight-sound.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.sight-sound</groupId>
  <artifactId>ticketing-sdk-java</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'ticketing-sdk-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'ticketing-sdk-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.sight-sound:ticketing-sdk-java:0.0.1-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ticketing-sdk-java-0.0.1-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.sightsound.sdk.ticketing.ApiClient;
import com.sightsound.sdk.ticketing.ApiException;
import com.sightsound.sdk.ticketing.Configuration;
import com.sightsound.sdk.ticketing.auth.*;
import com.sightsound.sdk.ticketing.models.*;
import com.sightsound.sdk.ticketing.api.OrderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-helios.sight-sound.com");
    
    // Configure OAuth2 access token for authorization: DEV
    OAuth DEV = (OAuth) defaultClient.getAuthentication("DEV");
    DEV.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: PROD
    OAuth PROD = (OAuth) defaultClient.getAuthentication("PROD");
    PROD.setAccessToken("YOUR ACCESS TOKEN");

    OrderControllerApi apiInstance = new OrderControllerApi(defaultClient);
    OrderCompleteRequest orderCompleteRequest = new OrderCompleteRequest(); // OrderCompleteRequest | 
    try {
      OrderCompleteResponse result = apiInstance.completeNewOrder(orderCompleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderControllerApi#completeNewOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://dev-helios.sight-sound.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrderControllerApi* | [**completeNewOrder**](docs/OrderControllerApi.md#completeNewOrder) | **POST** /order/complete | Complete order
*UtilControllerApi* | [**status**](docs/UtilControllerApi.md#status) | **GET** /system/util/status | 


## Documentation for Models

 - [ACHRequest](docs/ACHRequest.md)
 - [AccountAgeIndicatorEnum](docs/AccountAgeIndicatorEnum.md)
 - [AccountChangeIndicatorEnum](docs/AccountChangeIndicatorEnum.md)
 - [AccountInfo](docs/AccountInfo.md)
 - [AccountTypeEnum](docs/AccountTypeEnum.md)
 - [ActivityType](docs/ActivityType.md)
 - [AdditionalContactRole](docs/AdditionalContactRole.md)
 - [Address](docs/Address.md)
 - [AddressExtended](docs/AddressExtended.md)
 - [AddressVerifyStatus](docs/AddressVerifyStatus.md)
 - [Amount](docs/Amount.md)
 - [AmountRuleEnum](docs/AmountRuleEnum.md)
 - [ApplicationInfo](docs/ApplicationInfo.md)
 - [AuthenticationResponseEnum](docs/AuthenticationResponseEnum.md)
 - [BillingAttemptsRuleEnum](docs/BillingAttemptsRuleEnum.md)
 - [BookingLocation](docs/BookingLocation.md)
 - [BrowserInfo](docs/BrowserInfo.md)
 - [CartRequest](docs/CartRequest.md)
 - [CartResponse](docs/CartResponse.md)
 - [ChallengeIndicatorEnum](docs/ChallengeIndicatorEnum.md)
 - [ChannelEnum](docs/ChannelEnum.md)
 - [CheckoutOrder](docs/CheckoutOrder.md)
 - [CommonField](docs/CommonField.md)
 - [CompCodeType](docs/CompCodeType.md)
 - [Company](docs/Company.md)
 - [CreateWebsiteCustomerRequest](docs/CreateWebsiteCustomerRequest.md)
 - [Customer](docs/Customer.md)
 - [CustomerAttribute](docs/CustomerAttribute.md)
 - [CustomerAttributeType](docs/CustomerAttributeType.md)
 - [CustomerContactInfo](docs/CustomerContactInfo.md)
 - [CustomerContactInfoCommunicationTag](docs/CustomerContactInfoCommunicationTag.md)
 - [CustomerDocument](docs/CustomerDocument.md)
 - [CustomerPhone](docs/CustomerPhone.md)
 - [CustomerPhoneRequest](docs/CustomerPhoneRequest.md)
 - [CustomerPricingLevel](docs/CustomerPricingLevel.md)
 - [CustomerType](docs/CustomerType.md)
 - [CustomerTypeResponse](docs/CustomerTypeResponse.md)
 - [CustomerUPSAddress](docs/CustomerUPSAddress.md)
 - [DeliveryAddressIndicatorEnum](docs/DeliveryAddressIndicatorEnum.md)
 - [DeliveryAddressUsageIndicatorEnum](docs/DeliveryAddressUsageIndicatorEnum.md)
 - [DeliveryTimeframeEnum](docs/DeliveryTimeframeEnum.md)
 - [Designation](docs/Designation.md)
 - [DeviceRenderOptions](docs/DeviceRenderOptions.md)
 - [DirectoryResponseEnum](docs/DirectoryResponseEnum.md)
 - [DiscountType](docs/DiscountType.md)
 - [DocumentType](docs/DocumentType.md)
 - [EmployeeBenefitType](docs/EmployeeBenefitType.md)
 - [EntityTypeEnum](docs/EntityTypeEnum.md)
 - [Event](docs/Event.md)
 - [ExternalPlatform](docs/ExternalPlatform.md)
 - [FeeItem](docs/FeeItem.md)
 - [FeeKind](docs/FeeKind.md)
 - [FeeType](docs/FeeType.md)
 - [ForexQuote](docs/ForexQuote.md)
 - [FrequencyEnum](docs/FrequencyEnum.md)
 - [GenderEnum](docs/GenderEnum.md)
 - [GroupInfo](docs/GroupInfo.md)
 - [ImpSSIInvoiceCategory](docs/ImpSSIInvoiceCategory.md)
 - [Installments](docs/Installments.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceCompany](docs/InvoiceCompany.md)
 - [InvoiceDetail](docs/InvoiceDetail.md)
 - [InvoiceStatus](docs/InvoiceStatus.md)
 - [InvoiceType](docs/InvoiceType.md)
 - [ItemType](docs/ItemType.md)
 - [LineItem](docs/LineItem.md)
 - [LocationDescription](docs/LocationDescription.md)
 - [Mandate](docs/Mandate.md)
 - [MerchantDevice](docs/MerchantDevice.md)
 - [MerchantRiskIndicator](docs/MerchantRiskIndicator.md)
 - [MiscEvent](docs/MiscEvent.md)
 - [Name](docs/Name.md)
 - [Note](docs/Note.md)
 - [NoteType](docs/NoteType.md)
 - [OIShowSpecialSituation](docs/OIShowSpecialSituation.md)
 - [OldCustomerType](docs/OldCustomerType.md)
 - [Order](docs/Order.md)
 - [OrderCompleteRequest](docs/OrderCompleteRequest.md)
 - [OrderCompleteResponse](docs/OrderCompleteResponse.md)
 - [OrderCustomerRequest](docs/OrderCustomerRequest.md)
 - [OrderItem](docs/OrderItem.md)
 - [OrderItemComp](docs/OrderItemComp.md)
 - [OrderItemDetail](docs/OrderItemDetail.md)
 - [OrderItemDetailPriceRequest](docs/OrderItemDetailPriceRequest.md)
 - [OrderItemPriceRequest](docs/OrderItemPriceRequest.md)
 - [OrderItemPriceResponse](docs/OrderItemPriceResponse.md)
 - [OrderItemStatus](docs/OrderItemStatus.md)
 - [OrderItemTax](docs/OrderItemTax.md)
 - [OrderOrigin](docs/OrderOrigin.md)
 - [OrderStatus](docs/OrderStatus.md)
 - [OrderTicketDeliveryRequest](docs/OrderTicketDeliveryRequest.md)
 - [PaperCheckRequest](docs/PaperCheckRequest.md)
 - [PasswordChangeIndicatorEnum](docs/PasswordChangeIndicatorEnum.md)
 - [Payment](docs/Payment.md)
 - [PaymentAccountIndicatorEnum](docs/PaymentAccountIndicatorEnum.md)
 - [PaymentAch](docs/PaymentAch.md)
 - [PaymentAppliedDetail](docs/PaymentAppliedDetail.md)
 - [PaymentCreditCard](docs/PaymentCreditCard.md)
 - [PaymentGiftCard](docs/PaymentGiftCard.md)
 - [PaymentGiftCardRequest](docs/PaymentGiftCardRequest.md)
 - [PaymentMethodDetails](docs/PaymentMethodDetails.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [PaymentTerms](docs/PaymentTerms.md)
 - [PaymentsRequest](docs/PaymentsRequest.md)
 - [PhoneType](docs/PhoneType.md)
 - [PricingLevel](docs/PricingLevel.md)
 - [Receipt](docs/Receipt.md)
 - [ReceiptDetail](docs/ReceiptDetail.md)
 - [ReceiptDetailType](docs/ReceiptDetailType.md)
 - [ReceiptPaymentType](docs/ReceiptPaymentType.md)
 - [ReceiptReasonCode](docs/ReceiptReasonCode.md)
 - [ReceiptStatus](docs/ReceiptStatus.md)
 - [ReceiptType](docs/ReceiptType.md)
 - [RecurringProcessingModelEnum](docs/RecurringProcessingModelEnum.md)
 - [RiskData](docs/RiskData.md)
 - [SDKEphemPubKey](docs/SDKEphemPubKey.md)
 - [Schedule](docs/Schedule.md)
 - [SdkInterfaceEnum](docs/SdkInterfaceEnum.md)
 - [SdkUiTypeEnum](docs/SdkUiTypeEnum.md)
 - [SeatStatus](docs/SeatStatus.md)
 - [SeatType](docs/SeatType.md)
 - [SeatingProfile](docs/SeatingProfile.md)
 - [SeatingProfileDetail](docs/SeatingProfileDetail.md)
 - [SeatingTemplate](docs/SeatingTemplate.md)
 - [SeatingTemplateSection](docs/SeatingTemplateSection.md)
 - [SeatingTemplateSectionSeat](docs/SeatingTemplateSectionSeat.md)
 - [ShopperInteractionDevice](docs/ShopperInteractionDevice.md)
 - [ShopperInteractionEnum](docs/ShopperInteractionEnum.md)
 - [ShowBudget](docs/ShowBudget.md)
 - [ShowOverflowSeat](docs/ShowOverflowSeat.md)
 - [ShowScheduleSeat](docs/ShowScheduleSeat.md)
 - [ShowTrackingDetail](docs/ShowTrackingDetail.md)
 - [Special](docs/Special.md)
 - [SpecialAssociatedEvent](docs/SpecialAssociatedEvent.md)
 - [SpecialDetail](docs/SpecialDetail.md)
 - [SpecialRestrictionType](docs/SpecialRestrictionType.md)
 - [SpecialSituationDefinition](docs/SpecialSituationDefinition.md)
 - [SpecialSubTypeCode](docs/SpecialSubTypeCode.md)
 - [SpecialType](docs/SpecialType.md)
 - [SpecialTypeCode](docs/SpecialTypeCode.md)
 - [Split](docs/Split.md)
 - [SplitAmount](docs/SplitAmount.md)
 - [SyncSource](docs/SyncSource.md)
 - [TaxCategoryEnum](docs/TaxCategoryEnum.md)
 - [TaxJurisdictionType](docs/TaxJurisdictionType.md)
 - [TaxType](docs/TaxType.md)
 - [TheaterEntrance](docs/TheaterEntrance.md)
 - [TheaterLocation](docs/TheaterLocation.md)
 - [ThreeDS2RequestData](docs/ThreeDS2RequestData.md)
 - [ThreeDSecureData](docs/ThreeDSecureData.md)
 - [TicketBatch](docs/TicketBatch.md)
 - [TicketPrintStatus](docs/TicketPrintStatus.md)
 - [TransactionTypeEnum](docs/TransactionTypeEnum.md)
 - [TypeEnum](docs/TypeEnum.md)
 - [WatchList](docs/WatchList.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### DEV

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A

### PROD

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

DeveloperTeam@sight-sound.com


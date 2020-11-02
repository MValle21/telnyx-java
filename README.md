<div align="center">

# Telnyx Java SDK

![Telnyx](logo-dark.png)

</div>

Java SDK for the Telnyx API

- API version: 2.0.0

SIP trunking, SMS, MMS, Call Control and Telephony Data Services.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Local Installation

* See more at [developers.telnyx.com](https://developers.telnyx.com/docs/v2/development/dev-env-setup?lang=java)

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.telnyx.sdk</groupId>
  <artifactId>telnyx</artifactId>
  <version>2.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.telnyx.sdk:telnyx:2.1.0"
```

### Others

To build the API client library locally, first clone this repo and insure the [telnyx-mock](https://github.com/team-telnyx/telnyx-mock) is installed and running for test validation, use `-DskipTests` as a flag if the mock is not running.

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/telnyx-2.1.0.jar`
- `target/lib/*.jar`

## JDK Support

API client library supports:

1. Java 1.8+
2. Maven/Gradle

## Getting Started

* Sign up for a [Telnyx Account](https://telnyx.com/sign-up)
* Get your [API Key](https://portal.telnyx.com/#/app/api-keys)
* Complete the messaging [Learn and Build](https://portal.telnyx.com/#/app/messaging/learn-and-build) to:
    * Get your first [phone number](https://portal.telnyx.com/#/app/numbers/my-numbers)
    * Create your [messaging profile](https://portal.telnyx.com/#/app/messaging)
* Follow the [installation](#installation) instructions
* Fill in the variables: `YOUR_TELNYX_NUMBER`, `YOUR_TELNYX_API_KEY`, `YOUR_MOBILE_NUMBER` in the code below

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagesApi;

public class Example {

    private static final String YOUR_TELNYX_NUMBER = "+19842550944";
    private static final String YOUR_MOBILE_NUMBER = "+19198675309";
    private static final String YOUR_TELNYX_API_KEY = "KEY";

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(YOUR_TELNYX_API_KEY);

        MessagesApi apiInstance = new MessagesApi(defaultClient);
         // CreateMessageRequest | Message payload
        CreateMessageRequest createMessageRequest = new CreateMessageRequest()
                .from(YOUR_TELNYX_NUMBER)
                .to(YOUR_MOBILE_NUMBER)
                .text("Hello From Telnyx");
        try {
            MessageResponse result = apiInstance.createMessage(createMessageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#createMessage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.telnyx.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CallCommandsApi* | [**callAnswer**](docs/CallCommandsApi.md#callAnswer) | **POST** /calls/{call_control_id}/actions/answer | Answer call
*CallCommandsApi* | [**callBridge**](docs/CallCommandsApi.md#callBridge) | **POST** /calls/{call_control_id}/actions/bridge | Bridge calls
*CallCommandsApi* | [**callDial**](docs/CallCommandsApi.md#callDial) | **POST** /calls | Dial
*CallCommandsApi* | [**callForkStart**](docs/CallCommandsApi.md#callForkStart) | **POST** /calls/{call_control_id}/actions/fork_start | Forking start
*CallCommandsApi* | [**callForkStop**](docs/CallCommandsApi.md#callForkStop) | **POST** /calls/{call_control_id}/actions/fork_stop | Forking stop
*CallCommandsApi* | [**callGatherStop**](docs/CallCommandsApi.md#callGatherStop) | **POST** /calls/{call_control_id}/actions/gather_stop | Gather stop
*CallCommandsApi* | [**callGatherUsingAudio**](docs/CallCommandsApi.md#callGatherUsingAudio) | **POST** /calls/{call_control_id}/actions/gather_using_audio | Gather using audio
*CallCommandsApi* | [**callGatherUsingSpeak**](docs/CallCommandsApi.md#callGatherUsingSpeak) | **POST** /calls/{call_control_id}/actions/gather_using_speak | Gather using speak
*CallCommandsApi* | [**callHangup**](docs/CallCommandsApi.md#callHangup) | **POST** /calls/{call_control_id}/actions/hangup | Hangup call
*CallCommandsApi* | [**callPlaybackStart**](docs/CallCommandsApi.md#callPlaybackStart) | **POST** /calls/{call_control_id}/actions/playback_start | Play audio URL
*CallCommandsApi* | [**callPlaybackStop**](docs/CallCommandsApi.md#callPlaybackStop) | **POST** /calls/{call_control_id}/actions/playback_stop | Stop audio playback
*CallCommandsApi* | [**callRecordStart**](docs/CallCommandsApi.md#callRecordStart) | **POST** /calls/{call_control_id}/actions/record_start | Recording start
*CallCommandsApi* | [**callRecordStop**](docs/CallCommandsApi.md#callRecordStop) | **POST** /calls/{call_control_id}/actions/record_stop | Recording stop
*CallCommandsApi* | [**callReject**](docs/CallCommandsApi.md#callReject) | **POST** /calls/{call_control_id}/actions/reject | Reject a call
*CallCommandsApi* | [**callSendDTMF**](docs/CallCommandsApi.md#callSendDTMF) | **POST** /calls/{call_control_id}/actions/send_dtmf | Send DTMF
*CallCommandsApi* | [**callSpeak**](docs/CallCommandsApi.md#callSpeak) | **POST** /calls/{call_control_id}/actions/speak | Speak text
*CallCommandsApi* | [**callTransfer**](docs/CallCommandsApi.md#callTransfer) | **POST** /calls/{call_control_id}/actions/transfer | Transfer call
*CallControlApplicationsApi* | [**createCallControlApplication**](docs/CallControlApplicationsApi.md#createCallControlApplication) | **POST** /call_control_applications | Create a call control application
*CallControlApplicationsApi* | [**deleteCallControlApplication**](docs/CallControlApplicationsApi.md#deleteCallControlApplication) | **DELETE** /call_control_applications/{id} | Delete a call control application
*CallControlApplicationsApi* | [**listCallControlApplications**](docs/CallControlApplicationsApi.md#listCallControlApplications) | **GET** /call_control_applications | List call control applications
*CallControlApplicationsApi* | [**retrieveCallControlApplication**](docs/CallControlApplicationsApi.md#retrieveCallControlApplication) | **GET** /call_control_applications/{id} | Retrieve a call control application
*CallControlApplicationsApi* | [**updateCallControlApplication**](docs/CallControlApplicationsApi.md#updateCallControlApplication) | **PATCH** /call_control_applications/{id} | Update a call control application
*CallInformationApi* | [**retrieveCallStatus**](docs/CallInformationApi.md#retrieveCallStatus) | **GET** /calls/{call_control_id} | Retrieve a call status
*ConferenceCommandsApi* | [**conferenceDialParticipantIn**](docs/ConferenceCommandsApi.md#conferenceDialParticipantIn) | **POST** /conferences/{id}/actions/dial_participant | Dial a new participant into a conference
*ConferenceCommandsApi* | [**conferenceHoldParticipants**](docs/ConferenceCommandsApi.md#conferenceHoldParticipants) | **POST** /conferences/{id}/actions/hold | Hold conference participants
*ConferenceCommandsApi* | [**conferenceJoin**](docs/ConferenceCommandsApi.md#conferenceJoin) | **POST** /conferences/{id}/actions/join | Join a conference
*ConferenceCommandsApi* | [**conferenceMuteParticipants**](docs/ConferenceCommandsApi.md#conferenceMuteParticipants) | **POST** /conferences/{id}/actions/mute | Mute conference participants
*ConferenceCommandsApi* | [**conferencePlayAudio**](docs/ConferenceCommandsApi.md#conferencePlayAudio) | **POST** /conferences/{id}/actions/play | Play audio to conference participants
*ConferenceCommandsApi* | [**conferenceSpeakText**](docs/ConferenceCommandsApi.md#conferenceSpeakText) | **POST** /conferences/{id}/actions/speak | Speak text to conference participants
*ConferenceCommandsApi* | [**conferenceStartRecording**](docs/ConferenceCommandsApi.md#conferenceStartRecording) | **POST** /conferences/{id}/actions/record_start | Conference recording start
*ConferenceCommandsApi* | [**conferenceStopRecording**](docs/ConferenceCommandsApi.md#conferenceStopRecording) | **POST** /conferences/{id}/actions/record_stop | Conference recording stop
*ConferenceCommandsApi* | [**conferenceUnholdParticipants**](docs/ConferenceCommandsApi.md#conferenceUnholdParticipants) | **POST** /conferences/{id}/actions/unhold | Unhold conference participants
*ConferenceCommandsApi* | [**conferenceUnmuteParticipants**](docs/ConferenceCommandsApi.md#conferenceUnmuteParticipants) | **POST** /conferences/{id}/actions/unmute | Unmute conference participants
*ConferenceCommandsApi* | [**createConference**](docs/ConferenceCommandsApi.md#createConference) | **POST** /conferences | Create conference
*ConferenceCommandsApi* | [**listConferenceParticipants**](docs/ConferenceCommandsApi.md#listConferenceParticipants) | **GET** /conferences/{conference_id}/participants | List conference participants
*ConferenceCommandsApi* | [**listConferences**](docs/ConferenceCommandsApi.md#listConferences) | **GET** /conferences | List conferences
*ConferenceCommandsApi* | [**retrieveConference**](docs/ConferenceCommandsApi.md#retrieveConference) | **GET** /conferences/{id} | Retrieve a conference
*CsvDownloadsApi* | [**createCsvDownload**](docs/CsvDownloadsApi.md#createCsvDownload) | **POST** /phone_numbers/csv_downloads | Create a CSV download
*CsvDownloadsApi* | [**listCsvDownloads**](docs/CsvDownloadsApi.md#listCsvDownloads) | **GET** /phone_numbers/csv_downloads | List CSV downloads
*CsvDownloadsApi* | [**retrieveCsvDownload**](docs/CsvDownloadsApi.md#retrieveCsvDownload) | **GET** /phone_numbers/csv_downloads/{id} | Retrieve a CSV download
*DebuggingApi* | [**listCallEvents**](docs/DebuggingApi.md#listCallEvents) | **GET** /call_events | List call events
*MessagesApi* | [**createLongCodeMessage**](docs/MessagesApi.md#createLongCodeMessage) | **POST** /messages/long_code | Send a long code message
*MessagesApi* | [**createMessage**](docs/MessagesApi.md#createMessage) | **POST** /messages | Send a message
*MessagesApi* | [**createNumberPoolMessage**](docs/MessagesApi.md#createNumberPoolMessage) | **POST** /messages/number_pool | Send a message using number pool
*MessagesApi* | [**createShortCodeMessage**](docs/MessagesApi.md#createShortCodeMessage) | **POST** /messages/short_code | Send a short code message
*MessagesApi* | [**retrieveMessage**](docs/MessagesApi.md#retrieveMessage) | **GET** /messages/{id} | Retrieve a message
*MessagingHostedNumberApi* | [**createMessagingHostedNumberOrder**](docs/MessagingHostedNumberApi.md#createMessagingHostedNumberOrder) | **POST** /messaging_hosted_number_orders | Create a messaging hosted number order
*MessagingHostedNumberApi* | [**deleteMessagingHostedNumber**](docs/MessagingHostedNumberApi.md#deleteMessagingHostedNumber) | **DELETE** /messaging_hosted_numbers/{id} | Delete a messaging hosted number
*MessagingHostedNumberApi* | [**listMessagingHostedNumberOrder**](docs/MessagingHostedNumberApi.md#listMessagingHostedNumberOrder) | **GET** /messaging_hosted_number_orders | List messaging hosted number orders
*MessagingHostedNumberApi* | [**retrieveMessagingHostedNumberOrder**](docs/MessagingHostedNumberApi.md#retrieveMessagingHostedNumberOrder) | **GET** /messaging_hosted_number_orders/{id} | Retrieve a messaging hosted number order
*MessagingHostedNumberApi* | [**uploadFileMessagingHostedNumberOrder**](docs/MessagingHostedNumberApi.md#uploadFileMessagingHostedNumberOrder) | **POST** /messaging_hosted_number_orders/{id}/actions/file_upload | Upload file required for a messaging hosted number order
*MessagingProfilesApi* | [**createMessagingProfile**](docs/MessagingProfilesApi.md#createMessagingProfile) | **POST** /messaging_profiles | Create a messaging profile
*MessagingProfilesApi* | [**deleteMessagingProfile**](docs/MessagingProfilesApi.md#deleteMessagingProfile) | **DELETE** /messaging_profiles/{id} | Delete a messaging profile
*MessagingProfilesApi* | [**listMessagingProfileMetrics**](docs/MessagingProfilesApi.md#listMessagingProfileMetrics) | **GET** /messaging_profile_metrics | List messaging profile metrics
*MessagingProfilesApi* | [**listMessagingProfilePhoneNumbers**](docs/MessagingProfilesApi.md#listMessagingProfilePhoneNumbers) | **GET** /messaging_profiles/{id}/phone_numbers | List phone numbers associated with a messaging profile
*MessagingProfilesApi* | [**listMessagingProfileShortCodes**](docs/MessagingProfilesApi.md#listMessagingProfileShortCodes) | **GET** /messaging_profiles/{id}/short_codes | List short codes associated with a messaging profile
*MessagingProfilesApi* | [**listMessagingProfiles**](docs/MessagingProfilesApi.md#listMessagingProfiles) | **GET** /messaging_profiles | List messaging profiles
*MessagingProfilesApi* | [**retrieveMessagingProfile**](docs/MessagingProfilesApi.md#retrieveMessagingProfile) | **GET** /messaging_profiles/{id} | Retrieve a messaging profile
*MessagingProfilesApi* | [**retrieveMessagingProfileDetailedMetrics**](docs/MessagingProfilesApi.md#retrieveMessagingProfileDetailedMetrics) | **GET** /messaging_profiles/{id}/metrics | Retrieve messaging profile metrics
*MessagingProfilesApi* | [**updateMessagingProfile**](docs/MessagingProfilesApi.md#updateMessagingProfile) | **PATCH** /messaging_profiles/{id} | Update a messaging profile
*MessagingUrlDomainsApi* | [**listMessagingUrlDomains**](docs/MessagingUrlDomainsApi.md#listMessagingUrlDomains) | **GET** /messaging_url_domains | List messaging URL domains
*NumberConfigurationsApi* | [**deletePhoneNumber**](docs/NumberConfigurationsApi.md#deletePhoneNumber) | **DELETE** /phone_numbers/{id} | Delete a phone number
*NumberConfigurationsApi* | [**enableEmergencyPhoneNumber**](docs/NumberConfigurationsApi.md#enableEmergencyPhoneNumber) | **POST** /phone_numbers/{id}/actions/enable_emergency | Enable emergency for a phone number
*NumberConfigurationsApi* | [**listPhoneNumbers**](docs/NumberConfigurationsApi.md#listPhoneNumbers) | **GET** /phone_numbers | List phone numbers
*NumberConfigurationsApi* | [**listPhoneNumbersWithMessagingSettings**](docs/NumberConfigurationsApi.md#listPhoneNumbersWithMessagingSettings) | **GET** /phone_numbers/messaging | List phone numbers with messaging settings
*NumberConfigurationsApi* | [**listPhoneNumbersWithVoiceSettings**](docs/NumberConfigurationsApi.md#listPhoneNumbersWithVoiceSettings) | **GET** /phone_numbers/voice | List phone numbers with voice settings
*NumberConfigurationsApi* | [**retrievePhoneNumber**](docs/NumberConfigurationsApi.md#retrievePhoneNumber) | **GET** /phone_numbers/{id} | Retrieve a phone number
*NumberConfigurationsApi* | [**retrievePhoneNumberWithMessagingSettings**](docs/NumberConfigurationsApi.md#retrievePhoneNumberWithMessagingSettings) | **GET** /phone_numbers/{id}/messaging | Retrieve a phone number with messaging settings
*NumberConfigurationsApi* | [**retrievePhoneNumberWithVoiceSettings**](docs/NumberConfigurationsApi.md#retrievePhoneNumberWithVoiceSettings) | **GET** /phone_numbers/{id}/voice | Retrieve a phone number with voice settings
*NumberConfigurationsApi* | [**updatePhoneNumber**](docs/NumberConfigurationsApi.md#updatePhoneNumber) | **PATCH** /phone_numbers/{id} | Update a phone number
*NumberConfigurationsApi* | [**updatePhoneNumberWithMessagingSettings**](docs/NumberConfigurationsApi.md#updatePhoneNumberWithMessagingSettings) | **PATCH** /phone_numbers/{id}/messaging | Update a phone number with messaging settings
*NumberConfigurationsApi* | [**updatePhoneNumberWithVoiceSettings**](docs/NumberConfigurationsApi.md#updatePhoneNumberWithVoiceSettings) | **PATCH** /phone_numbers/{id}/voice | Update a phone number with voice settings
*NumberOrderDocumentsApi* | [**createNumberOrderDocument**](docs/NumberOrderDocumentsApi.md#createNumberOrderDocument) | **POST** /number_order_documents | Create a number order document
*NumberOrderDocumentsApi* | [**listNumberOrderDocuments**](docs/NumberOrderDocumentsApi.md#listNumberOrderDocuments) | **GET** /number_order_documents | List number order documents
*NumberOrderDocumentsApi* | [**retrieveNumberOrderDocument**](docs/NumberOrderDocumentsApi.md#retrieveNumberOrderDocument) | **GET** /number_order_documents/{number_order_document_id} | Retrieve a number order document
*NumberOrderDocumentsApi* | [**updateNumberOrderDocument**](docs/NumberOrderDocumentsApi.md#updateNumberOrderDocument) | **PATCH** /number_order_documents/{number_order_document_id} | Update a number order document
*NumberOrderRegulatoryRequirementsApi* | [**listNumberOrderRegulatoryRequirements**](docs/NumberOrderRegulatoryRequirementsApi.md#listNumberOrderRegulatoryRequirements) | **GET** /regulatory_requirements | List number order regulatory requirements
*NumberOrderRegulatoryRequirementsApi* | [**listPhoneNumberRegulatoryRequirements**](docs/NumberOrderRegulatoryRequirementsApi.md#listPhoneNumberRegulatoryRequirements) | **GET** /phone_number_regulatory_requirements | List regulatory requirements per number
*NumberOrderRegulatoryRequirementsApi* | [**retrieveNumberOrderRegulatoryRequirement**](docs/NumberOrderRegulatoryRequirementsApi.md#retrieveNumberOrderRegulatoryRequirement) | **GET** /regulatory_requirements/{requirement_id} | Retrieve a number order regulatory requirement
*NumberOrdersApi* | [**createNumberOrder**](docs/NumberOrdersApi.md#createNumberOrder) | **POST** /number_orders | Create a number order
*NumberOrdersApi* | [**listNumberOrders**](docs/NumberOrdersApi.md#listNumberOrders) | **GET** /number_orders | List number orders
*NumberOrdersApi* | [**retrieveNumberOrder**](docs/NumberOrdersApi.md#retrieveNumberOrder) | **GET** /number_orders/{number_order_id} | Retrieve a number order
*NumberOrdersApi* | [**updateNumberOrder**](docs/NumberOrdersApi.md#updateNumberOrder) | **PATCH** /number_orders/{number_order_id} | Update a number order
*NumberReservationsApi* | [**createNumberReservation**](docs/NumberReservationsApi.md#createNumberReservation) | **POST** /number_reservations | Create a number reservation
*NumberReservationsApi* | [**extendNumberReservationExpiryTime**](docs/NumberReservationsApi.md#extendNumberReservationExpiryTime) | **POST** /number_reservations/{number_reservation_id}/actions/extend | Extend a number reservation
*NumberReservationsApi* | [**listNumberReservations**](docs/NumberReservationsApi.md#listNumberReservations) | **GET** /number_reservations | List number reservations
*NumberReservationsApi* | [**retrieveNumberReservation**](docs/NumberReservationsApi.md#retrieveNumberReservation) | **GET** /number_reservations/{number_reservation_id} | Retrieve a number reservation
*NumberSearchApi* | [**listAvailablePhoneNumbers**](docs/NumberSearchApi.md#listAvailablePhoneNumbers) | **GET** /available_phone_numbers | List available phone numbers
*RecordingsCommandsApi* | [**listRecordings**](docs/RecordingsCommandsApi.md#listRecordings) | **GET** /recordings | List recordings
*RecordingsCommandsApi* | [**retrieveRecording**](docs/RecordingsCommandsApi.md#retrieveRecording) | **GET** /recordings/{id} | Retrieve a recording
*ShortCodesApi* | [**listShortCodes**](docs/ShortCodesApi.md#listShortCodes) | **GET** /short_codes | List short codes
*ShortCodesApi* | [**retrieveShortCode**](docs/ShortCodesApi.md#retrieveShortCode) | **GET** /short_codes/{id} | Retrieve a short code
*ShortCodesApi* | [**updateShortCode**](docs/ShortCodesApi.md#updateShortCode) | **PATCH** /short_codes/{id} | Update short code


## Documentation for Models

 - [AnswerRequest](docs/AnswerRequest.md)
 - [AvailablePhoneNumber](docs/AvailablePhoneNumber.md)
 - [AvailablePhoneNumbersMetadata](docs/AvailablePhoneNumbersMetadata.md)
 - [BridgeRequest](docs/BridgeRequest.md)
 - [CSVDownloadResponse](docs/CSVDownloadResponse.md)
 - [Call](docs/Call.md)
 - [CallAnswered](docs/CallAnswered.md)
 - [CallAnsweredEvent](docs/CallAnsweredEvent.md)
 - [CallAnsweredPayload](docs/CallAnsweredPayload.md)
 - [CallBridged](docs/CallBridged.md)
 - [CallBridgedEvent](docs/CallBridgedEvent.md)
 - [CallBridgedPayload](docs/CallBridgedPayload.md)
 - [CallControlApplication](docs/CallControlApplication.md)
 - [CallControlApplicationInbound](docs/CallControlApplicationInbound.md)
 - [CallControlApplicationOutbound](docs/CallControlApplicationOutbound.md)
 - [CallControlApplicationResponse](docs/CallControlApplicationResponse.md)
 - [CallControlCommandResponse](docs/CallControlCommandResponse.md)
 - [CallControlCommandResult](docs/CallControlCommandResult.md)
 - [CallDtmfReceived](docs/CallDtmfReceived.md)
 - [CallDtmfReceivedEvent](docs/CallDtmfReceivedEvent.md)
 - [CallDtmfReceivedPayload](docs/CallDtmfReceivedPayload.md)
 - [CallEvent](docs/CallEvent.md)
 - [CallForkStarted](docs/CallForkStarted.md)
 - [CallForkStartedEvent](docs/CallForkStartedEvent.md)
 - [CallForkStartedPayload](docs/CallForkStartedPayload.md)
 - [CallForkStopped](docs/CallForkStopped.md)
 - [CallForkStoppedEvent](docs/CallForkStoppedEvent.md)
 - [CallForwarding](docs/CallForwarding.md)
 - [CallGatherEnded](docs/CallGatherEnded.md)
 - [CallGatherEndedEvent](docs/CallGatherEndedEvent.md)
 - [CallGatherEndedPayload](docs/CallGatherEndedPayload.md)
 - [CallHangup](docs/CallHangup.md)
 - [CallHangupEvent](docs/CallHangupEvent.md)
 - [CallHangupPayload](docs/CallHangupPayload.md)
 - [CallInitiated](docs/CallInitiated.md)
 - [CallInitiatedEvent](docs/CallInitiatedEvent.md)
 - [CallInitiatedPayload](docs/CallInitiatedPayload.md)
 - [CallMachineDetectionEnded](docs/CallMachineDetectionEnded.md)
 - [CallMachineDetectionEndedEvent](docs/CallMachineDetectionEndedEvent.md)
 - [CallMachineDetectionEndedPayload](docs/CallMachineDetectionEndedPayload.md)
 - [CallMachineGreetingEnded](docs/CallMachineGreetingEnded.md)
 - [CallMachineGreetingEndedEvent](docs/CallMachineGreetingEndedEvent.md)
 - [CallMachineGreetingEndedPayload](docs/CallMachineGreetingEndedPayload.md)
 - [CallPlaybackEnded](docs/CallPlaybackEnded.md)
 - [CallPlaybackEndedEvent](docs/CallPlaybackEndedEvent.md)
 - [CallPlaybackEndedPayload](docs/CallPlaybackEndedPayload.md)
 - [CallPlaybackStarted](docs/CallPlaybackStarted.md)
 - [CallPlaybackStartedEvent](docs/CallPlaybackStartedEvent.md)
 - [CallPlaybackStartedPayload](docs/CallPlaybackStartedPayload.md)
 - [CallRecording](docs/CallRecording.md)
 - [CallRecordingSaved](docs/CallRecordingSaved.md)
 - [CallRecordingSavedEvent](docs/CallRecordingSavedEvent.md)
 - [CallRecordingSavedPayload](docs/CallRecordingSavedPayload.md)
 - [CallRecordingSavedPayloadPublicRecordingUrls](docs/CallRecordingSavedPayloadPublicRecordingUrls.md)
 - [CallRecordingSavedPayloadRecordingUrls](docs/CallRecordingSavedPayloadRecordingUrls.md)
 - [CallRequest](docs/CallRequest.md)
 - [CallRequestAnsweringMachineDetectionConfig](docs/CallRequestAnsweringMachineDetectionConfig.md)
 - [CallSpeakEnded](docs/CallSpeakEnded.md)
 - [CallSpeakEndedEvent](docs/CallSpeakEndedEvent.md)
 - [CallSpeakEndedPayload](docs/CallSpeakEndedPayload.md)
 - [CallSpeakStarted](docs/CallSpeakStarted.md)
 - [CallSpeakStartedEvent](docs/CallSpeakStartedEvent.md)
 - [CallSpeakStartedPayload](docs/CallSpeakStartedPayload.md)
 - [CnamListing](docs/CnamListing.md)
 - [Conference](docs/Conference.md)
 - [ConferenceCallRequest](docs/ConferenceCallRequest.md)
 - [ConferenceCommandResponse](docs/ConferenceCommandResponse.md)
 - [ConferenceCommandResult](docs/ConferenceCommandResult.md)
 - [ConferenceCreated](docs/ConferenceCreated.md)
 - [ConferenceCreatedEvent](docs/ConferenceCreatedEvent.md)
 - [ConferenceCreatedPayload](docs/ConferenceCreatedPayload.md)
 - [ConferenceEnded](docs/ConferenceEnded.md)
 - [ConferenceEndedBy](docs/ConferenceEndedBy.md)
 - [ConferenceEndedEvent](docs/ConferenceEndedEvent.md)
 - [ConferenceEndedPayload](docs/ConferenceEndedPayload.md)
 - [ConferenceHoldRequest](docs/ConferenceHoldRequest.md)
 - [ConferenceMuteRequest](docs/ConferenceMuteRequest.md)
 - [ConferenceParticipantJoined](docs/ConferenceParticipantJoined.md)
 - [ConferenceParticipantJoinedEvent](docs/ConferenceParticipantJoinedEvent.md)
 - [ConferenceParticipantJoinedPayload](docs/ConferenceParticipantJoinedPayload.md)
 - [ConferenceParticipantLeft](docs/ConferenceParticipantLeft.md)
 - [ConferenceParticipantLeftEvent](docs/ConferenceParticipantLeftEvent.md)
 - [ConferenceParticipantPlaybackEnded](docs/ConferenceParticipantPlaybackEnded.md)
 - [ConferenceParticipantPlaybackEndedEvent](docs/ConferenceParticipantPlaybackEndedEvent.md)
 - [ConferenceParticipantPlaybackEndedPayload](docs/ConferenceParticipantPlaybackEndedPayload.md)
 - [ConferenceParticipantPlaybackStarted](docs/ConferenceParticipantPlaybackStarted.md)
 - [ConferenceParticipantPlaybackStartedEvent](docs/ConferenceParticipantPlaybackStartedEvent.md)
 - [ConferenceParticipantSpeakEnded](docs/ConferenceParticipantSpeakEnded.md)
 - [ConferenceParticipantSpeakEndedEvent](docs/ConferenceParticipantSpeakEndedEvent.md)
 - [ConferenceParticipantSpeakEndedPayload](docs/ConferenceParticipantSpeakEndedPayload.md)
 - [ConferenceParticipantSpeakStarted](docs/ConferenceParticipantSpeakStarted.md)
 - [ConferenceParticipantSpeakStartedEvent](docs/ConferenceParticipantSpeakStartedEvent.md)
 - [ConferencePlayRequest](docs/ConferencePlayRequest.md)
 - [ConferencePlaybackEnded](docs/ConferencePlaybackEnded.md)
 - [ConferencePlaybackEndedEvent](docs/ConferencePlaybackEndedEvent.md)
 - [ConferencePlaybackEndedPayload](docs/ConferencePlaybackEndedPayload.md)
 - [ConferencePlaybackStarted](docs/ConferencePlaybackStarted.md)
 - [ConferencePlaybackStartedEvent](docs/ConferencePlaybackStartedEvent.md)
 - [ConferenceResponse](docs/ConferenceResponse.md)
 - [ConferenceSpeakEnded](docs/ConferenceSpeakEnded.md)
 - [ConferenceSpeakEndedEvent](docs/ConferenceSpeakEndedEvent.md)
 - [ConferenceSpeakEndedPayload](docs/ConferenceSpeakEndedPayload.md)
 - [ConferenceSpeakRequest](docs/ConferenceSpeakRequest.md)
 - [ConferenceSpeakStarted](docs/ConferenceSpeakStarted.md)
 - [ConferenceSpeakStartedEvent](docs/ConferenceSpeakStartedEvent.md)
 - [ConferenceUnholdRequest](docs/ConferenceUnholdRequest.md)
 - [ConferenceUnmuteRequest](docs/ConferenceUnmuteRequest.md)
 - [CostInformation](docs/CostInformation.md)
 - [CreateCallControlApplicationRequest](docs/CreateCallControlApplicationRequest.md)
 - [CreateConferenceRequest](docs/CreateConferenceRequest.md)
 - [CreateLongCodeMessageRequest](docs/CreateLongCodeMessageRequest.md)
 - [CreateMessageRequest](docs/CreateMessageRequest.md)
 - [CreateMessagingHostedNumberOrderRequest](docs/CreateMessagingHostedNumberOrderRequest.md)
 - [CreateMessagingProfileRequest](docs/CreateMessagingProfileRequest.md)
 - [CreateNumberOrderDocumentRequest](docs/CreateNumberOrderDocumentRequest.md)
 - [CreateNumberOrderRequest](docs/CreateNumberOrderRequest.md)
 - [CreateNumberPoolMessageRequest](docs/CreateNumberPoolMessageRequest.md)
 - [CreateNumberReservationRequest](docs/CreateNumberReservationRequest.md)
 - [CreateShortCodeMessageRequest](docs/CreateShortCodeMessageRequest.md)
 - [CsvDownload](docs/CsvDownload.md)
 - [CustomSipHeader](docs/CustomSipHeader.md)
 - [EmergencySettings](docs/EmergencySettings.md)
 - [Error](docs/Error.md)
 - [ErrorMeta](docs/ErrorMeta.md)
 - [ErrorSource](docs/ErrorSource.md)
 - [Errors](docs/Errors.md)
 - [GatherUsingAudioRequest](docs/GatherUsingAudioRequest.md)
 - [GatherUsingSpeakRequest](docs/GatherUsingSpeakRequest.md)
 - [GetRecordingResponse](docs/GetRecordingResponse.md)
 - [HangupRequest](docs/HangupRequest.md)
 - [HostedNumber](docs/HostedNumber.md)
 - [InboundMessage](docs/InboundMessage.md)
 - [InboundMessageEvent](docs/InboundMessageEvent.md)
 - [InboundMessagePayload](docs/InboundMessagePayload.md)
 - [InboundMessagePayloadCost](docs/InboundMessagePayloadCost.md)
 - [InboundMessagePayloadFrom](docs/InboundMessagePayloadFrom.md)
 - [InboundMessagePayloadMedia](docs/InboundMessagePayloadMedia.md)
 - [InboundMessagePayloadTo](docs/InboundMessagePayloadTo.md)
 - [JoinConferenceRequest](docs/JoinConferenceRequest.md)
 - [ListAvailablePhoneNumbersResponse](docs/ListAvailablePhoneNumbersResponse.md)
 - [ListCSVDownloadsResponse](docs/ListCSVDownloadsResponse.md)
 - [ListCallControlApplicationsResponse](docs/ListCallControlApplicationsResponse.md)
 - [ListCallEventsResponse](docs/ListCallEventsResponse.md)
 - [ListConferencesResponse](docs/ListConferencesResponse.md)
 - [ListMessagingHostedNumberOrderResponse](docs/ListMessagingHostedNumberOrderResponse.md)
 - [ListMessagingProfileMetricsResponse](docs/ListMessagingProfileMetricsResponse.md)
 - [ListMessagingProfilePhoneNumbersResponse](docs/ListMessagingProfilePhoneNumbersResponse.md)
 - [ListMessagingProfileShortCodesResponse](docs/ListMessagingProfileShortCodesResponse.md)
 - [ListMessagingProfileUrlDomainsResponse](docs/ListMessagingProfileUrlDomainsResponse.md)
 - [ListMessagingProfilesResponse](docs/ListMessagingProfilesResponse.md)
 - [ListMessagingSettingsResponse](docs/ListMessagingSettingsResponse.md)
 - [ListNumberOrderDocumentsResponse](docs/ListNumberOrderDocumentsResponse.md)
 - [ListNumberOrderRegulatoryRequirementsResponse](docs/ListNumberOrderRegulatoryRequirementsResponse.md)
 - [ListNumberOrdersResponse](docs/ListNumberOrdersResponse.md)
 - [ListNumberReservationsResponse](docs/ListNumberReservationsResponse.md)
 - [ListParticipantsResponse](docs/ListParticipantsResponse.md)
 - [ListPhoneNumberRegulatoryRequirementsResponse](docs/ListPhoneNumberRegulatoryRequirementsResponse.md)
 - [ListPhoneNumbersResponse](docs/ListPhoneNumbersResponse.md)
 - [ListPhoneNumbersWithVoiceSettingsResponse](docs/ListPhoneNumbersWithVoiceSettingsResponse.md)
 - [ListRecordingsResponse](docs/ListRecordingsResponse.md)
 - [ListShortCodesResponse](docs/ListShortCodesResponse.md)
 - [Loopcount](docs/Loopcount.md)
 - [MediaFeatures](docs/MediaFeatures.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [MessagingFeatureSet](docs/MessagingFeatureSet.md)
 - [MessagingHostedNumberOrder](docs/MessagingHostedNumberOrder.md)
 - [MessagingProfile](docs/MessagingProfile.md)
 - [MessagingProfileDetailedMetric](docs/MessagingProfileDetailedMetric.md)
 - [MessagingProfileDetailedMetrics](docs/MessagingProfileDetailedMetrics.md)
 - [MessagingProfileHighLevelMetrics](docs/MessagingProfileHighLevelMetrics.md)
 - [MessagingProfileHighLevelMetricsInbound](docs/MessagingProfileHighLevelMetricsInbound.md)
 - [MessagingProfileHighLevelMetricsOutbound](docs/MessagingProfileHighLevelMetricsOutbound.md)
 - [MessagingProfileMessageTypeMetrics](docs/MessagingProfileMessageTypeMetrics.md)
 - [MessagingProfileResponse](docs/MessagingProfileResponse.md)
 - [MessagingUrlDomain](docs/MessagingUrlDomain.md)
 - [NumberHealthMetrics](docs/NumberHealthMetrics.md)
 - [NumberOrder](docs/NumberOrder.md)
 - [NumberOrderDocument](docs/NumberOrderDocument.md)
 - [NumberOrderDocumentResponse](docs/NumberOrderDocumentResponse.md)
 - [NumberOrderEvent](docs/NumberOrderEvent.md)
 - [NumberOrderRegulatoryRequirementResponse](docs/NumberOrderRegulatoryRequirementResponse.md)
 - [NumberOrderResponse](docs/NumberOrderResponse.md)
 - [NumberPoolSettings](docs/NumberPoolSettings.md)
 - [NumberReservation](docs/NumberReservation.md)
 - [NumberReservationResponse](docs/NumberReservationResponse.md)
 - [OutboundMessage](docs/OutboundMessage.md)
 - [OutboundMessageEvent](docs/OutboundMessageEvent.md)
 - [OutboundMessagePayload](docs/OutboundMessagePayload.md)
 - [OutboundMessagePayloadFrom](docs/OutboundMessagePayloadFrom.md)
 - [OutboundMessagePayloadMedia](docs/OutboundMessagePayloadMedia.md)
 - [OutboundMessagePayloadTo](docs/OutboundMessagePayloadTo.md)
 - [PaginationMeta](docs/PaginationMeta.md)
 - [PaginationMetaSimple](docs/PaginationMetaSimple.md)
 - [Participant](docs/Participant.md)
 - [ParticipantConference](docs/ParticipantConference.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [PhoneNumberDetailed](docs/PhoneNumberDetailed.md)
 - [PhoneNumberEnableEmergency](docs/PhoneNumberEnableEmergency.md)
 - [PhoneNumberEnableEmergencyRequest](docs/PhoneNumberEnableEmergencyRequest.md)
 - [PhoneNumberRegulatoryGroup](docs/PhoneNumberRegulatoryGroup.md)
 - [PhoneNumberRegulatoryRequirement](docs/PhoneNumberRegulatoryRequirement.md)
 - [PhoneNumberResponse](docs/PhoneNumberResponse.md)
 - [PhoneNumberWithMessagingSettings](docs/PhoneNumberWithMessagingSettings.md)
 - [PhoneNumberWithMessagingSettingsFeatures](docs/PhoneNumberWithMessagingSettingsFeatures.md)
 - [PhoneNumberWithVoiceSettings](docs/PhoneNumberWithVoiceSettings.md)
 - [PlayAudioUrlRequest](docs/PlayAudioUrlRequest.md)
 - [PlaybackStopRequest](docs/PlaybackStopRequest.md)
 - [Recording](docs/Recording.md)
 - [RecordingDownloadUrls](docs/RecordingDownloadUrls.md)
 - [RegionInformation](docs/RegionInformation.md)
 - [RegulatoryRequirement](docs/RegulatoryRequirement.md)
 - [RegulatoryRequirementCriteria](docs/RegulatoryRequirementCriteria.md)
 - [RejectRequest](docs/RejectRequest.md)
 - [ReplacedLinkClick](docs/ReplacedLinkClick.md)
 - [ReplacedLinkClickEvent](docs/ReplacedLinkClickEvent.md)
 - [ReservedPhoneNumber](docs/ReservedPhoneNumber.md)
 - [RetrieveCallStatusResponse](docs/RetrieveCallStatusResponse.md)
 - [RetrieveMessagingHostedNumberOrderResponse](docs/RetrieveMessagingHostedNumberOrderResponse.md)
 - [RetrieveMessagingHostedNumberResponse](docs/RetrieveMessagingHostedNumberResponse.md)
 - [RetrieveMessagingProfileMetricsResponse](docs/RetrieveMessagingProfileMetricsResponse.md)
 - [RetrieveMessagingSettingsResponse](docs/RetrieveMessagingSettingsResponse.md)
 - [RetrievePhoneNumberVoiceResponse](docs/RetrievePhoneNumberVoiceResponse.md)
 - [SendDTMFRequest](docs/SendDTMFRequest.md)
 - [ShortCode](docs/ShortCode.md)
 - [ShortCodeResponse](docs/ShortCodeResponse.md)
 - [SpeakRequest](docs/SpeakRequest.md)
 - [StartForkingRequest](docs/StartForkingRequest.md)
 - [StartRecordingRequest](docs/StartRecordingRequest.md)
 - [StopForkingRequest](docs/StopForkingRequest.md)
 - [StopGatherRequest](docs/StopGatherRequest.md)
 - [StopRecordingRequest](docs/StopRecordingRequest.md)
 - [TransferCallRequest](docs/TransferCallRequest.md)
 - [UpdateCallControlApplicationRequest](docs/UpdateCallControlApplicationRequest.md)
 - [UpdateMessagingProfileRequest](docs/UpdateMessagingProfileRequest.md)
 - [UpdateNumberOrderDocumentRequest](docs/UpdateNumberOrderDocumentRequest.md)
 - [UpdateNumberOrderRequest](docs/UpdateNumberOrderRequest.md)
 - [UpdatePhoneNumberMessagingSettingsRequest](docs/UpdatePhoneNumberMessagingSettingsRequest.md)
 - [UpdatePhoneNumberRequest](docs/UpdatePhoneNumberRequest.md)
 - [UpdatePhoneNumberVoiceSettingsRequest](docs/UpdatePhoneNumberVoiceSettingsRequest.md)
 - [UpdateShortCodeRequest](docs/UpdateShortCodeRequest.md)
 - [UploadFileMessagingHostedNumberOrderRequest](docs/UploadFileMessagingHostedNumberOrderRequest.md)
 - [UrlShortenerSettings](docs/UrlShortenerSettings.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@telnyx.com


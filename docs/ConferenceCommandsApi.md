# ConferenceCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conferenceDialParticipantIn**](ConferenceCommandsApi.md#conferenceDialParticipantIn) | **POST** /conferences/{id}/actions/dial_participant | Dial a new participant into a conference
[**conferenceDialParticipantInWithHttpInfo**](ConferenceCommandsApi.md#conferenceDialParticipantInWithHttpInfo) | **POST** /conferences/{id}/actions/dial_participant | Dial a new participant into a conference
[**conferenceHoldParticipants**](ConferenceCommandsApi.md#conferenceHoldParticipants) | **POST** /conferences/{id}/actions/hold | Hold conference participants
[**conferenceHoldParticipantsWithHttpInfo**](ConferenceCommandsApi.md#conferenceHoldParticipantsWithHttpInfo) | **POST** /conferences/{id}/actions/hold | Hold conference participants
[**conferenceJoin**](ConferenceCommandsApi.md#conferenceJoin) | **POST** /conferences/{id}/actions/join | Join a conference
[**conferenceJoinWithHttpInfo**](ConferenceCommandsApi.md#conferenceJoinWithHttpInfo) | **POST** /conferences/{id}/actions/join | Join a conference
[**conferenceMuteParticipants**](ConferenceCommandsApi.md#conferenceMuteParticipants) | **POST** /conferences/{id}/actions/mute | Mute conference participants
[**conferenceMuteParticipantsWithHttpInfo**](ConferenceCommandsApi.md#conferenceMuteParticipantsWithHttpInfo) | **POST** /conferences/{id}/actions/mute | Mute conference participants
[**conferencePlayAudio**](ConferenceCommandsApi.md#conferencePlayAudio) | **POST** /conferences/{id}/actions/play | Play audio to conference participants
[**conferencePlayAudioWithHttpInfo**](ConferenceCommandsApi.md#conferencePlayAudioWithHttpInfo) | **POST** /conferences/{id}/actions/play | Play audio to conference participants
[**conferenceSpeakText**](ConferenceCommandsApi.md#conferenceSpeakText) | **POST** /conferences/{id}/actions/speak | Speak text to conference participants
[**conferenceSpeakTextWithHttpInfo**](ConferenceCommandsApi.md#conferenceSpeakTextWithHttpInfo) | **POST** /conferences/{id}/actions/speak | Speak text to conference participants
[**conferenceStartRecording**](ConferenceCommandsApi.md#conferenceStartRecording) | **POST** /conferences/{id}/actions/record_start | Conference recording start
[**conferenceStartRecordingWithHttpInfo**](ConferenceCommandsApi.md#conferenceStartRecordingWithHttpInfo) | **POST** /conferences/{id}/actions/record_start | Conference recording start
[**conferenceStopRecording**](ConferenceCommandsApi.md#conferenceStopRecording) | **POST** /conferences/{id}/actions/record_stop | Conference recording stop
[**conferenceStopRecordingWithHttpInfo**](ConferenceCommandsApi.md#conferenceStopRecordingWithHttpInfo) | **POST** /conferences/{id}/actions/record_stop | Conference recording stop
[**conferenceUnholdParticipants**](ConferenceCommandsApi.md#conferenceUnholdParticipants) | **POST** /conferences/{id}/actions/unhold | Unhold conference participants
[**conferenceUnholdParticipantsWithHttpInfo**](ConferenceCommandsApi.md#conferenceUnholdParticipantsWithHttpInfo) | **POST** /conferences/{id}/actions/unhold | Unhold conference participants
[**conferenceUnmuteParticipants**](ConferenceCommandsApi.md#conferenceUnmuteParticipants) | **POST** /conferences/{id}/actions/unmute | Unmute conference participants
[**conferenceUnmuteParticipantsWithHttpInfo**](ConferenceCommandsApi.md#conferenceUnmuteParticipantsWithHttpInfo) | **POST** /conferences/{id}/actions/unmute | Unmute conference participants
[**createConference**](ConferenceCommandsApi.md#createConference) | **POST** /conferences | Create conference
[**createConferenceWithHttpInfo**](ConferenceCommandsApi.md#createConferenceWithHttpInfo) | **POST** /conferences | Create conference
[**listConferenceParticipants**](ConferenceCommandsApi.md#listConferenceParticipants) | **GET** /conferences/{conference_id}/participants | List conference participants
[**listConferenceParticipantsWithHttpInfo**](ConferenceCommandsApi.md#listConferenceParticipantsWithHttpInfo) | **GET** /conferences/{conference_id}/participants | List conference participants
[**listConferences**](ConferenceCommandsApi.md#listConferences) | **GET** /conferences | List conferences
[**listConferencesWithHttpInfo**](ConferenceCommandsApi.md#listConferencesWithHttpInfo) | **GET** /conferences | List conferences
[**retrieveConference**](ConferenceCommandsApi.md#retrieveConference) | **GET** /conferences/{id} | Retrieve a conference
[**retrieveConferenceWithHttpInfo**](ConferenceCommandsApi.md#retrieveConferenceWithHttpInfo) | **GET** /conferences/{id} | Retrieve a conference



## conferenceDialParticipantIn

> CompletableFuture<ConferenceCommandResponse> conferenceDialParticipantIn(id, conferenceCallRequest)

Dial a new participant into a conference

Dials a phone number and, when the call is answered, automatically joins them into the specified conference.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.answered&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceCallRequest conferenceCallRequest = new ConferenceCallRequest(); // ConferenceCallRequest | Dial Into Conference request object
        try {
            CompletableFuture<ConferenceCommandResponse> result = apiInstance.conferenceDialParticipantIn(id, conferenceCallRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceDialParticipantIn");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceCallRequest** | [**ConferenceCallRequest**](ConferenceCallRequest.md)| Dial Into Conference request object |

### Return type

CompletableFuture<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |

## conferenceDialParticipantInWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceCommandResponse>> conferenceDialParticipantIn conferenceDialParticipantInWithHttpInfo(id, conferenceCallRequest)

Dial a new participant into a conference

Dials a phone number and, when the call is answered, automatically joins them into the specified conference.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.answered&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceCallRequest conferenceCallRequest = new ConferenceCallRequest(); // ConferenceCallRequest | Dial Into Conference request object
        try {
            CompletableFuture<ApiResponse<ConferenceCommandResponse>> response = apiInstance.conferenceDialParticipantInWithHttpInfo(id, conferenceCallRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceDialParticipantIn");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceDialParticipantIn");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceCallRequest** | [**ConferenceCallRequest**](ConferenceCallRequest.md)| Dial Into Conference request object |

### Return type

CompletableFuture<ApiResponse<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceHoldParticipants

> CompletableFuture<ConferenceCommandResponse> conferenceHoldParticipants(id, conferenceHoldRequest)

Hold conference participants

Hold a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceHoldRequest conferenceHoldRequest = new ConferenceHoldRequest(); // ConferenceHoldRequest | 
        try {
            CompletableFuture<ConferenceCommandResponse> result = apiInstance.conferenceHoldParticipants(id, conferenceHoldRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceHoldParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceHoldRequest** | [**ConferenceHoldRequest**](ConferenceHoldRequest.md)|  |

### Return type

CompletableFuture<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |

## conferenceHoldParticipantsWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceCommandResponse>> conferenceHoldParticipants conferenceHoldParticipantsWithHttpInfo(id, conferenceHoldRequest)

Hold conference participants

Hold a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceHoldRequest conferenceHoldRequest = new ConferenceHoldRequest(); // ConferenceHoldRequest | 
        try {
            CompletableFuture<ApiResponse<ConferenceCommandResponse>> response = apiInstance.conferenceHoldParticipantsWithHttpInfo(id, conferenceHoldRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceHoldParticipants");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceHoldParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceHoldRequest** | [**ConferenceHoldRequest**](ConferenceHoldRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceJoin

> CompletableFuture<ConferenceCommandResponse> conferenceJoin(id, joinConferenceRequest)

Join a conference

Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the &#x60;call_control_id&#x60; of the leg you wish to join to the conference as an attribute.  **Expected Webhooks:**  - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        JoinConferenceRequest joinConferenceRequest = new JoinConferenceRequest(); // JoinConferenceRequest | Join Conference request object
        try {
            CompletableFuture<ConferenceCommandResponse> result = apiInstance.conferenceJoin(id, joinConferenceRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceJoin");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **joinConferenceRequest** | [**JoinConferenceRequest**](JoinConferenceRequest.md)| Join Conference request object |

### Return type

CompletableFuture<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |

## conferenceJoinWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceCommandResponse>> conferenceJoin conferenceJoinWithHttpInfo(id, joinConferenceRequest)

Join a conference

Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the &#x60;call_control_id&#x60; of the leg you wish to join to the conference as an attribute.  **Expected Webhooks:**  - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        JoinConferenceRequest joinConferenceRequest = new JoinConferenceRequest(); // JoinConferenceRequest | Join Conference request object
        try {
            CompletableFuture<ApiResponse<ConferenceCommandResponse>> response = apiInstance.conferenceJoinWithHttpInfo(id, joinConferenceRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceJoin");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceJoin");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **joinConferenceRequest** | [**JoinConferenceRequest**](JoinConferenceRequest.md)| Join Conference request object |

### Return type

CompletableFuture<ApiResponse<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceMuteParticipants

> CompletableFuture<ConferenceCommandResponse> conferenceMuteParticipants(id, conferenceMuteRequest)

Mute conference participants

Mute a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceMuteRequest conferenceMuteRequest = new ConferenceMuteRequest(); // ConferenceMuteRequest | 
        try {
            CompletableFuture<ConferenceCommandResponse> result = apiInstance.conferenceMuteParticipants(id, conferenceMuteRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceMuteParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceMuteRequest** | [**ConferenceMuteRequest**](ConferenceMuteRequest.md)|  |

### Return type

CompletableFuture<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |

## conferenceMuteParticipantsWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceCommandResponse>> conferenceMuteParticipants conferenceMuteParticipantsWithHttpInfo(id, conferenceMuteRequest)

Mute conference participants

Mute a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceMuteRequest conferenceMuteRequest = new ConferenceMuteRequest(); // ConferenceMuteRequest | 
        try {
            CompletableFuture<ApiResponse<ConferenceCommandResponse>> response = apiInstance.conferenceMuteParticipantsWithHttpInfo(id, conferenceMuteRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceMuteParticipants");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceMuteParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceMuteRequest** | [**ConferenceMuteRequest**](ConferenceMuteRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferencePlayAudio

> CompletableFuture<ConferenceCommandResponse> conferencePlayAudio(id, conferencePlayRequest)

Play audio to conference participants

Play audio to all or some participants on a conference call.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferencePlayRequest conferencePlayRequest = new ConferencePlayRequest(); // ConferencePlayRequest | 
        try {
            CompletableFuture<ConferenceCommandResponse> result = apiInstance.conferencePlayAudio(id, conferencePlayRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferencePlayAudio");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferencePlayRequest** | [**ConferencePlayRequest**](ConferencePlayRequest.md)|  |

### Return type

CompletableFuture<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |

## conferencePlayAudioWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceCommandResponse>> conferencePlayAudio conferencePlayAudioWithHttpInfo(id, conferencePlayRequest)

Play audio to conference participants

Play audio to all or some participants on a conference call.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferencePlayRequest conferencePlayRequest = new ConferencePlayRequest(); // ConferencePlayRequest | 
        try {
            CompletableFuture<ApiResponse<ConferenceCommandResponse>> response = apiInstance.conferencePlayAudioWithHttpInfo(id, conferencePlayRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#conferencePlayAudio");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferencePlayAudio");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferencePlayRequest** | [**ConferencePlayRequest**](ConferencePlayRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceSpeakText

> CompletableFuture<ConferenceCommandResponse> conferenceSpeakText(id, conferenceSpeakRequest)

Speak text to conference participants

Convert text to speech and play it to all or some participants.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Specifies the conference by id or name
        ConferenceSpeakRequest conferenceSpeakRequest = new ConferenceSpeakRequest(); // ConferenceSpeakRequest | 
        try {
            CompletableFuture<ConferenceCommandResponse> result = apiInstance.conferenceSpeakText(id, conferenceSpeakRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceSpeakText");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Specifies the conference by id or name |
 **conferenceSpeakRequest** | [**ConferenceSpeakRequest**](ConferenceSpeakRequest.md)|  |

### Return type

CompletableFuture<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |

## conferenceSpeakTextWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceCommandResponse>> conferenceSpeakText conferenceSpeakTextWithHttpInfo(id, conferenceSpeakRequest)

Speak text to conference participants

Convert text to speech and play it to all or some participants.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Specifies the conference by id or name
        ConferenceSpeakRequest conferenceSpeakRequest = new ConferenceSpeakRequest(); // ConferenceSpeakRequest | 
        try {
            CompletableFuture<ApiResponse<ConferenceCommandResponse>> response = apiInstance.conferenceSpeakTextWithHttpInfo(id, conferenceSpeakRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceSpeakText");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceSpeakText");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Specifies the conference by id or name |
 **conferenceSpeakRequest** | [**ConferenceSpeakRequest**](ConferenceSpeakRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceStartRecording

> CompletableFuture<ConferenceCommandResponse> conferenceStartRecording(id, startRecordingRequest)

Conference recording start

Start recording the conference. Recording will stop on conference end, or via the Stop Recording command.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60;

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Specifies the conference to record by id or name
        StartRecordingRequest startRecordingRequest = new StartRecordingRequest(); // StartRecordingRequest | 
        try {
            CompletableFuture<ConferenceCommandResponse> result = apiInstance.conferenceStartRecording(id, startRecordingRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceStartRecording");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Specifies the conference to record by id or name |
 **startRecordingRequest** | [**StartRecordingRequest**](StartRecordingRequest.md)|  |

### Return type

CompletableFuture<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |

## conferenceStartRecordingWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceCommandResponse>> conferenceStartRecording conferenceStartRecordingWithHttpInfo(id, startRecordingRequest)

Conference recording start

Start recording the conference. Recording will stop on conference end, or via the Stop Recording command.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60;

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Specifies the conference to record by id or name
        StartRecordingRequest startRecordingRequest = new StartRecordingRequest(); // StartRecordingRequest | 
        try {
            CompletableFuture<ApiResponse<ConferenceCommandResponse>> response = apiInstance.conferenceStartRecordingWithHttpInfo(id, startRecordingRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceStartRecording");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceStartRecording");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Specifies the conference to record by id or name |
 **startRecordingRequest** | [**StartRecordingRequest**](StartRecordingRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceStopRecording

> CompletableFuture<ConferenceCommandResponse> conferenceStopRecording(id, stopRecordingRequest)

Conference recording stop

Stop recording the conference.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Specifies the conference to stop the recording for by id or name
        StopRecordingRequest stopRecordingRequest = new StopRecordingRequest(); // StopRecordingRequest | Stop recording conference request
        try {
            CompletableFuture<ConferenceCommandResponse> result = apiInstance.conferenceStopRecording(id, stopRecordingRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceStopRecording");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Specifies the conference to stop the recording for by id or name |
 **stopRecordingRequest** | [**StopRecordingRequest**](StopRecordingRequest.md)| Stop recording conference request |

### Return type

CompletableFuture<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |

## conferenceStopRecordingWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceCommandResponse>> conferenceStopRecording conferenceStopRecordingWithHttpInfo(id, stopRecordingRequest)

Conference recording stop

Stop recording the conference.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Specifies the conference to stop the recording for by id or name
        StopRecordingRequest stopRecordingRequest = new StopRecordingRequest(); // StopRecordingRequest | Stop recording conference request
        try {
            CompletableFuture<ApiResponse<ConferenceCommandResponse>> response = apiInstance.conferenceStopRecordingWithHttpInfo(id, stopRecordingRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceStopRecording");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceStopRecording");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Specifies the conference to stop the recording for by id or name |
 **stopRecordingRequest** | [**StopRecordingRequest**](StopRecordingRequest.md)| Stop recording conference request |

### Return type

CompletableFuture<ApiResponse<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceUnholdParticipants

> CompletableFuture<ConferenceCommandResponse> conferenceUnholdParticipants(id, conferenceUnholdRequest)

Unhold conference participants

Unhold a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceUnholdRequest conferenceUnholdRequest = new ConferenceUnholdRequest(); // ConferenceUnholdRequest | 
        try {
            CompletableFuture<ConferenceCommandResponse> result = apiInstance.conferenceUnholdParticipants(id, conferenceUnholdRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceUnholdParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceUnholdRequest** | [**ConferenceUnholdRequest**](ConferenceUnholdRequest.md)|  |

### Return type

CompletableFuture<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |

## conferenceUnholdParticipantsWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceCommandResponse>> conferenceUnholdParticipants conferenceUnholdParticipantsWithHttpInfo(id, conferenceUnholdRequest)

Unhold conference participants

Unhold a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceUnholdRequest conferenceUnholdRequest = new ConferenceUnholdRequest(); // ConferenceUnholdRequest | 
        try {
            CompletableFuture<ApiResponse<ConferenceCommandResponse>> response = apiInstance.conferenceUnholdParticipantsWithHttpInfo(id, conferenceUnholdRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceUnholdParticipants");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceUnholdParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceUnholdRequest** | [**ConferenceUnholdRequest**](ConferenceUnholdRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceUnmuteParticipants

> CompletableFuture<ConferenceCommandResponse> conferenceUnmuteParticipants(id, conferenceUnmuteRequest)

Unmute conference participants

Unmute a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceUnmuteRequest conferenceUnmuteRequest = new ConferenceUnmuteRequest(); // ConferenceUnmuteRequest | 
        try {
            CompletableFuture<ConferenceCommandResponse> result = apiInstance.conferenceUnmuteParticipants(id, conferenceUnmuteRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceUnmuteParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceUnmuteRequest** | [**ConferenceUnmuteRequest**](ConferenceUnmuteRequest.md)|  |

### Return type

CompletableFuture<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |

## conferenceUnmuteParticipantsWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceCommandResponse>> conferenceUnmuteParticipants conferenceUnmuteParticipantsWithHttpInfo(id, conferenceUnmuteRequest)

Unmute conference participants

Unmute a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceUnmuteRequest conferenceUnmuteRequest = new ConferenceUnmuteRequest(); // ConferenceUnmuteRequest | 
        try {
            CompletableFuture<ApiResponse<ConferenceCommandResponse>> response = apiInstance.conferenceUnmuteParticipantsWithHttpInfo(id, conferenceUnmuteRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceUnmuteParticipants");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceUnmuteParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceUnmuteRequest** | [**ConferenceUnmuteRequest**](ConferenceUnmuteRequest.md)|  |

### Return type

CompletableFuture<ApiResponse<[**ConferenceCommandResponse**](ConferenceCommandResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## createConference

> CompletableFuture<ConferenceResponse> createConference(createConferenceRequest)

Create conference

Create a conference from an existing call leg using a &#x60;call_control_id&#x60; and a conference name. Upon creating the conference, the call will be automatically bridged to the conference. Conferences will expire after all participants have left the conference or after 4 hours regardless of the number of active participants.  **Expected Webhooks:**  - &#x60;conference.created&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; - &#x60;conference.ended&#x60; - &#x60;conference.recording.saved&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        CreateConferenceRequest createConferenceRequest = new CreateConferenceRequest(); // CreateConferenceRequest | Create a conference
        try {
            CompletableFuture<ConferenceResponse> result = apiInstance.createConference(createConferenceRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#createConference");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createConferenceRequest** | [**CreateConferenceRequest**](CreateConferenceRequest.md)| Create a conference |

### Return type

CompletableFuture<[**ConferenceResponse**](ConferenceResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a conference. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |

## createConferenceWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceResponse>> createConference createConferenceWithHttpInfo(createConferenceRequest)

Create conference

Create a conference from an existing call leg using a &#x60;call_control_id&#x60; and a conference name. Upon creating the conference, the call will be automatically bridged to the conference. Conferences will expire after all participants have left the conference or after 4 hours regardless of the number of active participants.  **Expected Webhooks:**  - &#x60;conference.created&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; - &#x60;conference.ended&#x60; - &#x60;conference.recording.saved&#x60; 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        CreateConferenceRequest createConferenceRequest = new CreateConferenceRequest(); // CreateConferenceRequest | Create a conference
        try {
            CompletableFuture<ApiResponse<ConferenceResponse>> response = apiInstance.createConferenceWithHttpInfo(createConferenceRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#createConference");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#createConference");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createConferenceRequest** | [**CreateConferenceRequest**](CreateConferenceRequest.md)| Create a conference |

### Return type

CompletableFuture<ApiResponse<[**ConferenceResponse**](ConferenceResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a conference. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |


## listConferenceParticipants

> CompletableFuture<ListParticipantsResponse> listConferenceParticipants(conferenceId, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize)

List conference participants

Lists conference participants

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String conferenceId = "conferenceId_example"; // String | Uniquely identifies the conference by id or name
        Boolean filterMuted = true; // Boolean | If present, participants will be filtered to those who are/are not muted
        Boolean filterOnHold = true; // Boolean | If present, participants will be filtered to those who are/are not put on hold
        Boolean filterWhispering = true; // Boolean | If present, participants will be filtered to those who are whispering or are not
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            CompletableFuture<ListParticipantsResponse> result = apiInstance.listConferenceParticipants(conferenceId, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#listConferenceParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceId** | **String**| Uniquely identifies the conference by id or name |
 **filterMuted** | **Boolean**| If present, participants will be filtered to those who are/are not muted | [optional]
 **filterOnHold** | **Boolean**| If present, participants will be filtered to those who are/are not put on hold | [optional]
 **filterWhispering** | **Boolean**| If present, participants will be filtered to those who are whispering or are not | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

CompletableFuture<[**ListParticipantsResponse**](ListParticipantsResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of conference participants. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |

## listConferenceParticipantsWithHttpInfo

> CompletableFuture<ApiResponse<ListParticipantsResponse>> listConferenceParticipants listConferenceParticipantsWithHttpInfo(conferenceId, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize)

List conference participants

Lists conference participants

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String conferenceId = "conferenceId_example"; // String | Uniquely identifies the conference by id or name
        Boolean filterMuted = true; // Boolean | If present, participants will be filtered to those who are/are not muted
        Boolean filterOnHold = true; // Boolean | If present, participants will be filtered to those who are/are not put on hold
        Boolean filterWhispering = true; // Boolean | If present, participants will be filtered to those who are whispering or are not
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            CompletableFuture<ApiResponse<ListParticipantsResponse>> response = apiInstance.listConferenceParticipantsWithHttpInfo(conferenceId, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#listConferenceParticipants");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#listConferenceParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceId** | **String**| Uniquely identifies the conference by id or name |
 **filterMuted** | **Boolean**| If present, participants will be filtered to those who are/are not muted | [optional]
 **filterOnHold** | **Boolean**| If present, participants will be filtered to those who are/are not put on hold | [optional]
 **filterWhispering** | **Boolean**| If present, participants will be filtered to those who are whispering or are not | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

CompletableFuture<ApiResponse<[**ListParticipantsResponse**](ListParticipantsResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of conference participants. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## listConferences

> CompletableFuture<ListConferencesResponse> listConferences(filterName, pageNumber, pageSize)

List conferences

Lists conferences. Conferences are created on demand, and will expire after all participants have left the conference or after 4 hours regardless of the number of active participants. Conferences are listed in descending order by &#x60;expires_at&#x60;.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String filterName = "filterName_example"; // String | If present, conferences will be filtered to those with a matching `name` attribute. Matching is case-sensitive
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            CompletableFuture<ListConferencesResponse> result = apiInstance.listConferences(filterName, pageNumber, pageSize);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#listConferences");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterName** | **String**| If present, conferences will be filtered to those with a matching &#x60;name&#x60; attribute. Matching is case-sensitive | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

CompletableFuture<[**ListConferencesResponse**](ListConferencesResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of conferences. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |

## listConferencesWithHttpInfo

> CompletableFuture<ApiResponse<ListConferencesResponse>> listConferences listConferencesWithHttpInfo(filterName, pageNumber, pageSize)

List conferences

Lists conferences. Conferences are created on demand, and will expire after all participants have left the conference or after 4 hours regardless of the number of active participants. Conferences are listed in descending order by &#x60;expires_at&#x60;.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String filterName = "filterName_example"; // String | If present, conferences will be filtered to those with a matching `name` attribute. Matching is case-sensitive
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            CompletableFuture<ApiResponse<ListConferencesResponse>> response = apiInstance.listConferencesWithHttpInfo(filterName, pageNumber, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#listConferences");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#listConferences");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterName** | **String**| If present, conferences will be filtered to those with a matching &#x60;name&#x60; attribute. Matching is case-sensitive | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

CompletableFuture<ApiResponse<[**ListConferencesResponse**](ListConferencesResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of conferences. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |


## retrieveConference

> CompletableFuture<ConferenceResponse> retrieveConference(id)

Retrieve a conference

Retrieve an existing conference

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        try {
            CompletableFuture<ConferenceResponse> result = apiInstance.retrieveConference(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#retrieveConference");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |

### Return type

CompletableFuture<[**ConferenceResponse**](ConferenceResponse.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a conference. |  -  |
| **404** | Conference does not exist |  -  |

## retrieveConferenceWithHttpInfo

> CompletableFuture<ApiResponse<ConferenceResponse>> retrieveConference retrieveConferenceWithHttpInfo(id)

Retrieve a conference

Retrieve an existing conference

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ConferenceCommandsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        try {
            CompletableFuture<ApiResponse<ConferenceResponse>> response = apiInstance.retrieveConferenceWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConferenceCommandsApi#retrieveConference");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#retrieveConference");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |

### Return type

CompletableFuture<ApiResponse<[**ConferenceResponse**](ConferenceResponse.md)>>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a conference. |  -  |
| **404** | Conference does not exist |  -  |


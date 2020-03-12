# EmergenciesResource

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postEmergency**](EmergenciesResource.md#postEmergency) | **POST** /emergency | Sends an emergency to the devices


<a name="postEmergency"></a>
# **postEmergency**
> EmergencyResponse postEmergency(emergency)

Sends an emergency to the devices

An emergency is sent to the devices and return users&#39;s information inside the emergency area

### Example
```java
// Import classes:
//import org.openapitools.server.resource.EmergenciesResource;

EmergenciesResource apiInstance = new EmergenciesResource();
Emergency emergency = new Emergency(); // Emergency | Information about the emergency
try {
    EmergencyResponse result = apiInstance.postEmergency(emergency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmergenciesResource#postEmergency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emergency** | [**Emergency**](Emergency.md)| Information about the emergency |

### Return type

[**EmergencyResponse**](EmergencyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain


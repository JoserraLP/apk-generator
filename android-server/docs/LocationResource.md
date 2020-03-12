# LocationResource

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsers**](LocationResource.md#getUsers) | **GET** /users | Gets users within an area


<a name="getUsers"></a>
# **getUsers**
> User getUsers(latitude, longitude, radius)

Gets users within an area

Obtain information and location of users within a geographical area

### Example
```java
// Import classes:
//import org.openapitools.server.resource.LocationResource;

LocationResource apiInstance = new LocationResource();
Double latitude = null; // Double | 
Double longitude = null; // Double | 
Double radius = null; // Double | 
try {
    User result = apiInstance.getUsers(latitude, longitude, radius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationResource#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **Double**|  | [default to null]
 **longitude** | **Double**|  | [default to null]
 **radius** | **Double**|  | [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


# openapi-android-server

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-server</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-server:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/openapi-android-server-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.server.resource.EmergenciesResource;

public class EmergenciesResourceExample {

    public static void main(String[] args) {
        EmergenciesResource apiInstance = new EmergenciesResource();
        Emergency emergency = new Emergency(); // Emergency | Information about the emergency
        try {
            EmergencyResponse result = apiInstance.postEmergency(emergency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmergenciesResource#postEmergency");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EmergenciesResource* | [**postEmergency**](docs/EmergenciesResource.md#postEmergency) | **POST** /emergency | Sends an emergency to the devices
*LocationResource* | [**getUsers**](docs/LocationResource.md#getUsers) | **GET** /users | Gets users within an area
*EmergenciesResponse* | [**postEmergency**](docs/EmergenciesResponse.md#postEmergency) | **POST** /emergency | Sends an emergency to the devices
*LocationResponse* | [**getUsers**](docs/LocationResponse.md#getUsers) | **GET** /users | Gets users within an area


## Documentation for Models

 - [Emergency](docs/Emergency.md)
 - [EmergencyResponse](docs/EmergencyResponse.md)
 - [Location](docs/Location.md)
 - [User](docs/User.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@spilab.es


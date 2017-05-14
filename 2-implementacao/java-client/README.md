# swagger-java-client

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
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        LocalDate fromDate = new LocalDate(); // LocalDate | Only return appointments that start AFTER this date.
        LocalDate toDate = new LocalDate(); // LocalDate | Only return appointments that start BEFORE this date.
        try {
            List<Appointment> result = apiInstance.appointmentsGet(fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#appointmentsGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**appointmentsGet**](docs/DefaultApi.md#appointmentsGet) | **GET** /appointments | Appointment list
*DefaultApi* | [**appointmentsPost**](docs/DefaultApi.md#appointmentsPost) | **POST** /appointments | Add appointments to list
*DefaultApi* | [**appoitmentsIdDelete**](docs/DefaultApi.md#appoitmentsIdDelete) | **DELETE** /appoitments/{id} | Remove appointments from list
*DefaultApi* | [**appoitmentsIdGet**](docs/DefaultApi.md#appoitmentsIdGet) | **GET** /appoitments/{id} | Retrieve individual physician from list
*DefaultApi* | [**appoitmentsIdPut**](docs/DefaultApi.md#appoitmentsIdPut) | **PUT** /appoitments/{id} | Update appointment
*DefaultApi* | [**patientsGet**](docs/DefaultApi.md#patientsGet) | **GET** /patients | Patient list
*DefaultApi* | [**patientsIdAppointmentsGet**](docs/DefaultApi.md#patientsIdAppointmentsGet) | **GET** /patients/{id}/appointments | Retrieve the list of appointments of patient
*DefaultApi* | [**patientsIdDelete**](docs/DefaultApi.md#patientsIdDelete) | **DELETE** /patients/{id} | Remove individual patients from list
*DefaultApi* | [**patientsIdGet**](docs/DefaultApi.md#patientsIdGet) | **GET** /patients/{id} | Return individual patients
*DefaultApi* | [**patientsIdPut**](docs/DefaultApi.md#patientsIdPut) | **PUT** /patients/{id} | Update individual patients
*DefaultApi* | [**patientsPost**](docs/DefaultApi.md#patientsPost) | **POST** /patients | Add individual patients to list
*DefaultApi* | [**physiciansGet**](docs/DefaultApi.md#physiciansGet) | **GET** /physicians | Physician list
*DefaultApi* | [**physiciansIdAppointmentsGet**](docs/DefaultApi.md#physiciansIdAppointmentsGet) | **GET** /physicians/{id}/appointments | 
*DefaultApi* | [**physiciansIdDelete**](docs/DefaultApi.md#physiciansIdDelete) | **DELETE** /physicians/{id} | Remove individual physicians from list
*DefaultApi* | [**physiciansIdGet**](docs/DefaultApi.md#physiciansIdGet) | **GET** /physicians/{id} | Retrieve individual physician from list
*DefaultApi* | [**physiciansIdPut**](docs/DefaultApi.md#physiciansIdPut) | **PUT** /physicians/{id} | Update individual physicians
*DefaultApi* | [**physiciansPost**](docs/DefaultApi.md#physiciansPost) | **POST** /physicians | Add individual physicians to list


## Documentation for Models

 - [Appointment](docs/Appointment.md)
 - [Error](docs/Error.md)
 - [Patient](docs/Patient.md)
 - [Physician](docs/Physician.md)
 - [Telephone](docs/Telephone.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




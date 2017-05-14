# DefaultApi

All URIs are relative to *http://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appointmentsGet**](DefaultApi.md#appointmentsGet) | **GET** /appointments | Appointment list
[**appointmentsPost**](DefaultApi.md#appointmentsPost) | **POST** /appointments | Add appointments to list
[**appoitmentsIdDelete**](DefaultApi.md#appoitmentsIdDelete) | **DELETE** /appoitments/{id} | Remove appointments from list
[**appoitmentsIdGet**](DefaultApi.md#appoitmentsIdGet) | **GET** /appoitments/{id} | Retrieve individual physician from list
[**appoitmentsIdPut**](DefaultApi.md#appoitmentsIdPut) | **PUT** /appoitments/{id} | Update appointment
[**patientsGet**](DefaultApi.md#patientsGet) | **GET** /patients | Patient list
[**patientsIdAppointmentsGet**](DefaultApi.md#patientsIdAppointmentsGet) | **GET** /patients/{id}/appointments | Retrieve the list of appointments of patient
[**patientsIdDelete**](DefaultApi.md#patientsIdDelete) | **DELETE** /patients/{id} | Remove individual patients from list
[**patientsIdGet**](DefaultApi.md#patientsIdGet) | **GET** /patients/{id} | Return individual patients
[**patientsIdPut**](DefaultApi.md#patientsIdPut) | **PUT** /patients/{id} | Update individual patients
[**patientsPost**](DefaultApi.md#patientsPost) | **POST** /patients | Add individual patients to list
[**physiciansGet**](DefaultApi.md#physiciansGet) | **GET** /physicians | Physician list
[**physiciansIdAppointmentsGet**](DefaultApi.md#physiciansIdAppointmentsGet) | **GET** /physicians/{id}/appointments | 
[**physiciansIdDelete**](DefaultApi.md#physiciansIdDelete) | **DELETE** /physicians/{id} | Remove individual physicians from list
[**physiciansIdGet**](DefaultApi.md#physiciansIdGet) | **GET** /physicians/{id} | Retrieve individual physician from list
[**physiciansIdPut**](DefaultApi.md#physiciansIdPut) | **PUT** /physicians/{id} | Update individual physicians
[**physiciansPost**](DefaultApi.md#physiciansPost) | **POST** /physicians | Add individual physicians to list


<a name="appointmentsGet"></a>
# **appointmentsGet**
> List&lt;Appointment&gt; appointmentsGet(fromDate, toDate)

Appointment list

Allows to return appointment list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **LocalDate**| Only return appointments that start AFTER this date. | [optional]
 **toDate** | **LocalDate**| Only return appointments that start BEFORE this date. | [optional]

### Return type

[**List&lt;Appointment&gt;**](Appointment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appointmentsPost"></a>
# **appointmentsPost**
> appointmentsPost(appointments)

Add appointments to list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Appointment appointments = new Appointment(); // Appointment | The new appointments to include.
try {
    apiInstance.appointmentsPost(appointments);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#appointmentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointments** | [**Appointment**](Appointment.md)| The new appointments to include. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appoitmentsIdDelete"></a>
# **appoitmentsIdDelete**
> appoitmentsIdDelete(id)

Remove appointments from list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The physician ID.
try {
    apiInstance.appoitmentsIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#appoitmentsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The physician ID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appoitmentsIdGet"></a>
# **appoitmentsIdGet**
> Physician appoitmentsIdGet(id)

Retrieve individual physician from list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The physician ID.
try {
    Physician result = apiInstance.appoitmentsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#appoitmentsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The physician ID. |

### Return type

[**Physician**](Physician.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appoitmentsIdPut"></a>
# **appoitmentsIdPut**
> appoitmentsIdPut(id, appointment)

Update appointment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The physician ID.
Appointment appointment = new Appointment(); // Appointment | The new version of the appointment.
try {
    apiInstance.appoitmentsIdPut(id, appointment);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#appoitmentsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The physician ID. |
 **appointment** | [**Appointment**](Appointment.md)| The new version of the appointment. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patientsGet"></a>
# **patientsGet**
> List&lt;Patient&gt; patientsGet(name)

Patient list

Allows to return patient list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Filters users by a substring of its names.
try {
    List<Patient> result = apiInstance.patientsGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#patientsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filters users by a substring of its names. | [optional]

### Return type

[**List&lt;Patient&gt;**](Patient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patientsIdAppointmentsGet"></a>
# **patientsIdAppointmentsGet**
> List&lt;Appointment&gt; patientsIdAppointmentsGet(id)

Retrieve the list of appointments of patient

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The patient ID.
try {
    List<Appointment> result = apiInstance.patientsIdAppointmentsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#patientsIdAppointmentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The patient ID. |

### Return type

[**List&lt;Appointment&gt;**](Appointment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patientsIdDelete"></a>
# **patientsIdDelete**
> patientsIdDelete(id)

Remove individual patients from list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The patient ID.
try {
    apiInstance.patientsIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#patientsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The patient ID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patientsIdGet"></a>
# **patientsIdGet**
> Patient patientsIdGet(id)

Return individual patients

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The patient ID.
try {
    Patient result = apiInstance.patientsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#patientsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The patient ID. |

### Return type

[**Patient**](Patient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patientsIdPut"></a>
# **patientsIdPut**
> patientsIdPut(id, patient)

Update individual patients

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The patient ID.
Patient patient = new Patient(); // Patient | The new version of the patient.
try {
    apiInstance.patientsIdPut(id, patient);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#patientsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The patient ID. |
 **patient** | [**Patient**](Patient.md)| The new version of the patient. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patientsPost"></a>
# **patientsPost**
> patientsPost(patient)

Add individual patients to list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Patient patient = new Patient(); // Patient | The new patient to include.
try {
    apiInstance.patientsPost(patient);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#patientsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patient** | [**Patient**](Patient.md)| The new patient to include. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="physiciansGet"></a>
# **physiciansGet**
> List&lt;Physician&gt; physiciansGet(name)

Physician list

Allows to return patient list. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Filters physicians by a substring of its names.
try {
    List<Physician> result = apiInstance.physiciansGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#physiciansGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filters physicians by a substring of its names. | [optional]

### Return type

[**List&lt;Physician&gt;**](Physician.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="physiciansIdAppointmentsGet"></a>
# **physiciansIdAppointmentsGet**
> List&lt;Appointment&gt; physiciansIdAppointmentsGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The physician ID.
try {
    List<Appointment> result = apiInstance.physiciansIdAppointmentsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#physiciansIdAppointmentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The physician ID. |

### Return type

[**List&lt;Appointment&gt;**](Appointment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="physiciansIdDelete"></a>
# **physiciansIdDelete**
> physiciansIdDelete(id)

Remove individual physicians from list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The physician ID.
try {
    apiInstance.physiciansIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#physiciansIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The physician ID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="physiciansIdGet"></a>
# **physiciansIdGet**
> Physician physiciansIdGet(id)

Retrieve individual physician from list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The physician ID.
try {
    Physician result = apiInstance.physiciansIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#physiciansIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The physician ID. |

### Return type

[**Physician**](Physician.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="physiciansIdPut"></a>
# **physiciansIdPut**
> physiciansIdPut(id, patient)

Update individual physicians

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The physician ID.
Physician patient = new Physician(); // Physician | The new version of the physicians.
try {
    apiInstance.physiciansIdPut(id, patient);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#physiciansIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The physician ID. |
 **patient** | [**Physician**](Physician.md)| The new version of the physicians. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="physiciansPost"></a>
# **physiciansPost**
> physiciansPost(patient)

Add individual physicians to list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Patient patient = new Patient(); // Patient | The new physicians to include.
try {
    apiInstance.physiciansPost(patient);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#physiciansPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patient** | [**Patient**](Patient.md)| The new physicians to include. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


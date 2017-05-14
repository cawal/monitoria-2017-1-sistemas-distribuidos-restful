package io.swagger.api;

import io.swagger.model.Appointment;
import io.swagger.model.Error;
import io.swagger.model.Patient;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-14T20:17:40.903Z")

@Api(value = "patients", description = "the patients API")
public interface PatientsApi {

    @ApiOperation(value = "Patient list", notes = "Allows to return patient list. ", response = Patient.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of patients", response = Patient.class),
        @ApiResponse(code = 404, message = "No patients found.", response = Patient.class) })
    @RequestMapping(value = "/patients",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Patient>> patientsGet( @ApiParam(value = "Filters users by a substring of its names.") @RequestParam(value = "name", required = false) String name);


    @ApiOperation(value = "Retrieve the list of appointments of patient", notes = "", response = Appointment.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The list of appointments of the patient.", response = Appointment.class),
        @ApiResponse(code = 404, message = "Erroneous ID.", response = Appointment.class) })
    @RequestMapping(value = "/patients/{id}/appointments",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Appointment>> patientsIdAppointmentsGet(@ApiParam(value = "The patient ID.",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Remove individual patients from list", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Patient deleted successfully.  No content to return.", response = Void.class),
        @ApiResponse(code = 404, message = "Patient does not exists.", response = Void.class) })
    @RequestMapping(value = "/patients/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> patientsIdDelete(@ApiParam(value = "The patient ID.",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Return individual patients", notes = "", response = Patient.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The desired patient", response = Patient.class),
        @ApiResponse(code = 404, message = "Erroneous ID.", response = Patient.class) })
    @RequestMapping(value = "/patients/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Patient> patientsIdGet(@ApiParam(value = "The patient ID.",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Update individual patients", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Patient updated successfully. No content to return.", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request. Error in request format.", response = Void.class),
        @ApiResponse(code = 404, message = "Patient does not exists.", response = Void.class) })
    @RequestMapping(value = "/patients/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> patientsIdPut(@ApiParam(value = "The patient ID.",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The new version of the patient."  ) @RequestBody Patient patient);


    @ApiOperation(value = "Add individual patients to list", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Patient created successfully.", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request.", response = Void.class),
        @ApiResponse(code = 409, message = "Conflict.", response = Void.class) })
    @RequestMapping(value = "/patients",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> patientsPost(@ApiParam(value = "The new patient to include."  ) @RequestBody Patient patient);

}

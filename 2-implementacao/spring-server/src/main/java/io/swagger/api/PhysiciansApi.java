package io.swagger.api;

import io.swagger.model.Appointment;
import io.swagger.model.Error;
import io.swagger.model.Patient;
import io.swagger.model.Physician;

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

@Api(value = "physicians", description = "the physicians API")
public interface PhysiciansApi {

    @ApiOperation(value = "Physician list", notes = "Allows to return patient list. ", response = Physician.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of physicians", response = Physician.class),
        @ApiResponse(code = 404, message = "No physician found.", response = Physician.class) })
    @RequestMapping(value = "/physicians",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Physician>> physiciansGet( @ApiParam(value = "Filters physicians by a substring of its names.") @RequestParam(value = "name", required = false) String name);


    @ApiOperation(value = "", notes = "", response = Appointment.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The list of appointments of the physician.", response = Appointment.class),
        @ApiResponse(code = 404, message = "Erroneous ID.", response = Appointment.class) })
    @RequestMapping(value = "/physicians/{id}/appointments",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Appointment>> physiciansIdAppointmentsGet(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Remove individual physicians from list", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Physician deleted successfully.  No content to return.", response = Void.class),
        @ApiResponse(code = 404, message = "Physician does not exists.", response = Void.class) })
    @RequestMapping(value = "/physicians/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> physiciansIdDelete(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Retrieve individual physician from list", notes = "", response = Physician.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The desired physician", response = Physician.class),
        @ApiResponse(code = 404, message = "Erroneous ID.", response = Physician.class) })
    @RequestMapping(value = "/physicians/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Physician> physiciansIdGet(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Update individual physicians", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Physician updated successfully. No content to return.", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request. Error in request format.", response = Void.class),
        @ApiResponse(code = 404, message = "Physician does not exists.", response = Void.class) })
    @RequestMapping(value = "/physicians/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> physiciansIdPut(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The new version of the physicians."  ) @RequestBody Physician patient);


    @ApiOperation(value = "Add individual physicians to list", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Physicians created successfully.", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request.", response = Void.class),
        @ApiResponse(code = 409, message = "Conflict.", response = Void.class) })
    @RequestMapping(value = "/physicians",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> physiciansPost(@ApiParam(value = "The new physicians to include."  ) @RequestBody Patient patient);

}

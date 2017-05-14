package io.swagger.api;

import io.swagger.model.Appointment;
import io.swagger.model.Error;
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

@Api(value = "appoitments", description = "the appoitments API")
public interface AppoitmentsApi {

    @ApiOperation(value = "Remove appointments from list", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Appointment deleted successfully.  No content to return.", response = Void.class),
        @ApiResponse(code = 404, message = "Appointment does not exists.", response = Void.class) })
    @RequestMapping(value = "/appoitments/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> appoitmentsIdDelete(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Retrieve individual physician from list", notes = "", response = Physician.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The desired physician", response = Physician.class),
        @ApiResponse(code = 404, message = "Erroneous ID.", response = Physician.class) })
    @RequestMapping(value = "/appoitments/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Physician> appoitmentsIdGet(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Update appointment", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Appointment updated successfully. No content to return.", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request. Error in request format.", response = Void.class),
        @ApiResponse(code = 404, message = "Appointment does not exists.", response = Void.class) })
    @RequestMapping(value = "/appoitments/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> appoitmentsIdPut(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The new version of the appointment."  ) @RequestBody Appointment appointment);

}

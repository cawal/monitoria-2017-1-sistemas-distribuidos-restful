package io.swagger.api;

import io.swagger.model.Appointment;
import io.swagger.model.Error;
import org.joda.time.LocalDate;

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

@Api(value = "appointments", description = "the appointments API")
public interface AppointmentsApi {

    @ApiOperation(value = "Appointment list", notes = "Allows to return appointment list. ", response = Appointment.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of appointments", response = Appointment.class),
        @ApiResponse(code = 404, message = "No appointments found.", response = Appointment.class) })
    @RequestMapping(value = "/appointments",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Appointment>> appointmentsGet( @ApiParam(value = "Only return appointments that start AFTER this date.") @RequestParam(value = "fromDate", required = false) LocalDate fromDate,
         @ApiParam(value = "Only return appointments that start BEFORE this date.") @RequestParam(value = "toDate", required = false) LocalDate toDate);


    @ApiOperation(value = "Add appointments to list", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Appointment created successfully.", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request.", response = Void.class),
        @ApiResponse(code = 409, message = "Conflict.", response = Void.class) })
    @RequestMapping(value = "/appointments",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> appointmentsPost(@ApiParam(value = "The new appointments to include."  ) @RequestBody Appointment appointments);

}

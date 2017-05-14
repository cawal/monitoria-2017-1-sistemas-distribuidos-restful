package io.swagger.api;

import io.swagger.model.Appointment;
import io.swagger.model.Error;
import io.swagger.model.Patient;
import io.swagger.model.Physician;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-14T20:17:40.903Z")

@Controller
public class PhysiciansApiController implements PhysiciansApi {



    public ResponseEntity<List<Physician>> physiciansGet( @ApiParam(value = "Filters physicians by a substring of its names.") @RequestParam(value = "name", required = false) String name) {
        // do some magic!
        return new ResponseEntity<List<Physician>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Appointment>> physiciansIdAppointmentsGet(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<List<Appointment>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> physiciansIdDelete(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Physician> physiciansIdGet(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Physician>(HttpStatus.OK);
    }

    public ResponseEntity<Void> physiciansIdPut(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The new version of the physicians."  ) @RequestBody Physician patient) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> physiciansPost(@ApiParam(value = "The new physicians to include."  ) @RequestBody Patient patient) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

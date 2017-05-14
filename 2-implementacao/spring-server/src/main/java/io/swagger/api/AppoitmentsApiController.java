package io.swagger.api;

import io.swagger.model.Appointment;
import io.swagger.model.Error;
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
public class AppoitmentsApiController implements AppoitmentsApi {



    public ResponseEntity<Void> appoitmentsIdDelete(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Physician> appoitmentsIdGet(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Physician>(HttpStatus.OK);
    }

    public ResponseEntity<Void> appoitmentsIdPut(@ApiParam(value = "The physician ID.",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The new version of the appointment."  ) @RequestBody Appointment appointment) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

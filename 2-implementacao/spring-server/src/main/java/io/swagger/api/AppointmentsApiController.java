package io.swagger.api;

import io.swagger.model.Appointment;
import io.swagger.model.Error;
import org.joda.time.LocalDate;

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
public class AppointmentsApiController implements AppointmentsApi {



    public ResponseEntity<List<Appointment>> appointmentsGet( @ApiParam(value = "Only return appointments that start AFTER this date.") @RequestParam(value = "fromDate", required = false) LocalDate fromDate,
         @ApiParam(value = "Only return appointments that start BEFORE this date.") @RequestParam(value = "toDate", required = false) LocalDate toDate) {
        // do some magic!
        return new ResponseEntity<List<Appointment>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> appointmentsPost(@ApiParam(value = "The new appointments to include."  ) @RequestBody Appointment appointments) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

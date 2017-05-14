package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Patient;
import io.swagger.model.Physician;
import javax.validation.constraints.*;
/**
 * Appointment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-14T20:17:40.903Z")

public class Appointment   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("physician")
  private Physician physician = null;

  @JsonProperty("patient")
  private Patient patient = null;

  @JsonProperty("date")
  private String date = null;

  public Appointment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique global id of this appontment.
   * @return id
  **/
  @ApiModelProperty(value = "The unique global id of this appontment.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Appointment physician(Physician physician) {
    this.physician = physician;
    return this;
  }

   /**
   * Get physician
   * @return physician
  **/
  @ApiModelProperty(value = "")
  public Physician getPhysician() {
    return physician;
  }

  public void setPhysician(Physician physician) {
    this.physician = physician;
  }

  public Appointment patient(Patient patient) {
    this.patient = patient;
    return this;
  }

   /**
   * Get patient
   * @return patient
  **/
  @ApiModelProperty(value = "")
  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public Appointment date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appointment appointment = (Appointment) o;
    return Objects.equals(this.id, appointment.id) &&
        Objects.equals(this.physician, appointment.physician) &&
        Objects.equals(this.patient, appointment.patient) &&
        Objects.equals(this.date, appointment.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, physician, patient, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Appointment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    physician: ").append(toIndentedString(physician)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


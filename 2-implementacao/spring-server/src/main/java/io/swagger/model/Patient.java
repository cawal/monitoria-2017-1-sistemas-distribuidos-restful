package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Telephone;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Patient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-14T20:17:40.903Z")

public class Patient   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("telephones")
  private List<Telephone> telephones = new ArrayList<Telephone>();

  @JsonProperty("preferredPhone")
  private String preferredPhone = null;

  public Patient id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique global id of this patient.
   * @return id
  **/
  @ApiModelProperty(value = "The unique global id of this patient.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Patient name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The patient's full name.
   * @return name
  **/
  @ApiModelProperty(value = "The patient's full name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Patient telephones(List<Telephone> telephones) {
    this.telephones = telephones;
    return this;
  }

  public Patient addTelephonesItem(Telephone telephonesItem) {
    this.telephones.add(telephonesItem);
    return this;
  }

   /**
   * Get telephones
   * @return telephones
  **/
  @ApiModelProperty(value = "")
  public List<Telephone> getTelephones() {
    return telephones;
  }

  public void setTelephones(List<Telephone> telephones) {
    this.telephones = telephones;
  }

  public Patient preferredPhone(String preferredPhone) {
    this.preferredPhone = preferredPhone;
    return this;
  }

   /**
   * The ID of the preferred phone to call this patient.
   * @return preferredPhone
  **/
  @ApiModelProperty(value = "The ID of the preferred phone to call this patient.")
  public String getPreferredPhone() {
    return preferredPhone;
  }

  public void setPreferredPhone(String preferredPhone) {
    this.preferredPhone = preferredPhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Patient patient = (Patient) o;
    return Objects.equals(this.id, patient.id) &&
        Objects.equals(this.name, patient.name) &&
        Objects.equals(this.telephones, patient.telephones) &&
        Objects.equals(this.preferredPhone, patient.preferredPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, telephones, preferredPhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Patient {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    telephones: ").append(toIndentedString(telephones)).append("\n");
    sb.append("    preferredPhone: ").append(toIndentedString(preferredPhone)).append("\n");
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


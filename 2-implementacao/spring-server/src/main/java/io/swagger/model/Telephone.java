package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Telephone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-14T20:17:40.903Z")

public class Telephone   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("number")
  private String number = null;

  public Telephone id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unque global id of this telephone number.
   * @return id
  **/
  @ApiModelProperty(value = "The unque global id of this telephone number.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Telephone number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The full telephone number.
   * @return number
  **/
  @ApiModelProperty(value = "The full telephone number.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Telephone telephone = (Telephone) o;
    return Objects.equals(this.id, telephone.id) &&
        Objects.equals(this.number, telephone.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Telephone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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


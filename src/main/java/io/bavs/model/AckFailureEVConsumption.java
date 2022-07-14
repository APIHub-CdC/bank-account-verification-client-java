package io.bavs.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.bavs.model.AckAcountValidator;
import io.bavs.model.FailureEVConsumption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Acknowledge of an unsuccessful employment verification process.")


public class AckFailureEVConsumption extends AckAcountValidator {
  @SerializedName("employmentVerification")
  private FailureEVConsumption employmentVerification = null;
  public AckFailureEVConsumption employmentVerification(FailureEVConsumption employmentVerification) {
    this.employmentVerification = employmentVerification;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public FailureEVConsumption getEmploymentVerification() {
    return employmentVerification;
  }
  public void setEmploymentVerification(FailureEVConsumption employmentVerification) {
    this.employmentVerification = employmentVerification;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckFailureEVConsumption ackFailureEVConsumption = (AckFailureEVConsumption) o;
    return Objects.equals(this.employmentVerification, ackFailureEVConsumption.employmentVerification) &&
        super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(employmentVerification, super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckFailureEVConsumption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    employmentVerification: ").append(toIndentedString(employmentVerification)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

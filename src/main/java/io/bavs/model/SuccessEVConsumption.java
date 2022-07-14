package io.bavs.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.bavs.model.AccountValidator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Information about a successful employment verification process.")


public class SuccessEVConsumption {
  @SerializedName("request")
  private AccountValidator request = null;
  @SerializedName("verificationConfidence")
  private Float verificationConfidence = null;
  @SerializedName("ownershipConfidence")
  private Float ownershipConfidence = null;
  public SuccessEVConsumption request(AccountValidator request) {
    this.request = request;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public AccountValidator getRequest() {
    return request;
  }
  public void setRequest(AccountValidator request) {
    this.request = request;
  }
  public SuccessEVConsumption verificationConfidence(Float verificationConfidence) {
    this.verificationConfidence = verificationConfidence;
    return this;
  }
   
  @ApiModelProperty(example = "0.76", value = "It is the level of confidence in the verification process 0.00 - 1.00")
  public Float getVerificationConfidence() {
    return verificationConfidence;
  }
  public void setVerificationConfidence(Float verificationConfidence) {
    this.verificationConfidence = verificationConfidence;
  }
  public SuccessEVConsumption ownershipConfidence(Float ownershipConfidence) {
    this.ownershipConfidence = ownershipConfidence;
    return this;
  }
   
  @ApiModelProperty(example = "0.99", value = "It is the final result of the verification process 0.00 - 1.00")
  public Float getOwnershipConfidence() {
    return ownershipConfidence;
  }
  public void setOwnershipConfidence(Float ownershipConfidence) {
    this.ownershipConfidence = ownershipConfidence;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessEVConsumption successEVConsumption = (SuccessEVConsumption) o;
    return Objects.equals(this.request, successEVConsumption.request) &&
        Objects.equals(this.verificationConfidence, successEVConsumption.verificationConfidence) &&
        Objects.equals(this.ownershipConfidence, successEVConsumption.ownershipConfidence);
  }
  @Override
  public int hashCode() {
    return Objects.hash(request, verificationConfidence, ownershipConfidence);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessEVConsumption {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    verificationConfidence: ").append(toIndentedString(verificationConfidence)).append("\n");
    sb.append("    ownershipConfidence: ").append(toIndentedString(ownershipConfidence)).append("\n");
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

package io.bavs.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.bavs.model.AckAcountValidator;
import io.bavs.model.SuccessEVConsumption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Acknowledge of a successful employment verification process.")


public class AckSuccessEVConsumption extends AckAcountValidator {
  @SerializedName("result")
  private SuccessEVConsumption result = null;
  public AckSuccessEVConsumption result(SuccessEVConsumption result) {
    this.result = result;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public SuccessEVConsumption getResult() {
    return result;
  }
  public void setResult(SuccessEVConsumption result) {
    this.result = result;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckSuccessEVConsumption ackSuccessEVConsumption = (AckSuccessEVConsumption) o;
    return Objects.equals(this.result, ackSuccessEVConsumption.result) &&
        super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(result, super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckSuccessEVConsumption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

package io.bavs.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.bavs.model.AccountValidator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Information about a successful employment verification process.")

public class SuccessEVConsumption {
	@SerializedName("errors")
	private Errors errors = null;
	@SerializedName("request")
	private AccountValidator request = null;
	@SerializedName("verificationConfidence")
	private Float verificationConfidence = null;
	@SerializedName("ownershipConfidence")
	private Float ownershipConfidence = null;
	@SerializedName("cepUrl")
	private String cep = null;

	public SuccessEVConsumption request(AccountValidator request) {
		this.request = request;
		return this;
	}

	public Errors getErrors() {
		return errors;
	}

	public void setErrors(Errors errors) {
		this.errors = errors;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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
		return Objects.equals(this.request, successEVConsumption.request)
				&& Objects.equals(this.errors, successEVConsumption.errors)
				&& Objects.equals(this.verificationConfidence, successEVConsumption.verificationConfidence)
				&& Objects.equals(this.ownershipConfidence, successEVConsumption.ownershipConfidence)
				&& Objects.equals(this.cep, successEVConsumption.cep);
	}

	@Override
	public int hashCode() {
		return Objects.hash(errors, request, verificationConfidence, ownershipConfidence);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SuccessEVConsumption {\n");
		
		sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
		sb.append("    request: ").append(toIndentedString(request)).append("\n");
		sb.append("    verificationConfidence: ").append(toIndentedString(verificationConfidence)).append("\n");
		sb.append("    ownershipConfidence: ").append(toIndentedString(ownershipConfidence)).append("\n");
		sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
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

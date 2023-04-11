package io.bavs.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Account Validator information. It must include the the privacy notice customer acceptance.")


public class AccountValidatorWithPrivacyNotice {
  @SerializedName("accountValidator")
  private AccountValidator accountValidator = null;
  
  public AccountValidatorWithPrivacyNotice accountValidator(AccountValidator accountValidator) {
    this.accountValidator = accountValidator;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public AccountValidator getAccountValidator() {
    return accountValidator;
  }
  public void setAccountValidator(AccountValidator accountValidator) {
    this.accountValidator = accountValidator;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountValidatorWithPrivacyNotice accountValidatorWithPrivacyNotice = (AccountValidatorWithPrivacyNotice) o;
    return Objects.equals(this.accountValidator, accountValidatorWithPrivacyNotice.accountValidator);
  }
  @Override
  public int hashCode() {
    return Objects.hash(accountValidator);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountValidatorWithPrivacyNotice {\n");
    
    sb.append("    accountValidator: ").append(toIndentedString(accountValidator)).append("\n");
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

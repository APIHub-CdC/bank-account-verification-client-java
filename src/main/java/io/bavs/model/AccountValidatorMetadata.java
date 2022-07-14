package io.bavs.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.bavs.model.AccountValidators;
import io.bavs.model.Metadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Metadata (paging information) of the list of employment verification processes.")


public class AccountValidatorMetadata {
  @SerializedName("_metadata")
  private Metadata metadata = null;
  @SerializedName("inquiries")
  private AccountValidators inquiries = null;
  public AccountValidatorMetadata metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Metadata getMetadata() {
    return metadata;
  }
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }
  public AccountValidatorMetadata inquiries(AccountValidators inquiries) {
    this.inquiries = inquiries;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public AccountValidators getInquiries() {
    return inquiries;
  }
  public void setInquiries(AccountValidators inquiries) {
    this.inquiries = inquiries;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountValidatorMetadata accountValidatorMetadata = (AccountValidatorMetadata) o;
    return Objects.equals(this.metadata, accountValidatorMetadata.metadata) &&
        Objects.equals(this.inquiries, accountValidatorMetadata.inquiries);
  }
  @Override
  public int hashCode() {
    return Objects.hash(metadata, inquiries);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountValidatorMetadata {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    inquiries: ").append(toIndentedString(inquiries)).append("\n");
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

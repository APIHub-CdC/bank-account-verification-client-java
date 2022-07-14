package io.bavs.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

@ApiModel(description = "Identifier of the account validator process.")


public class AccountValidatorId {
  @SerializedName("externalId")
  private UUID externalId = null;
  @SerializedName("subscriptionId")
  private UUID subscriptionId = null;
  @SerializedName("inquiryId")
  private UUID inquiryId = null;
  public AccountValidatorId externalId(UUID externalId) {
    this.externalId = externalId;
    return this;
  }
   
  @ApiModelProperty(example = "391d151f-1cac-44e7-a05b-79a1199621d6", value = "The identifier of the account validator request given by the API consumer (UUID).")
  public UUID getExternalId() {
    return externalId;
  }
  public void setExternalId(UUID externalId) {
    this.externalId = externalId;
  }
  public AccountValidatorId subscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }
   
  @ApiModelProperty(example = "7c8a0230-36e0-43f4-9b7a-581dc55ea9c3", value = "The API Hub event subscription identifier (UUID).")
  public UUID getSubscriptionId() {
    return subscriptionId;
  }
  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }
   
  @ApiModelProperty(example = "a19fb6b8-2677-44f2-9cd7-3b2f78bb6f8c", value = "The account validator process identifier given by Círculo de Crédito.")
  public UUID getInquiryId() {
    return inquiryId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountValidatorId accountValidatorId = (AccountValidatorId) o;
    return Objects.equals(this.externalId, accountValidatorId.externalId) &&
        Objects.equals(this.subscriptionId, accountValidatorId.subscriptionId) &&
        Objects.equals(this.inquiryId, accountValidatorId.inquiryId);
  }
  @Override
  public int hashCode() {
    return Objects.hash(externalId, subscriptionId, inquiryId);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountValidatorId {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    inquiryId: ").append(toIndentedString(inquiryId)).append("\n");
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

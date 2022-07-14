package io.bavs.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

@ApiModel(description = "The privacy notice the Customer must accept.")


public class PrivacyNotice {
  @SerializedName("acceptanceDate")
  private OffsetDateTime acceptanceDate = null;
  
  @JsonAdapter(AcceptanceEnum.Adapter.class)
  public enum AcceptanceEnum {
    Y("Y"),
    
    N("N");
    private String value;
    AcceptanceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AcceptanceEnum fromValue(String text) {
      for (AcceptanceEnum b : AcceptanceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AcceptanceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AcceptanceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public AcceptanceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AcceptanceEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("acceptance")
  private AcceptanceEnum acceptance = null;
  public PrivacyNotice acceptanceDate(OffsetDateTime acceptanceDate) {
    this.acceptanceDate = acceptanceDate;
    return this;
  }
   
  @ApiModelProperty(example = "2020-04-12T22:20:50.52Z", value = "Date and time of the privacy notice acceptance. As defined by date-time - RFC3339.")
  public OffsetDateTime getAcceptanceDate() {
    return acceptanceDate;
  }
  public void setAcceptanceDate(OffsetDateTime acceptanceDate) {
    this.acceptanceDate = acceptanceDate;
  }
  public PrivacyNotice acceptance(AcceptanceEnum acceptance) {
    this.acceptance = acceptance;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Y if the Customer has accepted the privacy notice otherwise these field must be N.")
  public AcceptanceEnum getAcceptance() {
    return acceptance;
  }
  public void setAcceptance(AcceptanceEnum acceptance) {
    this.acceptance = acceptance;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivacyNotice privacyNotice = (PrivacyNotice) o;
    return Objects.equals(this.acceptanceDate, privacyNotice.acceptanceDate) &&
        Objects.equals(this.acceptance, privacyNotice.acceptance);
  }
  @Override
  public int hashCode() {
    return Objects.hash(acceptanceDate, acceptance);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivacyNotice {\n");
    
    sb.append("    acceptanceDate: ").append(toIndentedString(acceptanceDate)).append("\n");
    sb.append("    acceptance: ").append(toIndentedString(acceptance)).append("\n");
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

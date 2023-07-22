package io.bavs.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.bavs.model.AccountValidatorId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

@ApiModel(description = "Account Validator information")

public class AccountValidator extends AccountValidatorId {
	@SerializedName("bankId")
	private Integer bankId = null;

	@JsonAdapter(AccountTypeEnum.Adapter.class)
	public enum AccountTypeEnum {

		PERSONAFISICA("1"),

		PERSONAMORAL("2");

		private String value;

		AccountTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static AccountTypeEnum fromValue(String text) {
			for (AccountTypeEnum b : AccountTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<AccountTypeEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return AccountTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("accountType")
	private AccountTypeEnum accountType = null;

	@JsonAdapter(IdentifierTypeEnum.Adapter.class)
	public enum IdentifierTypeEnum {
		CLABE("CLABE"),

		PHONENUMBER("PhoneNumber"),

		ACCOUNTNUMBER("AccountNumber");

		private String value;

		IdentifierTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static IdentifierTypeEnum fromValue(String text) {
			for (IdentifierTypeEnum b : IdentifierTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<IdentifierTypeEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final IdentifierTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public IdentifierTypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return IdentifierTypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("identifierType")
	private IdentifierTypeEnum identifierType = null;
	@SerializedName("accountIdentifier")
	private String accountIdentifier = null;
	@SerializedName("name")
	private String name = null;
	@SerializedName("secondName")
	private String secondName = null;
	@SerializedName("lastName")
	private String lastName = null;
	@SerializedName("secondLastName")
	private String secondLastName = null;
	@SerializedName("citizenId")
	private String citizenId = null;
	@SerializedName("taxPayerIdentificationNumber")
	private String taxPayerIdentificationNumber = null;
	@SerializedName("verifierCompany")
	private String verifierCompany = null;

	public AccountValidator bankId(Integer bankId) {
		this.bankId = bankId;
		return this;
	}

	public IdentifierTypeEnum getIdentifierType() {
		return identifierType;
	}

	public void setIdentifierType(IdentifierTypeEnum identifierType) {
		this.identifierType = identifierType;
	}

	@ApiModelProperty(required = true, value = "")
	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public AccountValidator accountType(AccountTypeEnum accountType) {
		this.accountType = accountType;
		return this;
	}

	@ApiModelProperty(example = "CLABE", required = true, value = "Account  Type \"CLABE\", \"PhoneNumber\", \"AccountNumber\".")
	public AccountTypeEnum getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeEnum accountType) {
		this.accountType = accountType;
	}

	public AccountValidator accountIdentifier(String accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
		return this;
	}

	@ApiModelProperty(example = "12345678901234567890", required = true, value = " Clabe or PhoneNumber or Number account of the recipient of the transaction to validate.")
	public String getAccountIdentifier() {
		return accountIdentifier;
	}

	public void setAccountIdentifier(String accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}

	public AccountValidator name(String name) {
		this.name = name;
		return this;
	}

	@ApiModelProperty(example = "Juan", required = true, value = "name or business name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountValidator secondName(String secondName) {
		this.secondName = secondName;
		return this;
	}

	@ApiModelProperty(example = "Pruebas", value = "Second name")
	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public AccountValidator lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@ApiModelProperty(example = "ocho", required = true, value = "last name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public AccountValidator secondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
		return this;
	}

	@ApiModelProperty(example = "seis", value = "second last name")
	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public AccountValidator citizenId(String citizenId) {
		this.citizenId = citizenId;
		return this;
	}

	@ApiModelProperty(example = "SSSS010101SSSSXXXX", value = "Mexican CURP")
	public String getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}

	public AccountValidator taxPayerIdentificationNumber(String taxPayerIdentificationNumber) {
		this.taxPayerIdentificationNumber = taxPayerIdentificationNumber;
		return this;
	}

	@ApiModelProperty(example = "SSSS010101XXX", value = "Mexican RFC")
	public String getTaxPayerIdentificationNumber() {
		return taxPayerIdentificationNumber;
	}

	public void setTaxPayerIdentificationNumber(String taxPayerIdentificationNumber) {
		this.taxPayerIdentificationNumber = taxPayerIdentificationNumber;
	}

	public AccountValidator verifierCompany(String verifierCompany) {
		this.verifierCompany = verifierCompany;
		return this;
	}

	@ApiModelProperty(example = "Empresa 1", required = true, value = "Nombre empresa verificadora")
	public String getVerifierCompany() {
		return verifierCompany;
	}

	public void setVerifierCompany(String verifierCompany) {
		this.verifierCompany = verifierCompany;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountValidator accountValidator = (AccountValidator) o;
		return Objects.equals(this.bankId, accountValidator.bankId)
				&& Objects.equals(this.accountType, accountValidator.accountType)
				&& Objects.equals(this.accountIdentifier, accountValidator.accountIdentifier)
				&& Objects.equals(this.identifierType, accountValidator.identifierType)
				&& Objects.equals(this.name, accountValidator.name)
				&& Objects.equals(this.secondName, accountValidator.secondName)
				&& Objects.equals(this.lastName, accountValidator.lastName)
				&& Objects.equals(this.secondLastName, accountValidator.secondLastName)
				&& Objects.equals(this.citizenId, accountValidator.citizenId)
				&& Objects.equals(this.taxPayerIdentificationNumber, accountValidator.taxPayerIdentificationNumber)
				&& Objects.equals(this.verifierCompany, accountValidator.verifierCompany) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankId, accountType, accountIdentifier, name, secondName, lastName, secondLastName,
				citizenId, taxPayerIdentificationNumber, verifierCompany, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountValidator {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
		sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
		sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
		sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    secondLastName: ").append(toIndentedString(secondLastName)).append("\n");
		sb.append("    citizenId: ").append(toIndentedString(citizenId)).append("\n");
		sb.append("    taxPayerIdentificationNumber: ").append(toIndentedString(taxPayerIdentificationNumber))
				.append("\n");
		sb.append("    verifierCompany: ").append(toIndentedString(verifierCompany)).append("\n");
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

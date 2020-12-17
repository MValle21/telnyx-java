/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PhoneNumbersJobFailedOperation
 */
@JsonPropertyOrder({
  PhoneNumbersJobFailedOperation.JSON_PROPERTY_PHONE_NUMBER,
  PhoneNumbersJobFailedOperation.JSON_PROPERTY_ID,
  PhoneNumbersJobFailedOperation.JSON_PROPERTY_ERRORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PhoneNumbersJobFailedOperation {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;


  public PhoneNumbersJobFailedOperation phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number in e164 format.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number in e164 format.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PhoneNumbersJobFailedOperation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The phone number&#39;s ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number's ID")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PhoneNumbersJobFailedOperation errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public PhoneNumbersJobFailedOperation addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  /**
   * Return true if this PhoneNumbersJobFailedOperation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumbersJobFailedOperation phoneNumbersJobFailedOperation = (PhoneNumbersJobFailedOperation) o;
    return Objects.equals(this.phoneNumber, phoneNumbersJobFailedOperation.phoneNumber) &&
        Objects.equals(this.id, phoneNumbersJobFailedOperation.id) &&
        Objects.equals(this.errors, phoneNumbersJobFailedOperation.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, id, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumbersJobFailedOperation {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


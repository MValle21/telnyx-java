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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UploadFileMessagingHostedNumberOrderRequest
 */
@JsonPropertyOrder({
  UploadFileMessagingHostedNumberOrderRequest.JSON_PROPERTY_LOA,
  UploadFileMessagingHostedNumberOrderRequest.JSON_PROPERTY_BILL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UploadFileMessagingHostedNumberOrderRequest {
  public static final String JSON_PROPERTY_LOA = "loa";
  private File loa;

  public static final String JSON_PROPERTY_BILL = "bill";
  private File bill;


  public UploadFileMessagingHostedNumberOrderRequest loa(File loa) {
    this.loa = loa;
    return this;
  }

   /**
   * Must be a signed LOA for the numbers in the order in PDF format.
   * @return loa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Must be a signed LOA for the numbers in the order in PDF format.")
  @JsonProperty(JSON_PROPERTY_LOA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getLoa() {
    return loa;
  }


  public void setLoa(File loa) {
    this.loa = loa;
  }


  public UploadFileMessagingHostedNumberOrderRequest bill(File bill) {
    this.bill = bill;
    return this;
  }

   /**
   * Must be the last month&#39;s bill with proof of ownership of all of the numbers in the order in PDF format.
   * @return bill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Must be the last month's bill with proof of ownership of all of the numbers in the order in PDF format.")
  @JsonProperty(JSON_PROPERTY_BILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getBill() {
    return bill;
  }


  public void setBill(File bill) {
    this.bill = bill;
  }


  /**
   * Return true if this UploadFileMessagingHostedNumberOrderRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFileMessagingHostedNumberOrderRequest uploadFileMessagingHostedNumberOrderRequest = (UploadFileMessagingHostedNumberOrderRequest) o;
    return Objects.equals(this.loa, uploadFileMessagingHostedNumberOrderRequest.loa) &&
        Objects.equals(this.bill, uploadFileMessagingHostedNumberOrderRequest.bill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loa, bill);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadFileMessagingHostedNumberOrderRequest {\n");
    sb.append("    loa: ").append(toIndentedString(loa)).append("\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
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

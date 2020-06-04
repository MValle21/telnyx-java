/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.MessagingHostedNumberOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RetrieveMessagingHostedNumberOrderResponse
 */


public class RetrieveMessagingHostedNumberOrderResponse {
  @SerializedName("data")
  private MessagingHostedNumberOrder data = null;

  public RetrieveMessagingHostedNumberOrderResponse data(MessagingHostedNumberOrder data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public MessagingHostedNumberOrder getData() {
    return data;
  }

  public void setData(MessagingHostedNumberOrder data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveMessagingHostedNumberOrderResponse retrieveMessagingHostedNumberOrderResponse = (RetrieveMessagingHostedNumberOrderResponse) o;
    return Objects.equals(this.data, retrieveMessagingHostedNumberOrderResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveMessagingHostedNumberOrderResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

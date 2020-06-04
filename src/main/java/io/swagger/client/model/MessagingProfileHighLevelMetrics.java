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
import io.swagger.client.model.MessagingProfileHighLevelMetricsInbound;
import io.swagger.client.model.MessagingProfileHighLevelMetricsOutbound;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;
/**
 * MessagingProfileHighLevelMetrics
 */


public class MessagingProfileHighLevelMetrics {
  /**
   * Identifies the type of the resource.
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    METRICS("messaging_profile_metrics");

    private String value;

    RecordTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RecordTypeEnum fromValue(String text) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RecordTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecordTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecordTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecordTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("record_type")
  private RecordTypeEnum recordType = null;

  @SerializedName("messaging_profile_id")
  private UUID messagingProfileId = null;

  @SerializedName("phone_numbers")
  private BigDecimal phoneNumbers = null;

  @SerializedName("outbound")
  private MessagingProfileHighLevelMetricsOutbound outbound = null;

  @SerializedName("inbound")
  private MessagingProfileHighLevelMetricsInbound inbound = null;

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @Schema(example = "messaging_profile_metrics", description = "Identifies the type of the resource.")
  public RecordTypeEnum getRecordType() {
    return recordType;
  }

   /**
   * Identifies the type of resource.
   * @return messagingProfileId
  **/
  @Schema(description = "Identifies the type of resource.")
  public UUID getMessagingProfileId() {
    return messagingProfileId;
  }

   /**
   * The number of phone numbers associated with the messaging profile.
   * @return phoneNumbers
  **/
  @Schema(description = "The number of phone numbers associated with the messaging profile.")
  public BigDecimal getPhoneNumbers() {
    return phoneNumbers;
  }

  public MessagingProfileHighLevelMetrics outbound(MessagingProfileHighLevelMetricsOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @Schema(description = "")
  public MessagingProfileHighLevelMetricsOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(MessagingProfileHighLevelMetricsOutbound outbound) {
    this.outbound = outbound;
  }

  public MessagingProfileHighLevelMetrics inbound(MessagingProfileHighLevelMetricsInbound inbound) {
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @Schema(description = "")
  public MessagingProfileHighLevelMetricsInbound getInbound() {
    return inbound;
  }

  public void setInbound(MessagingProfileHighLevelMetricsInbound inbound) {
    this.inbound = inbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingProfileHighLevelMetrics messagingProfileHighLevelMetrics = (MessagingProfileHighLevelMetrics) o;
    return Objects.equals(this.recordType, messagingProfileHighLevelMetrics.recordType) &&
        Objects.equals(this.messagingProfileId, messagingProfileHighLevelMetrics.messagingProfileId) &&
        Objects.equals(this.phoneNumbers, messagingProfileHighLevelMetrics.phoneNumbers) &&
        Objects.equals(this.outbound, messagingProfileHighLevelMetrics.outbound) &&
        Objects.equals(this.inbound, messagingProfileHighLevelMetrics.inbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, messagingProfileId, phoneNumbers, outbound, inbound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingProfileHighLevelMetrics {\n");
    
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
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

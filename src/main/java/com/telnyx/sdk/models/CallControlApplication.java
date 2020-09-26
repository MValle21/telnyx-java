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

package com.telnyx.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.telnyx.sdk.models.CallControlApplicationInbound;
import com.telnyx.sdk.models.CallControlApplicationOutbound;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CallControlApplication
 */


public class CallControlApplication {
  @SerializedName("active")
  private Boolean active = true;

  /**
   * &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#x27;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media. 
   */
  @JsonAdapter(AnchorsiteOverrideEnum.Adapter.class)
  public enum AnchorsiteOverrideEnum {
    LATENCY_("\"Latency\""),
    CHICAGO_IL_("\"Chicago, IL\""),
    ASHBURN_VA_("\"Ashburn, VA\""),
    SAN_JOSE_CA_("\"San Jose, CA\""),
    SYDNEY_AUSTRALIA_("\"Sydney, Australia\""),
    AMSTERDAM_NETHERLANDS_("\"Amsterdam, Netherlands\""),
    LONDON_UK_("\"London, UK\""),
    TORONTO_CANADA_("\"Toronto, Canada\""),
    VANCOUVER_CANADA_("\"Vancouver, Canada\""),
    FRANKFURT_GERMANY_("\"Frankfurt, Germany\"");

    private String value;

    AnchorsiteOverrideEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AnchorsiteOverrideEnum fromValue(String text) {
      for (AnchorsiteOverrideEnum b : AnchorsiteOverrideEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AnchorsiteOverrideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnchorsiteOverrideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnchorsiteOverrideEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AnchorsiteOverrideEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("anchorsite_override")
  private AnchorsiteOverrideEnum anchorsiteOverride = AnchorsiteOverrideEnum.LATENCY_;

  @SerializedName("application_name")
  private String applicationName = null;

  @SerializedName("created_at")
  private String createdAt = null;

  /**
   * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.
   */
  @JsonAdapter(DtmfTypeEnum.Adapter.class)
  public enum DtmfTypeEnum {
    RFC_2833("RFC 2833"),
    INBAND("Inband"),
    SIP_INFO("SIP INFO");

    private String value;

    DtmfTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DtmfTypeEnum fromValue(String text) {
      for (DtmfTypeEnum b : DtmfTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DtmfTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DtmfTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DtmfTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DtmfTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("dtmf_type")
  private DtmfTypeEnum dtmfType = DtmfTypeEnum.RFC_2833;

  @SerializedName("first_command_timeout")
  private Boolean firstCommandTimeout = false;

  @SerializedName("first_command_timeout_secs")
  private Integer firstCommandTimeoutSecs = 30;

  @SerializedName("id")
  private String id = null;

  @SerializedName("inbound")
  private CallControlApplicationInbound inbound = null;

  @SerializedName("outbound")
  private CallControlApplicationOutbound outbound = null;

  /**
   * Gets or Sets recordType
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    APPLICATION("call_control_application");

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
  private RecordTypeEnum recordType = RecordTypeEnum.APPLICATION;

  @SerializedName("updated_at")
  private String updatedAt = null;

  /**
   * Determines which webhook format will be used, Telnyx API v1 or v2.
   */
  @JsonAdapter(WebhookApiVersionEnum.Adapter.class)
  public enum WebhookApiVersionEnum {
    _1("1"),
    _2("2");

    private String value;

    WebhookApiVersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static WebhookApiVersionEnum fromValue(String text) {
      for (WebhookApiVersionEnum b : WebhookApiVersionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<WebhookApiVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WebhookApiVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WebhookApiVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WebhookApiVersionEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("webhook_api_version")
  private WebhookApiVersionEnum webhookApiVersion = WebhookApiVersionEnum._1;

  @SerializedName("webhook_event_failover_url")
  private String webhookEventFailoverUrl = "";

  @SerializedName("webhook_event_url")
  private String webhookEventUrl = null;

  @SerializedName("webhook_timeout_secs")
  private Integer webhookTimeoutSecs = null;

  public CallControlApplication active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Specifies whether the connection can be used.
   * @return active
  **/
  @Schema(description = "Specifies whether the connection can be used.")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CallControlApplication anchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
    return this;
  }

   /**
   * &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#x27;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media. 
   * @return anchorsiteOverride
  **/
  @Schema(example = "\"Amsterdam, Netherlands\"", description = "`Latency` directs Telnyx to route media through the site with the lowest round-trip time to the user's connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media. ")
  public AnchorsiteOverrideEnum getAnchorsiteOverride() {
    return anchorsiteOverride;
  }

  public void setAnchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
  }

  public CallControlApplication applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * A user-assigned name to help manage the application.
   * @return applicationName
  **/
  @Schema(example = "call-router", description = "A user-assigned name to help manage the application.")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public CallControlApplication createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the resource was created
   * @return createdAt
  **/
  @Schema(example = "2018-02-02T22:25:27.521Z", description = "ISO 8601 formatted date of when the resource was created")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CallControlApplication dtmfType(DtmfTypeEnum dtmfType) {
    this.dtmfType = dtmfType;
    return this;
  }

   /**
   * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.
   * @return dtmfType
  **/
  @Schema(example = "Inband", description = "Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.")
  public DtmfTypeEnum getDtmfType() {
    return dtmfType;
  }

  public void setDtmfType(DtmfTypeEnum dtmfType) {
    this.dtmfType = dtmfType;
  }

  public CallControlApplication firstCommandTimeout(Boolean firstCommandTimeout) {
    this.firstCommandTimeout = firstCommandTimeout;
    return this;
  }

   /**
   * Specifies whether calls to phone numbers associated with this connection should hangup after timing out.
   * @return firstCommandTimeout
  **/
  @Schema(example = "true", description = "Specifies whether calls to phone numbers associated with this connection should hangup after timing out.")
  public Boolean isFirstCommandTimeout() {
    return firstCommandTimeout;
  }

  public void setFirstCommandTimeout(Boolean firstCommandTimeout) {
    this.firstCommandTimeout = firstCommandTimeout;
  }

  public CallControlApplication firstCommandTimeoutSecs(Integer firstCommandTimeoutSecs) {
    this.firstCommandTimeoutSecs = firstCommandTimeoutSecs;
    return this;
  }

   /**
   * Specifies how many seconds to wait before timing out a dial command.
   * @return firstCommandTimeoutSecs
  **/
  @Schema(example = "10", description = "Specifies how many seconds to wait before timing out a dial command.")
  public Integer getFirstCommandTimeoutSecs() {
    return firstCommandTimeoutSecs;
  }

  public void setFirstCommandTimeoutSecs(Integer firstCommandTimeoutSecs) {
    this.firstCommandTimeoutSecs = firstCommandTimeoutSecs;
  }

  public CallControlApplication id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "1293384261075731499", description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CallControlApplication inbound(CallControlApplicationInbound inbound) {
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @Schema(description = "")
  public CallControlApplicationInbound getInbound() {
    return inbound;
  }

  public void setInbound(CallControlApplicationInbound inbound) {
    this.inbound = inbound;
  }

  public CallControlApplication outbound(CallControlApplicationOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @Schema(description = "")
  public CallControlApplicationOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(CallControlApplicationOutbound outbound) {
    this.outbound = outbound;
  }

  public CallControlApplication recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @Schema(description = "")
  public RecordTypeEnum getRecordType() {
    return recordType;
  }

  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }

  public CallControlApplication updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the resource was last updated
   * @return updatedAt
  **/
  @Schema(example = "2018-02-02T22:25:27.521Z", description = "ISO 8601 formatted date of when the resource was last updated")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CallControlApplication webhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
    return this;
  }

   /**
   * Determines which webhook format will be used, Telnyx API v1 or v2.
   * @return webhookApiVersion
  **/
  @Schema(example = "1", description = "Determines which webhook format will be used, Telnyx API v1 or v2.")
  public WebhookApiVersionEnum getWebhookApiVersion() {
    return webhookApiVersion;
  }

  public void setWebhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
  }

  public CallControlApplication webhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = webhookEventFailoverUrl;
    return this;
  }

   /**
   * The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#x60;https&#x60;.
   * @return webhookEventFailoverUrl
  **/
  @Schema(example = "https://failover.example.com", description = "The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as `https`.")
  public String getWebhookEventFailoverUrl() {
    return webhookEventFailoverUrl;
  }

  public void setWebhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = webhookEventFailoverUrl;
  }

  public CallControlApplication webhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
    return this;
  }

   /**
   * The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#x60;https&#x60;.
   * @return webhookEventUrl
  **/
  @Schema(example = "https://example.com", description = "The URL where webhooks related to this connection will be sent. Must include a scheme, such as `https`.")
  public String getWebhookEventUrl() {
    return webhookEventUrl;
  }

  public void setWebhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
  }

  public CallControlApplication webhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = webhookTimeoutSecs;
    return this;
  }

   /**
   * Get webhookTimeoutSecs
   * minimum: 0
   * maximum: 30
   * @return webhookTimeoutSecs
  **/
  @Schema(example = "25", description = "")
  public Integer getWebhookTimeoutSecs() {
    return webhookTimeoutSecs;
  }

  public void setWebhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = webhookTimeoutSecs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallControlApplication callControlApplication = (CallControlApplication) o;
    return Objects.equals(this.active, callControlApplication.active) &&
        Objects.equals(this.anchorsiteOverride, callControlApplication.anchorsiteOverride) &&
        Objects.equals(this.applicationName, callControlApplication.applicationName) &&
        Objects.equals(this.createdAt, callControlApplication.createdAt) &&
        Objects.equals(this.dtmfType, callControlApplication.dtmfType) &&
        Objects.equals(this.firstCommandTimeout, callControlApplication.firstCommandTimeout) &&
        Objects.equals(this.firstCommandTimeoutSecs, callControlApplication.firstCommandTimeoutSecs) &&
        Objects.equals(this.id, callControlApplication.id) &&
        Objects.equals(this.inbound, callControlApplication.inbound) &&
        Objects.equals(this.outbound, callControlApplication.outbound) &&
        Objects.equals(this.recordType, callControlApplication.recordType) &&
        Objects.equals(this.updatedAt, callControlApplication.updatedAt) &&
        Objects.equals(this.webhookApiVersion, callControlApplication.webhookApiVersion) &&
        Objects.equals(this.webhookEventFailoverUrl, callControlApplication.webhookEventFailoverUrl) &&
        Objects.equals(this.webhookEventUrl, callControlApplication.webhookEventUrl) &&
        Objects.equals(this.webhookTimeoutSecs, callControlApplication.webhookTimeoutSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, anchorsiteOverride, applicationName, createdAt, dtmfType, firstCommandTimeout, firstCommandTimeoutSecs, id, inbound, outbound, recordType, updatedAt, webhookApiVersion, webhookEventFailoverUrl, webhookEventUrl, webhookTimeoutSecs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallControlApplication {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dtmfType: ").append(toIndentedString(dtmfType)).append("\n");
    sb.append("    firstCommandTimeout: ").append(toIndentedString(firstCommandTimeout)).append("\n");
    sb.append("    firstCommandTimeoutSecs: ").append(toIndentedString(firstCommandTimeoutSecs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    webhookApiVersion: ").append(toIndentedString(webhookApiVersion)).append("\n");
    sb.append("    webhookEventFailoverUrl: ").append(toIndentedString(webhookEventFailoverUrl)).append("\n");
    sb.append("    webhookEventUrl: ").append(toIndentedString(webhookEventUrl)).append("\n");
    sb.append("    webhookTimeoutSecs: ").append(toIndentedString(webhookTimeoutSecs)).append("\n");
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

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
import io.swagger.client.model.ParticipantConference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Participant
 */


public class Participant {
  /**
   * Gets or Sets recordType
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    PARTICIPANT("participant");

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

  @SerializedName("id")
  private String id = null;

  @SerializedName("call_leg_id")
  private String callLegId = null;

  @SerializedName("call_control_id")
  private String callControlId = null;

  @SerializedName("conference")
  private ParticipantConference conference = null;

  @SerializedName("whisper_call_control_ids")
  private List<String> whisperCallControlIds = new ArrayList<>();

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("end_conference_on_exit")
  private Boolean endConferenceOnExit = null;

  @SerializedName("soft_end_conference_on_exit")
  private Boolean softEndConferenceOnExit = null;

  /**
   * The status of the participant with respect to the lifecycle within the conference
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    JOINING("joining"),
    JOINED("joined"),
    LEFT("left");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("muted")
  private Boolean muted = null;

  @SerializedName("on_hold")
  private Boolean onHold = null;

  public Participant recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @Schema(example = "participant", required = true, description = "")
  public RecordTypeEnum getRecordType() {
    return recordType;
  }

  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }

  public Participant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies the participant
   * @return id
  **/
  @Schema(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", required = true, description = "Uniquely identifies the participant")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Participant callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * Uniquely identifies the call leg associated with the participant
   * @return callLegId
  **/
  @Schema(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", required = true, description = "Uniquely identifies the call leg associated with the participant")
  public String getCallLegId() {
    return callLegId;
  }

  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }

  public Participant callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Call Control ID associated with the partiipant of the conference
   * @return callControlId
  **/
  @Schema(example = "v2:AgDIxmoRX6QMuaIj_uXRXnPAXP0QlNfXczRrZvZakpWxBlpw48KyZQ", required = true, description = "Call Control ID associated with the partiipant of the conference")
  public String getCallControlId() {
    return callControlId;
  }

  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }

  public Participant conference(ParticipantConference conference) {
    this.conference = conference;
    return this;
  }

   /**
   * Get conference
   * @return conference
  **/
  @Schema(required = true, description = "")
  public ParticipantConference getConference() {
    return conference;
  }

  public void setConference(ParticipantConference conference) {
    this.conference = conference;
  }

  public Participant whisperCallControlIds(List<String> whisperCallControlIds) {
    this.whisperCallControlIds = whisperCallControlIds;
    return this;
  }

  public Participant addWhisperCallControlIdsItem(String whisperCallControlIdsItem) {
    this.whisperCallControlIds.add(whisperCallControlIdsItem);
    return this;
  }

   /**
   * Array of unique call_control_ids the participant can whisper to..
   * @return whisperCallControlIds
  **/
  @Schema(example = "[\"v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ\",\"v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw\"]", required = true, description = "Array of unique call_control_ids the participant can whisper to..")
  public List<String> getWhisperCallControlIds() {
    return whisperCallControlIds;
  }

  public void setWhisperCallControlIds(List<String> whisperCallControlIds) {
    this.whisperCallControlIds = whisperCallControlIds;
  }

  public Participant createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the participant was created
   * @return createdAt
  **/
  @Schema(example = "2019-01-23T18:10:02.574Z", required = true, description = "ISO 8601 formatted date of when the participant was created")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Participant updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the participant was last updated
   * @return updatedAt
  **/
  @Schema(example = "2019-01-23T18:10:02.574Z", required = true, description = "ISO 8601 formatted date of when the participant was last updated")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Participant endConferenceOnExit(Boolean endConferenceOnExit) {
    this.endConferenceOnExit = endConferenceOnExit;
    return this;
  }

   /**
   * Whether the conference will end and all remaining participants be hung up after the participant leaves the conference.
   * @return endConferenceOnExit
  **/
  @Schema(example = "true", required = true, description = "Whether the conference will end and all remaining participants be hung up after the participant leaves the conference.")
  public Boolean isEndConferenceOnExit() {
    return endConferenceOnExit;
  }

  public void setEndConferenceOnExit(Boolean endConferenceOnExit) {
    this.endConferenceOnExit = endConferenceOnExit;
  }

  public Participant softEndConferenceOnExit(Boolean softEndConferenceOnExit) {
    this.softEndConferenceOnExit = softEndConferenceOnExit;
    return this;
  }

   /**
   * Whether the conference will end after the participant leaves the conference.
   * @return softEndConferenceOnExit
  **/
  @Schema(example = "true", required = true, description = "Whether the conference will end after the participant leaves the conference.")
  public Boolean isSoftEndConferenceOnExit() {
    return softEndConferenceOnExit;
  }

  public void setSoftEndConferenceOnExit(Boolean softEndConferenceOnExit) {
    this.softEndConferenceOnExit = softEndConferenceOnExit;
  }

  public Participant status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the participant with respect to the lifecycle within the conference
   * @return status
  **/
  @Schema(example = "joining", required = true, description = "The status of the participant with respect to the lifecycle within the conference")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Participant muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

   /**
   * Whether the participant is muted.
   * @return muted
  **/
  @Schema(example = "true", required = true, description = "Whether the participant is muted.")
  public Boolean isMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  public Participant onHold(Boolean onHold) {
    this.onHold = onHold;
    return this;
  }

   /**
   * Whether the participant is put on_hold.
   * @return onHold
  **/
  @Schema(example = "true", required = true, description = "Whether the participant is put on_hold.")
  public Boolean isOnHold() {
    return onHold;
  }

  public void setOnHold(Boolean onHold) {
    this.onHold = onHold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participant participant = (Participant) o;
    return Objects.equals(this.recordType, participant.recordType) &&
        Objects.equals(this.id, participant.id) &&
        Objects.equals(this.callLegId, participant.callLegId) &&
        Objects.equals(this.callControlId, participant.callControlId) &&
        Objects.equals(this.conference, participant.conference) &&
        Objects.equals(this.whisperCallControlIds, participant.whisperCallControlIds) &&
        Objects.equals(this.createdAt, participant.createdAt) &&
        Objects.equals(this.updatedAt, participant.updatedAt) &&
        Objects.equals(this.endConferenceOnExit, participant.endConferenceOnExit) &&
        Objects.equals(this.softEndConferenceOnExit, participant.softEndConferenceOnExit) &&
        Objects.equals(this.status, participant.status) &&
        Objects.equals(this.muted, participant.muted) &&
        Objects.equals(this.onHold, participant.onHold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, id, callLegId, callControlId, conference, whisperCallControlIds, createdAt, updatedAt, endConferenceOnExit, softEndConferenceOnExit, status, muted, onHold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    whisperCallControlIds: ").append(toIndentedString(whisperCallControlIds)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    endConferenceOnExit: ").append(toIndentedString(endConferenceOnExit)).append("\n");
    sb.append("    softEndConferenceOnExit: ").append(toIndentedString(softEndConferenceOnExit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    onHold: ").append(toIndentedString(onHold)).append("\n");
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
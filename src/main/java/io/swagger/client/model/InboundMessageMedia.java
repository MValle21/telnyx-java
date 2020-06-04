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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InboundMessageMedia
 */


public class InboundMessageMedia {
  @SerializedName("url")
  private String url = null;

  @SerializedName("content_type")
  private String contentType = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("hash_sha256")
  private String hashSha256 = null;

  public InboundMessageMedia url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url of the media requested to be sent.
   * @return url
  **/
  @Schema(description = "The url of the media requested to be sent.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public InboundMessageMedia contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * The MIME type of the requested media.
   * @return contentType
  **/
  @Schema(description = "The MIME type of the requested media.")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public InboundMessageMedia size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the requested media.
   * @return size
  **/
  @Schema(description = "The size of the requested media.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public InboundMessageMedia hashSha256(String hashSha256) {
    this.hashSha256 = hashSha256;
    return this;
  }

   /**
   * The SHA256 hash of the requested media.
   * @return hashSha256
  **/
  @Schema(description = "The SHA256 hash of the requested media.")
  public String getHashSha256() {
    return hashSha256;
  }

  public void setHashSha256(String hashSha256) {
    this.hashSha256 = hashSha256;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundMessageMedia inboundMessageMedia = (InboundMessageMedia) o;
    return Objects.equals(this.url, inboundMessageMedia.url) &&
        Objects.equals(this.contentType, inboundMessageMedia.contentType) &&
        Objects.equals(this.size, inboundMessageMedia.size) &&
        Objects.equals(this.hashSha256, inboundMessageMedia.hashSha256);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, contentType, size, hashSha256);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundMessageMedia {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    hashSha256: ").append(toIndentedString(hashSha256)).append("\n");
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

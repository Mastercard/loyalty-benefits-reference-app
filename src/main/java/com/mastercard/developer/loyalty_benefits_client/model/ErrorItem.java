/*
 * Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 * Loyalty Benefits API
 * The Loyalty Benefits API provides benefits management including presentment and selection.  It also supports insurance certificate generation for insurance benefits that need certificates.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.loyalty_benefits_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ErrorItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-30T13:58:23.312-06:00[America/Chicago]")
public class ErrorItem {
  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REASON_CODE = "ReasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_RECOVERABLE = "Recoverable";
  @SerializedName(SERIALIZED_NAME_RECOVERABLE)
  private Boolean recoverable;

  public static final String SERIALIZED_NAME_DETAILS = "Details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public ErrorItem source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "Error source", value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ErrorItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Generic error description", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorItem reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(example = "REASON_CODE", value = "")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public ErrorItem recoverable(Boolean recoverable) {
    this.recoverable = recoverable;
    return this;
  }

   /**
   * Get recoverable
   * @return recoverable
  **/
  @ApiModelProperty(value = "")
  public Boolean getRecoverable() {
    return recoverable;
  }

  public void setRecoverable(Boolean recoverable) {
    this.recoverable = recoverable;
  }

  public ErrorItem details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(example = "Detailed error description", value = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorItem errorItem = (ErrorItem) o;
    return Objects.equals(this.source, errorItem.source) &&
        Objects.equals(this.description, errorItem.description) &&
        Objects.equals(this.reasonCode, errorItem.reasonCode) &&
        Objects.equals(this.recoverable, errorItem.recoverable) &&
        Objects.equals(this.details, errorItem.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, description, reasonCode, recoverable, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorItem {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    recoverable: ").append(toIndentedString(recoverable)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

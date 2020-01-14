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
 * BilheteRequestAdditionalInformationDependents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-30T13:58:23.312-06:00[America/Chicago]")
public class BilheteRequestAdditionalInformationDependents {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_CPF = "cpf";
  @SerializedName(SERIALIZED_NAME_CPF)
  private String cpf;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public BilheteRequestAdditionalInformationDependents firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  public BilheteRequestAdditionalInformationDependents(String firstName, String lastName, String cpf, String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.dateOfBirth = dateOfBirth;
	}

   /**
   * First name
   * @return firstName
  **/
  @ApiModelProperty(example = "John", value = "First name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public BilheteRequestAdditionalInformationDependents lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name
   * @return lastName
  **/
  @ApiModelProperty(example = "Smith", value = "Last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BilheteRequestAdditionalInformationDependents cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * Brazilian CPF (Individual Taxpayer Registry Identification)
   * @return cpf
  **/
  @ApiModelProperty(example = "999.999.999-99", value = "Brazilian CPF (Individual Taxpayer Registry Identification)")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public BilheteRequestAdditionalInformationDependents dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Date of birth
   * @return dateOfBirth
  **/
  @ApiModelProperty(example = "1950-01-31", value = "Date of birth")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BilheteRequestAdditionalInformationDependents bilheteRequestAdditionalInformationDependents = (BilheteRequestAdditionalInformationDependents) o;
    return Objects.equals(this.firstName, bilheteRequestAdditionalInformationDependents.firstName) &&
        Objects.equals(this.lastName, bilheteRequestAdditionalInformationDependents.lastName) &&
        Objects.equals(this.cpf, bilheteRequestAdditionalInformationDependents.cpf) &&
        Objects.equals(this.dateOfBirth, bilheteRequestAdditionalInformationDependents.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, cpf, dateOfBirth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BilheteRequestAdditionalInformationDependents {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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


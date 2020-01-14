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
import com.mastercard.developer.loyalty_benefits_client.model.BenefitCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Benefits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-30T13:58:23.312-06:00[America/Chicago]")
public class Benefits {
  public static final String SERIALIZED_NAME_BASE_BENEFITS = "baseBenefits";
  @SerializedName(SERIALIZED_NAME_BASE_BENEFITS)
  private List<BenefitCategory> baseBenefits = null;

  public static final String SERIALIZED_NAME_SELECTABLE_BENEFITS = "selectableBenefits";
  @SerializedName(SERIALIZED_NAME_SELECTABLE_BENEFITS)
  private List<BenefitCategory> selectableBenefits = null;

  public Benefits baseBenefits(List<BenefitCategory> baseBenefits) {
    this.baseBenefits = baseBenefits;
    return this;
  }

  public Benefits addBaseBenefitsItem(BenefitCategory baseBenefitsItem) {
    if (this.baseBenefits == null) {
      this.baseBenefits = new ArrayList<BenefitCategory>();
    }
    this.baseBenefits.add(baseBenefitsItem);
    return this;
  }

   /**
   * Array of base benefits. These are the benefits that are provided to cardholders at no extra cost and are assigned automatically upon registration
   * @return baseBenefits
  **/
  @ApiModelProperty(value = "Array of base benefits. These are the benefits that are provided to cardholders at no extra cost and are assigned automatically upon registration")
  public List<BenefitCategory> getBaseBenefits() {
    return baseBenefits;
  }

  public void setBaseBenefits(List<BenefitCategory> baseBenefits) {
    this.baseBenefits = baseBenefits;
  }

  public Benefits selectableBenefits(List<BenefitCategory> selectableBenefits) {
    this.selectableBenefits = selectableBenefits;
    return this;
  }

  public Benefits addSelectableBenefitsItem(BenefitCategory selectableBenefitsItem) {
    if (this.selectableBenefits == null) {
      this.selectableBenefits = new ArrayList<BenefitCategory>();
    }
    this.selectableBenefits.add(selectableBenefitsItem);
    return this;
  }

   /**
   * Array of selectable benefits. These are the available optional benefits and will be assigned only when the cardholder chooses them explicitly
   * @return selectableBenefits
  **/
  @ApiModelProperty(value = "Array of selectable benefits. These are the available optional benefits and will be assigned only when the cardholder chooses them explicitly")
  public List<BenefitCategory> getSelectableBenefits() {
    return selectableBenefits;
  }

  public void setSelectableBenefits(List<BenefitCategory> selectableBenefits) {
    this.selectableBenefits = selectableBenefits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Benefits benefits = (Benefits) o;
    return Objects.equals(this.baseBenefits, benefits.baseBenefits) &&
        Objects.equals(this.selectableBenefits, benefits.selectableBenefits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseBenefits, selectableBenefits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Benefits {\n");
    
    sb.append("    baseBenefits: ").append(toIndentedString(baseBenefits)).append("\n");
    sb.append("    selectableBenefits: ").append(toIndentedString(selectableBenefits)).append("\n");
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


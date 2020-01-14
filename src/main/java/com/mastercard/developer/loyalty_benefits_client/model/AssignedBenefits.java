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
import com.mastercard.developer.loyalty_benefits_client.model.AssignedBenefitCategory;
import com.mastercard.developer.loyalty_benefits_client.model.AssignedBenefitsBenefitSelectionWindow;
import com.mastercard.developer.loyalty_benefits_client.model.BenefitCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AssignedBenefits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-30T13:58:23.312-06:00[America/Chicago]")
public class AssignedBenefits {
  public static final String SERIALIZED_NAME_BASE_BENEFITS = "baseBenefits";
  @SerializedName(SERIALIZED_NAME_BASE_BENEFITS)
  private List<BenefitCategory> baseBenefits = null;

  public static final String SERIALIZED_NAME_SELECTED_BENEFITS = "selectedBenefits";
  @SerializedName(SERIALIZED_NAME_SELECTED_BENEFITS)
  private List<AssignedBenefitCategory> selectedBenefits = null;

  public static final String SERIALIZED_NAME_FUTURE_BENEFITS = "futureBenefits";
  @SerializedName(SERIALIZED_NAME_FUTURE_BENEFITS)
  private List<AssignedBenefitCategory> futureBenefits = null;

  public static final String SERIALIZED_NAME_BENEFIT_SELECTION_WINDOW = "benefitSelectionWindow";
  @SerializedName(SERIALIZED_NAME_BENEFIT_SELECTION_WINDOW)
  private AssignedBenefitsBenefitSelectionWindow benefitSelectionWindow = null;

  public AssignedBenefits baseBenefits(List<BenefitCategory> baseBenefits) {
    this.baseBenefits = baseBenefits;
    return this;
  }

  public AssignedBenefits addBaseBenefitsItem(BenefitCategory baseBenefitsItem) {
    if (this.baseBenefits == null) {
      this.baseBenefits = new ArrayList<BenefitCategory>();
    }
    this.baseBenefits.add(baseBenefitsItem);
    return this;
  }

   /**
   * Array of base, assigned benefits. These are the benefits that are provided to cardholders at no extra cost and are assigned automatically upon registration
   * @return baseBenefits
  **/
  @ApiModelProperty(value = "Array of base, assigned benefits. These are the benefits that are provided to cardholders at no extra cost and are assigned automatically upon registration")
  public List<BenefitCategory> getBaseBenefits() {
    return baseBenefits;
  }

  public void setBaseBenefits(List<BenefitCategory> baseBenefits) {
    this.baseBenefits = baseBenefits;
  }

  public AssignedBenefits selectedBenefits(List<AssignedBenefitCategory> selectedBenefits) {
    this.selectedBenefits = selectedBenefits;
    return this;
  }

  public AssignedBenefits addSelectedBenefitsItem(AssignedBenefitCategory selectedBenefitsItem) {
    if (this.selectedBenefits == null) {
      this.selectedBenefits = new ArrayList<AssignedBenefitCategory>();
    }
    this.selectedBenefits.add(selectedBenefitsItem);
    return this;
  }

   /**
   * Array of selected, assigned benefits. These are cardholder chosen benefits after registration
   * @return selectedBenefits
  **/
  @ApiModelProperty(value = "Array of selected, assigned benefits. These are cardholder chosen benefits after registration")
  public List<AssignedBenefitCategory> getSelectedBenefits() {
    return selectedBenefits;
  }

  public void setSelectedBenefits(List<AssignedBenefitCategory> selectedBenefits) {
    this.selectedBenefits = selectedBenefits;
  }

  public AssignedBenefits futureBenefits(List<AssignedBenefitCategory> futureBenefits) {
    this.futureBenefits = futureBenefits;
    return this;
  }

  public AssignedBenefits addFutureBenefitsItem(AssignedBenefitCategory futureBenefitsItem) {
    if (this.futureBenefits == null) {
      this.futureBenefits = new ArrayList<AssignedBenefitCategory>();
    }
    this.futureBenefits.add(futureBenefitsItem);
    return this;
  }

   /**
   * Array of upcoming selected benefits. These are the benefits that will be applicable in near future. For example, when they chose benefits during selection window - to be in effective for next year, this list holds those benefits
   * @return futureBenefits
  **/
  @ApiModelProperty(value = "Array of upcoming selected benefits. These are the benefits that will be applicable in near future. For example, when they chose benefits during selection window - to be in effective for next year, this list holds those benefits")
  public List<AssignedBenefitCategory> getFutureBenefits() {
    return futureBenefits;
  }

  public void setFutureBenefits(List<AssignedBenefitCategory> futureBenefits) {
    this.futureBenefits = futureBenefits;
  }

  public AssignedBenefits benefitSelectionWindow(AssignedBenefitsBenefitSelectionWindow benefitSelectionWindow) {
    this.benefitSelectionWindow = benefitSelectionWindow;
    return this;
  }

   /**
   * Get benefitSelectionWindow
   * @return benefitSelectionWindow
  **/
  @ApiModelProperty(value = "")
  public AssignedBenefitsBenefitSelectionWindow getBenefitSelectionWindow() {
    return benefitSelectionWindow;
  }

  public void setBenefitSelectionWindow(AssignedBenefitsBenefitSelectionWindow benefitSelectionWindow) {
    this.benefitSelectionWindow = benefitSelectionWindow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignedBenefits assignedBenefits = (AssignedBenefits) o;
    return Objects.equals(this.baseBenefits, assignedBenefits.baseBenefits) &&
        Objects.equals(this.selectedBenefits, assignedBenefits.selectedBenefits) &&
        Objects.equals(this.futureBenefits, assignedBenefits.futureBenefits) &&
        Objects.equals(this.benefitSelectionWindow, assignedBenefits.benefitSelectionWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseBenefits, selectedBenefits, futureBenefits, benefitSelectionWindow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignedBenefits {\n");
    
    sb.append("    baseBenefits: ").append(toIndentedString(baseBenefits)).append("\n");
    sb.append("    selectedBenefits: ").append(toIndentedString(selectedBenefits)).append("\n");
    sb.append("    futureBenefits: ").append(toIndentedString(futureBenefits)).append("\n");
    sb.append("    benefitSelectionWindow: ").append(toIndentedString(benefitSelectionWindow)).append("\n");
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

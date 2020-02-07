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

 * 
 * 
 Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 * 
 */
package com.mastercard.developer.loyalty_benefits_client.model;

public class AccountExternal {
	
	private String accountType;
	
	private String ica;
	
	private String cardProductType;
	
	private String externalMembershipReferenceId;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getIca() {
		return ica;
	}

	public void setIca(String ica) {
		this.ica = ica;
	}

	public String getCardProductType() {
		return cardProductType;
	}

	public void setCardProductType(String cardProductType) {
		this.cardProductType = cardProductType;
	}

	public String getExternalMembershipReferenceId() {
		return externalMembershipReferenceId;
	}

	public void setExternalMembershipReferenceId(String externalMembershipReferenceId) {
		this.externalMembershipReferenceId = externalMembershipReferenceId;
	}

}

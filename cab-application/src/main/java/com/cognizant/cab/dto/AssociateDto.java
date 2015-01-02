
package com.cognizant.cab.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("Associate")
public class AssociateDto {

	@JsonProperty("AssociateId")
	private String associateId;

	@JsonProperty("AssociateName")
	private String associateName;

	@JsonProperty("AssociateEmail")
	private String associateEmail;

	@JsonIgnore
	public String getAssociateId() {
		return associateId;
	}

	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}

	@JsonIgnore
	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	@JsonIgnore
	public String getAssociateEmail() {
		return associateEmail;
	}

	public void setAssociateEmail(String associateEmail) {
		this.associateEmail = associateEmail;
	}

}

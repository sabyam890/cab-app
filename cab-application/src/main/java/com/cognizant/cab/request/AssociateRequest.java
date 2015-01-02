package com.cognizant.cab.request;

import com.cognizant.cab.dto.AssociateDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("AssociateRequest")
public class AssociateRequest {

	@JsonProperty("Associate")
	private AssociateDto associateDto;

	@JsonProperty("IsEditable")
	private Boolean isEditable;

	@JsonProperty("IsRemovable")
	private Boolean isRemovable;

	@JsonIgnore
	public AssociateDto getAssociateDto() {
		return associateDto;
	}

	public void setAssociateDto(AssociateDto associateDto) {
		this.associateDto = associateDto;
	}

	@JsonIgnore
	public Boolean isEditable() {
		return isEditable;
	}

	public void setIsEditable(Boolean isEditable) {
		this.isEditable = isEditable;
	}

	@JsonIgnore
	public Boolean isRemovable() {
		return isRemovable;
	}

	public void setIsRemovable(Boolean isRemovable) {
		this.isRemovable = isRemovable;
	}

}

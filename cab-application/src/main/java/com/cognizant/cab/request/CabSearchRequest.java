package com.cognizant.cab.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("CabSearchRequest")
public class CabSearchRequest {

	@JsonProperty("SearchDate")
	private String srchDate;
	
	@JsonProperty("SearchTime")
	private String srchTime;

	@JsonIgnore
	public String getSrchDate() {
		return srchDate;
	}

	public void setSrchDate(String srchDate) {
		this.srchDate = srchDate;
	}

	@JsonIgnore
	public String getSrchTime() {
		return srchTime;
	}

	public void setSrchTime(String srchTime) {
		this.srchTime = srchTime;
	}

	

}

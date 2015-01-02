package com.cognizant.cab.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("Cab")
public class CabDto {
	
	@JsonProperty("CabNumber")
	private String cabNumber;
	
	@JsonProperty("CabName")
	private String cabName;

	@JsonProperty("CabDriverName")
	private String cabDriverName;
	
	@JsonProperty("CabDriverPhone")
	private String cabDriverPhone;
	
	@JsonProperty("CabCapacity")
	private String cabCapacity;
	
	@JsonProperty("CabDirection")
	private String cabDirection;
	
	@JsonProperty("CabTime")
	private String cabTime;

	@JsonIgnore
	public String getCabNumber() {
		return cabNumber;
	}

	public void setCabNumber(String cabNumber) {
		this.cabNumber = cabNumber;
	}

	@JsonIgnore
	public String getCabName() {
		return cabName;
	}

	public void setCabName(String cabName) {
		this.cabName = cabName;
	}

	@JsonIgnore
	public String getCabDriverName() {
		return cabDriverName;
	}

	public void setCabDriverName(String cabDriverName) {
		this.cabDriverName = cabDriverName;
	}

	@JsonIgnore
	public String getCabDriverPhone() {
		return cabDriverPhone;
	}

	public void setCabDriverPhone(String cabDriverPhone) {
		this.cabDriverPhone = cabDriverPhone;
	}

	@JsonIgnore
	public String getCabCapacity() {
		return cabCapacity;
	}

	public void setCabCapacity(String cabCapacity) {
		this.cabCapacity = cabCapacity;
	}

	@JsonIgnore
	public String getCabDirection() {
		return cabDirection;
	}

	public void setCabDirection(String cabDirection) {
		this.cabDirection = cabDirection;
	}

	@JsonIgnore
	public String getCabTime() {
		return cabTime;
	}

	public void setCabTime(String cabTime) {
		this.cabTime = cabTime;
	}

}

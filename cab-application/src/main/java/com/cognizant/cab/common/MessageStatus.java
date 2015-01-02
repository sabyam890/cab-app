package com.cognizant.cab.common;

public enum MessageStatus {

	Success("SUCCESS"), Failur("FAILUR");

	private String status;

	MessageStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}

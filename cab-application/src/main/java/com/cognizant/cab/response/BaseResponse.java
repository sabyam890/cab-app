package com.cognizant.cab.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("BaseResponse")
public class BaseResponse {

	@JsonProperty("MessageStatus")
	private String messageStatus;
	
	@JsonProperty("Message")
	private String message;

	@JsonIgnore
	public final String getMessageStatus() {
		return messageStatus;
	}

	public final void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	@JsonIgnore
	public final String getMessage() {
		return message;
	}

	public final void setMessage(String message) {
		this.message = message;
	}
	
	
}

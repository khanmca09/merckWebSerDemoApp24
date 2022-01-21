package com.example.MerckRestSample.exception;

import java.util.Date;

public class ErrorDetails {
	
	private Date timstamp;
	private String message;
	private String details;
	
	public ErrorDetails(Date date, String message, String details){
		this.timstamp = date;
		this.message  = message;
		this.details  = details;
	} 

	public Date getTimstamp() {
		return timstamp;
	}

	public void setTimstamp(Date timstamp) {
		this.timstamp = timstamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}

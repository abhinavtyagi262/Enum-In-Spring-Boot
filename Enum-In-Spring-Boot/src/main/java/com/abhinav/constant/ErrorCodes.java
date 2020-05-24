package com.abhinav.constant;

public class ErrorCodes {
	public static final ErrorCodes SUCCESS = new ErrorCodes("1", "Success");
	public static final ErrorCodes FAIL = new ErrorCodes("0", "Fail");
	
	private String code;
	private String description;
	
	private ErrorCodes(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
}

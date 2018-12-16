package com.xh.pojo;

public class Result {

	private boolean success;

	private String message;
	
	public Result() {
		super();
	}

	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Result [success=" + success + ", message=" + message + "]";
	}

}

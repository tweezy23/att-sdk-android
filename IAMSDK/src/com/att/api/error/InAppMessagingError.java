package com.att.api.error;

public class InAppMessagingError {
	
	private String errorMessage = null;
	private int httpResponseCode = 0;
	private String httpResponse = null;
	
	public InAppMessagingError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InAppMessagingError(String errorMessage, int httpResponseCode, String httpResponse) {

		this.errorMessage = errorMessage;
		this.httpResponseCode = httpResponseCode;
		this.httpResponse = httpResponse;
		
	}
	public InAppMessagingError(String errorMessage) {
		
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	/*public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}*/

	public int getHttpResponseCode() {
		return httpResponseCode;
	}

	/*public void setHttpResponseCode(int httpResponseCode) {
		this.httpResponseCode = httpResponseCode;
	}*/

	public String getHttpResponse() {
		return httpResponse;
	}

	/*public void setHttpResponse(String httpResponse) {
		this.httpResponse = httpResponse;
	}	*/
	
}

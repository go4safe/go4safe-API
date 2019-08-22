package com.go4safe.constants;

import org.springframework.http.HttpStatus;

public enum HttpResponseCode {	
	RESPONSE_SUCCESS(HttpStatus.OK),
	RESPONSE_CREATED(HttpStatus.CREATED),
	RESPONSE_NOCONTENT(HttpStatus.NO_CONTENT),
	RESPONSE_ERROR_INVALID_REQUEST(HttpStatus.BAD_REQUEST),
	RESPONSE_ERROR_INVALID_TOKEN(HttpStatus.UNAUTHORIZED),
	RESPONSE_ERROR_PERMISSION(HttpStatus.FORBIDDEN),
	RESPONSE_ERROR_NOT_FOUND(HttpStatus.NOT_FOUND),
	RESPONSE_ERROR_CONFLICT(HttpStatus.CONFLICT),
	RESPONSE_ERROR_PRECONDITION_FAILED(HttpStatus.PRECONDITION_FAILED),
	RESPONSE_ERROR_TOO_MANY_REQUESTS(HttpStatus.TOO_MANY_REQUESTS),
	RESPONSE_ERROR_FAILED(HttpStatus.INTERNAL_SERVER_ERROR),
	RESPONSE_ERROR_SERVICE_UNAVAILABLE(HttpStatus.SERVICE_UNAVAILABLE),
	RESPONSE_ERROR_UNSUPPORTED_MEDIA_TYPE(HttpStatus.UNSUPPORTED_MEDIA_TYPE),
	RESPONSE_ERROR_METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED);
	
	private HttpStatus httpStatus;
	
	HttpResponseCode(HttpStatus httpStatus) {	
		this.httpStatus = httpStatus;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}

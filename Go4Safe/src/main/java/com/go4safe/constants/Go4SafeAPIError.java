package com.go4safe.constants;

public enum Go4SafeAPIError {
	UPLOAD_FILE_FAILED("Upload File Failed..!"),
	FILE_ALREADY_EXIST("File is already present"),
	USER_LOST_CONNECTION( "USER_LOST_CONNECTION"),
	GET_ALL_DOC_FAILED( "Get all doc failed!"), 
	METADATA_OF_DOC_FAILED( "Retrieving properties failed"),
	UPDATE_METADATA_FAILED( "Update metadata failed!"),
	RECEIVED_EMPTY_FILE( "Recieved Empty File!.."),
	DOWNLOAD_FILE_FAILED( "file copy from upload folder Download folder is failed"),
	INVALID_USER_ID( "Invalid User Id!.."),
	INVALID_FILE_NAME( "Invalid File Name !.."),
	REMOVE_DOC_TAG_FAILED("Remove Document Tag failed!.."),
	NO_DOCUMENT_FOUND( "NO_DOCUMENT_FOUND"),
	INVALID_DOCUMENT_ID("INVALID_DOCUMENT_ID"),
	DELETE_SESSION_DOC_FAILED("DELETE_SESSION_DOC_FAILED"),
	INVALID_ZIP_FILE_NAME("INVALID_ZIP_FILE_NAME"),
	CONVERT_DOCS_TO_ZIP_FAILED("CONVERT_DOCS_TO_ZIP_FAILED"),
	ADD_SESSION_DOC_FAILED("ADD_SESSION_DOC_FAILED"),
	DELETE_SESSION_WORKSPACE_FAILED("DELETE_SESSION_WORKSPACE_FAILED"),
	COPY_DOC_FAILED("Copy Document Failed !.."),
	GET_ALL_DOC_FROM_SESSION_WORKSPACE_FAILED("Get all doc from Session Worksapce Failed."),
	MOVE_DOC_FAILED("Move Document Failed !.."),
	COPY_DOC_BROADCAST_FAILED("Copy doc BroadCast Failed."),
	MOVE_DOC_BROADCAST_FAILED("Move doc BroadCast Failed."),
	DOWNLOAD_DOC_FAILED("Document downloading failed..."),
	
	FILE_NOT_EXIST("Could not locate file!"), INVALID_USERNAME("Invalid UserName");

	private String message;

	Go4SafeAPIError(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String msg) {
		message = msg;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	


}

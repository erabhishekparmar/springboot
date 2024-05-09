package com.mbr.exception;

public class ResourceNotFoundException extends Exception {

	public ResourceNotFoundException() {
		super("Resource Not Found!");
	}

	
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
}

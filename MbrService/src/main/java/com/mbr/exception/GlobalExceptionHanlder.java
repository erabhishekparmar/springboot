package com.mbr.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mbr.payload.ApiResponse;

@lombok.Builder
@RestControllerAdvice
public class GlobalExceptionHanlder {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFound(ResourceNotFoundException ex ) {
		
		String message = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(message);
		apiResponse.setSuccess(true);
		apiResponse.setStatus(HttpStatus.NOT_FOUND);
		
		//ApiResponse apiResponse2 = ApiResponse.builer();
		
		return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
		
	}
	
}

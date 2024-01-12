package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Controller {
	
	@ExceptionHandler(value= EmployeeNotFound.class)
	public ResponseEntity<Object> exceptionI(EmployeeNotFound ex){
		return new ResponseEntity<Object>("Employee Not Found",HttpStatus.NOT_FOUND);
		
	}

}

/**
 * 
 */
package com.example.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author shjha
 *
 */
@ControllerAdvice
public class StudentExceptionController {

	@ExceptionHandler(value = StudentNotFoundException.class)
	public ResponseEntity<Object> exception(StudentNotFoundException ex) {
		return new ResponseEntity<Object>("Student not found.", HttpStatus.NOT_FOUND);
	}
}

package com.dxctraining.computer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralisedExceptionHandler {

	 @ExceptionHandler(ComputerNotFoundException.class)
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    public String handleEmployeeNotFound(ComputerNotFoundException e){
	        System.out.println("inside handle phone not found exception");
	        String msg=e.getMessage();
	        return msg;
	    }

	    @ExceptionHandler(InvalidArgumentException.class)
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    public String handleInvalidArgument(InvalidArgumentException e){
	        System.out.println("inside handle invalid argument exception");
	        return e.getMessage();
	    }
	   
}
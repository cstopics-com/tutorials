package com.expava.gpp.contentmanagement.controller;

import java.util.Optional;

import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.expava.gpp.contentmanagement.model.UserNotFoundException;

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error+json")
public class UserControllerAdvice {
	
    private ResponseEntity < VndErrors > error(final Exception exception, final HttpStatus httpStatus, final String logRef) {
        final String message = Optional.of(exception.getMessage()).orElse(exception.getClass().getSimpleName());
        return new ResponseEntity < > (new VndErrors(logRef, message), httpStatus);
    }
    
    @ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity < VndErrors > notFoundException(final UserNotFoundException e) {
		return error(e, HttpStatus.NOT_FOUND, e.getMessage());
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity < VndErrors > assertionException(final IllegalArgumentException e) {
        return error(e, HttpStatus.NOT_FOUND, e.getLocalizedMessage());
    }
}

package com.restapi.restapi.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="Dog By Breed ID Not Found")
public class DogNotFoundException extends RuntimeException{
/**
	 * 
	 */
	private static final long serialVersionUID = 2876696347471929799L;
public DogNotFoundException() {}
public DogNotFoundException(String message) {
	super(message);
}
}

package com.practice.csa.Exception;

public class CarNotFoundById extends RuntimeException {
private String message;

public CarNotFoundById(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}
}

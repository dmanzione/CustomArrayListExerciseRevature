package com.revature.exceptions;

public class InvalidElementException extends Exception {

	public InvalidElementException() {
		super("Element is not the right type, cannot be added to ArrayList!");
	}
}

package com.question4; //declarig the package

public class CustomException extends NullPointerException { // declaring the class

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// creating a custom exception
	public CustomException() {
		System.out.println("Name or ID cannot be Null ");
	}
}
// end of the class
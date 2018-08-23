package com.exceptions;

import java.io.PrintStream;

public class MyException extends Exception {
	
	private String meString;
	
	public MyException() {
		
	}

	public MyException(String meString) {
		super(meString);
		this.meString = meString;
	}

	public void showClause() {
		System.out.println("You got an exception");
	}
	
}

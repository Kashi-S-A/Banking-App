package com.ty.bankapp.BankingApp.exception;

public class EmployeeNotFoundException extends RuntimeException{

	String message;

	public EmployeeNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}

package com.ty.bankapp.BankingApp.exception;

public class IdNotFoundException extends RuntimeException{

	String message="Id not found ";

	public IdNotFoundException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}

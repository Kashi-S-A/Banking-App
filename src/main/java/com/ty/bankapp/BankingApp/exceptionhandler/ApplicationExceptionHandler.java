package com.ty.bankapp.BankingApp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ty.bankapp.BankingApp.dto.Bank;
import com.ty.bankapp.BankingApp.exception.IdNotFoundException;
import com.ty.bankapp.BankingApp.responseStructure.ResponseStructure;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler
	public ResponseEntity<ResponseStructure<Bank>> catchIdNotFoundException(IdNotFoundException exception) {
		ResponseStructure<Bank> responseStructure=new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage(exception.getMessage());
		
		return new ResponseEntity<ResponseStructure<Bank>>(responseStructure,HttpStatus.CREATED);
	}
}

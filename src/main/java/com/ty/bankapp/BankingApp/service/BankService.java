package com.ty.bankapp.BankingApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.bankapp.BankingApp.dao.Bankdao;
import com.ty.bankapp.BankingApp.dto.Bank;
import com.ty.bankapp.BankingApp.exception.IdNotFoundException;
import com.ty.bankapp.BankingApp.responseStructure.ResponseStructure;

@Service
public class BankService {

	@Autowired
	private Bankdao bankdao;
	
	//to save the bank 
	public ResponseEntity<ResponseStructure<Bank>> saveBank(Bank bank) {
		Bank recivedBank=bankdao.saveBank(bank);
		
		ResponseStructure responseStructure=new ResponseStructure();
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Success");
		responseStructure.setData(recivedBank);
		
		return new ResponseEntity<ResponseStructure<Bank>>(responseStructure,HttpStatus.CREATED);
	}
	
	//to get the bank based on the bankId
	public ResponseEntity<ResponseStructure<Bank>> getBankByBankId(int bankId) {
		Optional<Bank> op= bankdao.getBankByBankId(bankId);
		if (op.isPresent()) {
			
			ResponseStructure<Bank> responseStructure=new ResponseStructure<>();
			responseStructure.setStatusCode(HttpStatus.CREATED.value());
			responseStructure.setMessage("Success");
			responseStructure.setData(op.get());
			
			return new ResponseEntity<ResponseStructure<Bank>>(responseStructure,HttpStatus.CREATED); 
		} else {

			throw new IdNotFoundException("bankId does not found");
		}
	}
	
	//update the bank details based on bankId
	public ResponseEntity<ResponseStructure<Bank>> updateBankByBid(int bankId,Bank bank) {
		Optional<Bank> op= bankdao.getBankByBankId(bankId);
		if (op.isPresent()) {
			Bank recbank=bankdao.saveBank(bank);
			
			ResponseStructure<Bank> responseStructure=new ResponseStructure<>();
			responseStructure.setStatusCode(HttpStatus.CREATED.value());
			responseStructure.setMessage("Succesfully updated the bank");
			responseStructure.setData(recbank);
			
			return new ResponseEntity<ResponseStructure<Bank>>(responseStructure,HttpStatus.CREATED);
		} else {
			throw new IdNotFoundException("Updation is failed bcz id does not found");
		}
	}
	
	//delete the bank based on bankId
	public String deleteBankById(int bankId) {
		Optional<Bank> op= bankdao.getBankByBankId(bankId);
		if (op.isPresent()) {
			return bankdao.deleteBankByBankId(bankId);
		} else {
			return "BankId is not present";
		}
	}
}

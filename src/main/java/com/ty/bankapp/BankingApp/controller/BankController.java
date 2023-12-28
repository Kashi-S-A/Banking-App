package com.ty.bankapp.BankingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bankapp.BankingApp.dto.Bank;
import com.ty.bankapp.BankingApp.responseStructure.ResponseStructure;
import com.ty.bankapp.BankingApp.service.BankService;

@RestController
public class BankController {

	@Autowired
	private BankService bankService;
	
	//to save the bank details 
	@PostMapping("/savebank")
	public ResponseEntity<ResponseStructure<Bank>> saveBank(@RequestBody Bank bank) {
		return bankService.saveBank(bank);
	}
	
	//to get the bank details based on the bandId
	@GetMapping("/getbankbybankid/{bankId}")
	public ResponseEntity<ResponseStructure<Bank>> getBankById(@PathVariable int bankId) {
		return bankService.getBankByBankId(bankId);
	}
	
	//update bank details by bankId
	@PutMapping("/updatebank/{bankId}")
	public ResponseEntity<ResponseStructure<Bank>> updateBankByBankId(@PathVariable int bankId,@RequestBody Bank bank) {
		return bankService.updateBankByBid(bankId, bank);
	}
	
	//delete bank based on bankId
	@DeleteMapping("/deletebank/{bankId}")
	public String deleteBank(@PathVariable int bankId) {
		return bankService.deleteBankById(bankId);
	}
}

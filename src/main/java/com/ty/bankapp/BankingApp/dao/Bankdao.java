package com.ty.bankapp.BankingApp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bankapp.BankingApp.dto.Bank;
import com.ty.bankapp.BankingApp.repository.BankRespositroy;

@Repository
public class Bankdao {

	@Autowired
	private BankRespositroy bankRespositroy;
	
	//to save the bank
	public Bank saveBank(Bank bank) {
		return bankRespositroy.save(bank);
	}
	
	//to get the bank based on bankId
	public Optional<Bank> getBankByBankId(int bankId) {
		return bankRespositroy.findById(bankId);
	}
	
//	//to update the bank based on the bandId
//	public Bank updateBankByBankId(Bank bank) {
//		return bankRespositroy.save(bank);
//	}
	
	//delete the bank based on bankId
	public String deleteBankByBankId(int id) {
		 bankRespositroy.deleteById(id);
		 return "Deleted successfully";
	}
}

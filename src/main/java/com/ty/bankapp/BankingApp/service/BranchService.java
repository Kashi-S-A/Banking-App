package com.ty.bankapp.BankingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.bankapp.BankingApp.dao.BranchDao;
import com.ty.bankapp.BankingApp.dto.Branch;
import com.ty.bankapp.BankingApp.responseStructure.ResponseStructure;


/**
 * public ResponseEntity<ResponseStructure<Bank>> saveBank(Bank bank) {
		Bank recivedBank=bankdao.saveBank(bank);
		
		ResponseStructure responseStructure=new ResponseStructure();
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Success");
		responseStructure.setData(recivedBank);
		
		return new ResponseEntity<ResponseStructure<Bank>>(responseStructure,HttpStatus.CREATED);
	}
 * 
 */
 
@Service
public class BranchService {
	@Autowired
	private BranchDao branchDao;
	
	public ResponseEntity<ResponseStructure<Branch>> saveBranch(Branch branch){
		Branch receivedBranch=branchDao.saveBranch(branch);
		ResponseStructure<Branch> responseStructure=new ResponseStructure<Branch>();
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Success");
		responseStructure.setData(receivedBranch);
		
		return new ResponseEntity<ResponseStructure<Branch>>(responseStructure,HttpStatus.CREATED);
	}
}

package com.ty.bankapp.BankingApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bankapp.BankingApp.dto.Branch;
import com.ty.bankapp.BankingApp.repository.BranchRepository;

@Repository
public class BranchDao {
	@Autowired
	private BranchRepository branchRepository;
	
	
	public Branch saveBranch(Branch branch) {
		branchRepository.save(branch);
		return branch;
	}
}

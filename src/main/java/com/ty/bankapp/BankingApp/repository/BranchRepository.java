package com.ty.bankapp.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.bankapp.BankingApp.dto.Branch;

public interface BranchRepository extends JpaRepository<Branch, String>{

}

package com.ty.bankapp.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.bankapp.BankingApp.dto.Bank;

public interface BankRespositroy extends JpaRepository<Bank, Integer>{

}

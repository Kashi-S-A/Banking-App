package com.ty.bankapp.BankingApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bankapp.BankingApp.repository.BankRespositroy;

@Repository
public class Bankdao {

	@Autowired
	private BankRespositroy bankRespositroy;
}

package com.ty.bankapp.BankingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.bankapp.BankingApp.dao.Employeedao;

@Service
public class EmployeeService {

	@Autowired
	private Employeedao employeedao;
}

package com.ty.bankapp.BankingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bankapp.BankingApp.service.BankService;

@RestController
public class BankController {

	@Autowired
	private BankService bankService;
}

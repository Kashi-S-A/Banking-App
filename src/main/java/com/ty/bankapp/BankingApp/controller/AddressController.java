package com.ty.bankapp.BankingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bankapp.BankingApp.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
}

package com.ty.bankapp.BankingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.bankapp.BankingApp.dao.AddressDao;
import com.ty.bankapp.BankingApp.dto.Address;

@Service
public class AddressService {
	@Autowired
	private AddressDao addressDao;
	
	
	public Address saveAddress(Address address) {
		addressDao.saveAddress(address);
		return address;
	}
}

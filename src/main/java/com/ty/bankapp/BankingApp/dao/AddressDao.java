package com.ty.bankapp.BankingApp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bankapp.BankingApp.dto.Address;
import com.ty.bankapp.BankingApp.repository.AddressRepository;

@Repository
public class AddressDao {
	@Autowired
	private AddressRepository addressRepository;
	
	public Address saveAddress(Address address) {
		addressRepository.save(address);
		return address;
	}
	
	public Address updateAddress(Address address) {
		addressRepository.save(address);
		return address;
	}
	
	public void deleteAddressById(int id) {
		addressRepository.deleteById(id);
	}
	
	public Optional<Address> findUserByEmpId(int id) {
		return addressRepository.findById(id);
	}
}

package com.ty.bankapp.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.bankapp.BankingApp.dto.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}

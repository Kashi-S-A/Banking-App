package com.ty.bankapp.BankingApp.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Component
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pincode;
	private String city;
	private String country;
	private String state;
	
	
}

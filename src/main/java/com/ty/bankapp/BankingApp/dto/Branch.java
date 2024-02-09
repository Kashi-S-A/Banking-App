package com.ty.bankapp.BankingApp.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Component
public class Branch {
	@Id
	/* @GeneratedValue(strategy = GenerationType.AUTO) */
	private String branchId;
	private String branchName;
	private String branchIFSCcode;
	private String branchEmail;
	private long branchPhoneNumber;

	@OneToOne
	private Employee branchManager;

	@OneToOne
	private Address address;

	@ManyToOne
	private Bank bank;
}

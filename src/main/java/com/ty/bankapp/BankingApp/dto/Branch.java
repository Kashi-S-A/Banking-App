package com.ty.bankapp.BankingApp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String branchId;
	private String branchName;
	private String branchIFSCcode;
	private String branchEmail;
	private long branchPhoneNumber;
	private Employee branchManager;
	
	

}

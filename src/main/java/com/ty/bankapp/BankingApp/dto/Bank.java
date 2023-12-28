package com.ty.bankapp.BankingApp.dto;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Component
@Getter
@Setter
@Table(name = "bank_name")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "BANKID")
	@SequenceGenerator(name = "BANKID",initialValue = 100)
	private String bankId;
	private String bankName;
	private Employee managingDirector;
	
}

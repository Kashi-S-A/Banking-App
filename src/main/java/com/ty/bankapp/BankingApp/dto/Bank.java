package com.ty.bankapp.BankingApp.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String bankId;
	private String bankName;
	@OneToOne
	private Employee managingDirector;

	@OneToOne
	private Address address;

	@OneToMany
	private List<Branch> branch;

}

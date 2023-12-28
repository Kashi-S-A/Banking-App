package com.ty.bankapp.BankingApp.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.ty.bankapp.BankingApp.util.EmployeeRole;
import com.ty.bankapp.BankingApp.util.EmployeeStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Component
@Getter
@Setter
@Table(name = "employee_info")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String empId;
	private String empName;
	@Column(unique = true)
	private long phoneNumber;
	@Column(unique = true)
	private String email;
	private String password;
	private String gender;
	private LocalDate localDate;
	private LocalDateTime dateOfJoining;
	
	@OneToOne
	private Address address;
	
	@ManyToOne
	private Branch branch;
	
	private EmployeeRole employeeRole;
	
	private EmployeeStatus employeeStatus;
}

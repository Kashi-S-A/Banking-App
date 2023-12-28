package com.ty.bankapp.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.bankapp.BankingApp.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

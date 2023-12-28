package com.ty.bankapp.BankingApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bankapp.BankingApp.dto.Employee;
import com.ty.bankapp.BankingApp.repository.EmployeeRepository;

@Repository
public class Employeedao {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//to save an employee and update an employee
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	//to get the employee by id
	public Optional<Employee> getEmployee(int empId) {
		return employeeRepository.findById(empId);
	}
	
	//to get all the employees
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	//to delete the employee based on the empId
	public String deleteEmployee(int empId) {
		employeeRepository.deleteById(empId);
		return "employee deleted successfully";
	}
	
}

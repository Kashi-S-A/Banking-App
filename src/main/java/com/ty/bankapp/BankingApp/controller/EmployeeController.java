package com.ty.bankapp.BankingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bankapp.BankingApp.dto.Employee;
import com.ty.bankapp.BankingApp.responseStructure.ResponseStructure;
import com.ty.bankapp.BankingApp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	//to save the employee
	@PostMapping("/saveemployee")
	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	//to get the employee based on empId
	@GetMapping("/getemployee/{empId}")
	public ResponseEntity<ResponseStructure<Employee>> getEmployeeByEmpId(@PathVariable int empId) {
		return employeeService.getEmployeeByempId(empId);
	}
	
	//get the all the employees
	@GetMapping("/getallemployees")
	public ResponseEntity<ResponseStructure<Employee>> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	//to delete the emp based on empId
	@DeleteMapping("/deleteemployee/{empId}")
	public String deleteEmployeeByEmpId(@PathVariable int empId) {
		return employeeService.deleteEmployeeByEmpId(empId);
	}
}

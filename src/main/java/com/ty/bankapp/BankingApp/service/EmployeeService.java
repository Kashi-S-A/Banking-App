package com.ty.bankapp.BankingApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.bankapp.BankingApp.dao.Employeedao;
import com.ty.bankapp.BankingApp.dto.Employee;
import com.ty.bankapp.BankingApp.exception.EmployeeNotFoundException;
import com.ty.bankapp.BankingApp.exception.IdNotFoundException;
import com.ty.bankapp.BankingApp.responseStructure.ResponseStructure;

@Service
public class EmployeeService {

	@Autowired
	private Employeedao employeedao;
	
	//to save employee
	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(Employee employee) {
		Employee recievedEmployee= employeedao.saveEmployee(employee);
		
		ResponseStructure<Employee> responseStructure=new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Success");
		responseStructure.setData(employee);
		
		return new ResponseEntity<ResponseStructure<Employee>>(responseStructure,HttpStatus.CREATED);
	}
	
	//to get the employee based on empid
	public ResponseEntity<ResponseStructure<Employee>> getEmployeeByempId(int empId) {
		Optional<Employee> op= employeedao.getEmployee(empId);
		if (op.isPresent()) {
			ResponseStructure<Employee> responseStructure=new ResponseStructure<>();
			responseStructure.setStatusCode(HttpStatus.CREATED.value());
			responseStructure.setMessage("success");
			responseStructure.setData(op.get());
			
			return new ResponseEntity<ResponseStructure<Employee>>(responseStructure,HttpStatus.CREATED);
		} else {
			throw new IdNotFoundException("Id of the employee does not found");
		}
		
	}
	
	//to get all the employees
	public ResponseEntity<ResponseStructure<Employee>> getAllEmployees() {
		List<Employee> employees= employeedao.getAllEmployees();
		
		if (employees.isEmpty()) {
			throw new EmployeeNotFoundException("Employee not found");
		} else {
			ResponseStructure<Employee> responseStructure=new ResponseStructure<>();
			responseStructure.setStatusCode(HttpStatus.CREATED.value());
			responseStructure.setMessage("Successfully recieved all the employees");
			responseStructure.setListdata(employees);
			
			return new ResponseEntity<ResponseStructure<Employee>>(responseStructure,HttpStatus.CREATED);
		
		}
		}
	
	//to delete the emp details by empId
	public String deleteEmployeeByEmpId(int empId) {
		return employeedao.deleteEmployee(empId);
	}
}

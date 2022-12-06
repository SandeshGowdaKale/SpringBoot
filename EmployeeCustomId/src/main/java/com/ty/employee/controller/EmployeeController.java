package com.ty.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.employee.Employee;
import com.ty.employee.repository.EmployeeRepository;

@RequestMapping("/employees")
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping()
	public Employee saveBook(@RequestBody Employee books) {
		return employeeRepository.save(books);
	}

}

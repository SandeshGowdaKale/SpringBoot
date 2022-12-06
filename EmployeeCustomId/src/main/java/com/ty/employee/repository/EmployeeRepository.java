package com.ty.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

package com.nikhil.restapi.service;

import java.util.List;

import com.nikhil.restapi.entities.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();

	public Employee getEmployee(Long empId);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);
}

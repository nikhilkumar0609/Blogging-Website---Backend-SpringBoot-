package com.nikhil.restapi.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.nikhil.restapi.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	List<Employee> list1 = new ArrayList<>();
	
	public EmployeeServiceImpl() {
		
		list1.add(new Employee(1, "Nikhil"));
		list1.add(new Employee(2, "Rupam"));
		list1.add(new Employee(3, "Pucchku"));
	}
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return list1;
	}

	@Override
	public Employee getEmployee(Long empId) {
		// TODO Auto-generated method stub
		Employee e = null;
		for(Employee emp : list1) {
			if(emp.getId() == empId) {
				e = emp;
				break;
			}
		}
		return e;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		list1.add(employee);
		System.out.println("Added Successfully");
		return employee;
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		list1.forEach(e -> {
			if(e.getId() == employee.getId()) {
				e.setName(employee.getName());
			}
			
		});
		
		return employee;
	}

	
	
}

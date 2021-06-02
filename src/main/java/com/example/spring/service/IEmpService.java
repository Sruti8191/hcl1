package com.example.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.beans.Employee;
import com.example.spring.exception.EmployeeException;


@Service
public interface IEmpService {

	public Employee addEmployee(Employee employee) throws EmployeeException;
	
	public List<Employee> getEmployees();
	
	public boolean deleteEmployee(int e_id) throws EmployeeException;
	
	public Employee updateEmployee(Employee employee, int e_id) throws EmployeeException;
}

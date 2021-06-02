package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.beans.Employee;
import com.example.spring.dao.EmpDao;
import com.example.spring.exception.EmployeeException;

@Service
public class EmpServiceImpl implements IEmpService {

	@Autowired
	EmpDao empDao;
	
	@Override
	public Employee addEmployee(Employee employee) throws EmployeeException {
		if(!empDao.findById(employee.getE_id()).isPresent())
			return empDao.save(employee);
		else 
			throw new EmployeeException("Id Already exists");
	}

	@Override
	public List<Employee> getEmployees() {
		
		return empDao.findAll();
	}

	@Override
	public boolean deleteEmployee(int e_id) throws EmployeeException {
		if(empDao.findById(e_id).isPresent())
			return true;
		else 
			throw new EmployeeException("Id does not exists");
	}

	@Override
	public Employee updateEmployee(Employee employee, int e_id) throws EmployeeException {
		if(empDao.findById(e_id).isPresent())
			return empDao.saveAndFlush(employee);
		else 
			throw new EmployeeException("Id data not found");
	}

}

package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.beans.Employee;
import com.example.spring.exception.EmployeeException;
import com.example.spring.service.IEmpService;

@RestController
public class EmpController {

	@Autowired
	IEmpService service;


	@GetMapping("/getEmployeesList")
	public ResponseEntity<List<Employee>> getEmployees() {
		
		return new ResponseEntity<List<Employee>>(service.getEmployees(), HttpStatus.OK);
	}
    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) throws EmployeeException {

 

        return new ResponseEntity<Employee>(service.addEmployee(employee), HttpStatus.OK);
    }

 

    @DeleteMapping("/deleteEmployee/{e_id}")
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable int e_id) throws EmployeeException {

 

        return new ResponseEntity<Boolean>(service.deleteEmployee(e_id), HttpStatus.OK);
    }

 

    @PutMapping("/updateEmployee/{e_id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int e_id, @RequestBody Employee employee)
            throws EmployeeException {

 

        return new ResponseEntity<Employee>(service.updateEmployee(employee, e_id), HttpStatus.OK);
    }
}

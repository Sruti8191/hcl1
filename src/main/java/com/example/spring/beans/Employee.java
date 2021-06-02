package com.example.spring.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "e_id", nullable = false)
	private int e_id;
	
	@Column(name = "e_name")
	private String e_name;
	
	@Column(name = "e_salary")
	private float e_salary;
	
	@Column(name = "e_dept")
	private String e_dept;
	
	@Column(name = "e_age")
	private int e_age;
}

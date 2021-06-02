package com.example.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.beans.Employee;

@Repository
public interface EmpDao extends JpaRepository<Employee, Integer> {

}

package com.hughes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.model.Employee;
import com.hughes.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository erepo;
	
	public List<Employee> getEmployee() {
		return erepo.findAll();
	}
	
	public Employee createEmployee(Employee e) {
		return erepo.save(e); 
	}

}
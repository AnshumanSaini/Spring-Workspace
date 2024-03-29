package com.hughes.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.model.Employee;
import com.hughes.service.MyService;

@Service
public class MyServiceImpl implements MyService {
	@Autowired
	Employee emp;
	
	public String getEmployees() {
		return emp.getEmployees();
	}
}

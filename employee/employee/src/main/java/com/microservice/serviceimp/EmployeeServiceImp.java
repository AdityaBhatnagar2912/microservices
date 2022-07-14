package com.microservice.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservice.Repo.EmployeeRepo;
import com.microservice.entity.Employee;
import com.microservice.service.EmployeeService;
@Component
public class EmployeeServiceImp implements  EmployeeService{
@Autowired
EmployeeRepo er;
	@Override
	public List<Employee> get() {
		return er.findAll();
		 
	}

	@Override
	public List<Employee> post(Employee e) {
	er.save(e);
	
		return er.findAll();
	}

	@Override
	public List<Employee> put(Employee e) {
		er.save(e);
		
		return er.findAll();
	}

	@Override
	public List<Employee> delete(int id) {
		er.deleteById(id);
		return er.findAll();
	}

}

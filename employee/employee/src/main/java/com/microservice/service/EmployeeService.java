package com.microservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.microservice.entity.Employee;
@Service
public interface EmployeeService {

public List<Employee>get();
public List<Employee> post(@RequestBody Employee e);
public List<Employee> put(@RequestBody Employee e);
public List<Employee> delete(@PathVariable int id);
}

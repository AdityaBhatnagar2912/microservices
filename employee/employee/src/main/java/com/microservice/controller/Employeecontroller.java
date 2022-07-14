package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entity.Employee;
import com.microservice.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class Employeecontroller {
@Autowired
EmployeeService es;

@GetMapping("/")
public List<Employee>get(){
	return es.get();
}
@PostMapping("/")
public List<Employee> post(@RequestBody Employee e){
	return es.post(e);
}
@PutMapping("/")
public List<Employee> put(@RequestBody Employee e){
	return es.put(e);
}
@DeleteMapping("/{id}")
public List<Employee> delete(@PathVariable int id){
	return es.delete(id);
}

}

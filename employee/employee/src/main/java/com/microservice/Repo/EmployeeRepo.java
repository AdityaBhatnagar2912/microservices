package com.microservice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}

package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
	
    List<Employee> findByUserName(String userName);


}

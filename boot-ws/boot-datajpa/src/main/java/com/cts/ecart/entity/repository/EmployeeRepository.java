package com.cts.ecart.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

	
	
}

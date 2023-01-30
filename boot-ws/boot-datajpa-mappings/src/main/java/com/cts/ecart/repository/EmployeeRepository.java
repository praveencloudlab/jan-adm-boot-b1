package com.cts.ecart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	 // DSL (Domain specific Language)
	 // Query
	
	
	//DSL
	//===============================================
	
	// find all employees by name
	List<Employee> findByEmpName(String name);
	// find all employees whose name having a given letter
	List<Employee> findByEmpNameLike(String name);
	//find all employees whose salary is less than given criteria
	List<Employee> findBySalaryLessThanEqual(double sal);
	//find all employees whose salary is greater than given criteria
	List<Employee> findBySalaryGreaterThanEqual(double sal);
	// find all employees whose salary is between given start and end range
	
	List<Employee> findBySalaryBetween(double startRange,double endRange);
	
	
}

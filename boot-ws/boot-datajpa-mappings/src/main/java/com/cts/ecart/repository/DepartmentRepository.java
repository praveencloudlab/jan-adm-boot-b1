package com.cts.ecart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
	// filter departmet matching employees whose salary is greater than 10,00000
	
	 
	

}

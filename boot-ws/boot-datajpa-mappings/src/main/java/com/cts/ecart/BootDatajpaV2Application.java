package com.cts.ecart;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.entity.Department;
import com.cts.ecart.entity.Employee;
import com.cts.ecart.repository.DepartmentRepository;
import com.cts.ecart.repository.EmployeeRepository;
import com.cts.ecart.service.ProductServiceImpl;

@SpringBootApplication
public class BootDatajpaV2Application {

	public static void main(String[] args) throws IOException {
	ConfigurableApplicationContext ac=	SpringApplication.run(BootDatajpaV2Application.class, args);
	
	EmployeeRepository empDao = ac.getBean(EmployeeRepository.class);
	DepartmentRepository deptDao=ac.getBean(DepartmentRepository.class);
	
	ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
	
	Department dept = ps.loadDept();
	Department dept1=new Department(1026,"Traning","London");
	
	// load all employees/ find any employee to be assigned
	
	 //Employee emp = empDao.findById(13).orElse(null);
	Employee emp=new Employee(15, "Bucky Wall", 4864344); 
	
	dept1.getEmps().add(emp);
	
	deptDao.save(dept1);
	
	
 	
	
	
	}

}

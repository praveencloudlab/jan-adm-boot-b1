package com.cts.ecart;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.dialect.Dialect;
import org.hibernate.mapping.Collection;
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
	
	/*
	// load all employees assigned to a deiven dept number
	Department dept = deptDao.findById(1026).orElse(null);
	
	System.out.println(dept.getDeptId());
	System.out.println(dept.getDeptName());
	System.out.println(dept.getLocation());
	System.out.println("---------------------------------");
	dept.getEmps().forEach(System.out::println);
	*/
	
	// find employee by ID:
	//Employee e1 = empDao.findById(10).orElse(null);
	
	//System.out.println(e1);
	
	//empDao.findByEmpName("praveen").forEach(System.out::println);
	
	
	
	
	
	
	
	//Department dept = ps.loadDept();
	//Department dept1=new Department(1026,"Traning","London");
	
	// load all employees/ find any employee to be assigned
	
	 //Employee emp = empDao.findById(13).orElse(null);
	//Employee emp=new Employee(15, "Bucky Wall", 4864344); 
	
	//dept1.getEmps().add(emp);
	
	//deptDao.save(dept1);
	
	
	//empDao.findByEmpNameLike("%a%").forEach(System.out::println);
	//empDao.findBySalaryLessThanEqual(1000000).forEach(System.out::println);
	//display(empDao.findBySalaryLessThanEqual(1000000));
	//display(empDao.findBySalaryGreaterThanEqual(1000000));
	//display(empDao.findBySalaryBetween(1000000, 5000000));
	  
	
	 Department dept = deptDao.findById(10204).orElse(null);
	 //display(dept.getEmps());
	
	List<Employee> collect = dept.getEmps().stream().filter(emp->emp.getSalary()>=5000000).collect(Collectors.toList());
	 display(collect);
	}
	
	public static void display(List<?> data) {
		data.forEach(System.out::println);
	}

}

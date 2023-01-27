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
	
	Department d1=new Department(47,"IT","Delhi");
	
	Employee e1=new Employee(1,"James",4954957);
	e1.setDept(d1);
	System.out.println(ps.jsonData());
    
	//empDao.save(e1);
	
	//Employee emp = ps.getEmployee();
	//System.out.println(emp);
	//ps.loadEmployees().forEach(emp->{
	//	empDao.save(emp);
	//});
	
	List<Employee> employees = ps.loadEmployees();
	
	empDao.saveAll(employees);
	
	
	
	}

}

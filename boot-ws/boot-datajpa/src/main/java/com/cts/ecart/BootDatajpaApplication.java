package com.cts.ecart;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.entity.Employee;
import com.cts.ecart.entity.Product;
import com.cts.ecart.entity.repository.EmployeeRepository;
import com.cts.ecart.entity.repository.ProductRepository;

@SpringBootApplication
public class BootDatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac= SpringApplication.run(BootDatajpaApplication.class, args);
		ProductRepository prodRepo = ac.getBean(ProductRepository.class);
		EmployeeRepository empRepo = ac.getBean(EmployeeRepository.class);
		
		
		Product p1=new Product();
		p1.setProductName("head phone");
		p1.setPrice(45000);
		p1.setDescription("BOSS NC level 10");
		
		
		Employee e1=new Employee();
		e1.setEmpName("Abc");
		e1.setSalary(9437394);
		
		//empRepo.save(e1);
		
		Product product = prodRepo.findById(1).orElse(null);
		System.out.println(product);
		
		
		//prodRepo.save(p1); // 
		
		//prodRepo.findAll().forEach(System.out::println);
		//long count = prodRepo.count();
		//System.out.println(count);
		
		
		
		
		
		
	
	}

}

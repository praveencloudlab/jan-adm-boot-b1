package com.cts.ecart.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.cts.ecart.entity.Department;
import com.cts.ecart.entity.Employee;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ProductServiceImpl {

	@Value("classpath:deptdata.json")
	private Resource resource;

	@Bean
	public void loadData() throws IOException {
		InputStream is = resource.getInputStream();
		System.out.println(is.readAllBytes());

	}

	@Bean
	public String jsonData() throws IOException {
		return new String(resource.getInputStream().readAllBytes());
	}

	/*
	 * public Employee getEmployee() throws StreamReadException, DatabindException,
	 IOException { return new
	ObjectMapper().readValue(resource.getInputStream(),Employee.class); }
	 */
	
	public Department loadDept() throws StreamReadException, DatabindException, IOException {
		 return new ObjectMapper().readValue(resource.getInputStream(),Department.class);

	}

	/*
	public List<Employee> loadEmployees()throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		TypeReference<List<Employee>> typeReference = new TypeReference<List<Employee>>() {};
		return objectMapper.readValue(resource.getInputStream(), typeReference);

	}
	*/

}

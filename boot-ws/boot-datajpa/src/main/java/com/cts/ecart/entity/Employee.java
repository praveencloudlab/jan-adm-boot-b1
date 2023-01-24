package com.cts.ecart.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@GenericGenerator(name = "myGen",strategy = "com.cts.ecart.entity.service.utils.CustomPKGen")
public class Employee {
	
	@Id
	@GeneratedValue(generator = "myGen")
	private String  empId;
	private String empName;
	private double salary;
	
	

}

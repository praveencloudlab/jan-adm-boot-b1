package com.cts.ecart; // base package

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.Demo;
@SpringBootApplication // auto discovery (container)
//@ComponentScan("com")
public class SpringbootCoreApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootCoreApplication.class, args);
	}

}

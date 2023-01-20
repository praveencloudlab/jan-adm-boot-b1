package com.cts.bank.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties("spring.application")
public class AccountServiceImpl {
	
	@Value("${spring.application.name}")
	private String name;
	
	@Profile(value = "dev")
	@Bean
	public void f1() {
		System.out.println("Development-name: "+name);
	}
	
	@Profile(value = "test")
	@Bean
	public void f2() {
		System.out.println("Test-Name: "+name);
	}
	
	
	
	

}

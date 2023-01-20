package com.cts.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource(value = {"db.properties"})
public class AccountServiceImpl {
	
	//@Value("${city}")
	//private String cityName;
	
	@Autowired
	private Environment env;
	
	@Bean
	public void info() {
		System.out.println("test");
		//System.out.println("test: "+cityName);
		System.out.println("test: "+env.getProperty("my-city"));
	}

}

package com.cts.ecart.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl {
	
	
	@Autowired
	private JdbcTemplate jt;
	
	public List<Map<String,Object>> test() {
		return jt.queryForList("select * from product");
	}
	
	
	

}

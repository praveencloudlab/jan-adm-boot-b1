package com.cts.ecart.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ecart.model.Product;

@Repository
//@EnableTransactionManagement
public class ProductLamdbaRepositoryImpl {

	@Autowired
	private JdbcTemplate jt;

	//@Transactional(propagation )
	public void save(Product product) {
		
		String q1="insert into product values(?,?,?)";
		jt.update(q1,product.getProductId(),product.getPrice(),product.getProductName());	
	}
	
	
	
	// find One Product using RowMapper interface
	public Product findById(int id) {
		return jt.queryForObject("select * from product where product_id=?", (rs,
				rowNum) -> new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getDouble("price")),
				id);
	}

	// List all Products using RowMapper
	public List<Product> findAll() {
		return jt.query("select * from product", (rs, rowNum) -> new Product(rs.getInt("product_id"),
				rs.getString("product_name"), rs.getDouble("price")));
	}

	// List all Products using RowMapper
	public List<Product> findAllByFilter(double price) {
		return jt.query("select * from product where price>=?", (rs, rowNum) -> new Product(rs.getInt("product_id"),
				rs.getString("product_name"), rs.getDouble("price")), price);
	}

	// List all Products using ResultSetExtractor
	public List<Product> findAllV1() {
		return jt.query("select * from product", (rs) -> {
			List<Product> prods = new ArrayList<>();
			while (rs.next()) {
				Product prod = new Product(rs.getInt("product_id"), rs.getString("product_name"),
						rs.getDouble("price"));
				prods.add(prod);
			}
			return prods;
		});
	}

	// Find a Product using ResultSetExtractor
	public Product findByIdV1(int id) {
		return jt.query("select * from product where product_id=?", (rs) -> {
			if (rs.next()) {
				Product prod = new Product(rs.getInt("product_id"), rs.getString("product_name"),rs.getDouble("price"));
				return prod;
			}
			return null;
		}, id);
	}

}

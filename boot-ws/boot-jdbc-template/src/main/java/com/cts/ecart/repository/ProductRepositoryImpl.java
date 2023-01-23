package com.cts.ecart.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.ecart.model.Product;

@Repository
public class ProductRepositoryImpl {

	@Autowired
	private JdbcTemplate jt;

	/*
	 * 1.DML operations 
	 * 2.DRL operation
	 * 
	 * 2.DRL operation 
	 * --------------------- 
	 * -> Generic operations 
	 * -> Single row
	 * 			-> fetch operations queryForMap() 
	 * -> Multiple row 
	 * 			-> fetching operations qyeryForList() 
	 * 	
	 * 
	 *  
	 *  Domain Object Queries
	 * 
	 * 1.RowMapper 
	 * 2.RowCallbackHandler
	 * 3.ResultSetExtractor
	 * 
	 * 1.RowMapper interface
	 *  -------------------------- 
	 *  Spring provides a RowMapper interface for mapping a single row of a ResultSet to an object 
	 *  	– Can be usedfor both single and multiple row queries 
	 *  	– Parameterized as of Spring 3.0 
	 *      - T mapRow(ResultSet rs, int rowNum)
	 *      - queryForObject for single row operations 
	 *      - query method for multiple row operations
	 
	 * 3.ResultSetExtractor
	 * --------------------------
	 *   Spring provides a ResultSetExtractor interface for processing an entire ResultSet at once.
			– You are responsible for iterating the ResultSet
			– e.g. for mapping entire ResultSet to a single object
			
	 *
	 */

	// Single row Generic fetch
	public Map<String, Object> genericSingleRowFetch(int id) {
		return jt.queryForMap("select * from product where product_id=?", id);
	}

	public List<Map<String, Object>> genericMultiRowFetch() {
		return jt.queryForList("select * from product");
	}

	
	//domain multiple row operations::RowMapper
	public List<Product> findAllByRowMapper() {
	    List<Product> prods = jt.query("select * from product", new RowMapperDemo());
	    return prods;
	}
	
	//domain single row operations::RowMapper
	public Product findOneByRowMapper(int id) {
		Product product = jt.queryForObject("select * from product where product_id=?",new RowMapperDemo(),id);
		return product;
	}
	
    // multiple row operations :: ResultSetExtractor
	public List<Product> findAllByResultSetExtractor(){
		List<Product> products = jt.query("select * from product",new ResultSetExtractorDemo());
		return products;
	}
	
	
	//domain single row operations::ResultSetExtractor
		public Product findOneByResultSetExtractor(int id) {
			Product product = jt.query("select * from product where product_id=?",new ResultSetExtractorDemoV1(),id);
			return product;
		}
	
}

class ResultSetExtractorDemo implements ResultSetExtractor<List<Product>>{
	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Product> products=new ArrayList<>();
		while(rs.next()) {
			Product prod = new Product();
			prod.setProductId(rs.getInt("product_id"));
			prod.setProductName(rs.getString("product_name"));
			prod.setPrice(rs.getDouble("price"));
			products.add(prod);
		}
		
		return products;
	}
}



class ResultSetExtractorDemoV1 implements ResultSetExtractor<Product>{
	@Override
	public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		    if(rs.next()) {
			Product prod = new Product();
			prod.setProductId(rs.getInt("product_id"));
			prod.setProductName(rs.getString("product_name"));
			prod.setPrice(rs.getDouble("price"));
			return prod;
		    }
			
	
		
		return null;
	}
}

class RowMapperDemo implements RowMapper<Product> {
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product prod = new Product();
		prod.setProductId(rs.getInt("product_id"));
		prod.setProductName(rs.getString("product_name"));
		prod.setPrice(rs.getDouble("price"));

		return prod;
	}
}

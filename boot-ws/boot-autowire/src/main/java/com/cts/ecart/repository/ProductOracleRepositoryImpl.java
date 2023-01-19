package com.cts.ecart.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class ProductOracleRepositoryImpl implements ProductRepository {

	@Override
	public void save() {
		System.out.println(">>ProductOracleRepositoryImpl::save - Oracle");
	}
}


package com.cts.ecart.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl {
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void operations() {
		f1(); // txn_id
		f2();
		f3();
	}
	
	void f1() {}
	void f2() {}
	void f3() {}

}

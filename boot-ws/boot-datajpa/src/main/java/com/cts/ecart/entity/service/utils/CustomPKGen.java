package com.cts.ecart.entity.service.utils;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomPKGen implements IdentifierGenerator{
	
	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		String s1="CTSABC1007934";
		
		long l=System.currentTimeMillis();
		
		String key=s1+l;
		
		
		return key;
	}

}

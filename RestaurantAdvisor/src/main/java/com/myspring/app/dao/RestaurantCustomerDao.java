package com.myspring.app.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.myspring.app.model.RestaurantCustomer;
import com.myspring.app.util.ConnectionFactory;

@Service
public class RestaurantCustomerDao {
	
	public RestaurantCustomerDao() {
		
	}

	public List<RestaurantCustomer> checkRestaurantCustomer(String email) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		List<RestaurantCustomer> c = new ArrayList<RestaurantCustomer>();
		try {
			c = session.selectList("com.mapper.RestaurantCustomerMapper.selectRestaurantCustomer",email);
		} finally {
			session.close();
		}
		return c;
	}
		
	public int insertRestaurantCustomer(RestaurantCustomer c) {
		SqlSession session = com.myspring.app.util.ConnectionFactory.getSqlSessionFactory().openSession();
		int result;
		try {
			result = session.insert("com.mapper.RestaurantCustomerMapper.insertRestaurantCustomer",c);
			session.commit();
		} finally {
			session.close();
		}
		return result;		
	}
	
}

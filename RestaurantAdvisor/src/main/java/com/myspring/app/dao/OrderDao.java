package com.myspring.app.dao;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.myspring.app.model.Order;
import com.myspring.app.util.ConnectionFactory;

public class OrderDao {
	
	public OrderDao(){
		
	}
	
//	public List<Order> getOrders() {
//		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
//		List<Order> o = new ArrayList<Order>();
//		try {
//			o = session.selectList("com.mapper.OrderMapper.selectOrders");
//		} finally {
//			session.close();
//		}
//		return o;
//	}

	public int insertOrder(Order newO) {
		SqlSession session = com.myspring.app.util.ConnectionFactory.getSqlSessionFactory().openSession();
		int result;
		try {
			result = session.insert("com.mapper.OrderMapper.insertOrder",newO);
			session.commit();
		} finally {
			session.close();
		}
		return result;		
	}
	
}

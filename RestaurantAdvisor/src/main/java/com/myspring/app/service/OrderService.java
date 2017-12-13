package com.myspring.app.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.myspring.app.dao.CustReviewDao;
import com.myspring.app.dao.OrderDao;
import com.myspring.app.dao.RestaurantDao;
import com.myspring.app.model.Restaurant;
import com.myspring.app.util.ConnectionFactory;
import com.myspring.app.model.Order;


public class OrderService {
	
	public OrderService() {
		
	}
	private static int ono;	
	OrderDao od; 
	
//	public List<Order> getOrderList(){
//		List<Order> orderList = new ArrayList<Order>();
//		OrderDao orderDAO = new OrderDao();		
//		orderList = orderDAO.getOrders();
//		return orderList;
//	}
	
	public int insertOrder(Order Ord) {
		od = new OrderDao();
		int i;
		i = od.insertOrder(Ord);
		return i;	
	}
		
}

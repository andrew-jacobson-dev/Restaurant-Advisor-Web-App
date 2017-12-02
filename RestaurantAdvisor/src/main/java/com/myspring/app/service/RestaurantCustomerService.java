package com.myspring.app.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.myspring.app.dao.RestaurantCustomerDao;
import com.myspring.app.model.RestaurantCustomer;


@Service
public class RestaurantCustomerService {
	
	@Autowired
	RestaurantCustomerDao cd;
	
	public RestaurantCustomerService() {
		
	}

	public int insertRestaurantCustomer(RestaurantCustomer c) {
		//RestaurantCustomerDao cd = new RestaurantCustomerDao();
		int i;
		i = cd.insertRestaurantCustomer(c);
		return i;
		
	}
	
	public boolean checkRestaurantCustomer(String email, String password) {
		List<RestaurantCustomer> cust = new ArrayList<RestaurantCustomer>();
		boolean flag = false;
		//RestaurantCustomerDao cd = new RestaurantCustomerDao();
		cust = cd.checkRestaurantCustomer(email);
		for(RestaurantCustomer c : cust) {
			if (c.getEmail().equals(email) && c.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	

}

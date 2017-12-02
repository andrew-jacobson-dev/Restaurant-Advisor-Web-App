package com.myspring.app.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.myspring.app.dao.customerDao;
import com.myspring.app.model.Customer;


@Service
public class CustomerService {
	
	@Autowired
	customerDao cd;
	
	public CustomerService() {
		
	}

	public int insertCustomer(Customer c) {
		//customerDao cd = new customerDao();
		int i;
		i = cd.insertCustomer(c);
		return i;
		
	}
	
	public boolean checkCustomer(String email, String password) {
		List<Customer> cust = new ArrayList<Customer>();
		boolean flag = false;
		//customerDao cd = new customerDao();
		cust = cd.checkCustomer(email);
		for(Customer c : cust) {
			if (c.getEmail().equals(email) && c.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	

}

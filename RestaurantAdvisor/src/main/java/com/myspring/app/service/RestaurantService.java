package com.myspring.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.app.dao.RestaurantDao;
import com.myspring.app.model.Restaurant;

@Service
public class RestaurantService {
	
//	@Autowired
//	RestaurantDAO rd;
	
	public RestaurantService() {
		
	}
	
	public List<Restaurant> getRestaurantList(){
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		RestaurantDao restaurantDAO = new RestaurantDao();
		restaurantList = restaurantDAO.getRestaurants();
		return restaurantList;
	}
	
	public Restaurant getOneRestaurant(String restid){
		Restaurant restaurant = new Restaurant();
		RestaurantDao restaurantDAO = new RestaurantDao();
		restaurant = restaurantDAO.getOneRestaurant(restid);
		return restaurant;
	}
}

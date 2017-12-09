package com.myspring.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.myspring.app.model.Restaurant;
import com.myspring.app.util.ConnectionFactory;

@Service
public class RestaurantDao {

	public RestaurantDao() {
		
	}

	public List<Restaurant> getRestaurants() {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		List<Restaurant> r = new ArrayList<Restaurant>();
		try {
			r = session.selectList("com.mapper.RestaurantMapper.selectAllRestaurants");
		} finally {
			session.close();
		}
		return r;
	}
	
	public Restaurant getOneRestaurant(String restid) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		Restaurant r = new Restaurant();
		try {
//			r = session.selectList("com.mapper.RestaurantMapper.selectOneRestaurant");
			r = session.selectOne("com.mapper.RestaurantMapper.selectOneRestaurant",restid);
		} finally {
			session.close();
		}
		return r;
	}
	
}

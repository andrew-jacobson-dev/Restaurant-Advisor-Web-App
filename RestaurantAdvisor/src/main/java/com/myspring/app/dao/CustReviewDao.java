package com.myspring.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.myspring.app.model.CustReview;
import com.myspring.app.model.RestaurantsAndRatings;
import com.myspring.app.util.ConnectionFactory;

public class CustReviewDao {
	
	public CustReviewDao() {
		
	}

	public List<CustReview> getReviews(Integer restid) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustReview> cr = new ArrayList<CustReview>();
		try {
			cr = session.selectList("com.mapper.CustReviewMapper.selectAllReviews",restid);
		} finally {
			session.close();
		}
		return cr;
	}
	
	public List<RestaurantsAndRatings> getRestaurantsAndRatings() {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		List<RestaurantsAndRatings> rar = new ArrayList<RestaurantsAndRatings>();
		try {
			rar = session.selectList("com.mapper.CustReviewMapper.selectRestaurants");
		} finally {
			session.close();
		}
		return rar;
	}
	
	public int insertReview(CustReview cr) {
		SqlSession session = com.myspring.app.util.ConnectionFactory.getSqlSessionFactory().openSession();
		int result;
		try {
			result = session.insert("com.mapper.CustReviewMapper.insertReview",cr);
			session.commit();
		} finally {
			session.close();
		}
		return result;		
	}
}

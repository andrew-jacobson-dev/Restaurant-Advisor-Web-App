package com.myspring.app.service;

import java.util.ArrayList;
import java.util.List;

import com.myspring.app.dao.CustReviewDao;
import com.myspring.app.model.CustReview;
import com.myspring.app.model.RestaurantsAndRatings;


public class CustReviewService {

	public CustReviewService() {
		
	}
	
	public List<CustReview> getReviewList(Integer restid){
		List<CustReview> custReviewList = new ArrayList<CustReview>();
		CustReviewDao custReviewDAO = new CustReviewDao();
		custReviewList = custReviewDAO.getReviews(restid);
		return custReviewList;
	}
	
	public List<RestaurantsAndRatings> getRestaurantList(){
		List<RestaurantsAndRatings> restaurantsAndRatingsList = new ArrayList<RestaurantsAndRatings>();
		CustReviewDao custReviewDAO = new CustReviewDao();
		restaurantsAndRatingsList = custReviewDAO.getRestaurantsAndRatings();
		return restaurantsAndRatingsList;
	}
	
	public int insertReview(CustReview cr) {
		CustReviewDao crd = new CustReviewDao();
		int i;
		i = crd.insertReview(cr);
		return i;
		
	}
}

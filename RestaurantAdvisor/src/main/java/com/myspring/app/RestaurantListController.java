package com.myspring.app;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.app.model.Restaurant;
import com.myspring.app.model.RestaurantsAndRatings;
import com.myspring.app.service.CustReviewService;
import com.myspring.app.service.RestaurantService;

@Controller
public class RestaurantListController {

	private static final Logger logger = LoggerFactory.getLogger(RestaurantListController.class);
	
//	@RequestMapping(value = "displayRestaurant", params = "restaurant")
//	public String displayRestaurant(@RequestParam("restaurant") Restaurant restaurant) {
////		Restaurant restaurant = new Restaurant();
////		model.addAttribute("restaurant",restaurant);
//		String temp = restaurant.getRname();
//		logger.info("In RestaurantListController - going to displayrestaurant for " + temp);
//		return "displayrestaurant" + "?restaurant=temp";
//	}
	
	@RequestMapping(value = "displayRestaurant", method = RequestMethod.GET)
	public String displayRestaurant(@RequestParam("restid") String restid, Model model) {
		logger.info("In RestaurantListController - going to displayrestaurant for " + restid);
		Restaurant restaurant = new Restaurant();
		RestaurantService rs = new RestaurantService();
		restaurant = rs.getOneRestaurant(restid);
		if(restaurant.getStreetno() == null && restaurant.getStreetname() == null && restaurant.getCity() == null)
		{
			restaurant.setStreetno("No address available");
			restaurant.setStreetname("");
			restaurant.setCity("");
			restaurant.setState("");
		}
		if(restaurant.getEmail() == null)
		{
			restaurant.setEmail("No email available");
		}
		if(restaurant.getHours() == null)
		{
			restaurant.setHours("No hours available");
		}
		if(restaurant.getPricerange() == null)
		{
			restaurant.setHours("No price range available");
		}	
		if(restaurant.getOutdoorseatingflag() == "Y")
		{
			restaurant.setOutdoorseatingflag("Outdoor seating available");
		}
		else
		{
			restaurant.setOutdoorseatingflag("No outdoor seating available");
		}
		if(restaurant.getDeliveryflag() == "Y")
		{
			restaurant.setDeliveryflag("Does delivery");
		}
		else
		{
			restaurant.setDeliveryflag("Does not deliver");
		}
		model.addAttribute("restaurantinfo",restaurant);
		return "displayrestaurant";
	}
}

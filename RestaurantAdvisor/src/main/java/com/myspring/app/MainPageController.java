package com.myspring.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.app.model.CustReview;
import com.myspring.app.model.Restaurant;
import com.myspring.app.model.RestaurantCustomer;
import com.myspring.app.model.RestaurantsAndRatings;
import com.myspring.app.service.CustReviewService;
import com.myspring.app.service.RestaurantService;
/**
 * Handles requests for the application home page.
*/
@Controller
public class MainPageController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "mainPage", method = RequestMethod.GET)
	public String mainPage(Model model) {
		logger.info("In MainPageController - going to mainpage");
		return "mainpage";
	}
	
	/**
	 * Simply selects the restaurantlist view to render by returning its name.
	 */
//	@RequestMapping(value = "restaurantList", method = RequestMethod.GET)
//	public String restaurantList(Model model) {
//		logger.info("In MainPageController - going to restaurantlist");
//		return "restaurantlist";
//	}
	
	@RequestMapping(value = "/getRestaurantList")
	public ModelAndView getRestaurants() {
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		RestaurantService rs = new RestaurantService();
		restaurantList = rs.getRestaurantList();
		return new ModelAndView("restaurantlist", "restaurant", restaurantList);
	}
	
	@RequestMapping(value = "/getRestaurantsAndRatings")
	public ModelAndView getRestaurantsAndRatings() {
		List<RestaurantsAndRatings> restaurantsAndRatingsList = new ArrayList<RestaurantsAndRatings>();
		CustReviewService crs = new CustReviewService();
		restaurantsAndRatingsList = crs.getRestaurantList();
		return new ModelAndView("reviews", "custreview", restaurantsAndRatingsList);
	}
}
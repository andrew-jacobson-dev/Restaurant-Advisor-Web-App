package com.myspring.app;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspring.app.model.RestaurantCustomer;
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
	@RequestMapping(value = "restaurantList", method = RequestMethod.GET)
	public String restaurantList(Model model) {
		logger.info("In MainPageController - going to restaurantlist");
		return "restaurantlist";
	}
}

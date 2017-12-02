package com.myspring.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspring.app.model.RestaurantCustomer;
import com.myspring.app.service.RestaurantCustomerService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	RestaurantCustomerService cs;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Restaurant Advisor System. The client locale is {}.", locale);
		RestaurantCustomer customer = new RestaurantCustomer();
		model.addAttribute("customer",customer);
		return "home";
	}
	
	
	@RequestMapping(value = "checkLogin", method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute("customer")RestaurantCustomer customer, Model model) {
		logger.info("Login Information : " + customer.getEmail() + ", " + customer.getPassword());
		String address;
		//RestaurantCustomerService cs = new RestaurantCustomerService();
		if (cs.checkRestaurantCustomer(customer.getEmail(), customer.getPassword())) {
			address = "mainpage";
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect Username or Password!", "Error", JOptionPane.ERROR_MESSAGE);			
			address = "home";
		}
		return address;
	}	
	
	
	@RequestMapping(value = "newSignIn", method = RequestMethod.GET)
	public String newSignIn(Model model) {
		RestaurantCustomer customer = new RestaurantCustomer();
		customer.setStreetname("State Street");
		customer.setCity("Milwaukee");
		customer.setState("WI");
		model.addAttribute("customer",customer);
		return "newsignin";
	}
	
	@RequestMapping(value = "addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer")RestaurantCustomer customer, Model model) {
		//CustomerService cs = new CustomerService();
		int i;
		i = cs.insertRestaurantCustomer(customer);
		if (i == 0) {
			JOptionPane.showMessageDialog(null, "Error adding customer information!", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return "home";
	}
	
	
	
}

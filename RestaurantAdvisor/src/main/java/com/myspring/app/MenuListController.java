package com.myspring.app;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspring.app.model.CustReview;
import com.myspring.app.model.Menu;
import com.myspring.app.model.ODetails;
import com.myspring.app.model.Order;
import com.myspring.app.service.MenuService;
import com.myspring.app.service.OrderService;

@Controller
public class MenuListController {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuListController.class);
	
 	@RequestMapping(value = "displayMenu", method = RequestMethod.GET)
	public String displayMenuItems(@RequestParam("restid") String restid, Model model, HttpSession session) {
		logger.info("In MenuListController - going to displaymenu for " + restid);
		List<Menu> menuItem = new ArrayList<Menu>();
		MenuService ms = new MenuService();
		menuItem = ms.getMenuItems(restid);
		model.addAttribute("menuitem",menuItem);
		ODetails odetails = new ODetails();
		model.addAttribute("odetails",odetails);
		return "displaymenu";
	}
	
	@RequestMapping(value = "placeOrder", method = RequestMethod.POST)
	public String placeOrder(@ModelAttribute("odetails")ODetails odetails, Model model, HttpSession session) {
		//Get user email and current restaurant
		String custemail = (String)session.getAttribute("current_user_email");
		Integer restid = (Integer)session.getAttribute("cust_review_restid");
//		odetails.setRestid(restid);
		//Insert review and go back to main page
		int i = 1;
		OrderService os = new OrderService();
//		i = os.insertOrder(odetails);
		if (i == 0) {
			JOptionPane.showMessageDialog(null, "Cannot place order!", "Error", JOptionPane.ERROR_MESSAGE);	
		}
		
		return "mainpage";
	}	
	
}

package com.myspring.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
import com.myspring.app.service.CustReviewService;

@Controller
public class ReviewListController {
	
	private static final Logger logger = LoggerFactory.getLogger(ReviewListController.class);
	
 	@RequestMapping(value = "displayReviews", method = RequestMethod.GET)
	public String displayRestaurant(@RequestParam("restid") Integer restid, Model model, HttpSession session) {
		logger.info("In ReviewListController - going to displayreviews for " + restid);
		List<CustReview> custreview = new ArrayList<CustReview>();
		CustReviewService crs = new CustReviewService();
		custreview = crs.getReviewList(restid);
		model.addAttribute("reviewinfo",custreview);
		
		CustReview custreview2 = new CustReview();
		model.addAttribute("custreview",custreview2);
		
		session.setAttribute("cust_review_restid", restid);
		return "displayreviews";
	}
	
	@RequestMapping(value = "addReview", method = RequestMethod.POST)
	public String addReview(@ModelAttribute("custreview")CustReview custreview, Model model, HttpSession session) {
		logger.info("Review information : " + custreview.getReviewtitle() + ", " + custreview.getReviewdescr());
		if(custreview.getRating() == null) {
			JOptionPane.showMessageDialog(null, "Fill out rating", "Error", JOptionPane.ERROR_MESSAGE);
			return "mainpage";
		}
		if(custreview.getReviewtitle() == null) {
			JOptionPane.showMessageDialog(null, "Add a title", "Error", JOptionPane.ERROR_MESSAGE);
			return "mainpage";
		}
		//Get user email and current restaurant
		String custemail = (String)session.getAttribute("current_user_email");
		Integer restid = (Integer)session.getAttribute("cust_review_restid");
		custreview.setCustemail(custemail);
		custreview.setRestid(restid);
		//Insert review and go back to main page
		int i;
		CustReviewService crs = new CustReviewService();
		i = crs.insertReview(custreview);
		if (i == 0) {
			JOptionPane.showMessageDialog(null, "Cannot add review!", "Error", JOptionPane.ERROR_MESSAGE);	
		}
		
		return "mainpage";
	}	
	
}

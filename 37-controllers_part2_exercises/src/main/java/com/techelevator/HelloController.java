package com.techelevator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {
	
	@Autowired
	ReviewDao reviewDao;
	
	@RequestMapping(path="/", method= RequestMethod.GET)
	public String displayhomePage(ModelMap modelHolder) {
		
		return "allReviews";
	}


	@RequestMapping("/greeting")
	public String displayGreeting() {
		
		return "greeting";
	}
	
	@RequestMapping(path="/allReviews", method= RequestMethod.GET)
	public String displaymainHomePage(ModelMap modelHolder) {
			List<Review> reviews= reviewDao.getAllReviews();
			modelHolder.put("allReviews", reviews);
		
		return "allReviews";
	}
	@RequestMapping(path="/newReview", method=RequestMethod.GET)
	public String newReviewInput(ModelMap modelHolder) {
		if(! modelHolder.containsAttribute("review")){
			modelHolder.put("review", new Review());
		}
		
		return "newReview";
	}
	
	@RequestMapping(path="/newReview", method=RequestMethod.POST)
	public String saveReview(@RequestParam String username,
	@RequestParam int rating,
	@RequestParam String reviewTitle,
	@RequestParam String reviewText) throws FileNotFoundException, IOException {

	    Review review = new Review();
	    review.setUsername(username);
	    review.setRating(rating);
	    review.setTitle(reviewTitle);
	    review.setText(reviewText);
	    review.setDateSubmitted(LocalDateTime.now());
	    reviewDao.save(review);
	return "redirect:/thankYou";
	}
	
	@RequestMapping("/thankYou")
	public String displayThankYou() {
		
		return "thankYou";
	}
	
	
	
}

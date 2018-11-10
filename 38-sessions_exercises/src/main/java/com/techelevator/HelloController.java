package com.techelevator;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/favoriteThings")
@SessionAttributes("yourFavorite")
public class HelloController {
	
	

	@RequestMapping({"/","/greeting"})
	public String displayGreeting() {
		
		return "greeting";
	}
	
	@RequestMapping(path="/page1", method=RequestMethod.GET)
	public String displayPage1() {
		return "page1";
	}
	@RequestMapping(path="/page1", method=RequestMethod.POST)
	public String processFavoriteColor(@RequestParam String favoriteColor, ModelMap model) {

	    FavoriteThings favorite = new FavoriteThings();
	    favorite.setFavoriteColor(favoriteColor);
	    
	    model.addAttribute("yourFavorite", favorite);
	    return "redirect:/favoriteThings/page2";
	}
	
	@RequestMapping(path="/page2", method=RequestMethod.GET)
	public String displayPage2() {
		return "page2";
	}
	@RequestMapping(path= "/page2", method=RequestMethod.POST)
	public String processFavoriteFood(@RequestParam String favoriteFood, ModelMap model) {

	    FavoriteThings favorite = (FavoriteThings)model.get("yourFavorite");
	    favorite.setFavoriteFood(favoriteFood);
	    
	    model.addAttribute("favoriteThings", favorite);
	    
	    return "redirect:/favoriteThings/page3";
	}
	
	@RequestMapping(path="/page3", method=RequestMethod.GET)
	public String displayPage3() {
		return "page3";
	}
	
	@RequestMapping(path="/page3", method=RequestMethod.POST)
	public String processFavoriteSeason(@RequestParam String favoriteSeason, ModelMap model) {

	    FavoriteThings favorite = (FavoriteThings)model.get("yourFavorite");
	    favorite.setFavoriteSeason(favoriteSeason);
	    
	    // model.addAttribute("favoriteThings", favorite);
	    return "redirect:/favoriteThings/summary";
	}
	
	@RequestMapping(path="/summary", method=RequestMethod.GET)
	public String displaysummaryPage() {
		return "summary";
	}
	
	
}

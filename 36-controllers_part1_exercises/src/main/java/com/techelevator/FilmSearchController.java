package com.techelevator;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    private FilmDao filmDao;
    
    public void filmController(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    @RequestMapping("/film")
    public String showFilmSearchForm() {
        return "filmList";
    }
    @RequestMapping("/filmList")
    public String searchFilms(HttpServletRequest request) {
    	try{ int maxLength = Integer.parseInt(request.getParameter("maxLength"));
    	
    	int minLength = Integer.parseInt(request.getParameter("minLength"));
    	
    	String genre = request.getParameter("genre");
    	
        request.setAttribute("film", filmDao.getFilmsBetween(genre, minLength, maxLength));
        return "filmList";
    
    	}
		catch (Exception e){
			return "filmList";
	}
    }
    
}
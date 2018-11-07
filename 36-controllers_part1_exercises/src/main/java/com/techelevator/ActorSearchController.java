package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.JDBCActorDao;
import com.techelevator.dao.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;
	
	public void ActorController(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

	/* What request mapping do we want here */
	@RequestMapping("/")
	public String showSearchActorForm() {
		return "actorList";
	}

	/* What about here? */
	@RequestMapping("/actorList")
	public String searchActors(HttpServletRequest request) {
        String name = request.getParameter("name");
        request.setAttribute("actors", actorDao.getMatchingActors(name));
        return "actorList";
    }
	
}

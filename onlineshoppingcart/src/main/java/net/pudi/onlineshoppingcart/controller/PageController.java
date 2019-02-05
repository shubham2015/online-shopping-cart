package net.pudi.onlineshoppingcart.controller;

import java.util.logging.Logger;

//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import net.kzn.shoppingbackend.dao.CategoryDAO;
//import net.kzn.shoppingbackend.dao.ProductDAO;

/*
 * Front Controller
 * Controller class which handles all the urls and will send the 
 * request to a prticular controller and return back the view 
 */

/*@Controller
public class PageController {
@RequestMapping(value = {"/", "/home", "/index"})
public ModelAndView index() {
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title", "Welcome to online shopping cart");
	mv.addObject("userClickHome",true);
	return mv;
}

@RequestMapping(value = "/about")
public ModelAndView about()
{
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","About Us");
	mv.addObject("UserClickAbout",true);
	System.out.println("im in about");
	return mv;
}
@RequestMapping(value = "/contact")
public ModelAndView contact()
{
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","Contact Details");
	mv.addObject("UserClickContact",true);
	return mv;
}
}*/

@Controller
public class PageController {
	
	//private static final Logger logger = LoggerFactory.getLogger(PageController.class);
	
	//@Autowired
	//private CategoryDAO categoryDAO;
	
//	@Autowired
	//private ProductDAO productDAO;
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","about");
		mv.addObject("userClickAbout",true);
		return mv;				
	}	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(@RequestParam(name="logout",required=false)String logout) {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Home");
		
		//logger.info("Inside PageController index method - INFO");
		//logger.debug("Inside PageController index method - DEBUG");
		
		//passing the list of categories
		//mv.addObject("categories", categoryDAO.list());
		
		
		if(logout!=null) {
			mv.addObject("message", "You have successfully logged out!");			
		}
		
		mv.addObject("userClickHome",true);
		return mv;				
	}
	
	
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","contact");
		mv.addObject("userClickContact",true);
		return mv;				
	}	
	
}

package net.pudi.onlineshoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * Front Controller
 * Controller class which handles all the urls and will send the 
 * request to a prticular controller and return back the view 
 */

@Controller
public class PageController {
@RequestMapping(value = {"/", "/home", "/index"})
public ModelAndView index() {
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("greeting", "Welcome to online shopping cart");
	return mv;
}
@RequestMapping(value = {"/test/{greeting}"})
public ModelAndView test(@PathVariable("greeting")String greeting)
{
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("greeting", greeting);
	return mv;
	
}
	
}

package net.pudi.onlineshoppingcart.controller;

//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.pudi.onlineshoppingbackend.dao.CategoryDAO;
import net.pudi.onlineshoppingbackend.dao.ProductDAO;
import net.pudi.onlineshoppingbackend.dto.Category;
import net.pudi.onlineshoppingbackend.dto.Product;



/*
 * Front Controller
 * Controller class which handles all the urls and will send the 
 * request to a particular controller and return back the view 
 * 
 * @Controller is added to specify that the class is a front controller and its going to handle the user requests
 */



@Controller
public class PageController {
	
	//private static final Logger logger = LoggerFactory.getLogger(PageController.class);
	/*
	 * Here we are autowiring an CategoryDAO interface object, So Spring will look for classes which has implemented the CategoryDAO
	 * class which is CategoryDAOImpl and it handles the CategoryDAOImpl object and handles it. It will inject that class into this class
	 * and lets us use CategoryDAOImpl object named as categoryDAO and uses those functions
	 */
	@Autowired
	private CategoryDAO categoryDAO;
	@Autowired
	private ProductDAO productDAO;
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(@RequestParam(name="logout",required=false)String logout) {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Home");
		
		//logger.info("Inside PageController index method - INFO");
		//logger.debug("Inside PageController index method - DEBUG");
		
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		
		if(logout!=null) {
			mv.addObject("message", "You have successfully logged out!");			
		}
		
		mv.addObject("userClickHome",true);
		return mv;				
	}
	@RequestMapping(value = "/about")
	public ModelAndView about() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;				
	}
	/*
	 * Methods to load all the products and we are sending request to listProducts.jsp
	 */
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts()
	{
		System.out.println("i m inside all product");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Products");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	//Single product display
	@RequestMapping(value="/show/{id}/product")
	public ModelAndView ShowSingleProduct(@PathVariable("id") int id)
	{
		System.out.println("i m inside sinle product");
		Product product = null;
	    product = productDAO.get(id);
		ModelAndView mv = new ModelAndView("page");
        mv.addObject("title",product.getName());
    	mv.addObject("product",product);
		mv.addObject("userClickShowProduct",true);
		System.out.println("name");
	    System.out.println(product.getName());
		return mv;
	}
	/*
	 * Method to send only list of the category clicked
	 */
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		
		//categoryDAO to fetch a single category
		Category category = null; 
		category = categoryDAO.get(id);
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title",category.getName());
		//Passing the list of the category clicked by calling up the name. The value name is categories
		mv.addObject("categories",categoryDAO.list());
		//Passign the single category
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts",true);
		return mv	;
	}
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;				
	}	
	
	
	
}

package net.pudi.onlineshoppingcart.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.pudi.onlineshoppingbackend.dao.CategoryDAO;
import net.pudi.onlineshoppingbackend.dto.Category;
public class sample {
	

	
	


	
	private static AnnotationConfigApplicationContext context;
		
		private static CategoryDAO categoryDAO;
		
		private Category category;
		
		
		public static void init()
		{
			context = new AnnotationConfigApplicationContext();
			context.scan("net.pudi.onlineshoppingcart.config");
			context.scan("net.pudi.onlineshoppingbackend.daoimpl");
			context.scan("net.pudi.onlineshoppingbackend.dao");
			context.scan("net.pudi.onlineshoppingbackend.dto");
			context.scan("net.pudi.onlineshoppingcart.controller");
			context.refresh();
			
			categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		}
		
		
		public void testAddCategory()
		{
			category = new Category();
			category.setId(6);
			category.setName("television");
			category.setImage("televison.jpg");
			category.setDescription("This is television");
			if(categoryDAO.add(category))
				System.out.println("true");
			else
				System.out.println("false");
		}
	
     public static void main(String[] args) {
		
    sample s = new sample();
    s.testAddCategory();
	}

}

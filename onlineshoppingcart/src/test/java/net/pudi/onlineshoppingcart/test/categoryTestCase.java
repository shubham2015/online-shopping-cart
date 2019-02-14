package net.pudi.onlineshoppingcart.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.pudi.onlineshoppingbackend.dao.CategoryDAO;
import net.pudi.onlineshoppingbackend.dto.Category;

public class categoryTestCase {

private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
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
	
	@Test
	public void testAddCategory()
	{
		category = new Category();
		category.setId(56);
		category.setName("television");
		category.setImage("televison.jpg");
		category.setDescription("This is television");
		assertEquals("Succefull add",true,categoryDAO.add(category));
	}
	
	@Test
	public void testDeletedCategory(Category category)
	{
	   
		assertEquals("Succefull delete",true,categoryDAO.delete(category));
	}
}




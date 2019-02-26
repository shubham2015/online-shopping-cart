package net.pudi.onlineshoppingcart.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
		//categoryDAO is the interface name and so the when ApplicationContext scans over it, it actually creates objects of the classes which implements it 
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	/*@Test
	public void testAddCategory()
	{
		category = new Category();
		category.setId(56);
		category.setName("television");
		category.setImage("televison.jpg");
		category.setDescription("This is television");
		assertEquals("Succefull add",true,categoryDAO.add(category));
	}
	*/
	/*@Test
	public void testDeletedCategory(Category category)
	{
	   
		assertEquals("Succefull delete",true,categoryDAO.delete(category));
	}*/
	
	/*@Test
	public void testGetCategory()
	{
		category = categoryDAO.get(2);
		assertEquals("succeful match",categoryDAO.get(2).getName(),category.getName());
	}
	*/
	/*@Test
	public void testUpdateCategory()
	{
		category= categoryDAO.get(4);
		category.setName("booking");
		assertEquals("Succesfull update",true,categoryDAO.update(category));
	}*/
	
	/*@Test
	public void testDeleteCategory()
	{
		category = categoryDAO.get(2);
	   assertEquals("Succefull delete",true,categoryDAO.delete(category));
	}*/
	
	@Test
	public void testLists()
	{
		List<Category> cc = new ArrayList<>();
		cc = categoryDAO.list();
		System.out.println(cc.size());
		assertEquals("all lists",3,cc.size());
	}
}




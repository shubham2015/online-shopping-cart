package net.pudi.onlineshoppingcart.test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.pudi.onlineshoppingbackend.dao.ProductDAO;
import net.pudi.onlineshoppingbackend.dto.Product;

public class productTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static ProductDAO productDAO;
	
	
	private Product product;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.pudi.onlineshoppingcart.config");
		context.scan("net.pudi.onlineshoppingbackend.daoimpl");
		context.scan("net.pudi.onlineshoppingbackend.dao");
		context.scan("net.pudi.onlineshoppingbackend.dto");
		context.scan("net.pudi.onlineshoppingcart.controller");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
	@Test
	public void testListActiveProducts() {
		assertEquals("Something went wrong while fetching the list of products!",
				5,productDAO.listActiveProducts().size());				
	} 
	
	
	/*@Test
	public void testListActiveProductsBy`() {
		assertEquals("Something went wrong while fetching the list of products!",
				3,productDAO.listActiveProductsByproduct(3).size());
		assertEquals("Something went wrong while fetching the list of products!",
				2,productDAO.listActiveProductsByproduct(1).size());
	} 
	*/
	/*@Test
	public void testAdd()
	{
		product = new Product();
		//product.setId(56);
		product.setName("Oppo Selfie S53");
		product.setBrand("Oppo");
		product.setDescription("This is some description for oppo mobile phones!");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		
		//assertEquals("Something went wrong while inserting a new product!",
				//true,productDAO.add(product));		
		assertEquals("Succefull add",true,productDAO.add(product));
	}*/
	/*@Test
	public void testDelete()
	{
		assertEquals("Succeffull delete",true,productDAO.delete(product));
	}*/
		
	/*@Test
	public void getp()
	{
		product = productDAO.get(3);
		assertEquals("successful match","Google Pixel",product.getName());
	}*/
	
	/*@Test
	public void testList()
	{
		System.out.println("Stratin");
		List<Product> ccj = new ArrayList<>();
		ccj = productDAO.list();
		System.out.println(ccj.size());
		assertEquals("all lists",5,ccj.size());
	}*/
	} 
	
	
	
		


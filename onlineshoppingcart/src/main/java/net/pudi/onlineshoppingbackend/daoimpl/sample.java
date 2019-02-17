package net.pudi.onlineshoppingbackend.daoimpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.pudi.onlineshoppingbackend.dao.ProductDAO;
import net.pudi.onlineshoppingbackend.dto.Product;

public class sample {

	private static AnnotationConfigApplicationContext context;
	
	
	private static ProductDAO productDAO;
	
	
	private static Product product;
	
	public static void main(String[] args)

	
	{
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.pudi.onlineshoppingcart.config");
		context.scan("net.pudi.onlineshoppingbackend.daoimpl");
		context.scan("net.pudi.onlineshoppingbackend.dao");
		context.scan("net.pudi.onlineshoppingbackend.dto");
		context.scan("net.pudi.onlineshoppingcart.controller");
		context.refresh();
		System.out.println("ikkada");
		productDAO = (ProductDAO)context.getBean("productDAO");
		System.out.println("ikkada");
		product = productDAO.get(3);
		System.out.println("ikkada");
		//assertEquals("successful match","Google Pixel",product.getName());
		System.out.println(product.getName().toString());
	}
}

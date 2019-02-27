package net.pudi.onlineshoppingcart.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.pudi.onlineshoppingbackend.dao.UserDAO;
import net.pudi.onlineshoppingbackend.dto.Address;
import net.pudi.onlineshoppingbackend.dto.Cart;
import net.pudi.onlineshoppingbackend.dto.User;

public class TestUser {


	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	private Cart cart = null;
	private Address address = null;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.pudi.onlineshoppingcart.config");
		context.scan("net.pudi.onlineshoppingbackend.daoimpl");
		context.scan("net.pudi.onlineshoppingbackend.dao");
		context.scan("net.pudi.onlineshoppingbackend.dto");
		context.scan("net.pudi.onlineshoppingcart.controller");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	@Test
    public void testAddUser() {
		
		
		user =userDAO.getByEmail("hr@gmail.com");
		System.out.println("Print");
		System.out.println(user.toString());
		assertEquals("s","Mumbai",userDAO.getBillingAddress(user).getCity());
		/*user = new User() ;
		user.setFirstName("Hrithiki");
		user.setLastName("Roshaniiii");
		user.setEmail("hr@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setPassword("12345");
		assertEquals("succes",true,userDAO.add(user));*/
		/*user = userDAO.getByEmail("hr@gmail.com");
		address = new Address();
		address.setAddressLineOne("101/B Jadoopi Society, Krissh Nagar");
		address.setAddressLineTwo("Near Kaabil Store");
		address.setCity("Mumbai");
		address.setState("Mra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setBilling(true);
		address.setUser(user);
		assertEquals("succ in shipping addess",true,userDAO.addAddress(address));*/
		/*assertEquals("succ in addess",true,userDAO.addAddress(address));
		address = new Address();
		address.setAddressLineOne("101/Bs Jadooc Socissety, Krissh Nagar");
		address.setAddressLineTwo("Near Kaabils Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setShipping(true);
		address.setUser(user);
		assertEquals("succ in shipping addess",true,userDAO.addAddress(address));
		if(user.getRole().equals("USER"))
		{

			cart = new Cart();
			cart.setUser(user);
			user.setCart(cart);
			
			// add the user
			assertEquals("Failed to add the cart!", true, userDAO.add(user));	
			// add the address
			//assertEquals("Failed to add the billing address!", true, userDAO.addAddress(address));
		}*/
	}
	
	/*@Test
	public void testUpdateCart() {
		user = userDAO.getByEmail("hr@gmail.com");
		//user = userDAO.get(1);
		cart = user.getCart();
		cart.setGrandTotal(10000);
		cart.setCartLines(1);
		//assertEquals("Failed to update the cart!", true, userDAO.updateCart(cart));			
	} */
}

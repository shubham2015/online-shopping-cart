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
	private User user;
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
		
		/*user = new User();
		user = userDAO.getById(5);
		
		*/
		//System.out.println(user.toString());
		//assertEquals("succes",1,user.getId());
		/*user = new User();
		
		user.setFirstName("pudi");
		user.setLastName("gggii");
		user.setEmail("hr@gmailh.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setPassword("12345");
		System.out.println(user.toString());
		assertEquals("succes",true,userDAO.add(user));*/
		//user = new User();
		//user = userDAO.getByEmail("pudi.subham@gmail.com");
		
		/*address = new Address();
		address = userDAO.getBillingAddress(5);
		System.out.println(address.toString());*/
		/*address.setAddressLineOne("PArk Street");
		address.setAddressLineTwo("Near Kaabbubsuisbbil Store");
		address.setCity("Mumbai");
		address.setState("Mrain");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setBilling(true);
		address.setUserId(user.getId());
		System.out.println(address.toString());*/
		/*for(Address a:userDAO.getBillingAddress(5))
		{
			System.out.println(a.toString());
		}*/
		//assertEquals("succ in shipping addess",1,userDAO.listShippingAddresses(10).size());
		
		//assertEquals("Mumbai",userDAO.getBillingAddress(user.getId()).getCity());
		//System.out.println("Print");
		//
	
		user = new User() ;
		user = userDAO.getByFirst("e");
		System.out.println(user.toString());
		System.out.println(user.getId());
		assertEquals("succ in shipping addess",47,user.getId());
		/*user.setFirstName("Hrithiki");
		user.setLastName("Roshaniiii");
		user.setEmail("hr@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setPassword("12345");
		assertEquals("succes",true,userDAO.add(user));
		System.out.println(user.toString());
		//user = userDAO.getByEmail("hr@gmail.com");
		address = new Address();
		address.setAddressLineOne("101/B Jadoopi Society, Krissh Nagar");
		address.setAddressLineTwo("Near Kaabil Store");
		address.setCity("Mumbai");
		address.setState("Mra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setBilling(true);
		
		address.setUserId(20);
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


/*
 * 
 * This handle will provide the Register Model object to the flow 
 */
package net.pudi.onlineshopping.handler;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.pudi.onlineshopping.model.RegisterModel;
import net.pudi.onlineshoppingbackend.dao.UserDAO;
import net.pudi.onlineshoppingbackend.dto.Address;
import net.pudi.onlineshoppingbackend.dto.Cart;
import net.pudi.onlineshoppingbackend.dto.User;

@Component
public class RegisterHandler implements Serializable{
    @Autowired
	private UserDAO userDAO;
    
	private static final long serialVersionUID = 1L;
	public String saving(RegisterModel registerModel) 
	{
		  String transitionValue = "success";
		  User user = registerModel.getUser();
		  if(user.getRole().equals("USER")) {
		   // create a new cart
		   Cart cart = new Cart();
		   cart.setUser(user);
		   user.setCart(cart);
		  }
		  System.out.println("snsiosnionk");
		  userDAO.add(user);
		  // save the billing address
		  Address billing = registerModel.getBilling();
		  billing.setUser(user);
		  billing.setBilling(true);  
		  userDAO.addAddress(billing);
		  return transitionValue;
		  
    } 
	public RegisterModel init()
	{
		System.out.println("bbb");
		return new RegisterModel();
	}
	public void addUser(RegisterModel registerModel, User user) {
		registerModel.setUser(user);
	}
	public void addBilling(RegisterModel registerModel, Address billing) {
		registerModel.setBilling(billing);
	}
	public void sss()
	{
		System.out.println("Test");
	}
	
	
}



/*
 * 
 * This handle will provide the Register Model object to the flow 
 */
package net.pudi.onlineshopping.handler;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.binding.message.MessageResolver;
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
	public String validateUser(User user, MessageContext error)
	{
		String transitionValue = "success";
		if(!(user.getPassword().equals(user.getConfirmPassword())))
		{
			error.addMessage(new MessageBuilder().error().source("confirmPassword").defaultText("Password doesn't match").build());
			transitionValue = "failure";
		}
		if(userDAO.getByFirst(user.getFirstName())!=null)
		{
			error.addMessage(new MessageBuilder().error().source("firstName").defaultText("User name already exists").build());

			transitionValue = "failure";
		}
		return transitionValue;
	}
	public String saveAll(RegisterModel registerModel) 
	{
	
		  String transitionValue = "success";
		  User user = registerModel.getUser();
		  
		   // create a new cart
		  Cart cart = new Cart();
		  cart.setUser(user);
		  user.setCart(cart);
		  
		  System.out.println("updates sss");
		  userDAO.add(user);
		 System.out.println(user.toString());
		  Address billing = registerModel.getBilling();
		  System.out.println(user.getFirstName());
		  user = userDAO.getByFirst(user.getFirstName());
		  System.out.println(user.toString());
		  billing.setUserId(user.getId());
          billing.setBilling(true);  
		  userDAO.addAddress(billing);
		  System.out.println("mujhe");
		  System.out.println(billing.toString());
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
	
	
	
}


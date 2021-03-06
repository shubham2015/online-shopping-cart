package net.pudi.onlineshoppingbackend.dao;

import java.util.List;

import net.pudi.onlineshoppingbackend.dto.Address;
import net.pudi.onlineshoppingbackend.dto.User;


public interface UserDAO {

	// user related operation
	User getByEmail(String email);
	User get(int id);

	boolean add(User user);
	
	// adding and updating a new address
	Address getAddress(int addressId);
	boolean addAddress(Address address);
	boolean updateAddress(Address address);
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	//Address getBillingAddress(User user);
	//List<Address> listShippingAddresses(User user);
	User getById(int id);
	User getByFirst(String firstname);
	

	
}

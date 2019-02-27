
/*
 * Basically this is responsible to save a user to DB w.r.t. address and user details
 */
package net.pudi.onlineshopping.model;

import java.io.Serializable;

import net.pudi.onlineshoppingbackend.dto.Address;
import net.pudi.onlineshoppingbackend.dto.User;

public class RegisterModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private User user;
	private Address billing;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getBilling() {
		return billing;
	}
	public void setBilling(Address billing) {
		this.billing = billing;
	}
}

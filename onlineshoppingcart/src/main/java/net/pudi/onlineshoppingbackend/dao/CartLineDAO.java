package net.pudi.onlineshoppingbackend.dao;

import java.util.List;

import net.pudi.onlineshoppingbackend.dto.Cart;
import net.pudi.onlineshoppingbackend.dto.CartLine;
import net.pudi.onlineshoppingbackend.dto.OrderDetail;


public interface CartLineDAO {

	public List<CartLine> list(int cartId);
	public CartLine get(int id);	
	public boolean add(CartLine cartLine);
	public boolean update(CartLine cartLine);
	public boolean remove(CartLine cartLine);
	
	// fetch the CartLine based on cartId and productId
	public CartLine getByCartAndProduct(int cartId, int productId);		
		
	// updating the cart
	boolean updateCart(Cart cart);
	
	// list of available cartLine
	public List<CartLine> listAvailable(int cartId);
	
	// adding order details
	boolean addOrderDetail(OrderDetail orderDetail);

	
}


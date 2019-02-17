package net.pudi.onlineshoppingbackend.dao;

import java.util.List;

import net.pudi.onlineshoppingbackend.dto.Product;


public interface ProductDAO {

	Product get(int productId);
	boolean add(Product product);
	boolean delete(Product product);
	boolean update(Product product);
	List<Product> list();
   List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);	
	List<Product> getProductsByParam(String param, int count);
}

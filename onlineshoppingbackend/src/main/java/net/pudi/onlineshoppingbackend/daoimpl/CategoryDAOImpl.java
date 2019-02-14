package net.pudi.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import net.pudi.onlineshoppingbackend.dao.CategoryDAO;
import net.pudi.onlineshoppingbackend.dto.Category;

//MArk the class that it is going to fulfil the requirements of the Data Access
//and managed by spring

@Service
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("phone");
		category.setDescription("This is phone");
		category.setImage("phone.png");
		
		categories.add(category);
		category = new Category();
		category.setId(12);
		category.setName("iphone");
		category.setDescription("This is iphone");
		category.setImage("iphone.png");
		
		categories.add(category);
		
	}
	
	
	
	@Override
	public List<Category> list() {
		
		
		// TODO Auto-generated method stub
		return categories;
	}

}

package net.pudi.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.pudi.onlineshoppingbackend.dao.CategoryDAO;
import net.pudi.onlineshoppingbackend.dto.Category;

//MArk the class that it is going to fulfil the requirements of the Data Access
//and managed by spring


@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private static List<Category> categories = new ArrayList<>();
	/*static {
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
	*/
	
	
	@Override
	public List<Category> list() {
		
		
		// TODO Auto-generated method stub
		return categories;
	}
	public Category get(int id)
	{
		for(Category c:categories)
		{
			if(c.getId() == id)
			{
				return c;
			}
		}
		return null;
	}
    public List<Category> specificList(int id)
    {
    	
    	
    	return null;
    }
    @Override
    
    public boolean add(Category category) {

		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().merge(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}
    public boolean delete(Category category)
    {
    	try
    	{
    		
    	}
    }

}

package net.pudi.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
	
	//private static List<Category> categories = new ArrayList<>();

	
	
	@Override
	public List<Category> list() {
		
		String ql = "FROM Category c where c.active = true";
		Query query = sessionFactory.getCurrentSession().createQuery(ql);
		return query.getResultList();
	}
	@Override
	public Category get(int id)
	{
		return sessionFactory.getCurrentSession().get(Category.class,Integer.valueOf(id));
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
    
    @Override
    public boolean update(Category category)
    {
    	try {
			// update the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
    }
    @Override
    public boolean delete(Category category)
    {
    	category.setActive(false);
    	try {
			// update the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
    }
   
}

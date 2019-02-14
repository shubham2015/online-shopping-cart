package net.pudi.onlineshoppingbackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.pudi.onlineshoppingbackend.dto.Category;


public interface CategoryDAO {

	boolean add(Category category);
	boolean delete(Category category);
	List<Category> list();
	Category get(int i);
	List<Category> specificList(int j);
}

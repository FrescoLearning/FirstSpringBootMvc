package com.fresco.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fresco.course.entity.Category;

@Service
public class FrescoService {
	
	//------------------- Member Variable ----------------------------------
	
	private List<Category> categories = new ArrayList<>();
	
	//----------------------------------------------------------------------
	
	
	public Category addCategory(Category category) {
		categories.add(category);
		return category;
	}
	
	public List<Category> getCategories() {
		return this.categories;
	}

}

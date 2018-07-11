package com.fresco.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fresco.course.entity.Category;

@RestController
public class FrescoController {
	
	@Autowired
	FrescoService frescoService;
	
	
	@RequestMapping(value="/category")
	public ResponseEntity<List<Category>> getCategories(){
		
		return ResponseEntity.status(HttpStatus.OK).body(frescoService.getCategories());
		
	}

	@RequestMapping(value="/category", method=RequestMethod.POST)
	public ResponseEntity<Category> createCategory(@RequestBody Category category){
		
		return ResponseEntity.status(HttpStatus.OK).body(frescoService.addCategory(category));
		
	}
}

package com.fresco.course.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Component
@Getter
public class Category {
	
	private Integer id;
	private String name;
	private String description;

}

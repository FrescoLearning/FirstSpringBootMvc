package com.fresco.course.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Component
@Getter
public class Course {
	
	private Integer id;
	private Integer categoryId;
	private String name;
	private Integer duration;
	private Integer miles;
}

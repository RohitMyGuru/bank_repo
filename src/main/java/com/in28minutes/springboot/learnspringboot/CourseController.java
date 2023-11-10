package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	//JSON Formatter Chrome Extension (Install this in your browser to display formatted json)
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28minutes"),
				new Course(2, "Learn Devops", "in28minutes"),
				new Course(3, "Learn Azure", "in28minutes"),
				new Course(4, "Learn GCP", "in28minutes")
				);
	}

}

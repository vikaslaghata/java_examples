package com.java.other.java8;

import java.util.Arrays;
import java.util.List;

public class PrintCharInList {
	//Print the number of characters in each course name
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream().forEach(course->System.out.println(course.toCharArray().length));

	}

}

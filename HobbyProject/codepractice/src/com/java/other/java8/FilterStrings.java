package com.java.other.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStrings {
	
	/*
	 * Given a list of Strings, write a method that returns a list of all strings
	 * that start with the letter 'a' (lower case) and have exactly 3 letters. TIP:
	 * Use Java 8 Lambdas and Streams API's.
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("dfc","abc","fht","afe","agfh");
		
		List<String> outputList = list.stream()
		.filter(str->str.startsWith("a") && str.length()==3)
		.collect(Collectors.toList());
		
		System.out.println(outputList);
		
		CommaSeparatedList(list); // another question

		Integer[] empIds = { 1, 2, 3, 4 };

		/*Employee employee = Stream.of(empIds)
				.map(employeeRepository::findById)
				.filter(e -> e != null)
				.filter(e -> e.getSalary() > 100000)
				.findFirst()
				.orElse(null);*/
	}
	
	private static void CommaSeparatedList(List<String> list) {
		String output = list.stream().collect(Collectors.joining(","));
		System.out.println(output);
	}

}

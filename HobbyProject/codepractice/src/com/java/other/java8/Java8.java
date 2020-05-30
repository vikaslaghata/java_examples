package com.java.other.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Java8 {

	public static void main(String[] args) {
		doSomething(); //Square every number in a list and find the sum of squares
		
		filterEvenNumberFromList();		
	}
	
	private static void doSomething() {		
				List<Integer> courses = Arrays.asList(2,3,5);
				Integer result = courses.stream()
						.map(num->num*num)
						.reduce((a,b)->a+b) //reduce also has overloaded method  reduce(initialValue, (a,b)->a+b)
						.get();
				
				System.out.println(result);
	}	

	private static void filterEvenNumberFromList() {
		IntStream.range(1, 20)
		.filter(num -> num%2!=0)
		.forEach(System.out::println);		
	}

}

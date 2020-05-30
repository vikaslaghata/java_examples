package com.java.other.java8;

import java.util.stream.IntStream;

public class CubesofOddNumbers {

	public static void main(String[] args) {
		IntStream.range(1,15)
				.filter(elem->elem%2!=0)
				.map(elem->elem*elem*elem)
				.forEach(System.out::println);
				//.toArray(); // Collector doesn't work here but we can use box() method if Collectore need to use.		

	}

}

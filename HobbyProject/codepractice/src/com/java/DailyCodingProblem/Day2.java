package DailyCodingProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Day2 {
	/*
	Given an array of integers, return a new array such that each element at index i of the new array is 
			the product of all the numbers in the original array except the one at i.
			For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
			If our input was [3, 2, 1], the expected output would be [2, 3, 6].
			*/

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//List<Integer> output = new ArrayList<Integer>();
		
		//for(int i=0;i<list.size();i++) {
			//output.add(getProduct(list,i));			
		//}
		
		//System.out.println(output);
		
		//Better way:->
		Integer total = list.stream().reduce((a,b)->a*b).get();
		System.out.println(total);
		
		List<Integer> output = list.stream().map(elem->total/elem).collect(Collectors.toList());
		
		System.out.println(output);

	}

	/*
	 * private static Integer getProduct(List<Integer> list, int index) { int
	 * product = 1; for(int i=0;i<list.size();i++) { if(i!=index) { product
	 * *=list.get(i); } } return product; }
	 */

}

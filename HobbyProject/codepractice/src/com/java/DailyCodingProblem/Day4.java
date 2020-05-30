package DailyCodingProblem;

import java.io.IOException;
import java.util.Arrays;
import java.util.jar.JarException;

public class Day4 {
	/*
	Given an array of integers, find the first missing positive integer in linear time and constant space. 
	In other words, find the lowest positive integer that does not exist in the array. 
	The array can contain duplicates and negative numbers as well.
	For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
	*/
	public static void main(String[] args) {
		
		int[] list = {3,4,-1,1};
		int minimum = list[0];
		int output = 0;
		
		Arrays.parallelSort(list);
		for(int i=0;i< list.length;i++) {
			if(list[i]>1) {
				System.out.println(" output "+(list[i]-1));
				break;
			}			
		}		
	}

}

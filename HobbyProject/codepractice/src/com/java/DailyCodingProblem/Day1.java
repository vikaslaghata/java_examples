package DailyCodingProblem;

public class Day1 {
	/*
		Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
		For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
	*/

	public static void main(String[] args) {
		int[] array = {10, 15, 3, 7};
		int desiredNumber = 17;
		
		doProcessing(array, desiredNumber);
	}
	
	private static void doProcessing(int[] array, int desiredNumber) {
		if(array.length<2) {
			throw new RuntimeException("Array must have atleast 2 numbers");
		}
		
		for(int i=0;i<array.length;i++) { //TODO: Make it in one loop. https://www.geeksforgeeks.org/how-to-sort-an-array-in-a-single-loop/
			for(int j=i;j<array.length;j++) {
				if(array[i]+array[j] == desiredNumber) {
					System.out.println(array[i]+" and "+array[j]+" are the desired numbers");
					return;
				}
			}
		}
		
		System.out.println("False");
	}


}

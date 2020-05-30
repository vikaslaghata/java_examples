import java.util.Arrays;

public class BubbleAndSelectionSort {
	
	/*The inner loop is used to compare adjacent elements and the outer loop is used to perform Iteration. 
	because of using two loops, it results in an order of n^2 which is not great in terms of performance. 

	Read more: https://www.java67.com/2012/12/bubble-sort-in-java-program-to-sort-integer-array-example.html#ixzz6L5CVDRMq
		*/

	public static void main(String[] args) {
		//testing our bubble sort method in Java
        int[] unsorted = {32, 39,21, 45, 23, 3};
        //bubbleSort(unsorted);
        selectionSort(unsorted);

	}

	private static void bubbleSort(int[] unsorted) {
		/*
		 * for(int i=0;i<unsorted.length-1;i++) { for(int j=1;j<unsorted.length-i;j++) {
		 * if(unsorted[j-1] > unsorted[j]){ int temp = unsorted[j]; unsorted[j] =
		 * unsorted[j-1]; unsorted[j-1] = temp; } }
		 * System.out.printf("unsorted array after %d pass %s: %n", i+1,
		 * Arrays.toString(unsorted)); }
		 */
		
		for(int i=0;i<unsorted.length-1;i++) {
			for(int j=1;j<unsorted.length-1;j++) {
				if(unsorted[j] > unsorted[j+1]){
					int temp = unsorted[j];
	                unsorted[j] = unsorted[j+1];
	                unsorted[j+1] = temp;	
				}				
			}
			System.out.printf("unsorted array after %d pass %s: %n", i+1, Arrays.toString(unsorted));
		}
		
	}
	
	private static void selectionSort(int[] unsorted) {
	
		for(int i=0;i<unsorted.length-1;i++) {	
			for(int j=i;j<unsorted.length;j++) {
				if(unsorted[i] > unsorted[j]){
					int temp = unsorted[j];
	                unsorted[j] = unsorted[i];
	                unsorted[i] = temp;	
				}				
			}
			System.out.printf("unsorted array after %d pass %s: %n", i+1, Arrays.toString(unsorted));
		}
	}

}

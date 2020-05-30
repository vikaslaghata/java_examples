import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	//Function to search Number in Sorted Array
	/*
	In binary search, data must be already sorted out. After that instead of searching form front we start from middle element. 
	If middle element is greater than expected number than expected number is on left hand side of 
	middle element (lower array), otherwise it is on right hand side (higher array). So in each iteration we end up 
	reducing our problem set by half. So in start if you have 16 element in array, next iteration you only need to search 
	in 8 element and subsequently 4 and 2, this is how we get O(logN) complexity.
	*/
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		/*
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		for(Integer value:list) {
			if(value == 20 ) {
				list.remove(2); // delete index 2 will cause ConcurrentModificationException
			}
		}
		System.out.println("After delete "+list);
		*/
		
        int key = 30;  
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
	}

	public static int binarySearch(int arr[], int first, int last, int key){  
        if (last >= first){  
            int mid = first + (last - first)/2;
            
            if (arr[mid] == key){  
            	return mid;  
            }
            
            if (arr[mid] > key){  
            	return binarySearch(arr, first, mid-1, key);//search in left subarray  
            }else{  
            	return binarySearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    }  

}

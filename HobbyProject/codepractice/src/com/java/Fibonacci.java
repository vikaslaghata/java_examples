import java.util.Scanner;

public class Fibonacci {

	//0,1,1,2,3,5,8.....
	public static void main(String[] args) {		
	        int num, a = 0,b=0, c =1;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the number of times");
	        num = in.nextInt();
	        System.out.println("Fibonacci Series of the number is:");
	        for (int i=0; i<=num; i++) {
	            a = b;
	            b = c;
	            c = a+b;
	            System.out.println(a + "");
	        }
	}

}
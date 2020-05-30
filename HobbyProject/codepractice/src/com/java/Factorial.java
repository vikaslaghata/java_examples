
public class Factorial {

	public static void main(String[] args) {
		//factorial(3);
		factorialByRecurrsion(5);
	}

	private static void factorial(int num) {
		System.out.println("Starting");
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact *=i;
		}
		System.out.println("Done "+fact);
	}
	
	private static int factorialByRecurrsion(int num) {
		if(num==1) return 1;
		
		int fact = num*factorialByRecurrsion(num-1);
		
		System.out.println("Factorial by recursion is "+fact);
		return fact;
	}

}

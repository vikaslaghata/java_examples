
public class WhetherPrimeOrNot {

	private static boolean isPrime(int num) {
		for(int i=2;i<num;i++) { // Note num/2
			if(num%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("isPrime "+isPrime(4));
		
		System.out.println(largestPrimeFactor(15));

	}
	
	/** * @return largest prime factor of a number */ 
	//number is called prime factor if it is prime number and it can divide the number exactly. 
	public static int largestPrimeFactor(long number) {
		int i; 
		long copyOfInput = number; 
		for (i = 2; i <= copyOfInput; i++) 
		{
			if (copyOfInput % i == 0) 
			{ 
				copyOfInput = copyOfInput/ i; 
				i--; 
			} 
		} 
		return i; 
	}

}

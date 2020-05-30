
public class GreatestCommonDivisor {
	/*
	 * The Greatest Common Divisor of two positive integers is the largest integer
	 * that divides both without remainder. Write a method that returns the Greatest
	 * Common Divisor of p and q.
	 */
	

	public static void main(String[] args) {
	
		findGreatestCommonDivisor(15,25);
		System.out.println(gcd(15,25));
	}
	
	private static void findGreatestCommonDivisor(int num1, int num2){
		int min = Math.min(num1, num2);
		
		for(int i=min ;i> 1;i--) {
			if(num1%i==0 && num2%i==0) {
				System.out.println("output= "+i);
			}
		}
	}
	private static int gcd(int p, int q){
	
		if (q == 0) {
		    return p;
		}
		return gcd(q, p % q);
	}

}

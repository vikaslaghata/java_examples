
public class IfNumberIsPowerOfTwo {

	public static void main(String[] args) {
		 isPowerOfTwo(16);

	}
	public static boolean isPowerOfTwo(int n) {
		//System.out.println(Math.log(n));
		//System.out.println(Math.log(2));
		for(int i=1;i<n;i++) {
			if(Math.pow(2, i)==n) {
				System.out.println("it's a power of two");
			}
			//System.out.println(Math.pow(2, i));
		}
	    return n>0 && n==Math.pow(2, Math.round(Math.log(n)/Math.log(2)));  // better solution.
	}

}

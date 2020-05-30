
public class AddDigitsOfNumber {

	public static void main(String[] args) {
		int num = 12634;
		int sum =0;
		while(num%10!=0) {
			int rem = num%10;
			int dev = num/10;
			
			sum+=rem;			
			num = dev;
		}
		System.out.println(sum);

	}

}

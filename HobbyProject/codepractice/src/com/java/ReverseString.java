
public class ReverseString {
	
	private static String reverseString(String str) {
		StringBuilder builder = new StringBuilder(str);
		return builder.reverse().toString();
	}
	private static void customReverseString(String str) {
		char[] charArray = str.toCharArray();
		for(int i=(charArray.length-1);i>=0;i--) {
			System.out.println(charArray[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Program to reverse a string without using String inbuilt function.");
		customReverseString("ABC")	;
		

	}

}



public class PermutationOfString {

	public static void main(String[] args) {
		String str ="ABC";
		permutation(str);	

	}
	public static void permutation(String input)
	{ 
		permutation("", input); 
	}

	private static void permutation(String perm, String word) {
		
		if(word.isEmpty()) {
			System.out.println(perm+word);
		}
		
		for(int i=0;i<word.length();i++) {
			permutation(perm+word.charAt(i), word.substring(0,i)+word.substring(i+1, word.length()));
		}
	}

}

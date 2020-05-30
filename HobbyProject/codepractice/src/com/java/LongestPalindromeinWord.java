
public class LongestPalindromeinWord {
	/*The key point here is that from the mid of any palindrome string if we go to the right and left by 1 place, it’s always the same character.

	For example 12321, here mid is 3 and if we keep moving one position on both sides, we get 2 and then 1. We will use the same logic in our 
	java program to find out the longest palindrome.
	However, if the palindrome length is even, the mid-size is also even. So we need to make sure in our program that this is also checked. 
	For example, 12333321, here mid is 33 and if we keep moving one position in both sides, we get 3, 2 and 1.
	*/

	public static void main(String[] args) {
		System.out.println(tt("abcba"));

	}

	public static String tt(String word) {
		String longestPalindrome = "";
		for (int i = 0; i < word.length(); i++) {
			String current = findLongestPalindromeInternal(word.substring(i, word.length()));
			if (longestPalindrome.length() < current.length()) {
				longestPalindrome = current;
			}
		}
		return longestPalindrome;
	}

	public static String findLongestPalindromeInternal(String word) {
		String longestPalindrome;

		int index = word.length();
		while (index > 0 && !isPalindrome(word.substring(0, index))) {
			index--;
		}
		longestPalindrome = word.substring(0, index);

		return longestPalindrome;
	}

	public static boolean isPalindrome(String word) {
		int i1 = 0;
		int i2 = word.length() - 1;
		while (i2 > i1) {
			if (word.charAt(i1) != word.charAt(i2)) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;

	}

}

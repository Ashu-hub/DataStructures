package Microsoft.String;

import java.util.HashSet;
import java.util.Set;

public class MinimumDeletionstoMakeCharacterFrequenciesUnique {
	/*
	A string s is called good if there are no two different characters in s that have the same frequency.
	Given a string s, return the minimum number of characters you need to delete to make s good.
	The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.

	Example 1:

	Input: s = "aab"
	Output: 0
	Explanation: s is already good.
	
	Example 2:
	Input: s = "aaabbbcc"
	Output: 2
	Explanation: You can delete two 'b's resulting in the good string "aaabcc".
	Another way it to delete one 'b' and one 'c' resulting in the good string "aaabbc".
	
	Example 3:
	Input: s = "ceabaacb"
	Output: 2
	Explanation: You can delete both 'c's resulting in the good string "eabaab".
	Note that we only care about characters that are still in the string at the end (i.e. frequency of 0 is ignored).
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ceabaacb";
		System.out.println(countDeletion(s));
	}

	private static int countDeletion(String s) {
		// TODO Auto-generated method stub
		int freq[] = new int[26];
		int result = 0;
		Set<Integer> usedFreq = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			++freq[s.charAt(i)-'a'];
		}
		
		for (int i = 0; i < 26; i++) {
			while(freq[i]>0 && !usedFreq.add(freq[i])) {
				--freq[i];
				++result;
			}
		
		}
		int[] A = {1,2,3};
		return Math.abs(A[A.length]) < 0 ?1 :2;
		
		//return result;
	}


}

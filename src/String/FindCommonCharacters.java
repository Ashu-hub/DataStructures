package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.
	Example 1:
	
	Input: words = ["bella","label","roller"]
	Output: ["e","l","l"]
	Example 2:
	
	Input: words = ["cool","lock","cook"]
	Output: ["c","o"]
 */
public class FindCommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "bella", "label", "roller" };
		System.out.println(findCommonChars(s));
	}

	private static List<String> findCommonChars(String[] A) {
		int[] min_frequency = new int[26];
		Arrays.fill(min_frequency, Integer.MAX_VALUE);
		List<String> common_chars = new ArrayList<>();
		
		for (String curr_String : A) {
			int[] char_fequency = new int[26];
			for(char ch : curr_String.toCharArray()) {
				char_fequency[ch-'a']++; //update char_frewuency with every char frequency
			}
			for (int i = 0; i < char_fequency.length; i++) {
				System.out.print(char_fequency[i]+" ");
			}
			for (int i = 0; i < 26; i++) {
				min_frequency[i] = Math.min(min_frequency[i], char_fequency[i]);
			}
			System.out.println();
			for (int i = 0; i < min_frequency.length; i++) {
				System.out.print(min_frequency[i]+" ");
			}
			System.out.println();
			System.out.println();
			System.out.println("****************");
		}
		
		for (int i = 0; i < 26; i++) {
			while(min_frequency[i]>0) {
				common_chars.add(""+ (char)(i+'a'));
				min_frequency[i]--;
			}
		}
		System.out.println(common_chars);
		return common_chars;
	}

}

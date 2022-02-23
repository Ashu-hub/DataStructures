package String;

import java.util.Arrays;
import java.util.List;

//remove vowels from a String
/*
Input : welcome to geeksforgeeks
Output : wlcm t gksfrgks
Vowel: a ,e,i,o,u
*/
public class RemoveVowelsFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i welcome to geeksforgeeks";
		//System.out.println(removeVowels(str));
		System.out.println(easyRemove(str));
	}

	private static String easyRemove(String str) {
		
		return str.replaceAll("[a,e,i,o,u]", "");
	}

	private static String removeVowels(String str) {

		Character vowels[] = { 'a', 'e', 'i', 'o', 'u' };
		List<Character> vl = Arrays.asList(vowels);
		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < sb.length(); i++) {
			if (vl.contains(sb.charAt(i))) {
				sb.replace(i, i+1, "");
				i--;
			}
		}
		return sb.toString();
	}

	
}

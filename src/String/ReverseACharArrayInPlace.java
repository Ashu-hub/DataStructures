package String;

import java.util.Arrays;

/*
 * Write a function that reverses a string. The input string is given as an array of characters s.

	You must do this by modifying the input array in-place with O(1) extra memory.
	Example 1:
	Input: s = ["h","e","l","l","o"]
	Output: ["o","l","l","e","h"]

	Example 2:
	
	Input: s = ["H","a","n","n","a","h"]
	Output: ["h","a","n","n","a","H"]
 */
public class ReverseACharArrayInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"h","e","l","l","o"};
		reverse(s);

	}

	private static void reverse(String[] s) {

        int i,j;
     for( i = 0, j = s.length-1; i < j; i++,j--){
         //swap s[i], s[j]
         String temp = s[i];
         s[i] = s[j];
         s[j] = temp;
     }
        System.out.print(Arrays.toString(s));
		
	}

}

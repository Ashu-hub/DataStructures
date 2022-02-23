package Microsoft.String;

import java.util.HashSet;
import java.util.Set;

public class MinAdjSwapstoMakePalindrome {
//Given a string, what is the minimum number of adjacent swaps required to convert a string into a palindrome. If not possible, return -1.
/*		Example 1:
		Input: "mamad"
		Output: 3
		
		Example 2:
		Input: "asflkj"
		Output: -1

		Example 3:
		Input: "aabb"
		Output: 2
		
		Example 4:
		Input: "ntiin"
		Output: 1
		Explanation: swap 't' with 'i' => "nitin"
		*/
	static Set<Character> characterSet = new HashSet<>();
	public static void main(String[] args) {
		
		String input = "ntiin";
		System.out.println(makePalindromeByMinSwap(input));
	}

	public static int makePalindromeByMinSwap(String s)
	{
	    if (!isPalindrome(s))
	    {
	        return -1;
	    }

	    char[] str = s.toCharArray();
	    int countSwaps = 0;

	    for (int i = 0; i < str.length / 2; i++)
	    {
	        int left = i;
	        int right = str.length - left - 1;
   
	        if (characterSet.contains(str[left]))  // We've found that 1 letter with an frequency = 1 on left
	        {
	            // swap it with next character
	            char temp = str[left];
	            str[left] = str[left + 1];
	            str[left + 1] = temp;
	            countSwaps++;
	        }
   
	        if (characterSet.contains(str[right]))  // We've found that 1 letter with an frequency = 1 on right
	        {
	            // swap it with previous character
	            char temp = str[right];
	            str[right] = str[right - 1];
	            str[right - 1] = temp;
	            countSwaps++;
	        }
   
	        if (str[left] == str[right])
	        {
	            continue;
	        }
   
	        while (left < right)
	        {
	            if (str[left] == str[right])
	            {
	                break;
	            }
	            else
	            {
	                right--;
	            }
	        }
	        for (int j = right; j < str.length - left - 1; j++)
	        {
	            char t = str[j];
	            str[j] = str[j + 1];
	            str[j + 1] = t;
	            countSwaps++;
	        }
	    }
	    return countSwaps;
	}

	private static boolean isPalindrome(String s)
	{
	    for (char c : s.toCharArray())
	    {
	        if (characterSet.contains(c))
	        {
	            characterSet.remove(c);
	        }
	        else
	        {
	            characterSet.add(c);
	        }
	    }
	    return characterSet.size() <= 1;
	}
	
}

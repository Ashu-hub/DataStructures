package String;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

	You are given an array of strings sentences, where each sentences[i] represents a single sentence.
	
	Return the maximum number of words that appear in a single sentence.
	Example 1:
	
	Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
	Output: 6
	Explanation: 
	- The first sentence, "alice and bob love leetcode", has 5 words in total.
	- The second sentence, "i think so too", has 4 words in total.
	- The third sentence, "this is great thanks very much", has 6 words in total.
	Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
	Example 2:
	
	Input: sentences = ["please wait", "continue to fight", "continue to win"]
	Output: 3
	Explanation: It is possible that multiple sentences contain the same number of words. 
	In this example, the second and third sentences (underlined) have the same number of words.
	 
 */
public class MaximumNumberOfWordsFoundInSentences {

	public static void main(String[] args) {
		String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
		//System.out.println(findMaxNoWords(sentences));
		System.out.println(findMaxNoWordsOptimized(sentences));
	}
	
	private static long findMaxNoWordsOptimized(String[] sentences) {
		int max=0;
		//return Stream.of(sentences).mapToInt(s -> s.split(" ").length).max().getAsInt();
		for (int i = 0; i < sentences.length; i++) {
			
		max= Math.max(max, sentences[i].split(" ").length);
		}
		return max;
	}

	private static long findMaxNoWords(String[] sentences) {
		List<Integer> maxcount = new ArrayList<>();
		int spaceCount = 0;
		for (String str : sentences) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ' ') {
					spaceCount++;
				}
			}
			maxcount.add(spaceCount);
			spaceCount=0;
		}
		List<Integer> list=maxcount.stream().sorted().collect(Collectors.toList());
		
		return list.get(list.size()-1)+1;
	}

}
package DyanmicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*Given an array of numbers, arrange them in a way that yields the largest value.
For example, if the given numbers are {54, 546, 548, 60}, the arrangement 6054854654 gives the largest value. 
And if the given numbers are {1, 34, 3, 98, 9, 76, 45, 4}, then the arrangement 998764543431 gives the largest value.*/

public class FormBiggestNumber {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("54");
		list.add("546");
		list.add("548");
		list.add("60");
		formBiggest(list);

	}

	private static void formBiggest(List<String> list) {
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				String XY = X + Y;

				String YX = Y + X;

				return XY.compareTo(YX) > 0 ? -1 : 1;
			}

		});

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

}
/*
 * Explanation:- Given two numbers X and Y, how should myCompare() decide which
 * number to put first – we compare two numbers XY (Y appended at the end of X)
 * and YX (X appended at the end of Y). If XY is larger, then X should come
 * before Y in output, else Y should come before. For example, let X and Y be
 * 542 and 60. To compare X and Y, we compare 54260 and 60542. Since 60542 is
 * greater than 54260, we put Y first.
 */

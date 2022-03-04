package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//  eedaaad => eedaad
// xxxtxxx => xxtxx
//uuuuxaaaaxuuu => uuxaaxuu
public class Delete3rdConsucutivechars {
	public static void main(String[] args) {
		String s = "eedaaad";
		deleteConsucutive2(s);
	}
	// eeedaaad
	//

	private static void deleteConsucutive2(String s) {
		Set<Character> hs = new LinkedHashSet<>();
		List<Character> list = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < s.toCharArray().length; i++) {
			if (!hs.add(s.charAt(i))) {
				if (count == 2) {
					hs.remove(s.charAt(i));
					list.remove(s.charAt(i));
					count =0;
				} else {
					hs.add(s.charAt(i));
					list.add(s.charAt(i));
					count++;
				}
			} else {
				hs.add(s.charAt(i));
				list.add(s.charAt(i));
				count++;
			}
		}
		System.out.println(list);

	}

	private static void checkNext2Chars(char ch) {
		// TODO Auto-generated method stub

	}

	/*
	 * private static void deleteConsucutive(String s) { char[] chars =
	 * s.toCharArray(); char[] result = new char[chars.length + 1]; int i = 0, j=0;
	 * while (i < chars.length-1) { if (chars[i] == chars[i + 1] && chars[i] ==
	 * chars[i + 2]) { result[j] = result[j+1] = chars[i]; j +=2; i +=3; } else {
	 * result[j] = chars[i]; i++;j++; }
	 * 
	 * } System.out.println(Arrays.toString(result));
	 * 
	 * }
	 */
}

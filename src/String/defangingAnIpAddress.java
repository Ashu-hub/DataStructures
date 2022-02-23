package String;

import java.util.LinkedList;
import java.util.List;

/*
 Given a valid (IPv4) IP address, return a defanged version of that IP address.

		A defanged IP address replaces every period "." with "[.]".
		Example 1:
		
		Input: address = "1.1.1.1"
		Output: "1[.]1[.]1[.]1"
		Example 2:
		
		Input: address = "255.100.50.0"
		Output: "255[.]100[.]50[.]0"
 */
public class defangingAnIpAddress {

	public static void main(String[] args) {
		String ipv4 = "255.100.50.0";
		// System.out.println(defangedIP(ipv4));
		System.out.println(defangedIPOptimized(ipv4));
	}

	private static String defangedIPOptimized(String str) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt == '.') {
				sb.append("[.]");
			} else {
				sb.append(charAt);
			}
		}
		return sb.toString();
	}

	private static String defangedIP(String str) {
		String result = str.replaceAll("[.]", "[.]");
		return result;
	}

}

package L8_Feb24;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 24-Feb-2019
 *
 */

public class StringOps {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		// substrings(str);

		System.out.println(reverse(str));
	}

	public static void printChars(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

	public static void substrings(String str) {

		for (int si = 0; si < str.length(); si++) {

			for (int ei = si + 1; ei <= str.length(); ei++) {

				String ss = str.substring(si, ei);
				System.out.println(ss);
			}
		}
	}

	public static boolean isPalindrome(String str) {

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {

			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;

		}

		return true;

	}

	public static void palindromicSubstrings(String str) {

		for (int si = 0; si < str.length(); si++) {

			for (int ei = si + 1; ei <= str.length(); ei++) {

				String ss = str.substring(si, ei);

				if (isPalindrome(ss))
					System.out.println(ss);
			}
		}

	}

	public static String reverse(String str) {

		String ans = "";
		String subans = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			char ch = str.charAt(i);

			if (ch == '+' || ch == '*' || ch == '-' || ch == '/' || ch == '%') {

				ans = ans + subans + ch;
				subans = "";

			} else {
				subans = ch + subans;
			}

		}

		ans = ans + subans;

		return ans;
	}

}

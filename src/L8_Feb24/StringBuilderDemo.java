package L8_Feb24;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 24-Feb-2019
 *
 */

public class StringBuilderDemo {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = "hello";

		StringBuilder sb = new StringBuilder(str);

		// length
		System.out.println(sb.length());

		// append
		sb.append("abc");
		System.out.println(sb);

		// charAt : get the character
		System.out.println(sb.charAt(2));

		// insert
		sb.insert(1, "hello");
		System.out.println(sb);

		// deleteCharAt
		sb.deleteCharAt(1);
		System.out.println(sb);

		// delete
		sb.delete(2, 4);
		System.out.println(sb);

		// replace
		sb.replace(2, 4, "xyz");
		System.out.println(sb);

		// reverse
		sb.reverse();
		System.out.println(sb);

		// update the character
		sb.setCharAt(3, 't');
		System.out.println(sb);

		// convert string builder to string using toString
		String ans = sb.toString();

		System.out.println(evenOdd2("abcdefGH"));

	}

	public static String evenOdd(String str) {

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {

			if (i % 2 == 0) {
				sb.setCharAt(i, (char) (sb.charAt(i) + 1));
			} else {
				sb.setCharAt(i, (char) (sb.charAt(i) - 1));
			}

		}

		return sb.toString();
	}

	public static String evenOdd2(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (i % 2 == 0) {
				sb.append((char) (str.charAt(i) + 1));
			} else {
				sb.append((char) (str.charAt(i) - 1));
			}

		}

		return sb.toString();
	}

}

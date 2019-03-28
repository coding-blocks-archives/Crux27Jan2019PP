package Assignments.March27;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Mar-2019
 *
 */

public class FindingCBNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt() ;		
		String str = scn.next();

		boolean[] visited = new boolean[str.length()];

		int count = 0;

		for (int len = 1; len <= str.length(); len++) {

			for (int si = 0; si <= str.length() - len; si++) {

				int ei = si + len;

				String ps = str.substring(si, ei);

				if (isCBNumber(Long.valueOf(ps)) && isValid(si, ei, visited)) {
					count++;

					for (int i = si; i < ei; i++) {
						visited[i] = true;
					}
				}

			}

		}
		System.out.println(count);

	}

	public static boolean isValid(int si, int ei, boolean[] visited) {

		for (int i = si; i < ei; i++) {
			if (visited[i] == true) {
				return false;
			}
		}

		return true;
	}

	public static boolean isCBNumber(long num) {

		if (num == 0 || num == 1) {
			return false;
		}

		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}

		return true;

	}

}

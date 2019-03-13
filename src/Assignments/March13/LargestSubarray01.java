package Assignments.March13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Mar-2019
 *
 */

public class LargestSubarray01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			int maxLength = Integer.MIN_VALUE;
			int fs = -1;
			int fe = -1;

			for (int si = 0; si < arr.length; si++) {

				for (int ei = si; ei < arr.length; ei++) {

					if (equal01(arr, si, ei)) {

						int ps = ei - si + 1;

						if (ps > maxLength) {
							fs = si;
							fe = ei;
							maxLength = ps;
						}

					}
				}

			}

			if (fs == -1 && fe == -1) {
				System.out.println("None");
			} else {
				System.out.println(fs + " " + fe);
			}

			tc--;
		}

	}

	public static boolean equal01(int[] arr, int si, int ei) {

		int n0 = 0;
		int n1 = 0;
		for (int i = si; i <= ei; i++) {

			if (arr[i] == 0) {
				n0++;
			} else {
				n1++;
			}

		}

		return n0 == n1;
	}

}

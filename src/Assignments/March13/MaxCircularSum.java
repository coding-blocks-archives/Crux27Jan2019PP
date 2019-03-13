package Assignments.March13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Mar-2019
 *
 */

public class MaxCircularSum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc > 0) {
			
			int n = scn.nextInt();

			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			int[] na = new int[2 * arr.length];

			for (int i = 0; i < arr.length; i++) {
				na[i] = arr[i];
				na[arr.length + i] = arr[i];
			}

			int ans = Integer.MIN_VALUE;

			// for (int si = 0; si < arr.length; si++) {
			//
			// for (int ei = si; ei < si + arr.length; ei++) {
			//
			// int subarraySum = sum(na, si, ei);
			//
			// ans = Math.max(ans, subarraySum);
			//
			// }
			//
			// }

			for (int si = 0; si < arr.length; si++) {

				int subarraySum = 0;

				for (int ei = si; ei < si + arr.length; ei++) {

					subarraySum += na[ei];

					ans = Math.max(ans, subarraySum);
				}

			}

			System.out.println(ans);
			tc--;
		}
		
	}

	public static int sum(int[] arr, int si, int ei) {

		int ans = 0;

		for (int i = si; i <= ei; i++) {
			ans += arr[i];
		}

		return ans;
	}
}

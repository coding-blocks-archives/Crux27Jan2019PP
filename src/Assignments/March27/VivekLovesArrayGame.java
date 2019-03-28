package Assignments.March27;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Mar-2019
 *
 */

public class VivekLovesArrayGame {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			System.out.println(arrayGame(arr, 0, arr.length - 1));
			tc--;
		}

	}

	public static int arrayGame(int[] arr, int lo, int hi) {

		for (int mid = lo; mid < hi; mid++) {

			int lsum = 0;
			for (int i = lo; i <= mid; i++) {
				lsum += arr[i];
			}

			int rsum = 0;
			for (int i = mid + 1; i <= hi; i++) {
				rsum += arr[i];
			}

			if (lsum == rsum) {
				int lp = arrayGame(arr, lo, mid);
				int rp = arrayGame(arr, mid + 1, hi);

				return Math.max(lp, rp) + 1;
			}

		}

		return 0;

	}

}

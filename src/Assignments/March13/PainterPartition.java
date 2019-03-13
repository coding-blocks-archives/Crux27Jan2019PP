package Assignments.March13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Mar-2019
 *
 */

public class PainterPartition {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int nop = scn.nextInt();
		int nob = scn.nextInt();

		int[] arr = new int[nob];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int finalAns = 0;

		int lo = 0;
		int hi = 0;

		for (int val : arr) {
			hi += val;
		}

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(arr, nop, mid)) {
				hi = mid - 1;
				finalAns = mid;
			} else {
				lo = mid + 1;
			}

		}

		System.out.println(finalAns);

	}

	public static boolean isItPossible(int[] arr, int nop, int mid) {

		int numPainter = 1;
		int time = 0;

		int i = 0;
		while (i < arr.length) {

			if (time + arr[i] <= mid) {
				time += arr[i];
				i++;
			} else {
				numPainter++;
				time = 0;

				if (numPainter > nop) {
					return false;
				}
			}

		}

		return true;

	}

}

package Assignments.March6;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Mar-2019
 *
 */

public class PainterPartition {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int nop = scn.nextInt();
		int nob = scn.nextInt();

		int[] boards = new int[nob];

		for (int i = 0; i < boards.length; i++) {
			boards[i] = scn.nextInt();
		}

		int lo = 0;

		int hi = 0;
		for (int val : boards) {
			hi += val;
		}

		int finalAns = 0;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(boards, nop, mid)) {
				finalAns = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}

		System.out.println(finalAns);

	}

	public static boolean isItPossible(int[] boards, int nop, int mid) {

		int numberPainters = 1;
		int time = 0;

		int i = 0; // i denotes the book which is to be read

		while (i < boards.length) {

			if (time + boards[i] <= mid) {
				time += boards[i];
				i++;
			} else {

				numberPainters++;
				time = 0;

				if (numberPainters > nop) {
					return false;
				}
			}

		}

		return true;

	}
}

package Assignments.March13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Mar-2019
 *
 */

public class BookAllocation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int nob = scn.nextInt();
			int nos = scn.nextInt();

			int[] pages = new int[nob];

			for (int i = 0; i < pages.length; i++) {
				pages[i] = scn.nextInt();
			}

			int finalAns = 0;

			int lo = 0;
			int hi = 0;

			for (int val : pages) {
				hi += val;
			}

			while (lo <= hi) {

				int mid = (lo + hi) / 2;

				if (isItPossible(pages, nos, mid)) {
					hi = mid - 1;
					finalAns = mid;
				} else {
					lo = mid + 1;
				}

			}

			System.out.println(finalAns);
			tc--;
		}

	}

	public static boolean isItPossible(int[] pages, int nos, int mid) {

		int numStudents = 1;
		int pagesRead = 0;

		int i = 0;
		while (i < pages.length) {

			if (pagesRead + pages[i] <= mid) {
				pagesRead += pages[i];
				i++;
			} else {
				numStudents++;
				pagesRead = 0;

				if (numStudents > nos) {
					return false;
				}
			}

		}

		return true;

	}

}

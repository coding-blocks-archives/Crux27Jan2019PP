package Assignments.March6;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Mar-2019
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

			int lo = 0;

			int hi = 0;
			for (int val : pages) {
				hi += val;
			}

			int finalAns = 0;

			while (lo <= hi) {

				int mid = (lo + hi) / 2;

				if (isItPossible(pages, nos, mid)) {
					finalAns = mid;
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}

			}

			System.out.println(finalAns);
			tc--;
		}

	}

	public static boolean isItPossible(int[] pages, int nos, int mid) {

		int numberStudents = 1;
		int pagesRead = 0;

		int i = 0; // i denotes the book which is to be read

		while (i < pages.length) {

			if (pagesRead + pages[i] <= mid) {
				pagesRead += pages[i];
				i++;
			} else {

				numberStudents++;
				pagesRead = 0;

				if (numberStudents > nos) {
					return false;
				}
			}

		}

		return true;

	}
}

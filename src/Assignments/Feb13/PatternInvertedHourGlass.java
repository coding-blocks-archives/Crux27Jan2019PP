package Assignments.Feb13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Feb-2019
 *
 */

public class PatternInvertedHourGlass {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nsp = 2 * n - 1;
		int nst = 1;

		for (int row = 1; row <= 2 * n + 1; row++) {

			int val = n;

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + " ");
				val--;
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			int cst = 1;

			if (row == n + 1) {
				val++;
				cst = 2;
			}

			for (; cst <= nst; cst++) {
				val++;
				System.out.print(val + " ");
			}

			// prep
			if (row <= n) {
				nst++;
				nsp -= 2;
			} else {
				nst--;
				nsp += 2;
			}

			System.out.println();
		}

	}

}

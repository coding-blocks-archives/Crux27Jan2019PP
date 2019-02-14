package Assignments.Feb13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Feb-2019
 *
 */

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nspb = n - 1;
		int nst = 1;
		int nspa = -1;

		for (int row = 1; row <= n; row++) {

			int val;
			if (row <= n / 2)
				val = row;
			else
				val = n - row + 1;

			for (int cspb = 1; cspb <= nspb; cspb++) {
				System.out.print("  ");
			}

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + " ");
				val--;
			}

			for (int cspa = 1; cspa <= nspa; cspa++) {
				System.out.print("  ");
			}

			if (row > 1 && row < n)
				for (int cst = 1; cst <= nst; cst++) {
					val++;
					System.out.print(val + " ");
				}

			// prep
			if (row <= n / 2) {

				nspb -= 2;
				nst++;
				nspa += 2;

			} else {

				nspb += 2;
				nst--;
				nspa -= 2;
			}

			System.out.println();
		}

	}

}

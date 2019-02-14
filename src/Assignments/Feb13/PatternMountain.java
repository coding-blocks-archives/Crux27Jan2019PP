package Assignments.Feb13;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Feb-2019
 *
 */

public class PatternMountain {

	public static void main(String[] args) {

		int n = 5;

		int nsp = 2 * n - 3;
		int nst = 1;

		for (int row = 1; row <= n; row++) {

			int val = 1;

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);
				val++;
			}

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// stars

			int cst = 1;

			if (row == n) {
				cst = 2;
				val--;
			}
			
			for (; cst <= nst; cst++) {
				val--;
				System.out.print(val);
			}

			nst++;
			nsp -= 2;
			System.out.println();

		}

	}

}

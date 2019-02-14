package Assignments.Feb13;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Feb-2019
 *
 */

public class PatternRhombus {

	public static void main(String[] args) {

		int n = 5;

		int nsp = n - 1;
		int nst = 1;

		for (int row = 1; row <= 2 * n - 1; row++) {

			int val;

			if (row <= n)
				val = row;
			else
				val = 2 * n - row;

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);

				if (cst <= nst / 2)
					val++;
				else
					val--;
			}

			if (row <= n - 1) {
				nsp--;
				nst += 2;
			} else {
				nsp++;
				nst -= 2;
			}
			System.out.println();

		}

	}

}

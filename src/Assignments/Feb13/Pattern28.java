package Assignments.Feb13;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Feb-2019
 *
 */

public class Pattern28 {

	public static void main(String[] args) {

		int n = 5;

		int nsp = n - 1;
		int nst = 1;

		int val;

		for (int row = 1; row <= n; row++) {

			val = row;

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");

				if (cst <= nst / 2)
					val++;
				else
					val--;
			}

			nsp--;
			nst += 2;
			System.out.println();

		}

	}

}

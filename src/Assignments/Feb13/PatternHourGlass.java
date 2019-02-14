package Assignments.Feb13;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Feb-2019
 *
 */

public class PatternHourGlass {

	public static void main(String[] args) {

		int n = 5;

		int nst = 2 * n + 1;
		int nsp = 0;

		for (int row = 1; row <= 2 * n + 1; row++) {

			int val;
			if (row <= n + 1)
				val = n - row + 1;
			else
				val = row - (n + 1);

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);

				if (cst <= nst / 2)
					val--;
				else
					val++;
			}

			// prep
			if (row <= n) {
				nsp++;
				nst -= 2;
			} else {
				nsp--;
				nst += 2;
			}

			System.out.println();
		}

	}

}

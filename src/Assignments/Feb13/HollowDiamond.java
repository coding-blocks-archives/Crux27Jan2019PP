package Assignments.Feb13;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Feb-2019
 *
 */

public class HollowDiamond {

	public static void main(String[] args) {
		int n = 9;

		int nst = n / 2 + 1;
		int nsp = -1;

		for (int row = 1; row <= n; row++) {

			// self work
			// star
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			int cst = 1 ;
			
			if(row == 1 || row == n)
				cst = 2 ;
			
			for (; cst <= nst; cst++) {
				System.out.print("*");
			}

			// prep

			if (row <= n / 2) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}

			System.out.println();

		}

	}

}

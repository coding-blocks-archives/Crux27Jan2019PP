package Assignments.Feb13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Feb-2019
 *
 */

public class PatternHourGlass2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in) ;
		
		int n = scn.nextInt() ;

		int nst = 2 * n + 1;
		int nsp = 0;

		int val = n;

		for (int row = 1; row <= 2 * n + 1; row++) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + " ");

				if (cst <= nst / 2)
					val--;
				else
					val++;
			}

			// prep
			if (row <= n) {
				nsp++;
				nst -= 2;
				val = val - 2;
			} else {
				nsp--;
				nst += 2;
			}

			System.out.println();
		}

	}

}

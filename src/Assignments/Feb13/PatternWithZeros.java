package Assignments.Feb13;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Feb-2019
 *
 */

public class PatternWithZeros {

	public static void main(String[] args) {
		int n = 5;

		int nst = 1;

		for (int row = 1; row <= n; row++) {

			// self work
			// star
			for (int cst = 1; cst <= nst; cst++) {
				if (cst == 1 || cst == row)
					System.out.print(row + "\t");
				else
					System.out.print(0 + "\t");
			}

			nst++;
			System.out.println();

		}

	}

}

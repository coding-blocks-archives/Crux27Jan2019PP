
/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Feb-2019
 *
 */

public class Pattern17 {

	public static void main(String[] args) {

		int n = 11;

		int nst = n / 2;
		int nsp = 1;

		int row = 1;

		while (row <= n) {

			// work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// prep
			if (row <= n / 2) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}

			row++;
			System.out.println();

		}

	}

}


/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Feb-2019
 *
 */

public class Pattern12 {

	public static void main(String[] args) {

		int n = 5;
		int nst = 1;
		int nsp = n - 1;
		int row = 1;

		while (row <= n) {

			// work
			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// stars
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0) {
					System.out.print("!");
				} else {
					System.out.print("*");
				}
				cst++;
			}

			// prep
			row++;
			nst += 2;
			nsp--;
			System.out.println();

		}

	}

}

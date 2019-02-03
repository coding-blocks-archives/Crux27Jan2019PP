
/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Feb-2019
 *
 */

public class Pattern4 {

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
				System.out.print("*");
				cst++;
			}

			// prep
			row++;
			nst++;
			nsp--;
			System.out.println();

		}

	}

}

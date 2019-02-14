
/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Feb-2019
 *
 */

public class Pattern18 {

	public static void main(String[] args) {

		int n = 7;

		int nst = 1;
		int nsp = n / 2;

		int row = 1;

		while (row <= n) {

			// work
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*\t");
				cst++;
			}

			// prep
			if (row <= n / 2) {
				nst += 2;
				nsp--;
			} else {
				nst -= 2;
				nsp++;
			}

			row++;
			System.out.println();

		}

	}

}

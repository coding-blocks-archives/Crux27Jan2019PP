
/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Feb-2019
 *
 */

public class Pattern28 {

	public static void main(String[] args) {

		int n = 5;
		int nst = 1;
		int nsp = n - 1;
		int row = 1;

		int val = 1;

		while (row <= n) {

			val = row;

			// work
			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}

			// stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + "\t");
				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
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

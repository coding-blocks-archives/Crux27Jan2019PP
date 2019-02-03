
/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Feb-2019
 *
 */

public class Pattern1 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;
		
		while (row <= n) {

			// work
			int col = 1;
			while (col <= n) {
				System.out.print("*");
				col++;
			}

			// prep
			row++;
			System.out.println();

		}

	}

}

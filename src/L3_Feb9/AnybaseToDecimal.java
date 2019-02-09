package L3_Feb9;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Feb-2019
 *
 */

public class AnybaseToDecimal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int sb = s.nextInt();

		int ans = 0;
		int multiplier = 1;

		while (n != 0) {

			int rem = n % 10;

			ans = ans + (rem * multiplier);

			multiplier = multiplier * sb;
			n = n / 10;

		}

		System.out.println(ans);

	}

}

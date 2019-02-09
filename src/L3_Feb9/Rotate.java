package L3_Feb9;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Feb-2019
 *
 */

public class Rotate {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int r = s.nextInt();

		// no of digits
		int temp = n;
		int nod = 0;
		while (temp != 0) {
			nod++;
			temp = temp / 10;
		}

		r = r % nod;

		if (r < 0) {
			r = r + nod;
		}

		// logic
		int divisor = (int) Math.pow(10, r);
		int multiplier = (int) Math.pow(10, nod - r);

		int rem = n % divisor;
		int quotient = n / divisor;

		int ans = rem * multiplier + quotient;

		System.out.println(ans);

	}

}

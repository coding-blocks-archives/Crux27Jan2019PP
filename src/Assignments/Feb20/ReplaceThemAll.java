package Assignments.Feb20;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Feb-2019
 *
 */

public class ReplaceThemAll {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		long n = scn.nextLong();

		if (n == 0) {
			System.out.println(5);
		} else {
			long ans = 0;
			int power = 0;

			while (n != 0) {

				long rem = n % 10;

				if (rem == 0) {
					rem = 5;
				}

				ans = rem * (long) Math.pow(10, power) + ans;

				n = n / 10;
				power++;

			}

			System.out.println(ans);
		}

	}

}

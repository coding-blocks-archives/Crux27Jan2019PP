package L3_Feb9;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Feb-2019
 *
 */

public class Inverse {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int place = 1;
		int ans = 0;

		while (n != 0) {

			int rem = n % 10;
			ans = ans + place * (int) Math.pow(10, rem - 1);

			// variables change for next iteration
			place++;
			n = n / 10;

		}
		
		System.out.println(ans);

	}

}

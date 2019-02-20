package Assignments.Feb20;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Feb-2019
 *
 */

public class Chewbacca {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		long n = scn.nextLong();

		long[] arr = new long[19];
		int i = 0;

		// store the original no in array in reverse order
		while (n != 0) {

			long rem = n % 10;
			arr[i] = rem;
			i++;
			n = n / 10;

		}

		// invert the digits
		for (int j = 0; j < i; j++) {

			if (j == i - 1 && arr[j] == 9) {
				// dont do anything
			}
			else if (arr[j] >= 5) {
				arr[j] = 9 - arr[j];
			}

		}

		// display to the user
		for (int k = i - 1; k >= 0; k--) {
			System.out.print(arr[k]);
		}
		System.out.println();

	}

}

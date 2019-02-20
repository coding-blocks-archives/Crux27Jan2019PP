package Assignments.Feb20;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Feb-2019
 *
 */

public class SumOddEvenPlace {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int oddSum = 0;
		int evenSum = 0;

		int count = 1;

		while (n != 0) {

			int rem = n % 10;

			if (count % 2 == 0) {
				evenSum += rem;
			} else {
				oddSum += rem;
			}

			count++;
			n = n / 10;

		}

		System.out.println(oddSum + "\n" + evenSum);
	}

}

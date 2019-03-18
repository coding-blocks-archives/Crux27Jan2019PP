package Assignments.Feb20;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Feb-2019
 *
 */

public class BostonNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int digitSum = sumDigits(n);
		int factorSum = 0;

		int onum = n;

		for (int div = 2; div <= Math.sqrt(n); div++) {

			if (isPrime(div)) {

				while (onum % div == 0) {
					factorSum += sumDigits(div);
					onum = onum / div;
				}
			}

		}

		if (onum >= 2) {
			factorSum += sumDigits(onum);
		}

		if (factorSum == digitSum) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static int sumDigits(int n) {

		int sum = 0;

		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}

		return sum;
	}

	public static boolean isPrime(int n) {

		int factor = 0;

		int div = 1;

		while (div <= n) {

			if (n % div == 0) {
				factor++;
			}

			div++;

		}

		if (factor == 2) {
			return true;
		} else {
			return false;
		}

	}

}

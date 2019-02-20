package Assignments.Feb20;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Feb-2019
 *
 */

public class IncDec {

	public static void main(String[] args) {

		System.out.println(incdecsequence()) ;
	}

	public static boolean incdecsequence() {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		boolean gd = true;

		int prev = scn.nextInt();

		for (int i = 1; i <= n - 1; i++) {

			int curr = scn.nextInt();

			if (gd) { // dec sequence

				if (curr < prev) {
					// acceptable : ok
				} else if (curr > prev) {
					gd = false;
				} else { // strictly inc dec
					return false;
				}

			} else { // inc sequence

				if (curr > prev) {
					// acceptable : ok
				} else {
					return false;
				}

			}

			prev = curr;

		}

		return true;

	}

}

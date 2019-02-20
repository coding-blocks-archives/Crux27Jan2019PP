package Assignments.Feb20;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Feb-2019
 *
 */

public class ShoppingGame {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		for (int ptc = 1; ptc <= tc; ptc++) {
			
			int ayushLimit = scn.nextInt();
			int harshitLimit = scn.nextInt();

			int ayushCount = 0;
			int harshitCount = 0;

			int i = 1;

			while (true) {

				if (i % 2 == 0) {

					if (harshitCount + i <= harshitLimit) {
						harshitCount += i;
					} else {
						System.out.println("Aayush");
						break;
					}

				} else {

					if (ayushCount + i <= ayushLimit) {
						ayushCount += i;
					} else {
						System.out.println("Harshit");
						break;
					}

				}

				i++;

			}
		}

	}

}

package Assignments.Feb20;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Feb-2019
 *
 */

public class SimpleInput {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int csum = 0;

		while (true) {

			int num = scn.nextInt();
			csum += num;

			if (csum < 0) {
				break;
			}

			System.out.println(num);

		}

	}

}

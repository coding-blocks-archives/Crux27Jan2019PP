package Assignments.March13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Mar-2019
 *
 */

public class AlexGoesShopping {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int q = scn.nextInt();

		for (int i = 1; i <= q; i++) {

			int count = 0;

			int amount = scn.nextInt();
			int k = scn.nextInt();

			for (int j = 0; j < arr.length; j++) {

				if (amount % arr[j] == 0) {
					count++;
				}

			}

			if (count >= k) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}
}

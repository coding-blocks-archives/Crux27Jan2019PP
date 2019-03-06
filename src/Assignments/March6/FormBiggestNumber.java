package Assignments.March6;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Mar-2019
 *
 */

public class FormBiggestNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			for (int counter = 0; counter < n - 1; counter++) {

				for (int j = 0; j < n - counter - 1; j++) {

					if (compare(arr[j], arr[j + 1])) {

						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}

			}

			for (int val : arr) {
				System.out.print(val);
			}

			System.out.println();
			tc--;
		}

	}

	public static boolean compare(int n1, int n2) {

		String n1n2string = n1 + "" + n2;
		String n2n1string = n2 + "" + n1;

		int n1n2int = Integer.parseInt(n1n2string);
		int n2n1int = Integer.parseInt(n2n1string);

		if (n1n2int > n2n1int) {
			return false;
		} else {
			return true;
		}

	}

}

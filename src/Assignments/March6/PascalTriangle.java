package Assignments.March6;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Mar-2019
 *
 */

public class PascalTriangle {

	public static void main(String[] args) {

		// Array(5);
		combination(5);

	}

	public static void Array(int n) {

		int[][] arr = new int[n][n];

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col <= row; col++) {

				if (col == 0 || col == row) {
					arr[row][col] = 1;
				} else {
					arr[row][col] = arr[row - 1][col - 1] + arr[row - 1][col];
				}

				System.out.print(arr[row][col] + " ");
			}

			System.out.println();

		}

		// for (int row = 0; row < arr.length; row++) {
		//
		// for (int col = 0; col <= row; col++) {
		// System.out.print(arr[row][col] + " ");
		// }
		// System.out.println();
		// }
	}

	public static void combination(int n) {

		for (int row = 0; row < n; row++) {

			int val = 1;

			for (int col = 0; col <= row; col++) {

				System.out.print(val + " ");
				val = (val * (row - col)) / (col + 1);
			}
			System.out.println();

		}

	}

}

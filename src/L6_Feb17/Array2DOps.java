package L6_Feb17;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 17-Feb-2019
 *
 */

public class Array2DOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[][] array = takeInputJaggedArray();
		// display(array);

		int[][] array = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 } };

		// verticalDisplay(array);
		// waveDisplay(array);
		// spiralDisplay(array);

		int[][] one = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] two = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		display(matrixMultiplication(one, two));
	}

	public static int[][] takeInputRectangular() {

		int rows = scn.nextInt();
		int cols = scn.nextInt();

		int[][] arr = new int[rows][cols];

		for (int r = 0; r < arr.length; r++) {

			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = scn.nextInt();
			}
		}

		return arr;

	}

	public static int[][] takeInputJaggedArray() {

		System.out.println("Rows ?");
		int rows = scn.nextInt();

		int[][] arr = new int[rows][];

		for (int r = 0; r < arr.length; r++) {

			System.out.println("Col for " + r + " row ?");
			int cols = scn.nextInt();

			// remove null and point to some address of 1d array
			arr[r] = new int[cols];

			// update every col by taking input from the user
			for (int c = 0; c < arr[r].length; c++) {

				System.out.println("[" + r + "-" + c + "] ?");
				arr[r][c] = scn.nextInt();
			}

		}

		return arr;

	}

	public static void display(int[][] arr) {

		for (int r = 0; r < arr.length; r++) {

			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}

			System.out.println();

		}

	}

	public static void verticalDisplay(int[][] arr) {

		for (int c = 0; c < arr[0].length; c++) {

			for (int r = 0; r < arr.length; r++) {
				System.out.print(arr[r][c] + " ");
			}

		}

		System.out.println();
	}

	public static void waveDisplay(int[][] arr) {

		for (int c = 0; c < arr[0].length; c++) {

			if (c % 2 == 0) {

				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c] + " ");
				}

			} else {

				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c] + " ");
				}
			}
		}

	}

	public static void spiralDisplay(int[][] arr) {

		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;

		int count = 0;
		int nel = arr.length * arr[0].length;

		while (count < nel) {
			// first col
			for (int row = minRow; row <= maxRow && count < nel; row++) {
				System.out.print(arr[row][minCol] + " ");
				count++;
			}
			minCol++;

			// last row
			for (int col = minCol; col <= maxCol && count < nel; col++) {
				System.out.print(arr[maxRow][col] + " ");
				count++;
			}
			maxRow--;

			// last col
			for (int row = maxRow; row >= minRow && count < nel; row--) {
				System.out.print(arr[row][maxCol] + " ");
				count++;
			}
			maxCol--;

			// first row
			for (int col = maxCol; col >= minCol && count < nel; col--) {
				System.out.print(arr[minRow][col] + " ");
				count++;
			}
			minRow++;

		}

	}

	public static int[][] matrixMultiplication(int[][] one, int[][] two) {

		int r1 = one.length;
		int c1 = one[0].length;

		int r2 = two.length;
		int c2 = two[0].length;

		if (c1 != r2) {
			return null;
		}

		int[][] ans = new int[r1][c2];

		for (int i = 0; i < ans.length; i++) {

			for (int j = 0; j < ans[0].length; j++) {

				int sum = 0;

				for (int k = 0; k < c1; k++) {
					sum = sum + one[i][k] * two[k][j];
				}

				ans[i][j] = sum;
			}
		}
		return ans;

	}

}

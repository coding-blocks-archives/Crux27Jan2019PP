package L6_Feb17;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 17-Feb-2019
 *
 */

public class Array2DDemo {

	public static void main(String[] args) {

		int[][] arr = new int[3][5];

		System.out.println(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println(arr.length); // rows
		System.out.println(arr[0].length); // cols

		// get
		System.out.println(arr[1][3]);

		// update
		arr[1][3] = 10;

		System.out.println(arr[1][3]);

		for (int r = 0; r < arr.length; r++) {

			for (int c = 0; c < arr[0].length; c++) {
				System.out.print(arr[r][c] + " ");
			}

			System.out.println();

		}

		for (int[] val : arr) {

			for (int val1 : val) {
				System.out.print(val1 + " ");
			}

			System.out.println();

		}

		System.out.println(" -- JARR -- ");

		int[][] jarr = new int[3][];

		System.out.println(jarr);

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);

		jarr[0] = new int[3];
		jarr[1] = new int[5];
		jarr[2] = new int[2];

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);

		System.out.println(jarr[0].length);
		System.out.println(jarr[1].length);
		System.out.println(jarr[2].length);

		System.out.println(jarr[1][4]);
	}
	
	
	
	
	
	
	
	

}

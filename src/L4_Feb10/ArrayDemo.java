package L4_Feb10;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Feb-2019
 *
 */

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr = null;

		System.out.println(arr);

		arr = new int[5];
		System.out.println(arr);

		System.out.println(arr.length);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]);

		// update
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// get
		int x = arr[0];
		System.out.println(x);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
			// arr[i] = 100 ;
		}

		System.out.println("-- Enhanced For Loop --");
		// forward only
		// read only
		for (int val : arr) {
			System.out.println("O: " + val);
			val = 100;
			System.out.println("A: " + val);
		}

		for (int val : arr) {
			System.out.println(val);

		}

	}

}

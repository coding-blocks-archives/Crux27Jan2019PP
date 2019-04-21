package L28_April21;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 21-Apr-2019
 *
 */

public class Overloading {

	public static void main(String[] args) {

		for (String val : args) {
			System.out.println(val);
		}
		// System.out.println(add(2, 3));
		// System.out.println(add(2, 3, 4));
		// System.out.println(add(2, 4.5));

		// int sum = add(2, 3);
		// add(3, 5);

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(add(4, 5, 5, 6));
	}

	public static int add(int a, int b, int... args) {

		int sum = 0;

		for (int val : args) {
			sum += val;
		}

		return sum;
	}

	public static int add(int a, int b) {
		System.out.println("hi");
		return a + b;
	}

	public static int add(int a, int b, int c) {
		System.out.println("bye");
		return a + b + c;
	}

	public static int add(int a, double b) {
		return (int) (a + b);
	}

}

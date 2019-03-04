package L9_March2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Mar-2019
 *
 */

public class Recursion {

	public static void main(String[] args) {

		// PDI(4);
		// System.out.println(fact(5));
		// System.out.println(power(3, 5));
		int[] arr = { 10, 20, 30, 40, 30, 90, 30 };

		displayArray(arr, 0);
		System.out.println();

		System.out.println(findFirstOccurenceIndex(arr, 0, 30));
		System.out.println(findLastOccurenceIndex(arr, 0, 30));

		int[] ans = findAllOccurenceIndex(arr, 0, 30, 0);

		for (int val : ans) {
			System.out.println(val);
		}

	}

	public static void PD(int n) {

		if (n == 0) {
			return;
		}

		// self work
		System.out.println(n);

		// smaller prob
		PD(n - 1);

	}

	public static void PI(int n) {

		// base case
		if (n == 0) {
			return;
		}

		// smaller prob
		PI(n - 1);

		// self work
		System.out.println(n);

	}

	public static void PDI(int n) {

		// base case
		if (n == 0) {
			return;
		}

		System.out.println("hi " + n);

		// smaller prob
		PDI(n - 1);

		// self work
		System.out.println("bye " + n);

	}

	public static void PDISkips(int n) {

		// base case
		if (n == 0) {
			return;
		}

		if (n % 2 == 0)
			System.out.println(n);

		// smaller prob
		PDISkips(n - 1);

		if (n % 2 != 0)
			System.out.println(n);

	}

	public static int fact(int n) {

		if (n == 1) {
			return 1;
		}

		// smaller prob
		int fnm1 = fact(n - 1);

		// self work
		int fn = fnm1 * n;

		return fn;

	}

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}

		int sp = power(x, n - 1);

		int bp = sp * x;

		return bp;

	}

	public static int fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);

		int fn = fnm1 + fnm2;

		return fn;

	}

	public static void displayArray(int[] arr, int vidx) {

		// base case
		if (vidx == arr.length) {
			return;
		}

		// self work : print
		System.out.print(arr[vidx] + " ");

		// smaller problem
		displayArray(arr, vidx + 1);

	}

	public static void displayArrayReverse(int[] arr, int vidx) {

		// base case
		if (vidx == arr.length) {
			return;
		}

		// smaller problem
		displayArrayReverse(arr, vidx + 1);

		// self work : print
		System.out.print(arr[vidx] + " ");

	}

	public static int max(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return 0;
		}

		int sp = max(arr, vidx + 1);

		if (arr[vidx] > sp) {
			return arr[vidx];
		} else {
			return sp;
		}
	}

	public static int findFirstOccurenceIndex(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return -1;
		}

		int recRes = findFirstOccurenceIndex(arr, vidx + 1, item);

		if (arr[vidx] == item) {
			return vidx;
		}

		return recRes;

	}

	public static int findLastOccurenceIndex(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return -1;
		}

		int recRes = findLastOccurenceIndex(arr, vidx + 1, item);

		if (arr[vidx] == item && recRes == -1) {
			return vidx;
		}

		return recRes;

	}

	public static int[] findAllOccurenceIndex(int[] arr, int vidx, int item, int count) {

		if (vidx == arr.length) {
			int[] br = new int[count];
			return br;
		}

		if (arr[vidx] == item) {

			int[] recRes = findAllOccurenceIndex(arr, vidx + 1, item, count + 1);
			recRes[count] = vidx;
			return recRes;

		} else {

			int[] recRes = findAllOccurenceIndex(arr, vidx + 1, item, count);
			return recRes;

		}

	}

}

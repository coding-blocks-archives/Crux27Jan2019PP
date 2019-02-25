package L4_Feb10;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Feb-2019
 *
 */

public class ArrayOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[] array = takeInput();
		int n = 100_000_0;

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		// display(array);

		// System.out.println(max(array));
		//
		// System.out.println(search(array, 12));
		// System.out.println(binarySearch(array, 12));

		// rotate(array, -19);
		// int[] ans = inverse(array);
		// System.out.println(ans);

		long start = System.currentTimeMillis();

		bubbleSort(array);

		long end = System.currentTimeMillis();

		System.out.println(end - start);
		// selectionSort(array);
		// insertionSort(array);
		// display(array);
	}

	public static int[] takeInput() {

		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static void display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static int max(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;

	}

	public static int search(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item) {
				return i;
			}
		}

		return -1;

	}

	public static int binarySearch(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (item > arr[mid]) {
				lo = mid + 1;
			} else if (item < arr[mid]) {
				hi = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

	public static void reverse(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			// swap
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;

		}
	}

	public static void rotate(int[] arr, int tr) {

		tr = tr % arr.length;

		if (tr < 0) {
			tr = tr + arr.length;
		}

		for (int pr = 1; pr <= tr; pr++) {

			int temp = arr[arr.length - 1];

			for (int j = arr.length - 1; j >= 1; j--) {
				arr[j] = arr[j - 1];
			}

			arr[0] = temp;

		}

	}

	public static int[] inverse(int[] arr) {

		int[] ans = new int[arr.length];

		for (int i = 0; i < ans.length; i++) {
			ans[arr[i]] = i;
		}

		return ans;
	}

	public static void bubbleSort(int[] arr) {

		boolean flag = true;

		for (int counter = 0; counter < arr.length - 1; counter++) {

			// System.out.println("Counter " + counter);
			for (int j = 0; j < arr.length - counter - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					flag = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

				// display(arr);
			}

			if (flag)
				break;
		}

	}

	public static void selectionSort(int[] arr) {

		boolean flag = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				flag = false;
			}
		}

		if (flag == false) {

			for (int counter = 0; counter < arr.length - 1; counter++) {

				int min = counter;

				for (int j = counter + 1; j < arr.length; j++) {

					if (arr[j] < arr[min]) {
						min = j;
					}
				}

				int temp = arr[min];
				arr[min] = arr[counter];
				arr[counter] = temp;
			}
		}

	}

	public static void insertionSort(int[] arr) {

		for (int counter = 1; counter < arr.length; counter++) {

			int item = arr[counter];

			int j = counter - 1;

			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = item;

		}

	}

}

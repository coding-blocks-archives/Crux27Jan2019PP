package Assignments.April3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Apr-2019
 *
 */

public class NextPermutation {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 1, 0 };

		int i = arr.length - 2;

		while (i >= 0 && arr[i] > arr[i + 1]) {
			i--;
		}

		if (i != -1) {
			int jl = i + 1;
			int j = i + 2;

			while (j < arr.length) {

				if (arr[j] < arr[jl] && arr[j] > arr[i]) {
					jl = j;
				}
				j++;
			}

			int temp = arr[i];
			arr[i] = arr[jl];
			arr[jl] = temp;

		}

		int k = i + 1;
		int l = arr.length - 1;

		while (k < l) {
			int t = arr[k];
			arr[k] = arr[l];
			arr[l] = t;
			k++;
			l--;
		}

		for (int val : arr) {
			System.out.print(val);
		}
		System.out.println();

	}
}

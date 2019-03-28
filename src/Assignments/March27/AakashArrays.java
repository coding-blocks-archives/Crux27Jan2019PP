package Assignments.March27;

import java.util.Arrays;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Mar-2019
 *
 */

public class AakashArrays {

	public static void main(String[] args) {

		int[] a = { 1, 4, 5, 8, 20 };
		int[] b = { 6, 9, 15 };
		int[] c = { 2, 3, 6, 7 };

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		int ans = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length && k < c.length) {

			int min = Math.min(a[i], Math.min(b[j], c[k]));
			int max = Math.max(a[i], Math.max(b[j], c[k]));

			if (max - min < ans) {
				ans = max - min;
			}

			if (ans == 0) {
				break;
			}

			if (a[i] == min) {
				i++;
			} else if (b[j] == min) {
				j++;
			} else if (c[k] == min) {
				k++;
			}

		}

		System.out.println(ans);

	}
}

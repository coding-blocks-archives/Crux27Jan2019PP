package Assignments.March13;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Mar-2019
 *
 */

public class MaxSumPath {

	public static void main(String[] args) {

		int[] one = {2, 3, 7, 10, 12, 15, 30, 34 } ;
		int[] two ={1 ,5 ,7 ,8 ,10, 15, 16, 19 } ;		
		
		System.out.println(sumPath(one, two));
	}

	public static int sumPath(int[] one, int[] two) {

		int ans = 0;

		int sum1 = 0;
		int sum2 = 0;

		int i = 0;
		int j = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				sum1 += one[i];
				i++;
			} else if (one[i] > two[j]) {
				sum2 += two[j];
				j++;
			} else {

				ans += Math.max(sum1, sum2) + one[i];

				i++;
				j++;

				sum1 = 0;
				sum2 = 0;

			}

		}

		if (i == one.length) {

			while (j < two.length) {
				sum2 += two[j];
				j++;
			}
		}

		if (j == two.length) {

			while (i < one.length) {
				sum1 += one[i];
				i++;
			}
		}

		ans += Math.max(sum1, sum2);

		return ans;

	}
}

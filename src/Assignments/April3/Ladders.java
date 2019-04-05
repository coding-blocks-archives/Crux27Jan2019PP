package Assignments.April3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Apr-2019
 *
 */

public class Ladders {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] ladders = makeLadders(SOE(n));

		System.out.println("\n" + laddersChess(0, n, "", ladders));
		
		
	}

	public static int laddersChess(int curr, int end, String ans, int[] ladders) {

		if (curr == end) {
			System.out.print(ans + "END , ");
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int c = 0;

		if (ladders[curr] != 0) {
			c += laddersChess(ladders[curr], end, ans + curr + " ", ladders);
		} else {

			for (int dice = 1; dice <= 6; dice++) {
				c += laddersChess(curr + dice, end, ans + curr + " ", ladders);
			}
		}

		return c;

	}

	public static boolean[] SOE(int n) {

		boolean[] primes = new boolean[n + 1];

		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int table = 2; table * table <= n; table++) {

			if (primes[table] == false) {
				continue;
			}

			for (int multiplier = 2; table * multiplier <= n; multiplier++) {
				primes[table * multiplier] = false;
			}

		}

		return primes;

	}

	public static int[] makeLadders(boolean[] primes) {

		int[] ladders = new int[primes.length];

		int left = 0;
		int right = primes.length - 1;

		while (left < right) {

			while (primes[left] == false) {
				left++;
			}

			while (primes[right] == false) {
				right--;
			}

			if (left < right) {
				ladders[left] = right;
				left++;
				right--;
			}

		}

		return ladders;

	}

}

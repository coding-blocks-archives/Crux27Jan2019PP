package Assignments.March27;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Mar-2019
 *
 */

public class MurthalPrataha {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int nop = scn.nextInt();
		int noc = scn.nextInt();

		int max = Integer.MIN_VALUE;
		int[] rank = new int[noc];

		for (int i = 0; i < rank.length; i++) {
			rank[i] = scn.nextInt();
			max = Integer.max(max, rank[i]);

		}

		int finalAns = 0;

		int lo = 0;
		int hi = (nop * max * (max + 1)) / 2;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(rank, nop, mid)) {
				finalAns = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}

		System.out.println(finalAns);

	}

	public static boolean isItPossible(int[] rank, int nop, int mid) {

		int parathaPreparedTillNow = 0;

		for (int i = 0; i < rank.length; i++) {

			int count = 1;
			int time = 0;

			while (time + count * rank[i] <= mid) {
				time = time + count * rank[i];
				count++;
				parathaPreparedTillNow++;

			}

			if (parathaPreparedTillNow >= nop) {
				return true;
			}
		}

		return false;

	}
}

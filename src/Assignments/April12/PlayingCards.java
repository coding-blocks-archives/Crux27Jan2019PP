package Assignments.April12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 12-Apr-2019
 *
 */

public class PlayingCards {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int noc = scn.nextInt();
		int q = scn.nextInt();

		ArrayList<Stack<Integer>> A = new ArrayList<>();
		ArrayList<Stack<Integer>> B = new ArrayList<>();

		for (int i = 1; i <= q + 1; i++) {
			A.add(new Stack<>());
			B.add(new Stack<>());
		}

		for (int i = 1; i <= noc; i++) {
			A.get(0).push(scn.nextInt());
		}

		for (int i = 1; i <= q; i++) {

			Stack<Integer> ps = A.get(i - 1);

			while (!ps.isEmpty()) {

				int element = ps.pop();

				if (element % ithPrime(i) == 0) {
					B.get(i).push(element);
				} else {
					A.get(i).push(element);
				}

			}

		}

		for (int i = 1; i < B.size(); i++) {
			Stack<Integer> ps = B.get(i);

			while (!ps.isEmpty()) {
				System.out.println(ps.pop());
			}

		}

		while (!A.get(q).isEmpty()) {
			System.out.println(A.get(q).pop());
		}

	}

	public static int ithPrime(int i) {

		int count = 0;
		int n = 2;

		while (true) {

			if (isPrime(n)) {
				count++;
			}

			if (count == i) {
				return n;
			}

			n++;
		}

	}

	public static boolean isPrime(int n) {

		int div = 2;

		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}

			div++;
		}

		return true;

	}
}

package Assignments.Feb20;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Feb-2019
 *
 */

public class BasicCalculator {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (true) {

			char ch = scn.next().charAt(0);

			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {

				int N1 = scn.nextInt();
				int N2 = scn.nextInt();

				if (ch == '+') {
					System.out.println(N1 + N2);
				} else if (ch == '-') {
					System.out.println(N1 - N2);
				} else if (ch == '*') {
					System.out.println(N1 * N2);
				} else if (ch == '/') {
					System.out.println(N1 / N2);
				} else if (ch == '%') {
					System.out.println(N1 % N2);
				}

			} else if (ch == 'x' || ch == 'X') {
				break;
			} else {
				System.out.println("Invalid operation. Try again.");
			}
			
		}

	}

}

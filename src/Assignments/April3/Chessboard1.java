package Assignments.April3;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Apr-2019
 *
 */

public class Chessboard1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		System.out.println("\n" + chess1(0, 0, n-1, n-1, ""));
	}

	public static int chess1(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.print(ans + "{" + er + "-" + ec + "} ");
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int c = 0;

		c += chess1(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		c += chess1(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

		if (cr == 0 || cr == er || cc == 0 || cc == ec) {

			// Horizontal
			for (int move = 1; move <= ec; move++) {
				c += chess1(cr, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}

			// Vertical
			for (int move = 1; move <= er; move++) {
				c += chess1(cr + move, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}

		}

		if (cr == cc || cr + cc == ec) {

			// Diagonal
			for (int move = 1; move <= ec && move <= er; move++) {
				c += chess1(cr + move, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}B");
			}

		}

		return c;

	}
}

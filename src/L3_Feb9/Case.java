package L3_Feb9;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Feb-2019
 *
 */

public class Case {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		char ch = scn.next().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lower");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper");
		} else {
			System.out.println("Invalid");
		}
	}
}






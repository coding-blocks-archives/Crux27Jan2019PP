package Assignments.March13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Mar-2019
 *
 */

public class HelpRamu {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			int c3 = scn.nextInt();
			int c4 = scn.nextInt();

			int nor = scn.nextInt();
			int noc = scn.nextInt();

			int[] freqr = new int[nor];
			int[] freqc = new int[noc];

			for (int i = 0; i < freqr.length; i++) {
				freqr[i] = scn.nextInt();
			}

			for (int i = 0; i < freqc.length; i++) {
				freqc[i] = scn.nextInt();
			}

			System.out.println(minAmount(c1, c2, c3, c4, freqr, freqc));
			tc--;
		}

	}

	private static int minAmount(int c1, int c2, int c3, int c4, int[] freqr, int[] freqc) {

		int rickshawMinFare = minVehicle(c1, c2, c3, freqr);
		int carsMinFare = minVehicle(c1, c2, c3, freqc);

		return Math.min(rickshawMinFare + carsMinFare, c4);

	}

	public static int minVehicle(int c1, int c2, int c3, int[] freq) {

		int sum = 0;

		for (int i = 0; i < freq.length; i++) {
			sum += Math.min(freq[i] * c1, c2);
		}

		return Math.min(sum, c3);

	}

}

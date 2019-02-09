package L3_Feb9;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Feb-2019
 *
 */

public class DataTypeDemo {

	public static void main(String[] args) {

		byte by = 10;
		short sh = 258;
		int in = 10;
		long lo = 10;

		// Part 1
		// by = sh ;
		// by = in ;
		// by = lo ;

		sh = by;
		// sh = in ;
		// sh = lo ;

		in = by;
		in = sh;
		// in = lo ;

		lo = by;
		lo = sh;
		lo = in;

		// Part 2
		by = -128;
		System.out.println(by);

		by = (byte) 259;
		System.out.println(by);

		// Part 3
		in = (int) 10000000000L;

		// Part 4
		float fl = 4.5f;
		double db = 5.6;

		// fl = db ;
		db = fl;

		// Part 5
		in = (int) fl;
		System.out.println(in);

		fl = in;
		System.out.println(fl);

		// Part 6
		boolean bl = true;

		if (bl) {

		}

		if (in > 1) {

		}

	}

}

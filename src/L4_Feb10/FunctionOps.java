package L4_Feb10;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Feb-2019
 *
 */

public class FunctionOps {

	public static void main(String[] args) {

		int a = 10;
		int b = 100;
		// printAllPrimes(a, b);

		printAllArmstrong(10, 1000);

	}

	public static void printAllPrimes(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {

			boolean res = isPrime(i);
			if (res == true) {
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int n) {

		int fact = 0;
		int div = 1;

		while (div <= n) {

			if (n % div == 0) {
				fact++;
			}

			div++;

		}

		if (fact == 2) {
			return true;
		} else {
			return false;
		}

	}

	public static void printAllArmstrong(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {
			boolean res = isArmstrong(i);

			if (res) {
				System.out.println(i);
			}
		}
	}

	public static boolean isArmstrong(int n) {

		int temp = n;
		int nod = numberOfDigits(n);
		int ans = 0;

		while (n != 0) {

			int rem = n % 10;
			ans = ans + (int) Math.pow(rem, nod);

			n = n / 10;

		}

		if (ans == temp) {
			return true;
		} else {
			return false;
		}

	}

	public static int numberOfDigits(int n) {

		int count = 0;

		while (n != 0) {
			count++;
			n = n / 10;
		}

		return count;

	}

}

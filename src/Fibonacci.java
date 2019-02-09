import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Feb-2019
 *
 */

public class Fibonacci {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int a = 0;
		int b = 1;

		for (int i = 1; i <= n + 1; i++) {

			System.out.println(a);

			int sum = a + b;

			a = b;
			b = sum;

		}

	}

}

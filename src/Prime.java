import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Jan-2019
 *
 */

public class Prime {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int fact = 0;

		int div = 1;

		while (div <= n) {

			if (n % div == 0) {
				fact++;
			}

			div = div + 1;
		}

		if (fact == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

}

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Jan-2019
 *
 */

public class EvenOdd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}

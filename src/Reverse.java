import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Jan-2019
 *
 */

public class Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int ans = 0 ;
		
		while (n != 0) {

			int rem = n % 10;
			ans = ans * 10 + rem ;
					
			n = n / 10;

		}
		
		System.out.println(ans);

	}

}

package L15_March22.OOPS_Story1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Mar-2019
 *
 */

public class PClient {

	public static void main(String[] args) {

		Person p = new Person();

		System.out.println("hi");

		try {
			System.out.println("hi try");
			p.setAge(10);
			System.out.println("bye try");
			return;
		} catch (Exception e) {

			System.out.println(e);
			System.out.println("Hi Catch");
			System.out.println("Bye Catch");

		} finally {
			System.out.println("in finally");
			
		}

		System.out.println("bye");

	}

}

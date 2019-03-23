package L15_March19.OOPS_Story1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Mar-2019
 *
 */

public class PClient {

	public static void main(String[] args) {

		System.out.println("hi");

		Person p = new Person();

		try {
			System.out.println("hi try");
			p.setAge(-10);
			System.out.println("bye try");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("in catch");
			return;
		} finally {
			System.out.println("in finally");
		}

		System.out.println("bye");
	}
}

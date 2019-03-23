package L15_March19.OOPS_Story1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Mar-2019
 *
 */

public class Person {

	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {

		if (age < 0) {
			throw new Exception("Invalid age.");
		}

		this.age = age;

	}

}

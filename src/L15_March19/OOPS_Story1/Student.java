package L15_March19.OOPS_Story1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Mar-2019
 *
 */

public class Student {

	String name = "ABC";
	int age = 100;

	// parametrized constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {

	}

	public void introduceYourself() {
		System.out.println(this.name + " is " + this.age + "  years old.");
	}

	public void sayHi(String name) {
		System.out.println(this.name + " says hi to " + name);
	}

}

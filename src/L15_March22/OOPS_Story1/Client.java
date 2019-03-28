package L15_March22.OOPS_Story1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Mar-2019
 *
 */

public class Client {

	public static void main(String[] args) {

		Student s = new Student();

		System.out.println(s.name);
		System.out.println(s.age);

		s.name = "Amit";
		s.age = 20;

		System.out.println(s.name);
		System.out.println(s.age);

		Student s1 = s;

		s1.name = "Rohit";
		s1.age = 40;

		System.out.println(s.name);
		System.out.println(s.age);

		Student s3 = new Student();
		s3.age = 10;
		s3.name = "A";

		Student s4 = new Student();
		s4.age = 20;
		s4.name = "B";

		Test1(s3, s4);
		System.out.println(s3.age + " " + s3.name);
		System.out.println(s4.age + " " + s4.name);

		Test2(s3, s4);
		System.out.println(s3.age + " " + s3.name);
		System.out.println(s4.age + " " + s4.name);

		int myAge = 30;
		String myName = "C";

		Test3(s3, s4.age, s4.name, myAge, myName);
		System.out.println(s3.age + " " + s3.name);
		System.out.println(s4.age + " " + s4.name);
		System.out.println(myAge + " " + myName);

		Student s10 = new Student();
		s10.name = "Aman";
		s10.age = 50;

		s10.introduceYourself();

		s10.sayHi("Rohit");

		Student s20 = new Student("Mohit", 60);
		s20.introduceYourself();
		
		System.out.println(s20);

	}

	public static void Test3(Student s, int age, String name, int myAge, String myName) {
		s.age = 0;
		s.name = "_";
		age = 0;
		name = "_";
		myAge = 0;
		myName = "_";
	}

	public static void Test2(Student p1, Student p2) {

		p2 = new Student();
		int tempa = p1.age;
		p1.age = p2.age;
		p2.age = tempa;

		p1 = new Student();
		String tempn = p1.name;
		p1.name = p2.name;
		p2.name = tempn;
	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}
}

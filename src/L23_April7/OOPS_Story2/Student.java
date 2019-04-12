package L23_April7.OOPS_Story2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 07-Apr-2019
 *
 */

public class Student {

	private String name;
	private int rollNo;

	private static int numberOfStudents;

	public Student(String name) {

		numberOfStudents++;
		this.rollNo = numberOfStudents;
		this.name = name;

	}

	// this cannot be used
	// cannot access non static data members
	// static data members can be used
	public static int getNumberStudents() {
		int a = 0;
		int b = 2;

		// System.out.println(rollNo);
		return numberOfStudents;
		// getRollNo() ;
	}

	// this can be used
	// non static data member can be used
	// static field can be used
	public int getRollNo() {
		getNumberStudents();
		return this.rollNo;
		// return numberOfStudents;
	}

}

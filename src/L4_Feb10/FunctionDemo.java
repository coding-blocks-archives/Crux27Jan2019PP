package L4_Feb10;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Feb-2019
 *
 */

public class FunctionDemo {

	static int val = 100;

	public static void main(String[] args) {

		// Part-1
		System.out.println("----------- Part-1 -----------");
		System.out.println("hello");
		addition(); // fxn call
		System.out.println("bye");
		subtraction();

		// Part-2
		System.out.println("----------- Part-2 -----------");
		int x = 2;
		int y = 3;
		additionParams(x, y);
		System.out.println(x);

		int sum = additionReturn(x, y);
		System.out.println(sum);

		// Part-3
		System.out.println("----------- Part-3 -----------");
		int one = 10, two = 20;
		int sum1 = DemoScopes(one, two);
		System.out.println(sum1);

		// Part-4
		System.out.println("----------- Part-4 -----------");

		System.out.println(val);
		demo();
		System.out.println(val);
		int val = 200;
		val++;
		System.out.println(val);
		System.out.println(FunctionDemo.val);

		// Part 5 - Pass by value
		System.out.println("----------- Part-5 -----------");
		System.out.println(one + ", " + two);
		Swap(one, two);
		System.out.println(one + ", " + two);

	}

	public static void Swap(int one, int two) {
		System.out.println(one + ", " + two);

		int temp = one;
		one = two;
		two = temp;

		System.out.println(one + ", " + two);
	}

	public static void demo() {
		val++;
		System.out.println(val);
	}

	public static int DemoScopes(int one, int another) {

		int sum = one + another;
		return sum;
	}

	// fxn definition
	public static void addition() {

		int a = 4;
		int b = 10;

		System.out.println(a + b);

		subtraction();
		System.out.println("hiii");
	}

	public static void subtraction() {

		int a = 40;

		for (int i = 1; i <= 4; i++) {
			if (i == 2)
				return;
		}

		int b = 10;

		System.out.println(a - b);

	}

	public static void additionParams(int a, int b) {

		System.out.println(a + b);
		a = 50;

	}

	public static int additionReturn(int a, int b) {

		int sum = a + b;
		return 0;
	}

}

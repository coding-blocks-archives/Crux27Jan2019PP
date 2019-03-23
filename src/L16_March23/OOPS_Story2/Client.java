package L16_March23.OOPS_Story2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 23-Mar-2019
 *
 */

public class Client {

	public static void main(String[] args) {

		// CASE 1
		P obj1 = new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();

		// CASE 2
		P obj2 = new C();
		System.out.println(obj2.d); // 10 : Ref
		System.out.println(((C) obj2).d); // 20
		System.out.println(obj2.d1); // 100
		System.out.println(((C) obj2).d2); // 200
		obj2.fun(); // C Fun
		((P) obj2).fun(); // C Fun
		obj2.fun1(); // P Fun 1
		((C) obj2).fun2(); // C Fun 2

		// CASE 3
		// C obj3 = new P() ;
		// System.out.println(obj3.d);
		// System.out.println(obj3.d1);
		// System.out.println(obj3.d2);

		// CASE 4
		C obj4 = new C();
		System.out.println(obj4.d); // 20
		System.out.println(((P) obj4).d); // 10
		System.out.println(obj4.d1); // 100
		System.out.println(obj4.d2); // 200

		obj4.fun(); // C Fun
		((P) obj4).fun(); // C Fun
		obj4.fun1(); // P Fun 1
		obj4.fun2(); // C fun 2

	}
}

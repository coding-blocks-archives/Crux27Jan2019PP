package L23_April7.GenericClass;

import java.util.ArrayList;

import L23_April7.GenericFxn.Car;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Apr-2019
 *
 */

public class Client {

	public static void main(String[] args) {

		Pair<Pair<Integer, String>, Pair<Character, Double>> p = new Pair<>();

		p.a = new Pair<>();
		p.a.a = 10;
		System.out.println(p.a.a);
		p.a.b = "abc";
		System.out.println(p.a.b);

		p.b = new Pair<>();
		p.b.a = 'a';
		System.out.println(p.b.a);

		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		System.out.println(lists.size());

		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		System.out.println(lists.size());
		System.out.println(lists.get(0).size());

		lists.get(0).add(10);
		lists.get(1).add(20);
		lists.get(1).add(30);
		lists.get(1).add(40);
		lists.get(2).add(50);
		lists.get(2).add(60);

		lists.get(2).add(70);

		System.out.println(lists);
		// System.out.println(lists.get(0));

//		LinkedListGeneric<ArrayList<Integer>> ll = new LinkedListGeneric<>();
//
//		ll.addLast(lists.get(0));
//		ll.addLast(lists.get(1));
//		ll.addFirst(lists.get(2));
//		
//		ll.display();
		
		Car[] cars = new Car[5];

		cars[0] = new Car(1000, 20, "Black");
		cars[1] = new Car(200, 10, "White");
		cars[2] = new Car(345, 3, "Yellow");
		cars[3] = new Car(8907, 6, "Red");
		cars[4] = new Car(34, 89, "Grey");
		
		LinkedListGeneric<Car> ll = new LinkedListGeneric<>() ;
		
		ll.addLast(cars[0]);
		ll.addLast(cars[1]);
		ll.addLast(cars[2]);
		ll.addLast(cars[3]);
		ll.addLast(cars[4]);
		
		ll.display();
		

	}
}

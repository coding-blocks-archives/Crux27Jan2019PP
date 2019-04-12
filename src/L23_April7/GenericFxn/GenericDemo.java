package L23_April7.GenericFxn;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 07-Apr-2019
 *
 */

public class GenericDemo {

	public static void main(String[] args) {

		Integer[] arr = { 10, 20, 30, 40, 50 };
		display(arr);

		String[] sarr = { "hi", "bye", "cb" };
		display(sarr);

		Car[] cars = new Car[5];

		cars[0] = new Car(1000, 20, "Black");
		cars[1] = new Car(200, 10, "White");
		cars[2] = new Car(345, 3, "Yellow");
		cars[3] = new Car(8907, 6, "Red");
		cars[4] = new Car(34, 89, "Grey");

		display(cars);

		bubbleSort(cars);
		
		display(cars);
		

	}

	public static <T> void display(T[] arr) {

		for (T val : arr) {
			System.out.println(val);
		}
		System.out.println();
		System.out.println("---------------");
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - counter - 1; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

}

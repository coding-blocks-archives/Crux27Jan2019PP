package L25_April14;

import java.util.ArrayList;

import L23_April7.GenericFxn.Car;
import L23_April7.GenericFxn.CarColorComparator;
import L23_April7.GenericFxn.CarPriceComparator;
import L23_April7.GenericFxn.CarSpeedComparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 14-Apr-2019
 *
 */

public class HeapGClient {

	public static void main(String[] args) {

		HeapGeneric<Car> heapg = new HeapGeneric<>();

		Car[] cars = new Car[5];

		cars[0] = new Car(1000, 20, "Black");
		cars[1] = new Car(200, 10, "White");
		cars[2] = new Car(345, 3, "Yellow");
		cars[3] = new Car(8907, 6, "Red");
		cars[4] = new Car(34, 89, "Grey");

		for (int i = 0; i <= 4; i++) {
			heapg.add(cars[i]);
		}

		while (!heapg.isEmpty()) {
			System.out.println(heapg.remove());
		}

		// HeapGenericComp<Car> heapgc = new HeapGenericComp<>(new
		// CarColorComparator());
		// Car[] cars = new Car[5];
		//
		// cars[0] = new Car(1000, 20, "Black");
		// cars[1] = new Car(200, 10, "White");
		// cars[2] = new Car(345, 3, "Yellow");
		// cars[3] = new Car(8907, 6, "Red");
		// cars[4] = new Car(34, 89, "Grey");
		//
		// for (int i = 0; i <= 4; i++) {
		// heapgc.add(cars[i]);
		// }
		//
		// while (!heapgc.isEmpty()) {
		// System.out.println(heapgc.remove());
		// }

		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());

		lists.get(0).add(1);
		lists.get(0).add(8);
		lists.get(0).add(9);
		lists.get(0).add(10);
		lists.get(0).add(12);

		lists.get(1).add(5);
		lists.get(1).add(15);
		lists.get(1).add(20);

		lists.get(2).add(7);
		lists.get(2).add(13);
		lists.get(2).add(25);
		lists.get(2).add(30);

		lists.get(3).add(2);
		lists.get(3).add(3);

		System.out.println(lists);

		System.out.println(mergeKSortedLists(lists));

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(3);
		arr.add(4);
		arr.add(9);
		arr.add(80);

		System.out.println(kLargestElements(arr, 3));

		// HeapGenericComp<Integer> heap = new HeapGenericComp<>(new
		// IntegerComparator());
		//
		// heap.add(10);
		// heap.add(20);
		// heap.add(30);
		// heap.add(40);
		//
		// System.out.println(heap.remove());
		// System.out.println(heap.remove());
		// System.out.println(heap.remove());
		// System.out.println(heap.remove());
	}

	private static class Pair implements Comparable<Pair> {

		int data;
		int listNo;
		int idx;

		@Override
		public int compareTo(Pair o) {
			return o.data - this.data;
		}
	}

	public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {

		ArrayList<Integer> ans = new ArrayList<>();

		HeapGeneric<Pair> heap = new HeapGeneric<>();

		for (int i = 0; i < lists.size(); i++) {
			Pair np = new Pair();

			np.data = lists.get(i).get(0);
			np.idx = 0;
			np.listNo = i;

			heap.add(np);
		}

		while (!heap.isEmpty()) {

			// remove
			Pair rp = heap.remove();

			// ans
			ans.add(rp.data);

			// update
			rp.idx++;

			if (rp.idx < lists.get(rp.listNo).size()) {
				rp.data = lists.get(rp.listNo).get(rp.idx);
				heap.add(rp);
			}

		}

		return ans;

	}

	public static ArrayList<Integer> kLargestElements(ArrayList<Integer> list, int k) {

		ArrayList<Integer> ans = new ArrayList<>();

		Heap heap = new Heap();

		for (int i = 0; i < k; i++) {
			heap.add(list.get(i));
		}

		for (int i = k; i < list.size(); i++) {

			int smaller = heap.getHP();

			if (list.get(i) > smaller) {
				heap.remove();
				heap.add(list.get(i));
			}

		}

		while (!heap.isEmpty()) {
			ans.add(heap.remove());
		}

		return ans;

	}

}

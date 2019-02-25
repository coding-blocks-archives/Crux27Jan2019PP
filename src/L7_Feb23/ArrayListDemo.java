package L7_Feb23;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 23-Feb-2019
 *
 */

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);

		// size
		System.out.println(list.size());

		// add
		list.add(10);
		list.add(20);

		System.out.println(list);

		// add at index : 0 -> size
		// worst case : 0 index
		// best case : size index
		list.add(0, 30);
		System.out.println(list);

		list.add(list.size(), 40);
		System.out.println(list);

		// get : 0 -> size-1
		System.out.println(list.get(list.size() - 1));

		// remove : 0 -> size-1
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.remove(list.size() - 1));
		System.out.println(list);

		// loop on arraylist
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int val : list) {
			System.out.println(val);
		}

		int[] one = { 10, 10, 20, 20, 30, 35, 35, 40, 40, 50 };
		int[] two = { 5, 5, 10, 10, 20, 35, 35, 35, 35, 50, 50 };

		System.out.println(intersection(one, two));

		int[] a1 = { 8, 9, 7, 9 };
		int[] a2 = { 8, 6 };

		System.out.println(sum(a1, a2));
	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				i++;
			} else if (one[i] > two[j]) {
				j++;
			} else {
				ans.add(one[i]);
				i++;
				j++;
			}

		}

		return ans;

	}

	public static ArrayList<Integer> sum(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		int i = one.length - 1;
		int j = two.length - 1;

		int carry = 0;

		while (i >= 0 || j >= 0) {

			int sum = carry;

			if (i >= 0) {
				sum += one[i];
			}

			if (j >= 0) {
				sum += two[j];
			}

			int rem = sum % 10;
			ans.add(0, rem);

			carry = sum / 10;
			i--;
			j--;

		}
		if (carry != 0)
			ans.add(0, carry);

		return ans;

	}

}

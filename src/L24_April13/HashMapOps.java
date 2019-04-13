package L24_April13;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Apr-2019
 *
 */

public class HashMapOps {

	public static void main(String[] args) {

		System.out.println(maxFreqChar("aabcdefaaabbbbbb"));

		int[] one = { 10, 20, 40, 10, 30, 10, 60 };
		int[] two = { 60, 40, 10, 80, 10, 90, 40 };

		System.out.println(intersection(one, two));

		int[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 , 4} ;
		System.out.println(longestConsecutiveSeq(arr));

	}

	public static char maxFreqChar(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (map.containsKey(ch)) {

				int of = map.get(ch);
				int nf = of + 1;
				map.put(ch, nf);

			} else {
				map.put(ch, 1);
			}
		}

		char maxfreqchar = ' ';
		int maxfreq = 0;

		for (char key : map.keySet()) { // a, b , c

			if (map.get(key) > maxfreq) { // a ki freq > maxfreq
				maxfreq = map.get(key); // update freq
				maxfreqchar = key; // ch update
			}

		}

		return maxfreqchar;

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		// create a freq map using the first array
		for (int i = 0; i < one.length; i++) {

			if (map.containsKey(one[i])) {
				map.put(one[i], map.get(one[i]) + 1);
			} else {
				map.put(one[i], 1);
			}

		}

		// traverse the second array and put the elements in ans which are present in
		// both

		for (int j = 0; j < two.length; j++) {

			int val = two[j];

			if (map.containsKey(val)) {

				ans.add(val);
				map.put(val, map.get(val) - 1);

				if (map.get(val) == 0) {
					map.remove(val);
				}

			}

		}

		return ans;
	}

	public static ArrayList<Integer> longestConsecutiveSeq(int[] arr) {

		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int val = arr[i];

			if (map.containsKey(val - 1)) {
				map.put(val, false);
			} else {
				map.put(val, true);
			}

			if (map.containsKey(val + 1)) {
				map.put(val + 1, false);
			}

		}

		int maxCount = 0;
		int starting = 0;

		for (Integer key : map.keySet()) {

			if (map.get(key)) {

				int count = 0;

				while (map.containsKey(key + count)) {
					count++;
				}

				if (count > maxCount) {
					maxCount = count;
					starting = key;
				}

			}

		}

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = starting; i < starting + maxCount; i++) {
			ans.add(i);
		}

		return ans;

	}

}

package L24_April13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Apr-2019
 *
 */

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		// put
		map.put("India", 10);
		map.put("SL", 20);
		map.put("Aus", 5);

		System.out.println(map);

		map.put("India", 100);
		System.out.println(map);

		// get
		System.out.println(map.get("India"));
		System.out.println(map.get("China"));

		// containsKey
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsKey("China"));

		// remove
		// System.out.println(map.remove("SL"));
		System.out.println(map.remove("China"));

		// keyset
		// way 1
		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println(key + " -> " + map.get(key));
		}

		// way 2
		for (String key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}

		// way 3
		ArrayList<String> keysal = new ArrayList<>(map.keySet());

		for (String key : keysal) {
			System.out.println(key + " -> " + map.get(key));
		}

	}

}

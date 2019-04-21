package L25_April14;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 14-Apr-2019
 *
 */

public class HeapGeneric<T extends Comparable<T>> {

	private ArrayList<T> data = new ArrayList<>();

	private HashMap<T, Integer> map = new HashMap<>();

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

	public void add(T item) {

		data.add(item);
		map.put(item, data.size() - 1); // prims

		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) {

		int pi = (ci - 1) / 2;

		if (isLarger(data.get(ci), data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	public void swap(int i, int j) {

		T ith = data.get(i);
		T jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);

		map.put(ith, j); // prims
		map.put(jth, i); // prims
	}

	public T remove() {

		swap(0, data.size() - 1);
		T rv = data.remove(data.size() - 1);

		map.remove(rv); // prims

		downheapify(0);

		return rv;
	}

	private void downheapify(int pi) {

		int lci = (2 * pi) + 1;
		int rci = (2 * pi) + 2;

		int mini = pi;

		if (lci < data.size() && isLarger(data.get(lci), data.get(mini)) > 0) {
			mini = lci;
		}

		if (rci < data.size() && isLarger(data.get(rci), data.get(mini)) > 0) {
			mini = rci;
		}

		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	// t priority greater -> +ve
	// o priority greater -> -ve
	public int isLarger(T t, T o) {
		return t.compareTo(o);
	}

	public void updatePriority(T pair) {

		// int si = -1;
		// for (int i = 0; i < data.size(); i++) {
		//
		// if (data.get(i) == pair) {
		// si = i;
		// break;
		// }
		// }

		int si = map.get(pair);
		upheapify(si);
	}

}

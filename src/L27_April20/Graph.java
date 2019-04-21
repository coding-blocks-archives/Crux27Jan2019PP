package L27_April20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import L25_April14.HeapGeneric;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Apr-2019
 *
 */

public class Graph {

	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, Vertex> vtces = new HashMap<>();

	public int numVertex() {
		return vtces.size();
	}

	public boolean containsVertex(String vname) {
		return vtces.containsKey(vname);
	}

	public void addVertex(String vname) {

		Vertex vtx = new Vertex();
		vtces.put(vname, vtx);

	}

	public void removeVertex(String vname) {

		Vertex vtx = vtces.get(vname);

		for (String nbr : vtx.nbrs.keySet()) {

			Vertex nbrVtx = vtces.get(nbr);
			nbrVtx.nbrs.remove(vname);

		}

		vtces.remove(vname);
	}

	public int numEdges() {

		int sum = 0;

		for (String key : vtces.keySet()) {

			Vertex vtx = vtces.get(key);
			sum += vtx.nbrs.size();
		}

		return sum / 2;
	}

	public boolean containsEdge(String vname1, String vname2) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}

		return true;
	}

	public void addEdge(String vname1, String vname2, int cost) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);

	}

	public void removeEdge(String vname1, String vname2) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}

	public void display() {

		System.out.println("---------------------");

		for (String key : vtces.keySet()) {

			Vertex vtx = vtces.get(key);
			System.out.println(key + " -> " + vtx.nbrs);

		}

		System.out.println("---------------------");

	}

	@Override
	public String toString() {

		String str = "---------------------\n";

		for (String key : vtces.keySet()) {

			Vertex vtx = vtces.get(key);
			str += key + " -> " + vtx.nbrs + "\n";

		}

		str += "---------------------";

		return str;
	}

	public boolean hasPath(String src, String dst, HashMap<String, Boolean> processed) {

		processed.put(src, true);

		if (src.equals(dst)) {
			return true;
		}

		for (String nbr : vtces.get(src).nbrs.keySet()) {

			if (!processed.containsKey(nbr)) {

				if (hasPath(nbr, dst, processed))
					return true;
			}
		}

		return false;

	}

	public void printAllPaths(String src, String dst, HashMap<String, Boolean> processed, String str) {

		if (src.equals(dst)) {
			System.out.println(str);
			return;
		}

		processed.put(src, true);

		for (String nbr : vtces.get(src).nbrs.keySet()) {
			if (!processed.containsKey(nbr))
				printAllPaths(nbr, dst, processed, str + nbr);
		}

		processed.remove(src);
	}

	private class Pair {
		String vname;
		String psf;

		String color;
	}

	public boolean bfs(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		// make a pair and put in queue
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;

		queue.addLast(sp);

		// work till queue is not empty
		while (!queue.isEmpty()) {

			// remove the pair from queue
			Pair rp = queue.removeFirst();

			// ignore the second C
			if (processed.containsKey(rp.vname)) {
				continue;
			}

			// processed put
			processed.put(rp.vname, true);

			// direct edge
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			// nbrs
			for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

				// process only unprocessed nbrs
				if (!processed.containsKey(nbr)) {

					// make a pair of nbr and put in queue
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;

					queue.addLast(np);
				}
			}

		}

		return false;

	}

	public boolean dfs(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> stack = new LinkedList<>();

		// make a pair and put in queue
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;

		stack.addFirst(sp);

		// work till queue is not empty
		while (!stack.isEmpty()) {

			// remove the pair from queue
			Pair rp = stack.removeFirst();

			// ignore the second C
			if (processed.containsKey(rp.vname)) {
				continue;
			}

			// processed put
			processed.put(rp.vname, true);

			// direct edge
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			// nbrs
			for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

				// process only unprocessed nbrs
				if (!processed.containsKey(nbr)) {

					// make a pair of nbr and put in queue
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;

					stack.addFirst(np);
				}
			}

		}

		return false;

	}

	public void bft() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			// make a pair and put in queue
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;

			queue.addLast(sp);

			// work till queue is not empty
			while (!queue.isEmpty()) {

				// remove the pair from queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// processed put
				processed.put(rp.vname, true);

				// syso
				System.out.println(rp.vname + " via " + rp.psf);

				// nbrs
				for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make a pair of nbr and put in queue
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}

			}

		}

	}

	public void dft() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> stack = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			// make a pair and put in queue
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;

			stack.addFirst(sp);

			// work till queue is not empty
			while (!stack.isEmpty()) {

				// remove the pair from queue
				Pair rp = stack.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// processed put
				processed.put(rp.vname, true);

				// syso
				System.out.println(rp.vname + " via " + rp.psf);

				// nbrs
				for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make a pair of nbr and put in queue
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						stack.addFirst(np);
					}
				}

			}

		}

	}

	public boolean isCyclic() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			// make a pair and put in queue
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;

			queue.addLast(sp);

			// work till queue is not empty
			while (!queue.isEmpty()) {

				// remove the pair from queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					return true;
				}

				// processed put
				processed.put(rp.vname, true);

				// nbrs
				for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make a pair of nbr and put in queue
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}

			}

		}

		return false;

	}

	public boolean isConnected() {

		int count = 0;

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			count++;

			// make a pair and put in queue
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;

			queue.addLast(sp);

			// work till queue is not empty
			while (!queue.isEmpty()) {

				// remove the pair from queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// processed put
				processed.put(rp.vname, true);

				// nbrs
				for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make a pair of nbr and put in queue
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}

			}

		}

		return count == 1;

	}

	public boolean isTree() {
		return !isCyclic() && isConnected();
	}

	public ArrayList<ArrayList<String>> getCC() {

		ArrayList<ArrayList<String>> ans = new ArrayList<>();

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			ArrayList<String> subans = new ArrayList<>();

			// make a pair and put in queue
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;

			queue.addLast(sp);

			// work till queue is not empty
			while (!queue.isEmpty()) {

				// remove the pair from queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// processed put
				processed.put(rp.vname, true);

				// syso
				subans.add(rp.vname);

				// nbrs
				for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make a pair of nbr and put in queue
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}

			}

			ans.add(subans);

		}

		return ans;
	}

	public boolean isBipartite() {

		HashMap<String, String> processed = new HashMap<>();

		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			// make a pair and put in queue
			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			sp.color = "r";

			queue.addLast(sp);

			// work till queue is not empty
			while (!queue.isEmpty()) {

				// remove the pair from queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {

					String oc = processed.get(rp.vname);
					String nc = rp.color;

					if (!oc.equals(nc)) {
						return false;
					}
				}

				// processed put
				processed.put(rp.vname, rp.color);

				// nbrs
				for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {

						// make a pair of nbr and put in queue
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						np.color = rp.color.equals("r") ? "g" : "r";

						queue.addLast(np);
					}
				}

			}

		}

		return true;

	}

	private class PrimsPair implements Comparable<PrimsPair> {

		String vname;
		String acqVtxName;
		int cost;

		@Override
		public int compareTo(PrimsPair o) {
			return o.cost - this.cost;
		}
	}

	public Graph prims() {

		Graph mst = new Graph();

		HeapGeneric<PrimsPair> heap = new HeapGeneric<>();
		HashMap<String, PrimsPair> map = new HashMap<>();

		for (String key : vtces.keySet()) {
			PrimsPair np = new PrimsPair();
			np.vname = key;
			np.acqVtxName = null;
			np.cost = Integer.MAX_VALUE;

			heap.add(np);
			map.put(key, np);

		}

		while (!heap.isEmpty()) {

			// remove from heap and map
			PrimsPair rp = heap.remove();
			map.remove(rp.vname);

			// add in mst
			if (rp.acqVtxName == null) {
				mst.addVertex(rp.vname);
			} else {
				mst.addVertex(rp.vname);
				mst.addEdge(rp.vname, rp.acqVtxName, rp.cost);
			}

			// nbrs
			for (String nbr : vtces.get(rp.vname).nbrs.keySet()) {

				// update the nbrs which are presenr in heap
				if (map.containsKey(nbr)) {

					PrimsPair nbrPair = map.get(nbr);
					int oc = nbrPair.cost;
					int nc = vtces.get(rp.vname).nbrs.get(nbr);

					if (nc < oc) {
						nbrPair.cost = nc;
						nbrPair.acqVtxName = rp.vname;

						heap.updatePriority(nbrPair);
					}
				}
			}

		}

		return mst;

	}

}

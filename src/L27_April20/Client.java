package L27_April20;

import java.util.HashMap;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Apr-2019
 *
 */

public class Client {

	public static void main(String[] args) {

		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");

		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 6);
		graph.addEdge("B", "C", 3);
		graph.addEdge("C", "D", 1);
		graph.addEdge("D", "E", 8);
		graph.addEdge("E", "F", 5);
		graph.addEdge("E", "G", 7);
		graph.addEdge("F", "G", 9);

		// graph.display();

		System.out.println(graph);

		// graph.removeEdge("E", "G");
		// graph.removeEdge("B", "C");
		// graph.removeVertex("A");

		// System.out.println(graph.hasPath("A", "F", new HashMap<>()));
		// System.out.println(graph);

		// graph.printAllPaths("A", "F", new HashMap<>(), "A");

		// System.out.println(graph.bfs("A", "F"));
		//
		// System.out.println(graph.dfs("A", "F"));
		//
		// graph.dft();

		// System.out.println(graph.isCyclic());
		// System.out.println(graph.isConnected());
		// System.out.println(graph.isTree());
		// System.out.println(graph.getCC());
		//
		// System.out.println(graph.isBipartite());

		// System.out.println(graph.prims());
		graph.prims().display();
	}
}

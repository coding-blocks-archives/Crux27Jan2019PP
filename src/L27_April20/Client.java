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

		graph.addEdge("A", "B", 10);
		graph.addEdge("A", "D", 2);
		graph.addEdge("B", "C", 3);
		graph.addEdge("C", "D", 5);
		graph.addEdge("D", "E", 8);
		graph.addEdge("E", "F", 1);
		graph.addEdge("E", "G", 9);
		graph.addEdge("F", "G", 3);

		// graph.display();

		System.out.println(graph);

		// graph.removeEdge("D", "E");
		// graph.removeVertex("A");

		// System.out.println(graph.hasPath("A", "F", new HashMap<>()));
		// System.out.println(graph);

		// graph.printAllPaths("A", "F", new HashMap<>(), "A");

		System.out.println(graph.bfs("A", "F"));

		System.out.println(graph.dfs("A", "F"));

		graph.dft();
	}
}

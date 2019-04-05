package L19_March30;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 30-Mar-2019
 *
 */

public class Client {

	// 10 3 20 2 50 0 60 0 30 0 40 2 70 0 80 0
	// 10 3 20 2 50 0 60 2 100 2 160 0 170 0 110 0 30 0 40 3 70 0 80 2 120 2 140 0
	// 150 0 130 0 90 0
	public static void main(String[] args) {

		GenericTree gt = new GenericTree();
		gt.display();

		System.out.println(gt.size());
		System.out.println(gt.max());
		System.out.println(gt.find(80));
		System.out.println(gt.ht());

		// gt.mirror();
		// gt.display();
		// gt.printAtLevel(2);
		//
		// // gt.postorder();
		//
		// gt.levelOrder();
		//
		// gt.levelOrderLinewise();
		//
		// gt.levelOrderZZ();

		gt.multiSolver(10);

	}
}

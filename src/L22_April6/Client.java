package L22_April6;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Apr-2019
 *
 */

public class Client {

	public static void main(String[] args) {

		int[] in = { 10, 20, 30, 40, 50, 60, 70 };

		BST bst = new BST(in);
		bst.display();

		System.out.println(bst.ht());
		System.out.println(bst.size());
		System.out.println(bst.find(100));
		System.out.println(bst.max());

		// bst.printInRange(25, 65);

		// bst.replaceWithSumLarger();

		bst.display();

		bst.add(35);
		bst.add(37);

		bst.display();

		bst.remove(40);

		bst.display();
	}
}

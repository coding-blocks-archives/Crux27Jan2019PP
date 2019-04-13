package L20_March31;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 31-Mar-2019
 *
 */

public class BTClient {

	// 10 true 20 true 40 false false true 50 false false true 30 false true 40
	// false false
	// 10 true 20 true 40 true 50 true 60 true 70 false false false false false true
	// 80 false true 90 false true 100 false false true 30 false false
	public static void main(String[] args) {

		// int[] pre = { 10, 20, 40, 50, 70, 30, 60 };
		// int[] post = { 40, 70, 50, 20, 60, 30, 10 };
		// int[] in = { 40, 20, 50, 70, 10, 30, 60 };

		// vint[] pre = { 80, 40, 20, 10, 25, 50, 100, 90, 150 };
		// int[] in = { 10, 20, 25, 40, 50, 80, 90, 100, 150 };

		int[] pre = { 10, 20, 40, 80, 90, 120, 50, 100, 110, 30, 60, 70 };
		int[] in = { 80, 40, 120, 90, 20, 50, 100, 110, 10, 60, 30, 70 };

		BinaryTree bt = new BinaryTree(pre, in);
		bt.display();
		System.out.println(bt.max());
		System.out.println(bt.size());
		System.out.println(bt.ht());
		System.out.println(bt.find(500));

		System.out.println(bt.diameter());
		System.out.println(bt.diameter2());

		System.out.println(bt.isBalanced());
		System.out.println(bt.isBalanced2());

		bt.preorder();
		bt.preorderI();

		System.out.println(bt.isTreeBST());
		
		bt.verticalOrder();
	}
}

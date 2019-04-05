package L20_March31;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 31-Mar-2019
 *
 */

public class BTClient {

	// 10 true 20 true 40 false false true 50 false false true 30 false true 40 false false
	// 10 true 20 true 40 true 50 true 60 true 70 false false false false false true 80 false true 90 false true 100 false false true 30 false false
	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		bt.display();
		System.out.println(bt.max());
		System.out.println(bt.size());
		System.out.println(bt.ht());
		System.out.println(bt.find(500));

		System.out.println(bt.diameter());
		System.out.println(bt.diameter2());

//		System.out.println(bt.isBalanced());
//		System.out.println(bt.isBalanced2());
//
//		bt.preOrder();
//		bt.preorderI();
	}
}

package L20_March31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

import L22_April6.BST;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 31-Mar-2019
 *
 */

public class BinaryTree {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		this.root = construct(null, false);
	}

	private Node construct(Node parent, boolean ilc) {

		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {

			if (ilc) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}

		}

		int item = scn.nextInt();

		Node nn = new Node();
		nn.data = item;

		System.out.println(nn.data + " has left child ?");
		boolean hlc = scn.nextBoolean();

		if (hlc) {
			nn.left = construct(nn, true);
		}

		System.out.println(nn.data + " has right child ?");
		boolean hrc = scn.nextBoolean();

		if (hrc) {
			nn.right = construct(nn, false);
		}

		return nn;

	}

	public BinaryTree(int[] pre, int[] in) {
		this.root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

		if (plo > phi || ilo > ihi) {
			return null;
		}

		Node nn = new Node();
		nn.data = pre[plo];

		int si = -1;

		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == pre[plo]) {
				si = i;
				break;
			}

		}

		int nel = si - ilo;

		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		// nn.left = construct(pre, plo, plo + nel-1, in, ilo, si - 1);
		// nn.right = construct(pre, plo + nel, phi-1, in, si + 1, ihi);

		return nn;
	}

	public void display() {
		System.out.println("---------------");
		display(this.root);
		System.out.println("---------------");
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";

		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}

		str += " -> " + node.data + " <- ";

		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}

		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {

		if (node == null) {
			return 0;
		}

		int ls = size(node.left);
		int rs = size(node.right);

		return ls + rs + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int lm = max(node.left);
		int rm = max(node.right);

		return Math.max(node.data, Math.max(lm, rm));
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}

		if (node.data == item) {
			return true;
		}

		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);

		return lf || rf;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {

		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);

		return Math.max(lh, rh) + 1;

	}

	public int diameter() {
		return diameter(this.root);
	}

	private int diameter(Node node) {

		if (node == null) {
			return 0;
		}

		int ld = diameter(node.left);
		int rd = diameter(node.right);

		int sp = ht(node.left) + ht(node.right) + 2;

		return Math.max(sp, Math.max(ld, rd));
	}

	private class DiaPair {
		int diameter = 0;
		int ht = -1;
	}

	public int diameter2() {
		return diameter2(this.root).diameter;
	}

	private DiaPair diameter2(Node node) {

		if (node == null) {
			DiaPair bdp = new DiaPair();
			return bdp;
		}
		DiaPair ldp = diameter2(node.left);
		DiaPair rdp = diameter2(node.right);

		DiaPair sdp = new DiaPair();

		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;

		int ld = ldp.diameter;
		int rd = rdp.diameter;

		int sp = ldp.ht + rdp.ht + 2;

		sdp.diameter = Math.max(sp, Math.max(ld, rd));

		return sdp;

	}

	public boolean isBalanced() {
		return isBalanced(this.root);
	}

	private boolean isBalanced(Node node) {

		if (node == null) {
			return true;
		}

		boolean lb = isBalanced(node.left);
		boolean rb = isBalanced(node.right);

		int bf = ht(node.left) - ht(node.right);

		if ((bf == -1 || bf == 0 || bf == 1) && lb && rb) {
			return true;
		} else {
			return false;
		}

	}

	private class BalPair {
		boolean isBal = true;
		int ht = -1;
	}

	public boolean isBalanced2() {
		return isBalanced2(this.root).isBal;
	}

	private BalPair isBalanced2(Node node) {

		if (node == null) {
			return new BalPair();
		}

		BalPair lbp = isBalanced2(node.left);
		BalPair rbp = isBalanced2(node.right);

		BalPair sbp = new BalPair();

		sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;

		boolean lb = lbp.isBal;
		boolean rb = rbp.isBal;

		int bf = lbp.ht - rbp.ht;

		if ((bf == -1 || bf == 0 || bf == 1) && lb && rb) {
			sbp.isBal = true;
		} else {
			sbp.isBal = false;
		}

		return sbp;

	}

	public void preorder() {
		preorder(this.root);
		System.out.println();
	}

	// NLR : Pre
	// LNR : In
	// LRN : Post
	// NRL : Post Rev
	// RNL : In Rev
	// RLN : Pre Rev
	private void preorder(Node node) {

		if (node == null) {
			return;
		}

		// N
		System.out.print(node.data + " ");

		// L
		preorder(node.left);

		// R
		preorder(node.right);

	}

	private class Pair {

		Node node;
		boolean sd;
		boolean ld;
		boolean rd;

	}

	public void preorderI() {

		if (this.root == null) {
			return;
		}

		Stack<Pair> stack = new Stack<>();

		Pair sp = new Pair();
		sp.node = this.root;

		stack.push(sp);

		while (!stack.isEmpty()) {

			Pair tp = stack.peek();

			// if (tp.node == null) {
			// stack.pop();
			// continue;
			// }

			if (tp.sd == false) {
				System.out.print(tp.node.data + " ");
				tp.sd = true;
			} else if (tp.ld == false) {

				Pair np = new Pair();
				np.node = tp.node.left;

				if (np.node != null)
					stack.push(np);

				tp.ld = true;
			} else if (tp.rd == false) {

				Pair np = new Pair();
				np.node = tp.node.right;

				if (np.node != null)
					stack.push(np);

				tp.rd = true;
			} else {
				stack.pop();
			}

		}
		System.out.println();

	}

	private class BSTPair {
		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}

	public boolean isTreeBST() {
		return isTreeBST(this.root).isBST;
	}

	private BSTPair isTreeBST(Node node) {

		if (node == null) {
			return new BSTPair();
		}

		BSTPair lp = isTreeBST(node.left);
		BSTPair rp = isTreeBST(node.right);

		BSTPair sp = new BSTPair();

		sp.max = Math.max(node.data, Math.max(lp.max, rp.max));
		sp.min = Math.min(node.data, Math.min(lp.min, rp.min));

		if (lp.isBST && rp.isBST && node.data > lp.max && node.data < rp.min) {
			sp.isBST = true;
		} else {
			sp.isBST = false;
		}

		return sp;

	}

	private class VOPair implements Comparable<VOPair> {

		int data;
		int hl;

		@Override
		public String toString() {
			return this.data + "";
		}

		@Override
		public int compareTo(VOPair o) {
			return this.hl - o.hl;
		}

	}

	public void verticalOrder() {
		HashMap<Integer, ArrayList<VOPair>> map = new HashMap<>();

		verticalOrder(this.root, 0, 0, map);

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());

		Collections.sort(keys);

		for (int key : keys) {

			ArrayList<VOPair> level = map.get(key);
			Collections.sort(level);

			System.out.println(key + "->" + level);

		}

		System.out.println(map);
	}

	private void verticalOrder(Node node, int vlevel, int hlevel, HashMap<Integer, ArrayList<VOPair>> map) {

		if (node == null) {
			return;
		}

		if (!map.containsKey(vlevel)) {
			map.put(vlevel, new ArrayList<>());
		}

		VOPair np = new VOPair();
		np.data = node.data;
		np.hl = hlevel;

		map.get(vlevel).add(np);

		verticalOrder(node.left, vlevel - 1, hlevel + 1, map);
		verticalOrder(node.right, vlevel + 1, hlevel + 1, map);

	}

}

package L19_March30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 30-Mar-2019
 *
 */

public class GenericTree {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {
		this.root = construct(null, -1);
	}

	private Node construct(Node parent, int ith) {

		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {
			System.out.println("Enter the data for " + ith + " child of " + parent.data);
		}

		int item = scn.nextInt();

		Node nn = new Node();
		nn.data = item;

		System.out.println("No of children for " + nn.data + " ?");
		int noc = scn.nextInt();

		for (int i = 0; i < noc; i++) {
			Node child = construct(nn, i);
			nn.children.add(child);
		}

		return nn;

	}

	public void display() {
		System.out.println("------------------");
		display(this.root);
		System.out.println("------------------");
	}

	private void display(Node node) {

		// self work
		String str = node.data + " -> ";

		for (Node child : node.children) {
			str += child.data + ", ";
		}

		str += ".";
		System.out.println(str);

		// smaller prob
		for (int i = 0; i < node.children.size(); i++) {
			display(node.children.get(i));
		}
	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {

		int ts = 0;

		for (Node child : node.children) {
			int cs = size(child);
			ts += cs;
		}

		return ts + 1;

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		int tm = node.data;

		for (Node child : node.children) {

			int cm = max(child);

			if (cm > tm) {
				tm = cm;
			}
		}

		return tm;

	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {

		if (node.data == item) {
			return true;
		}

		for (Node child : node.children) {

			boolean cf = find(child, item);

			if (cf)
				return true;

		}

		return false;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {

		int th = -1;

		for (Node child : node.children) {

			int ch = ht(child);

			if (ch > th) {
				th = ch;
			}
		}

		return th + 1;

	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);
		}

		int left = 0;
		int right = node.children.size() - 1;

		while (left < right) {

			Node ln = node.children.get(left);
			Node rn = node.children.get(right);

			node.children.set(left, rn);
			node.children.set(right, ln);

			left++;
			right--;

		}

	}

	public void printAtLevel(int level) {
		printAtLevel(this.root, level, 0);
	}

	private void printAtLevel(Node node, int level, int cl) {

		if (cl == level) {
			System.out.println(node.data);
			return;
		}

		for (Node child : node.children) {
			printAtLevel(child, level, cl + 1);
		}
	}

	private void display2(Node node) {

		System.out.println("hii " + node.data);

		// smaller prob
		for (Node child : node.children) {
			System.out.println("going towards " + child.data);
			display2(child);
			System.out.println("coming back from " + child.data);
		}

		System.out.println("bye " + node.data);
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {

		// N
		System.out.println(node.data);

		// C
		for (Node child : node.children) {
			preorder(child);
		}

	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {

		// C
		for (Node child : node.children) {
			postorder(child);
		}

		// N
		System.out.println(node.data);

	}

	public void levelOrder() {

		LinkedList<Node> queue = new LinkedList<>();

		queue.addLast(this.root);

		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();

			System.out.print(rn.data + " ");

			for (Node child : rn.children) {
				queue.addLast(child);
			}

			System.out.println();

		}

		System.out.println();
	}

	public void levelOrderLinewise() {

		LinkedList<Node> primary = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();

		primary.addLast(this.root);

		while (!primary.isEmpty()) {

			Node rn = primary.removeFirst();

			System.out.print(rn.data + " ");

			for (Node child : rn.children) {
				helper.addLast(child);
			}

			if (primary.isEmpty()) {

				System.out.println();
				primary = helper;
				helper = new LinkedList<>();
			}

		}

	}

	public void levelOrderZZ() {

		int count = 0;

		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> stack = new LinkedList<>();

		queue.addLast(this.root);

		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();

			System.out.print(rn.data + " ");

			if (count % 2 == 0) {
				for (Node child : rn.children) {
					stack.addFirst(child);
				}
			} else {
				for (int i = rn.children.size() - 1; i >= 0; i--) {
					stack.addFirst(rn.children.get(i));
				}
			}

			if (queue.isEmpty()) {
				System.out.println();
				queue = stack;
				stack = new LinkedList<>();
				count++;
			}

		}

	}

	private class HeapMover {

		int size = 0;
		int max = Integer.MIN_VALUE;
		int ht = 0;
		boolean find;

		Node pred = null;
		Node succ = null;

	}

	public void multiSolver(int item) {
		HeapMover mover = new HeapMover();
		multiSolver(this.root, mover, 0, item);

		System.out.println("Size : " + mover.size);
		System.out.println("Max : " + mover.max);
		System.out.println("Ht : " + mover.ht);
		System.out.println("Find : " + mover.find);
		System.out.println("Pred :" + (mover.pred == null ? null : mover.pred.data));
		System.out.println("succ : " + (mover.succ == null ? null : mover.succ.data));
	}

	private void multiSolver(Node node, HeapMover mover, int cl, int item) {

		mover.size++;

		if (node.data > mover.max) {
			mover.max = node.data;
		}

		if (cl > mover.ht) {
			mover.ht = cl;
		}

		if (mover.find == true && mover.succ == null) {
			mover.succ = node;
		}

		if (node.data == item) {
			mover.find = true;
		}

		if (mover.find == false) {
			mover.pred = node;
		}

		for (Node child : node.children) {
			multiSolver(child, mover, cl + 1, item);
		}

	}

}

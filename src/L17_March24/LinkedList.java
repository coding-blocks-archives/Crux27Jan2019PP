package L17_March24;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 24-Mar-2019
 *
 */

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public int getFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		return this.head.data;
	}

	// O(1)
	public int getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		return this.tail.data;
	}

	// O(n)
	public int getAt(int k) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		if (k < 0 || k >= this.size) {
			throw new Exception("Invalid Index.");
		}

		Node temp = this.head;

		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}

		return temp.data;

	}

	// O(n)
	private Node getNodeAt(int k) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		if (k < 0 || k >= this.size) {
			throw new Exception("Invalid Index.");
		}

		Node temp = this.head;

		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}

		return temp;

	}

	public void display() {

		System.out.println("---------------");

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("---------------");
	}

	// O(1)
	public void addLast(int item) {

		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size > 0)
			this.tail.next = nn;

		// data members
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}

	}

	// O(1)
	public void addFirst(int item) {

		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		nn.next = this.head;

		// data members
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}

	}

	// O(n)
	public void addAt(int k, int item) throws Exception {

		if (k < 0 || k > this.size) {
			throw new Exception("Invalid Index.");
		}

		if (k == 0) {
			addFirst(item);
		} else if (k == this.size) {
			addLast(item);
		} else {

			// create a new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// links create
			Node nm1 = getNodeAt(k - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;

			// data member update
			this.size++;

		}

	}

	// O(1)
	public int removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		int temp = this.head.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}

		return temp;

	}

	// O(n)
	public int removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		int temp = this.tail.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {

			Node sm2 = getNodeAt(this.size - 2);
			sm2.next = null; // link break
			this.tail = sm2; // tail update
			this.size--;
		}

		return temp;

	}

	// O(n)
	public int removeAt(int k) throws Exception {

		if (k < 0 || k >= this.size) {
			throw new Exception("Invalid Index.");
		}

		if (k == 0) {
			return removeFirst();
		} else if (k == this.size - 1) {
			return removeLast();
		} else {

			Node nm1 = getNodeAt(k - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;

			this.size--;

			return n.data;

		}

	}

	public void RDataIteratively() throws Exception {

		int left = 0;
		int right = this.size - 1;

		while (left < right) {

			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;

			left++;
			right--;
		}
	}

	public void RPointerIteratively() {

		Node prev = this.head;
		Node curr = this.head.next;

		while (curr != null) {

			Node ahead = curr.next;

			curr.next = prev;

			prev = curr;
			curr = ahead;

		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		this.tail.next = null;
	}

	public void RPointerRecursively() {
		RPointerRecursively(this.head, this.head.next);

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		this.tail.next = null;

	}

	private void RPointerRecursively(Node prev, Node curr) {

		if (curr == null) {
			return;
		}

		// Node ahead = curr.next;
		// curr.next = prev;
		// RPointerRecursively(curr, ahead);

		RPointerRecursively(curr, curr.next);
		curr.next = prev;

	}

	// public void RDataRecursively() {
	//
	// }
	//
	// private void RDataRecursively(Node ...) {
	//
	// }

}

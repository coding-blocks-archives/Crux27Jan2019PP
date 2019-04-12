package Assignments.April12;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 12-Apr-2019
 *
 */

public class delete_node {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

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

	public void deleteNode() {

		Node curr = this.head;
		Node max = this.head;

		Node temp;

		while ( curr != null && curr.next != null) {

			// Condition to remove the curr.next Node
			if (curr.next.data < max.data) {

				temp = curr.next;
				curr.next = temp.next;
				temp = null;
			} else {
				
				curr = curr.next;
				max = curr;
			}
		}
	}

	public static void main(String[] args) {

	}

}

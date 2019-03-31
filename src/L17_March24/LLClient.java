package L17_March24;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 24-Mar-2019
 *
 */

public class LLClient {

	public static void main(String[] args) throws Exception {

		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);

		list.addLast(70);
		list.addLast(80);
		// list.addLast(90);
		list.display();
		// System.out.println(list.getFirst());
		// System.out.println(list.getLast());
		// // System.out.println(list.getAt(5));
		//
		// list.display();
		// list.addFirst(60);
		// list.addFirst(70);
		//
		// list.display();
		// System.out.println(list.removeFirst());
		// list.display();
		// list.addAt(3, 300);
		// list.display();
		//
		// list.RDataIteratively();
		// list.display();
		//
		// list.RPointerIteratively();
		// list.display();
		//
		// list.RPointerRecursively();
		// list.display();

		// list.RDataRecursively();
		list.display();

		list.fold();

		list.display();

		System.out.println(list.mid());
		System.out.println(list.midRec());

//		System.out.println(list.kthFromLast(9));

		list.display();
		list.kReverse(3);

		list.display();

	}
}

package L16_March23;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 23-Mar-2019
 *
 */

public class DSClient {

	public static void main(String[] args) throws Exception {

		DynamicStack ds = new DynamicStack();

		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.push(70);

		ds.display();

		// testing of displayReverse
		displayReverse(ds);
		ds.display(); // should display the original stack

		// testing of actualReverse
		actualReverse(ds, new DynamicStack());
		ds.display();

		int[] arr = { 20, 10, 5, 15, 3, 2, 30, 40, 35, 6 };
		nextGreaterElement(arr);

		int[] ans = nextGreaterElement2(arr);

		for (int val : ans) {
			System.out.print(val + " ");
		}
		System.out.println();

		int[] prices = { 100, 20, 30, 90, 60, 50, 70, 80, 120, 110, 50 };
		int[] spans = stockSpan(prices);

		for (int val : spans) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void displayReverse(DynamicStack stack) throws Exception {

		if (stack.isEmpty()) {
			return;
		}

		int temp = stack.pop();
		displayReverse(stack);
		System.out.println(temp);
		stack.push(temp);

	}

	public static void actualReverse(DynamicStack stack, DynamicStack helper) throws Exception {

		if (stack.isEmpty()) {
			actualReverseHelper(stack, helper);
			return;
		}

		int temp = stack.pop();
		helper.push(temp);

		actualReverse(stack, helper);

	}

	public static void actualReverseHelper(DynamicStack stack, DynamicStack helper) throws Exception {

		if (helper.isEmpty()) {
			return;
		}

		int temp1 = helper.pop();
		actualReverseHelper(stack, helper);
		stack.push(temp1);

	}

	public static void nextGreaterElement(int[] arr) throws Exception {

		DynamicStack stack = new DynamicStack();

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[i] > stack.peek()) {
				System.out.println(stack.pop() + " -> " + arr[i]);
			}

			stack.push(arr[i]);

		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " -> -1");
		}

	}

	public static int[] nextGreaterElement2(int[] arr) throws Exception {

		int[] ans = new int[arr.length];

		DynamicStack stack = new DynamicStack();

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
				ans[stack.pop()] = arr[i];
			}

			stack.push(i);

		}

		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}

		return ans;

	}

	public static int[] stockSpan(int[] arr) throws Exception {

		int[] ans = new int[arr.length];

		DynamicStack stack = new DynamicStack();

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - stack.peek();
			}

			stack.push(i);

		}

		return ans;

	}
}

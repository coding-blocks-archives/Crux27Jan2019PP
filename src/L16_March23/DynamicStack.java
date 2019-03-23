package L16_March23;

import L15_March22.Stack;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 23-Mar-2019
 *
 */

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {

		if (isFull()) {

			// create an array of twice size
			int[] na = new int[2 * this.data.length];

			// copy prev elements
			for (int i = 0; i <= this.tos; i++) {
				na[i] = this.data[i];
			}

			// reference change
			this.data = na;

		}

		super.push(item);

	}

}

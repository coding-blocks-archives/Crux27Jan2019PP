package L16_March23;

import L15_March22.Queue;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 23-Mar-2019
 *
 */

public class DynamicQueue extends Queue {

	@Override
	public void enqueue(int item) throws Exception {

		if (isFull()) {

			int[] na = new int[2 * this.data.length];

			for (int i = 0; i < this.size; i++) {
				int idx = (i + this.front) % this.data.length;
				na[i] = this.data[idx];
			}

			this.data = na;
			this.front = 0;

		}
		
		super.enqueue(item);

	}
}

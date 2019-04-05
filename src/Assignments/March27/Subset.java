package Assignments.March27;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Mar-2019
 *
 */

public class Subset {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };

		subsetTarget(arr, 0, 0, "", 3);
	}

	public static void subsetTarget(int[] arr, int vidx, int sum, String asf, int target) {

		if (vidx == arr.length) {
			if (sum == target) {
				System.out.println(asf);
			}

			return;
		}
		
		subsetTarget(arr, vidx + 1, sum + arr[vidx], asf + arr[vidx] + " ", target);		
		subsetTarget(arr, vidx + 1, sum, asf, target);// no
		
	}
}

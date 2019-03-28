package Assignments.March27;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Mar-2019
 *
 */

public class SplitArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 3, 4, 5 };
		split(arr, 0, 0, "", 0, "");
	}

	public static void split(int[] arr, int vidx, int g1sum, String g1asf, int g2sum, String g2asf) {

		if (vidx == arr.length) {
			if (g1sum == g2sum) {
				System.out.println(g1asf + "and " + g2asf);
			}
			return;
		}
		
		split(arr, vidx + 1, g1sum + arr[vidx], g1asf + arr[vidx] + " ", g2sum, g2asf);
		split(arr, vidx + 1, g1sum, g1asf, g2sum + arr[vidx], g2asf + arr[vidx] + " ");
	}
}

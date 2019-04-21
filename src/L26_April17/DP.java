package L26_April17;

import java.util.Arrays;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Apr-2019
 *
 */

public class DP {

	public static void main(String[] args) {

		// System.out.println(fibonacci(n));
		// System.out.println(fibonacciTD(n, new int[n + 1]));
		// System.out.println(fibonacciBU(n));

		// System.out.println(boardPathTD(0, n, new int[n]));
		// System.out.println(boardPathBU(n));
		// System.out.println(boardPathBUSE(n));

		// System.out.println(mazePath(0, 0, n, n, new int[n + 1][n + 1]));
		// System.out.println(mazePathBU(n, n));
		// System.out.println(mazePathBUSE(n, n));

		long start = System.currentTimeMillis();

		int n = 4;

		String s1 = "saturdabsdhjgfyuegsfyuwgeuyfy";
		String s2 = "sundaydhcusudfcheuiyfheuiyfheyrui";
		// System.out.println(LCS(s1, s2));

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				strg[i][j] = -1;
			}
		}

		// System.out.println(LCSTD(s1, s2, strg));
		// System.out.println(LCSBU(s1, s2));

		// System.out.println(EditDistance(s1, s2));
		// System.out.println(EditDistanceBU(s1, s2));

		// int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		// System.out.println(MCMTD(arr, 0, arr.length - 1, new
		// int[arr.length][arr.length]));
		// System.out.println(MCMBU(arr));

		int[] arr = { 2, 3, 5, 1, 4 };

		// System.out.println(WineProblem(arr, 0, arr.length - 1, 1));
		// System.out.println(WineProblemTD(arr, 0, arr.length - 1, new
		// int[arr.length][arr.length]));
		// System.out.println(WineProblemBU(arr));

		int[] wt = { 1, 4, 5, 6, 7, 3, 4, 5 };
		int[] price = { 7, 8, 9, 10, 4, 5, 7, 8 };

		int cap = 7;
		// System.out.println(Knapsack(wt, price, cap, 0, new int[wt.length][cap + 1]));
		// System.out.println(KnapsackBU(wt, price, cap));

		int[] arrrr = { 40, 60, 20 };

		// System.out.println(Mixtures(arrrr, 0, arrrr.length - 1));
		// System.out.println(MixturesBU(arrrr));

		// String src = "baaab";
		// String pat = "b*ab*";
		// System.out.println(WildcardMatchingTD(src, pat, new int[src.length() +
		// 1][pat.length() + 1]));
		// System.out.println(WildCardMatchingBU(src, pat));

		int[] array = { 0, 1, 50, 8, 90, 10, 17, 17, 20 };
		System.out.println(rodCut(array, array.length - 1, new int[array.length]));
		System.out.println(rodCutBU(array, array.length - 1));

		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}

	public static int fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);

		int fn = fnm1 + fnm2;

		return fn;

	}

	public static int fibonacciTD(int n, int[] strg) {

		if (n == 0 || n == 1) {
			return n;
		}

		if (strg[n] != 0) { // reuse
			return strg[n];
		}

		int fnm1 = fibonacciTD(n - 1, strg);
		int fnm2 = fibonacciTD(n - 2, strg);

		int fn = fnm1 + fnm2;

		strg[n] = fn; // problem -> solution

		return fn;

	}

	public static int fibonacciBU(int n) {

		int[] strg = new int[n + 1];

		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i < strg.length; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];

	}

	public static int fibonacciBUSE(int n) {

		if (n == 0) {
			return 0;
		}

		int[] strg = new int[2];

		strg[0] = 0;
		strg[1] = 1;

		for (int slide = 1; slide <= n - 1; slide++) {

			int sum = strg[0] + strg[1];

			strg[0] = strg[1];
			strg[1] = sum;
		}

		return strg[1];

	}

	public static int boardPathTD(int curr, int end, int[] strg) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		if (strg[curr] != 0) { // reuse
			return strg[curr];
		}

		int sum = 0;

		for (int dice = 1; dice <= 6; dice++) {
			sum += boardPathTD(curr + dice, end, strg);
		}

		strg[curr] = sum;// store

		return sum;
	}

	public static int boardPathBU(int end) {

		int[] strg = new int[end + 6];

		strg[end] = 1;

		for (int i = end - 1; i >= 0; i--) {

			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];

		}

		return strg[0];

	}

	public static int boardPathBUSE(int end) {

		int[] strg = new int[6];

		strg[0] = 1;

		for (int slide = 1; slide <= end; slide++) {

			int sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];

			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;

		}

		return strg[0];

	}

	public static int mazePath(int cr, int cc, int er, int ec, int[][] strg) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}

		int ch = mazePath(cr, cc + 1, er, ec, strg);
		int cv = mazePath(cr + 1, cc, er, ec, strg);

		strg[cr][cc] = ch + cv;

		return ch + cv;
	}

	public static int mazePathBU(int er, int ec) {

		int[][] strg = new int[er + 2][ec + 2];

		for (int row = er; row >= 0; row--) {

			for (int col = ec; col >= 0; col--) {

				if (row == er && col == ec) {
					strg[row][col] = 1;
				} else {
					strg[row][col] = strg[row + 1][col] + strg[row][col + 1];
				}
			}

		}

		return strg[0][0];

	}

	public static int mazePathBUSE(int er, int ec) {

		int[] strg = new int[ec + 1];

		Arrays.fill(strg, 1);

		for (int row = er - 1; row >= 0; row--) {

			for (int col = ec - 1; col >= 0; col--) {
				strg[col] = strg[col] + strg[col + 1];
			}
		}

		return strg[0];

	}

	public static int LCS(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {
			ans = LCS(ros1, ros2) + 1;

		} else {

			int o1 = LCS(s1, ros2);
			int o2 = LCS(ros1, s2);

			ans = Math.max(o1, o2);

		}

		return ans;

	}

	public static int LCSTD(String s1, String s2, int[][] strg) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		if (strg[s1.length()][s2.length()] != -1) {
			return strg[s1.length()][s2.length()];
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {
			ans = LCSTD(ros1, ros2, strg) + 1;

		} else {

			int o1 = LCSTD(s1, ros2, strg);
			int o2 = LCSTD(ros1, s2, strg);

			ans = Math.max(o1, o2);

		}

		strg[s1.length()][s2.length()] = ans;

		return ans;

	}

	public static int LCSBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length() - 1; row >= 0; row--) {

			for (int col = s2.length() - 1; col >= 0; col--) {

				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1] + 1;
				} else {

					int o1 = strg[row][col + 1];
					int o2 = strg[row + 1][col];

					strg[row][col] = Math.max(o1, o2);

				}

			}

		}

		return strg[0][0];

	}

	public static int EditDistance(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {
			ans = EditDistance(ros1, ros2);
		} else {

			int i = EditDistance(ros1, s2);
			int d = EditDistance(s1, ros2);
			int r = EditDistance(ros1, ros2);

			ans = Math.min(r, Math.min(i, d)) + 1;

		}

		return ans;

	}

	public static int EditDistanceBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length(); row >= 0; row--) {

			for (int col = s2.length(); col >= 0; col--) {

				if (row == s1.length()) {
					strg[row][col] = s2.length() - col;
					continue;
				}

				if (col == s2.length()) {
					strg[row][col] = s1.length() - row;
					continue;
				}

				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1];
				} else {

					int i = strg[row + 1][col];
					int d = strg[row][col + 1];
					int r = strg[row + 1][col + 1];

					strg[row][col] = Math.min(r, Math.min(i, d)) + 1;

				}

			}

		}

		return strg[0][0];

	}

	public static int MCMTD(int[] arr, int si, int ei, int[][] strg) {

		if (si + 1 == ei) {
			return 0;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for (int k = si + 1; k <= ei - 1; k++) {

			int fh = MCMTD(arr, si, k, strg); // resultant : arr[si] * arr[k]
			int sh = MCMTD(arr, k, ei, strg); // resultant : arr[k] * arr[ei]

			int sw = arr[si] * arr[k] * arr[ei];

			int total = fh + sh + sw;

			if (total < min) {
				min = total;
			}

		}

		strg[si][ei] = min;

		return min;

	}

	public static int MCMBU(int[] arr) {

		int n = arr.length;
		int[][] strg = new int[n][n];

		// diagonally fill
		for (int slide = 1; slide <= n - 2; slide++) {

			for (int si = 0; si <= n - slide - 2; si++) {

				int ei = si + slide + 1;

				int min = Integer.MAX_VALUE;

				for (int k = si + 1; k <= ei - 1; k++) {

					int fh = strg[si][k];
					int sh = strg[k][ei];

					int sw = arr[si] * arr[k] * arr[ei];

					int total = fh + sh + sw;

					if (total < min) {
						min = total;
					}

				}

				strg[si][ei] = min;

			}

		}

		return strg[0][n - 1];

	}

	public static int WineProblem(int[] arr, int si, int ei, int yr) {

		if (si == ei) {
			return arr[si] * yr;
		}

		int start = WineProblem(arr, si + 1, ei, yr + 1) + arr[si] * yr;
		int end = WineProblem(arr, si, ei - 1, yr + 1) + arr[ei] * yr;

		int ans = Math.max(start, end);

		return ans;

	}

	public static int WineProblemTD(int[] arr, int si, int ei, int[][] strg) {

		int yr = arr.length - (ei - si + 1) + 1;

		if (si == ei) {
			return arr[si] * yr;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int start = WineProblemTD(arr, si + 1, ei, strg) + arr[si] * yr;
		int end = WineProblemTD(arr, si, ei - 1, strg) + arr[ei] * yr;

		int ans = Math.max(start, end);

		strg[si][ei] = ans;

		return ans;

	}

	public static int WineProblemBU(int[] arr) {

		int n = arr.length;

		int[][] strg = new int[n][n];

		for (int slide = 0; slide <= n - 1; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;

				int yr = arr.length - (ei - si + 1) + 1;

				if (si == ei) {
					strg[si][ei] = arr[si] * yr;
				} else {

					int start = strg[si + 1][ei] + arr[si] * yr;
					int end = strg[si][ei - 1] + arr[ei] * yr;

					int ans = Math.max(start, end);

					strg[si][ei] = ans;
				}

			}

		}

		return strg[0][n - 1];

	}

	public static int Knapsack(int[] wt, int[] price, int cap, int vidx, int[][] strg) {

		if (vidx == wt.length) {
			return 0;
		}

		if (strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}

		int include = 0;

		if (wt[vidx] <= cap) {
			include = Knapsack(wt, price, cap - wt[vidx], vidx + 1, strg) + price[vidx];
		}

		int exclude = Knapsack(wt, price, cap, vidx + 1, strg);

		int ans = Math.max(include, exclude);

		strg[vidx][cap] = ans;

		return ans;
	}

	public static int KnapsackBU(int[] wt, int[] price, int cap) {

		int nr = wt.length + 1;
		int nc = cap + 1;

		int[][] strg = new int[nr][nc];

		for (int row = 1; row < strg.length; row++) {

			for (int col = 1; col < strg[0].length; col++) {

				int include = 0;

				if (col >= wt[row - 1]) {
					include = price[row - 1] + strg[row - 1][col - wt[row - 1]];
				}

				int exclude = strg[row - 1][col];

				strg[row][col] = Math.max(include, exclude);

			}
		}

		return strg[nr - 1][nc - 1];
	}

	public static int Mixtures(int[] arr, int si, int ei) {

		if (si == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;

		for (int k = si; k <= ei - 1; k++) {

			int fh = Mixtures(arr, si, k);
			int sh = Mixtures(arr, k + 1, ei);

			int sw = color(arr, si, k) * color(arr, k + 1, ei);

			int total = fh + sh + sw;

			if (total < min) {
				min = total;
			}

		}

		return min;

	}

	public static int color(int[] arr, int si, int ei) {

		int sum = 0;

		for (int i = si; i <= ei; i++) {
			sum += arr[i];
		}

		return sum % 100;
	}

	public static int MixturesBU(int[] arr) {

		int n = arr.length;

		int[][] strg = new int[arr.length][arr.length];

		for (int slide = 1; slide <= n - 1; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;

				int min = Integer.MAX_VALUE;

				for (int k = si; k <= ei - 1; k++) {

					int fh = strg[si][k];
					int sh = strg[k + 1][ei];

					int sw = color(arr, si, k) * color(arr, k + 1, ei);

					int total = fh + sh + sw;

					if (total < min) {
						min = total;
					}

				}

				strg[si][ei] = min;

			}

		}

		return strg[0][n - 1];
	}

	public static boolean WildcardMatchingTD(String src, String pat, int[][] strg) {

		if (src.length() == 0 && pat.length() == 0) {
			return true;
		}

		if (src.length() != 0 && pat.length() == 0) {
			return false;
		}

		if (src.length() == 0 && pat.length() != 0) {

			for (int i = 0; i < pat.length(); i++) {
				if (pat.charAt(i) != '*') {
					return false;
				}
			}

			return true;
		}

		if (strg[src.length()][pat.length()] != 0) {

			if (strg[src.length()][pat.length()] == 1)
				return false;
			else
				return true;

		}

		char chs = src.charAt(0);
		char chp = pat.charAt(0);

		String ros = src.substring(1);
		String rop = pat.substring(1);

		boolean ans;

		if (chp == '?' || chp == chs) {
			ans = WildcardMatchingTD(ros, rop, strg);
		} else if (chp == '*') {
			ans = WildcardMatchingTD(ros, pat, strg) || WildcardMatchingTD(src, rop, strg);
		} else {
			ans = false;
		}

		if (ans == true)
			strg[src.length()][pat.length()] = 2;
		else
			strg[src.length()][pat.length()] = 1;

		return ans;

	}

	public static boolean WildCardMatchingBU(String src, String pat) {

		boolean[][] strg = new boolean[src.length() + 1][pat.length() + 1];

		for (int row = strg.length - 1; row >= 0; row--) {

			for (int col = strg[0].length - 1; col >= 0; col--) {

				if (row == strg.length - 1 && col == strg[0].length - 1) {
					strg[row][col] = true;
				} else if (col == strg[0].length - 1) {
					strg[row][col] = false;
				} else if (row == strg.length - 1) {

					if (pat.charAt(col) == '*') {
						strg[row][col] = strg[row][col + 1];
					} else {
						strg[row][col] = false;
					}

				} else {

					boolean ans;

					if (pat.charAt(col) == '?' || pat.charAt(col) == src.charAt(row)) {
						ans = strg[row + 1][col + 1];
					} else if (pat.charAt(col) == '*') {
						ans = strg[row][col + 1] || strg[row + 1][col];
					} else {
						ans = false;
					}

					strg[row][col] = ans;
				}

			}
		}

		return strg[0][0];

	}

	public static int rodCut(int[] price, int n, int[] strg) {

		if (strg[n] != 0) {
			return strg[n];
		}

		int max = price[n];

		int left = 1;
		int right = n - 1;

		while (left <= right) {

			int fh = rodCut(price, left, strg);
			int sh = rodCut(price, right, strg);

			int total = fh + sh;

			if (total > max) {
				max = total;
			}

			left++;
			right--;

		}

		strg[n] = max;

		return max;

	}

	public static int rodCutBU(int[] price, int n) {

		int[] strg = new int[n + 1];

		for (int i = 1; i < price.length; i++) {

			int max = price[i];

			int left = 1;
			int right = i - 1;

			while (left <= right) {

				int fh = strg[left];
				int sh = strg[right];

				int total = fh + sh;

				if (total > max) {
					max = total;
				}

				left++;
				right--;

			}

			strg[i] = max;

		}

		return strg[n];

	}

}

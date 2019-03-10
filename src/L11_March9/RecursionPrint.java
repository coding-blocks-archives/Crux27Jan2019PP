package L11_March9;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Mar-2019
 *
 */

public class RecursionPrint {

	static int counter = 0;

	public static void main(String[] args) {

		// printSS("abc", "");
		// printKPC("145", "");
		// printPermutation("abcd", "");
		// coinToss(3, "");
		// validParenthesis(3, "", 0, 0);

		// System.out.println(mazePath(0, 0, 2, 2, ""));
		// System.out.println(boardPath(0, 10, ""));

		// lexicoCounting(1, 1000);
		// coinTossNoConsecutiveHead(3, "");
		coinTossNoConsecutiveHead2(3, "", true);
	}

	public static void printSS(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printSS(roq, ans); // no call
		printSS(roq, ans + ch); // yes call

	}

	public static void printSSAscii(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printSSAscii(roq, ans); // no call
		printSSAscii(roq, ans + ch); // yes call
		printSSAscii(roq, ans + (int) ch); // ascii call

	}

	public static void printKPC(String ques, String ans) {

		if (ques.length() == 0) {
			counter++;
			System.out.println(counter + ". " + ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		String code = L10_March3.RecursionGet.getCode(ch);

		for (int i = 0; i < code.length(); i++) {
			printKPC(roq, ans + code.charAt(i));
		}

	}

	public static void printPermutation(String ques, String ans) {

		if (ques.length() == 0) {
			counter++;
			System.out.println(counter + ". " + ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);

			printPermutation(roq, ans + ch);

		}

	}

	public static void coinToss(int n, String ans) {

		if (n == 0) {
			counter++;
			System.out.println(counter + ". " + ans);
			return;
		}

		coinToss(n - 1, ans + "H");
		coinToss(n - 1, ans + "T");
	}

	public static void validParenthesis(int n, String ans, int open, int close) {

		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		if (open > n || close > n || close > open) {
			return;
		}

		validParenthesis(n, ans + "(", open + 1, close);
		validParenthesis(n, ans + ")", open, close + 1);

	}

	public static int boardPath(int curr, int end, String ans) {

		if (curr == end) {
			counter++;
			System.out.println(counter + ". " + ans);
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += boardPath(curr + dice, end, ans + dice);
		}

		return count;

	}

	public static int mazePath(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int ch = mazePath(cr, cc + 1, er, ec, ans + "H");
		int cv = mazePath(cr + 1, cc, er, ec, ans + "V");

		return ch + cv;

	}

	public static void lexicoCounting(int curr, int end) {

		if (curr > end) {
			return;
		}

		System.out.println(curr);

		int i = 0;

		if (curr == 0) {
			i = 1;
		}

		for (; i <= 9; i++) {
			lexicoCounting(curr * 10 + i, end);
		}

	}

	public static void coinTossNoConsecutiveHead(int n, String ans) {

		if (n == 0) {
			counter++;
			System.out.println(counter + ". " + ans);
			return;
		}

		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			coinTossNoConsecutiveHead(n - 1, ans + "H");
		}

		coinTossNoConsecutiveHead(n - 1, ans + "T");
	}

	public static void coinTossNoConsecutiveHead2(int n, String ans, boolean wasLastHeadIncluded) {

		if (n == 0) {
			counter++;
			System.out.println(counter + ". " + ans);
			return;
		}

		if (wasLastHeadIncluded) {
			coinTossNoConsecutiveHead2(n - 1, ans + "T", false);
		} else {
			coinTossNoConsecutiveHead2(n - 1, ans + "H", true);
			coinTossNoConsecutiveHead2(n - 1, ans + "T", false);
		}
	}

}

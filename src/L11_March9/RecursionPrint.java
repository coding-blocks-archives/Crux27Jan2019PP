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
		validParenthesis(3, "", 0, 0);
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

}

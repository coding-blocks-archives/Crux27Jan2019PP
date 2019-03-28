package Assignments.March27;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Mar-2019
 *
 */

public class CodesOfString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		// codesString(str, "");
		// System.out.println(codesStringAL(str));
		ArrayList<String> list = new ArrayList<>();

		codesStringALParam(str, "", list);

		System.out.println(list);
	}

	public static void codesString(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		String strch1 = ques.substring(0, 1); // "1"
		int intch1 = Integer.parseInt(strch1); // 1
		char codech1 = (char) (intch1 + 'a' - 1); // 1 -> a

		String roq1 = ques.substring(1); // 125

		codesString(roq1, ans + codech1); // 125, a

		if (ques.length() >= 2) {

			String strch2 = ques.substring(0, 2); // "11"
			int intch2 = Integer.parseInt(strch2); // 11

			if (intch2 <= 26) {
				char codech2 = (char) (intch2 + 'a' - 1); // 1 -> a

				String roq2 = ques.substring(2); // 25

				codesString(roq2, ans + codech2); // 25, k
			}

		}

	}

	public static ArrayList<String> codesStringAL(String ques) {

		if (ques.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		String strch1 = ques.substring(0, 1); // "1"
		int intch1 = Integer.parseInt(strch1); // 1
		char codech1 = (char) (intch1 + 'a' - 1); // 1 -> a

		String roq1 = ques.substring(1); // 125

		ArrayList<String> rr1 = codesStringAL(roq1); // 125, a

		for (String val : rr1) {
			mr.add(codech1 + val);
		}

		if (ques.length() >= 2) {

			String strch2 = ques.substring(0, 2); // "11"
			int intch2 = Integer.parseInt(strch2); // 11

			if (intch2 <= 26) {
				char codech2 = (char) (intch2 + 'a' - 1); // 1 -> a

				String roq2 = ques.substring(2); // 25

				ArrayList<String> rr2 = codesStringAL(roq2); // 25, k

				for (String val : rr2) {
					mr.add(codech2 + val);
				}
			}

		}

		return mr;

	}

	public static void codesStringALParam(String ques, String ans, ArrayList<String> list) {

		if (ques.length() == 0) {
			// System.out.println(ans);
			list.add(ans);
			return;

		}

		String strch1 = ques.substring(0, 1); // "1"
		int intch1 = Integer.parseInt(strch1); // 1
		char codech1 = (char) (intch1 + 'a' - 1); // 1 -> a

		String roq1 = ques.substring(1); // 125

		codesStringALParam(roq1, ans + codech1, list); // 125, a

		if (ques.length() >= 2) {

			String strch2 = ques.substring(0, 2); // "11"
			int intch2 = Integer.parseInt(strch2); // 11

			if (intch2 <= 26) {
				char codech2 = (char) (intch2 + 'a' - 1); // 1 -> a

				String roq2 = ques.substring(2); // 25

				codesStringALParam(roq2, ans + codech2, list); // 25, k
			}

		}

	}
}

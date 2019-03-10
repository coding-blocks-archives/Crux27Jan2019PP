package L12_Backtracking;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Mar-2019
 *
 */

public class Backtracking {

	static int count = 0;

	public static void main(String[] args) {

		// QueenPermutations(new boolean[4], 1, 0, "");
		// QueenCombination(new boolean[4], 2, 0, "", -1);

		int[] denom = { 2, 3, 5, 6 };
		CoinChange(denom, 10, "", 0);
	}

	public static void QueenPermutations(boolean[] board, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {

			if (board[i] == false) {
				board[i] = true;
				QueenPermutations(board, tq, qpsf + 1, ans + "q" + (qpsf + 1) + "b" + i + " ");
				board[i] = false;
			}

		}

	}

	public static void QueenCombination(boolean[] board, int tq, int qpsf, String ans, int lastCellUsed) {

		if (qpsf == tq) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}

		for (int i = lastCellUsed + 1; i < board.length; i++) {

			if (board[i] == false) {
				board[i] = true;
				QueenCombination(board, tq, qpsf + 1, ans + "q" + (qpsf + 1) + "b" + i + " ", i);
				board[i] = false;
			}

		}

	}

	public static void CoinChange(int[] denom, int amount, String ans, int lastCoinUsed) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		if (amount < 0) {
			return;
		}

		for (int idx = 0; idx < denom.length; idx++) {

			if (amount >= denom[idx])
				CoinChange(denom, amount - denom[idx], ans + denom[idx], idx);
		}

	}

}

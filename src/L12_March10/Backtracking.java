package L12_March10;

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

		// int[] denom = { 2, 3, 5, 6 };
		// CoinChange(denom, 10, "", 0);

		// QueenCombinationBox(new boolean[4], 0, 0, 2, "");
		// QueenCombinationBox2D(new boolean[4][4], 0, 0, 0, 3, "");

		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		blockedMaze(maze, 0, 0, "", visited);
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

	public static void QueenCombinationBox(boolean[] board, int idx, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}

		if (idx == board.length) {
			return;
		}

		QueenCombinationBox(board, idx + 1, qpsf, tq, ans);

		// yes
		board[idx] = true;
		QueenCombinationBox(board, idx + 1, qpsf + 1, tq, ans + "b" + idx);
		board[idx] = false;

	}

	public static void QueenCombinationBox2D(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}

		if (col == board[0].length) {
			row = row + 1;
			col = 0;
		}

		if (row == board.length) {
			return;
		}

		// yes
		if (isItSafe(board, row, col)) {
			board[row][col] = true;
			QueenCombinationBox2D(board, row, col + 1, qpsf + 1, tq, ans + "[" + row + "-" + col + "]");
			board[row][col] = false;
		}

		QueenCombinationBox2D(board, row, col + 1, qpsf, tq, ans);

	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {

		// vertically up
		int r = row - 1;
		int c = col;

		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}

		// diagonally left
		r = row - 1;
		c = col - 1;

		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}

			r--;
			c--;
		}

		// diagonally right
		r = row - 1;
		c = col + 1;

		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}

			r--;
			c++;
		}

		// row
		r = row;
		c = col - 1;

		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}

			c--;

		}

		return true;

	}

	public static void blockedMaze(int[][] maze, int cr, int cc, String ans, boolean[][] visited) {

		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			System.out.println(ans);
			return;
		}

		if (cr == maze.length || cc == maze[0].length || cr == -1 || cc == -1 || visited[cr][cc] || maze[cr][cc] == 1) {
			return;
		}

		visited[cr][cc] = true;

		blockedMaze(maze, cr + 1, cc, ans + "B", visited); // Bottom
		blockedMaze(maze, cr - 1, cc, ans + "T", visited); // Top
		blockedMaze(maze, cr, cc - 1, ans + "L", visited); // Left
		blockedMaze(maze, cr, cc + 1, ans + "R", visited); // right

		visited[cr][cc] = false;

	}

}

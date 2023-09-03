package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public static List<List<Integer>> solveNQueens(int n) {
        List<List<Integer>> ans = new ArrayList<>(n);
        int[][] board = new int[n][n];
        System.out.println(Arrays.deepToString(board));

        List<Integer> temp = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i = 0; i < n; i++) {
            ans.add(temp);
        }

        System.out.println(ans);

        solve(0, ans, board, n);

        return ans;
    }

    private static void solve(int col, List<List<Integer>> ans, int[][] board, int n) {
        // base case
        if (col == n) {
            addBoardToAns(ans, board, n);
            return;
        }

        //solve 1st case and rest recursion will take care
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 1;
                solve(col + 1, ans, board, n);
                // backtrack
                board[row][col] = 0;
            }
        }

    }

    private static void addBoardToAns(List<List<Integer>> ans, int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans.get(i).set(j, board[i][j]);
                //ok
            }
        }
    }

    private static boolean isSafe(int row, int col, int[][] board, int n) {
        int x = row;
        int y = col;

        //check for row
        while (y >= 0) {
            if (board[x][y] == 1) {
                return false;
            }
            y--;
        }

        //check for diagonal
        x = row;
        y = col;
        while (x >= 0 && y >= 0) {
            if (board[x][y] == 1) {
                return false;
            }
            x--;
            y--;
        }

        //check for diagonal
        x = row;
        y = col;
        while (x < n && y >= 0) {
            if (board[x][y] == 1) {
                return false;
            }
            x++;
            y--;
        }

        return true;

    }


}


package leetcode;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] sudoku = {{'.', '6', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '1', '.', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '.', '4', '.', '9', '7'},
                {'.', '9', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '2', '.', '7', '.', '.'},
                {'.', '4', '.', '.', '3', '7', '.', '.', '.'},
                {'.', '.', '.', '3', '.', '.', '.', '8', '.'},
                {'.', '.', '1', '.', '4', '.', '.', '.', '.'},
                {'2', '.', '4', '.', '.', '5', '.', '1', '9'}};

        new SudokuSolver().solveSudoku(sudoku);
        for (var x : sudoku)
            System.out.println(Arrays.toString(x));
    }

    public static boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (c == '.') {
                    for (char k = '1'; k <= '9'; k++) {
                        if (isValid(board, i, j, k)) {
                            board[i][j] = k;
                            if (solve(board)) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    private static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c) return false; //check column
            if (board[row][i] != '.' && board[row][i] == c) return false; //check row
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.' &&
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; //check 3*3 block
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) return;
        solve(board);
    }
}

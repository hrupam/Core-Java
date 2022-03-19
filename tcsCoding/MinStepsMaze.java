package tcsCoding;

import java.util.Arrays;

public class MinStepsMaze {

    public static void main(String[] args) {
        int R = 4;
        int C = 6;
        int currR = 2;
        int currC = 2;

        char[][] maze = {
                {'#', '#', '.', '#', '#', '.'},
                {'#', '#', '#', '.', '#', '#'},
                {'.', '#', '.', '#', '#', '.'},
                {'.', '.', '.', '#', '#', '.'}
        };

        boolean[][] isV = new boolean[R][C];
        for (boolean[] x : isV) Arrays.fill(x, false);

        System.out.println(f(currR, currC, R, C, maze, isV));


    }

    private static int f(int i, int j, int m, int n, char[][] maze, boolean[][] isV) {
        if (i == 0 || i == m - 1 || j == 0 || j == n - 1) return 0;


        //up
        int up = (int) Math.pow(10, 9);
        if (i - 1 >= 0 && maze[i - 1][j] == '.' && !isV[i - 1][j]) {
            isV[i - 1][j] = true;
            up = 1 + f(i - 1, j, m, n, maze, isV);
            isV[i - 1][j] = false;
        }
        //down
        int down = (int) Math.pow(10, 9);
        if (i + 1 < m && maze[i + 1][j] == '.' && !isV[i + 1][j]) {
            isV[i + 1][j] = true;
            down = 1 + f(i + 1, j, m, n, maze, isV);
            isV[i + 1][j] = false;
        }
        //left
        int left = (int) Math.pow(10, 9);
        if (j - 1 >= 0 && maze[i][j - 1] == '.' && !isV[i][j - 1]) {
            isV[i][j - 1] = true;
            left = 1 + f(i, j - 1, m, n, maze, isV);
            isV[i][j - 1] = false;
        }
        //right
        int right = (int) Math.pow(10, 9);
        if (j + 1 < n && maze[i][j + 1] == '.' && !isV[i][j + 1]) {
            isV[i][j + 1] = true;
            right = 1 + f(i, j + 1, m, n, maze, isV);
            isV[i][j + 1] = false;
        }

        return Math.min(up, Math.min(down, Math.min(left, right)));

    }
}

package CP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RatInAMaze {
    public static void main(String[] args) {
        int n = 4;
        int m[][] = {{0, 1, 1, 1},
                {1, 1, 1, 0},
                {1, 0, 1, 1},
                {0, 0, 1, 1}};


        System.out.println(findPath(m, n));
    }

    public static List<String> findPath(int[][] m, int n) {
        // Your code here
        boolean[][] isVisited = new boolean[n][n];
        for (boolean[] x : isVisited)
            Arrays.fill(x, false);
        List<String> paths = new ArrayList<>();
        ratInAMazeSolveEnhanced(m, 0, 0, n, isVisited, "", paths);
        return paths;
    }

    private static void ratInAMazeSolve(int[][] maze, int i, int j, int n, boolean[][] isVisited, String move, List<String> paths) {

        if (i == n - 1 && j == n - 1) {
            paths.add(move);
            return;
        }

        //down
        if (i + 1 < n && maze[i + 1][j] == 1 && !isVisited[i + 1][j]) {
            isVisited[i][j] = true;
            ratInAMazeSolve(maze, i + 1, j, n, isVisited, move + "D", paths);
            isVisited[i][j] = false;
        }

        //left
        if (j - 1 >= 0 && maze[i][j - 1] == 1 && !isVisited[i][j - 1]) {
            isVisited[i][j] = true;
            ratInAMazeSolve(maze, i, j - 1, n, isVisited, move + "L", paths);
            isVisited[i][j] = false;
        }

        //right
        if (j + 1 < n && maze[i][j + 1] == 1 && !isVisited[i][j + 1]) {
            isVisited[i][j] = true;
            ratInAMazeSolve(maze, i, j + 1, n, isVisited, move + "R", paths);
            isVisited[i][j] = false;
        }

        //up
        if (i - 1 >= 0 && maze[i - 1][j] == 1 && !isVisited[i - 1][j]) {
            isVisited[i][j] = true;
            ratInAMazeSolve(maze, i - 1, j, n, isVisited, move + "U", paths);
            isVisited[i][j] = false;
        }
    }

    private static void ratInAMazeSolveEnhanced(int[][] maze, int i, int j, int n, boolean[][] isVisited, String move, List<String> paths) {
        if (i == n - 1 && j == n - 1) {
            paths.add(move);
            return;
        }

        //deviations for down,left,right,up
        int[] di = {1, 0, 0, -1};
        int[] dj = {0, -1, 1, 0};

        for (int k = 0; k < 4; k++) {
            int nexti = i + di[k];
            int nextj = j + dj[k];
            String nextMove = "";
            if (k == 0) nextMove = "D";
            else if (k == 1) nextMove = "L";
            else if (k == 2) nextMove = "R";
            else nextMove = "U";

            if (nexti < n && nexti >= 0 && nextj < n && nextj >= 0 && !isVisited[nexti][nextj] && maze[nexti][nextj] == 1) {
                isVisited[i][j] = true;
                ratInAMazeSolveEnhanced(maze, nexti, nextj, n, isVisited, move + nextMove, paths);
                isVisited[i][j] = false;
            }
        }

    }
}

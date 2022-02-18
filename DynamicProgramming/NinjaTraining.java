package DynamicProgramming;

import java.util.Arrays;

public class NinjaTraining {
    public static void main(String[] args) {
        int[][] points = {{1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}};
        System.out.println(ninjaTraining(points.length, points));
    }

    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        int[][] dp = new int[n][4];
        for (int[] x : dp)
            Arrays.fill(x, -1);
        return solve(points, n - 1, 3, dp);

//        return solvedp(points,dp);
    }

    private static int solve(int points[][], int day, int last, int[][] dp) {
        if (day == -1) return 0;
        if (dp[day][last] != -1) return dp[day][last];
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            if (last != i) {
                int p = points[day][i] + solve(points, day - 1, i, dp);
                maxi = Math.max(p, maxi);
            }
        }
        return dp[day][last] = maxi;
    }

    private static int solvedp(int points[][], int[][] dp) {

        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][1], points[0][0]);
        dp[0][3] = Math.max(points[0][1], Math.max(points[0][0], points[0][2]));

        for (int day = 1; day < points.length; day++) {
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {
                        int p = points[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(dp[day][last], p);
                    }
                }
            }
        }
        return dp[points.length - 1][3];
    }
}
